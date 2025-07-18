package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vfy extends vuc implements vvk {
    public static final vfy a;
    private static volatile vvq d;
    public int b;
    public vtl c;
    private int e;

    static {
        vfy vfyVar = new vfy();
        a = vfyVar;
        vuc.y(vfy.class, vfyVar);
    }

    private vfy() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0002ဉ\u0000", new Object[]{"e", "b", "c"});
        }
        if (i2 == 3) {
            return new vfy();
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
        vvq vvqVar = d;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (vfy.class) {
            vtxVar = d;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                d = vtxVar;
            }
        }
        return vtxVar;
    }
}
