package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class taw implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener {
    public final WeakReference a;
    private final WeakReference b;

    public taw(taz tazVar, View view) {
        this.b = new WeakReference(tazVar);
        this.a = new WeakReference(view);
    }

    private final boolean b() {
        if (this.b.get() != null) {
            return false;
        }
        a();
        return true;
    }

    public final void a() {
        WeakReference weakReference = this.a;
        if (weakReference.get() != null) {
            ((View) weakReference.get()).removeOnAttachStateChangeListener(this);
            sil.o((View) weakReference.get(), this);
        }
        weakReference.clear();
        this.b.clear();
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        if (b()) {
            return;
        }
        taz tazVar = (taz) this.b.get();
        String str = taz.b;
        boolean z = tazVar.m;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        if (b()) {
            return;
        }
        sil.m(view, this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        if (b()) {
            return;
        }
        sil.o(view, this);
    }
}
