package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uxn extends vuc implements vvk {
    public static final uxn a;
    private static volatile vvq f;
    public int b;
    public int c = 0;
    public Object d;
    public boolean e;

    static {
        uxn uxnVar = new uxn();
        a = uxnVar;
        vuc.y(uxn.class, uxnVar);
    }

    private uxn() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဇ\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000", new Object[]{"d", "c", "b", "e", uxt.class, uxk.class, uyj.class, uxh.class});
        }
        if (i2 == 3) {
            return new uxn();
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
        synchronized (uxn.class) {
            vtxVar = f;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                f = vtxVar;
            }
        }
        return vtxVar;
    }
}
