package oop.belajar.java.data;

public class Country {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    //inner class static

    //kalo inner classnya static,
    //      maka tidak bisa akses data di Country/outer classnya lagi
    public static class City{
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
