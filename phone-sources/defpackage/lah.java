package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lah extends vuc implements vvk {
    public static final lah a;
    private static volatile vvq l;
    public int b;
    public Object d;
    public lar e;
    public lcw f;
    public boolean g;
    public lag h;
    public lao i;
    public long j;
    public int c = 0;
    public String k = "";

    static {
        lah lahVar = new lah();
        a = lahVar;
        vuc.y(lah.class, lahVar);
    }

    private lah() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u000b\u0001\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005ဉ\u0001\u0006\u0007\u0007ဉ\u0002\bဉ\u0003\tဉ\u0000\n\u0002\u000bȈ", new Object[]{"d", "c", "b", lbo.class, law.class, lce.class, lch.class, "f", "g", "h", "i", "e", "j", "k"});
        }
        if (i2 == 3) {
            return new lah();
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
        synchronized (lah.class) {
            vtxVar = l;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                l = vtxVar;
            }
        }
        return vtxVar;
    }
}
