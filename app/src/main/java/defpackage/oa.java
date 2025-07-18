package defpackage;

import android.view.ViewParent;

/* compiled from: PG */
/* loaded from: classes.dex */
class oa implements Runnable {
    final /* synthetic */ oc a;

    public oa(oc ocVar) {
        this.a = ocVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewParent parent = this.a.c.getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
    }
}
