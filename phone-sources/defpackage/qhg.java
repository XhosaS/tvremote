package defpackage;

import javax.net.ssl.SSLContext;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qhg implements qgt {
    private final SSLContext a;
    private final uhs b;

    public qhg(SSLContext sSLContext, uhs uhsVar) {
        this.a = sSLContext;
        this.b = uhsVar;
    }

    @Override // defpackage.qgt
    public final qgx a(qgw qgwVar) {
        return d(qgwVar);
    }

    @Override // defpackage.qgt
    public final uhp b(qgw qgwVar) {
        return this.b.submit(new grz(this, qgwVar, 12));
    }

    @Override // defpackage.qgt
    public final String c() {
        return "url";
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.qgx d(defpackage.qgw r7) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 264
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qhg.d(qgw):qgx");
    }
}
