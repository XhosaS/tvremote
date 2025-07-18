package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vnf extends vuc implements vvk {
    public static final vnf a;
    private static volatile vvq l;
    public int b;
    public int c = 0;
    public Object d;
    public weu e;
    public boolean f;
    public int g;
    public vnb h;
    public vnb i;
    public int j;
    public int k;

    static {
        vnf vnfVar = new vnf();
        a = vnfVar;
        vuc.y(vnf.class, vnfVar);
    }

    private vnf() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u000b\u0001\u0001\u0001\u000f\u000b\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဇ\u0001\u0003<\u0000\u0004;\u0000\u0006᠌\u0002\u0007ဉ\u0003\bဉ\u0004\t᠌\u0005\n᠌\u0006\u000e<\u0000\u000f<\u0000", new Object[]{"d", "c", "b", "e", "f", vob.class, "g", vlj.s, "h", "i", "j", vlj.r, "k", vlj.t, voe.class, vnt.class});
        }
        if (i2 == 3) {
            return new vnf();
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
        synchronized (vnf.class) {
            vtxVar = l;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                l = vtxVar;
            }
        }
        return vtxVar;
    }
}
