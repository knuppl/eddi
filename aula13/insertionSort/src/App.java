public class App {

    public static void bubbleSort(int[] vet){
        int  n = vet.length;
        boolean trocou;
        int aux;

        for (int i = 0; i < n - 1; i++){
            trocou = false;
        
        for (int j = 0; j < n - i - 1; j++){
            if (vet[j] > vet[j+1]){
                //j = 50 j+1 = 30 aux = 30
                aux = vet[j+1];
                vet[j+1] = vet[j];
                vet[j] = aux;
                trocou = true;
            }
        }
        if (!trocou)
        break;
        }
    }
    
    public static void selectionSort(int[] vet){
        int n = vet.length;

        for(int i = 0; i < n - 1; i++){
            int minimo = i;

        for (int j = i+1; j < n; j++){
            if(vet[j] < vet[minimo]){
                minimo = j;
            }
        }
        int aux = vet[minimo];
        vet[minimo] = vet[i];
        vet[i] = aux;
        }
    }

    public static void insertionSort(int[] vet){
        int n = vet.length;

        for(int i = 1; i < n; i++){
            int chave = vet[i];
            int j =  i-1;

        while (j >= 0 && vet[j] > chave){
            vet[j+1] = vet[j];
            j = j-1;
        }

        vet[j+1] = chave;
        }
    }

  
    public static void main(String[] args) throws Exception {
    
    int[] vet = {10, 23, 238, 485, 23, 212, 283, 12, 43};

    insertionSort(vet);
    
    for(int i = 0; i < vet.length; i++){
        System.out.println(vet[i]);
    }
    
    }
}
