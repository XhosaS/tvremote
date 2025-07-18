package defpackage;

import android.content.Context;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class rds extends rea {
    private ViewGroup i;

    public rds(ViewGroup viewGroup, Context context, rjg rjgVar) {
        super(viewGroup, context, rjgVar);
    }

    private static final void f(rdr rdrVar) {
        rdq rdqVar = rdrVar.a;
        throw null;
    }

    @Override // defpackage.rdv
    /* renamed from: a */
    protected final /* bridge */ /* synthetic */ void f(dvk dvkVar, rdu rduVar) {
        rdr rdrVar = (rdr) rduVar;
        ViewGroup viewGroup = this.i;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            f(rdrVar);
        }
        super.e(dvkVar, rdrVar);
    }

    @Override // defpackage.rea
    protected final void b(ViewGroup viewGroup) {
        this.i = viewGroup;
        rdu rduVar = this.f;
        if (rduVar == null) {
            return;
        }
        f((rdr) rduVar);
    }
}
