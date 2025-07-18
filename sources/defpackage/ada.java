package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ada extends clt implements cna {
    public static final ada a;
    private static volatile cng b;

    static {
        ada adaVar = new ada();
        a = adaVar;
        clt.y(ada.class, adaVar);
    }

    private ada() {
        cnj cnjVar = cnj.a;
    }

    @Override // defpackage.clt
    public final Object a(int i, Object obj) {
        cng clpVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new cnk(a, "\u0000\u0000", null);
        }
        if (i2 == 3) {
            return new ada();
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
        cng cngVar = b;
        if (cngVar != null) {
            return cngVar;
        }
        synchronized (ada.class) {
            clpVar = b;
            if (clpVar == null) {
                clpVar = new clp(a);
                b = clpVar;
            }
        }
        return clpVar;
    }
}
