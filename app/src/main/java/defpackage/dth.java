package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes.dex */
class dth extends drq {
    final Drawable a;
    int b;
    int c;

    public dth(Drawable drawable) {
        this.a = drawable;
    }

    @Override // defpackage.drq
    protected final Object A(Context context) {
        return new dwe();
    }

    @Override // defpackage.drq
    protected final void H(dru druVar, Object obj, duv duvVar) {
        ((dwe) obj).a(this.b, this.c);
    }

    @Override // defpackage.drq
    protected final void I(dru druVar, dse dseVar, duv duvVar) {
        this.b = dseVar.f();
        this.c = dseVar.a();
    }

    @Override // defpackage.drq
    protected final void L(dru druVar, Object obj, duv duvVar) {
        ((dwe) obj).b(this.a, null);
    }

    @Override // defpackage.drq
    protected final boolean ad() {
        return true;
    }

    @Override // defpackage.drq
    public final int ah() {
        return 2;
    }

    @Override // defpackage.drq
    protected final void as(dru druVar, Object obj) {
        ((dwe) obj).d();
    }

    @Override // defpackage.drq
    public final String d() {
        return "DrawableComponent";
    }

    @Override // defpackage.drq
    public final boolean g(drq drqVar) {
        if (this == drqVar) {
            return true;
        }
        if (drqVar == null || getClass() != drqVar.getClass()) {
            return false;
        }
        return eca.a(this.a, ((dth) drqVar).a);
    }
}
