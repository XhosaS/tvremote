package defpackage;

import android.support.v7.appcompat.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aae implements acy {
    public final aad a;
    public final eph b;
    public final bhi c;
    private final aan d;

    public aae(aan aanVar, aad aadVar, bhi bhiVar, eph ephVar) {
        this.d = aanVar;
        this.a = aadVar;
        this.c = bhiVar;
        this.b = ephVar;
    }

    @Override // defpackage.acy
    public final int a(Object obj) {
        return this.b.B(obj);
    }

    @Override // defpackage.acy
    public final int b() {
        return this.a.c();
    }

    @Override // defpackage.acy
    public final Object c(int i) {
        return this.a.d(i);
    }

    @Override // defpackage.acy
    public final Object d(int i) {
        Object objC = this.b.C(i);
        return objC == null ? this.a.e(i) : objC;
    }

    @Override // defpackage.acy
    public final void e(int i, Object obj, bao baoVar, int i2) {
        int i3;
        int i4 = i2 & 6;
        bao baoVarD = baoVar.d(-462424778);
        if (i4 == 0) {
            i3 = (true != baoVarD.D(i) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != baoVarD.H(obj) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != baoVarD.F(this) ? 128 : 256;
        }
        if (baoVarD.L((i3 & 147) != 146, i3 & 1)) {
            fh.p(obj, i, this.d.l, bga.k(-824725566, new abb(this, i, 1), baoVarD), baoVarD, ((i3 << 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | ((i3 >> 3) & 14) | 3072);
        } else {
            baoVarD.t();
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new aba(this, i, obj, i2, 1);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof aae) {
            return yks.e(this.a, ((aae) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
