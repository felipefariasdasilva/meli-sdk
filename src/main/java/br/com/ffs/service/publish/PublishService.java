package br.com.ffs.service.publish;

import lombok.val;
import org.springframework.stereotype.Service;

@Service
public class PublishService {

    private static final String BASE_URL = "https://api.mercadolibre.com";

    public void getHome(final String itemId){
        val endpoint = "/items/" + itemId;
    }

    public void getHomeDescription(final String itemId){
        val endpoint = "/items/" + itemId + "/description";
    }

    public void getPenaltyItems(final String userId, final String tag){
        val endpoint = "/users/" + userId + "/items/search?tags=" + tag;
    }

    private String getAuthorizationHeader
}
