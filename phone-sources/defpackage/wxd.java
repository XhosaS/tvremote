package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wxd extends vuc implements vvk {
    public static final wxd a;
    private static volatile vvq e;
    public Object c;
    public vtl d;
    private int f;
    public int b = 0;
    private byte g = 2;

    static {
        wxd wxdVar = new wxd();
        a = wxdVar;
        vuc.y(wxd.class, wxdVar);
    }

    private wxd() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.g);
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0002\u0001\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001м\u0000\u0002ဉ\u0000", new Object[]{"c", "b", "f", wox.class, "d"});
        }
        if (i2 == 3) {
            return new wxd();
        }
        if (i2 == 4) {
            return new vtw(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.g = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        vvq vvqVar = e;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (wxd.class) {
            vtxVar = e;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                e = vtxVar;
            }
        }
        return vtxVar;
    }
}
