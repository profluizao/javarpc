public class App {
    public static void main(String[] args) throws Exception {
    	//DEFINE A URL DO SERVIDOR
        String urlServ = "http://localhost:8185"; 
        ClienteRPC rpc = new ClienteRPC(urlServ);
        System.out.println("O Resultado da soma é: " + rpc.somar(1, 2));
    }
}
