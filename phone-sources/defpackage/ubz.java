package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ubz extends vuc implements vvk {
    public static final ubz a;
    public static final vvd e;
    private static volatile vvq f;
    public int b;
    public uca c;
    public uby d;
    private byte g = 2;

    static {
        ubz ubzVar = new ubz();
        a = ubzVar;
        vuc.y(ubz.class, ubzVar);
        e = vuc.C(ucj.a, ubzVar, ubzVar, 581, vwo.MESSAGE);
    }

    private ubz() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.g);
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဉ\u0001", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new ubz();
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
        vvq vvqVar = f;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (ubz.class) {
            vtxVar = f;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                f = vtxVar;
            }
        }
        return vtxVar;
    }
}
