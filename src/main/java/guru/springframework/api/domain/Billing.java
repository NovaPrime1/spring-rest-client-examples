
package guru.springframework.api.domain;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class Billing {

    private Card card;
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    public Card getCard() {
        return card;
    }


    public void setCard(Card card) {
        this.card = card;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
