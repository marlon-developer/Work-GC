package Vetor;

public class Vet2 {
	
	//Atributos de classe do tipo float para cada posição do vetor: x, y e z para vet3;
		public float x;
		public float y;
	    
		//Método construtor padrão, sem parâmetros, que zera os valores do vetor;
	    public Vet2(){
	        this.x = 0;
	        this.y = 0;
	    }
	    
	    //Método construtor que recebe os valores do vetor, e estes são atribuídos aos atributos de classe;
	    public Vet2(float x, float y){
	        this.x = x;
	        this.y = x;
	    }
	    
	    //Método que retorna o tamanho do vetor;
	    public float getTamanho(){
	        float tamanho = (float) Math.sqrt(x * x + y * y);
	        return tamanho;
	    }
	    
	    //Método que normaliza o vetor;
	    public Vet2 getNormalizado(){
	        Vet2 novo = new Vet2();
	        
	        float tamanho = getTamanho();
	        novo.x = this.x / tamanho;
	        novo.y = this.y / tamanho;
	        
	        return novo;
	    }
	    
	    /*Método para adição de outro vetor. Estes deverão receber por parâmetro um outro vetor do mesmo tipo da classe, 
	    que deverá ser somado ao vetor atual;*/
	    public Vet2 adicionaVetor(Vet2 outro){
	        Vet2 novo = new Vet2();
	        novo.x = this.x + outro.x;
	        novo.y = this.y + outro.y;
	        
	        return novo;
	    }
	    
	    
	    /*Métodos para subtração de outro vetor. Estes deverão receber por parâmetro um outro vetor do mesmo tipo da classe, 
	    que deverá ser subtraído ao vetor atual;*/
	    public Vet2 subtraiVetor(Vet2 outro){
	        Vet2 novo = new Vet2();
	        novo.x = this.x - outro.x;
	        novo.y = this.y - outro.y;
	        
	        return novo;
	    }
	    
	    //Método para a multiplicação do vetor por um escalar recebido por parâmetro;
	    public Vet2 multiplicaEscalar(float escalar){
	        Vet2 novo = new Vet2();
	        novo.x = this.x * escalar;
	        novo.y = this.y * escalar;
	        
	        return novo;
	    }
	    
	    //Método para a divisão do vetor por um escalar recebido por parâmetro;
	    public Vet2 divideEscalar(float escalar){
	        Vet2 novo = new Vet2();
	        novo.x = this.x / escalar;
	        novo.y = this.y / escalar;
	        
	        return novo;
	    }
	    
	    //Método para cálculo do produto escalar do vetor por outro vetor recebido por parâmetro, cujo resultado deve ser retornado;
	    public float produtoEscalar(Vet2 outro){
	        float prod = this.x * outro.x + this.y * outro.y;
	        return prod;
	    }
	    
	    //Método que retorna uma nova cópia do vetor atual.
	    public Vet2 getCopia(){
	        Vet2 novo = new Vet2(this.x, this.y);
	        return novo;
	    }
	    
	    //Método que retorna um vetor de floats com os valores do vetor.
	    public float[] getVetor(){
	        float vet[] = new float[2];
	        
	        vet[0] = this.x;
	        vet[1] = this.y;
	        
	        return vet;
	    }
}
