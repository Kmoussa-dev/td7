import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Collection;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Client {
    @Id
    private long id;
    private String nom;
    private String prenom;
    private String adresse;

    @OneToMany(mappedBy = "titulaire",cascade = CascadeType.ALL)
    @Builder.Default
    private Collection<Compte> comptes=new ArrayList<>();
}
