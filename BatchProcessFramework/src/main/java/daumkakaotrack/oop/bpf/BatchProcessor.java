package daumkakaotrack.oop.bpf;

import java.util.Date;

/**
 * Created by Kim on 2015-11-18.
 */
public class BatchProcessor {

    // 모든 데이터 처리가 완료되면 결과를 반환한다.
    Date startTime;
    Date finishTime;
    int processedCount;
    boolean successResult;

    BatchProcessor(){
        DataProcessor dataProcessor = new DataProcessor();
        DataReader dataReader = new DataReader();
        CustomLogger customLogger = new CustomLogger();
        ErrorHandler errorHandler = new ErrorHandler();
    }

    public static void main(String args[]){

    }
}
