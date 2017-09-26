package Matriz;

import Vetor.Vet4;

public class Mat4 {
	
	//Atributos de classe do tipo float para cada posição da matriz: m00, m01, m10, m11;
	public float m00, m01, m02, m03, 
              m10, m11, m12, m13,
              m20, m21, m22, m23,
              m30, m31, m32, m33;

	//Método que define os valores da matriz de modo que ela se torne uma matriz identidade;
	public void setIdentidade(){
	  this.m00 = 1; this.m01 = 0; this.m02 = 0; this.m03 = 0;
	  this.m10 = 0; this.m11 = 1; this.m12 = 0; this.m13 = 0;
	  this.m20 = 0; this.m21 = 0; this.m22 = 1; this.m23 = 0;
	  this.m30 = 0; this.m31 = 0; this.m32 = 0; this.m33 = 1;
	}
	
	//Método construtor padrão, sem parâmetros, que invoca o método acima, tornando a mesma uma matriz identidade.
	public Mat4(){
	  setIdentidade();
	}
	
	//Método construtor que recebe dois parâmetros do tipo vet2, e estes são atribuídos as colunas da matriz;
	public Mat4(Vet4 col0, Vet4 col1, Vet4 col2, Vet4 col3){
	  this.m00 = col0.x; this.m01 = col1.x; this.m02 = col2.x; this.m03 = col3.x;
	  this.m10 = col0.y; this.m11 = col1.y; this.m12 = col2.y; this.m13 = col3.y;
	  this.m20 = col0.z; this.m21 = col1.z; this.m22 = col2.z; this.m23 = col3.x;
	  this.m30 = col0.z; this.m31 = col1.z; this.m32 = col2.z; this.m33 = col3.y;
	}
	
	/*Métodos para adição de outra mat2. Estes métodos deverão receber por parâmetro uma outra mat2 que deverá ser somada 
	a uma cópia da matriz atual e a matriz resultante da operação deve ser retornada.*/
	public Mat4 adiciona(Mat4 outra){
	  Mat4 nova = new Mat4();
	  nova.m00 = this.m00 + outra.m00;
	  nova.m01 = this.m01 + outra.m01;
	  nova.m02 = this.m02 + outra.m02;
	  nova.m03 = this.m03 + outra.m03;
	  nova.m10 = this.m10 + outra.m10;
	  nova.m11 = this.m11 + outra.m11;
	  nova.m12 = this.m12 + outra.m12;
	  nova.m13 = this.m13 + outra.m13;
	  nova.m20 = this.m20 + outra.m20;
	  nova.m21 = this.m21 + outra.m21;
	  nova.m22 = this.m22 + outra.m22;
	  nova.m23 = this.m23 + outra.m23;
	  nova.m30 = this.m30 + outra.m30;
	  nova.m31 = this.m31 + outra.m31;
	  nova.m32 = this.m32 + outra.m32;
	  nova.m33 = this.m33 + outra.m33;
	  
	  return nova;
	}
	
	/*Métodos para subtração de outra mat2. Estes métodos deverão receber por parâmetro uma outra mat2 que deverá ser subtraida 
	a uma cópia da matriz atual e a matriz resultante da operação deve ser retornada.*/
	public Mat4 subtrai(Mat4 outra){
	  Mat4 nova = new Mat4();
	  nova.m00 = this.m00 - outra.m00;
	  nova.m01 = this.m01 - outra.m01;
	  nova.m02 = this.m02 - outra.m02;
	  nova.m03 = this.m03 - outra.m03;
	  nova.m10 = this.m10 - outra.m10;
	  nova.m11 = this.m11 - outra.m11;
	  nova.m12 = this.m12 - outra.m12;
	  nova.m13 = this.m13 - outra.m13;
	  nova.m20 = this.m20 - outra.m20;
	  nova.m21 = this.m21 - outra.m21;
	  nova.m22 = this.m22 - outra.m22;
	  nova.m23 = this.m23 - outra.m23;
	  nova.m30 = this.m30 - outra.m30;
	  nova.m31 = this.m31 - outra.m31;
	  nova.m32 = this.m32 - outra.m32;
	  nova.m33 = this.m33 - outra.m33;
	  
	  return nova;
	}
	
