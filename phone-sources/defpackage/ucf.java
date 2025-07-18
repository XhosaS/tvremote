package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ucf extends vuc implements vvk {
    public static final ucf a;
    public static final vvd f;
    private static volatile vvq g;
    public int b;
    public ucd c;
    public uce d;
    public ucb e;

    static {
        ucf ucfVar = new ucf();
        a = ucfVar;
        vuc.y(ucf.class, ucfVar);
        f = vuc.C(ucj.a, ucfVar, ucfVar, 571, vwo.MESSAGE);
    }

    private ucf() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0003\u0000\u0001\u0002\u0007\u0003\u0000\u0000\u0000\u0002ဉ\u0001\u0004ဉ\u0003\u0007ဉ\u0006", new Object[]{"b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new ucf();
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
        vvq vvqVar = g;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (ucf.class) {
            vtxVar = g;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                g = vtxVar;
            }
        }
        return vtxVar;
    }
}
