package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uwo extends vuc implements vvk {
    public static final uwo a;
    private static volatile vvq e;
    public int b;
    public vun c = vvt.a;
    public String d = "";

    static {
        uwo uwoVar = new uwo();
        a = uwoVar;
        vuc.y(uwo.class, uwoVar);
    }

    private uwo() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0002\u0000\u0001\u0004\u0006\u0002\u0000\u0001\u0000\u0004\u001b\u0006ဈ\u0004", new Object[]{"b", "c", uws.class, "d"});
        }
        if (i2 == 3) {
            return new uwo();
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
        synchronized (uwo.class) {
            vtxVar = e;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                e = vtxVar;
            }
        }
        return vtxVar;
    }
}
