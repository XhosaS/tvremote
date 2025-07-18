package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vex extends vuc implements vvk {
    public static final vex a;
    private static volatile vvq j;
    public int c;
    public int d;
    public vun f;
    public vun g;
    public vun h;
    public vun i;
    public String b = "";
    public String e = "";

    static {
        vex vexVar = new vex();
        a = vexVar;
        vuc.y(vex.class, vexVar);
    }

    private vex() {
        vvt vvtVar = vvt.a;
        this.f = vvtVar;
        this.g = vvtVar;
        this.h = vvtVar;
        this.i = vvtVar;
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0000\b\u0000\u0000\u0001\r\b\u0000\u0004\u0000\u0001Ȉ\u0002\f\u0003Ȉ\u0004\u001b\u0005\u001b\n\u001b\u000b\f\r\u001b", new Object[]{"b", "c", "e", "f", vft.class, "h", vfc.class, "g", vfc.class, "d", "i", vfc.class});
        }
        if (i2 == 3) {
            return new vex();
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
        vvq vvqVar = j;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (vex.class) {
            vtxVar = j;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                j = vtxVar;
            }
        }
        return vtxVar;
    }
}
