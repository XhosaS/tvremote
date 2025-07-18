package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: PG */
/* loaded from: classes.dex */
public class mnl implements ViewTreeObserver.OnGlobalLayoutListener {
    public View a = null;
    private Rect b = null;
    private Runnable c = null;

    public final void a(View view) {
        if (view == null || view == this.a) {
            return;
        }
        c();
        view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        this.a = view;
    }

    public final void b() {
        Runnable runnable;
        View view = this.a;
        if (view != null && (runnable = this.c) != null) {
            view.removeCallbacks(runnable);
        }
        this.c = null;
    }

    public final void c() {
        b();
        View view = this.a;
        if (view != null) {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
        this.a = null;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        View view;
        View view2 = this.a;
        if (view2 == null) {
            return;
        }
        Context context = view2.getContext();
        while ((context instanceof ContextWrapper) && !(context instanceof Activity)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        Activity activity = context instanceof Activity ? (Activity) context : null;
        if (activity != null) {
            Rect rect = new Rect();
            activity.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
            Rect rect2 = this.b;
            if ((rect2 == null || rect.height() < rect2.height()) && (view = this.a) != null) {
                Runnable runnable = new Runnable() { // from class: mnk
                    @Override // java.lang.Runnable
                    public final void run() {
                        mnl mnlVar = this.a;
                        View view3 = mnlVar.a;
                        if (view3 == null) {
                            return;
                        }
                        mhz.c(view3);
                        mnlVar.b();
                    }
                };
                this.c = runnable;
                view.postDelayed(runnable, 200L);
            }
            this.b = rect;
        }
    }
}
