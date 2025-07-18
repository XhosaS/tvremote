package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class aagn extends vuc implements vvk {
    public static final aagn a;
    private static volatile vvq e;
    public int b;
    public ual c;
    public boolean d;

    static {
        aagn aagnVar = new aagn();
        a = aagnVar;
        vuc.y(aagn.class, aagnVar);
    }

    private aagn() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0003ဇ\u0002", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new aagn();
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
        synchronized (aagn.class) {
            vtxVar = e;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                e = vtxVar;
            }
        }
        return vtxVar;
    }
}
