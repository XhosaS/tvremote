package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wcj extends vuc implements vvk {
    public static final wcj a;
    private static volatile vvq f;
    public int b;
    public val c;
    public vdq d;
    public String e = "";

    static {
        wcj wcjVar = new wcj();
        a = wcjVar;
        vuc.y(wcj.class, wcjVar);
    }

    private wcj() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003Ȉ", new Object[]{"b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new wcj();
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
        synchronized (wcj.class) {
            vtxVar = f;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                f = vtxVar;
            }
        }
        return vtxVar;
    }
}
