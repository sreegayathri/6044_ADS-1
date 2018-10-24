/**.
 * Class for binary search tree.
 */
class BinarySearchTree {
    /**.
     * Class for node.
     */
    class Node {
        /**.
         * key.
         */
        private Book key;
        /**.
         * value.
         */
        private Integer value;
        /**.
         * left.
         */
        private Node left;
        /**.
         * right.
         */
        private Node right;
        /**.
         * Constructs the object.
         *
         * @param      key     { parameter_description }
         * @param      value     { parameter_description }
         */
        Node(final Book key, final Integer value) {
            this.key = key;
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }
    /**.
     * root.
     */
    private Node root;
    /**.
     * Constructs the object.
     */
    BinarySearchTree() {
        root = null;
    }
    /**.
     * put.
     *
     * @param      key    The key
     * @param      value  The value
     */
    public void put(final Book key, final Integer value) {
        root = put(root, key, value);
    }
    /**.
     * putmethod.
     *
     * @param      x      { parameter_description }
     * @param      key    The key
     * @param      value  The value
     *
     * @return     { description_of_the_return_value }
     */
    private Node put(final Node x, final Book key, final Integer value) {
        if (x == null) {
            return new Node(key, value);
        }
        int cmp = key.compareTo(x.key);
        if (cmp < 0) {
            x.left = put(x.left, key, value);
        } else if (cmp > 0) {
            x.right = put(x.right, key, value);
        } else {
            x.value = value;
        }
        return x;
    }
    /**.
     * get method.
     *
     * @param      key   The key
     *
     * @return     { description_of_the_return_value }
     */
    public Integer get(final Book key) {
        return get(root, key);
    }
    /**
     * getmethod.
     *
     * @param      x     { parameter_description }
     * @param      key   The key
     *
     * @return     { description_of_the_return_value }
     */
    private Integer get(final Node x, final Book key) {
        if (x == null) {
            return null;
        }
        int cmp = key.compareTo(x.key);
        if (cmp < 0) {
            return get(x.left, key);
        } else if (cmp > 0) {
            return get(x.right, key);
        }
        return x.value;
    }
}