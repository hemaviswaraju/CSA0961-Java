class Shape 
{
  int r;
  void get(int radius) 
  {
    r = radius;
  }
}

class Sphere extends Shape 
{
  double A, V;
  void cal() 
  {
    A = 4 * 3.14 * r * r;
    V = (4.0 / 3) * 3.14 * r * r * r;
    System.out.println("Area of sphere: " + A);
    System.out.println("Volume of sphere: " + V);
  }
}

class Cone extends Shape
 {
  double l, h, A, V;
  void get(int radius, int length, int height)
  {
    r = radius;
    l = length;
    h = height;
  }
  void cal() 
  {
    A = 3.14 * (l + r);
    V = (1.0 / 3) * 3.14 * r * r * h;
    System.out.println("Area of cone: " + A);
    System.out.println("Volume of cone: " + V);
  }
}

class Cylinder extends Shape 
{
  double h, A, V;
  void get(int radius, int height) 
  {
    r = radius;
    h = height;
  }
  void cal()
  {
    A = 2 * 3.14 * r * (h + r);
    V = 3.14 * r * r * h;
    System.out.println("Area of cylinder: " + A);
    System.out.println("Volume of cylinder: " + V);
  }
}

public class Main 
{
  public static void main(String[] args) 
  {
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