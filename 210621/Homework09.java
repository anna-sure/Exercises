public class Homework09 {
    public static void main(String[] args) {
        Music music = new Music("hello",135);
        music.play();
        music.info();


    }
}
class Music{
    String name;
    int times;
    public Music(String name,int times){
        this.name = name;
        this.times = times;
    }
    public void play(){
        System.out.println(name+" song is playing...");
    }
    public void info(){
        System.out.println("song's name = "+name+
                ",and its times = "+times+" seconds.");
    }
}