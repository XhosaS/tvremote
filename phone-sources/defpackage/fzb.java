package defpackage;

import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fzb {
    public final fyx a;
    public OnBackInvokedDispatcher b;
    private final OnBackInvokedCallback c;
    private boolean d;

    public fzb(fyx fyxVar) {
        this.a = fyxVar;
        this.c = Build.VERSION.SDK_INT == 33 ? new fyz(this, 0) : Build.VERSION.SDK_INT >= 34 ? new fza(fyxVar) : null;
    }

    public final void a() {
        OnBackInvokedCallback onBackInvokedCallback;
        boolean z = this.a.d;
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.b;
        if (onBackInvokedDispatcher == null || (onBackInvokedCallback = this.c) == null) {
            return;
        }
        if (z) {
            if (this.d) {
                return;
            }
            onBackInvokedDispatcher.registerOnBackInvokedCallback(0, onBackInvokedCallback);
            this.d = true;
            return;
        }
        if (this.d) {
            onBackInvokedDispatcher.unregisterOnBackInvokedCallback(onBackInvokedCallback);
            this.d = false;
        }
    }
}
