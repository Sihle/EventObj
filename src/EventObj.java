public class EventObj {
    @Override
    public boolean equals(Object obj) {
        return obj.getClass() == this.getClass();
    }
}
