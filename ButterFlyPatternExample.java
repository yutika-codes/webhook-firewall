// import required classes  
import java.util.Scanner;  
// create class ButterFlyPatternExample to design butterfly pattern  
public class ButterFlyPatternExample {  
    // create drawButterflyPattern() method that will print Butterfly over n rows  
    public static void drawButterflyPattern(int N) {  
        // declare and initialize variables that helps to print Butterfly pattern  
        int space = 2*N-1;  
        int star = 0;  
        // use for loop   
                for(int j = 1; j <= 2*N-1; j++){  
                        if(j <= N){  
                            space = space - 2;  
                            star++;  
                        }  
                        else {  
                            space = space + 2;  
                            star--;  
                        }  
            // use for loop to print star  
                        for(int m = 1; m <= star; m++){  
                         System.out.print("*");  
                        }  
            // use for loop to print space  
                        for(int n = 1; n <= space; n++){  
                            System.out.print(" ");  
                        }  
            // use for loop to print star for special case  
                        for(int p = 1; p <= star; p++){  
                            if(p != N){  
                    System.out.print("*");  
                }  
                        }  
                        System.out.println();  
                }  
    }  
    // main() method start  
        public static void main(String[] args) {  
        int N;  
        N=5;
        // call drawButterflyPattern() method   
        drawButterflyPattern(N);  
        }  
}  