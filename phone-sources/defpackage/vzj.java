package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vzj extends vuc implements vvk {
    public static final vzj a;
    private static volatile vvq d;
    public float b;
    public long c;

    static {
        vzj vzjVar = new vzj();
        a = vzjVar;
        vuc.y(vzj.class, vzjVar);
    }

    private vzj() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0001\u0002\u0003", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new vzj();
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
        synchronized (vzj.class) {
            vtxVar = d;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                d = vtxVar;
            }
        }
        return vtxVar;
    }
}
