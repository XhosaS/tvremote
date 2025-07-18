package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zbd extends vuc implements vvk {
    public static final zbd a;
    private static volatile vvq b;
    private int c;
    private boolean d;
    private byte e = 2;

    static {
        zbd zbdVar = new zbd();
        a = zbdVar;
        vuc.y(zbd.class, zbdVar);
    }

    private zbd() {
        vvt vvtVar = vvt.a;
    }

    public static /* synthetic */ void c(zbd zbdVar) {
        zbdVar.c |= 2;
        zbdVar.d = true;
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.e);
        }
        if (i2 == 2) {
            return new vvu(a, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0000\u0003ဇ\u0001", new Object[]{"c", "d"});
        }
        if (i2 == 3) {
            return new zbd();
        }
        if (i2 == 4) {
            return new vtw(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.e = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        vvq vvqVar = b;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (zbd.class) {
            vtxVar = b;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                b = vtxVar;
            }
        }
        return vtxVar;
    }
}
