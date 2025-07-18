package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zbv extends zca implements Serializable {
    public static final zbv a = new zbv();
    private static final long serialVersionUID = 0;

    private zbv() {
    }

    private Object readResolve() {
        return a;
    }

    @Override // defpackage.zca, java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        comparable2.getClass();
        return comparable.compareTo(comparable2);
    }

    public final String toString() {
        return "Ordering.natural()";
    }
}
