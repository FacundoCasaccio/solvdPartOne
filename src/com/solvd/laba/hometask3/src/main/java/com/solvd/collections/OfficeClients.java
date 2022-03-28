package com.solvd.collections;

import com.solvd.agents.Client;
import com.solvd.interfaces.IPrintable;

import java.util.HashMap;

public class OfficeClients implements IPrintable {
    private HashMap<Integer, Client> clients = new HashMap<>();

    public void addClient(Client client) {
        this.clients.put(client.getClientId(), client);
    }

    public void deleteClient(Client client){
        this.clients.remove(client.getClientId());
    }

    public Client getClientById(Integer id) {
        return this.clients.get(id);
    }

    public HashMap<Integer, Client> getClients(){
        return this.clients;
    }

    @Override
    public void print() {
        System.out.println(clients);
    }
}
