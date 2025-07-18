package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vfz extends vuc implements vvk {
    public static final vfz a;
    private static volatile vvq j;
    public Object c;
    public int d;
    public int e;
    public int f;
    public int g;
    public long i;
    public int b = 0;
    public vun h = vvt.a;

    static {
        vfz vfzVar = new vfz();
        a = vfzVar;
        vuc.y(vfz.class, vfzVar);
    }

    private vfz() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0000\b\u0001\u0000\u0001\b\b\u0000\u0001\u0000\u0001\u0004\u0002\u0004\u0003<\u0000\u0004<\u0000\u0005\u0004\u0006\u0004\u0007Ț\b\u0002", new Object[]{"c", "b", "d", "e", vfy.class, vtl.class, "f", "g", "h", "i"});
        }
        if (i2 == 3) {
            return new vfz();
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
        vvq vvqVar = j;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (vfz.class) {
            vtxVar = j;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                j = vtxVar;
            }
        }
        return vtxVar;
    }
}
