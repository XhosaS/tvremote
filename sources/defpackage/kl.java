package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;

/* compiled from: PG */
/* loaded from: classes.dex */
public class kl extends Dialog implements xf, kv, aba, abk {
    private xc a;
    private final cih b;
    private final awy c;

    public kl(Context context, int i) {
        super(context, i);
        this.c = wz.g(this);
        this.b = new cih(new ki(this, 2));
    }

    private final xc a() {
        xc xcVar = this.a;
        if (xcVar != null) {
            return xcVar;
        }
        xc xcVar2 = new xc(this);
        this.a = xcVar2;
        return xcVar2;
    }

    public static final void e(kl klVar) {
        super.onBackPressed();
    }

    @Override // defpackage.abk
    public final adx J() {
        return (adx) this.c.a;
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        d();
        super.addContentView(view, layoutParams);
    }

    public final void d() {
        Window window = getWindow();
        window.getClass();
        View decorView = window.getDecorView();
        decorView.getClass();
        qr.f(decorView, this);
        Window window2 = getWindow();
        window2.getClass();
        View decorView2 = window2.getDecorView();
        decorView2.getClass();
        mo.A(decorView2, this);
        Window window3 = getWindow();
        window3.getClass();
        View decorView3 = window3.getDecorView();
        decorView3.getClass();
        xo.d(decorView3, this);
        Window window4 = getWindow();
        window4.getClass();
        View decorView4 = window4.getDecorView();
        decorView4.getClass();
        wz.c(decorView4, this);
    }

    @Override // defpackage.xf
    public final xc m() {
        return a();
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        ((aaz) this.b.b).c();
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            cih cihVar = this.b;
            OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            onBackInvokedDispatcher.getClass();
            cihVar.f(onBackInvokedDispatcher);
        }
        this.c.k(bundle);
        a().b(xa.ON_CREATE);
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle bundleOnSaveInstanceState = super.onSaveInstanceState();
        bundleOnSaveInstanceState.getClass();
        this.c.l(bundleOnSaveInstanceState);
        return bundleOnSaveInstanceState;
    }

    @Override // android.app.Dialog
    protected final void onStart() {
        super.onStart();
        a().b(xa.ON_RESUME);
    }

    @Override // android.app.Dialog
    protected void onStop() {
        a().b(xa.ON_DESTROY);
        this.a = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        d();
        super.setContentView(i);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        view.getClass();
        d();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        d();
        super.setContentView(view, layoutParams);
    }
}
