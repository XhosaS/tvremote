package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class xzv {
    public final xru a;
    public xqk b;
    public boolean c = false;
    public xql d = xql.a(xqk.IDLE);

    public xzv(xru xruVar, xqk xqkVar) {
        this.a = xruVar;
        this.b = xqkVar;
    }

    public final xqk a() {
        return this.d.a;
    }

    public final void b(xqk xqkVar) {
        boolean z;
        this.b = xqkVar;
        if (xqkVar == xqk.READY || xqkVar == xqk.TRANSIENT_FAILURE) {
            z = true;
        } else if (xqkVar != xqk.IDLE) {
            return;
        } else {
            z = false;
        }
        this.c = z;
    }
}
