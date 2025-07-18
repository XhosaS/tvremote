package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wuz extends vuc implements vvk {
    public static final wuz a;
    public static final vvd c;
    private static volatile vvq d;
    public String b = "";
    private int e;

    static {
        wuz wuzVar = new wuz();
        a = wuzVar;
        vuc.y(wuz.class, wuzVar);
        c = vuc.C(wkx.a, wuzVar, wuzVar, 525000005, vwo.MESSAGE);
    }

    private wuz() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"e", "b"});
        }
        if (i2 == 3) {
            return new wuz();
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
        synchronized (wuz.class) {
            vtxVar = d;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                d = vtxVar;
            }
        }
        return vtxVar;
    }
}
