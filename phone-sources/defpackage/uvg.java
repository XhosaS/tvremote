package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uvg extends vuc implements vvk {
    public static final uvg a;
    private static volatile vvq e;
    public int b;
    public vun c = vvt.a;
    public uvf d;

    static {
        uvg uvgVar = new uvg();
        a = uvgVar;
        vuc.y(uvg.class, uvgVar);
    }

    private uvg() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"b", "c", uve.class, "d"});
        }
        if (i2 == 3) {
            return new uvg();
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
        vvq vvqVar = e;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (uvg.class) {
            vtxVar = e;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                e = vtxVar;
            }
        }
        return vtxVar;
    }
}
