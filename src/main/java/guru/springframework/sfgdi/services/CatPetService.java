package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;
import org.springframework.context.annotation.Profile;

/**
 * Created by jt on 12/28/19.
 */
@Service("pet")
@Profile("cat")
public class CatPetService implements PetService {
    @Override
    public String getPetType() {
        return "Cats Are the Best!";
    }
}
