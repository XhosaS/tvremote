package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vks extends vuc implements vvk {
    public static final vks a;
    private static volatile vvq k;
    public int b;
    public Object d;
    public Object f;
    public vmo i;
    public vsl j;
    public int c = 0;
    public int e = 0;
    public String g = "";
    public String h = "";

    static {
        vks vksVar = new vks();
        a = vksVar;
        vuc.y(vks.class, vksVar);
    }

    private vks() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\t\u0002\u0001\u0002\n\t\u0000\u0000\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004;\u0000\u0005ဉ\u0003\u0006ဉ\u0004\u0007\u083f\u0000\b;\u0001\t<\u0001\n<\u0001", new Object[]{"d", "c", "f", "e", "b", "g", "h", "i", "j", vid.r, viu.class, vtl.class});
        }
        if (i2 == 3) {
            return new vks();
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
        synchronized (vks.class) {
            vtxVar = k;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                k = vtxVar;
            }
        }
        return vtxVar;
    }
}
