package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wag extends vuc implements vvk {
    public static final wag a;
    private static volatile vvq i;
    public String b = "";
    public String c = "";
    public vbn d;
    public vun e;
    public vun f;
    public vun g;
    public vun h;
    private int j;

    static {
        wag wagVar = new wag();
        a = wagVar;
        vuc.y(wag.class, wagVar);
    }

    private wag() {
        vvt vvtVar = vvt.a;
        this.e = vvtVar;
        this.f = vvtVar;
        this.g = vvtVar;
        this.h = vvtVar;
    }

    @Override // defpackage.vuc
    public final Object a(int i2, Object obj) {
        vvq vtxVar;
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new vvu(a, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0004\u0000\u0001Ȉ\u0002Ȉ\u0003ဉ\u0000\u0004\u001b\u0005\u001b\u0006\u001b\u0007\u001b", new Object[]{"j", "b", "c", "d", "e", vbg.class, "f", vaq.class, "g", vcb.class, "h", vzl.class});
        }
        if (i3 == 3) {
            return new wag();
        }
        if (i3 == 4) {
            return new vtw(a);
        }
        if (i3 == 5) {
            return a;
        }
        if (i3 != 6) {
            throw null;
        }
        vvq vvqVar = i;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (wag.class) {
            vtxVar = i;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                i = vtxVar;
            }
        }
        return vtxVar;
    }
}
