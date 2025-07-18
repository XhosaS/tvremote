package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vno extends vuc implements vvk {
    public static final vno a;
    private static volatile vvq k;
    public int b;
    public int c = 0;
    public Object d;
    public weu e;
    public weu f;
    public vnb g;
    public vnb h;
    public vnn i;
    public int j;

    static {
        vno vnoVar = new vno();
        a = vnoVar;
        vuc.y(vno.class, vnoVar);
    }

    private vno() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\t\u0001\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006;\u0000\u0007;\u0000\b7\u0000\t᠌\u0005", new Object[]{"d", "c", "b", "e", "f", "g", "h", "i", "j", vnk.c});
        }
        if (i2 == 3) {
            return new vno();
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
        vvq vvqVar = k;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (vno.class) {
            vtxVar = k;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                k = vtxVar;
            }
        }
        return vtxVar;
    }
}
