package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uao extends vuc implements vvk {
    public static final uao a;
    private static volatile vvq i;
    public int b;
    public ucz c;
    public ucz e;
    public uci f;
    public uay g;
    public uap h;
    private ucz j;
    private byte k = 2;
    public vun d = vvt.a;

    static {
        uao uaoVar = new uao();
        a = uaoVar;
        vuc.y(uao.class, uaoVar);
    }

    private uao() {
    }

    @Override // defpackage.vuc
    public final Object a(int i2, Object obj) {
        vvq vtxVar;
        int i3 = i2 - 1;
        if (i3 == 0) {
            return Byte.valueOf(this.k);
        }
        if (i3 == 2) {
            return new vvu(a, "\u0001\u0007\u0000\u0001\u0001\t\u0007\u0000\u0001\u0007\u0001ᐉ\u0000\u0002Л\u0003ᐉ\u0001\u0004ᐉ\u0004\u0007ᐉ\u0006\bᐉ\u0003\tᐉ\u0007", new Object[]{"b", "c", "d", ucj.class, "e", "f", "g", "j", "h"});
        }
        if (i3 == 3) {
            return new uao();
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
        vvq vvqVar = i;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (uao.class) {
            vtxVar = i;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                i = vtxVar;
            }
        }
        return vtxVar;
    }
}
