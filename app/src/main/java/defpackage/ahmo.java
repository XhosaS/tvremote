package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahmo implements ahek {
    private final Object a;
    private final ThreadLocal b;
    private final agtd c;

    public ahmo(Object obj, ThreadLocal threadLocal) {
        this.a = obj;
        this.b = threadLocal;
        this.c = new ahmp(threadLocal);
    }

    @Override // defpackage.ahek
    public final Object a(agte agteVar) {
        ThreadLocal threadLocal = this.b;
        Object obj = this.a;
        Object obj2 = threadLocal.get();
        threadLocal.set(obj);
        return obj2;
    }

    @Override // defpackage.ahek
    public final void b(agte agteVar, Object obj) {
        this.b.set(obj);
    }

    @Override // defpackage.agte
    public final Object fold(Object obj, agvb agvbVar) {
        return agtb.a(this, obj, agvbVar);
    }

    @Override // defpackage.agtc, defpackage.agte
    public final agtc get(agtd agtdVar) {
        if (agvy.c(this.c, agtdVar)) {
            return this;
        }
        return null;
    }

    @Override // defpackage.agtc
    public final agtd getKey() {
        return this.c;
    }

    @Override // defpackage.agte
    public final agte minusKey(agtd agtdVar) {
        return agvy.c(this.c, agtdVar) ? agtf.a : this;
    }

    @Override // defpackage.agte
    public final agte plus(agte agteVar) {
        agteVar.getClass();
        return agta.a(this, agteVar);
    }

    public final String toString() {
        return "ThreadLocal(value=" + this.a + ", threadLocal = " + this.b + ")";
    }
}
