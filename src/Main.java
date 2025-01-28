public class Main {
    public static void main(String[] args) {
        // 1.
        String text1 = "გამოსავალი: სტრიქონი 1234567 ტექსტია";
        int count = 0;

        for (char c : text1.toCharArray()) {
            if (Character.isDigit(c)) {
                count++;
            }
        }
        System.out.println("ციფრების რაოდენობა: " + count);

        // 2.
        String text2 = "ეს პირველი წინადადებაა. ეს მეორეა! და ეს მესამე?";
        String[] sentences = text2.split("[.?!;]");
        System.out.println("წინადადებების რაოდენობა: " + sentences.length);

        // 3.
        String text3 = "არამარა";
        String reversed = new StringBuilder(text3).reverse().toString();

        if (text3.equals(reversed)) {
            System.out.println("სტრიქონი არის პალინდრომი");
        } else {
            System.out.println("სტრიქონი არ არის პალინდრომი");
        }

        // 4.
        String s1 = "მოგზაურობა";
        String s2 = "მოგ";

        if (s1.contains(s2)) {
            System.out.println("s2 არის s1-ს ქვესტრიქონი");
        } else {
            System.out.println("s2 არ არის s1-ს ქვესტრიქონი");
        }

        // 5.
        String word5 = "საზღვარი";

        char lastChar = word5.charAt(word5.length() - 1);
        if ("აეიოუი".indexOf(lastChar) != -1) {
            System.out.println("სტრიქონი ხმოვნით მთავრდება");
        } else {
            System.out.println("სტრიქონი თანხმოვნით მთავრდება");
        }

        // 6.
        String word6 = "აბბგგდდ";
        StringBuilder originalWord = new StringBuilder();

        for (int i = 0; i < word6.length(); i++) {
            if (i == 0 || word6.charAt(i) != word6.charAt(i - 1)) {
                originalWord.append(word6.charAt(i));
            }
        }

        System.out.println("თავდაპირველი სიტყვა: " + originalWord.toString());

        // 7. 
        String word7 = "ლოკალიზაცია";

        if (word7.length() > 10) {
            String abbreviation = word7.charAt(0) + Integer.toString(word7.length() - 2) + word7.charAt(word7.length() - 1);
            System.out.println("აბრევიატურა: " + abbreviation);
        } else {
            System.out.println("სიტყვა არაა უზარმაზარი");
        }
    }
}
