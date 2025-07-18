package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
class mjl implements View.OnAttachStateChangeListener {
    final /* synthetic */ String a;
    final /* synthetic */ mjm b;

    public mjl(mjm mjmVar, String str) {
        this.a = str;
        this.b = mjmVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        mjm mjmVar = this.b;
        synchronized (mjmVar) {
            String str = this.a;
            mjmVar.b(str);
            mjmVar.a.remove(str);
        }
        view.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
