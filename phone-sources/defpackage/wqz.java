package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wqz extends vuc implements vvk {
    public static final wqz a;
    private static volatile vvq d;
    public vun b = vvt.a;
    public String c = "";
    private int e;

    static {
        wqz wqzVar = new wqz();
        a = wqzVar;
        vuc.y(wqz.class, wqzVar);
    }

    private wqz() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ለ\u0000", new Object[]{"e", "b", wqy.class, "c"});
        }
        if (i2 == 3) {
            return new wqz();
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
        vvq vvqVar = d;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (wqz.class) {
            vtxVar = d;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                d = vtxVar;
            }
        }
        return vtxVar;
    }
}