	//Método que retorna uma cópia da matriz com os valores multiplicados por um escalar recebido por parâmetro;
	public Mat4 multiplicaEscalar(float escalar){
	  Mat4 nova = new Mat4();
	  nova.m00 = this.m00 * escalar;
	  nova.m01 = this.m01 * escalar;
	  nova.m02 = this.m02 * escalar;
	  nova.m03 = this.m03 * escalar;
	  nova.m10 = this.m10 * escalar;
	  nova.m11 = this.m11 * escalar;
	  nova.m12 = this.m12 * escalar;
	  nova.m13 = this.m13 * escalar;
	  nova.m20 = this.m20 * escalar;
	  nova.m21 = this.m21 * escalar;
	  nova.m22 = this.m22 * escalar;
	  nova.m23 = this.m23 * escalar;
	  nova.m30 = this.m30 * escalar;
	  nova.m31 = this.m31 * escalar;
	  nova.m32 = this.m32 * escalar;
	  nova.m33 = this.m33 * escalar;
	  
	  return nova;
	}
	
	//Método que retorna uma cópia da matriz com os valores divididos por um escalar recebido por parâmetro;
	public Mat4 divideEscalar(float escalar){
	  Mat4 nova = multiplicaEscalar(1/escalar);
	  return nova;
	}
	
	//Método para multiplicação/produto da matriz por um vet2, este recebido por parâmetro, cujo retorno é um novo vet2 com o resultado da multiplicação;
	public Vet4 multiplicaVetor(Vet4 vetor){
	  Vet4 novo = new Vet4();
	  novo.x = this.m00 * vetor.x + this.m01 * vetor.y + this.m02 * vetor.z + this.m03 * vetor.w;
	  novo.y = this.m10 * vetor.x + this.m11 * vetor.y + this.m12 * vetor.z + this.m13 * vetor.w;
	  novo.z = this.m20 * vetor.x + this.m21 * vetor.y + this.m22 * vetor.z + this.m23 * vetor.w;
	  novo.w = this.m30 * vetor.x + this.m31 * vetor.y + this.m32 * vetor.z + this.m33 * vetor.w;
	  
	  return novo;
	}
	
	//Método para multiplicação/produto da matriz por outra matriz mat2, esta recebida por parâmetro, cujo retorno é uma nova mat2 com o resultado da multiplicação;
	public Mat4 multiplicaMatriz(Mat4 outra){
	  Mat4 nova = new Mat4();
	  //Primeira Linha
	  nova.m00 = this.m00 * outra.m00 + this.m01 * outra.m10 + this.m02 * outra.m20 + this.m03 * outra.m30;
	  nova.m01 = this.m00 * outra.m01 + this.m01 * outra.m11 + this.m02 * outra.m21 + this.m03 * outra.m31;
	  nova.m02 = this.m00 * outra.m02 + this.m01 * outra.m12 + this.m02 * outra.m22 + this.m03 * outra.m32;
	  nova.m03 = this.m00 * outra.m03 + this.m01 * outra.m13 + this.m02 * outra.m23 + this.m03 * outra.m33;
	  
	  //Segunda Linha
	  nova.m10 = this.m10 * outra.m00 + this.m11 * outra.m10 + this.m12 * outra.m20 + this.m03 * outra.m30;
	  nova.m11 = this.m10 * outra.m01 + this.m11 * outra.m11 + this.m12 * outra.m21 + this.m03 * outra.m31;
	  nova.m12 = this.m10 * outra.m02 + this.m11 * outra.m12 + this.m12 * outra.m22 + this.m03 * outra.m32;
	  nova.m13 = this.m10 * outra.m03 + this.m11 * outra.m13 + this.m12 * outra.m23 + this.m03 * outra.m33;
	  
	  //Terceira Linha
	  nova.m20 = this.m20 * outra.m00 + this.m21 * outra.m10 + this.m22 * outra.m20 + this.m03 * outra.m30;
	  nova.m21 = this.m20 * outra.m01 + this.m21 * outra.m11 + this.m22 * outra.m21 + this.m03 * outra.m31;
	  nova.m22 = this.m20 * outra.m02 + this.m21 * outra.m12 + this.m22 * outra.m22 + this.m03 * outra.m32;
	  nova.m23 = this.m20 * outra.m03 + this.m21 * outra.m13 + this.m22 * outra.m23 + this.m03 * outra.m33;
	  
	  //Quarta Linha
	  nova.m30 = this.m30 * outra.m00 + this.m31 * outra.m10 + this.m32 * outra.m20 + this.m03 * outra.m30;
	  nova.m31 = this.m30 * outra.m01 + this.m31 * outra.m11 + this.m32 * outra.m21 + this.m03 * outra.m31;
	  nova.m32 = this.m30 * outra.m02 + this.m31 * outra.m12 + this.m32 * outra.m22 + this.m03 * outra.m32;
	  nova.m33 = this.m30 * outra.m03 + this.m31 * outra.m13 + this.m32 * outra.m23 + this.m03 * outra.m33;
	  
	  return nova;
	}
	
