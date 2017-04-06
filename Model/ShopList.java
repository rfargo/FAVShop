/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author user
 */
public class ShopList {
    private int NoteNo;
    private String BuyerName;
    private String BrandName;
    private String Type;
    private int Price;
    private int Amount;
    private int TotalAmount;

    public ShopList() {
    }

    public ShopList(int NoteNo, String BuyerName, String BrandName, String Type, int Price, int Amount, int TotalAmount) {
        this.NoteNo = NoteNo;
        this.BuyerName = BuyerName;
        this.BrandName = BrandName;
        this.Type = Type;
        this.Price = Price;
        this.Amount = Amount;
        this.TotalAmount = TotalAmount;
    }

    public int getNoteNo() {
        return NoteNo;
    }

    public void setNoteNo(int NoteNo) {
        this.NoteNo = NoteNo;
    }

    public String getBuyerName() {
        return BuyerName;
    }

    public void setBuyerName(String BuyerName) {
        this.BuyerName = BuyerName;
    }

    public String getBrandName() {
        return BrandName;
    }

    public void setBrandName(String BrandName) {
        this.BrandName = BrandName;
    }

    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int Price) {
        this.Price = Price;
    }

    public int getAmount() {
        return Amount;
    }

    public void setAmount(int Amount) {
        this.Amount = Amount;
    }

    public int getTotalAmount() {
        return TotalAmount;
    }

    public void setTotalAmount(int TotalAmount) {
        this.TotalAmount = TotalAmount;
    }
    
}

