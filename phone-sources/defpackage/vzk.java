package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vzk extends vuc implements vvk {
    public static final vzk a;
    private static volatile vvq f;
    public float b;
    public long c;
    public String d = "";
    public int e;

    static {
        vzk vzkVar = new vzk();
        a = vzkVar;
        vuc.y(vzk.class, vzkVar);
    }

    private vzk() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0001\u0002\u0003\u0003\f\u0004Ȉ", new Object[]{"b", "c", "e", "d"});
        }
        if (i2 == 3) {
            return new vzk();
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
        synchronized (vzk.class) {
            vtxVar = f;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                f = vtxVar;
            }
        }
        return vtxVar;
    }
}
