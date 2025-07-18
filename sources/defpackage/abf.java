package defpackage;

import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abf {
    public final aaz a;
    public OnBackInvokedDispatcher b;
    private OnBackInvokedCallback c;
    private boolean d;

    public abf(aaz aazVar) {
        this.a = aazVar;
        if (Build.VERSION.SDK_INT >= 33) {
            this.c = Build.VERSION.SDK_INT >= 34 ? new abe(new abc(this, 1), new abc(this, 0), new kh(this, 4), new kh(this, 5)) : new abd(new kh(this, 6), 0);
            aazVar.e = new kh(this, 7);
        }
    }

    public final void a() {
        boolean z = this.a.d;
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.b;
        OnBackInvokedCallback onBackInvokedCallback = this.c;
        if (onBackInvokedDispatcher == null || onBackInvokedCallback == null) {
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
