/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3;

/**
 *
 * @author ABDULMOHSEN ALMALAWI <balmalowy@kau.edu.sa >
 */
import java.util.Date;

public class OTSEngine {

    private Item[] items;
    private Buyer[] buyers;
    private Seller[] sellers;
    private LogisticPartner[] logisticPartners;
    private int itemCounter;
    private int buyersCounter;
    private int sellersCounter;
    private int logisticPartnersCounter;

    public OTSEngine(int numberOfItems, int numberOfBuyers, int numberOfSellers, int numberOflogisticPartner) {
        this.items = new Item[numberOfItems];
        this.buyers = new Buyer[numberOfBuyers];
        this.sellers = new Seller[numberOfSellers];
        this.logisticPartners = new LogisticPartner[numberOflogisticPartner];
    }

    public StringBuilder addItem(int itemId, String itemName, double price, int inStock, int sellerId) {
        return new StringBuilder("");
    }

    public StringBuilder addSeller(int id, String name, String nationality, Date dateOfBirth, int year, int month, int day, char gender, int licenseNo, String company, int regNumber, boolean operational, int phone, String address) {
        return new StringBuilder("");
    }

    public StringBuilder addBuyer(int id, String name, String nationality, Date dateOfBirth, int year, int month, int day, char gender, int phone, String address) {
       return new StringBuilder("");
    }

    public StringBuilder addLogisticPartner(int id, String name, String nationality, Date dateOfBirth, int year, int month, int day, char gender, String company, int regNumber, boolean operational, double ratePerKG, int Phone, String address) {
      return new StringBuilder("");
    }

    public StringBuilder initializeOrder(int buyerId, int totItem) {
       return new StringBuilder("");
    }

    public StringBuilder addItemToOrder(int orderId, int buyerId, int itemId) {
       return new StringBuilder("");
    }

    public StringBuilder associateLogisticPartnerToOrder(int orderId, int logisticPartnerId, double weightOfPackageInKG) {
       return new StringBuilder("");
    }

    public StringBuilder updateOrderStatus(int orderId, String orderDesc) {
        return new StringBuilder("");
    }

    public StringBuilder printOrderOfBuyer(int buyerId, int orderId) {
        StringBuilder results = new StringBuilder();
       
        return results;
    }

    public StringBuilder printSpecificItemsForSeller(int sellerId) {
        StringBuilder results = new StringBuilder();
      
        return results.append("\n");
    }

    public StringBuilder printTransactionsOfSeller(int sellerId) {
        StringBuilder results = new StringBuilder();
       
        return results;
    }

    public StringBuilder printTransactionsOfBuyer(int buyerId) {
        StringBuilder results = new StringBuilder();
       
        return results;
    }
}
