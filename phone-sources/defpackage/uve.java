package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uve extends vuc implements vvk {
    public static final uve a;
    private static volatile vvq d;
    public int b = 0;
    public Object c;

    static {
        uve uveVar = new uve();
        a = uveVar;
        vuc.y(uve.class, uveVar);
    }

    private uve() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001;\u0000\u00027\u0000\u0003:\u0000", new Object[]{"c", "b"});
        }
        if (i2 == 3) {
            return new uve();
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
        synchronized (uve.class) {
            vtxVar = d;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                d = vtxVar;
            }
        }
        return vtxVar;
    }
}
