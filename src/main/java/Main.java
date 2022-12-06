import jakarta.persistence.*;

import java.util.Date;

public class Main {

     static EntityManager em;

    public static void main(String[] args) {

        EntityManagerFactory emf=Persistence.createEntityManagerFactory("banquePU");

        em= emf.createEntityManager();

        Compte compte=Compte.builder()
               .id(1)
               .dateOuverture(new Date())
               .solde(125)
               .build();

        Client client =Client.builder()
                .id(1)
                .nom("Kone")
                .prenom("Moussa")
                .adresse("3 rue charles de coulomb")
                .build();

//        Collection<Compte> comptes=new ArrayList<>();
//
//        comptes.add(compte);
//
//        client.setComptes(comptes);
//
//        compte.setTitulaire(client);

        em.getTransaction().begin();

        em.persist(client);

        em.getTransaction().commit();

    }
}
