class plate {
    plate() {
        System.out.println("Constructor of class plate called");
    }

    void ml_Inherit(double length, double width) {
        System.out.println("Length: " + length + " Width: " + width);
    }
}

class Box extends plate {
    Box() {
        System.out.println("Constructor of class Box called");
    }

    void ml_Inherit(double length, double width, double height) {
        System.out.println("Length: " + length + " Width: " + width + " Height: " + height);
    }
}

class woodBox extends Box {
    woodBox() {
        System.out.println("Constructor of class woodBox called");
    }

    void ml_Inherit(double length, double width, double height, double thick) {
        System.out.println("Length: " + length + " Width: " + width + " Height: " + height + " Thickness: " + thick);
    }
}

public class q3 {
    public static void main(String args[]) {
        woodBox obj = new woodBox();
        obj.ml_Inherit(13, 14);
        obj.ml_Inherit(11, 12, 18);
        obj.ml_Inherit(12, 16, 17, 18);
    }
}