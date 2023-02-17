import java.util.Arrays;

public class Company{
    private String address;
    private Java[] javas;
    private Android [] androids;
    private Go[] go;
    private String ownerName;

    public Company(String address, Java[] javas, Android[] androids, Go[] go, String ownerName) {
        this.address = address;
        this.javas = javas;
        this.androids = androids;
        this.go = go;
        this.ownerName = ownerName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Java[] getJavas() {
        return javas;
    }

    public void setJavas(Java[] javas) {
        this.javas = javas;
    }

    public Android[] getAndroids() {
        return androids;
    }

    public void setAndroids(Android[] androids) {
        this.androids = androids;
    }

    public Go[] getGo() {
        return go;
    }

    public void setGo(Go[] go) {
        this.go = go;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    @Override
    public String toString() {
        return
                "address: " + address + "\n" +
                "javas: " + Arrays.toString(javas) + "\n" +
                "androids: " + Arrays.toString(androids) + "\n" +
                "go: " + Arrays.toString(go) + "\n" +
                "ownerName: " + ownerName;
    }
}
