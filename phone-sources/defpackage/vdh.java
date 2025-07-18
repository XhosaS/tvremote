package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vdh extends vuc implements vvk {
    public static final vdh a;
    private static volatile vvq j;
    public int b;
    public int c;
    public int d;
    public vwe e;
    public vwe f;
    public vwe g;
    public int h;
    public vun i = vvt.a;

    static {
        vdh vdhVar = new vdh();
        a = vdhVar;
        vuc.y(vdh.class, vdhVar);
    }

    private vdh() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001\f\u0002\f\u0003ဉ\u0000\u0004ဉ\u0001\u0005ဉ\u0002\u0006\f\u0007\u001b", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", vdf.class});
        }
        if (i2 == 3) {
            return new vdh();
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
        synchronized (vdh.class) {
            vtxVar = j;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                j = vtxVar;
            }
        }
        return vtxVar;
    }
}
