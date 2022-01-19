package cigma.pfe.repositories;

import cigma.pfe.models.Client;

public class ClientRepositoryImpl implements ClientRepository{
    ClientRepository clientRepository;


    @Override
    public Client save(Client c) {
        System.out.println("DAO Layer : ClientRepositoryImpl Level");
        return null;
    }

    public ClientRepositoryImpl(ClientRepository clientRepository){
        this.clientRepository=clientRepository;
        System.out.println("Call ClientRepositoryImpl");
    }
}
