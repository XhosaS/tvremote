package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wlp extends vuc implements vvk {
    public static final wlp a;
    private static volatile vvq e;
    public int b;
    public vtl c;
    public vun d = vvt.a;

    static {
        wlp wlpVar = new wlp();
        a = wlpVar;
        vuc.y(wlp.class, wlpVar);
    }

    private wlp() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b", new Object[]{"b", "c", "d", wkl.class});
        }
        if (i2 == 3) {
            return new wlp();
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
        synchronized (wlp.class) {
            vtxVar = e;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                e = vtxVar;
            }
        }
        return vtxVar;
    }
}
