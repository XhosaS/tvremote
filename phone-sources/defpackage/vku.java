package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vku extends vuc implements vvk {
    public static final vku a;
    private static volatile vvq h;
    public int b;
    public String c = "";
    public vmc d;
    public vlq e;
    public vmk f;
    public vma g;

    static {
        vku vkuVar = new vku();
        a = vkuVar;
        vuc.y(vku.class, vkuVar);
    }

    private vku() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0003ဉ\u0002\u0004ဉ\u0003\u0006ဉ\u0001\u0007ဉ\u0004", new Object[]{"b", "c", "e", "f", "d", "g"});
        }
        if (i2 == 3) {
            return new vku();
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
        vvq vvqVar = h;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (vku.class) {
            vtxVar = h;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                h = vtxVar;
            }
        }
        return vtxVar;
    }
}
