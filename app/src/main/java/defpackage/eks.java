package defpackage;

import android.view.inputmethod.InputMethodManager;

/* compiled from: PG */
/* loaded from: classes.dex */
class eks implements Runnable {
    final /* synthetic */ InputMethodManager a;
    final /* synthetic */ eku b;

    public eks(eku ekuVar, InputMethodManager inputMethodManager) {
        this.a = inputMethodManager;
        this.b = ekuVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        eku ekuVar = this.b;
        if (ekuVar.f) {
            this.a.showSoftInput(ekuVar, 0);
        }
        ekuVar.f = false;
    }
}
