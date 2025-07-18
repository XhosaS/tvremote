package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uam extends vuc implements vvk {
    public static final uam a;
    public static final vvd c;
    private static volatile vvq d;
    private Object e;
    public int b = 0;
    private byte f = 2;

    static {
        uam uamVar = new uam();
        a = uamVar;
        vuc.y(uam.class, uamVar);
        c = vuc.C(ucj.a, uamVar, uamVar, 772, vwo.MESSAGE);
    }

    private uam() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f);
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0002\u0001м\u0000\u0002м\u0000", new Object[]{"e", "b", ucz.class, ucy.class});
        }
        if (i2 == 3) {
            return new uam();
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
        synchronized (uam.class) {
            vtxVar = d;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                d = vtxVar;
            }
        }
        return vtxVar;
    }
}
