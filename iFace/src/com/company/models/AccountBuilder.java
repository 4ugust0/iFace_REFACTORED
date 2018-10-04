package com.company.models;

import java.util.ArrayList;
import java.util.List;

public class AccountBuilder {

    private String newFirstName;
    private String newMiddleName;
    private String newLastName;
    private String newAccountLogin;
    private String newAccountPassword;
    private String newAccountEmail;
    private List<Community> newAccountCommunities;
    private List<String> newAccountMessages;
    private List<String> newAccountFriends;

    public AccountBuilder(){
        this.newAccountCommunities = new ArrayList<>();
        this.newAccountMessages = new ArrayList<>();
        this.newAccountFriends = new ArrayList<>();
    }

    public AccountBuilder setNewFirstName(String newFirstName) {
        this.newFirstName = newFirstName;
        return this;
    }

    public AccountBuilder setNewMiddleName(String newMiddleName) {
        this.newMiddleName = newMiddleName;
        return this;
    }

    public AccountBuilder setNewLastName(String newLastName) {
        this.newFirstName = newLastName;
        return this;
    }

    public AccountBuilder setNewAccountLogin(String newAccountLogin) {
        this.newAccountLogin = newAccountLogin;
        return this;
    }

    public AccountBuilder setNewAccountPassword(String newAccountPassword) {
        this.newAccountPassword = newAccountPassword;
        return this;
    }

    public AccountBuilder setNewAccountEmail(String newAccountEmail) {
        this.newAccountEmail = newAccountEmail;
        return this;
    }

    public Account createAccount() {
        return new Account(
                newFirstName,
                newMiddleName,
                newLastName,
                newAccountLogin,
                newAccountPassword,
                newAccountEmail, newAccountCommunities, newAccountMessages, newAccountFriends);
    }
}
