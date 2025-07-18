package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wig extends vuc implements vvk {
    public static final wig a;
    private static volatile vvq h;
    public int b;
    public int c;
    public boolean e;
    public int f;
    public String d = "";
    public String g = "";

    static {
        wig wigVar = new wig();
        a = wigVar;
        vuc.y(wig.class, wigVar);
    }

    private wig() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004င\u0003\u0005ဈ\u0004", new Object[]{"b", "c", wia.c, "d", "e", "f", "g"});
        }
        if (i2 == 3) {
            return new wig();
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
        vvq vvqVar = h;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (wig.class) {
            vtxVar = h;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                h = vtxVar;
            }
        }
        return vtxVar;
    }
}
