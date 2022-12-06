import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
public class Compte {

    @Id
    private long id;

    @ManyToOne
    @JoinColumn(name = "comptes")
    private Client titulaire;
    private double solde;

    private Date dateOuverture;
}
