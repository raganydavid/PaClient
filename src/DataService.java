/*
* File: DataService.java
* Author: Ragány Dávid Gergő
* Copyright: 2023, Ragány Dávid Gergő
* Group: Szoft II-1-E
* Date: 2024-01-12
* Github: https://github.com/raganydavid/Paclient
* Licenc: GNU GPL
*/

import hu.szit.Client;

public class DataService {
    String url;
    Client client;
    public DataService() {
        url = "https://jsonplaceholder.typicode.com/todos";
        client = new Client();
    }

    public String getTodos() {
        String result = client.get(url);
        return result;
    }
}