package defpackage;

import android.content.Context;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ew extends ee {
    final /* synthetic */ fa d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ew(fa faVar, Context context, en enVar, View view) {
        super(context, enVar, view, false);
        this.d = faVar;
        if (!enVar.l.o()) {
            View view2 = faVar.g;
            this.a = view2 == null ? (View) faVar.f : view2;
        }
        e(faVar.l);
    }

    @Override // defpackage.ee
    protected final void c() {
        this.d.j = null;
        super.c();
    }
}
