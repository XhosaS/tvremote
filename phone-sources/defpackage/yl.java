package defpackage;

import android.os.Build;
import android.view.View;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class yl extends cxj implements Runnable, View.OnAttachStateChangeListener, cvq {
    private final zs a;
    private boolean d;
    private boolean e;
    private cyh f;

    public yl(zs zsVar) {
        super(!zsVar.g ? 1 : 0);
        this.a = zsVar;
    }

    @Override // defpackage.cxj
    public final cyh a(cyh cyhVar, List list) {
        zs zsVar = this.a;
        zs.c(zsVar, cyhVar);
        return zsVar.g ? cyh.a : cyhVar;
    }

    @Override // defpackage.cxj
    public final cxi b(nxb nxbVar, cxi cxiVar) {
        this.d = false;
        return cxiVar;
    }

    @Override // defpackage.cxj
    public final void c(nxb nxbVar) {
        this.d = false;
        this.e = false;
        cyh cyhVar = this.f;
        if (nxbVar.p() > 0 && cyhVar != null) {
            zs zsVar = this.a;
            zsVar.a(cyhVar);
            zsVar.b(cyhVar);
            zs.c(zsVar, cyhVar);
        }
        this.f = null;
    }

    @Override // defpackage.cxj
    public final void d(nxb nxbVar) {
        this.d = true;
        this.e = true;
    }

    @Override // defpackage.cvq
    public final cyh onApplyWindowInsets(View view, cyh cyhVar) {
        this.f = cyhVar;
        zs zsVar = this.a;
        zsVar.b(cyhVar);
        if (this.d) {
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
            }
        } else if (!this.e) {
            zsVar.a(cyhVar);
            zs.c(zsVar, cyhVar);
        }
        return zsVar.g ? cyh.a : cyhVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.requestApplyInsets();
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.d) {
            this.d = false;
            this.e = false;
            cyh cyhVar = this.f;
            if (cyhVar != null) {
                zs zsVar = this.a;
                zsVar.a(cyhVar);
                zs.c(zsVar, cyhVar);
                this.f = null;
            }
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
