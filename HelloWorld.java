import java.util.ArrayList;
import java.util.List;

public class HelloWorld{
    public static void main(String[] args) {
        List<Integer> dividers = new ArrayList<Integer>();
        for (int i = 2; i <= 100; i++) {
            for (int j =2; j < 50; j++) {
                if (i!=j && i%j == 0)dividers.add(j);
                else{
                    continue;
                }
            }
            if(dividers.size() == 0)System.out.print(i + " ");
            else {
                dividers.clear();
                continue;
            }
        }
    }            
}