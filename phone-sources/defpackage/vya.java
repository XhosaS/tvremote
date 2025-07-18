package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vya extends vuc implements vvk {
    public static final vya a;
    private static volatile vvq h;
    public vbi c;
    public int e;
    public int f;
    public int g;
    private int i;
    public String b = "";
    public String d = "";

    static {
        vya vyaVar = new vya();
        a = vyaVar;
        vuc.y(vya.class, vyaVar);
    }

    private vya() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003Ȉ\u0004\u0004\u0005\u0004\u0006\f", new Object[]{"i", "b", "c", "d", "e", "f", "g"});
        }
        if (i2 == 3) {
            return new vya();
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
        synchronized (vya.class) {
            vtxVar = h;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                h = vtxVar;
            }
        }
        return vtxVar;
    }
}
