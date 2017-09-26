package Matriz;

import Vetor.Vet3;

public class Mat3 {
	
	//Atributos de classe do tipo float para cada posição da matriz: m00, m01, m10, m11;
	public float m00, m01, m02,
    		  m10, m11, m12,
    		  m20, m21, m22;

	//Método que define os valores da matriz de modo que ela se torne uma matriz identidade;
	public void setIdentidade(){
	  this.m00 = 1; this.m01 = 0; this.m02 = 0;
	  this.m10 = 0; this.m11 = 1; this.m12 = 0;
	  this.m20 = 0; this.m21 = 0; this.m22 = 1;
	}
	
	//Método construtor padrão, sem parâmetros, que invoca o método acima, tornando a mesma uma matriz identidade.
	public Mat3(){
	  setIdentidade();
	}
	
	//Método construtor que recebe dois parâmetros do tipo vet2, e estes são atribuídos as colunas da matriz;
	public Mat3(Vet3 col0, Vet3 col1, Vet3 col2){
	  this.m00 = col0.x; this.m01 = col1.x; this.m02 = col2.x;
	  this.m10 = col0.y; this.m11 = col1.y; this.m12 = col2.y;
	  this.m20 = col0.z; this.m21 = col1.z; this.m22 = col2.z;
	}
	
	/*Métodos para adição de outra mat2. Estes métodos deverão receber por parâmetro uma outra mat2 que deverá ser somada 
	a uma cópia da matriz atual e a matriz resultante da operação deve ser retornada.*/
	public Mat3 adiciona(Mat3 outra){
	  Mat3 nova = new Mat3();
	  nova.m00 = this.m00 + outra.m00;
	  nova.m01 = this.m01 + outra.m01;
	  nova.m02 = this.m02 + outra.m02;
	  nova.m10 = this.m10 + outra.m10;
	  nova.m11 = this.m11 + outra.m11;
	  nova.m12 = this.m12 + outra.m12;
	  nova.m20 = this.m20 + outra.m20;
	  nova.m21 = this.m21 + outra.m21;
	  nova.m22 = this.m22 + outra.m22;
	  
	  return nova;
	}
	
	/*Métodos para subtração de outra mat2. Estes métodos deverão receber por parâmetro uma outra mat2 que deverá ser subtraida 
	a uma cópia da matriz atual e a matriz resultante da operação deve ser retornada.*/
	public Mat3 subtrai(Mat3 outra){
	  Mat3 nova = new Mat3();
	  nova.m00 = this.m00 - outra.m00;
	  nova.m01 = this.m01 - outra.m01;
	  nova.m02 = this.m02 - outra.m02;
	  nova.m10 = this.m10 - outra.m10;
	  nova.m11 = this.m11 - outra.m11;
	  nova.m12 = this.m12 - outra.m12;
	  nova.m20 = this.m20 - outra.m20;
	  nova.m21 = this.m21 - outra.m21;
	  nova.m22 = this.m22 - outra.m22;
	  
	  return nova;
	}
	
	//Método que retorna uma cópia da matriz com os valores multiplicados por um escalar recebido por parâmetro;
	public Mat3 multiplicaEscalar(float escalar){
	  Mat3 nova = new Mat3();
	  nova.m00 = this.m00*escalar;
	  nova.m01 = this.m01*escalar;
	  nova.m02 = this.m02*escalar;
	  nova.m10 = this.m10*escalar;
	  nova.m11 = this.m11*escalar;
	  nova.m12 = this.m12*escalar;
	  nova.m20 = this.m20*escalar;
	  nova.m21 = this.m21*escalar;
	  nova.m22 = this.m22*escalar;
	  
	  return nova;
	}
	
	//Método que retorna uma cópia da matriz com os valores divididos por um escalar recebido por parâmetro;
	public Mat3 divideEscalar(float escalar){
	  Mat3 nova = multiplicaEscalar(1/escalar);
	  return nova;
	}
	
	//Método para multiplicação/produto da matriz por um vet2, este recebido por parâmetro, cujo retorno é um novo vet2 com o resultado da multiplicação;
	public Vet3 multiplicaVetor(Vet3 vetor){
	  Vet3 novo = new Vet3();
	  novo.x = this.m00 * vetor.x + this.m01 * vetor.y + this.m02 * vetor.z;
	  novo.y = this.m10 * vetor.x + this.m11 * vetor.y + this.m12 * vetor.z;
	  novo.z = this.m20 * vetor.x + this.m21 * vetor.y + this.m22 * vetor.z;
	  
	  return novo;
	}
	
