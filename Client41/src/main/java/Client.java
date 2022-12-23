import proxy.BanqueService;
import proxy.BanqueWS;
import proxy.Compte;

public class Client {
    public static void main(String[] args) {
        BanqueService stub = new BanqueWS().getBanqueServicePort();
        System.out.println(stub.convert(1));
        Compte cp = stub.getCompte(3);
        System.out.println(cp.getCode());
        System.out.println(cp.getSolde());
    }
}
