package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import com.google.android.videos.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public class fl extends ds implements dvk, dxd, duz, ghe, fz, fyy, gu, csb, csc, dk, dl, cve {
    private static final String ACTIVITY_RESULT_TAG = "android:support:activity-result";
    private static final fh Companion = new fh();
    private dxc _viewModelStore;
    private final gt activityResultRegistry;
    private int contentLayoutId;
    private final gl contextAwareHelper;
    private final yft defaultViewModelProviderFactory$delegate;
    private boolean dispatchingOnMultiWindowModeChanged;
    private boolean dispatchingOnPictureInPictureModeChanged;
    private final yft fullyDrawnReporter$delegate;
    private final cvi menuHostHelper;
    private final fx navigationEventDispatcher$receiver;
    private final AtomicInteger nextLocalRequestCode;
    private final yft onBackPressedDispatcher$delegate;
    private final CopyOnWriteArrayList<cuh<Configuration>> onConfigurationChangedListeners;
    private final CopyOnWriteArrayList<cuh<shy>> onMultiWindowModeChangedListeners;
    private final CopyOnWriteArrayList<cuh<Intent>> onNewIntentListeners;
    private final CopyOnWriteArrayList<cuh<shy>> onPictureInPictureModeChangedListeners;
    private final CopyOnWriteArrayList<cuh<Integer>> onTrimMemoryListeners;
    private final CopyOnWriteArrayList<Runnable> onUserLeaveHintListeners;
    private final fi reportFullyDrawnExecutor;
    private final ghd savedStateRegistryController;

    public fl() {
        this.contextAwareHelper = new gl();
        this.menuHostHelper = new cvi(new bf(this, 10));
        ghd ghdVarY = gez.y(this);
        this.savedStateRegistryController = ghdVarY;
        this.reportFullyDrawnExecutor = createFullyDrawnExecutor();
        this.fullyDrawnReporter$delegate = new yga(new fg(this, 1));
        this.nextLocalRequestCode = new AtomicInteger();
        this.activityResultRegistry = new gt(this);
        this.onConfigurationChangedListeners = new CopyOnWriteArrayList<>();
        this.onTrimMemoryListeners = new CopyOnWriteArrayList<>();
        this.onNewIntentListeners = new CopyOnWriteArrayList<>();
        this.onMultiWindowModeChangedListeners = new CopyOnWriteArrayList<>();
        this.onPictureInPictureModeChangedListeners = new CopyOnWriteArrayList<>();
        this.onUserLeaveHintListeners = new CopyOnWriteArrayList<>();
        if (getLifecycle() == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        int i = 0;
        getLifecycle().c(new fe(this, i));
        int i2 = 2;
        getLifecycle().c(new fe(this, i2));
        getLifecycle().c(new fe(this, 3, null));
        ghdVarY.a();
        dwn.c(this);
        getSavedStateRegistry().b(ACTIVITY_RESULT_TAG, new cf(this, i2));
        addOnContextAvailableListener(new ff(this, i));
        this.defaultViewModelProviderFactory$delegate = new yga(new fg(this, i));
        this.onBackPressedDispatcher$delegate = new yga(new fg(this, i2));
        this.navigationEventDispatcher$receiver = getOnBackPressedDispatcher();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$4(fl flVar, dvk dvkVar, dvc dvcVar) {
        Window window;
        View viewPeekDecorView;
        dvkVar.getClass();
        dvcVar.getClass();
        if (dvcVar != dvc.ON_STOP || (window = flVar.getWindow()) == null || (viewPeekDecorView = window.peekDecorView()) == null) {
            return;
        }
        viewPeekDecorView.cancelPendingInputEvents();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$5(fl flVar, dvk dvkVar, dvc dvcVar) {
        dvkVar.getClass();
        dvcVar.getClass();
        if (dvcVar == dvc.ON_DESTROY) {
            flVar.contextAwareHelper.b = null;
            if (!flVar.isChangingConfigurations()) {
                flVar.getViewModelStore().c();
            }
            flVar.reportFullyDrawnExecutor.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bundle _init_$lambda$6(fl flVar) {
        Bundle bundle = new Bundle();
        gt gtVar = flVar.activityResultRegistry;
        Map map = gtVar.b;
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(map.values()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(map.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(gtVar.c));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(gtVar.f));
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$7(fl flVar, Context context) {
        context.getClass();
        Bundle bundleA = flVar.getSavedStateRegistry().a(ACTIVITY_RESULT_TAG);
        if (bundleA != null) {
            gt gtVar = flVar.activityResultRegistry;
            ArrayList<Integer> integerArrayList = bundleA.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
            ArrayList<String> stringArrayList = bundleA.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
            if (stringArrayList == null || integerArrayList == null) {
                return;
            }
            ArrayList<String> stringArrayList2 = bundleA.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
            if (stringArrayList2 != null) {
                gtVar.c.addAll(stringArrayList2);
            }
            Bundle bundle = bundleA.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
            if (bundle != null) {
                gtVar.f.putAll(bundle);
            }
            int size = stringArrayList.size();
            for (int i = 0; i < size; i++) {
                String str = stringArrayList.get(i);
                Map map = gtVar.b;
                if (map.containsKey(str)) {
                    Integer num = (Integer) map.remove(str);
                    if (!gtVar.f.containsKey(str)) {
                        Map map2 = gtVar.a;
                        ylh.g(map2);
                        map2.remove(num);
                    }
                }
                Integer num2 = integerArrayList.get(i);
                num2.getClass();
                int iIntValue = num2.intValue();
                String str2 = stringArrayList.get(i);
                str2.getClass();
                gtVar.d(iIntValue, str2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addObserverForBackInvoker(fx fxVar) {
        getLifecycle().c(new cvg(fxVar, this, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addObserverForBackInvoker$lambda$14(fx fxVar, fl flVar, dvk dvkVar, dvc dvcVar) {
        dvkVar.getClass();
        dvcVar.getClass();
        if (dvcVar == dvc.ON_CREATE) {
            OnBackInvokedDispatcher onBackInvokedDispatcher = flVar.getOnBackInvokedDispatcher();
            onBackInvokedDispatcher.getClass();
            fxVar.d(onBackInvokedDispatcher);
        }
    }

    private final fi createFullyDrawnExecutor() {
        return new fj(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dwq defaultViewModelProviderFactory_delegate$lambda$9(fl flVar) {
        return new dwq(flVar.getApplication(), flVar, flVar.getIntent() != null ? flVar.getIntent().getExtras() : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ensureViewModelStore() {
        if (this._viewModelStore == null) {
            baf bafVar = (baf) getLastNonConfigurationInstance();
            if (bafVar != null) {
                this._viewModelStore = (dxc) bafVar.a;
            }
            if (this._viewModelStore == null) {
                this._viewModelStore = new dxc();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ft fullyDrawnReporter_delegate$lambda$2(fl flVar) {
        return new ft(flVar.reportFullyDrawnExecutor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ygi fullyDrawnReporter_delegate$lambda$2$lambda$1(fl flVar) {
        flVar.reportFullyDrawn();
        return ygi.a;
    }

    private static Object getNavigationEventDispatcher$delegate(fl flVar) {
        yku ykuVar = new yku(flVar.navigationEventDispatcher$receiver, fx.class, "eventDispatcher", "getEventDispatcher$activity_release()Landroidx/navigationevent/NavigationEventDispatcher;");
        int i = ylg.a;
        return ykuVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fx onBackPressedDispatcher_delegate$lambda$13(fl flVar) {
        fx fxVar = new fx(new bf(flVar, 11));
        if (Build.VERSION.SDK_INT >= 33) {
            if (!yks.e(Looper.myLooper(), Looper.getMainLooper())) {
                new Handler(Looper.getMainLooper()).post(new be(flVar, fxVar, 7, (byte[]) null));
                return fxVar;
            }
            flVar.addObserverForBackInvoker(fxVar);
        }
        return fxVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBackPressedDispatcher_delegate$lambda$13$lambda$10(fl flVar) {
        try {
            super.onBackPressed();
        } catch (IllegalStateException e) {
            if (!yks.e(e.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                throw e;
            }
        } catch (NullPointerException e2) {
            if (!yks.e(e2.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                throw e2;
            }
        }
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        this.reportFullyDrawnExecutor.b(decorView);
        super.addContentView(view, layoutParams);
    }

    @Override // defpackage.cve
    public void addMenuProvider(cvk cvkVar) {
        cvkVar.getClass();
        this.menuHostHelper.a(cvkVar);
    }

    @Override // defpackage.csb
    public final void addOnConfigurationChangedListener(cuh<Configuration> cuhVar) {
        cuhVar.getClass();
        this.onConfigurationChangedListeners.add(cuhVar);
    }

    public final void addOnContextAvailableListener(gm gmVar) {
        gmVar.getClass();
        gl glVar = this.contextAwareHelper;
        Context context = glVar.b;
        if (context != null) {
            gmVar.onContextAvailable(context);
        }
        glVar.a.add(gmVar);
    }

    @Override // defpackage.dk
    public final void addOnMultiWindowModeChangedListener(cuh<shy> cuhVar) {
        cuhVar.getClass();
        this.onMultiWindowModeChangedListeners.add(cuhVar);
    }

    public final void addOnNewIntentListener(cuh<Intent> cuhVar) {
        cuhVar.getClass();
        this.onNewIntentListeners.add(cuhVar);
    }

    @Override // defpackage.dl
    public final void addOnPictureInPictureModeChangedListener(cuh<shy> cuhVar) {
        cuhVar.getClass();
        this.onPictureInPictureModeChangedListeners.add(cuhVar);
    }

    @Override // defpackage.csc
    public final void addOnTrimMemoryListener(cuh<Integer> cuhVar) {
        cuhVar.getClass();
        this.onTrimMemoryListeners.add(cuhVar);
    }

    public final void addOnUserLeaveHintListener(Runnable runnable) {
        runnable.getClass();
        this.onUserLeaveHintListeners.add(runnable);
    }

    @Override // defpackage.gu
    public final gt getActivityResultRegistry() {
        return this.activityResultRegistry;
    }

    @Override // defpackage.duz
    public dxj getDefaultViewModelCreationExtras() {
        dxl dxlVar = new dxl((byte[]) (0 == true ? 1 : 0));
        if (getApplication() != null) {
            dxlVar.b(dww.b, getApplication());
        }
        dxlVar.b(dwn.a, this);
        dxlVar.b(dwn.b, this);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            dxlVar.b(dwn.c, extras);
        }
        return dxlVar;
    }

    @Override // defpackage.duz
    public dwx getDefaultViewModelProviderFactory() {
        return (dwx) this.defaultViewModelProviderFactory$delegate.a();
    }

    public ft getFullyDrawnReporter() {
        return (ft) this.fullyDrawnReporter$delegate.a();
    }

    @yfp
    public Object getLastCustomNonConfigurationInstance() {
        baf bafVar = (baf) getLastNonConfigurationInstance();
        if (bafVar != null) {
            return bafVar.b;
        }
        return null;
    }

    @Override // defpackage.ds, defpackage.dvk
    public dve getLifecycle() {
        return super.getLifecycle();
    }

    public fyx getNavigationEventDispatcher() {
        return (fyx) this.navigationEventDispatcher$receiver.b;
    }

    @Override // defpackage.fz
    public final fx getOnBackPressedDispatcher() {
        return (fx) this.onBackPressedDispatcher$delegate.a();
    }

    @Override // defpackage.ghe
    public final ghc getSavedStateRegistry() {
        return (ghc) this.savedStateRegistryController.b;
    }

    @Override // defpackage.dxd
    public dxc getViewModelStore() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        ensureViewModelStore();
        dxc dxcVar = this._viewModelStore;
        dxcVar.getClass();
        return dxcVar;
    }

    public void initializeViewTreeOwners() {
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        dwf.f(decorView, this);
        View decorView2 = getWindow().getDecorView();
        decorView2.getClass();
        dwf.d(decorView2, this);
        View decorView3 = getWindow().getDecorView();
        decorView3.getClass();
        gez.w(decorView3, this);
        View decorView4 = getWindow().getDecorView();
        decorView4.getClass();
        d.b(decorView4, this);
        View decorView5 = getWindow().getDecorView();
        decorView5.getClass();
        decorView5.setTag(R.id.report_drawn, this);
        View decorView6 = getWindow().getDecorView();
        decorView6.getClass();
        fus.x(decorView6, this);
    }

    @Override // defpackage.cve
    public void invalidateMenu() {
        invalidateOptionsMenu();
    }

    @Override // android.app.Activity
    @yfp
    protected void onActivityResult(int i, int i2, Intent intent) {
        if (this.activityResultRegistry.f(i, i2, intent)) {
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity
    @yfp
    public void onBackPressed() {
        getNavigationEventDispatcher().c();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        configuration.getClass();
        super.onConfigurationChanged(configuration);
        Iterator<cuh<Configuration>> it = this.onConfigurationChangedListeners.iterator();
        it.getClass();
        while (it.hasNext()) {
            it.next().accept(configuration);
        }
    }

    @Override // defpackage.ds, android.app.Activity
    protected void onCreate(Bundle bundle) {
        this.savedStateRegistryController.b(bundle);
        gl glVar = this.contextAwareHelper;
        glVar.b = this;
        Iterator it = glVar.a.iterator();
        while (it.hasNext()) {
            ((gm) it.next()).onContextAvailable(this);
        }
        super.onCreate(bundle);
        int i = dwh.b;
        dvb.f(this);
        int i2 = this.contentLayoutId;
        if (i2 != 0) {
            setContentView(i2);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i, Menu menu) {
        menu.getClass();
        if (i != 0) {
            return true;
        }
        super.onCreatePanelMenu(0, menu);
        this.menuHostHelper.d(menu, getMenuInflater());
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        menuItem.getClass();
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            return this.menuHostHelper.g(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    @yfp
    public void onMultiWindowModeChanged(boolean z) {
        if (this.dispatchingOnMultiWindowModeChanged) {
            return;
        }
        Iterator<cuh<shy>> it = this.onMultiWindowModeChangedListeners.iterator();
        it.getClass();
        while (it.hasNext()) {
            it.next().accept(new shy(z));
        }
    }

    @Override // android.app.Activity
    protected void onNewIntent(Intent intent) {
        intent.getClass();
        super.onNewIntent(intent);
        Iterator<cuh<Intent>> it = this.onNewIntentListeners.iterator();
        it.getClass();
        while (it.hasNext()) {
            it.next().accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        menu.getClass();
        Iterator it = ((CopyOnWriteArrayList) this.menuHostHelper.b).iterator();
        while (it.hasNext()) {
            ((cvk) it.next()).b(menu);
        }
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    @yfp
    public void onPictureInPictureModeChanged(boolean z) {
        if (this.dispatchingOnPictureInPictureModeChanged) {
            return;
        }
        Iterator<cuh<shy>> it = this.onPictureInPictureModeChangedListeners.iterator();
        it.getClass();
        while (it.hasNext()) {
            it.next().accept(new shy(z));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i, View view, Menu menu) {
        menu.getClass();
        if (i != 0) {
            return true;
        }
        super.onPreparePanel(0, view, menu);
        this.menuHostHelper.e(menu);
        return true;
    }

    @Override // android.app.Activity
    @yfp
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        strArr.getClass();
        iArr.getClass();
        if (this.activityResultRegistry.f(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @yfp
    public Object onRetainCustomNonConfigurationInstance() {
        return null;
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        baf bafVar;
        Object objOnRetainCustomNonConfigurationInstance = onRetainCustomNonConfigurationInstance();
        Object obj = this._viewModelStore;
        if (obj == null && (bafVar = (baf) getLastNonConfigurationInstance()) != null) {
            obj = bafVar.a;
        }
        if (obj == null && objOnRetainCustomNonConfigurationInstance == null) {
            return null;
        }
        baf bafVar2 = new baf(null);
        bafVar2.b = objOnRetainCustomNonConfigurationInstance;
        bafVar2.a = obj;
        return bafVar2;
    }

    @Override // defpackage.ds, android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        if (getLifecycle() instanceof dvl) {
            dve lifecycle = getLifecycle();
            lifecycle.getClass();
            ((dvl) lifecycle).f(dvd.c);
        }
        super.onSaveInstanceState(bundle);
        this.savedStateRegistryController.c(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        super.onTrimMemory(i);
        Iterator<cuh<Integer>> it = this.onTrimMemoryListeners.iterator();
        it.getClass();
        while (it.hasNext()) {
            it.next().accept(Integer.valueOf(i));
        }
    }

    @Override // android.app.Activity
    protected void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator<Runnable> it = this.onUserLeaveHintListeners.iterator();
        it.getClass();
        while (it.hasNext()) {
            it.next().run();
        }
    }

    public Context peekAvailableContext() {
        return this.contextAwareHelper.b;
    }

    public final <I, O> gp<I> registerForActivityResult(gx<I, O> gxVar, go<O> goVar) {
        gxVar.getClass();
        goVar.getClass();
        return registerForActivityResult(gxVar, this.activityResultRegistry, goVar);
    }

    @Override // defpackage.cve
    public void removeMenuProvider(cvk cvkVar) {
        cvkVar.getClass();
        this.menuHostHelper.f(cvkVar);
    }

    @Override // defpackage.csb
    public final void removeOnConfigurationChangedListener(cuh<Configuration> cuhVar) {
        cuhVar.getClass();
        this.onConfigurationChangedListeners.remove(cuhVar);
    }

    public final void removeOnContextAvailableListener(gm gmVar) {
        gmVar.getClass();
        this.contextAwareHelper.a.remove(gmVar);
    }

    @Override // defpackage.dk
    public final void removeOnMultiWindowModeChangedListener(cuh<shy> cuhVar) {
        cuhVar.getClass();
        this.onMultiWindowModeChangedListeners.remove(cuhVar);
    }

    public final void removeOnNewIntentListener(cuh<Intent> cuhVar) {
        cuhVar.getClass();
        this.onNewIntentListeners.remove(cuhVar);
    }

    @Override // defpackage.dl
    public final void removeOnPictureInPictureModeChangedListener(cuh<shy> cuhVar) {
        cuhVar.getClass();
        this.onPictureInPictureModeChangedListeners.remove(cuhVar);
    }

    @Override // defpackage.csc
    public final void removeOnTrimMemoryListener(cuh<Integer> cuhVar) {
        cuhVar.getClass();
        this.onTrimMemoryListeners.remove(cuhVar);
    }

    public final void removeOnUserLeaveHintListener(Runnable runnable) {
        runnable.getClass();
        this.onUserLeaveHintListeners.remove(runnable);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Iterable, java.lang.Object, java.util.List] */
    @Override // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if (gli.o()) {
                gli.n("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            ft fullyDrawnReporter = getFullyDrawnReporter();
            synchronized (fullyDrawnReporter.a) {
                fullyDrawnReporter.b = true;
                ?? r0 = fullyDrawnReporter.c;
                Iterator it = r0.iterator();
                while (it.hasNext()) {
                    ((yjk) it.next()).a();
                }
                r0.clear();
            }
        } finally {
            Trace.endSection();
        }
    }

    @Override // android.app.Activity
    public void setContentView(int i) {
        initializeViewTreeOwners();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        this.reportFullyDrawnExecutor.b(decorView);
        super.setContentView(i);
    }

    @Override // android.app.Activity
    @yfp
    public void startActivityForResult(Intent intent, int i) {
        intent.getClass();
        super.startActivityForResult(intent, i);
    }

    @Override // android.app.Activity
    @yfp
    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) {
        intentSender.getClass();
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    public void addMenuProvider(cvk cvkVar, dvk dvkVar) {
        cvkVar.getClass();
        dvkVar.getClass();
        this.menuHostHelper.b(cvkVar, dvkVar);
    }

    public final <I, O> gp<I> registerForActivityResult(gx<I, O> gxVar, gt gtVar, go<O> goVar) {
        gxVar.getClass();
        gtVar.getClass();
        goVar.getClass();
        return gtVar.b("activity_rq#" + this.nextLocalRequestCode.getAndIncrement(), this, gxVar, goVar);
    }

    @Override // android.app.Activity
    @yfp
    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        intent.getClass();
        super.startActivityForResult(intent, i, bundle);
    }

    @Override // android.app.Activity
    @yfp
    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        intentSender.getClass();
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    @Override // defpackage.cve
    public void addMenuProvider(cvk cvkVar, dvk dvkVar, dvd dvdVar) {
        cvkVar.getClass();
        dvkVar.getClass();
        dvdVar.getClass();
        this.menuHostHelper.c(cvkVar, dvkVar, dvdVar);
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z, Configuration configuration) {
        configuration.getClass();
        this.dispatchingOnMultiWindowModeChanged = true;
        try {
            super.onMultiWindowModeChanged(z, configuration);
            this.dispatchingOnMultiWindowModeChanged = false;
            Iterator<cuh<shy>> it = this.onMultiWindowModeChangedListeners.iterator();
            it.getClass();
            while (it.hasNext()) {
                it.next().accept(new shy(z));
            }
        } catch (Throwable th) {
            this.dispatchingOnMultiWindowModeChanged = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        configuration.getClass();
        this.dispatchingOnPictureInPictureModeChanged = true;
        try {
            super.onPictureInPictureModeChanged(z, configuration);
            this.dispatchingOnPictureInPictureModeChanged = false;
            Iterator<cuh<shy>> it = this.onPictureInPictureModeChangedListeners.iterator();
            it.getClass();
            while (it.hasNext()) {
                it.next().accept(new shy(z));
            }
        } catch (Throwable th) {
            this.dispatchingOnPictureInPictureModeChanged = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        initializeViewTreeOwners();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        this.reportFullyDrawnExecutor.b(decorView);
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        this.reportFullyDrawnExecutor.b(decorView);
        super.setContentView(view, layoutParams);
    }

    private static /* synthetic */ void getSavedStateRegistryController$annotations() {
    }

    public fl(int i) {
        this();
        this.contentLayoutId = i;
    }
}
