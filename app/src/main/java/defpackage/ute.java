package defpackage;

import android.view.ViewTreeObserver;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ute implements ViewTreeObserver.OnWindowFocusChangeListener {
    final /* synthetic */ utf a;

    public ute(utf utfVar) {
        this.a = utfVar;
    }

    @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
    public final void onWindowFocusChanged(boolean z) {
        this.a.b();
    }
}
