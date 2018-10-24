class Node {
    private int data;
    private Node link;
    Node (int data) {
        this.data = data;
        this.link = null;
    }
    public void setData(int data){
        this.data = data;
    }
    public int getData() {
        return this.data;
    }
    public Node getLink() {
        return this.link;
    }
    public void setLink(Node link){
        this.link = link;
    }

}