public class Television extends Prodotto {
    private String tvSize;
    private boolean smartTv;

    //Costruttore
    public Television(int code, String name, String description,
                      double price, double iva, String tvSize,
                      boolean smartTv) {

        super(code, name, description, price, iva);
        this.tvSize = tvSize;
        this.smartTv = smartTv;

        //Getter e setter
        publlic String getTvSize() {
            return tvSize;
        }

        public void setTvSize(String tvSize) {
            this.tvSize = tvSize;
        }

        public boolean isSmartTV() {
            return smartTv;
        }
        public void setSmartTv(boolean smartTv) {
            this.smartTv;
        }

        //Sconto TV
        public double tvDiscount() {
            if (!smartTv) {
                return getPrice() * 0.1;
            } else {
                return getPrice() * 0.02;
            }
        }
    }
}