	//Método para multiplicação/produto da matriz por outra matriz mat2, esta recebida por parâmetro, cujo retorno é uma nova mat2 com o resultado da multiplicação;
	public Mat3 multiplicaMatriz(Mat3 outra){
	  Mat3 nova = new Mat3();
	  //primeira linha
	  nova.m00 = this.m00 * outra.m00 + this.m01 * outra.m10 + this.m02 * outra.m20;
	  nova.m01 = this.m00 * outra.m01 + this.m01 * outra.m11 + this.m02 * outra.m21;
	  nova.m02 = this.m00 * outra.m02 + this.m01 * outra.m12 + this.m02 * outra.m22;
	  
	  //segunda linha
	  nova.m10 = this.m10 * outra.m00 + this.m11 * outra.m10 + this.m12 * outra.m20;
	  nova.m11 = this.m10 * outra.m01 + this.m11 * outra.m11 + this.m12 * outra.m21;
	  nova.m12 = this.m10 * outra.m02 + this.m11 * outra.m12 + this.m12 * outra.m22;
	  
	  //terceira linha
	  nova.m20 = this.m20 * outra.m00 + this.m21 * outra.m10 + this.m22 * outra.m20;
	  nova.m21 = this.m20 * outra.m01 + this.m21 * outra.m11 + this.m22 * outra.m21;
	  nova.m22 = this.m20 * outra.m02 + this.m21 * outra.m12 + this.m22 * outra.m22;
	  
	  return nova;
	}
	
	//Método que retorna uma cópia da matriz atual transposta;
	public Mat3 getTransposta(){
	  Mat3 nova = new Mat3();
	  nova.m00 = this.m00;
	  nova.m01 = this.m10;
	  nova.m02 = this.m20;
	  
	  nova.m10 = this.m01;
	  nova.m11 = this.m11;
	  nova.m12 = this.m21;
	  
	  nova.m20 = this.m02;
	  nova.m21 = this.m12;
	  nova.m22 = this.m22;
	  
	  return nova;
	}
	
	//Método que simplesmente retorna uma nova cópia da matriz atual.
	public Mat3 getCopia(){
	  Mat3 nova = new Mat3();
	  nova.m00 = this.m00;
	  nova.m01 = this.m01;
	  nova.m02 = this.m02;
	  
	  nova.m10 = this.m10;
	  nova.m11 = this.m11;
	  nova.m12 = this.m12;
	  
	  nova.m20 = this.m20;
	  nova.m21 = this.m21;
	  nova.m22 = this.m22;
	  
	  return nova;
	}
	
	//Método que retorna uma matriz do tipo float de dimensões 2x2, esta com os valores dos atributos de classe desta matriz.
	public float[][] getMatriz(){
	  float m[][] = new float[3][3];
	  m[0][0] = this.m00;
	  m[0][1] = this.m01;
	  m[0][2] = this.m02;
	  
	  m[1][0] = this.m10;
	  m[1][1] = this.m11;
	  m[1][2] = this.m12;
	  
	  m[2][0] = this.m20;
	  m[2][1] = this.m21;
	  m[2][2] = this.m22;
	  
	  return m;
	}
        
        /*Método de translação, que recebe por parâmetro os valores de translação tx e ty, 
        e então aplica a uma cópia da matriz uma translação de (tx,ty), e então retorna a nova matriz transladada.*/
        public Mat3 translacao(float tx, float ty){
            Mat3 nova = getCopia();
            Mat3 translacao = new Mat3();
            translacao.m02 = tx;
            translacao.m12 = ty;

            Mat3 resultado = translacao.multiplicaMatriz(nova);
            return resultado;
        }
        
        /*Método de rotação, que recebe por parâmetro o valor referente ao ângulo de rotação, 
        e então aplica a uma cópia da matriz uma matriz tal rotação, e então retorna a nova matriz rotacionada.*/
        public Mat3 escala(float sx, float sy){
            Mat3 nova = getCopia();
            Mat3 escala = new Mat3();
            escala.m00 = sx;
            escala.m11 = sy;

            Mat3 resultado = escala.multiplicaMatriz(nova);
            return resultado;
        }
        
        /*Método de escala, que recebe por parâmetro os fatores de escala sx e sy, 
        e então aplica a uma cópia da matriz uma escala de sx em x e sy em y, e então retorna a nova matriz escalada.*/
        public Mat3 rotacao(float angulo){
            Mat3 nova = getCopia();
            Mat3 rotacao = new Mat3();
            rotacao.m00 = (float) Math.cos(Math.toRadians(angulo));
            rotacao.m01 = (float) - Math.sin(Math.toRadians(angulo));
            rotacao.m10 = (float) Math.sin(Math.toRadians(angulo));
            rotacao.m11 = (float) Math.cos(Math.toRadians(angulo));

            Mat3 resultado = rotacao.multiplicaMatriz(nova);
            return resultado;
        }
}