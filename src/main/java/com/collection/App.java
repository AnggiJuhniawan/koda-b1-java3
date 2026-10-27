package com.collection;

import java.util.List;
import java.util.Set;
import java.util.Map;
import java.util.Queue;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.ArrayDeque;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        // List
        // List<String> names = new ArrayList<>();
        // names.add("Budi");
        // names.add("Rizal");
        // names.add("Alvin");
        // names.add("Zakky");
        // names.add("Alvin");

        // System.out.println(names);

        // Set
        // Set<String> studentsKoda = new HashSet<>();
        // studentsKoda.add("Afif");
        // studentsKoda.add("Afif");
        // studentsKoda.add("Bando");

        // System.out.println(studentsKoda);
        // System.out.println(studentsKoda.size());

        // Map
        // Map<String, String> hewan = new HashMap<>();

        // hewan.put("Laut", "Anjing Laut");
        // hewan.put("Darat", "Anjing");

        // System.out.println(hewan.get("Anjing"));

        // Queue
        Queue<String> queue = new ArrayDeque<>();
        queue.offer("Nanang");
        queue.offer("Nunung");
        queue.offer("Neneng");
        queue.offer("Nonong");
        System.out.println(queue.poll());
        System.out.println(queue.peek());

        // List<Account> accounts = new ArrayList<>();

        // accounts.add(new Account("ACC001", "Andi", 10000));
        // accounts.add(new Account("ACC002", "Budi", 20000));
        // accounts.add(new Account("ACC003", "Mandra", 20000));

        // System.out.println("Account List");

        // for (Account account : accounts) {
        // System.out.println(account.getAccountNumber() + " - " + account.getOwner());
        // }

        // Map<String, Account> accountMap = new LinkedHashMap<>();

        // for (Account account : accounts) {
        // accountMap.put(account.getAccountNumber(), account);
        // }

        // Account selectedAccount = accountMap.get("ACC003");

        // if (selectedAccount != null) {
        // System.out.println("Pemilik: " + selectedAccount.getOwner());
        // }
    }
}
