package hu.Vadasz;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
public class Wild {
    private @Getter @Setter String species;
    private @Getter @Setter boolean HunterE;


}
