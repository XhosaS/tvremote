package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zbh extends vuc implements vvk {
    public static final zbh a;
    private static volatile vvq d;
    public vwe c;
    private int e;
    private byte f = 2;
    public vun b = vvt.a;

    static {
        zbh zbhVar = new zbh();
        a = zbhVar;
        vuc.y(zbh.class, zbhVar);
    }

    private zbh() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f);
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0002\u0000\u0001\u0003\u0004\u0002\u0000\u0001\u0001\u0003Л\u0004ဉ\u0001", new Object[]{"e", "b", zbg.class, "c"});
        }
        if (i2 == 3) {
            return new zbh();
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
        vvq vvqVar = d;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (zbh.class) {
            vtxVar = d;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                d = vtxVar;
            }
        }
        return vtxVar;
    }
}
