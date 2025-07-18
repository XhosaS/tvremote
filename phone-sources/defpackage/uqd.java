package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uqd extends vuc implements vvk {
    public static final uqd a;
    private static volatile vvq f;
    public int b;
    public Object d;
    public int c = 0;
    public String e = "";

    static {
        uqd uqdVar = new uqd();
        a = uqdVar;
        vuc.y(uqd.class, uqdVar);
    }

    private uqd() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"d", "c", "b", "e", uqb.class, uqc.class});
        }
        if (i2 == 3) {
            return new uqd();
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
        synchronized (uqd.class) {
            vtxVar = f;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                f = vtxVar;
            }
        }
        return vtxVar;
    }
}
