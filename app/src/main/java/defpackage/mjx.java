package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
class mjx implements View.OnAttachStateChangeListener {
    final /* synthetic */ aczz a;
    final /* synthetic */ mjz b;

    public mjx(mjz mjzVar, aczz aczzVar) {
        this.a = aczzVar;
        this.b = mjzVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        mjz mjzVar = this.b;
        synchronized (mjzVar.e) {
            aczz aczzVar = this.a;
            mjzVar.a(aczzVar.d);
            mjzVar.a.remove(aczzVar.d);
        }
        view.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
