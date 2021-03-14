package rom.edu;
 /*
  @author   Romanyuk Bohdan
  @project   Romanyuk
  @class  Palindrom
  @version  1.0.0 
  @since 13.03.2021 - 23.52
*/

    public class Palindrom {

        public static boolean isPalindrom1(String text){
            text = text.replaceAll("[^A-Za-zА-Яа-я]",
                    ""); // remove garbage
            text = text.toLowerCase();

            boolean result = true;
            for (int i = 0; i < text.length() ; i++) {
                if (text.charAt(i) != text.charAt(text.length() - 1 - i)){
                    result = false;
                    break;
                }
            }
            return result;
        }

        // build a  reverse string
        public static boolean isPalindrom2(String text){
            text = text.replaceAll("[^A-Za-zА-Яа-я]",
                    ""); // remove garbage
            text = text.toLowerCase();
            String reversed = "";
            for (int i = text.length() -1 ; i >= 0 ; i--) {
                reversed = reversed + text.charAt(i);
            }
            return reversed.equals(text);
        }
        // use StringBuilder
        public static boolean isPalindrom3(String text){
            text = text.replaceAll("[^A-Za-zА-Яа-я]",
                    ""); // remove garbage
            text = text.toLowerCase();
            StringBuilder sb = new StringBuilder(text);
            String reversed = sb.reverse().toString();
            boolean result;
            if (text.equals(reversed)) {
                result = true;
            }else {
                result = false;
            }
            return result;
        }



        public static void main(String[] args) {

            String[] words = new String[5];
            words[0] = "«А роза упала на лапу Азора";
            words[1] = "Ужгород - красивый город";
            words[2] = "Мог оратор о ворота рогом";
            words[3] = "Vasyl likes to play football" + " ";
            words[4] = "Was it a cat I saw?";


            System.out.println(" The first way");
            for (int i = 0; i < words.length; i++) {
                System.out.println(   words[i] + " is a palindrom   - " +
                        isPalindrom1(words[i]));

            }
            System.out.println(" The second way");
            for (int j = 0; j < words.length; j++) {
                System.out.println(words[j] + " is a palindrom   - " +
                        isPalindrom2(words[j]));
            }
            System.out.println(" The third way");
            for (int b = 0; b < words.length; b++) {
                System.out.println(   words[b] + " is a palindrom   - " +
                        isPalindrom3(words[b]));

        }
            }
        }