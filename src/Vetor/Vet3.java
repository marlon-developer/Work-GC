package Vetor;

public class Vet3 {
	
	//Atributos de classe do tipo float para cada posição do vetor: x, y e z para vet3;
	public float x;
	public float y;
	public float z;
    
	//Método construtor padrão, sem parâmetros, que zera os valores do vetor;
    public Vet3(){
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }
    
    //Método construtor que recebe os valores do vetor, e estes são atribuídos aos atributos de classe;
    public Vet3(float x, float y, float z){
        this.x = x;
        this.y = x;
        this.z = z;
    }
    
    //Método que retorna o tamanho do vetor;
    public float getTamanho(){
        float tamanho = (float) Math.sqrt(x * x + y * y + z * z);
        return tamanho;
    }
    
    //Método que normaliza o vetor;
    public Vet3 getNormalizado(){
        Vet3 novo = new Vet3();
        
        float tamanho = getTamanho();
        novo.x = this.x / tamanho;
        novo.y = this.y / tamanho;
        novo.z = this.z / tamanho;
        
        return novo;
    }
    
    /*Método para adição de outro vetor. Estes deverão receber por parâmetro um outro vetor do mesmo tipo da classe, 
    que deverá ser somado ao vetor atual;*/
    public Vet3 adicionaVetor(Vet3 outro){
        Vet3 novo = new Vet3();
        novo.x = this.x + outro.x;
        novo.y = this.y + outro.y;
        novo.z = this.z + outro.z;
        
        return novo;
    }
    
    
    /*Métodos para subtração de outro vetor. Estes deverão receber por parâmetro um outro vetor do mesmo tipo da classe, 
    que deverá ser subtraído ao vetor atual;*/
    public Vet3 subtraiVetor(Vet3 outro){
        Vet3 novo = new Vet3();
        novo.x = this.x - outro.x;
        novo.y = this.y - outro.y;
        novo.z = this.z - outro.z;
        
        return novo;
    }
    
    //Método para a multiplicação do vetor por um escalar recebido por parâmetro;
    public Vet3 multiplicaEscalar(float escalar){
        Vet3 novo = new Vet3();
        novo.x = this.x * escalar;
        novo.y = this.y * escalar;
        novo.z = this.z * escalar;
        
        return novo;
    }
    
    //Método para a divisão do vetor por um escalar recebido por parâmetro;
    public Vet3 divideEscalar(float escalar){
        Vet3 novo = new Vet3();
        novo.x = this.x / escalar;
        novo.y = this.y / escalar;
        novo.z = this.z / escalar;
        
        return novo;
    }
    
    //Método para cálculo do produto escalar do vetor por outro vetor recebido por parâmetro, cujo resultado deve ser retornado;
    public float produtoEscalar(Vet3 outro){
        float prod = this.x * outro.x + this.y * outro.y + this.z * outro.z;
        return prod;
    }
    
    //Método que retorna uma nova cópia do vetor atual.
    public Vet3 getCopia(){
        Vet3 novo = new Vet3(this.x, this.y, this.z);
        return novo;
    }
    
    //Método que retorna um vetor de floats com os valores do vetor.
    public float[] getVetor(){
        float vet[] = new float[3];
        
        vet[0] = this.x;
        vet[1] = this.y;
        vet[2] = this.z;
        
        return vet;
    }
}
