package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vim extends vuc implements vvk {
    public static final vim a;
    private static volatile vvq f;
    public Object c;
    public Object e;
    public int b = 0;
    public int d = 0;

    static {
        vim vimVar = new vim();
        a = vimVar;
        vuc.y(vim.class, vimVar);
    }

    private vim() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0004\u0002\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001;\u0000\u0002<\u0000\u0003<\u0001\u0004<\u0001", new Object[]{"c", "b", "e", "d", vkk.class, vik.class, vil.class});
        }
        if (i2 == 3) {
            return new vim();
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
        vvq vvqVar = f;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (vim.class) {
            vtxVar = f;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                f = vtxVar;
            }
        }
        return vtxVar;
    }
}
