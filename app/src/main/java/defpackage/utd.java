package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class utd implements View.OnAttachStateChangeListener {
    final /* synthetic */ utf a;

    public utd(utf utfVar) {
        this.a = utfVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        utf utfVar = this.a;
        utfVar.a();
        utfVar.b();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        utf utfVar = this.a;
        utfVar.a();
        utfVar.b();
    }
}
