public class App {
    public static void main(String[] args) throws Exception {
        ClienteRPC rpc = new ClienteRPC();
        System.out.println("O Resultado da soma é: " + rpc.somar(1, 2));
    }
}
