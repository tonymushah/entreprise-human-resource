package itu.etu001844.humanresource.inputs;

public class Pagination {
    private int offset;
    private int limit;
    public int getOffset() {
        return offset;
    }
    public void setOffset(int offset) {
        this.offset = offset;
    }
    public int getLimit() {
        return limit;
    }
    public void setLimit(int limit) {
        this.limit = limit;
    }
    public Pagination() {}
    public Pagination(int offset, int limit) {
        this.setOffset(offset);
        this.setLimit(limit);
    }
}
