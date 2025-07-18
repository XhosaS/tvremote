package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wat extends vuc implements vvk {
    public static final wat a;
    private static volatile vvq e;
    public int b = 0;
    public Object c;
    public vbr d;
    private int f;

    static {
        wat watVar = new wat();
        a = watVar;
        vuc.y(wat.class, watVar);
    }

    private wat() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0000\r\u0001\u0001\u0001\u000f\r\u0000\u0000\u0000\u0001ဉ\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\t<\u0000\n<\u0000\u000b<\u0000\f<\u0000\r<\u0000\u000e<\u0000\u000f<\u0000", new Object[]{"c", "b", "f", "d", waf.class, wah.class, wax.class, waw.class, wav.class, wai.class, wap.class, was.class, war.class, waq.class, wan.class, wam.class});
        }
        if (i2 == 3) {
            return new wat();
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
        synchronized (wat.class) {
            vtxVar = e;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                e = vtxVar;
            }
        }
        return vtxVar;
    }
}
