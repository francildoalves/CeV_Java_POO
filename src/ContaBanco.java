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
 * @author FranCILDO Alves
 * @date 25/11/2021
 */
public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    
    /**
     * <p> O método ??? construtor da conta. </p>
     * <p> Sempre que uma nova conta for criada, o valor da variável {@paran status} é alterado para false, ou seja, a conta está fechada e o {@paran saldo} é defindo como zero.</p>
     */
    public ContaBanco(){}

    /**
     * <p> O método abrirConta é responsável por abrir uma nova conta. </p>
     * <p> Ele altera o valor da variável {@paran status} para true. Se a conta está aberta o status é true, se a conta está fechada, o status é false.</p>
     * <p> Ao abrir uma conta, a variável {@paran tipo} recebe o tipo de conta, sendo CC para Conta Corrente e CP para Conta Poupança.</p>
     * <p> Ao abrir uma conta, ela receberá um valor na variável {@paran saldo}, sendo: R$50,00 para Conta Corrente (CC) e R$ 150,00 para Conta Popança (CP).</p>
     */
    private abrirConta(){}


    /**
     * <p> O método fecharConta é responsável por fechar uma conta. </p>
     * <p> Para ser fechada uma conta não pode ter saldo positivo ou negativo. </p> 
     */
    private fecharConta(){}


     /**
     * <p> O método depositar é responsável por incluir valores em uma conta.</p>
     * <p> Ele recebe um valor real e adiciona esse valor na variável {@paran saldo}.</p>
     * <p> Para poder depositar a conta precisa estar aberta. </p>
     * @return saldo
     */   
    private depositar(){}


     /**
     * <p> O método sacar é responsável por retirar valores em uma conta.</p>
     * <p> Ele recebe um valor real e subtrai esse valor na variável {@paran saldo}.</p>
     * <p> Para poder sacar a conta precisa estar aberta e é preciso que o valor a ser sacado seja menor ou igual ao saldo em conta. </p>
     * @return ???
     */   
    sacar(){}


     /**
     * <p> O método pagarMensal é responsável por fazer o pagamento da taxa de manutenção da conta.</p>
     * <p> Ao ser chamado, o método irá debitar um valor na variável {@paran saldo}, sendo: R$12,00 para Conta Corrente (CC) e R$ 20,00 para Conta Popança (CP).</p>
     * <p> Para poder sacar a conta precisa estar aberta e é preciso que o valor a ser sacado seja menor ou igual ao saldo em conta. </p>
     * @return ???
     */   
    pagarMensal(){}


}
