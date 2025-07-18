package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uax extends vtz implements vua {
    public static final uax a;
    private static volatile vvq h;
    public int b;
    public uaz c;
    public int d;
    public uaz e;
    public long f;
    public boolean g;
    private byte i = 2;

    static {
        uax uaxVar = new uax();
        a = uaxVar;
        vuc.y(uax.class, uaxVar);
    }

    private uax() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.i);
        }
        if (i2 == 2) {
            return new vvu(a, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0002\u0001ᐉ\u0000\u0002᠌\u0001\u0003ᐉ\u0002\u0004ဂ\u0004\u0006ဇ\u0005", new Object[]{"b", "c", "d", kzn.u, "e", "f", "g"});
        }
        if (i2 == 3) {
            return new uax();
        }
        if (i2 == 4) {
            return new vty(a);
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
        synchronized (uax.class) {
            vtxVar = h;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                h = vtxVar;
            }
        }
        return vtxVar;
    }
}
