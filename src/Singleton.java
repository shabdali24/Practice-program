
    public class Singleton {
        private static volatile Singleton instance;

        private Singleton() {}

        public static Singleton getInstance() {
            if (instance == null) {
                synchronized (Singleton.class) {
                    if (instance == null) {
                        instance = new Singleton(); // created only when needed
                    }
                }
            }
            return instance;
        }
    }
 class Single {
    public static void main(String[] args) {
        System.out.println("Hello singletone");
    }
}