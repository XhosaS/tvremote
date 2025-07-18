package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class laf extends vuc implements vvk {
    public static final laf a;
    private static volatile vvq f;
    public String b = "";
    public vun c;
    public vuj d;
    public vun e;

    static {
        laf lafVar = new laf();
        a = lafVar;
        vuc.y(laf.class, lafVar);
    }

    private laf() {
        vvt vvtVar = vvt.a;
        this.c = vvtVar;
        this.d = vud.a;
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
            return new vvu(a, "\u0004\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0003\u0000\u0001Ȉ\u0002Ț\u0003'\u0004\u001b", new Object[]{"b", "c", "d", "e", lad.class});
        }
        if (i2 == 3) {
            return new laf();
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
        synchronized (laf.class) {
            vtxVar = f;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                f = vtxVar;
            }
        }
        return vtxVar;
    }
}
