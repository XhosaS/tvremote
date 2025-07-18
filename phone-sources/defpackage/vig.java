package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vig extends vuc implements vvk {
    public static final vig a;
    private static volatile vvq d;
    public int b = 0;
    public Object c;

    static {
        vig vigVar = new vig();
        a = vigVar;
        vuc.y(vig.class, vigVar);
    }

    private vig() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u00017\u0000\u0002<\u0000", new Object[]{"c", "b", vif.class});
        }
        if (i2 == 3) {
            return new vig();
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
        synchronized (vig.class) {
            vtxVar = d;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                d = vtxVar;
            }
        }
        return vtxVar;
    }
}
