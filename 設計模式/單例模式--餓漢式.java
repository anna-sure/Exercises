package chapter10;

public class SingleTon01 {
    public static void main(String[] args) {

        // 單例模式--餓漢式：只要類被加載，實例就創建了，很著急
        GirlFriend instance = GirlFriend.getInstance();
        System.out.println(instance);

        GirlFriend instance1 = GirlFriend.getInstance();
        System.out.println(instance1); //輸出同一個對象
    }
}

/**
 * 單例模式--餓漢式 實現步驟：
 * 1.構造器私有化
 * 2.在類的內部創建對象 且該對象為配合靜態方法使用必須設置為static
 * 3.向外暴露一個靜態的公共方法 getInstance(){ return static 對象名 }
 * */
class GirlFriend{

    private String name;

    private static GirlFriend gf = new GirlFriend("小白");
    // 保障只能創建一個對象
    private GirlFriend(String name) {
        this.name = name;
    }

    public static GirlFriend getInstance(){
        return gf;
    }

    @Override
    public String toString() {
        return "GirlFriend{" +
                "name='" + name + '\'' +
                '}';
    }
}
