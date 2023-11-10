package Creational.Builder.Products;

public class Manual {
        private String screen;
        private String battery;
        private String os;
        private String name;

        public Manual(String name, String screen, String battery, String os) {
            this.name = name;
            this.screen = screen;
            this.battery = battery;
            this.os = os;
        }

        public String print() {
            String info = "\n";
            info = info + "Screen: " + screen + "\n";
            info = info + "Battery: " + battery + "\n";
            info = info + "OS: " + os + "\n";
            return info;
        }
    }


