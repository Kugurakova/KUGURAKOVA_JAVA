public class ArrayList{
	final int MAX_SIZE = 10;
	int lines[];
	int count;

    public ArrayList() {
        this.lines = new int[MAX_SIZE];
        this.count = 0;
    }

    void add(int line) {
        this.lines[count] = line;
        this.count++;
    }
	
	void addToBegin(int element){// добавление в начало
		int pold;
		int pnew = element;
		insert(element, 0);
//		for (int i = 0; i <= count; i++) {
//			pold = this.lines[i];
//			this.lines[i] =pnew;
//			pnew = pold; 
//		}
//		count++;
	}

	int get(int index){ // получить элемент по индексу
		return this.lines[index];
	}

	void insert(int element, int index){ // вставить по индексу со сдвигом
		int pold;
		int pnew = element;
		for (int i = index; i <= count; i++) {
			pold = this.lines[i];
			this.lines[i] =pnew;
			pnew = pold; 
		}
		count++;
	}

	void reverse() {
		int position = count;
		int per;
		for (int i = 0; i*2 < count ; i++) {
			per = this.lines[i];
			this.lines[i]=this.lines[position-1];
			this.lines[position-1]=per;
			position=position-1;		
		}
	}
	int getCount(){
		return count;
	}
	void sort(){
		int position=0;
		int mn=this.lines[0];
		int per;
		for (int j = 0; j < count; j++) {
			mn=this.lines[j];
			for (int i = j; i < count; i++) {
				if (this.lines[i] <= mn) { mn = this.lines[i]; position = i ;
				}
 			}
 			per = this.lines[j];
 			this.lines[j]= this.lines[position];
 			this.lines[position] = per;
		}
	}
	
	boolean contains(int element){ // возвращает true, если список содержит заданный элемент
		if (indexOf(element) == -1) {return false;}
		else {return true;}
	}

	int indexOf(int element) { // возвращает индекс элемента, если он есть в списке, -1 - если не нашел ничего
		int result=-1;
		int left = 0;
		int right = this.lines[count-1];
		int middle = left + (right - left) / 2 ;
		while ((result == -1) && (left < middle) && (right > middle)) {
			if (this.lines[left] == element) {result=left;}
			if (this.lines[middle] == element) {result=middle;}
			if (this.lines[right] == element) {result=right;}
			if (this.lines[middle] < element) {
				left = middle;
			} 
			if (this.lines[middle] > element) {
				right = middle;
			} 			
			middle = left + (right - left) / 2 ;
		}
		return result;
	}
	void print() {
        for (int i = 0; i < count; i++) {
            System.out.println(this.lines[i]);
        }
    }	
}