package com.company.models;

import java.util.ArrayList;
import java.util.List;

public class Account {

    private String firstName;
    private String middleName;
    private String lastName;
    private String accountLogin;
    private String accountPassword;
    private String accountEmail;
    private List<Community> accountCommunities;
    private List<String> accountMessages;
    private List<String> accountFriends;

    public Account (String firstName,
                    String middleName,
                    String lastName,
                    String accountLogin,
                    String accountPassword,
                    String accountEmail,
                    List<Community> accountCommunities,
                    List<String> accountMessages,
                    List<String> accountFriends){

        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.accountLogin = accountLogin;
        this.accountPassword = accountPassword;
        this.accountEmail = accountEmail;
        this.accountCommunities = accountCommunities;
        this.accountMessages = accountMessages;
        this.accountFriends =accountFriends;
    }
}
