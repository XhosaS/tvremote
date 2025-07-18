package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class laq extends vuc implements vvk {
    public static final laq a;
    private static volatile vvq l;
    public int b;
    public lar c;
    public String d = "";
    public lcr e;
    public lcr f;
    public float g;
    public vun h;
    public vun i;
    public int j;
    public vun k;

    static {
        laq laqVar = new laq();
        a = laqVar;
        vuc.y(laq.class, laqVar);
    }

    private laq() {
        vvt vvtVar = vvt.a;
        this.h = vvtVar;
        this.i = vvtVar;
        this.k = vvtVar;
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\t\u0000\u0001\u0001\t\t\u0000\u0003\u0000\u0001ဉ\u0000\u0002Ȉ\u0003ဉ\u0001\u0004\u001b\u0005\u001b\u0006\f\u0007\u001b\bဉ\u0002\t\u0001", new Object[]{"b", "c", "d", "e", "h", kzk.class, "i", laa.class, "j", "k", lbt.class, "f", "g"});
        }
        if (i2 == 3) {
            return new laq();
        }
        if (i2 == 4) {
            return new vtw(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        vvq vvqVar = l;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (laq.class) {
            vtxVar = l;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                l = vtxVar;
            }
        }
        return vtxVar;
    }
}
