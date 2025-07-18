package defpackage;

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
import com.google.android.katniss.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public class tt extends eq implements bcl, bem, bbz, bqs, uj, uy, abu, abv, ec, ed, agc {
    private final age a;
    private bel b;
    private final agpc c;
    private final AtomicInteger d;
    private final CopyOnWriteArrayList e;
    public final un f;
    public final bqr g;
    public final ux h;
    public final CopyOnWriteArrayList i;
    public final ui j;
    public final tp k;
    private final CopyOnWriteArrayList l;
    private final CopyOnWriteArrayList m;
    private final CopyOnWriteArrayList n;
    private final CopyOnWriteArrayList o;
    private boolean p;
    private boolean q;
    private final agpc r;
    private final agpc s;

    public tt() {
        un unVar = new un();
        this.f = unVar;
        this.a = new age(new Runnable() { // from class: tb
            @Override // java.lang.Runnable
            public final void run() {
                this.a.invalidateOptionsMenu();
            }
        });
        bqr bqrVarA = bqr.a.a(this);
        this.g = bqrVarA;
        this.k = new tp(this);
        this.c = new agpn(new agum() { // from class: td
            @Override // defpackage.agum
            public final Object a() {
                return new uc(this.a.k);
            }
        });
        this.d = new AtomicInteger();
        this.h = new ts(this);
        this.e = new CopyOnWriteArrayList();
        this.l = new CopyOnWriteArrayList();
        this.i = new CopyOnWriteArrayList();
        this.m = new CopyOnWriteArrayList();
        this.n = new CopyOnWriteArrayList();
        this.o = new CopyOnWriteArrayList();
        if (ek() == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        ek().b(new bcj() { // from class: te
            @Override // defpackage.bcj
            public final void a(bcl bclVar, bce bceVar) {
                Window window;
                View viewPeekDecorView;
                if (bceVar != bce.ON_STOP || (window = this.a.getWindow()) == null || (viewPeekDecorView = window.peekDecorView()) == null) {
                    return;
                }
                viewPeekDecorView.cancelPendingInputEvents();
            }
        });
        ek().b(new bcj() { // from class: tf
            @Override // defpackage.bcj
            public final void a(bcl bclVar, bce bceVar) {
                if (bceVar == bce.ON_DESTROY) {
                    tt ttVar = this.a;
                    ttVar.f.a = null;
                    if (!ttVar.isChangingConfigurations()) {
                        ttVar.el().c();
                    }
                    tp tpVar = ttVar.k;
                    tt ttVar2 = tpVar.b;
                    ttVar2.getWindow().getDecorView().removeCallbacks(tpVar);
                    ttVar2.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(tpVar);
                }
            }
        });
        ek().b(new tm(this));
        bqrVarA.b.b();
        bds.c(this);
        bqrVarA.c.a("android:support:activity-result", new bqn() { // from class: tg
            @Override // defpackage.bqn
            public final Bundle a() {
                Bundle bundle = new Bundle();
                ux uxVar = this.a.h;
                Map map = uxVar.c;
                bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(map.values()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(map.keySet()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(uxVar.d));
                bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(uxVar.g));
                return bundle;
            }
        });
        unVar.a(new uo() { // from class: th
            @Override // defpackage.uo
            public final void a() {
                tt ttVar = this.a;
                Bundle bundleA = ttVar.g.c.a.a("android:support:activity-result");
                if (bundleA != null) {
                    ux uxVar = ttVar.h;
                    ArrayList<Integer> integerArrayList = bundleA.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
                    ArrayList<String> stringArrayList = bundleA.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
                    if (stringArrayList == null || integerArrayList == null) {
                        return;
                    }
                    ArrayList<String> stringArrayList2 = bundleA.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                    if (stringArrayList2 != null) {
                        uxVar.d.addAll(stringArrayList2);
                    }
                    Bundle bundle = bundleA.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
                    if (bundle != null) {
                        uxVar.g.putAll(bundle);
                    }
                    int size = stringArrayList.size();
                    for (int i = 0; i < size; i++) {
                        String str = stringArrayList.get(i);
                        Map map = uxVar.c;
                        if (map.containsKey(str)) {
                            Integer num = (Integer) map.remove(str);
                            if (!uxVar.g.containsKey(str)) {
                                uxVar.b.remove(num);
                            }
                        }
                        Integer num2 = integerArrayList.get(i);
                        num2.getClass();
                        int iIntValue = num2.intValue();
                        String str2 = stringArrayList.get(i);
                        str2.getClass();
                        uxVar.e(iIntValue, str2);
                    }
                }
            }
        });
        this.r = new agpn(new agum() { // from class: ti
            @Override // defpackage.agum
            public final Object a() {
                tt ttVar = this.a;
                return new bdw(ttVar.getApplication(), ttVar, ttVar.getIntent() != null ? ttVar.getIntent().getExtras() : null);
            }
        });
        this.s = new agpn(new agum() { // from class: tj
            @Override // defpackage.agum
            public final Object a() {
                final tt ttVar = this.a;
                final ui uiVar = new ui(new Runnable() { // from class: tk
                    @Override // java.lang.Runnable
                    public final void run() {
                        tt.dm(ttVar);
                    }
                });
                if (Build.VERSION.SDK_INT >= 33) {
                    if (!agvy.c(Looper.myLooper(), Looper.getMainLooper())) {
                        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: tl
                            @Override // java.lang.Runnable
                            public final void run() {
                                ttVar.df(uiVar);
                            }
                        });
                        return uiVar;
                    }
                    ttVar.df(uiVar);
                }
                return uiVar;
            }
        });
        this.j = dc();
    }

    public static final void dm(tt ttVar) {
        try {
            super.onBackPressed();
        } catch (IllegalStateException e) {
            if (!agvy.c(e.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                throw e;
            }
        } catch (NullPointerException e2) {
            if (!agvy.c(e2.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                throw e2;
            }
        }
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        dl();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        this.k.a(decorView);
        super.addContentView(view, layoutParams);
    }

    public beg dM() {
        return (beg) this.r.a();
    }

    public final uc db() {
        return (uc) this.c.a();
    }

    @Override // defpackage.uj
    public final ui dc() {
        return (ui) this.s.a();
    }

    public final ur dd(vb vbVar, ux uxVar, uq uqVar) {
        uxVar.getClass();
        return uxVar.c("activity_rq#" + this.d.getAndIncrement(), this, vbVar, uqVar);
    }

    @Override // defpackage.uy
    public final ux de() {
        return this.h;
    }

    public final void df(final ui uiVar) {
        ek().b(new bcj() { // from class: tc
            @Override // defpackage.bcj
            public final void a(bcl bclVar, bce bceVar) {
                if (bceVar == bce.ON_CREATE) {
                    tt ttVar = this;
                    ui uiVar2 = uiVar;
                    OnBackInvokedDispatcher onBackInvokedDispatcher = ttVar.getOnBackInvokedDispatcher();
                    onBackInvokedDispatcher.getClass();
                    uiVar2.c(onBackInvokedDispatcher);
                }
            }
        });
    }

    @Override // defpackage.abu
    public final void dg(afe afeVar) {
        afeVar.getClass();
        this.e.add(afeVar);
    }

    @Override // defpackage.ec
    public final void dh(afe afeVar) {
        afeVar.getClass();
        this.m.add(afeVar);
    }

    @Override // defpackage.ed
    public final void di(afe afeVar) {
        afeVar.getClass();
        this.n.add(afeVar);
    }

    @Override // defpackage.abv
    public final void dj(afe afeVar) {
        afeVar.getClass();
        this.l.add(afeVar);
    }

    public final void dk() {
        if (this.b == null) {
            tn tnVar = (tn) getLastNonConfigurationInstance();
            if (tnVar != null) {
                this.b = tnVar.a;
            }
            if (this.b == null) {
                this.b = new bel();
            }
        }
    }

    public final void dl() {
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        ben.a(decorView, this);
        View decorView2 = getWindow().getDecorView();
        decorView2.getClass();
        beo.a(decorView2, this);
        View decorView3 = getWindow().getDecorView();
        decorView3.getClass();
        bqt.a(decorView3, this);
        View decorView4 = getWindow().getDecorView();
        decorView4.getClass();
        decorView4.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        View decorView5 = getWindow().getDecorView();
        decorView5.getClass();
        decorView5.setTag(R.id.report_drawn, this);
        View decorView6 = getWindow().getDecorView();
        decorView6.getClass();
        decorView6.setTag(R.id.view_tree_navigation_event_dispatcher_owner, this);
    }

    @Override // defpackage.abu
    public final void dn(afe afeVar) {
        afeVar.getClass();
        this.e.remove(afeVar);
    }

    @Override // defpackage.ec
    /* renamed from: do */
    public final void mo83do(afe afeVar) {
        afeVar.getClass();
        this.m.remove(afeVar);
    }

    @Override // defpackage.ed
    public final void dp(afe afeVar) {
        afeVar.getClass();
        this.n.remove(afeVar);
    }

    @Override // defpackage.abv
    public final void dq(afe afeVar) {
        afeVar.getClass();
        this.l.remove(afeVar);
    }

    @Override // defpackage.agc
    public final void dr(cr crVar) {
        crVar.getClass();
        this.a.d(crVar);
    }

    @Override // defpackage.agc
    public final void ds(cr crVar) {
        crVar.getClass();
        this.a.e(crVar);
    }

    @Override // defpackage.bem
    public final bel el() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        dk();
        bel belVar = this.b;
        belVar.getClass();
        return belVar;
    }

    public bet em() {
        beu beuVar = new beu(ber.a);
        if (getApplication() != null) {
            beuVar.b(bee.b, getApplication());
        }
        beuVar.b(bds.a, this);
        beuVar.b(bds.b, this);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            beuVar.b(bds.c, extras);
        }
        return beuVar;
    }

    @Override // defpackage.bqs
    public final bqo en() {
        return this.g.c;
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i, int i2, Intent intent) {
        if (this.h.g(i, i2, intent)) {
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        this.j.a.c();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        configuration.getClass();
        super.onConfigurationChanged(configuration);
        Iterator it = this.e.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((afe) it.next()).accept(configuration);
        }
    }

    @Override // defpackage.eq, android.app.Activity
    protected void onCreate(Bundle bundle) {
        this.g.b.c(bundle);
        this.f.b(this);
        super.onCreate(bundle);
        bdj.a.b(this);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i, Menu menu) {
        menu.getClass();
        if (i != 0) {
            return true;
        }
        super.onCreatePanelMenu(0, menu);
        this.a.a(menu, getMenuInflater());
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        menuItem.getClass();
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            return this.a.c(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z) {
        if (this.p) {
            return;
        }
        Iterator it = this.m.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((afe) it.next()).accept(new eb(z));
        }
    }

    @Override // android.app.Activity
    protected void onNewIntent(Intent intent) {
        intent.getClass();
        super.onNewIntent(intent);
        Iterator it = this.i.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((afe) it.next()).accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onPanelClosed(int i, Menu menu) {
        menu.getClass();
        Iterator it = this.a.a.iterator();
        while (it.hasNext()) {
            ((cr) it.next()).a.t(menu);
        }
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z) {
        if (this.q) {
            return;
        }
        Iterator it = this.n.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((afe) it.next()).accept(new ee(z));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        menu.getClass();
        if (i != 0) {
            return true;
        }
        super.onPreparePanel(0, view, menu);
        this.a.b(menu);
        return true;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        strArr.getClass();
        iArr.getClass();
        if (this.h.g(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        tn tnVar;
        bel belVar = this.b;
        if (belVar == null && (tnVar = (tn) getLastNonConfigurationInstance()) != null) {
            belVar = tnVar.a;
        }
        if (belVar == null) {
            return null;
        }
        tn tnVar2 = new tn();
        tnVar2.a = belVar;
        return tnVar2;
    }

    @Override // defpackage.eq, android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        if (ek() instanceof bco) {
            bcg bcgVarEk = ek();
            bcgVarEk.getClass();
            ((bco) bcgVarEk).f(bcf.c);
        }
        super.onSaveInstanceState(bundle);
        this.g.b.d(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        super.onTrimMemory(i);
        Iterator it = this.l.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((afe) it.next()).accept(Integer.valueOf(i));
        }
    }

    @Override // android.app.Activity
    protected void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator it = this.o.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    @Override // android.app.Activity
    public final void reportFullyDrawn() {
        try {
            if (btt.e()) {
                btt.b("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            uc ucVarDb = db();
            synchronized (ucVarDb.a) {
                ucVarDb.b = true;
                List list = ucVarDb.c;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((agum) it.next()).a();
                }
                list.clear();
            }
        } finally {
            Trace.endSection();
        }
    }

    @Override // android.app.Activity
    public void setContentView(int i) {
        dl();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        this.k.a(decorView);
        super.setContentView(i);
    }

    @Override // android.app.Activity
    public void startActivityForResult(Intent intent, int i) {
        intent.getClass();
        super.startActivityForResult(intent, i);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) {
        intentSender.getClass();
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    @Override // android.app.Activity
    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        intent.getClass();
        super.startActivityForResult(intent, i, bundle);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        intentSender.getClass();
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z, Configuration configuration) {
        configuration.getClass();
        this.p = true;
        try {
            super.onMultiWindowModeChanged(z, configuration);
            this.p = false;
            Iterator it = this.m.iterator();
            it.getClass();
            while (it.hasNext()) {
                ((afe) it.next()).accept(new eb(z));
            }
        } catch (Throwable th) {
            this.p = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        configuration.getClass();
        this.q = true;
        try {
            super.onPictureInPictureModeChanged(z, configuration);
            this.q = false;
            Iterator it = this.n.iterator();
            it.getClass();
            while (it.hasNext()) {
                ((afe) it.next()).accept(new ee(z));
            }
        } catch (Throwable th) {
            this.q = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        dl();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        this.k.a(decorView);
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        dl();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        this.k.a(decorView);
        super.setContentView(view, layoutParams);
    }
}
