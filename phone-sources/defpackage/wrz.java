package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wrz extends vuc implements vvk {
    public static final wrz a;
    public static final vvd b;
    private static volatile vvq c;

    static {
        wrz wrzVar = new wrz();
        a = wrzVar;
        vuc.y(wrz.class, wrzVar);
        b = vuc.C(wkx.a, wrzVar, wrzVar, 442715843, vwo.MESSAGE);
    }

    private wrz() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0000", null);
        }
        if (i2 == 3) {
            return new wrz();
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
        vvq vvqVar = c;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (wrz.class) {
            vtxVar = c;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                c = vtxVar;
            }
        }
        return vtxVar;
    }
}
