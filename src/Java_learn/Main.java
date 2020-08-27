package Java_learn;

public class Main {
    public static void main(String[] args) {
        for(String arg :args){
            if(arg.equals("-version")){
                System.out.println("v1.2");
            }
        }
    }
}
