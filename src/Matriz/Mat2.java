package Matriz;

import Vetor.Vet2;

public class Mat2 {
	
	//Atributos de classe do tipo float para cada posição da matriz: m00, m01, m10, m11;
	float m00, m01,
    		  m10, m11;

	//Método que define os valores da matriz de modo que ela se torne uma matriz identidade;
	public void setIdentidade(){
	  this.m00 = 1; this.m01 = 0;
	  this.m10 = 0; this.m11 = 1;
	}
	
	//Método construtor padrão, sem parâmetros, que invoca o método acima, tornando a mesma uma matriz identidade.
	public Mat2(){
	  setIdentidade();
	}
	
	//Método construtor que recebe dois parâmetros do tipo vet2, e estes são atribuídos as colunas da matriz;
	public Mat2(Vet2 col0, Vet2 col1){
	  this.m00 = col0.x; this.m01 = col1.x;
	  this.m10 = col0.y; this.m11 = col1.y;
	}
	
	/*Métodos para adição de outra mat2. Estes métodos deverão receber por parâmetro uma outra mat2 que deverá ser somada 
	a uma cópia da matriz atual e a matriz resultante da operação deve ser retornada.*/
	public Mat2 adiciona(Mat2 outra){
	  Mat2 nova = new Mat2();
	  nova.m00 = this.m00 + outra.m00;
	  nova.m01 = this.m01 + outra.m01;
	  nova.m10 = this.m10 + outra.m10;
	  nova.m11 = this.m11 + outra.m11;
	  
	  return nova;
	}
	
	/*Métodos para subtração de outra mat2. Estes métodos deverão receber por parâmetro uma outra mat2 que deverá ser subtraida 
	a uma cópia da matriz atual e a matriz resultante da operação deve ser retornada.*/
	public Mat2 subtrai(Mat2 outra){
	  Mat2 nova = new Mat2();
	  nova.m00 = this.m00 - outra.m00;
	  nova.m01 = this.m01 - outra.m01;
	  nova.m10 = this.m10 - outra.m10;
	  nova.m11 = this.m11 - outra.m11;
	  
	  return nova;
	}
	
	//Método que retorna uma cópia da matriz com os valores multiplicados por um escalar recebido por parâmetro;
	public Mat2 multiplicaEscalar(float escalar){
	  Mat2 nova = new Mat2();
	  nova.m00 = this.m00 * escalar;
	  nova.m01 = this.m01 * escalar;
	  nova.m10 = this.m10 * escalar;
	  nova.m11 = this.m11 * escalar;

	  return nova;
	}
	
	//Método que retorna uma cópia da matriz com os valores divididos por um escalar recebido por parâmetro;
	public Mat2 divideEscalar(float escalar){
	  Mat2 nova = multiplicaEscalar(1/escalar);
	  return nova;
	}
	
	//Método para multiplicação/produto da matriz por um vet2, este recebido por parâmetro, cujo retorno é um novo vet2 com o resultado da multiplicação;
	public Vet2 multiplicaVetor(Vet2 vetor){
	  Vet2 novo = new Vet2();
	  novo.x = this.m00 * vetor.x + this.m01 * vetor.y;
	  novo.y = this.m10 * vetor.x + this.m11 * vetor.y;
	  
	  return novo;
	}
	
	//Método para multiplicação/produto da matriz por outra matriz mat2, esta recebida por parâmetro, cujo retorno é uma nova mat2 com o resultado da multiplicação;
	public Mat2 multiplicaMatriz(Mat2 outra){
	  Mat2 nova = new Mat2();
	  //primeira linha
	  nova.m00 = this.m00 * outra.m00 + this.m01 * outra.m10;
	  nova.m01 = this.m00 * outra.m01 + this.m01 * outra.m11;
	  
	  //segunda linha
	  nova.m10 = this.m10 * outra.m00 + this.m11 * outra.m10;
	  nova.m11 = this.m10 * outra.m01 + this.m11 * outra.m11;
	  
	  return nova;
	}
	
	//Método que retorna uma cópia da matriz atual transposta;
	public Mat2 getTransposta(){
	  Mat2 nova = new Mat2();
	  nova.m00 = this.m00;
	  nova.m01 = this.m10;
	  
	  nova.m10 = this.m01;
	  nova.m11 = this.m11;
	  
	  return nova;
	}
	
	//Método que simplesmente retorna uma nova cópia da matriz atual.
	public Mat2 getCopia(){
	  Mat2 nova = new Mat2();
	  nova.m00 = this.m00;
	  nova.m01 = this.m01;
	  
	  nova.m10 = this.m10;
	  nova.m11 = this.m11;
 
	  return nova;       
	  
	}
	
	//Método que retorna uma matriz do tipo float de dimensões 2x2, esta com os valores dos atributos de classe desta matriz.
	public float[][] getMatriz(){
	  float m[][] = new float[3][3];
	  m[0][0] = this.m00;
	  m[0][1] = this.m01;
	  
	  m[1][0] = this.m10;
	  m[1][1] = this.m11;

	  return m;
	}
	
	/*Método de translação, que recebe por parâmetro os valores de translação tx e ty, 
        e então aplica a uma cópia da matriz uma translação de (tx,ty), e então retorna a nova matriz transladada.*/
        public Mat2 translacao(float tx, float ty){
            Mat2 nova = getCopia();
            Mat2 translacao = new Mat2();
            translacao.m01 = tx;
            translacao.m11 = ty;

            Mat2 resultado = translacao.multiplicaMatriz(nova);
            return resultado;
        }
        
        /*Método de rotação, que recebe por parâmetro o valor referente ao ângulo de rotação, 
        e então aplica a uma cópia da matriz uma matriz tal rotação, e então retorna a nova matriz rotacionada.*/
        public Mat2 escala(float sx, float sy){
            Mat2 nova = getCopia();
            Mat2 escala = new Mat2();
            escala.m00 = sx;
            escala.m11 = sy;

            Mat2 resultado = escala.multiplicaMatriz(nova);
            return resultado;
        }
        
        /*Método de escala, que recebe por parâmetro os fatores de escala sx e sy, 
        e então aplica a uma cópia da matriz uma escala de sx em x e sy em y, e então retorna a nova matriz escalada.*/
        public Mat2 rotacao(float angulo){
            Mat2 nova = getCopia();
            Mat2 rotacao = new Mat2();
            rotacao.m00 = (float) Math.cos(Math.toRadians(angulo));
            rotacao.m01 = (float) - Math.sin(Math.toRadians(angulo));
            rotacao.m10 = (float) Math.sin(Math.toRadians(angulo));
            rotacao.m11 = (float) Math.cos(Math.toRadians(angulo));

            Mat2 resultado = rotacao.multiplicaMatriz(nova);
            return resultado;
        }
}