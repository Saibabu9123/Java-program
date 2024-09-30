package lab_projects;
 class Invoice {
     String partNumber;
     String partDescription;
     int quantity;
     double pricePerItem;

     Invoice(String partNumber, String partDescription, int quantity, double pricePerItem) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }
     
    double getInvoiceAmount() {
        return quantity * pricePerItem;
    }

    public static void main(String[] args) {
        Invoice invoice = new Invoice("1426", "screw driver", 4, 14.69);
        double amount = invoice.getInvoiceAmount();
        System.out.println("Invoice amount: $" + amount);
    }
}
