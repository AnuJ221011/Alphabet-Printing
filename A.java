public class A{
    public static void main(String[] args) {
        int n=7;    
        for(int i=0;i<n;i++){   
            for(int j=0;j<n;j++){
                if(i==n/2 || (j==0 && i!=0) || (j==n-1 && i!=0) || (i==0&& j!=0 && j!=n-1)){
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
}
}