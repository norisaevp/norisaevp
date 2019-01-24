public class Main {

    public static void main(String[] args){

            //Tumbuhan mangga = new Tumbuhan();
            // Tumbuhan jambu = new Tumbuhan();
            // mangga.fotosintesis();
            //jambu.fotosintesis();
            //mangga.Daun = "Lancip";
            //mangga.Daun = "Bagus";
            // jambu.Daun = "Lebar";
            //jambu.Daun = "Kecil";
            //mangga.Berbuah();
            //jambu.Berbuah();
            //mangga.Akar="Kuat";
            //jambu.Akar="Lemah";
            //mangga.Berbunga();
            //jambu.Berbunga();
            Lingkaran Bulat = new Lingkaran ();
            Bulat.Hitung();
        }
    }
//class Tumbuhan {
    //public String Batang;
    //public String Daun;
    //public String Akar;

    //public  void fotosintesis () {
    //   for (int i = 0; i < 5; i++) {
    //      if (i % 2 > 0) {
    //         System.out.println(i);
    //    }
    // }
    //}
    //public void  Berbuah (){
    //  System.out.println(Daun);
    // }
    //public void  Berbunga () {
    //     System.out.println(Akar);
    //}
//}
    class Lingkaran {

        public double phi = 3.14;
        public double jari = 2 ;
        public double LuasLingkaran;




        public void Hitung (){
            LuasLingkaran = phi * jari * jari ;
            System.out.println(LuasLingkaran);
        }
    }


