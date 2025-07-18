package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uqb extends vuc implements vvk {
    public static final uqb a;
    private static volatile vvq c;
    public vun b = vvt.a;

    static {
        uqb uqbVar = new uqb();
        a = uqbVar;
        vuc.y(uqb.class, uqbVar);
    }

    private uqb() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"b"});
        }
        if (i2 == 3) {
            return new uqb();
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
        vvq vvqVar = c;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (uqb.class) {
            vtxVar = c;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                c = vtxVar;
            }
        }
        return vtxVar;
    }
}
