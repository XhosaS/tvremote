package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uwi extends vuc implements vvk {
    public static final uwi a;
    private static volatile vvq l;
    public int b;
    public uwm c;
    public uxo d;
    public uzf e;
    public uyr f;
    public int g;
    public uvv h;
    public vwe i;
    public uwl j;
    public long k;

    static {
        uwi uwiVar = new uwi();
        a = uwiVar;
        vuc.y(uwi.class, uwiVar);
    }

    private uwi() {
        vsz vszVar = vsz.b;
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\t\u0000\u0001\u0001\r\t\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005\u0004\bဉ\u0005\tဉ\u0006\u000bဉ\b\rဂ\t", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k"});
        }
        if (i2 == 3) {
            return new uwi();
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
        vvq vvqVar = l;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (uwi.class) {
            vtxVar = l;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                l = vtxVar;
            }
        }
        return vtxVar;
    }
}
