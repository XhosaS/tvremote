package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kpu extends vuc implements vvk {
    public static final kpu a;
    private static volatile vvq e;
    public boolean c;
    public String b = "";
    public vun d = vvt.a;

    static {
        kpu kpuVar = new kpu();
        a = kpuVar;
        vuc.y(kpu.class, kpuVar);
    }

    private kpu() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002\u0007\u0003\u001b", new Object[]{"b", "c", "d", wni.class});
        }
        if (i2 == 3) {
            return new kpu();
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
        synchronized (kpu.class) {
            vtxVar = e;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                e = vtxVar;
            }
        }
        return vtxVar;
    }
}
