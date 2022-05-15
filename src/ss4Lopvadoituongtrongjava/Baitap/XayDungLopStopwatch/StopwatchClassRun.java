package ss4Lopvadoituongtrongjava.Baitap.XayDungLopStopwatch;

import javafx.scene.paint.Stop;

/**
 * Lớp này bao gồm:
 *
 * Trường startTime và endTime là private với phương thức getter để trả về giá trị của startTime và endTime.
 *
 * Phương thức khởi tạo không tham số khởi tạo startTime với thời gian hiện tại của hệ thống.
 *
 * Phương thức start() để reset startTime về thời gian hiện tại của hệ thống.
 *
 * Phương thức stop() để thiết đặt endTime về thời gian hiện tại của hệ thống.
 *
 * Phương thức getElapsedTime() trả về thời gian đã trôi qua theo số milisecond giây
 *
 * Vẽ sơ đồ UML cho lớp StopWatch và cài đặt lớp.
 *
 * Viết chương trình đo thời gian thực thi của thuật toán sắp xếp chọn (selection sort) cho 100,000 số.
 */
public class StopwatchClassRun {
    private long startTime;
    private long endTime;

    public StopwatchClassRun(){//constructor không có tham số
        startTime = System.currentTimeMillis();
    }
    public StopwatchClassRun(long startTime, long endTime){// constructor có tham số
        this.startTime = startTime;
        this.endTime = endTime;
    }

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
    public void start(){
        startTime = System.currentTimeMillis();
    }
    public void stop(){
        endTime = System.currentTimeMillis();
    }
    public long getElapsedTime(){
        return endTime - startTime;
    }

    @Override
    public String toString() {
        return "StopwatchClassRun{" +
                "startTime=" + startTime +
                ", endTime=" + endTime +
                '}';
    }
}

//public class StopwatchClassRun {
//    private long startTime;
//    private long endTime;
//
//    public StopwatchClassRun() {
//        startTime = System.currentTimeMillis();// thời gian mặc định thời gian hiện tại
//    }
////Trường startTime và endTime là private với phương thức getter để trả về giá trị của startTime và endTime.
//    public StopwatchClassRun(long startTime, long endTime) {
//        this.startTime = startTime;
//        this.endTime = endTime;
//    }
//
////Phương thức khởi tạo không tham số khởi tạo startTime với thời gian hiện tại của hệ thống.
//    public long getStartTime() {
//        return startTime;
//    }
//
//    public void setStartTime(long startTime) {
//        this.startTime = startTime;
//    }
//
//    public long getEndTime() {
//        return endTime;
//    }
//
//    public void setEndTime(long endTime) {
//        this.endTime = endTime;
//    }
//
//
//    public void start() {
//        startTime = System.currentTimeMillis();// Hiện thị thời gian hiện tại của hệ thống
//    }
//
//    public void stop() {
//        endTime = System.currentTimeMillis();// thời gian kết thúc
//    }//Hiện thị thời gian hiện tại của hệ thống
////
//    public long getElapsedTime() {
//        return endTime - startTime;
//    }//Phương thức getElapsedTime() trả về thời gian đã trôi qua theo số milisecond giây
//
//
//
//    @Override
//    public String toString() {
//        return "StopWatch{" +
//                "startTime=" + startTime +
//                ", endTime=" + endTime +
//                '}';
//    }
//}