	//Método que retorna uma cópia da matriz atual transposta;
	public Mat4 getTransposta(){
	  Mat4 nova = new Mat4();
	  nova.m00 = this.m00;
	  nova.m01 = this.m10;
	  nova.m02 = this.m20;
	  nova.m03 = this.m30;
	  
	  nova.m10 = this.m01;
	  nova.m11 = this.m11;
	  nova.m12 = this.m21;
	  nova.m13 = this.m31;
	  
	  nova.m20 = this.m02;
	  nova.m21 = this.m12;
	  nova.m22 = this.m22;
	  nova.m23 = this.m32;
	  
	  nova.m30 = this.m03;
	  nova.m31 = this.m13;
	  nova.m32 = this.m23;
	  nova.m33 = this.m33;
	  
	  return nova;
	}
	
	//Método que simplesmente retorna uma nova cópia da matriz atual.
	public Mat4 getCopia(){
	  Mat4 nova = new Mat4();
	  nova.m00 = this.m00;
	  nova.m01 = this.m01;
	  nova.m02 = this.m02;
	  nova.m03 = this.m03;
	  
	  nova.m10 = this.m10;
	  nova.m11 = this.m11;
	  nova.m12 = this.m12;
	  nova.m13 = this.m13;
	  
	  nova.m20 = this.m20;
	  nova.m21 = this.m21;
	  nova.m22 = this.m22;
	  nova.m23 = this.m23;
	  
	  nova.m30 = this.m30;
	  nova.m31 = this.m31;
	  nova.m32 = this.m32;
	  nova.m33 = this.m33;
	  
	  return nova;
	}
	
	//Método que retorna uma matriz do tipo float de dimensões 2x2, esta com os valores dos atributos de classe desta matriz.
	public float[][] getMatriz(){
	  float m[][] = new float[3][3];
	  m[0][0] = this.m00;
	  m[0][1] = this.m01;
	  m[0][2] = this.m02;
	  m[0][3] = this.m03;
	  
	  m[1][0] = this.m10;
	  m[1][1] = this.m11;
	  m[1][2] = this.m12;
	  m[1][2] = this.m13;
	  
	  m[2][0] = this.m20;
	  m[2][1] = this.m21;
	  m[2][2] = this.m22;
	  m[2][3] = this.m23;
	  
	  m[3][0] = this.m30;
	  m[3][1] = this.m31;
	  m[3][2] = this.m32;
	  m[3][3] = this.m33;
	  
	  return m;
	}
        
