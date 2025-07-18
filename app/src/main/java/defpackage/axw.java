package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
class axw implements View.OnClickListener {
    final /* synthetic */ ayb a;
    final /* synthetic */ ayc b;

    public axw(ayc aycVar, ayb aybVar) {
        this.b = aycVar;
        this.a = aybVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ayc aycVar = this.b;
        if (aycVar.l()) {
            return;
        }
        ((axp) aycVar.c.getAdapter()).p(this.a);
    }
}
