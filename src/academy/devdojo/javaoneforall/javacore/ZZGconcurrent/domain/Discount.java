package academy.devdojo.javaoneforall.javacore.ZZGconcurrent.domain;

//243 - Concurrency pt 15 - CompletableFuture pt 04 - Chaining calls pt 01

public class Discount {
    public enum Code {
        NONE(0), SUPER_SAYAN(5), SUPER_SAYAN2(10), SUPER_SAYAN3(15);
        private final int percentage;

        Code(int percentage) {
            this.percentage = percentage;
        }

        public int getPercentage() {
            return percentage;
        }
    }
}
