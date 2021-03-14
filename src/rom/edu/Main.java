package rom.edu;

public class Main {

    public static void main(String[] args) {

        String[] words = new String[5];
        words[0] = "«Сырку!» - заказ у крыс";
        words[1] = "Ум за рамки – к маразму";
        words[2] = "Я – енот этот, а тот – это не я";
        words[3] = "Vasyl won football champs";
        words[4] = "Was it a cat I saw?";

        // Очистка елементів масива від мусора
        // Очистка темплейта (доп. рядок для перевірки):

        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].replaceAll("[^A-Za-zА-Яа-я]", "");
            words[i] = words[i].toLowerCase();
            String template = "";

            // Перепис слова в темплейт:

            for (int j = 0; j < words[i].length(); j++) {
                int index = words[i].length() - j - 1;
                template += words[i].charAt(index);
            }

            System.out.println(template);

            // Перевірка на паліндром:

            if (words[i].equals(template)) {
                System.out.println(" - It's Palindrom! TRUE");
            } else {
                System.out.println(" - It's not Palindrom FALSE");
            }
        }
    }

}

