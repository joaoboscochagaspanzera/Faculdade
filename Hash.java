
public class Hash {
   int tabela[];
   int m1, m2, m, reserva;
   final int NULO = -1;

   public Hash() {
      this(13, 7);
   }

   public Hash(int m1, int m2) {
      this.m1 = m1;
      this.m2 = m2;
      this.m = m1 + m2;
      this.tabela = new int[this.m];
      for (int i = 0; i < m1; i++) {
         tabela[i] = NULO;
      }
      reserva = 0;
   }

   public int h(int elemento) {
      return elemento % m1;
   }

   public boolean inserir(int elemento) {
      boolean resp = false;
      if (elemento != NULO) {
         int pos = h(elemento);
         if (tabela[pos] == NULO) {
            tabela[pos] = elemento;
            resp = true;
         } else if (reserva < m2) {
            tabela[m1 + reserva] = elemento;
            reserva++;
            resp = true;
         }
      }
      return resp;
   }

   public boolean pesquisar(int elemento) {
      boolean resp = false;
      int pos = h(elemento);
      if (tabela[pos] == elemento) {
         resp = true;
      } else if (tabela[pos] != NULO) {
         for (int i = 0; i < reserva; i++) {
            if (tabela[m1 + i] == elemento) {
               resp = true;
               i = reserva;
            }
         }
      }
      return resp;
   }

   public boolean remover(int elemento) {
      boolean resp = false;
      int pos = h(elemento);
      if(tabela[pos] != NULO){
          if(elemento == tabela[pos]){
              tabela[pos] = NULO;
              resp = true;
          }else if(elemento != tabela[pos]){
              for(int i = 0; i < reserva; i++){
                  if(tabela[m1 + i] == elemento){
                      tabela[m1 + i] = tabela[m1 + (reserva-1)];
                      i = reserva;
                      reserva--;
                      resp = true;
                  }
              }
          }
      }
      return resp;
   }

   tabela T1;
   tabela T3;
   arvore a3;
   lista l2;
   arvore a2;
      
   public int rehash(int elemento){
       return ++x % tamTabela;
   }

   public boolean inserir(int elemento){
      boolean resp = true;
      if(pesquisar(elemento)){
          resp = false;
      }else if (elemento != NULO) {
         int pos = h(elemento);
         if (T1[pos] == NULO) {
            T1[pos] = elemento;
            resp = true;
         } else if (pos % 3 == 0) {
            if (T3[pos] == NULO) {
                T3[pos] = elemento;
                resp = true;
            } else if(T3[rehash(x)] == NULO){
                T3[rehash(x)] = elemento;
            }else if{
                a3.inserir(x);
            }else if(pos % 3 == 1){
                l2.inserir(elemento);
            }else{
                a2.inserir(elemento);
            }
         }
      }
      return resp;
   }

   public boolean remover(int elemento) {
      boolean resp = false;
      int pos = h(elemento);
      if(tabela[pos] != NULO){
          if(elemento == tabela[pos]){
              tabela[pos] = NULO;
              resp = true;
          }else if(elemento != tabela[pos]){
              for(int i = 0; i < reserva; i++){
                  if(tabela[m1 + i] == elemento){
                      tabela[m1 + i] = tabela[m1 + (reserva-1)];
                      i = reserva;
                      reserva--;
                      resp = true;
                  }
              }
          }
      }
      return resp;
   }

   //FAZER O REMOVER

}
