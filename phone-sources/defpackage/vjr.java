package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vjr extends vuc implements vvk {
    public static final vjr a;
    private static volatile vvq g;
    public int b;
    public vkk c;
    public long e;
    public String d = "";
    public String f = "";

    static {
        vjr vjrVar = new vjr();
        a = vjrVar;
        vuc.y(vjr.class, vjrVar);
    }

    private vjr() {
        vvt vvtVar = vvt.a;
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0004\u0000\u0001\u0005\b\u0004\u0000\u0000\u0000\u0005ဉ\u0001\u0006ဈ\u0002\u0007ဂ\u0003\bဈ\u0004", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (i2 == 3) {
            return new vjr();
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
        vvq vvqVar = g;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (vjr.class) {
            vtxVar = g;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                g = vtxVar;
            }
        }
        return vtxVar;
    }
}
