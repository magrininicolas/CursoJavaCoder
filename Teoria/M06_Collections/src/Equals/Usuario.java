package Equals;

public class Usuario {

  String name;
  String email;

  

  public Usuario() {
  }

  public Usuario(String name) {
    this.name = name;
  }

  public Usuario(String name, String email) {
    this.name = name;
    this.email = email;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Usuario usuario = (Usuario) o;

    if (!name.equals(usuario.name)) return false;
    return email.equals(usuario.email);
  }

  @Override
  public int hashCode() {
    int result = name.hashCode();
    result = 31 * result + email.hashCode();
    return result;
  }
}
