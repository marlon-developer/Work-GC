package Vetor;

public class Vet4 {
	
	//Atributos de classe do tipo float para cada posição do vetor: x, y e z para vet3;
	public float x;
	public float y;
	public float z;
	public float w;
	    
	//Método construtor padrão, sem parâmetros, que zera os valores do vetor;
	public Vet4(){
		this.x = 0;
	    this.y = 0;
	    this.z = 0;
	    this.w = 0;
	}
	    
	//Método construtor que recebe os valores do vetor, e estes são atribuídos aos atributos de classe;
	public Vet4(float x, float y, float z, float w){
	     this.x = x;
	     this.y = x;
	     this.z = z;
	     this.w = w;
	}
	    
	//Método que retorna o tamanho do vetor;
	public float getTamanho(){
	    	 float tamanho = (float) Math.sqrt(x * x + y * y + z * z + w * w);
	     return tamanho;
	}
	    
	//Método que normaliza o vetor;
	public Vet4 getNormalizado(){
	      Vet4 novo = new Vet4();
	        
	      float tamanho = getTamanho();
	      novo.x = this.x / tamanho;
	      novo.y = this.y / tamanho;
	      novo.z = this.z / tamanho;
	      novo.w = this.w / tamanho;
	        
	      return novo;
	}
	    
	/*Método para adição de outro vetor. Estes deverão receber por parâmetro um outro vetor do mesmo tipo da classe, 
	que deverá ser somado ao vetor atual;*/
	public Vet4 adicionaVetor(Vet4 outro){
	       Vet4 novo = new Vet4();
	       novo.x = this.x + outro.x;
	       novo.y = this.y + outro.y;
	       novo.z = this.z + outro.z;
	       novo.w = this.w + outro.w;
	        
	       return novo;
	}
	    
	    
	/*Métodos para subtração de outro vetor. Estes deverão receber por parâmetro um outro vetor do mesmo tipo da classe, 
	que deverá ser subtraído ao vetor atual;*/
	public Vet4 subtraiVetor(Vet4 outro){
	        Vet4 novo = new Vet4();
	        novo.x = this.x - outro.x;
	        novo.y = this.y - outro.y;
	        novo.z = this.z - outro.z;
	        novo.w = this.w + outro.w;
	        
	        return novo;
	}
	    
	//Método para a multiplicação do vetor por um escalar recebido por parâmetro;
	public Vet4 multiplicaEscalar(float escalar){
	        Vet4 novo = new Vet4();
	        novo.x = this.x * escalar;
	        novo.y = this.y * escalar;
	        novo.z = this.z * escalar;
	        novo.w = this.w * escalar;
	        
	        return novo;
	}
	    
	//Método para a divisão do vetor por um escalar recebido por parâmetro;
	public Vet4 divideEscalar(float escalar){
	        Vet4 novo = new Vet4();
	        novo.x = this.x / escalar;
	        novo.y = this.y / escalar;
	        novo.z = this.z / escalar;
	        novo.w = this.w / escalar;
	        
	        return novo;
    }
	    
    //Método para cálculo do produto escalar do vetor por outro vetor recebido por parâmetro, cujo resultado deve ser retornado;
	public float produtoEscalar(Vet4 outro){
	        float prod = this.x * outro.x + this.y * outro.y + this.z * outro.z + this.w * outro.w;
	        return prod;
	}
	    
	//Método que retorna uma nova cópia do vetor atual.
	public Vet4 getCopia(){
	        Vet4 novo = new Vet4(this.x, this.y, this.z, this.w);
	        return novo;
	}
	    
	//Método que retorna um vetor de floats com os valores do vetor.
	public float[] getVetor(){
	        float vet[] = new float[4];
	        
	        vet[0] = this.x;
	        vet[1] = this.y;
	        vet[2] = this.z;
	        vet[3] = this.w;
	        
	        return vet;
	}
}


































