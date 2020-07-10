package Com;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter
public class Figure <T> implements InterfaceFigure<T> {
    T a, b, c;


    public  Figure(T a, T b, T c)
    {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public  Figure(T a, T b)
    {
        this.a = a;
        this.b = b;

    }



    public T triangleAria() {

        T h  = TrianglePerimeter();
        T aria;
        if (a == null || b == null) {
            return null;
        }

        if (a instanceof Double) {
            return (T) new Double(Math.sqrt((Double) h *((Double) h - (Double) a )*
                    ((Double) h - (Double) b)*
                    ((Double) h - (Double) c)));

        } else if (a instanceof Integer) {

            return  (T) new Integer((int) Math.sqrt((Integer) h *((Integer) h - (Integer) a )*
                    ((Integer) h - (Integer) b)*
                    ((Integer) h - (Integer) c)));


        } else {
            throw new IllegalArgumentException("Type " + a.getClass() + " is not supported by this method");
        }

    }

    private void getDoub(double q)
    {
        System.out.println( q);
    }


    public T TrianglePerimeter() {
        if (a == null || b == null) {
            return null;
        }
        if (a instanceof Double) {
            return (T) new Double((Double) a + ((Double) b).doubleValue() + ((Double) c).doubleValue());
        } else if (a instanceof Integer) {
            return (T)new Integer((Integer) a + (Integer) b + (Integer) c);
        } else {
            throw new IllegalArgumentException("Type " + a.getClass() + " is not supported by this method");
        }
    }

    public T SquareAria() {
        if (a == null || b == null) {
            return null;
        }

        if (a instanceof Double) {
            return (T) new Double((Double) a * (Double) b);
        } else if (a instanceof Integer) {
            return (T)new Integer((Integer) a * (Integer) b);
        } else {
            throw new IllegalArgumentException("Type " + a.getClass() + " Bleadi");
        }
    }

    public T SquarePerimeter() {
        if (a == null || b == null) {
            return null;
        }
 

        if (a instanceof Double) {
            return (T) new Double((((Double) a).doubleValue() + ((Double) b).doubleValue())*2);
        } else if (a instanceof Integer) {
            return (T)new Integer(((Integer) a).intValue() * ((Integer) b).intValue()*2);
        } else {
            throw new IllegalArgumentException("Type " + a.getClass() + " is not supported by this method");
        }
    }

    public T triangleSide(int unghi){
        if (a == null || b == null){
            return null;
        }

        if(a instanceof Integer){

            T aux;
            if(unghi > 90)
            return  (T) new Integer((int)Math.sqrt(Math.pow((Integer) a, 2)+Math.pow((Integer) b, 2)+2*(Integer) a*(Integer) b));
            else return (T) new Integer((int)Math.sqrt(Math.pow((Integer) a, 2)+Math.pow((Integer) b, 2)-2*(Integer) a*(Integer) b));


        }if(a instanceof Double){
            if(unghi > 90)
            return (T) new Double(Math.sqrt(Math.pow((Double) a, 2)+Math.pow((Double) b, 2)+2*(Double) a*(Double) b));
            else return (T) new Double(Math.sqrt(Math.pow((Double) a, 2)+Math.pow((Double) b, 2)-2*(Double) a*(Double) b));
        }else {
            throw new IllegalArgumentException("Type " + a.getClass() + " is not supported by this method");
        }
    }
}
