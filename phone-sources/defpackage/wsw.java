package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wsw extends vuc implements vvk {
    public static final wsw a;
    public static final vvd e;
    private static volatile vvq f;
    public int b;
    public wod c;
    public String d = "";

    static {
        wsw wswVar = new wsw();
        a = wswVar;
        vuc.y(wsw.class, wswVar);
        e = vuc.C(wkx.a, wswVar, wswVar, 525000000, vwo.MESSAGE);
    }

    private wsw() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new wsw();
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
        synchronized (wsw.class) {
            vtxVar = f;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                f = vtxVar;
            }
        }
        return vtxVar;
    }
}
