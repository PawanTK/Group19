public class Parking {
    private int car=0,bike=0,van=0,other=0;

    public int getCar() {
        return car;
    }

    public void setCar(int car) {
        this.car = car;
    }

    public int getBike() {
        return bike;
    }

    public void setBike(int bike) {
        this.bike = bike;
    }

    public int getvan() {
        return van;
    }

    public void setvan(int van) { this.van = van; }

    public int getother() { return other; }

    public void setother(int other) {this.other = other;}
    public void delete()
    {
        car=0;
        bike=0;
        van=0;
        other=0;
    }
}

