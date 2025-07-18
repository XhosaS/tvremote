package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class phw {
    public pho a;
    public pho b;
    private final ViewTreeObserver.OnPreDrawListener c;
    private final View d;
    private WeakReference e;
    private phu f;
    private phu g;
    private boolean h;

    public phw(View view) {
        view.getClass();
        this.d = view;
        this.f = new phu();
        this.g = new phu();
        this.c = new phv(this, 0);
        this.h = false;
    }

    private final View c() {
        WeakReference weakReference = this.e;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0078 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a() {
        /*
            Method dump skipped, instructions count: 270
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.phw.a():void");
    }

    public final void b(View view) {
        if (view == c()) {
            a();
            return;
        }
        this.e = new WeakReference(view);
        pho phoVar = this.a;
        if (phoVar != null && view == null) {
            phoVar.a();
        }
        ViewTreeObserver viewTreeObserver = this.d.getViewTreeObserver();
        if (view != null && !this.h) {
            viewTreeObserver.addOnPreDrawListener(this.c);
            this.h = true;
        }
        if (view == null && this.h) {
            viewTreeObserver.removeOnPreDrawListener(this.c);
            this.h = false;
        }
        if (view != null) {
            a();
            return;
        }
        if (this.g.b()) {
            this.g.a();
            pho phoVar2 = this.b;
            if (phoVar2 != null) {
                phoVar2.b(this.g);
            }
        }
    }
}
