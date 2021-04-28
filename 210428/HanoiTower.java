package wed_210428;

public class HanoiTower { //使用遞歸

    public static void main(String[] args) {

        Tower tower = new Tower();
        tower.move(5, 'A', 'B', 'C');
      }
    }

     class Tower {
        //num 表示要移動的個數，a，b，c分別表示A塔，B塔，C塔

        public void move(int num, char a, char b, char c) {
            //如果只有一個盤
            if (num == 1) {
                System.out.println(a + "->" + c);
            } else {
                //如果有多個盤，可以看成兩個，最下面的和上面的所有盤（num - 1）
                //1.先移動上面所有的盤到b，借助c
                move(num - 1, a, c, b);
                //2.把最下面的這個盤，移到c
                System.out.println(a + "->" + c);
                //3.再把b塔所有盤，移動到c，借助a
                move(num - 1, b, a, c);


            }

        }

    }

