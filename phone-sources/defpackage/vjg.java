package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vjg extends vuc implements vvk {
    public static final vjg a;
    private static volatile vvq e;
    public int b;
    public String c = "";
    public vun d = vvt.a;

    static {
        vjg vjgVar = new vjg();
        a = vjgVar;
        vuc.y(vjg.class, vjgVar);
    }

    private vjg() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"b", "c", "d", viu.class});
        }
        if (i2 == 3) {
            return new vjg();
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
        synchronized (vjg.class) {
            vtxVar = e;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                e = vtxVar;
            }
        }
        return vtxVar;
    }
}
