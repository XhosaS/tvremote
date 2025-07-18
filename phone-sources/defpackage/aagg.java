package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class aagg extends vuc implements vvk {
    public static final aagg a;
    private static volatile vvq i;
    public int b;
    public int c;
    public int d;
    public wer e;
    public String f = "";
    public long g;
    public int h;

    static {
        aagg aaggVar = new aagg();
        a = aaggVar;
        vuc.y(aagg.class, aaggVar);
    }

    private aagg() {
    }

    @Override // defpackage.vuc
    public final Object a(int i2, Object obj) {
        vvq vtxVar;
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new vvu(a, "\u0004\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0002\u0003ဈ\u0003\u0004ဂ\u0004\u0005᠌\u0001\u0007᠌\u0005", new Object[]{"b", "c", kzn.i, "e", "f", "g", "d", kzn.j, "h", aagk.b});
        }
        if (i3 == 3) {
            return new aagg();
        }
        if (i3 == 4) {
            return new vtw(a);
        }
        if (i3 == 5) {
            return a;
        }
        if (i3 != 6) {
            throw null;
        }
        vvq vvqVar = i;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (aagg.class) {
            vtxVar = i;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                i = vtxVar;
            }
        }
        return vtxVar;
    }
}
