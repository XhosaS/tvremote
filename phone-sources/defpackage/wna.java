package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wna extends vuc implements vvk {
    public static final wna a;
    private static volatile vvq e;
    public int b;
    public String c = "";
    public int d;

    static {
        wna wnaVar = new wna();
        a = wnaVar;
        vuc.y(wna.class, wnaVar);
    }

    private wna() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0003\u0000\u0000\u0002\u0004\u0003\u0000\u0000\u0000\u0002\f\u0003Ȉ\u0004\f", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new wna();
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
        vvq vvqVar = e;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (wna.class) {
            vtxVar = e;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                e = vtxVar;
            }
        }
        return vtxVar;
    }
}
