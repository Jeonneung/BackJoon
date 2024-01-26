import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder strBuild = new StringBuilder(scanner.next());

        ArrayList<String> pair = new ArrayList<>();
        ArrayList<String> rest = new ArrayList<>();

        for(int i=0;i<strBuild.length();i++){
            String c = strBuild.substring(i, i+1);
            if(c.equals("0")){
                continue;
            }
            int idx = strBuild.lastIndexOf(c);
            if(idx != -1 && idx != i){
                pair.add(c);
                strBuild.replace(i, i+1, "0");
                strBuild.replace(idx, idx+1, "0");
            }
            else{
                rest.add(c);
                strBuild.replace(i, i+1, "0");
            }
        }

        if(rest.size() >= 2){
            System.out.println("I'm Sorry Hansoo");
            System.exit(0);
        }

        StringBuilder out = new StringBuilder();
        Collections.sort(pair);
        for(int i=0;i<pair.size();i++){
            out.append(pair.get(i));
        }
        if(!rest.isEmpty()){
            out.append(rest.get(0));
        }
        Collections.sort(pair, Collections.reverseOrder());
        for(int i=0;i<pair.size();i++){
            out.append(pair.get(i));
        }

        System.out.println(out.toString());
    }
}