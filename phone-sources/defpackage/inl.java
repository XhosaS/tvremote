package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class inl extends vuc implements vvk {
    public static final inl a;
    private static volatile vvq d;
    public Object c;
    public int b = 0;
    private byte e = 2;

    static {
        inl inlVar = new inl();
        a = inlVar;
        vuc.y(inl.class, inlVar);
    }

    private inl() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.e);
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\r\u0001\u0000\u0001\r\r\u0000\u0000\r\u0001м\u0000\u0002м\u0000\u0003м\u0000\u0004м\u0000\u0005м\u0000\u0006м\u0000\u0007м\u0000\bм\u0000\tм\u0000\nм\u0000\u000bм\u0000\fм\u0000\rм\u0000", new Object[]{"c", "b", wom.class, wlg.class, wob.class, wvv.class, wwz.class, wwr.class, wwt.class, wwx.class, wwv.class, wvz.class, wzc.class, wwp.class, wxd.class});
        }
        if (i2 == 3) {
            return new inl();
        }
        if (i2 == 4) {
            return new vtw(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.e = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        vvq vvqVar = d;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (inl.class) {
            vtxVar = d;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                d = vtxVar;
            }
        }
        return vtxVar;
    }
}
