package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wvb extends vuc implements vvk {
    public static final wvb a;
    public static final vvd d;
    private static volatile vvq e;
    public wkg c;
    private int f;
    private byte g = 2;
    public String b = "";

    static {
        wvb wvbVar = new wvb();
        a = wvbVar;
        vuc.y(wvb.class, wvbVar);
        d = vuc.C(wkx.a, wvbVar, wvbVar, 525000018, vwo.MESSAGE);
    }

    private wvb() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.g);
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0001\u0002ለ\u0001\u0003ᐉ\u0002", new Object[]{"f", "b", "c"});
        }
        if (i2 == 3) {
            return new wvb();
        }
        if (i2 == 4) {
            return new vtw(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.g = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        vvq vvqVar = e;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (wvb.class) {
            vtxVar = e;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                e = vtxVar;
            }
        }
        return vtxVar;
    }
}
