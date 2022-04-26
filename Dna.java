public class DNA {
 
    public static void main(String[] args) {
   
      //  -. .-.   .-. .-.   .
      //    \   \ /   \   \ / 
      //   / \   \   / \   \  
      //  ~   `-~ `-`   `-~ `-
   
      String dna1 = "ATGCGATACGCTTGA";
      String dna2 = "ATGCGATACGTGA";
      String dna3 = "ATTAATATGTACTGA";
  
      String dna = dna2;
      System.out.println(dna.length());
      int startCodon = dna.indexOf("ATG");
      int endCodon = dna.indexOf("TGA");
      System.out.println(startCodon);
      System.out.println(endCodon);
      int proteinLength = endCodon - startCodon;
  
      if(startCodon != -1 && endCodon != -1 && proteinLength%3==0){
        String protein = dna.substring(startCodon, endCodon);
        System.out.println(protein);
      }
      else{
        System.out.println("No protein");
      }
    }
   
  }