package hu.Vadasz;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


@Primary
@Component
public class BossHunter implements Hunter{



    @Override
    public void ShotWild(Wild wild){System.out.print("Fogott "+wild.getSpecies()+"-t!");
    }

}
