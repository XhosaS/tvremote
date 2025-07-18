package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class re extends px {
    public boolean i = true;

    public abstract boolean f(qv qvVar, qv qvVar2, int i, int i2, int i3, int i4);

    public abstract boolean g(qv qvVar, int i, int i2, int i3, int i4);

    public abstract void j(qv qvVar);

    public abstract void k(qv qvVar);

    @Override // defpackage.px
    public final boolean n(qv qvVar, pw pwVar, pw pwVar2) {
        int i;
        int i2;
        if (pwVar != null && ((i = pwVar.a) != (i2 = pwVar2.a) || pwVar.b != pwVar2.b)) {
            return g(qvVar, i, pwVar.b, i2, pwVar2.b);
        }
        j(qvVar);
        return true;
    }

    @Override // defpackage.px
    public final boolean o(qv qvVar, qv qvVar2, pw pwVar, pw pwVar2) {
        int i;
        int i2;
        int i3 = pwVar.a;
        int i4 = pwVar.b;
        if (qvVar2.x()) {
            int i5 = pwVar.a;
            i2 = pwVar.b;
            i = i5;
        } else {
            i = pwVar2.a;
            i2 = pwVar2.b;
        }
        return f(qvVar, qvVar2, i3, i4, i, i2);
    }

    @Override // defpackage.px
    public final boolean p(qv qvVar, pw pwVar, pw pwVar2) {
        int i = pwVar.a;
        int i2 = pwVar.b;
        View view = qvVar.a;
        int left = pwVar2 == null ? view.getLeft() : pwVar2.a;
        int top = pwVar2 == null ? view.getTop() : pwVar2.b;
        if (qvVar.s() || (i == left && i2 == top)) {
            k(qvVar);
            return true;
        }
        view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
        return g(qvVar, i, i2, left, top);
    }

    @Override // defpackage.px
    public final boolean q(qv qvVar, pw pwVar, pw pwVar2) {
        int i = pwVar.a;
        int i2 = pwVar2.a;
        if (i != i2 || pwVar.b != pwVar2.b) {
            return g(qvVar, i, pwVar.b, i2, pwVar2.b);
        }
        l(qvVar);
        return false;
    }

    @Override // defpackage.px
    public final boolean r(qv qvVar) {
        return !this.i || qvVar.q();
    }
}
