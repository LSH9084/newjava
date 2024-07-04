package chatLibraryTest;

import testlib.entity.ChatServerLibrary;

public class ChatServerTest {

    public static void main(String[] args) {
        try {
            ChatServerLibrary server = new ChatServerLibrary(8888);
            server.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
