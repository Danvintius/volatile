import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        String[] texts = new String[100_000];
        for (int i = 0; i < texts.length; i++) {
            texts[i] = generateText("abc", 3 + random.nextInt(3));
        }
        System.out.println(generateText());

        new Thread(() -> {
            int counter1 = 0;
            for (int i = 0; i < texts.length; i++) {
                if (texts[i] == texts[i].reverse()) {
                    
                }
            }
        });

        new Thread(() -> {
            int counter2 = 0;
            for (int i = 0; i < texts.length; i++) {
                if (texts[i] == "a") {

                }
            }
        });

        new Thread(() -> {
            int counter3 = 0;
            for (int i = 0; i < texts.length; i++) {

            }
        });
    }

    public static String generateText(String letters, int length) {
        Random random = new Random();
        StringBuilder text = new StringBuilder();
        for (int i = 0; i < length; i++) {
            text.append(letters.charAt(random.nextInt(letters.length())));
        }
        return text.toString();
    }
}
