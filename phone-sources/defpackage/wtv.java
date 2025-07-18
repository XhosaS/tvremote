package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wtv extends vuc implements vvk {
    public static final wtv a;
    public static final vvd g;
    private static volatile vvq h;
    public int b;
    public wlx c;
    public wls d;
    public wkg e;
    public boolean f;
    private byte i = 2;

    static {
        wtv wtvVar = new wtv();
        a = wtvVar;
        vuc.y(wtv.class, wtvVar);
        g = vuc.C(wkx.a, wtvVar, wtvVar, 350861672, vwo.MESSAGE);
    }

    private wtv() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.i);
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0001\u0001ဉ\u0000\u0002ဉ\u0001\u0003ᐉ\u0002\u0005ဇ\u0004", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (i2 == 3) {
            return new wtv();
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
        vvq vvqVar = h;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (wtv.class) {
            vtxVar = h;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                h = vtxVar;
            }
        }
        return vtxVar;
    }
}
