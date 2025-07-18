package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tjb extends vuc implements vvk {
    public static final tjb a;
    private static volatile vvq e;
    public int b;
    public int c;
    public int d;
    private byte f = 2;

    static {
        tjb tjbVar = new tjb();
        a = tjbVar;
        vuc.y(tjb.class, tjbVar);
    }

    private tjb() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f);
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᴌ\u0000\u0002ᔋ\u0001", new Object[]{"b", "c", kzn.k, "d"});
        }
        if (i2 == 3) {
            return new tjb();
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
        vvq vvqVar = e;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (tjb.class) {
            vtxVar = e;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                e = vtxVar;
            }
        }
        return vtxVar;
    }
}
