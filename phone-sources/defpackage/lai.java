package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lai extends vuc implements vvk {
    public static final lai a;
    private static volatile vvq e;
    public vun b = vvt.a;
    public String c = "";
    public String d = "";

    static {
        lai laiVar = new lai();
        a = laiVar;
        vuc.y(lai.class, laiVar);
    }

    private lai() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002Ȉ\u0003Ȉ", new Object[]{"b", lah.class, "c", "d"});
        }
        if (i2 == 3) {
            return new lai();
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
        synchronized (lai.class) {
            vtxVar = e;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                e = vtxVar;
            }
        }
        return vtxVar;
    }
}
