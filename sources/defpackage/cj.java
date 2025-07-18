package defpackage;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatViewInflater;
import android.support.v7.widget.ActionBarContextView;
import android.support.v7.widget.ContentFrameLayout;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashSet;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cj extends bv implements LayoutInflater.Factory2, ds {
    private static final mi L = new mi();
    private static final int[] M = {R.attr.windowBackground};
    public static final boolean i = !"robolectric".equals(Build.FINGERPRINT);
    boolean A;
    public ch B;
    public boolean C;
    boolean D;
    public Configuration E;
    public int F;
    public boolean G;
    public int H;
    public Rect I;
    public Rect J;
    private cb N;
    private CharSequence O;
    private ci P;
    private TextView Q;
    private boolean R;
    private boolean S;
    private boolean T;
    private ch[] U;
    private boolean V;
    private boolean W;
    private int X;
    private int Y;
    private boolean Z;
    private ce aa;
    private ce ab;
    private boolean ad;
    private AppCompatViewInflater ae;
    private OnBackInvokedDispatcher af;
    private OnBackInvokedCallback ag;
    private ci ah;
    final Object j;
    final Context k;
    public Window l;
    bk m;
    MenuInflater n;
    public gt o;
    cy p;
    public ActionBarContextView q;
    public PopupWindow r;
    public Runnable s;
    public boolean u;
    ViewGroup v;
    boolean w;
    boolean x;
    boolean y;
    boolean z;
    public asv K = null;
    public boolean t = true;
    private final Runnable ac = new ac(this, 4, null);

    public cj(Context context, Window window, Object obj) {
        bs bsVar = null;
        this.X = -100;
        this.k = context;
        this.j = obj;
        if (obj instanceof Dialog) {
            while (true) {
                if (context != null) {
                    if (!(context instanceof bs)) {
                        if (!(context instanceof ContextWrapper)) {
                            break;
                        } else {
                            context = ((ContextWrapper) context).getBaseContext();
                        }
                    } else {
                        bsVar = (bs) context;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (bsVar != null) {
                this.X = ((cj) bsVar.f()).X;
            }
        }
        if (this.X == -100) {
            mi miVar = L;
            Integer num = (Integer) miVar.get(this.j.getClass().getName());
            if (num != null) {
                this.X = num.intValue();
                miVar.remove(this.j.getClass().getName());
            }
        }
        if (window != null) {
            S(window);
        }
        fm.f();
    }

    private final ce Q(Context context) {
        if (this.ab == null) {
            this.ab = new cc(this, context);
        }
        return this.ab;
    }

    private final ce R(Context context) {
        if (this.aa == null) {
            if (bzt.d == null) {
                Context applicationContext = context.getApplicationContext();
                bzt.d = new bzt(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.aa = new cf(this, bzt.d);
        }
        return this.aa;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void S(android.view.Window r4) {
        /*
            r3 = this;
            android.view.Window r0 = r3.l
            java.lang.String r1 = "AppCompat has already installed itself into the Window"
            if (r0 != 0) goto L5b
            android.view.Window$Callback r0 = r4.getCallback()
            boolean r2 = r0 instanceof defpackage.cb
            if (r2 != 0) goto L55
            cb r1 = new cb
            r1.<init>(r3, r0)
            r3.N = r1
            r4.setCallback(r1)
            android.content.Context r0 = r3.k
            int[] r1 = defpackage.cj.M
            r2 = 0
            aps r0 = defpackage.aps.q(r0, r2, r1)
            r1 = 0
            android.graphics.drawable.Drawable r1 = r0.j(r1)
            if (r1 == 0) goto L2b
            r4.setBackgroundDrawable(r1)
        L2b:
            r0.m()
            r3.l = r4
            int r4 = android.os.Build.VERSION.SDK_INT
            r0 = 33
            if (r4 < r0) goto L54
            android.window.OnBackInvokedDispatcher r4 = r3.af
            if (r4 != 0) goto L54
            java.lang.Object r4 = r3.j
            boolean r0 = r4 instanceof android.app.Activity
            if (r0 == 0) goto L4f
            android.app.Activity r4 = (android.app.Activity) r4
            android.view.Window r0 = r4.getWindow()
            if (r0 == 0) goto L4f
            android.window.OnBackInvokedDispatcher r4 = defpackage.ac$$ExternalSyntheticApiModelOutline0.m(r4)
            r3.af = r4
            goto L51
        L4f:
            r3.af = r2
        L51:
            r3.F()
        L54:
            return
        L55:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            r4.<init>(r1)
            throw r4
        L5b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            r4.<init>(r1)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cj.S(android.view.Window):void");
    }

    private final void T() {
        if (this.l == null) {
            Object obj = this.j;
            if (obj instanceof Activity) {
                S(((Activity) obj).getWindow());
            }
        }
        if (this.l == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    private final void U(int i2) {
        this.H = (1 << i2) | this.H;
        if (this.G) {
            return;
        }
        View decorView = this.l.getDecorView();
        Runnable runnable = this.ac;
        int[] iArr = qv.a;
        decorView.postOnAnimation(runnable);
        this.G = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:89:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:98:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void V(defpackage.ch r14, android.view.KeyEvent r15) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.SecurityException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 452
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cj.V(ch, android.view.KeyEvent):void");
    }

    private final void W() {
        if (this.u) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    private final void X(boolean z) throws IllegalAccessException, NoSuchFieldException, PackageManager.NameNotFoundException, IllegalArgumentException {
        P(z, true);
    }

    public final void A(int i2) {
        ch chVarN = N(i2);
        if (chVarN.h != null) {
            Bundle bundle = new Bundle();
            chVarN.h.o(bundle);
            if (bundle.size() > 0) {
                chVarN.p = bundle;
            }
            chVarN.h.s();
            chVarN.h.clear();
        }
        chVarN.o = true;
        chVarN.n = true;
        if ((i2 == 108 || i2 == 0) && this.o != null) {
            ch chVarN2 = N(0);
            chVarN2.k = false;
            J(chVarN2, null);
        }
    }

    public final void B() {
        asv asvVar = this.K;
        if (asvVar != null) {
            asvVar.O();
        }
    }

    public final void C() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        ViewGroup viewGroup;
        if (this.u) {
            return;
        }
        Context lhVar = this.k;
        TypedArray typedArrayObtainStyledAttributes = lhVar.obtainStyledAttributes(cu.j);
        if (!typedArrayObtainStyledAttributes.hasValue(117)) {
            typedArrayObtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (typedArrayObtainStyledAttributes.getBoolean(126, false)) {
            p(1);
        } else if (typedArrayObtainStyledAttributes.getBoolean(117, false)) {
            p(108);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(118, false)) {
            p(109);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(119, false)) {
            p(10);
        }
        this.z = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        T();
        this.l.getDecorView();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(lhVar);
        if (this.A) {
            viewGroup = this.y ? (ViewGroup) layoutInflaterFrom.inflate(com.google.android.tv.remote.service.R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) layoutInflaterFrom.inflate(com.google.android.tv.remote.service.R.layout.abc_screen_simple, (ViewGroup) null);
        } else if (this.z) {
            viewGroup = (ViewGroup) layoutInflaterFrom.inflate(com.google.android.tv.remote.service.R.layout.abc_dialog_title_material, (ViewGroup) null);
            this.x = false;
            this.w = false;
        } else if (this.w) {
            TypedValue typedValue = new TypedValue();
            lhVar.getTheme().resolveAttribute(com.google.android.tv.remote.service.R.attr.actionBarTheme, typedValue, true);
            if (typedValue.resourceId != 0) {
                lhVar = new lh(lhVar, typedValue.resourceId);
            }
            viewGroup = (ViewGroup) LayoutInflater.from(lhVar).inflate(com.google.android.tv.remote.service.R.layout.abc_screen_toolbar, (ViewGroup) null);
            gt gtVar = (gt) viewGroup.findViewById(com.google.android.tv.remote.service.R.id.decor_content_parent);
            this.o = gtVar;
            gtVar.n(v());
            if (this.x) {
                this.o.c(109);
            }
            if (this.R) {
                this.o.c(2);
            }
            if (this.S) {
                this.o.c(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.w + ", windowActionBarOverlay: " + this.x + ", android:windowIsFloating: " + this.z + ", windowActionModeOverlay: " + this.y + ", windowNoTitle: " + this.A + " }");
        }
        bw bwVar = new bw(this);
        int[] iArr = qv.a;
        qm.i(viewGroup, bwVar);
        if (this.o == null) {
            this.Q = (TextView) viewGroup.findViewById(com.google.android.tv.remote.service.R.id.title);
        }
        try {
            Method method = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", null);
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            method.invoke(viewGroup, null);
        } catch (IllegalAccessException e) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e);
        } catch (NoSuchMethodException unused) {
            Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
        } catch (InvocationTargetException e2) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e2);
        }
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(com.google.android.tv.remote.service.R.id.action_bar_activity_content);
        ViewGroup viewGroup2 = (ViewGroup) this.l.findViewById(R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(R.id.content);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.l.setContentView(viewGroup);
        contentFrameLayout.i = new byj(this, null);
        this.v = viewGroup;
        Object obj = this.j;
        CharSequence title = obj instanceof Activity ? ((Activity) obj).getTitle() : this.O;
        if (!TextUtils.isEmpty(title)) {
            gt gtVar2 = this.o;
            if (gtVar2 != null) {
                gtVar2.o(title);
            } else {
                bk bkVar = this.m;
                if (bkVar != null) {
                    bkVar.f(title);
                } else {
                    TextView textView = this.Q;
                    if (textView != null) {
                        textView.setText(title);
                    }
                }
            }
        }
        ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.v.findViewById(R.id.content);
        View decorView = this.l.getDecorView();
        contentFrameLayout2.h.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        if (contentFrameLayout2.isLaidOut()) {
            contentFrameLayout2.requestLayout();
        }
        TypedArray typedArrayObtainStyledAttributes2 = this.k.obtainStyledAttributes(cu.j);
        if (contentFrameLayout2.b == null) {
            contentFrameLayout2.b = new TypedValue();
        }
        typedArrayObtainStyledAttributes2.getValue(124, contentFrameLayout2.b);
        if (contentFrameLayout2.c == null) {
            contentFrameLayout2.c = new TypedValue();
        }
        typedArrayObtainStyledAttributes2.getValue(125, contentFrameLayout2.c);
        if (typedArrayObtainStyledAttributes2.hasValue(122)) {
            if (contentFrameLayout2.d == null) {
                contentFrameLayout2.d = new TypedValue();
            }
            typedArrayObtainStyledAttributes2.getValue(122, contentFrameLayout2.d);
        }
        if (typedArrayObtainStyledAttributes2.hasValue(123)) {
            if (contentFrameLayout2.e == null) {
                contentFrameLayout2.e = new TypedValue();
            }
            typedArrayObtainStyledAttributes2.getValue(123, contentFrameLayout2.e);
        }
        if (typedArrayObtainStyledAttributes2.hasValue(120)) {
            if (contentFrameLayout2.f == null) {
                contentFrameLayout2.f = new TypedValue();
            }
            typedArrayObtainStyledAttributes2.getValue(120, contentFrameLayout2.f);
        }
        if (typedArrayObtainStyledAttributes2.hasValue(121)) {
            if (contentFrameLayout2.g == null) {
                contentFrameLayout2.g = new TypedValue();
            }
            typedArrayObtainStyledAttributes2.getValue(121, contentFrameLayout2.g);
        }
        typedArrayObtainStyledAttributes2.recycle();
        contentFrameLayout2.requestLayout();
        this.u = true;
        ch chVarN = N(0);
        if (this.D || chVarN.h != null) {
            return;
        }
        U(108);
    }

    public final void D() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        C();
        if (this.w && this.m == null) {
            Object obj = this.j;
            if (obj instanceof Activity) {
                this.m = new ct((Activity) obj, this.x);
            } else if (obj instanceof Dialog) {
                this.m = new ct((Dialog) obj);
            }
            bk bkVar = this.m;
            if (bkVar != null) {
                bkVar.c(this.ad);
            }
        }
    }

    @Override // defpackage.ds
    public final void E(du duVar) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        gt gtVar = this.o;
        if (gtVar == null || !gtVar.p() || (ViewConfiguration.get(this.k).hasPermanentMenuKey() && !this.o.r())) {
            ch chVarN = N(0);
            chVarN.n = true;
            z(chVarN, false);
            V(chVarN, null);
            return;
        }
        Window.Callback callbackV = v();
        if (this.o.s()) {
            this.o.q();
            if (this.D) {
                return;
            }
            callbackV.onPanelClosed(108, N(0).h);
            return;
        }
        if (callbackV == null || this.D) {
            return;
        }
        if (this.G && (1 & this.H) != 0) {
            View decorView = this.l.getDecorView();
            Runnable runnable = this.ac;
            decorView.removeCallbacks(runnable);
            runnable.run();
        }
        ch chVarN2 = N(0);
        du duVar2 = chVarN2.h;
        if (duVar2 == null || chVarN2.o || !callbackV.onPreparePanel(0, chVarN2.g, duVar2)) {
            return;
        }
        callbackV.onMenuOpened(108, chVarN2.h);
        this.o.u();
    }

    final void F() {
        if (Build.VERSION.SDK_INT >= 33) {
            if (this.af == null || (!N(0).m && this.p == null)) {
                OnBackInvokedCallback onBackInvokedCallback = this.ag;
                if (onBackInvokedCallback != null) {
                    this.af.unregisterOnBackInvokedCallback(onBackInvokedCallback);
                    this.ag = null;
                    return;
                }
                return;
            }
            if (this.ag == null) {
                OnBackInvokedDispatcher onBackInvokedDispatcher = this.af;
                abd abdVar = new abd(this, 1);
                onBackInvokedDispatcher.registerOnBackInvokedCallback(1000000, abdVar);
                this.ag = abdVar;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:81:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final boolean G(android.view.KeyEvent r7) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.SecurityException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 251
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cj.G(android.view.KeyEvent):boolean");
    }

    public final boolean H() {
        jx jxVar;
        boolean z = this.V;
        this.V = false;
        ch chVarN = N(0);
        if (chVarN.m) {
            if (!z) {
                z(chVarN, true);
            }
            return true;
        }
        cy cyVar = this.p;
        if (cyVar != null) {
            cyVar.f();
            return true;
        }
        bk bkVarB = b();
        if (bkVarB != null && (jxVar = ((ct) bkVarB).p) != null) {
            Toolbar toolbar = jxVar.a;
            if (toolbar.u()) {
                toolbar.j();
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ds
    public final boolean I(du duVar, MenuItem menuItem) {
        ch chVarU;
        Window.Callback callbackV = v();
        if (callbackV == null || this.D || (chVarU = u(duVar.a())) == null) {
            return false;
        }
        return callbackV.onMenuItemSelected(chVarU.a, menuItem);
    }

    public final boolean J(ch chVar, KeyEvent keyEvent) {
        gt gtVar;
        gt gtVar2;
        Resources.Theme themeNewTheme;
        gt gtVar3;
        gt gtVar4;
        if (this.D) {
            return false;
        }
        if (chVar.k) {
            return true;
        }
        ch chVar2 = this.B;
        if (chVar2 != null && chVar2 != chVar) {
            z(chVar2, false);
        }
        Window.Callback callbackV = v();
        if (callbackV != null) {
            chVar.g = callbackV.onCreatePanelView(chVar.a);
        }
        int i2 = chVar.a;
        boolean z = i2 == 0 || i2 == 108;
        if (z && (gtVar4 = this.o) != null) {
            gtVar4.m();
        }
        if (chVar.g == null) {
            du duVar = chVar.h;
            if (duVar == null || chVar.o) {
                if (duVar == null) {
                    Context context = this.k;
                    if ((i2 == 0 || i2 == 108) && this.o != null) {
                        TypedValue typedValue = new TypedValue();
                        Resources.Theme theme = context.getTheme();
                        theme.resolveAttribute(com.google.android.tv.remote.service.R.attr.actionBarTheme, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            themeNewTheme = context.getResources().newTheme();
                            themeNewTheme.setTo(theme);
                            themeNewTheme.applyStyle(typedValue.resourceId, true);
                            themeNewTheme.resolveAttribute(com.google.android.tv.remote.service.R.attr.actionBarWidgetTheme, typedValue, true);
                        } else {
                            theme.resolveAttribute(com.google.android.tv.remote.service.R.attr.actionBarWidgetTheme, typedValue, true);
                            themeNewTheme = null;
                        }
                        if (typedValue.resourceId != 0) {
                            if (themeNewTheme == null) {
                                themeNewTheme = context.getResources().newTheme();
                                themeNewTheme.setTo(theme);
                            }
                            themeNewTheme.applyStyle(typedValue.resourceId, true);
                        }
                        if (themeNewTheme != null) {
                            lh lhVar = new lh(context, 0);
                            lhVar.getTheme().setTo(themeNewTheme);
                            context = lhVar;
                        }
                    }
                    du duVar2 = new du(context);
                    duVar2.b = this;
                    chVar.a(duVar2);
                    if (chVar.h == null) {
                        return false;
                    }
                }
                if (z && (gtVar2 = this.o) != null) {
                    if (this.ah == null) {
                        this.ah = new ci(this, 1);
                    }
                    gtVar2.l(chVar.h, this.ah);
                }
                chVar.h.s();
                if (!callbackV.onCreatePanelMenu(i2, chVar.h)) {
                    chVar.a(null);
                    if (z && (gtVar = this.o) != null) {
                        gtVar.l(null, this.ah);
                    }
                    return false;
                }
                chVar.o = false;
            }
            chVar.h.s();
            Bundle bundle = chVar.p;
            if (bundle != null) {
                chVar.h.n(bundle);
                chVar.p = null;
            }
            if (!callbackV.onPreparePanel(0, chVar.g, chVar.h)) {
                if (z && (gtVar3 = this.o) != null) {
                    gtVar3.l(null, this.ah);
                }
                chVar.h.r();
                return false;
            }
            chVar.h.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
            chVar.h.r();
        }
        chVar.k = true;
        chVar.l = false;
        this.B = chVar;
        return true;
    }

    public final boolean K() {
        ViewGroup viewGroup;
        return this.u && (viewGroup = this.v) != null && viewGroup.isLaidOut();
    }

    public final void L() throws IllegalAccessException, NoSuchFieldException, PackageManager.NameNotFoundException, IllegalArgumentException {
        X(true);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0146  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View M(java.lang.String r8, android.content.Context r9, android.util.AttributeSet r10) {
        /*
            Method dump skipped, instructions count: 614
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cj.M(java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    public final ch N(int i2) {
        ch[] chVarArr = this.U;
        if (chVarArr == null || chVarArr.length <= i2) {
            ch[] chVarArr2 = new ch[i2 + 1];
            if (chVarArr != null) {
                System.arraycopy(chVarArr, 0, chVarArr2, 0, chVarArr.length);
            }
            this.U = chVarArr2;
            chVarArr = chVarArr2;
        }
        ch chVar = chVarArr[i2];
        if (chVar != null) {
            return chVar;
        }
        ch chVar2 = new ch(i2);
        chVarArr[i2] = chVar2;
        return chVar2;
    }

    public final boolean O(ch chVar, int i2, KeyEvent keyEvent) {
        du duVar;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((chVar.k || J(chVar, keyEvent)) && (duVar = chVar.h) != null) {
            return duVar.performShortcut(i2, keyEvent, 1);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:119:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void P(boolean r13, boolean r14) throws java.lang.IllegalAccessException, java.lang.NoSuchFieldException, android.content.pm.PackageManager.NameNotFoundException, java.lang.IllegalArgumentException {
        /*
            Method dump skipped, instructions count: 458
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cj.P(boolean, boolean):void");
    }

    @Override // defpackage.bv
    public final Context a() {
        return this.k;
    }

    @Override // defpackage.bv
    public final bk b() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        D();
        return this.m;
    }

    @Override // defpackage.bv
    public final View c(int i2) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        C();
        return this.l.findViewById(i2);
    }

    @Override // defpackage.bv
    public final void d(View view, ViewGroup.LayoutParams layoutParams) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        C();
        ((ViewGroup) this.v.findViewById(R.id.content)).addView(view, layoutParams);
        this.N.a(this.l.getCallback());
    }

    @Override // defpackage.bv
    public final void e() {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.k);
        if (layoutInflaterFrom.getFactory() == null) {
            layoutInflaterFrom.setFactory2(this);
        } else {
            if (layoutInflaterFrom.getFactory2() instanceof cj) {
                return;
            }
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    @Override // defpackage.bv
    public final void f() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (this.m != null) {
            b();
            U(0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004c  */
    @Override // defpackage.bv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.j
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L11
            java.lang.Object r0 = defpackage.bv.g
            monitor-enter(r0)
            defpackage.bv.i(r3)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            goto L11
        Le:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r1
        L11:
            boolean r0 = r3.G
            if (r0 == 0) goto L20
            android.view.Window r0 = r3.l
            android.view.View r0 = r0.getDecorView()
            java.lang.Runnable r1 = r3.ac
            r0.removeCallbacks(r1)
        L20:
            r0 = 1
            r3.D = r0
            int r0 = r3.X
            r1 = -100
            if (r0 == r1) goto L4c
            java.lang.Object r0 = r3.j
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L4c
            r1 = r0
            android.app.Activity r1 = (android.app.Activity) r1
            boolean r1 = r1.isChangingConfigurations()
            if (r1 == 0) goto L4c
            mi r1 = defpackage.cj.L
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getName()
            int r2 = r3.X
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1.put(r0, r2)
            goto L5b
        L4c:
            java.lang.Object r0 = r3.j
            mi r1 = defpackage.cj.L
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getName()
            r1.remove(r0)
        L5b:
            ce r0 = r3.aa
            if (r0 == 0) goto L62
            r0.c()
        L62:
            ce r0 = r3.ab
            if (r0 == 0) goto L69
            r0.c()
        L69:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cj.g():void");
    }

    @Override // defpackage.bv
    public final void h() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        bk bkVarB = b();
        if (bkVarB != null) {
            bkVarB.e(false);
        }
    }

    @Override // defpackage.bv
    public final void j(int i2) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        C();
        ViewGroup viewGroup = (ViewGroup) this.v.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.k).inflate(i2, viewGroup);
        this.N.a(this.l.getCallback());
    }

    @Override // defpackage.bv
    public final void k(View view) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        C();
        ViewGroup viewGroup = (ViewGroup) this.v.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.N.a(this.l.getCallback());
    }

    @Override // defpackage.bv
    public final void l(View view, ViewGroup.LayoutParams layoutParams) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        C();
        ViewGroup viewGroup = (ViewGroup) this.v.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.N.a(this.l.getCallback());
    }

    @Override // defpackage.bv
    public final void m(CharSequence charSequence) {
        this.O = charSequence;
        gt gtVar = this.o;
        if (gtVar != null) {
            gtVar.o(charSequence);
            return;
        }
        bk bkVar = this.m;
        if (bkVar != null) {
            bkVar.f(charSequence);
            return;
        }
        TextView textView = this.Q;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    @Override // defpackage.bv
    public final void o() throws IllegalAccessException, NoSuchFieldException, PackageManager.NameNotFoundException, IllegalArgumentException {
        String strC;
        this.C = true;
        X(false);
        T();
        Object obj = this.j;
        if (obj instanceof Activity) {
            try {
                strC = ii.C((Activity) obj);
            } catch (IllegalArgumentException unused) {
                strC = null;
            }
            if (strC != null) {
                bk bkVar = this.m;
                if (bkVar == null) {
                    this.ad = true;
                } else {
                    bkVar.c(true);
                }
            }
            synchronized (bv.g) {
                bv.i(this);
                bv.f.add(new WeakReference(this));
            }
        }
        this.E = new Configuration(this.k.getResources().getConfiguration());
        this.W = true;
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return M(str, context, attributeSet);
    }

    @Override // defpackage.bv
    public final void p(int i2) {
        if (i2 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i2 = 108;
        } else if (i2 == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i2 = 109;
        }
        if (this.A && i2 == 108) {
            return;
        }
        if (this.w && i2 == 1) {
            this.w = false;
        }
        if (i2 == 1) {
            W();
            this.A = true;
            return;
        }
        if (i2 == 2) {
            W();
            this.R = true;
            return;
        }
        if (i2 == 5) {
            W();
            this.S = true;
            return;
        }
        if (i2 == 10) {
            W();
            this.y = true;
        } else if (i2 == 108) {
            W();
            this.w = true;
        } else if (i2 != 109) {
            this.l.requestFeature(i2);
        } else {
            W();
            this.x = true;
        }
    }

    public final int q() {
        int i2 = this.X;
        return i2 != -100 ? i2 : bv.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:65:0x011e A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final int r(android.content.Context r22, int r23) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cj.r(android.content.Context, int):int");
    }

    final Context s() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        bk bkVarB = b();
        Context contextA = bkVarB != null ? bkVarB.a() : null;
        return contextA == null ? this.k : contextA;
    }

    public final Configuration t(Context context, int i2, oi oiVar, Configuration configuration, boolean z) {
        int i3 = i2 != 1 ? i2 != 2 ? z ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i3 | (configuration2.uiMode & (-49));
        if (oiVar != null) {
            ii.M(configuration2, oiVar);
        }
        return configuration2;
    }

    final ch u(Menu menu) {
        ch[] chVarArr = this.U;
        int length = chVarArr != null ? chVarArr.length : 0;
        for (int i2 = 0; i2 < length; i2++) {
            ch chVar = chVarArr[i2];
            if (chVar != null && chVar.h == menu) {
                return chVar;
            }
        }
        return null;
    }

    final Window.Callback v() {
        return this.l.getCallback();
    }

    final oi w(Context context) {
        oi oiVar;
        oi oiVarB;
        if (Build.VERSION.SDK_INT >= 33 || (oiVar = bv.c) == null) {
            return null;
        }
        oi oiVarL = ii.L(context.getApplicationContext().getResources().getConfiguration());
        if (oiVar.g()) {
            oiVarB = oi.a;
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i2 = 0;
            while (i2 < oiVar.a() + oiVarL.a()) {
                Locale localeF = i2 < oiVar.a() ? oiVar.f(i2) : oiVarL.f(i2 - oiVar.a());
                if (localeF != null) {
                    linkedHashSet.add(localeF);
                }
                i2++;
            }
            oiVarB = oi.b((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]));
        }
        return oiVarB.g() ? oiVarL : oiVarB;
    }

    final void x(int i2, ch chVar, Menu menu) {
        if (menu == null) {
            menu = chVar.h;
        }
        if (chVar.m && !this.D) {
            cb cbVar = this.N;
            Window.Callback callback = this.l.getCallback();
            try {
                cbVar.b = true;
                callback.onPanelClosed(i2, menu);
            } finally {
                cbVar.b = false;
            }
        }
    }

    final void y(du duVar) {
        if (this.T) {
            return;
        }
        this.T = true;
        this.o.a();
        Window.Callback callbackV = v();
        if (callbackV != null && !this.D) {
            callbackV.onPanelClosed(108, duVar);
        }
        this.T = false;
    }

    final void z(ch chVar, boolean z) {
        ViewGroup viewGroup;
        gt gtVar;
        if (z && chVar.a == 0 && (gtVar = this.o) != null && gtVar.s()) {
            y(chVar.h);
            return;
        }
        WindowManager windowManager = (WindowManager) this.k.getSystemService("window");
        if (windowManager != null && chVar.m && (viewGroup = chVar.e) != null) {
            windowManager.removeView(viewGroup);
            if (z) {
                x(chVar.a, chVar, null);
            }
        }
        chVar.k = false;
        chVar.l = false;
        chVar.m = false;
        chVar.f = null;
        chVar.n = true;
        if (this.B == chVar) {
            this.B = null;
        }
        if (chVar.a == 0) {
            F();
        }
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return M(str, context, attributeSet);
    }
}
