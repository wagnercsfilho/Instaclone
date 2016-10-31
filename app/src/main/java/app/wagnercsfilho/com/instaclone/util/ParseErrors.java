package app.wagnercsfilho.com.instaclone.util;

import java.util.HashMap;


public class ParseErrors {

    private HashMap<Integer, String> errors;

    public ParseErrors() {
        this.errors = new HashMap<>();
        this.errors.put(201, "Senha obrigatória");
        this.errors.put(202, "Usuário ja existe");
    }

    public String getError(int codError) {
        return this.errors.get(codError);
    }

}
