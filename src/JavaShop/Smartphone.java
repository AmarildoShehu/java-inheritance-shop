public class Smartphone extends Prodotto{
    private String imei;
    private int memoryLocated;

    //Costruttore
    public Smartphone(int code, String name, String description,
                      double price, double iva, String imei, int memoryLocated)  {
        //invoco con super la chiamata sul prdotto
        super(code, name, description, price, iva);
        this.imei = imei;
        this.memoryLocated = memoryLocated;

        //Getter e setter attributi smartphone
        public String getImei() {
            return imei;
        }
        public void setImei(String imei) {
            this.imei = imei;
        }
        public int getMemoryLocated() {
            return memoryLocated;
        }
        public void setMemoryLocated(int memoryLocated) {
            this.memoryLocated = memoryLocated;
        }

        //metodo calcolo sconto Smart
        public double smartphoneDiscount() {
            if (memoryLocated < 32) {
                return;getPrice() * 0.05;
            } else {
                return getPrice() * 0.02;
            }
        }

    }
}