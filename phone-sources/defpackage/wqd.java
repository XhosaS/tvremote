package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wqd extends vuc implements vvk {
    public static final wqd a;
    public static final vvd d;
    private static volatile vvq e;
    public int b;
    public String c = "";

    static {
        wqd wqdVar = new wqd();
        a = wqdVar;
        vuc.y(wqd.class, wqdVar);
        d = vuc.C(wkg.a, wqdVar, wqdVar, 356574909, vwo.MESSAGE);
    }

    private wqd() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new wqd();
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
        synchronized (wqd.class) {
            vtxVar = e;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                e = vtxVar;
            }
        }
        return vtxVar;
    }
}
