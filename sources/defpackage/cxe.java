package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cxe extends clt implements cna {
    public static final cxe a;
    private static volatile cng d;
    public cme b;
    public cme c;
    private byte e = 2;

    static {
        cxe cxeVar = new cxe();
        a = cxeVar;
        clt.y(cxe.class, cxeVar);
    }

    private cxe() {
        cnj cnjVar = cnj.a;
        this.b = cnjVar;
        this.c = cnjVar;
    }

    @Override // defpackage.clt
    public final Object a(int i, Object obj) {
        cng clpVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.e);
        }
        if (i2 == 2) {
            return new cnk(a, "\u0001\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0002\u0001\u0001Л\u0003\u001b", new Object[]{"b", cxd.class, "c", cxg.class});
        }
        if (i2 == 3) {
            return new cxe();
        }
        if (i2 == 4) {
            return new clo(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.e = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        cng cngVar = d;
        if (cngVar != null) {
            return cngVar;
        }
        synchronized (cxe.class) {
            clpVar = d;
            if (clpVar == null) {
                clpVar = new clp(a);
                d = clpVar;
            }
        }
        return clpVar;
    }
}
