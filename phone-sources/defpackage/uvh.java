package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uvh extends vuc implements vvk {
    public static final uvh a;
    private static volatile vvq f;
    public int b;
    public long c;
    public vum d;
    public vun e;

    static {
        uvh uvhVar = new uvh();
        a = uvhVar;
        vuc.y(uvh.class, uvhVar);
    }

    private uvh() {
        vvt vvtVar = vvt.a;
        this.d = vuz.a;
        this.e = vvt.a;
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0003\u0000\u0001\u0004\u0006\u0003\u0000\u0002\u0000\u0004\u001b\u0005စ\u0001\u0006\u0017", new Object[]{"b", "e", uvg.class, "c", "d"});
        }
        if (i2 == 3) {
            return new uvh();
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
        vvq vvqVar = f;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (uvh.class) {
            vtxVar = f;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                f = vtxVar;
            }
        }
        return vtxVar;
    }
}
