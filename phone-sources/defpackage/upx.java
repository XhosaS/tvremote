package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class upx extends vuc implements vvk {
    public static final upx a;
    public static final vvd e;
    private static volatile vvq f;
    public int b;
    public long c;
    public vun d = vvt.a;

    static {
        upx upxVar = new upx();
        a = upxVar;
        vuc.y(upx.class, upxVar);
        e = vuc.C(wdy.a, upxVar, upxVar, 182135729, vwo.MESSAGE);
    }

    private upx() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဂ\u0000\u0002\u001a", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new upx();
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
        synchronized (upx.class) {
            vtxVar = f;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                f = vtxVar;
            }
        }
        return vtxVar;
    }
}
