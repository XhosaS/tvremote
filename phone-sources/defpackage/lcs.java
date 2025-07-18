package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lcs extends vuc implements vvk {
    public static final lcs a;
    private static volatile vvq k;
    public int b;
    public String c = "";
    public vun d;
    public vun e;
    public vun f;
    public lba g;
    public boolean h;
    public lcq i;
    public int j;

    static {
        lcs lcsVar = new lcs();
        a = lcsVar;
        vuc.y(lcs.class, lcsVar);
    }

    private lcs() {
        vvt vvtVar = vvt.a;
        this.d = vvtVar;
        this.e = vvtVar;
        this.f = vvtVar;
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\b\u0000\u0001\u0001\r\b\u0000\u0003\u0000\u0001Ȉ\u0002\u001b\u0004\u001b\u0006\u001b\tဉ\u0000\n\u0007\u000bဉ\u0001\r\u0004", new Object[]{"b", "c", "d", laf.class, "e", lab.class, "f", laz.class, "g", "h", "i", "j"});
        }
        if (i2 == 3) {
            return new lcs();
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
        vvq vvqVar = k;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (lcs.class) {
            vtxVar = k;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                k = vtxVar;
            }
        }
        return vtxVar;
    }
}
