import java.awt.*;

public class Bird {
     protected int x = 50;
     protected int y = 50;
     protected int size = 15;
     protected Color color = Color.red;

     protected static int numB=0;
     public Bird(){
        System.out.println("� �����!");
        this.numB++;
        repaint();
    }
    private void repaint() {

    }
   /* public void paint(Graphics g){
        g.drawOval(this.x, this.y, this.x + size, this.y + size);
    }*/
    public void fly(){ //fly ��� �����, ���� ����� static - ����� ������, ���� ��� - ����� �������
        System.out.println("� �����!");
    }
}
