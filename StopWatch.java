public class StopWatch {
    private long startTime;
    private long endTime;
    
    public StopWatch(){
        this.startTime = System.currentTimeMillis();
    }
    
    public void start(){
        this.startTime = System.currentTimeMillis();
    }
    
    public void stop(){
        this.endTime = System.currentTimeMillis();
    }
    
    public long getElapsedTime(){
        return endTime - startTime;
    }
    
    public static void main(String[] args) {
        int[] numbers = new int[100000];
        for (int i = 0; i < numbers.length; i++){
            numbers[i] = (int) (Math.random() * 100000);
        }
        
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        
        for (int i = 0; i < numbers.length - 1; i++){
            int minIndex = i;
            for (int j = i + 1; j < numbers.length; j++){
                if (numbers[j] < numbers[minIndex]){
                    minIndex = j;
                }
            }
            int temp = numbers[i];
            numbers[i] = numbers[minIndex];
            numbers[minIndex] = temp;
        }
        
        stopWatch.stop();
        
        long elapsedTime = stopWatch.getElapsedTime();
        System.out.println("Waktu eksekusi pengurutan 100.000 angka adalah " + elapsedTime + " milidetik");
    }
    
}
