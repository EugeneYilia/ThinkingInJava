public class TestRuntime {
    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().availableProcessors());//4个cpu，每个CPU运用超线程技术相当于两个逻辑核心，这样打印出的数量为8

    }
}
