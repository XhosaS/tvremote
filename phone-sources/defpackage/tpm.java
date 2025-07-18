package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tpm extends vuc implements vvk {
    public static final tpm a;
    private static volatile vvq c;
    public boolean b;
    private int d;

    static {
        tpm tpmVar = new tpm();
        a = tpmVar;
        vuc.y(tpm.class, tpmVar);
    }

    private tpm() {
        vvt vvtVar = vvt.a;
        vud vudVar = vud.a;
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0000\u0003ဇ\u0005", new Object[]{"d", "b"});
        }
        if (i2 == 3) {
            return new tpm();
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
        synchronized (tpm.class) {
            vtxVar = c;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                c = vtxVar;
            }
        }
        return vtxVar;
    }
}
