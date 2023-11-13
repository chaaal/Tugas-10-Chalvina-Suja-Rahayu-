public class App {
    
    public static void main(String[] args) {
//polymorphisme 
        Member memberA = new MemberReguler();
        Integer totalTransaksiA = memberA.hitungTotalBayar(600000);

        Member memberB = new MemberSilver();
        Integer totalTransaksiB = memberB.hitungTotalBayar(400000);

        Member memberC = new MemberGold(); 
        Integer totalTransaksiC = memberC.hitungTotalBayar(7100000);

        Member memberD = new MemberPlatinum(); 
        Integer totalTransaksiD = memberD.hitungTotalBayar(10000000);
    
   
        System.out.println("jumlah Bayar member reguler: " + totalTransaksiA);
        System.out.println("jumlah Bayar member reguler: " + totalTransaksiB);
        System.out.println("jumlah Bayar member reguler: " + totalTransaksiC);
        System.out.println("jumlah Bayar member reguler: " + totalTransaksiD);
    }
    
}