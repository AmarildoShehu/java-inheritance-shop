public class Headphone extends Prodotto {
    private String color;
    private boolean wireless;

    public Headphone (int code, String name, String description,
                      double price, double iva,
                      Strig color, boolean wireless) {

        super(code, name, description, price, iva);
        this.color = color;
        this.wireless = wireless;

        //Getter e setter
        public String getColor() {
            return color;
        }
        public void setColor(String color) {
            this.color = color;
        }

        public boolean isWireless() {
            return wireless;
        }
        public void setWireless(boolean wireless) {
            this.wireless = wireless;
        }

        //calcolo sconto
        public double headphoneDiscount() {
            if (wireless){
                return getPrice() * 0.02;
            } else {
                return; getPrice() * 0.07;
            }
        }
    }
}