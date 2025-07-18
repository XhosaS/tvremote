package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wub extends vuc implements vvk {
    public static final wub a;
    public static final vvd e;
    private static volatile vvq f;
    public int b;
    public wol c;
    public wok d;

    static {
        wub wubVar = new wub();
        a = wubVar;
        vuc.y(wub.class, wubVar);
        e = vuc.C(wkx.a, wubVar, wubVar, 402912161, vwo.MESSAGE);
    }

    private wub() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new wub();
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
        synchronized (wub.class) {
            vtxVar = f;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                f = vtxVar;
            }
        }
        return vtxVar;
    }
}
