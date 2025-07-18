package defpackage;

/* compiled from: PG */
@Deprecated
/* loaded from: classes2.dex */
public final class vje extends vuc implements vvk {
    public static final vje a;
    private static volatile vvq k;
    public int b;
    public vkl d;
    public long e;
    public int f;
    public vki g;
    public int h;
    public vme j;
    public String c = "";
    public vun i = vvt.a;

    static {
        vje vjeVar = new vje();
        a = vjeVar;
        vuc.y(vje.class, vjeVar);
    }

    private vje() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\b\u0000\u0001\u0001\f\b\u0000\u0001\u0000\u0001ဈ\u0000\u0005᠌\u0004\u0007ဂ\u0002\bဉ\u0001\tဉ\u0005\n\u001b\u000b᠌\u0006\fဉ\u0007", new Object[]{"b", "c", "f", vlj.i, "e", "d", "g", "i", vko.class, "h", vlj.e, "j"});
        }
        if (i2 == 3) {
            return new vje();
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
        vvq vvqVar = k;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (vje.class) {
            vtxVar = k;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                k = vtxVar;
            }
        }
        return vtxVar;
    }
}
