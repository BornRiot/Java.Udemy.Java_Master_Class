package code_blocks_methods_statements;

public class MegaBytesConverter {
    public static void main(String[] args) {
    	printMegaBytesAndKiloBytes(2500); 

    }
public static void printMegaBytesAndKiloBytes(int kiloBytes){
        int megaBytes  = 0;
        int remKiloBytes = 0; 
        if(kiloBytes < 0){
        	System.out.println("Invalid Value");
        }
        else {
        	// 1 MB = 1024 KB
    		megaBytes = kiloBytes / 1024; 
    		remKiloBytes =  kiloBytes % 1024;
        	System.out.println(kiloBytes + " KB = "+ megaBytes  +" MB and "+ remKiloBytes + " KB");
        }

}
}
