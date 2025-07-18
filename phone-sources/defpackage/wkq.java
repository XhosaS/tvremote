package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wkq extends vuc implements vvk {
    public static final wkq a;
    private static volatile vvq h;
    public int b;
    public wky c;
    public wkh d;
    public wpo e;
    public wkm f;
    public wpj g;

    static {
        wkq wkqVar = new wkq();
        a = wkqVar;
        vuc.y(wkq.class, wkqVar);
    }

    private wkq() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0005ဉ\u0003\u0006ဉ\u0004", new Object[]{"b", "c", "d", "e", "f", "g"});
        }
        if (i2 == 3) {
            return new wkq();
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
        synchronized (wkq.class) {
            vtxVar = h;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                h = vtxVar;
            }
        }
        return vtxVar;
    }
}
