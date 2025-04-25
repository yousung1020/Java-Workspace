//package basic;
//
//interface Soundable {
//    void makeSound();
//}
//
//interface Runnable {
//    void run();
//}
//
//class cat implements Soundable, Runnable {
//    @Override
//    public void makeSound() {
//        System.out.println("멍멍");
//    }
//
//    @Override
//    public void run() {
//        System.out.println("강아지가 달립니다.");
//    }
//
//    // Dog 클래스의 추가 메서드
//    public void wagTail() {
//        System.out.println("꼬리를 흔듭니다.");
//    }
//}
//
//public class Dog {
//    public static void main(String[] args) {
//        // Soundable 타입
//        Soundable soundableDog = new Dog();
//        soundableDog.makeSound(); // 가능: Soundable 인터페이스의 메서드
//
//        // soundableDog.run();       // 불가능: Soundable에는 run()이 없음
//        // soundableDog.wagTail();   // 불가능: Soundable에는 wagTail()이 없음
//
//        // Runnable 타입
//        Runnable runnableDog = new Dog();
//        runnableDog.run();        // 가능: Runnable 인터페이스의 메서드
//
//        // runnableDog.makeSound(); // 불가능: Runnable에는 makeSound()가 없음
//        // runnableDog.wagTail();   // 불가능: Runnable에는 wagTail()이 없음
//
//        // Dog 타입
//        Dog dog = new Dog();
//        dog.makeSound(); // 가능
//        dog.run();       // 가능
//        dog.wagTail();   // 가능: Dog 클래스 고유 메서드
//    }
//}
