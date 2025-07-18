package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ukv implements unj {
    private static final Object a = new Object();
    private volatile Object b = a;
    private volatile unj c;

    public ukv(unj unjVar) {
        this.c = unjVar;
    }

    @Override // defpackage.unj
    public final Object a() {
        Object objA;
        Object obj = this.b;
        Object obj2 = a;
        if (obj != obj2) {
            return obj;
        }
        synchronized (this) {
            objA = this.b;
            if (objA == obj2) {
                objA = this.c.a();
                this.b = objA;
                this.c = null;
            }
        }
        return objA;
    }
}
