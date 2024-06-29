public class Main {
  public static void main(String[] args) {
    Sphere cal1 = new Sphere();
    cal1.get(5);
    cal1.cal();

    Cone cal2 = new Cone();
    cal2.get(5, 4, 2);
    cal2.cal();

    Cylinder cal3 = new Cylinder();
    cal3.get(5, 4);
    cal3.cal();
  }
}