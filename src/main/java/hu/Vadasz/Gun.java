package hu.Vadasz;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Gun {
    private @Getter @Setter Hunter owner;

    @Autowired
    public void setOwner(Hunter owner) {
        this.owner = owner;
        System.out.println(this.owner);
    }

}
