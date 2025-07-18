package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agtf implements Serializable, agte {
    public static final agtf a = new agtf();
    private static final long serialVersionUID = 0;

    private agtf() {
    }

    private final Object readResolve() {
        return a;
    }

    @Override // defpackage.agte
    public final agtc get(agtd agtdVar) {
        agtdVar.getClass();
        return null;
    }

    public final int hashCode() {
        return 0;
    }

    @Override // defpackage.agte
    public final agte minusKey(agtd agtdVar) {
        agtdVar.getClass();
        return this;
    }

    @Override // defpackage.agte
    public final agte plus(agte agteVar) {
        agteVar.getClass();
        return agteVar;
    }

    public final String toString() {
        return "EmptyCoroutineContext";
    }

    @Override // defpackage.agte
    public final Object fold(Object obj, agvb agvbVar) {
        return obj;
    }
}
