// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        int i,j;
        int start=1,n=5;
        for(i=0;i<n;i++){
            if(i%2==0){
                start=1;
            }
            else{
                start=0;
            }
            for(j=0;j<i;j++){
                System.out.print(start);
                start=1-start;
            }
            System.out.println();
        }
    }
}
