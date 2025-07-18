package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lac extends vuc implements vvk {
    public static final lac a;
    private static volatile vvq d;
    public String b = "";
    public String c = "";

    static {
        lac lacVar = new lac();
        a = lacVar;
        vuc.y(lac.class, lacVar);
    }

    private lac() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new lac();
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
        synchronized (lac.class) {
            vtxVar = d;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                d = vtxVar;
            }
        }
        return vtxVar;
    }
}
