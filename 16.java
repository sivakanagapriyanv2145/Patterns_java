// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
      int i,j,n=5;
      char a='A';
      for(i=0;i<n;i++){
          for(j=0;j<=i;j++){
              System.out.print(a+" ");
          }
          System.out.println();
          a++;
      }
    }
}