	/*Método de translação, que recebe por parâmetro os valores de translação 
        tx, ty e tz, e então aplica a uma cópia da matriz uma translação de (tx,ty,tz), retornando a mesma.*/
        public Mat4 translacao(float tx, float ty, float tz){
            Mat4 nova = getCopia();
            Mat4 escala = new Mat4();
            escala.m03 = tx;
            escala.m13 = ty;
            escala.m23 = tz;

            Mat4 resultado = escala.multiplicaMatriz(nova);
            return resultado;
        }
        
        /*Método de rotação no eixo X, que recebe por parâmetro 
        o valor referente ao ângulo de rotação, e então aplica a uma cópia da matriz tal rotação no eixo x, retornando a mesma.*/
        public Mat4 rotacaoX(float angulo){
            Mat4 nova = getCopia();
            Mat4 rotacaoX = new Mat4();
            rotacaoX.m11 = (float) Math.cos(Math.toRadians(angulo));
            rotacaoX.m12 = (float) - Math.sin(Math.toRadians(angulo));
            rotacaoX.m21 = (float) Math.sin(Math.toRadians(angulo));
            rotacaoX.m22 = (float) Math.cos(Math.toRadians(angulo));

            Mat4 resultado = rotacaoX.multiplicaMatriz(nova);
            return resultado;
        }       
        
        /*Método de rotação no eixo Y, que recebe por parâmetro o valor referente ao ângulo de rotação, 
        e então aplica a uma cópia da matriz tal rotação no eixo y, retornando a mesma.*/
        public Mat4 rotacaoY(float angulo){
            Mat4 nova = getCopia();
            Mat4 rotacaoY = new Mat4();
            rotacaoY.m00 = (float) Math.cos(Math.toRadians(angulo));
            rotacaoY.m02 = (float) Math.sin(Math.toRadians(angulo));
            rotacaoY.m20 = (float) - Math.sin(Math.toRadians(angulo));
            rotacaoY.m22 = (float) Math.cos(Math.toRadians(angulo));

            Mat4 resultado = rotacaoY.multiplicaMatriz(nova);
            return resultado;
        } 
        
        /*Método de rotação no eixo Z, que recebe por parâmetro o valor referente ao ângulo de rotação, 
        e então aplica a uma cópia da matriz tal rotação no eixo z, retornando a mesma.*/
        public Mat4 rotacaoZ(float angulo){
            Mat4 nova = getCopia();
            Mat4 rotacaoZ = new Mat4();
            rotacaoZ.m00 = (float) Math.cos(Math.toRadians(angulo));
            rotacaoZ.m01 = (float) - Math.sin(Math.toRadians(angulo));
            rotacaoZ.m10 = (float) Math.sin(Math.toRadians(angulo));
            rotacaoZ.m11 = (float) Math.cos(Math.toRadians(angulo));

            Mat4 resultado = rotacaoZ.multiplicaMatriz(nova);
            return resultado;
        } 
        
        /*Método de escala, que recebe por parâmetro os fatores de escala sx, sy e sz, 
        e então aplica a uma cópia da matriz uma escala de sx em x, sy em y e sz em z, retornando a mesma.*/
        public Mat4 escala(float sx, float sy, float sz){
            Mat4 nova = getCopia();
            Mat4 escala = new Mat4();
            escala.m00 = sx;
            escala.m11 = sy;
            escala.m22 = sz;

            Mat4 resultado = escala.multiplicaMatriz(nova);
            return resultado;
        }
        
        public Mat4 projecao(float fov, float aspect, float far, float near) {
            Mat4 projecao = new Mat4();
            
            projecao.m00 = (float) ((float) 1 / (Math.tan(Math.toRadians(fov / 2)) ) * aspect);
            projecao.m11 = (float) ((float) 1 / (Math.tan(Math.toRadians(fov / 2))));
            projecao.m22 = (float) ((far + near) / (near - far));
            projecao.m23 = (float) ((2 * far * near) / (near - far));
            projecao.m32 = -1;
            projecao.m33 = 0;
            
            return projecao;
        }
}
