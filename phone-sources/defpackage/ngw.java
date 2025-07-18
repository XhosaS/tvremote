package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ngw extends vuc implements vvk {
    public static final ngw a;
    private static volatile vvq h;
    public int b;
    public String c = "";
    public String d = "";
    public vun e;
    public vun f;
    public boolean g;

    static {
        ngw ngwVar = new ngw();
        a = ngwVar;
        vuc.y(ngw.class, ngwVar);
    }

    private ngw() {
        vvt vvtVar = vvt.a;
        this.e = vvtVar;
        this.f = vvtVar;
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003Ț\u0004\u001b\u0005ဇ\u0002", new Object[]{"b", "c", "d", "e", "f", ngr.class, "g"});
        }
        if (i2 == 3) {
            return new ngw();
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
        synchronized (ngw.class) {
            vtxVar = h;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                h = vtxVar;
            }
        }
        return vtxVar;
    }
}
