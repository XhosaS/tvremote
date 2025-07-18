package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class txq extends twu {
    private final txo a;
    private final txu b;
    private final txp c;
    private final twt d;

    public txq() {
        txo txoVar = (txo) p(txo.class, "flogger.backend_factory");
        this.a = txoVar == null ? txr.a : txoVar;
        txu txuVar = (txu) p(txu.class, "flogger.logging_context");
        this.b = txuVar == null ? txw.a : txuVar;
        txp txpVar = (txp) p(txp.class, "flogger.clock");
        this.c = txpVar == null ? txt.a : txpVar;
        this.d = txs.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00bb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.Object p(java.lang.Class r17, java.lang.String r18) throws java.lang.ClassNotFoundException {
        /*
            Method dump skipped, instructions count: 251
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.txq.p(java.lang.Class, java.lang.String):java.lang.Object");
    }

    @Override // defpackage.twu
    protected final long c() {
        return this.c.a();
    }

    @Override // defpackage.twu
    protected final tvw e(String str) {
        return this.a.a(str);
    }

    @Override // defpackage.twu
    protected final twt h() {
        return this.d;
    }

    @Override // defpackage.twu
    protected final txu j() {
        return this.b;
    }

    @Override // defpackage.twu
    protected final String m() {
        return "Platform: " + getClass().getName() + "\nBackendFactory: " + this.a.toString() + "\nClock: " + this.c.toString() + "\nContextDataProvider: " + String.valueOf(this.b) + "\nLogCallerFinder: Default stack-based caller finder\n";
    }
}
