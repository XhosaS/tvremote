package defpackage;

import android.view.View;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class nzv {
    public final yyn i = new yyn(4);

    public abstract nzx a();

    public abstract void b(oal oalVar);

    public abstract void c(yyr yyrVar);

    public abstract void d(WeakReference weakReference);

    public final nzx e() {
        c(this.i.a(false));
        return a();
    }

    public final void f(View view) {
        if (view == null) {
            d(null);
        } else {
            d(new WeakReference(view));
        }
    }
}
