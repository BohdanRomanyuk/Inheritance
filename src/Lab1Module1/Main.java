package Lab1Module1;/*
  @author   Romanyuk Bohdan
  @project   Romanyuk
  @class  Main
  @version  1.0.0 
  @since 15.03.2021 - 18.11
*/

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.io.IOException;

    public class Main {

        public static void main(String[] args) throws IOException {

            String text = new String(Files.readAllBytes(Paths.get(System.getProperty(
                    "C:\\Users\\Quizze\\IdeaProjects\\Romanyuk\\src\\Lab1Module1\\harry.txt"))));

            String cleanedText = text.replaceAll("\\.", "")
                    .replaceAll(",", "")
                    .replaceAll("\\?", "")
                    .toLowerCase();

            String [] words = cleanedText.split(" ");


            //  Найдовше слово у тексті:

            String longestWord = "";

            for (int i = 0; i < words.length; i++) {
                if (words[i].length() > longestWord.length()){
                    longestWord = words[i];
                }
            }


            //  Кількість рядків, де є Harry:

            boolean isHarry = false;
            int linesWithHarry = 0;

            for (int i = 4; i < text.length(); i++) {
                if ((text.charAt(i-4) == 'H') && (text.charAt(i-3) == 'a')
                        && (text.charAt(i-2) == 'r') && (text.charAt(i-1) == 'r')
                        && (text.charAt(i) == 'y')) {
                    isHarry = true;
                }
                if ((text.charAt(i) == '.') && (isHarry)){
                    linesWithHarry++;
                    isHarry = false;
                }
            }


            //  Масив унікальних слів:

            String distinctString = "";

            for (int i = 0; i < words.length; i++) {
                if (!distinctString.contains(words[i])){
                    distinctString += words[i] + " ";
                }
            }

            String [] distinctArray = distinctString.split(" ");

            Arrays.sort(distinctArray);

            // Вивід кількості слів які починаються на "С"
            int counter = 0;
            for (int i = 0; i < distinctArray.length; i++) {
               if (distinctArray[i].charAt(0) = 'C')
               {
                   counter++;
               }
            }
            // Масив хешів:

            int[] arrayOfHashes = new int [distinctArray.length];

            for (int i = 0; i < distinctArray.length; i++) {
                arrayOfHashes[i] = distinctArray[i].hashCode();
                System.out.println(arrayOfHashes[i]);
            }

            //  Хеші з повторами:

            int intersectionsCounter = 0;

            for (int i = 0; i < arrayOfHashes.length; i++) {
                for (int j = 0; j < words.length; j++) {
                    if (arrayOfHashes[i] == arrayOfHashes[j]){
                        intersectionsCounter++;
                        break;
                    }
                }
            }

            System.out.println("Longest word is " + longestWord);
            System.out.println("His lenght is " + longestWord.length());

            System.out.println("There are " + linesWithHarry +
                    " lines where the word Harry is met");

            System.out.println(intersectionsCounter);

        }
    }
