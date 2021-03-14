package HarryPoter;/*
  @author   Romanyuk Bohdan
  @project   Romanyuk
  @class  HarryPoter
  @version  1.0.0 
  @since 14.03.2021 - 17.38
*/
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class HarryPoter {

        public static void main(String[] args) throws IOException {

            //  1. Знайти та скачати текстовий документ "Harry Potter and the Sorcerer's Stone

            String text = new String(Files.readAllBytes(Paths.get
                    ("C://Users//Quizze//IdeaProjects//Romanyuk//src//HarryPoter//harry.txt")));


            //  2. Очистити слова від знаків пунктуації :

            String cleanedText = text.replaceAll("[^A-Za-zА-Яа-я]", " ");
            cleanedText = cleanedText.toLowerCase();

            //  3. Розділити роман на масив слів:

            String[] words = cleanedText.split(" ");

            //  4. Створити масив унікальних слів:

            String distinctString = "";

            for (int i = 0; i < words.length; i++) {
                if (!distinctString.contains(words[i])){
                    distinctString += words[i] + " ";
                }
            }

            String [] distinctArray = distinctString.split(" ");

            //  5. Вивести відсортований масив у алфавітному порядку:

            Arrays.sort(distinctArray);

            for (int i = 0; i < distinctArray.length; i++) {
                System.out.println(distinctArray[i]);
            }

        }
    }