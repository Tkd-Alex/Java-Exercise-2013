import java.io.*;
public class Persona implements Serializable
{
public String nome;
public int eta;

public Persona(String nome, int eta)
{
this.nome=nome;
this.eta=eta;
}
}