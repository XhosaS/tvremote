package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lbe extends vuc implements vvk {
    public static final lbe a;
    private static volatile vvq l;
    public int b;
    public kzu c;
    public String d = "";
    public String e = "";
    public kzh f;
    public lcr g;
    public lcc h;
    public lak i;
    public lco j;
    public lbd k;

    static {
        lbe lbeVar = new lbe();
        a = lbeVar;
        vuc.y(lbe.class, lbeVar);
    }

    private lbe() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\t\u0000\u0001\u0001\n\t\u0000\u0000\u0000\u0001ဉ\u0000\u0002Ȉ\u0004ဉ\u0002\u0005ဉ\u0003\u0006ဉ\u0004\u0007ဉ\u0005\bȈ\tဉ\u0001\nဉ\u0006", new Object[]{"b", "c", "d", "g", "h", "i", "j", "e", "f", "k"});
        }
        if (i2 == 3) {
            return new lbe();
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
        vvq vvqVar = l;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (lbe.class) {
            vtxVar = l;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                l = vtxVar;
            }
        }
        return vtxVar;
    }
}
