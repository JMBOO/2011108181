package daumkakaotrack.oop.bpf;

import java.util.Date;

/**
 * Created by Kim on 2015-11-18.
 */
public class BatchProcessor {

    BatchProcessor() {
        DataProcessor dataProcessor = new DataProcessor();
        DataReader dataReader = new DataReader();
        CustomLogger customLogger = new CustomLogger();
        ErrorHandler errorHandler = new ErrorHandler();
    }

    // 모든 데이터 처리가 완료되면 결과를 반환한다.
    private Date startTime;
    private Date finishTime;
    private int processedCount;
    private boolean successResult = false;

    public void setStartTime() {
        startTime = new Date();
        startTime.getTime();
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setFinishTime() {
        finishTime = new Date();
        finishTime.getTime();
    }

    public Date getFinishTime() {
        return finishTime;
    }

    public void setProcessedCount(int processedCount) {
        this.processedCount = processedCount;
    }

    public int getProcessedCount() {
        return processedCount;
    }

    public void setSuccessResult(boolean successResult) {
        this.successResult = successResult;
    }

    public boolean getSuccessResult() {
        return successResult;
    }

    public static void main(String args[]) {
        BatchProcessor batchProcessor = new BatchProcessor();
        batchProcessor.setStartTime();
        System.out.println(batchProcessor.getStartTime());

        batchProcessor.setFinishTime();
        System.out.println(batchProcessor.getFinishTime());
    }
}
