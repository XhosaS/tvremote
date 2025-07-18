package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uwq extends vuc implements vvk {
    public static final uwq a;
    private static volatile vvq i;
    public int b;
    public int d;
    public uwo f;
    public uwr g;
    public uxb h;
    public String c = "";
    public String e = "";

    static {
        uwq uwqVar = new uwq();
        a = uwqVar;
        vuc.y(uwq.class, uwqVar);
    }

    private uwq() {
        vsz vszVar = vsz.b;
        vvt vvtVar = vvt.a;
    }

    @Override // defpackage.vuc
    public final Object a(int i2, Object obj) {
        vvq vtxVar;
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new vvu(a, "\u0004\u0006\u0000\u0001\u0001\u001b\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0005ဉ\t\u0012င\u0002\u0014ဉ\u001a\u0018ဈ\u0003\u001bဉ\u0018", new Object[]{"b", "c", "f", "d", "h", "e", "g"});
        }
        if (i3 == 3) {
            return new uwq();
        }
        if (i3 == 4) {
            return new vtw(a);
        }
        if (i3 == 5) {
            return a;
        }
        if (i3 != 6) {
            throw null;
        }
        vvq vvqVar = i;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (uwq.class) {
            vtxVar = i;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                i = vtxVar;
            }
        }
        return vtxVar;
    }
}
