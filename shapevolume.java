//q2
public class shapevolume {

    double volume(double r){
        //sphere
        double vol=4/3 * (3.14)*r*r*r;
        return vol;
    }
    double volume(double b ,double h){
        //prism
        double vol=b*h;
        return vol;
    }
    double volume(float r,double h){
        //cylinder
        double vol= (3.14)*r*r*h;
        return vol;
    }
    double volume(double r,float h){
        //cone
        double vol= 1/3*(3.14)*r*r*h;
        return vol;
    }
    double volume(double l,double b,double h){
        //cuboid
        double vol=l*b*h;
        return vol;
    }
    public static void main(String args[]) {
        shapevolume obj=new shapevolume();

        System.out.println("Sphere Volume = " + 
            obj.volume(6));
            System.out.println("Prism Volume = " + 
            obj.volume(5, 1.5));
        System.out.println("Cylinder Volume = " + 
            obj.volume(5, 3.5));
            System.out.println("Cone Volume = " + 
            obj.volume(10, 3.5));
        System.out.println("Cuboid Volume = " + 
            obj.volume(7.5, 3.5, 2));
    }
    
}
