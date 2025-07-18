package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tjc extends vuc implements vvk {
    public static final tjc a;
    private static volatile vvq f;
    public int b;
    public vun c;
    public vun d;
    public int e;
    private byte g = 2;

    static {
        tjc tjcVar = new tjc();
        a = tjcVar;
        vuc.y(tjc.class, tjcVar);
    }

    private tjc() {
        vvt vvtVar = vvt.a;
        this.c = vvtVar;
        this.d = vvtVar;
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.g);
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0002\u0001Л\u0002Л\u0003᠌\u0000", new Object[]{"b", "c", tjb.class, "d", tjb.class, "e", kzn.l});
        }
        if (i2 == 3) {
            return new tjc();
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
        synchronized (tjc.class) {
            vtxVar = f;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                f = vtxVar;
            }
        }
        return vtxVar;
    }
}
