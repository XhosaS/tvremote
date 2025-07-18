package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wnm extends vuc implements vvk {
    public static final wnm a;
    private static volatile vvq f;
    public int c;
    public String b = "";
    public String d = "";
    public String e = "";

    static {
        wnm wnmVar = new wnm();
        a = wnmVar;
        vuc.y(wnm.class, wnmVar);
    }

    private wnm() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0004\u0000\u0000\u0001\u0005\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0004Ȉ\u0005Ȉ", new Object[]{"b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new wnm();
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
        synchronized (wnm.class) {
            vtxVar = f;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                f = vtxVar;
            }
        }
        return vtxVar;
    }
}
