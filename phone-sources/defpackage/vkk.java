package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vkk extends vuc implements vvk {
    public static final vkk a;
    private static volatile vvq f;
    public int b;
    public int c;
    public viq d;
    public String e = "";

    static {
        vkk vkkVar = new vkk();
        a = vkkVar;
        vuc.y(vkk.class, vkkVar);
    }

    private vkk() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဈ\u0002", new Object[]{"b", "c", vid.g, "d", "e"});
        }
        if (i2 == 3) {
            return new vkk();
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
        synchronized (vkk.class) {
            vtxVar = f;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                f = vtxVar;
            }
        }
        return vtxVar;
    }
}
