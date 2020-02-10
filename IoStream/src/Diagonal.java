public class Diagonal {
    public static void main(String args[]){
        int [][] a={{1,3,4},{5,6,7},{8,5,6}};
        int sum2=0;
        int sum=0;
        int sum1=0;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(i<j){
                    System.out.println(a[i][j]);
                    int n1=a[i][j];
                    
                    sum=sum+n1;
                   
                }
            }
        }
        System.out.println("Addition of upper triangle is"+sum); 
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(i>j){
                    System.out.println(a[i][j]);
                    int n2=a[i][j];
                    
                    sum1=sum1+n2;
                }
            }
        }
        System.out.println("Addition od lower triangle is"+sum1);
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(i==j){
                System.out.println(a[i][j]);
                int n3=a[i][j];
                
                sum2=sum2+n3;
                }
            }
        }
         System.out.println("Addition of diagonal is"+sum2);
                
            
           
        }
            
            
            
        
    }
