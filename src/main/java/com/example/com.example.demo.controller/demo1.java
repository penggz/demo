import java.util.concurrent.*;

/**
 * Created by amy_zhang on 2019/4/27.
 */
public class demo1 {

    public static void main(String[] args) {

        public static ExecutorService newSingleThreadExecutor() {
            return new Executors.FinalizableDelegatedExecutorService
                    (new ThreadPoolExecutor(1, 1,
                            0L, TimeUnit.MILLISECONDS,
                            new LinkedBlockingQueue<Runnable>()));
        }





        public static ExecutorService newFixedThreadPool(int nThreads) {
            return new ThreadPoolExecutor(nThreads, nThreads,
                    0L, TimeUnit.MILLISECONDS,
                    new LinkedBlockingQueue<Runnable>());
        }

    }
}
