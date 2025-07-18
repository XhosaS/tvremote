package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wwr extends vuc implements vvk {
    public static final wwr a;
    private static volatile vvq g;
    public int b;
    public wom c;
    public wyw e;
    private byte h = 2;
    public vun d = vvt.a;
    public String f = "";

    static {
        wwr wwrVar = new wwr();
        a = wwrVar;
        vuc.y(wwr.class, wwrVar);
    }

    private wwr() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.h);
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0002\u0001ᐉ\u0000\u0002\u001b\u0003ᐉ\u0001\u0004Ȉ", new Object[]{"b", "c", "d", wlm.class, "e", "f"});
        }
        if (i2 == 3) {
            return new wwr();
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
        vvq vvqVar = g;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (wwr.class) {
            vtxVar = g;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                g = vtxVar;
            }
        }
        return vtxVar;
    }
}
