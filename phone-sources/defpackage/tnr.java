package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tnr extends vuc implements vvk {
    public static final tnr a;
    private static volatile vvq i;
    public int b;
    public Object d;
    public int e;
    public int c = 0;
    public int f = 8000;
    public int g = 16;
    public int h = 2;

    static {
        tnr tnrVar = new tnr();
        a = tnrVar;
        vuc.y(tnr.class, tnrVar);
    }

    private tnr() {
    }

    @Override // defpackage.vuc
    public final Object a(int i2, Object obj) {
        vvq vtxVar;
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new vvu(a, "\u0004\u0005\u0001\u0001\u0001\u0014\u0005\u0000\u0000\u0000\u0001င\u0000\nင\u0001\u000bင\u0002\fင\u0003\u0014<\u0000", new Object[]{"d", "c", "b", "e", "f", "g", "h", tnv.class});
        }
        if (i3 == 3) {
            return new tnr();
        }
        if (i3 == 4) {
            return new vtw(a);
        }
        if (i3 == 5) {
            return a;
        }
        if (i3 != 6) {
            throw null;
        }
        vvq vvqVar = i;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (tnr.class) {
            vtxVar = i;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                i = vtxVar;
            }
        }
        return vtxVar;
    }
}
