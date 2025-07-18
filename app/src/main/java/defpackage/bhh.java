package defpackage;

import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bhh {
    public final bhc a;
    public OnBackInvokedDispatcher b;
    private final OnBackInvokedCallback c;
    private boolean d;

    public bhh(bhc bhcVar) {
        this.a = bhcVar;
        this.c = Build.VERSION.SDK_INT == 33 ? new OnBackInvokedCallback() { // from class: bhe
            public final void onBackInvoked() {
                this.a.a.c();
            }
        } : Build.VERSION.SDK_INT >= 34 ? new bhg(bhcVar) : null;
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
