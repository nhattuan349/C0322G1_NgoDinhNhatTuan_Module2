package ss6KeThua.BaiTap.LopPointvaMoveablePoint;

public class MoveablePointTest {
    public static void main(String[] args) {
        MoveablePoint moveablePoint = new MoveablePoint(4, 6, 9, 11);
        System.out.println(moveablePoint);
        moveablePoint.move();
        System.out.println(moveablePoint);
    }
}