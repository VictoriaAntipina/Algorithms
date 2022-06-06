public class OddIndices {

    //Написать алгоритм OddIndices, который принимает массив чисел,  и возвращает массив значений нечетных индексов
    //(вернуть значения которые стоят на нечетных индексах)
    //Test Data:
    //Input = {-45, 590, 234, 985, 12, 68}
    //Expected Result =  {590, 985, 68}

    public int[] OddIndicesAlgorithm(int[] array){

        if (array.length != 0){
            int count = 0; //счетчик считает сколько нечетных индексов есть в масиве
            for (int i = 0; i < array.length; i++){
                if (i % 2 != 0){
                    count++;
                }
            }
            int[] array1 = new int[count]; // масив уже с нечетными индексами
            int j = 0;
            for (int i = 0; i < array.length; i++){ // идем по старому масиву
                if (i % 2 != 0){ //каждый индекс проверяем на нечетность
                    array1[j] = array[i]; // то что в нечетных индексах мы кладем в array1[j]
                    j++; // array1[0] = array[1]
                         // array1[1] = array[3]
                         // array1[2] = array[5]
                }
            }

            return array1;
        }

        return new int[]{};
    }






}
