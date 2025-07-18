package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import com.google.android.katniss.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public class tv extends Dialog implements bcl, uj, bqs {
    private bco a;
    private final bqr b;
    private final ui c;

    public tv(Context context, int i) {
        super(context, i);
        this.b = bqr.a.a(this);
        this.c = new ui(new Runnable() { // from class: tu
            @Override // java.lang.Runnable
            public final void run() {
                tv.f(this.a);
            }
        });
    }

    private final bco a() {
        bco bcoVar = this.a;
        if (bcoVar != null) {
            return bcoVar;
        }
        bco bcoVar2 = new bco(this);
        this.a = bcoVar2;
        return bcoVar2;
    }

    public static final void f(tv tvVar) {
        super.onBackPressed();
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        e();
        super.addContentView(view, layoutParams);
    }

    @Override // defpackage.uj
    public final ui dc() {
        return this.c;
    }

    public final void e() {
        Window window = getWindow();
        window.getClass();
        View decorView = window.getDecorView();
        decorView.getClass();
        ben.a(decorView, this);
        Window window2 = getWindow();
        window2.getClass();
        View decorView2 = window2.getDecorView();
        decorView2.getClass();
        decorView2.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        Window window3 = getWindow();
        window3.getClass();
        View decorView3 = window3.getDecorView();
        decorView3.getClass();
        bqt.a(decorView3, this);
        Window window4 = getWindow();
        window4.getClass();
        View decorView4 = window4.getDecorView();
        decorView4.getClass();
        decorView4.setTag(R.id.view_tree_navigation_event_dispatcher_owner, this);
    }

    @Override // defpackage.bcl
    public final bcg ek() {
        return a();
    }

    @Override // defpackage.bqs
    public final bqo en() {
        return this.b.c;
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        this.c.a.c();
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            ui uiVar = this.c;
            OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            onBackInvokedDispatcher.getClass();
            uiVar.c(onBackInvokedDispatcher);
        }
        this.b.b.c(bundle);
        a().e(bce.ON_CREATE);
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle bundleOnSaveInstanceState = super.onSaveInstanceState();
        bundleOnSaveInstanceState.getClass();
        this.b.b.d(bundleOnSaveInstanceState);
        return bundleOnSaveInstanceState;
    }

    @Override // android.app.Dialog
    protected final void onStart() {
        super.onStart();
        a().e(bce.ON_RESUME);
    }

    @Override // android.app.Dialog
    protected void onStop() {
        a().e(bce.ON_DESTROY);
        this.a = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        e();
        super.setContentView(i);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        view.getClass();
        e();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        e();
        super.setContentView(view, layoutParams);
    }
}
