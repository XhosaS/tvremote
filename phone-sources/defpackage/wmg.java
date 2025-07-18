package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wmg extends vuc implements vvk {
    public static final wmg a;
    private static volatile vvq g;
    public wkx c;
    public wlk d;
    public wmz e;
    private int h;
    private byte i = 2;
    public String b = "";
    public String f = "";

    static {
        wmg wmgVar = new wmg();
        a = wmgVar;
        vuc.y(wmg.class, wmgVar);
    }

    private wmg() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.i);
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0000\u0001\u0001Ȉ\u0002ᐉ\u0000\u0004ဉ\u0001\u0006ဉ\u0002\u0007Ȉ", new Object[]{"h", "b", "c", "d", "e", "f"});
        }
        if (i2 == 3) {
            return new wmg();
        }
        if (i2 == 4) {
            return new vtw(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.i = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        vvq vvqVar = g;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (wmg.class) {
            vtxVar = g;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                g = vtxVar;
            }
        }
        return vtxVar;
    }
}
