package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wtn extends vuc implements vvk {
    public static final wtn a;
    private static volatile vvq c;
    private int d;
    private wkg e;
    private byte f = 2;
    public String b = "";

    static {
        wtn wtnVar = new wtn();
        a = wtnVar;
        vuc.y(wtn.class, wtnVar);
    }

    private wtn() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f);
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ဈ\u0000\u0002ᐉ\u0001", new Object[]{"d", "b", "e"});
        }
        if (i2 == 3) {
            return new wtn();
        }
        if (i2 == 4) {
            return new vtw(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.f = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        vvq vvqVar = c;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (wtn.class) {
            vtxVar = c;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                c = vtxVar;
            }
        }
        return vtxVar;
    }
}
