public class Main{
  public static void main(String[] args){
    Chunin[] m = new Chunin[3];

    m[0] = new Chunin();
    m[0].setReg("012606");
    m[0].setNama("Uchiha Sasuka");
    m[0].setPeringkat("Genin");

    m[1] = new Chunin();
    m[1].setReg("012607");
    m[1].setNama("Uzumaki Naruto");
    m[1].setPeringkat("Genin");

    m[2] = new Chunin();
    m[2].setReg("012601");
    m[2].setNama("Haruno Sakura");
    m[2].setPeringkat("Chunin");

    System.out.println("Data Naruto");

    for(Chunin x:m){
      System.out.println("No. Registrasi :" + x.getReg());
      System.out.println("Nama : " + x.getNama());
      System.out.println("Peringkat :" + x.getPeringkat());
    }
  }
}
#   T u g a s - P B O  
 