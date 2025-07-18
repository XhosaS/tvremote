package defpackage;

import android.view.View;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class svj {
    private OnBackInvokedCallback a;

    public OnBackInvokedCallback a(svi sviVar) {
        sviVar.getClass();
        return new fyz(sviVar, 2);
    }

    public void b(svi sviVar, View view, boolean z) {
        OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher;
        if (this.a == null && (onBackInvokedDispatcherFindOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher()) != null) {
            OnBackInvokedCallback onBackInvokedCallbackA = a(sviVar);
            this.a = onBackInvokedCallbackA;
            onBackInvokedDispatcherFindOnBackInvokedDispatcher.registerOnBackInvokedCallback(true != z ? 0 : 1000000, onBackInvokedCallbackA);
        }
    }

    public void c(View view) {
        OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher;
        if (this.a == null || (onBackInvokedDispatcherFindOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher()) == null) {
            return;
        }
        onBackInvokedDispatcherFindOnBackInvokedDispatcher.unregisterOnBackInvokedCallback(this.a);
        this.a = null;
    }

    final boolean d() {
        return this.a != null;
    }
}
