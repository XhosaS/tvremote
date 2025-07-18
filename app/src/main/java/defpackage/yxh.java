package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class yxh extends yxi {
    public static final yxh a = new yxh();
    private static final long serialVersionUID = 0;

    private yxh() {
    }

    private Object readResolve() {
        return a;
    }

    @Override // defpackage.yxi
    /* renamed from: a */
    public final int compareTo(yxi yxiVar) {
        return yxiVar == this ? 0 : -1;
    }

    @Override // defpackage.yxi, java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return compareTo((yxi) obj);
    }

    public final int hashCode() {
        return System.identityHashCode(this);
    }

    public final String toString() {
        return "-∞";
    }
}
