package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class zhq extends zgr {
    private final zho a;
    private final zhw b;
    private final zhp c;
    private final zgq d;

    public zhq() {
        zho zhoVar = (zho) p(zho.class, "flogger.backend_factory");
        this.a = zhoVar == null ? zhr.a : zhoVar;
        zhw zhwVar = (zhw) p(zhw.class, "flogger.logging_context");
        this.b = zhwVar == null ? zhy.a : zhwVar;
        zhp zhpVar = (zhp) p(zhp.class, "flogger.clock");
        this.c = zhpVar == null ? zhv.a : zhpVar;
        this.d = zhu.a;
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zhq.p(java.lang.Class, java.lang.String):java.lang.Object");
    }

    @Override // defpackage.zgr
    protected final long c() {
        return this.c.a();
    }

    @Override // defpackage.zgr
    protected final zft e(String str) {
        return this.a.a(str);
    }

    @Override // defpackage.zgr
    protected final zgq h() {
        return this.d;
    }

    @Override // defpackage.zgr
    protected final zhw j() {
        return this.b;
    }

    @Override // defpackage.zgr
    protected final String m() {
        return "Platform: " + getClass().getName() + "\nBackendFactory: " + this.a.toString() + "\nClock: " + this.c.toString() + "\nContextDataProvider: " + String.valueOf(this.b) + "\nLogCallerFinder: Default stack-based caller finder\n";
    }
}
