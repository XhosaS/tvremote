package defpackage;

import android.view.ViewTreeObserver;

/* compiled from: PG */
/* loaded from: classes.dex */
class eic implements ViewTreeObserver.OnPreDrawListener {
    final /* synthetic */ eiz a;

    public eic(eiz eizVar) {
        this.a = eizVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        this.a.C();
        return true;
    }
}
