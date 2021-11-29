import java.lang.invoke.ConstantBootstraps;

/** 
 * 
 * A classe ContaBanco contém os atributos e métodos para manipular as solicitações de uma conta bancároa.
 * 
 * @param numConta - Armazena um número inteiro com o número da conta
 * @param tipo -  Armazena uma String com o tipo de conta que será criada ela pode ser uma Conta Corrente "CC" ou Conta Poupança CP.
 * @param dono -  Armazena uma String com o nome do dono da conta.
 * @param saldo - Armazena um múmero do tipo float com o saldo atual da conta.
 * @param status - Armazena um valor booleano com o status da conta, sendo true para conta aberta e false para conta fechada.
 * @param CONTA_CORRENTE_CC - Armazena uma constante do tipo String com o valor inicial de abertura de uma conta corrente.
 * @param CONTA_CORRENTE_CP - Armazena uma constante do tipo String com o valor inicial de abertura de uma conta poupança.
 * @author FranCILDO Alves
 * @version 1.0
 * @date 25/11/2021
 * 
 */
public class ContaBanco {
    public int numConta = 0;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    public static final String CONTA_CORRENTE_CC = "CC";
    public static final String CONTA_POUPANCA_CP = "CP";

       
    
    /**
     * <p> O método ContaBanco é o construtor da conta. </p>
     * <p> Sempre que uma nova conta for criada, o valor da variável {@paran status} é alterado para false, ou seja, a conta está fechada e o {@paran saldo} é defindo como zero.</p>
     */
    public ContaBanco(){
        this.saldo = 0;
        this.status = false;
    }


    /**
     * MÉTODOS GETTERs AND SETTERs
     */

     
    public int getNunConta(){
        return this.numConta;
    }

    public void setNunConta(int numConta){
        this.numConta = numConta;
    }

    public String getTipo(){
        return this.tipo;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public String getDono(){
        return this.dono;
    }

    public void setDono(){
        this.dono = dono;
    }

    public float getSaldo(){
        return this.saldo;
    }

    public void setSaldo(float saldo){
        this.saldo = saldo;
    }
    
    public boolean isStatus(){
        return this.status;
    }

    public void setStatus(boolean status){
        this.status = status;
    }




    /**
     * <p> O método abrirConta é responsável por abrir uma nova conta. </p>
     * <ul> 
     *    <li> Ele altera o valor da variável {@paran status} para true. Se a conta está aberta o status é true, se a conta está fechada, o status é false.</li>
     *    <li> Ao abrir uma conta, a variável {@paran tipo} recebe o tipo de conta, sendo CC para Conta Corrente e CP para Conta Poupança.</li>
     *    <li> Ao abrir uma conta, ela receberá um valor na variável {@paran saldo}, sendo: R$50,00 para Conta Corrente (CC) e R$ 150,00 para Conta Popança (CP).</li>
     * </ul>
     */
    public void abrirConta(String tipo){
        setTipo(tipo);
        setStatus(true);
        this.numConta = numConta+1; 
        try {
            if (this.tipo.equals(CONTA_CORRENTE_CC)) {
                this.saldo = saldo+50.f;
                System.out.println("Conta Corrente criada com sucesso");
            } else if (this.tipo.equals(CONTA_POUPANCA_CP)) {
                this.saldo = saldo+150.f;
                System.out.println("Conta Poupança criada com sucesso");
            } else {
                System.out.println("Digite CC para abrir uma Conta Corrente ou CP para Conta Poupança");
            }
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println("Ocorreu um erro. Operação não realizada");
        }
        
    }


    /**
     * <p> O método fecharConta é responsável por fechar uma conta. </p>
     * <ul>
     * <li> Para ser fechada uma conta não pode ter saldo positivo ou negativo. </li> 
     * </ul>
     */
    public void fecharConta(){
        try {
            if (this.getSaldo() < 0) {
                System.out.println("Existe débito na conta.");
            } else if (this.getSaldo() > 0) {
                System.out.println("A conta possui saldo positivo. Realize um saque no valor de R$ " + getSaldo() + " para fechar a conta.");
            } else {
                setStatus(false);
            }
        } catch (Exception e) {
            //TODO: Erro não identificado
            System.out.println("Ocorreu um erro. Operação não realizada");
        }
    }


     /**
     * <p> O método depositar é responsável por incluir valores em uma conta.</p>
     * <p> Ele recebe um valor real e adiciona esse valor na variável {@paran saldo}.</p>
     * <p> Para poder depositar a conta precisa estar aberta. </p>
     * @return saldo
     */   
    public void depositar(float valor){
        try {
            if (isStatus()) {
                setSaldo(getSaldo() + valor);
            } else {
                System.out.println("Impossível fazer depósito. A conta não está aberta.");
            }
        } catch (Exception e) {
            //TODO: Erro não identificado
            System.out.println("Ocorreu um erro. Operação não realizada");
        }
    }


     /**
     * <p> O método sacar é responsável por retirar valores em uma conta.</p>
     * <p> Ele recebe um valor real e subtrai esse valor na variável {@paran saldo}.</p>
     * <p> Para poder sacar a conta precisa estar aberta e é preciso que o valor a ser sacado seja menor ou igual ao saldo em conta. </p>
     * @return ???
     */   
    //public sacar(){}


     /**
     * <p> O método pagarMensal é responsável por fazer o pagamento da taxa de manutenção da conta.</p>
     * <p> Ao ser chamado, o método irá debitar um valor na variável {@paran saldo}, sendo: R$12,00 para Conta Corrente (CC) e R$ 20,00 para Conta Popança (CP).</p>
     * <p> Para poder sacar a conta precisa estar aberta e é preciso que o valor a ser sacado seja menor ou igual ao saldo em conta. </p>
     * @return ???
     */   
    //public pagarMensal(){}


    /**
     * 
     *  <ul>
     * <li>It is <i>reflexive</i>: for any non-null reference value
     *     {@code x}, {@code x.equals(x)} should return
     *     {@code true}.
     * <li>It is <i>symmetric</i>: for any non-null reference values
     *     {@code x} and {@code y}, {@code x.equals(y)}
     *     should return {@code true} if and only if
     *     {@code y.equals(x)} returns {@code true}.
     * <li>It is <i>transitive</i>: for any non-null reference values
     *     {@code x}, {@code y}, and {@code z}, if
     *     {@code x.equals(y)} returns {@code true} and
     *     {@code y.equals(z)} returns {@code true}, then
     *     {@code x.equals(z)} should return {@code true}.
     * <li>It is <i>consistent</i>: for any non-null reference values
     *     {@code x} and {@code y}, multiple invocations of
     *     {@code x.equals(y)} consistently return {@code true}
     *     or consistently return {@code false}, provided no
     *     information used in {@code equals} comparisons on the
     *     objects is modified.
     * <li>For any non-null reference value {@code x},
     *     {@code x.equals(null)} should return {@code false}.
     * </ul>
     * 
     */
    public void testeClasse(){
        System.out.println("teste");
    }

}
