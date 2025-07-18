package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wzh extends vuc implements vvk {
    public static final wzh a;
    private static volatile vvq f;
    public int b;
    public String c = "";
    public vun d = vvt.a;
    public boolean e;

    static {
        wzh wzhVar = new wzh();
        a = wzhVar;
        vuc.y(wzh.class, wzhVar);
    }

    private wzh() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002\u001b\u0003ဇ\u0000", new Object[]{"b", "c", "d", wnl.class, "e"});
        }
        if (i2 == 3) {
            return new wzh();
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
        vvq vvqVar = f;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (wzh.class) {
            vtxVar = f;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                f = vtxVar;
            }
        }
        return vtxVar;
    }
}
