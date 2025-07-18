package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yrr implements yri {
    public Object a = yrx.p;
    public yof b;
    final /* synthetic */ yrv c;

    public yrr(yrv yrvVar) {
        this.c = yrvVar;
    }

    @Override // defpackage.yri
    public final void A(ywp ywpVar, int i) {
        yof yofVar = this.b;
        if (yofVar != null) {
            yofVar.A(ywpVar, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f8 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.yih r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 333
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yrr.a(yih):java.lang.Object");
    }

    public final Object b() throws Throwable {
        Object obj = this.a;
        yxo yxoVar = yrx.p;
        if (obj == yxoVar) {
            throw new IllegalStateException("`hasNext()` has not been invoked");
        }
        this.a = yxoVar;
        if (obj != yrx.l) {
            return obj;
        }
        throw yxn.b(this.c.p());
    }
}
