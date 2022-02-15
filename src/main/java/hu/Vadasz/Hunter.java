package hu.Vadasz;

import lombok.extern.apachecommons.CommonsLog;
import org.springframework.stereotype.Component;

@Component
public interface Hunter {

    void ShotWild(Wild wild);
}
