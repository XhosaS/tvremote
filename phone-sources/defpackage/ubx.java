package defpackage;

import android.support.v7.appcompat.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ubx extends vuc implements vvk {
    public static final ubx a;
    public static final vvd h;
    private static volatile vvq i;
    public int b;
    public long c;
    public int d;
    public ubv e;
    public wdm f;
    public ubw g;
    private byte j = 2;

    static {
        ubx ubxVar = new ubx();
        a = ubxVar;
        vuc.y(ubx.class, ubxVar);
        h = vuc.C(uan.a, ubxVar, ubxVar, R.styleable.AppCompatTheme_toolbarStyle, vwo.MESSAGE);
    }

    private ubx() {
    }

    @Override // defpackage.vuc
    public final Object a(int i2, Object obj) {
        vvq vtxVar;
        int i3 = i2 - 1;
        if (i3 == 0) {
            return Byte.valueOf(this.j);
        }
        if (i3 == 2) {
            return new vvu(a, "\u0004\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0001\u0001ဂ\u0000\u0002᠌\u0001\u0003ဉ\u0002\u0004ᐉ\u0003\u0006ဉ\u0005", new Object[]{"b", "c", "d", ubu.a, "e", "f", "g"});
        }
        if (i3 == 3) {
            return new ubx();
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
        synchronized (ubx.class) {
            vtxVar = i;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                i = vtxVar;
            }
        }
        return vtxVar;
    }
}
