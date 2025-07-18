package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class prs extends vuc implements vvk {
    public static final prs a;
    private static volatile vvq h;
    public String b = "";
    public String c = "";
    public String d = "";
    public String e = "";
    public String f = "";
    public String g = "";
    private int i;

    static {
        prs prsVar = new prs();
        a = prsVar;
        vuc.y(prs.class, prsVar);
    }

    private prs() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005", new Object[]{"i", "b", "c", "d", "e", "f", "g"});
        }
        if (i2 == 3) {
            return new prs();
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
        synchronized (prs.class) {
            vtxVar = h;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                h = vtxVar;
            }
        }
        return vtxVar;
    }
}
