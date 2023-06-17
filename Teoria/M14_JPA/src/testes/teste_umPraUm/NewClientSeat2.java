package testes.teste_umPraUm;

import infra.DAO;
import modelo.umPraUm.Client;
import modelo.umPraUm.Seat;

public class NewClientSeat2 {
  public static void main(String[] args) {
    
    Seat seat = new Seat("4D");
    Client client = new Client("Rodrigo", seat);

    DAO<Client> daoClient = new DAO<>(Client.class);
    daoClient.openTransaction().include(client).closeTransaction().close();
  }
}
