class StockAnalysis {
	String comapany;
	float percent;
/*	int queries;*/
	StockAnalysis(String comapany, float percent) {
		this.comapany = comapany;
		float percent = 0.0f;
	}
    String getcompany() {
    	return this.comapany
    }
	float getperecent() {
        return this.percent;
    }
    /**
     * compare.
     *
     * @param      that  The that
     *
     * @return     { description_of_the_return_value }
     */
    int compareTo(final Book that) {
        if (this.percent.compareTo(that.percent) > 0) {
            return 1;
        } else if (this.percent.compareTo(that.percent) < 0) {
            return -1;
        }
        if (this.comapany.compareTo(that.comapany) > 0) {
            return 1;
        } else if (this.comapany.compareTo(that.comapany) < 0) {
            return -1;
        } else {
        	return 0;
        }
    }
}
class Stock {
    StockAnalysis[] sc;
    int size;
    int H = 100;

    Stock() {
        sc = new StockAnalysis[H];
        size = 0;
    }
    void addToList(StockAnalysis stock) {
        sc[size++] = stock;
    }
    int getsize() {
        return size;
    }
    public String toString(){
        String str = "";
        for (int i = 0; i < size; i++) {
            str += this.comapany + " " + this.percent + "\n";
        }
        return str;
    }
}