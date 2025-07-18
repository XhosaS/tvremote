package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class woc extends vuc implements vvk {
    public static final woc a;
    private static volatile vvq e;
    public float b;
    public int c;
    public String d = "";

    static {
        woc wocVar = new woc();
        a = wocVar;
        vuc.y(woc.class, wocVar);
    }

    private woc() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0001\u0002\f\u0003Ȉ", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new woc();
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
        synchronized (woc.class) {
            vtxVar = e;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                e = vtxVar;
            }
        }
        return vtxVar;
    }
}
