//public class Stopwatch {
//
//    public double elapsedTime() {
//    }
//
//    private static class StopWatch {
//        private long startTime;
//        private boolean running;
//        private long stopTime;
//
//        public void start() {
//            this.startTime = System.currentTimeMillis();
//            this.running = true;
//        }
//        public void stop(){
//            this.stopTime = System.currentTimeMillis();
//            this.running = false;
//        }
//
//        //elaspsed time in milliseconds
//        public long getElapsedTime() {
//            long elapsed;
//            if (running) {
//                elapsed = (System.currentTimeMillis() - startTime);
//            } else {
//                elapsed = (stopTime - startTime);
//            }
//            return elapsed;
//        }
//
//
//        //elaspsed time in seconds
//        public long getElapsedTimeSecs() {
//            long elapsed;
//            if (running) {
//                elapsed = ((System.currentTimeMillis() - startTime) / 1000);
//            } else {
//                elapsed = ((stopTime - startTime) / 1000);
//            }
//            return elapsed;
//        }
//    }
//}
