package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vki extends vuc implements vvk {
    public static final vki a;
    private static volatile vvq h;
    public int b;
    public String c = "";
    public String d = "";
    public String e = "";
    public vkh f;
    public vsl g;

    static {
        vki vkiVar = new vki();
        a = vkiVar;
        vuc.y(vki.class, vkiVar);
    }

    private vki() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0005\u0000\u0001\u0001\u001e\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0003ဉ\u0005\u0004ဈ\u0003\u0005ဈ\u0002\u001eဉ\u0006", new Object[]{"b", "c", "f", "e", "d", "g"});
        }
        if (i2 == 3) {
            return new vki();
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
        synchronized (vki.class) {
            vtxVar = h;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                h = vtxVar;
            }
        }
        return vtxVar;
    }
}
