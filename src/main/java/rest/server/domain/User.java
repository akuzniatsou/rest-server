package rest.server.domain;

import java.io.Serializable;
import java.util.Objects;

/**
 * Created by Mpak on 22.06.2015.
 */
public class User implements Serializable {

    private static final long serialVersionUID = 7513301592685895692L;

    private String id;
    private String name;
    private String surname;
    private String email;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, surname, email);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final User other = (User) obj;
        return Objects.equals(this.id, other.id)
                && Objects.equals(this.name, other.name)
                && Objects.equals(this.surname, other.surname)
                && Objects.equals(this.email, other.email);
    }
}
