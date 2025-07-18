package defpackage;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.WindowInsetsController$OnControllableInsetsChangedListener;
import android.view.inputmethod.InputMethodManager;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cvz extends cvx {
    private final View a;

    public cvz(View view) {
        super(view);
        this.a = view;
    }

    @Override // defpackage.cvx, defpackage.cwk
    public final void a() {
        View view = this.a;
        WindowInsetsController windowInsetsController = view != null ? view.getWindowInsetsController() : null;
        if (windowInsetsController == null) {
            super.a();
            return;
        }
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        WindowInsetsController$OnControllableInsetsChangedListener windowInsetsController$OnControllableInsetsChangedListener = new WindowInsetsController$OnControllableInsetsChangedListener() { // from class: cvy
            public final void onControllableInsetsChanged(WindowInsetsController windowInsetsController2, int i) {
                atomicBoolean.set((i & 8) != 0);
            }
        };
        windowInsetsController.addOnControllableInsetsChangedListener(windowInsetsController$OnControllableInsetsChangedListener);
        if (!atomicBoolean.get()) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
        windowInsetsController.removeOnControllableInsetsChangedListener(windowInsetsController$OnControllableInsetsChangedListener);
        windowInsetsController.hide(WindowInsets.Type.ime());
    }

    @Override // defpackage.cvx, defpackage.cwk
    public final void b() {
        View view = this.a;
        if (view != null && Build.VERSION.SDK_INT < 33) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).isActive();
        }
        WindowInsetsController windowInsetsController = view != null ? view.getWindowInsetsController() : null;
        if (windowInsetsController != null) {
            windowInsetsController.show(WindowInsets.Type.ime());
        }
        super.b();
    }
}
