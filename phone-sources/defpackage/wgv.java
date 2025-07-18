package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wgv extends vuc implements vvk {
    public static final wgv a;
    private static volatile vvq h;
    public int b;
    public Object d;
    public long e;
    public long f;
    public wgr g;
    public int c = 0;
    private byte i = 2;

    static {
        wgv wgvVar = new wgv();
        a = wgvVar;
        vuc.y(wgv.class, wgvVar);
    }

    private wgv() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.i);
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\b\u0001\u0001\u0001\b\b\u0000\u0000\u0006\u0001ဂ\u0000\u0002ဂ\u0001\u0003м\u0000\u0004м\u0000\u0005м\u0000\u0006м\u0000\u0007ᐉ\u0002\bм\u0000", new Object[]{"d", "c", "b", "e", "f", wgs.class, wgj.class, wgl.class, wgq.class, "g", wgu.class});
        }
        if (i2 == 3) {
            return new wgv();
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
        synchronized (wgv.class) {
            vtxVar = h;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                h = vtxVar;
            }
        }
        return vtxVar;
    }
}
