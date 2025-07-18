package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vnl extends vuc implements vvk {
    public static final vnl a;
    private static volatile vvq m;
    public int b;
    public int c = 0;
    public Object d;
    public int e;
    public weu f;
    public weu g;
    public boolean h;
    public int i;
    public vnb j;
    public vnb k;
    public vnh l;

    static {
        vnl vnlVar = new vnl();
        a = vnlVar;
        vuc.y(vnl.class, vnlVar);
    }

    private vnl() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\n\u0001\u0001\u0001\n\n\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004᠌\u0004\u0005ဉ\u0005\u0006ဉ\u0006\u0007ဉ\u0007\b<\u0000\t<\u0000\nဇ\u0003", new Object[]{"d", "c", "b", "e", vnk.a, "f", "g", "i", vnk.b, "j", "k", "l", vnj.class, vnj.class, "h"});
        }
        if (i2 == 3) {
            return new vnl();
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
        vvq vvqVar = m;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (vnl.class) {
            vtxVar = m;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                m = vtxVar;
            }
        }
        return vtxVar;
    }
}
