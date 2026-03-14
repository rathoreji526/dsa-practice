package threads;

public class SongUsingThread {
    public static void main(String[] args) throws  InterruptedException {

        int[] lineDelay = {70,70,70,70,120,120,170,120};
        int[] delay = {800 , 800 , 800 , 800 , 800 , 800 , 800 , 300};

        System.out.println();
        String[] messages = {
                "Tu ishq hai toh main baahon mein hoon",
                "Baahon mein hoon toh panaahon mein hu",
                "Kajal hoon toh main nigahon mein hoon",
                "Tu hai toh main hu......❤\uFE0F❤\uFE0F",
                "Kasme vaade kyun? tu hain toh main hoon",
                "Bas main tera hoon! tu hain toh main hoon",
                "Seene pe likh loon tu hain toh main hoon",
                "Tu hain toh main hoon.....❤\uFE0F❤\uFE0F" };


        for (int i = 0; i < messages.length; i++) {
            String msg = messages[i];

            for (char c : msg.toCharArray()) {
                System.out.print(c);
                Thread.sleep(lineDelay[i]);
            }

            System.out.println();
            Thread.sleep(delay[i]);
        }

    }
}
