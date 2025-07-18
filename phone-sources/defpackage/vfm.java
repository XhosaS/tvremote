package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vfm extends vuc implements vvk {
    public static final vfm a;
    private static volatile vvq f;
    public String b = "";
    public vun c;
    public vfd d;
    public vun e;
    private int g;

    static {
        vfm vfmVar = new vfm();
        a = vfmVar;
        vuc.y(vfm.class, vfmVar);
    }

    private vfm() {
        vvt vvtVar = vvt.a;
        this.c = vvtVar;
        this.e = vvtVar;
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0000\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0002\u0000\u0001\u001b\u0002ဉ\u0000\u0005Ȉ\u0006\u001b", new Object[]{"g", "c", vex.class, "d", "b", "e", vfc.class});
        }
        if (i2 == 3) {
            return new vfm();
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
        synchronized (vfm.class) {
            vtxVar = f;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                f = vtxVar;
            }
        }
        return vtxVar;
    }
}
