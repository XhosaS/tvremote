package defpackage;

import android.app.Activity;
import android.os.IBinder;
import android.view.View;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes.dex */
final class god implements View.OnAttachStateChangeListener {
    private final goe a;
    private final WeakReference b;

    public god(goe goeVar, Activity activity) {
        this.a = goeVar;
        this.b = new WeakReference(activity);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.getClass();
        view.removeOnAttachStateChangeListener(this);
        Activity activity = (Activity) this.b.get();
        IBinder iBinderN = gli.N(activity);
        if (activity == null || iBinderN == null) {
            return;
        }
        this.a.b(iBinderN, activity);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        view.getClass();
    }
}
