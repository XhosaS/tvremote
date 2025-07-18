package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class htz implements ViewTreeObserver.OnDrawListener {
    final /* synthetic */ View a;
    public final /* synthetic */ hua b;

    public htz(hua huaVar, View view) {
        this.a = view;
        this.b = huaVar;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        hwp.h(new bd(this, this.a, (ViewTreeObserver.OnDrawListener) this, 18));
    }
}
