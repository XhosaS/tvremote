package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aot extends clt implements cna {
    public static final aot a;
    private static volatile cng c;
    public cme b = cnj.a;

    static {
        aot aotVar = new aot();
        a = aotVar;
        clt.y(aot.class, aotVar);
    }

    private aot() {
    }

    @Override // defpackage.clt
    public final Object a(int i, Object obj) {
        cng clpVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new cnk(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"b", aor.class});
        }
        if (i2 == 3) {
            return new aot();
        }
        if (i2 == 4) {
            return new clo(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        cng cngVar = c;
        if (cngVar != null) {
            return cngVar;
        }
        synchronized (aot.class) {
            clpVar = c;
            if (clpVar == null) {
                clpVar = new clp(a);
                c = clpVar;
            }
        }
        return clpVar;
    }

    public final void b() {
        cme cmeVar = this.b;
        if (cmeVar.c()) {
            return;
        }
        this.b = clt.t(cmeVar);
    }
}
