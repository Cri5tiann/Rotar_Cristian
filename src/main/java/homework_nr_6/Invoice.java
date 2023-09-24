package homework_nr_6;

public class Invoice {

    String deviceModel;
    String productDetails;
    int quantity;
    Double price;

    public Invoice(String deviceModel, String productDetails, int quantity, Double price) {
        this.deviceModel = deviceModel;
        this.productDetails = productDetails;
        this.quantity = quantity;
        this.price = price;
    }

    public String getDeviceModel() {
        return deviceModel;
    }

    public void setDeviceModel(String deviceModel) {
        this.deviceModel = deviceModel;
    }

    public String getProductDetails() {
        return productDetails;
    }

    public void setProductDetails(String productDetails) {
        this.productDetails = productDetails;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity < 0) {
            this.quantity = 0;
        } else {
            this.quantity = quantity;
        }
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        if (price < 0) {
            this.price = 0.0;
        } else {
            this.price = price;
        }

    }

    public void getAmount() {
        System.out.println("The price to pay is: " + this.quantity * this.price);
    }
}
