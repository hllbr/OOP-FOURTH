
public class Main {
    public static void main(String[] args) {
        Account ac1 = new Account();
        System.out.println("email = " +ac1.getEmail());
        Account ac2 = new Account("braderim","exe@gmail.com","9897695823554689");
        System.out.println("email =" +ac2.getEmail());
        System.out.println("bakiye : " +ac2.getBakiye());
        System.out.println("Hesap no = "+ac2.getHesapNo());
        ac2.bilgileri_goster();



    }
    
}
