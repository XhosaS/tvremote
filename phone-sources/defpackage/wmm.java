package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wmm extends vuc implements vvk {
    public static final wmm a;
    private static volatile vvq f;
    public wkx c;
    public wlk d;
    public wmz e;
    private int g;
    private byte h = 2;
    public String b = "";

    static {
        wmm wmmVar = new wmm();
        a = wmmVar;
        vuc.y(wmm.class, wmmVar);
    }

    private wmm() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.h);
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0000\u0001\u0001Ȉ\u0002ᐉ\u0000\u0004ဉ\u0001\u0006ဉ\u0002", new Object[]{"g", "b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new wmm();
        }
        if (i2 == 4) {
            return new vtw(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.h = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        vvq vvqVar = f;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (wmm.class) {
            vtxVar = f;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                f = vtxVar;
            }
        }
        return vtxVar;
    }
}
