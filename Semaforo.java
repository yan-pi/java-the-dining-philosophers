package JANTARDOSFILOSOFOS;

public class Semaforo
{

    // Criação de um contador protegido para esta classe
    protected int contador;

    // Método construtor da classe que não recebe nenhum valor
    public Semaforo ()
    {
        this.contador = 0;
    }

    // Método construtor da classe que recebe um valor para setar no
    // contador
    public Semaforo (int valor)
    {
        this.contador = valor;
    }

    // Método de sincronização da classe onde será decrescido o contador
    public synchronized void decrementar ()
    {

        // Enquanto o contador for igual a 0, ele aguarda e trata a exceção
        while (this.contador == 0)
        {
            try
            {
                // Espera uma nova solicitação
                wait();
            }
            catch (InterruptedException ex)
            {
                // Exibe uma mensagem de controle de erro
                System.out.println("ERROR>" + ex.getMessage());
            }
        }

        // Caso tenha saído do while acima, então decrementa o
        // contador da classe
        this.contador--;

    }

    // Método de sincronização da classe onde será incrementado o contador
    public synchronized void incrementar ()
    {
        // Incrementa o contador da classe
        this.contador++;
        // Notifica que a solicitação já foi executada
        notify();
    }

}