import java.util.Scanner;
public class EndOfFile {

   
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        StringBuilder sb = new StringBuilder();
        int lineNumber = 1;
        while(sc.hasNext()){
            String line = sc.nextLine();
            sb.append(line).append("\n");
            lineNumber ++;
        }
            String[] lines =sb.toString().split("\n");
            for(int i = 0; i < lines.length; i ++){
                 System.out.println((i + 1) + " " + lines[i]);
            }
    }
    
}
