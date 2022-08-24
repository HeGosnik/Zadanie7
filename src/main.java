public class main {
    public static void main(String[] args) {
        Figura[] figure = {new Square(8, 12),
                new Triangle(5, 8, 5),
                new circle(10)};

        for(Figura fig : figure)
            System.out.println(fig.getName() + ": area = " + fig.getArea());
    }
} 