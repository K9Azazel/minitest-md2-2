package model;

public class Human {
    public Human(String fullName, String doB, long iD) {
        this.fullName = fullName;
        this.doB = doB;
        this.iD = iD;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDoB() {
        return doB;
    }

    public void setDoB(String doB) {
        this.doB = doB;
    }

    public long getiD() {
        return iD;
    }

    public void setiD(long iD) {
        this.iD = iD;
    }

    String fullName;
    String doB;
    long iD;

    @Override
    public String toString() {
        return "Human{" +
                "fullName='" + fullName + '\'' +
                ", doB='" + doB + '\'' +
                ", iD=" + iD +
                '}';
    }
}
