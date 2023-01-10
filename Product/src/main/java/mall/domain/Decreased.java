package mall.domain;

import mall.domain.*;
import mall.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class Decreased extends AbstractEvent {

    private Long id;
    private String productname;
    private String productimage;
    private String stock;

    public Decreased(Product aggregate){
        super(aggregate);
    }
    public Decreased(){
        super();
    }
}
