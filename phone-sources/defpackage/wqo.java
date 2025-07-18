package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wqo extends vuc implements vvk {
    public static final wqo a;
    public static final vvd i;
    private static volatile vvq j;
    public int b;
    public Object d;
    public wqm h;
    public int c = 0;
    private byte k = 2;
    public String e = "";
    public String f = "";
    public vun g = vvt.a;

    static {
        wqo wqoVar = new wqo();
        a = wqoVar;
        vuc.y(wqo.class, wqoVar);
        i = vuc.C(wkx.a, wqoVar, wqoVar, 525000007, vwo.MESSAGE);
    }

    private wqo() {
    }

    @Override // defpackage.vuc
    public final Object a(int i2, Object obj) {
        vvq vtxVar;
        int i3 = i2 - 1;
        if (i3 == 0) {
            return Byte.valueOf(this.k);
        }
        if (i3 == 2) {
            return new vvu(a, "\u0004\f\u0001\u0001\u0001\u000e\f\u0000\u0001\u0001\u0001ለ\u0000\u0003ለ\u0002\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000\t<\u0000\n<\u0000\u000b<\u0000\fм\u0000\r\u001b\u000eဉ\u0004", new Object[]{"d", "c", "b", "e", "f", wtm.class, wrw.class, wtw.class, wtu.class, wrb.class, wqk.class, wqz.class, wug.class, "g", wlx.class, "h"});
        }
        if (i3 == 3) {
            return new wqo();
        }
        if (i3 == 4) {
            return new vtw(a);
        }
        if (i3 == 5) {
            return a;
        }
        if (i3 != 6) {
            this.k = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        vvq vvqVar = j;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (wqo.class) {
            vtxVar = j;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                j = vtxVar;
            }
        }
        return vtxVar;
    }
}
