package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wlc extends vuc implements vvk {
    public static final wlc a;
    private static volatile vvq e;
    public vun b;
    public vun c;
    public String d;

    static {
        wlc wlcVar = new wlc();
        a = wlcVar;
        vuc.y(wlc.class, wlcVar);
    }

    private wlc() {
        vvt vvtVar = vvt.a;
        this.b = vvtVar;
        this.c = vvtVar;
        this.d = "";
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0002\u0000\u0001\u001b\u0002\u001b\u0003Ȉ", new Object[]{"b", wkl.class, "c", wnw.class, "d"});
        }
        if (i2 == 3) {
            return new wlc();
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
        synchronized (wlc.class) {
            vtxVar = e;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                e = vtxVar;
            }
        }
        return vtxVar;
    }
}
