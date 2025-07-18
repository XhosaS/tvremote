package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wzg extends vuc implements vvk {
    public static final wzg a;
    private static volatile vvq d;
    public int b;
    public woj c;
    private int e;

    static {
        wzg wzgVar = new wzg();
        a = wzgVar;
        vuc.y(wzg.class, wzgVar);
    }

    private wzg() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002ဉ\u0000", new Object[]{"e", "b", "c"});
        }
        if (i2 == 3) {
            return new wzg();
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
        synchronized (wzg.class) {
            vtxVar = d;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                d = vtxVar;
            }
        }
        return vtxVar;
    }
}
