
public class Account {
     //property area
    
    private String hesapNo;
    private double bakiye;
    private String isim;
    private String email;
    private String telofonNo;
    //constructor yazımı 
    public Account(){//1.yapıcı metod
      //  System.out.println("Kendi Yazdığımız Constructor...");
       /* this.hesapNo ="burada bilgi yok";
        this.bakiye = 0.0;
        this.isim =" Bilgi yok ";
        this.email = "Bilgi yok";
        this.telofonNo="bilgi yok";
        */
       this("bilgi yok",0.0,"bilgi yok","bilgi yok","bilgi yok");

    }
    public Account(String hesapNo,double bakiye,String isim,String email,String telefonNo){//2. yapıcı metod
        this.hesapNo = hesapNo;
        this.bakiye = bakiye;
        this.isim =isim;
        this.email = email;
        this.telofonNo = telefonNo;
    }
    public Account(String isim,String email,String telefonNo){
        /*this.isim = isim;
        this.email = email;
        this.telofonNo = telefonNo;
        this.bakiye = 0.0;
        this.hesapNo = "bilgi yok ";
        1. yöntemi*/
        //2.yöntem == 
        this("Bilgi Yok",0.0,isim,email,telefonNo);
        
    }
    public void bilgileri_goster(){
        System.out.println("Hesap no " +this.hesapNo);
        System.out.println("bakiye " +this.bakiye);
        System.out.println("müşteri ismi  "+this.isim);
        System.out.println("müşteri email " +this.email);
        System.out.println("müşterü iletişim no " +this.telofonNo);
    }
            
    public void paraYatır(double miktar){
        bakiye +=miktar;
        System.out.println("Yeni bakiye = "+bakiye);//this kullanabiliriz ama gerek yok başka herhangi bir bakiye ile karışmadığı için ihtiyaç duymadık...
        
        
    }
    public void paraCekme(double miktar){
        if(miktar>1500){
            System.out.println("Günlük olarak 1500 Türk Lirasından fazla çekmeniz mümkün değildir. ");
        }
        if((bakiye-miktar)<0){
            System.out.println("Yterli bakiye yok...");
            System.out.println("Bakiyeniz : " +bakiye);
        }else{
            bakiye-=miktar;
            System.out.println("Yeni bakiye : " +bakiye);
        }
    }

    /**
     * @return the hesapNo
     */
    public String getHesapNo() {
        return hesapNo;
    }

    /**
     * @param hesapNo the hesapNo to set
     */
    public void setHesapNo(String hesapNo) {
        this.hesapNo = hesapNo;
    }

    /**
     * @return the bakiye
     */
    public double getBakiye() {
        return bakiye;
    }

    /**
     * @param bakiye the bakiye to set
     */
    public void setBakiye(double bakiye) {
        this.bakiye = bakiye;
    }

    /**
     * @return the isim
     */
    public String getIsim() {
        return isim;
    }

    /**
     * @param isim the isim to set
     */
    public void setIsim(String isim) {
        this.isim = isim;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the telofonNo
     */
    public String getTelofonNo() {
        return telofonNo;
    }

    /**
     * @param telofonNo the telofonNo to set
     */
    public void setTelofonNo(String telofonNo) {
        this.telofonNo = telofonNo;
    }
    
    
}
