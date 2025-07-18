package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vcd extends vuc implements vvk {
    public static final vcd a;
    private static volatile vvq l;
    public int b;
    public int c;
    public String d = "";
    public String e = "";
    public String f = "";
    public String g = "";
    public vun h = vvt.a;
    public vcc i;
    public int j;
    public int k;

    static {
        vcd vcdVar = new vcd();
        a = vcdVar;
        vuc.y(vcd.class, vcdVar);
    }

    private vcd() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0000\t\u0000\u0001\u0001\t\t\u0000\u0001\u0000\u0001\f\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006\u001b\u0007ဉ\u0000\b\f\t\f", new Object[]{"b", "c", "d", "e", "f", "g", "h", vcb.class, "i", "j", "k"});
        }
        if (i2 == 3) {
            return new vcd();
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
        vvq vvqVar = l;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (vcd.class) {
            vtxVar = l;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                l = vtxVar;
            }
        }
        return vtxVar;
    }
}
