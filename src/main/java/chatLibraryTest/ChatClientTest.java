package chatLibraryTest;

import testlib.entity.ChatClientLibrary;
import java.util.Scanner;

public class ChatClientTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("대화명을 입력하세요. :");
        String nickName = sc.nextLine();

        try {
            ChatClientLibrary client = new ChatClientLibrary("localhost", 8888, nickName);

            while (true) {
                System.out.print("내용: ");
                String message = sc.nextLine();
                client.sendMessage(message);
                if (message.equals("exit")) {
                    break;
                }
            }

            client.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sc.close();
        }
    }
}

