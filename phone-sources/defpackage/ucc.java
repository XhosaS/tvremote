package defpackage;

import android.support.v7.appcompat.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ucc extends vuc implements vvk {
    public static final ucc a;
    public static final vvd b;
    private static volatile vvq c;

    static {
        ucc uccVar = new ucc();
        a = uccVar;
        vuc.y(ucc.class, uccVar);
        b = vuc.C(uan.a, uccVar, uccVar, R.styleable.AppCompatTheme_windowActionBarOverlay, vwo.MESSAGE);
    }

    private ucc() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0000", null);
        }
        if (i2 == 3) {
            return new ucc();
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
        vvq vvqVar = c;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (ucc.class) {
            vtxVar = c;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                c = vtxVar;
            }
        }
        return vtxVar;
    }
}
