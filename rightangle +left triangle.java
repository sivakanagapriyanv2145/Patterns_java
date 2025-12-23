// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        int i,j,n=5;
for(i=0;i<n-1;i++){
    for(j=0;j<=i;j++){
        System.out.print("*");
    }
    System.out.println();
}
for(i=0;i<n;i++){
    for(j=0;j<n-i;j++){
        System.out.print("*");
    }
    System.out.println();
}
    }
}
