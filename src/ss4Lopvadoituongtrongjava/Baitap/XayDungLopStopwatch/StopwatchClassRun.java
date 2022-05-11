package ss4Lopvadoituongtrongjava.Baitap.XayDungLopStopwatch;

public class StopwatchClassRun {
    private long startTime;
    private long endTime;

    public StopwatchClassRun() {
        startTime = System.currentTimeMillis();
    }
//Trường startTime và endTime là private với phương thức getter để trả về giá trị của startTime và endTime.
    public StopwatchClassRun(long startTime, long endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

//Phương thức khởi tạo không tham số khởi tạo startTime với thời gian hiện tại của hệ thống.
    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    public void start() {
        startTime = System.currentTimeMillis();
    }

    public void stop() {
        endTime = System.currentTimeMillis();
    }

    public long getElapsedTime() {
        return endTime - startTime;
    }

    @Override
    public String toString() {
        return "StopWatch{" +
                "startTime=" + startTime +
                ", endTime=" + endTime +
                '}';
    }
}
