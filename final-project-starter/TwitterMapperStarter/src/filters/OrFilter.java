package filters;

import twitter4j.Status;

import java.util.List;


public class OrFilter implements Filter {
    private final Filter leftChild;
    private final Filter rightChild;

    public OrFilter(Filter leftChild, Filter rightChild)
    {
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }

    /**
     * An OR filter matches when any its children exists
     * @param s     the tweet to check
     * @return      whether or not it matches
     */
    @Override
    public boolean matches(Status s) {
        return leftChild.matches(s) || rightChild.matches(s);
    }

    @Override
    public List<String> terms() {
        return leftChild.terms();
    }

    public String toString() {
        return "(" + leftChild.toString() + " or " + rightChild.toString() + ")";
    }
}
