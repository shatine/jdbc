package hello.jdbc.exception.basic;

public class UncheckedTest {

    /**
     * RuntimeException을 상속받은 예외는 언체크 예외가 됩니다.
     */
    static class MyUnckeckedException extends RuntimeException {
        public MyUnckeckedException(String message) {
            super(message);
        }
    }

    static class Repository {
        public void call() {
            throw new MyUnckeckedException("ex");
        }
    }

    /**
     * UnChecked 예외는
     * 예외를 잡거나, 던지지 않아도 된다.
     * 예외를 잡이 않으면 자동으로 밖으로 던진다.
     */
    static class Service {
        Repository repository = new Repository();

        public void callCatch() {
            repository.call();
        }
    }

}
