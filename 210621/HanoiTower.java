/***
 * 遞歸
 */
public class HanoiTower {
    public static void main(String[] args) {

        Tower tower = new Tower();
        tower.move(3,'A','B','C');

    }
}
class Tower{

    public void move(int num,char a,char b,char c){
        if(num == 1){ //只有一個盤
            System.out.println(a+"->"+c);
        } else {//多個盤
            //先將除去最後一個盤的所有盤，從a藉助c，移動到b柱
            move(num-1,a,c,b);
            //再將最後一個盤 從a 移動到 c
            System.out.println(a+"->"+c);
            //最後將除去最後一個盤的所有盤，從b藉助a，移動到c柱，完成
            move(num-1,b,a,c);
        }
    }

}