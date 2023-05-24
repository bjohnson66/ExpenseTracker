package com.example.expensetrackerapp;

import javafx.beans.property.SimpleStringProperty;

public class ExpenseEntry {
    private SimpleStringProperty  date;

    private SimpleStringProperty  category;

    private SimpleStringProperty  description;

    private SimpleStringProperty  amount;

    private SimpleStringProperty  paymentMethod;

    private SimpleStringProperty  vendor;

    private SimpleStringProperty  taxDeductible;

    private SimpleStringProperty  recurringExpense;

    private SimpleStringProperty  source;

    private SimpleStringProperty  notes;

    public ExpenseEntry(SimpleStringProperty  date, SimpleStringProperty  category, SimpleStringProperty  description, SimpleStringProperty  amount, SimpleStringProperty  paymentMethod, SimpleStringProperty  vendor, SimpleStringProperty  taxDeductible, SimpleStringProperty  recurringExpense, SimpleStringProperty  source, SimpleStringProperty  notes) {
        this.date = date;
        this.category = category;
        this.description = description;
        this.amount = amount;
        this.paymentMethod = paymentMethod;
        this.vendor = vendor;
        this.taxDeductible = taxDeductible;
        this.recurringExpense = recurringExpense;
        this.source = source;
        this.notes = notes;
    }

    public SimpleStringProperty  getDate() {
        return date;
    }

    public void setDate(SimpleStringProperty  date) {
        this.date = date;
    }

    public SimpleStringProperty  getCategory() {
        return category;
    }

    public void setCategory(SimpleStringProperty  category) {
        this.category = category;
    }

    public SimpleStringProperty  getDescription() {
        return description;
    }

    public void setDescription(SimpleStringProperty  description) {
        this.description = description;
    }

    public SimpleStringProperty  getAmount() {
        return amount;
    }

    public void setAmount(SimpleStringProperty  amount) {
        this.amount = amount;
    }

    public SimpleStringProperty  getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(SimpleStringProperty  paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public SimpleStringProperty  getVendor() {
        return vendor;
    }

    public void setVendor(SimpleStringProperty  vendor) {
        this.vendor = vendor;
    }

    public SimpleStringProperty  getTaxDeductible() {
        return taxDeductible;
    }

    public void setTaxDeductible(SimpleStringProperty taxDeductible) {
        this.taxDeductible = taxDeductible;
    }

    public SimpleStringProperty  getRecurringExpense() {
        return recurringExpense;
    }

    public void setRecurringExpense(SimpleStringProperty  recurringExpense) {
        this.recurringExpense = recurringExpense;
    }

    public SimpleStringProperty  getSource() {
        return source;
    }

    public void setSource(SimpleStringProperty  source) {
        this.source = source;
    }

    public SimpleStringProperty  getNotes() {
        return notes;
    }

    public void setNotes(SimpleStringProperty  notes) {
        this.notes = notes;
    }
}
