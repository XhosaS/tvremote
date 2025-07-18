package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vzu extends vuc implements vvk {
    public static final vzu a;
    private static volatile vvq d;
    public vdo b;
    public vun c = vvt.a;
    private int e;

    static {
        vzu vzuVar = new vzu();
        a = vzuVar;
        vuc.y(vzu.class, vzuVar);
    }

    private vzu() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b", new Object[]{"e", "b", "c", vzg.class});
        }
        if (i2 == 3) {
            return new vzu();
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
        synchronized (vzu.class) {
            vtxVar = d;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                d = vtxVar;
            }
        }
        return vtxVar;
    }
}
