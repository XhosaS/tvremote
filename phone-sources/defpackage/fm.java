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
public class fm extends Dialog implements dvk, fz, fyy, ghe {
    private dvl _lifecycleRegistry;
    private final fx onBackPressedDispatcher;
    private final ghd savedStateRegistryController;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public fm(Context context) {
        this(context, 0, 2, null);
        context.getClass();
    }

    private final dvl getLifecycleRegistry() {
        dvl dvlVar = this._lifecycleRegistry;
        if (dvlVar != null) {
            return dvlVar;
        }
        dvl dvlVar2 = new dvl(this);
        this._lifecycleRegistry = dvlVar2;
        return dvlVar2;
    }

    private static Object getNavigationEventDispatcher$delegate(fm fmVar) {
        yku ykuVar = new yku(fmVar.onBackPressedDispatcher, fx.class, "eventDispatcher", "getEventDispatcher$activity_release()Landroidx/navigationevent/NavigationEventDispatcher;");
        int i = ylg.a;
        return ykuVar;
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        initializeViewTreeOwners();
        super.addContentView(view, layoutParams);
    }

    @Override // defpackage.dvk
    public dve getLifecycle() {
        return getLifecycleRegistry();
    }

    public fyx getNavigationEventDispatcher() {
        return (fyx) this.onBackPressedDispatcher.b;
    }

    @Override // defpackage.fz
    public final fx getOnBackPressedDispatcher() {
        return this.onBackPressedDispatcher;
    }

    @Override // defpackage.ghe
    public ghc getSavedStateRegistry() {
        return (ghc) this.savedStateRegistryController.b;
    }

    public void initializeViewTreeOwners() {
        Window window = getWindow();
        window.getClass();
        View decorView = window.getDecorView();
        decorView.getClass();
        dwf.f(decorView, this);
        Window window2 = getWindow();
        window2.getClass();
        View decorView2 = window2.getDecorView();
        decorView2.getClass();
        d.b(decorView2, this);
        Window window3 = getWindow();
        window3.getClass();
        View decorView3 = window3.getDecorView();
        decorView3.getClass();
        gez.w(decorView3, this);
        Window window4 = getWindow();
        window4.getClass();
        View decorView4 = window4.getDecorView();
        decorView4.getClass();
        fus.x(decorView4, this);
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        getNavigationEventDispatcher().c();
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            fx fxVar = this.onBackPressedDispatcher;
            OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            onBackInvokedDispatcher.getClass();
            fxVar.d(onBackInvokedDispatcher);
        }
        this.savedStateRegistryController.b(bundle);
        getLifecycleRegistry().e(dvc.ON_CREATE);
    }

    @Override // android.app.Dialog
    public Bundle onSaveInstanceState() {
        Bundle bundleOnSaveInstanceState = super.onSaveInstanceState();
        bundleOnSaveInstanceState.getClass();
        this.savedStateRegistryController.c(bundleOnSaveInstanceState);
        return bundleOnSaveInstanceState;
    }

    @Override // android.app.Dialog
    protected void onStart() {
        super.onStart();
        getLifecycleRegistry().e(dvc.ON_RESUME);
    }

    @Override // android.app.Dialog
    protected void onStop() {
        getLifecycleRegistry().e(dvc.ON_DESTROY);
        this._lifecycleRegistry = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        initializeViewTreeOwners();
        super.setContentView(i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fm(Context context, int i) {
        super(context, i);
        context.getClass();
        this.savedStateRegistryController = gez.y(this);
        this.onBackPressedDispatcher = new fx(new bf(this, 13));
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        view.getClass();
        initializeViewTreeOwners();
        super.setContentView(view);
    }

    public /* synthetic */ fm(Context context, int i, int i2, ykn yknVar) {
        this(context, (i2 & 2) != 0 ? 0 : i);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        initializeViewTreeOwners();
        super.setContentView(view, layoutParams);
    }

    public static /* synthetic */ void getOnBackPressedDispatcher$annotations() {
    }
}
