package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bzf extends bzi {
    public static final bzf a = new bzf();
    private static final long serialVersionUID = 0;

    private bzf() {
    }

    private Object readResolve() {
        return a;
    }

    @Override // defpackage.bzi
    /* renamed from: a */
    public final int compareTo(bzi bziVar) {
        return bziVar == this ? 0 : 1;
    }

    @Override // defpackage.bzi, java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return compareTo((bzi) obj);
    }

    public final int hashCode() {
        return System.identityHashCode(this);
    }

    public final String toString() {
        return "+∞";
    }
}
