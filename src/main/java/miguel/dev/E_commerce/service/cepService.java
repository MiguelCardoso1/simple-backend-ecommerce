package miguel.dev.E_commerce.service;

import miguel.dev.E_commerce.dto.EnderecoResponse;
import org.springframework.web.client.RestTemplate;

public class cepService {

    private final RestTemplate restTemplate = new RestTemplate();

    public EnderecoResponse enderecoResponse(String cep) {
        String url = "viacep.com.br/ws/" + cep + "/json/";
        return restTemplate.getForObject(url,EnderecoResponse.class);
    }
}
