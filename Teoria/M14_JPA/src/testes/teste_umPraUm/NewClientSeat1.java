package testes.teste_umPraUm;

import infra.DAO;
import modelo.umPraUm.Client;
import modelo.umPraUm.Seat;

public class NewClientSeat1 {
  public static void main(String[] args) {
    
    Seat seat = new Seat("23C");
    Client client = new Client("Beatriz", seat);

    DAO<Seat> daoSeat = new DAO<>(Seat.class);
    DAO<Client> daoClient = new DAO<>(Client.class);

    daoSeat.openTransaction().include(seat).closeTransaction().close();
    daoClient.openTransaction().include(client).closeTransaction().close();

  }
}
