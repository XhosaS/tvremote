package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wom extends vuc implements vvk {
    public static final wom a;
    private static volatile vvq i;
    public int b;
    public woa f;
    public wlp g;
    public wlr h;
    private byte j = 2;
    public vun c = vvt.a;
    public String d = "";
    public String e = "";

    static {
        wom womVar = new wom();
        a = womVar;
        vuc.y(wom.class, womVar);
    }

    private wom() {
    }

    @Override // defpackage.vuc
    public final Object a(int i2, Object obj) {
        vvq vtxVar;
        int i3 = i2 - 1;
        if (i3 == 0) {
            return Byte.valueOf(this.j);
        }
        if (i3 == 2) {
            return new vvu(a, "\u0004\u0006\u0000\u0001\u0002\t\u0006\u0000\u0001\u0001\u0002Ȉ\u0003Ȉ\u0005ဉ\u0000\u0006Л\bဉ\u0001\tဉ\u0002", new Object[]{"b", "d", "e", "f", "c", wkx.class, "g", "h"});
        }
        if (i3 == 3) {
            return new wom();
        }
        if (i3 == 4) {
            return new vtw(a);
        }
        if (i3 == 5) {
            return a;
        }
        if (i3 != 6) {
            this.j = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        vvq vvqVar = i;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (wom.class) {
            vtxVar = i;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                i = vtxVar;
            }
        }
        return vtxVar;
    }

    public final void c() {
        vun vunVar = this.c;
        if (vunVar.c()) {
            return;
        }
        this.c = vuc.s(vunVar);
    }
}
