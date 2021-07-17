package InnerClass;

public class InnerClass01 {
    public static void main(String[] args){

        CellPhone cellPhone = new CellPhone();
        //1. 传递的是实现了Bell接口的匿名内部类
        //2. 重写了ring方法
        //3. Bell bell = new Bell() {
        //            @Override
        //            public void ring() {
        //                System.out.println("its late, get uuuuuup!");
        //            }
        //        }
        // 编译类型是Bell，但运行类型是匿名内部类 = InnerClass01$1
        cellPhone.alarmClock(new Bell() {
            @Override
            public void ring() {
                System.out.println("its late, get uuuuuup!");
            }
        });

//        cellPhone.alarmClock(new Bell(){
//            @Override
//            public void ring(){
//                System.out.println("class is start!");
//            }
//        });
//
    }
}

interface Bell{ //接口
    void ring(); //方法
}

class CellPhone{ //类
    public void alarmClock(Bell bell){ //形参是Bell接口类型
        System.out.println(bell.getClass()); //打印匿名内部类的实际运行类型：InnerClass01$1
        bell.ring();
    }
}
