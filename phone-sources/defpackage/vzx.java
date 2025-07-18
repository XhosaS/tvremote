package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vzx extends vuc implements vvk {
    public static final vzx a;
    private static volatile vvq c;
    public vun b = vvt.a;

    static {
        vzx vzxVar = new vzx();
        a = vzxVar;
        vuc.y(vzx.class, vzxVar);
    }

    private vzx() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"b", val.class});
        }
        if (i2 == 3) {
            return new vzx();
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
        synchronized (vzx.class) {
            vtxVar = c;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                c = vtxVar;
            }
        }
        return vtxVar;
    }
}
