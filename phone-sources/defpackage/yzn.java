package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yzn extends vuc implements vvk {
    public static final yzn a;
    private static volatile vvq h;
    public int b;
    public yzm c;
    public zag d;
    public int e;
    public yzl f;
    public String g = "";

    static {
        yzn yznVar = new yzn();
        a = yznVar;
        vuc.y(yzn.class, yznVar);
    }

    private yzn() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003᠌\u0002\u0004ဉ\u0003\u0005ဈ\u0004", new Object[]{"b", "c", "d", "e", yyv.d, "f", "g"});
        }
        if (i2 == 3) {
            return new yzn();
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
        synchronized (yzn.class) {
            vtxVar = h;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                h = vtxVar;
            }
        }
        return vtxVar;
    }
}
