import java.awt.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Flock {
    public ArrayList<Bird> flock = new ArrayList<Bird>();
    static int n;
    ArrayList<Bird> arrayListLarge = new ArrayList<>(n);
    private String[] names = {" James", " Aizel", " Paul", " Oleg", " Truph"};
    Flock f;


    public Flock(Window w){
        flock = new ArrayList<Bird>(n);
        Scanner in = new Scanner(System.in);
        Random r = new Random();


        for (int i = 0; i < n; i++){
            System.out.println("Choose a bird(1 - Macaw,2 - Penguin,3 - Vorobey)");
            int code = in.nextInt();
            if (code == 1){
                String name = names[r.nextInt(names.length)];
                flock.add(new Macaw());
                System.out.println("Macaw added");
            }else if (code == 2) {
                flock.add(new Penguin());
                System.out.println("Penguin added");
            }else if (code == 3){
                flock.add(new Vorobey());
                System.out.println("Vorobey is here");
            }else if (code == 0){
                break;
            }
            int length = names.length;
            System.out.println();
            System.out.println(flock.size());
        }

    }

    public void fly(){
        for(int i = 0; i < n; i++){
            flock.get(i).fly();
        }
    }
}

