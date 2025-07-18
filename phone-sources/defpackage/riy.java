package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class riy implements View.OnAttachStateChangeListener {
    public final /* synthetic */ vvd a;
    private final rdd b;

    public riy(vvd vvdVar, View view, int i) {
        this.a = vvdVar;
        this.b = new rix(this, view, i);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, qvh] */
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        ?? r3 = this.a.d;
        rdd rddVar = this.b;
        r3.c(rddVar);
        if (r3.b()) {
            rddVar.b(r3.a());
        }
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, qvh] */
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.a.d.d(this.b);
    }
}
