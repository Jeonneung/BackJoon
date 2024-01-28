import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true){
            String[] t = scanner.nextLine().split(" ");
            ArrayList<Integer> tri = new ArrayList<>(3);
            for(int i=0;i< t.length;i++){
                tri.add(Integer.parseInt(t[i]));
            }

            if(tri.get(0) == 0){
                break;
            }
            else{
                Collections.sort(tri);
                if(tri.get(2) >= tri.get(0) + tri.get(1)){
                    System.out.println("Invalid");
                }
                else {
                    int same = 0;
                    for(int i = 0; i < t.length; i++){
                        for(int j = i + 1; j < t.length; j++){
                            if(Objects.equals(tri.get(i), tri.get(j))){
                                same++;
                            }
                        }
                    }
                    switch (same){
                        case 0:
                            System.out.println("Scalene");
                            break;
                        case 1:
                            System.out.println("Isosceles");
                            break;
                        case 2:
                        case 3:
                            System.out.println("Equilateral");
                            break;
                    }
                }
            }
        }

    }
}