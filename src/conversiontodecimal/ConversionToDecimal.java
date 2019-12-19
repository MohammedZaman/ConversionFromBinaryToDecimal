/*
 * Conversion from binary to decimal 
 */
package conversiontodecimal;

/**
 *
 * @author mohammedzaman
 */
public class ConversionToDecimal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print(binaryToDecimal("11010"));
    }
    
    /**
     * 
     * @param binary input in string format
     * @return decimal     
     */
    public static int binaryToDecimal(String binary){
    String reverse = new StringBuilder(binary).reverse().toString();
    char[] binaryArray = reverse.toCharArray();
    int append = 0;
    int start = 1;
    for(int i = 0; i < binaryArray.length; i++){
        if(binaryArray[i] == '1'){
        append = append + start;
        }
        start = start * 2;
    }
   
      return append;
    
    }
    
}