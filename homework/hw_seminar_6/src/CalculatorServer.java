import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Objects;


public class CalculatorServer {

    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(1234)) {
            System.out.println("Сервер запущен, ожидаем соединение....");
            Socket socket = serverSocket.accept();
            System.out.println("Клиент подключился к серверу!");
            DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
            DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());

            while (true) {
                String request = dataInputStream.readUTF();
                if (request.equals("end")) break;
                System.out.println("Мы получили строку: " + request);
                String [] clientRequest = request.split(" ");
                dataOutputStream.writeUTF("Отвечаем на сообщение: "
                        + OperationCalc.arithmeticOperation(Double.parseDouble(clientRequest[0]), clientRequest[1], Double.parseDouble(clientRequest[2])));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
