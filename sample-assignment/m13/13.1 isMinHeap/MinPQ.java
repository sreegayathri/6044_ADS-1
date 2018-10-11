/**.
 * Class for Minimum PQ.
 *
 * @param      <Key>  The key
 */
public class MinPQ <Key extends Comparable <Key>> {
    /**.
     * pq array of key type
     */
    private Key[] pq;
    /**.
     * { var_description }
     */
    private int n;
    /**.
     * Constructs the object for class MinPQ
     *
     * @param      array  The array
     */
    MinPQ(final Key[] array) {
        this.n = array.length - 1;
        this.pq = array;
    }
    /**
     * Checks if the array is min heap or not
     * TIme complexityis N because for loop iterates for N times.
     * @return     True if minimum pq, False otherwise.
     */
    // is pq[1..N] a min heap?
    public boolean isMinPQ() {
        return isMinPQ(1);
    }

    // is subtree of pq[1..n] rooted at k a min heap?
    public boolean isMinPQ(int k) {
        if (k > n) return true;
        int left = 2*k;
        int right = 2*k + 1;
        if (left  <= n && less(left, k))  return false;
        if (right <= n && less(right, k)) return false;
        return isMinPQ(left) && isMinPQ(right);
    }

    /**
     * { compares two elements of pq array }
     *  Time complexity is constant the statement is executed only once
     * @param      i     { index of pq array }
     * @param      j     { index of pq array }
     *
     * @return     { true if the condition is satisfied else it returns false}
     */
    public boolean less(int i, int j) {
        return pq[i].compareTo(pq[j]) < 0;
    }
}