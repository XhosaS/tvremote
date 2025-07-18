package defpackage;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.support.v7.app.AppCompatViewInflater;
import android.support.v7.widget.ActionBarContextView;
import android.support.v7.widget.ContentFrameLayout;
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
public class hf extends gl implements LayoutInflater.Factory2, jh {
    private static final wx M = new wx(0);
    private static final int[] N = {R.attr.windowBackground};
    public static final boolean i = !"robolectric".equals(Build.FINGERPRINT);
    boolean A;
    boolean B;
    boolean C;
    public hd D;
    public boolean E;
    boolean F;
    public Configuration G;
    public int H;
    boolean I;
    int J;
    public Rect K;
    public Rect L;
    private gx O;
    private CharSequence P;
    private gs Q;
    private he R;
    private TextView S;
    private boolean T;
    private boolean U;
    private boolean V;
    private hd[] W;
    private boolean X;
    private boolean Y;
    private int Z;
    private int aa;
    private boolean ab;
    private ha ac;
    private ha ad;
    private boolean af;
    private AppCompatViewInflater ag;
    private OnBackInvokedDispatcher ah;
    private OnBackInvokedCallback ai;
    final Object j;
    final Context k;
    public Window l;
    final gg m;
    public fs n;
    MenuInflater o;
    public nb p;
    ij q;
    ActionBarContextView r;
    public PopupWindow s;
    public Runnable t;
    public boolean w;
    ViewGroup x;
    boolean y;
    boolean z;
    ahw u = null;
    public boolean v = true;
    private final Runnable ae = new gm(this);

    public hf(Context context, Window window, gg ggVar, Object obj) {
        gf gfVar = null;
        this.Z = -100;
        this.k = context;
        this.m = ggVar;
        this.j = obj;
        if (obj instanceof Dialog) {
            while (true) {
                if (context != null) {
                    if (!(context instanceof gf)) {
                        if (!(context instanceof ContextWrapper)) {
                            break;
                        } else {
                            context = ((ContextWrapper) context).getBaseContext();
                        }
                    } else {
                        gfVar = (gf) context;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (gfVar != null) {
                this.Z = ((hf) gfVar.cT()).Z;
            }
        }
        if (this.Z == -100) {
            wx wxVar = M;
            Integer num = (Integer) wxVar.get(this.j.getClass().getName());
            if (num != null) {
                this.Z = num.intValue();
                wxVar.remove(this.j.getClass().getName());
            }
        }
        if (window != null) {
            P(window);
        }
        ll.f();
    }

    private final ha N(Context context) {
        if (this.ad == null) {
            this.ad = new gy(this, context);
        }
        return this.ad;
    }

    private final ha O(Context context) {
        if (this.ac == null) {
            if (hm.a == null) {
                Context applicationContext = context.getApplicationContext();
                hm.a = new hm(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.ac = new hb(this, hm.a);
        }
        return this.ac;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void P(android.view.Window r4) {
        /*
            r3 = this;
            android.view.Window r0 = r3.l
            java.lang.String r1 = "AppCompat has already installed itself into the Window"
            if (r0 != 0) goto L5d
            android.view.Window$Callback r0 = r4.getCallback()
            boolean r2 = r0 instanceof defpackage.gx
            if (r2 != 0) goto L57
            gx r1 = new gx
            r1.<init>(r3, r0)
            r3.O = r1
            r4.setCallback(r1)
            android.content.Context r0 = r3.k
            int[] r1 = defpackage.hf.N
            r2 = 0
            rv r0 = defpackage.rv.e(r0, r2, r1)
            r1 = 0
            android.graphics.drawable.Drawable r1 = r0.c(r1)
            if (r1 == 0) goto L2b
            r4.setBackgroundDrawable(r1)
        L2b:
            android.content.res.TypedArray r0 = r0.b
            r0.recycle()
            r3.l = r4
            int r4 = android.os.Build.VERSION.SDK_INT
            r0 = 33
            if (r4 < r0) goto L56
            android.window.OnBackInvokedDispatcher r4 = r3.ah
            if (r4 != 0) goto L56
            java.lang.Object r4 = r3.j
            boolean r0 = r4 instanceof android.app.Activity
            if (r0 == 0) goto L51
            android.app.Activity r4 = (android.app.Activity) r4
            android.view.Window r0 = r4.getWindow()
            if (r0 == 0) goto L51
            android.window.OnBackInvokedDispatcher r4 = defpackage.fp$$ExternalSyntheticApiModelOutline0.m(r4)
            r3.ah = r4
            goto L53
        L51:
            r3.ah = r2
        L53:
            r3.D()
        L56:
            return
        L57:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            r4.<init>(r1)
            throw r4
        L5d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            r4.<init>(r1)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hf.P(android.view.Window):void");
    }

    private final void Q() {
        if (this.l == null) {
            Object obj = this.j;
            if (obj instanceof Activity) {
                P(((Activity) obj).getWindow());
            }
        }
        if (this.l == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    private final void R(int i2) {
        this.J = (1 << i2) | this.J;
        if (this.I) {
            return;
        }
        View decorView = this.l.getDecorView();
        Runnable runnable = this.ae;
        int[] iArr = ahj.a;
        decorView.postOnAnimation(runnable);
        this.I = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:89:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:98:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void S(defpackage.hd r14, android.view.KeyEvent r15) {
        /*
            Method dump skipped, instructions count: 456
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hf.S(hd, android.view.KeyEvent):void");
    }

    private final void T() {
        if (this.w) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    public final void A() {
        ViewGroup viewGroup;
        if (this.w) {
            return;
        }
        Context veVar = this.k;
        TypedArray typedArrayObtainStyledAttributes = veVar.obtainStyledAttributes(hs.j);
        if (!typedArrayObtainStyledAttributes.hasValue(117)) {
            typedArrayObtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (typedArrayObtainStyledAttributes.getBoolean(126, false)) {
            o(1);
        } else if (typedArrayObtainStyledAttributes.getBoolean(117, false)) {
            o(108);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(118, false)) {
            o(109);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(119, false)) {
            o(10);
        }
        this.B = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        Q();
        this.l.getDecorView();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(veVar);
        if (this.C) {
            viewGroup = this.A ? (ViewGroup) layoutInflaterFrom.inflate(com.google.android.katniss.R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) layoutInflaterFrom.inflate(com.google.android.katniss.R.layout.abc_screen_simple, (ViewGroup) null);
        } else if (this.B) {
            viewGroup = (ViewGroup) layoutInflaterFrom.inflate(com.google.android.katniss.R.layout.abc_dialog_title_material, (ViewGroup) null);
            this.z = false;
            this.y = false;
        } else if (this.y) {
            TypedValue typedValue = new TypedValue();
            veVar.getTheme().resolveAttribute(com.google.android.katniss.R.attr.actionBarTheme, typedValue, true);
            if (typedValue.resourceId != 0) {
                veVar = new ve(veVar, typedValue.resourceId);
            }
            viewGroup = (ViewGroup) LayoutInflater.from(veVar).inflate(com.google.android.katniss.R.layout.abc_screen_toolbar, (ViewGroup) null);
            nb nbVar = (nb) viewGroup.findViewById(com.google.android.katniss.R.id.decor_content_parent);
            this.p = nbVar;
            nbVar.m(this.l.getCallback());
            if (this.z) {
                this.p.c(109);
            }
            if (this.T) {
                this.p.c(2);
            }
            if (this.U) {
                this.p.c(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.y + ", windowActionBarOverlay: " + this.z + ", android:windowIsFloating: " + this.B + ", windowActionModeOverlay: " + this.A + ", windowNoTitle: " + this.C + " }");
        }
        gn gnVar = new gn(this);
        int[] iArr = ahj.a;
        ahc.k(viewGroup, gnVar);
        if (this.p == null) {
            this.S = (TextView) viewGroup.findViewById(com.google.android.katniss.R.id.title);
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
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(com.google.android.katniss.R.id.action_bar_activity_content);
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
        contentFrameLayout.c = new go(this);
        this.x = viewGroup;
        Object obj = this.j;
        CharSequence title = obj instanceof Activity ? ((Activity) obj).getTitle() : this.P;
        if (!TextUtils.isEmpty(title)) {
            nb nbVar2 = this.p;
            if (nbVar2 != null) {
                nbVar2.n(title);
            } else {
                fs fsVar = this.n;
                if (fsVar != null) {
                    fsVar.f(title);
                } else {
                    TextView textView = this.S;
                    if (textView != null) {
                        textView.setText(title);
                    }
                }
            }
        }
        ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.x.findViewById(R.id.content);
        View decorView = this.l.getDecorView();
        contentFrameLayout2.b.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        if (contentFrameLayout2.isLaidOut()) {
            contentFrameLayout2.requestLayout();
        }
        TypedArray typedArrayObtainStyledAttributes2 = this.k.obtainStyledAttributes(hs.j);
        typedArrayObtainStyledAttributes2.getValue(124, contentFrameLayout2.getMinWidthMajor());
        typedArrayObtainStyledAttributes2.getValue(125, contentFrameLayout2.getMinWidthMinor());
        if (typedArrayObtainStyledAttributes2.hasValue(122)) {
            typedArrayObtainStyledAttributes2.getValue(122, contentFrameLayout2.getFixedWidthMajor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(123)) {
            typedArrayObtainStyledAttributes2.getValue(123, contentFrameLayout2.getFixedWidthMinor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(120)) {
            typedArrayObtainStyledAttributes2.getValue(120, contentFrameLayout2.getFixedHeightMajor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(121)) {
            typedArrayObtainStyledAttributes2.getValue(121, contentFrameLayout2.getFixedHeightMinor());
        }
        typedArrayObtainStyledAttributes2.recycle();
        contentFrameLayout2.requestLayout();
        this.w = true;
        hd hdVarL = L(0);
        if (this.F || hdVarL.h != null) {
            return;
        }
        R(108);
    }

    public final void B() {
        A();
        if (this.y && this.n == null) {
            Object obj = this.j;
            if (obj instanceof Activity) {
                this.n = new hr((Activity) obj, this.z);
            } else if (obj instanceof Dialog) {
                this.n = new hr((Dialog) obj);
            }
            fs fsVar = this.n;
            if (fsVar != null) {
                fsVar.c(this.af);
            }
        }
    }

    @Override // defpackage.jh
    public final void C(jj jjVar) {
        nb nbVar = this.p;
        if (nbVar == null || !nbVar.o() || (ViewConfiguration.get(this.k).hasPermanentMenuKey() && !this.p.q())) {
            hd hdVarL = L(0);
            hdVarL.n = true;
            x(hdVarL, false);
            S(hdVarL, null);
            return;
        }
        Window.Callback callback = this.l.getCallback();
        if (this.p.r()) {
            this.p.p();
            if (this.F) {
                return;
            }
            callback.onPanelClosed(108, L(0).h);
            return;
        }
        if (callback == null || this.F) {
            return;
        }
        if (this.I && (1 & this.J) != 0) {
            View decorView = this.l.getDecorView();
            Runnable runnable = this.ae;
            decorView.removeCallbacks(runnable);
            runnable.run();
        }
        hd hdVarL2 = L(0);
        jj jjVar2 = hdVarL2.h;
        if (jjVar2 == null || hdVarL2.o || !callback.onPreparePanel(0, hdVarL2.g, jjVar2)) {
            return;
        }
        callback.onMenuOpened(108, hdVarL2.h);
        this.p.t();
    }

    final void D() {
        if (Build.VERSION.SDK_INT >= 33) {
            if (this.ah == null || (!L(0).m && this.q == null)) {
                OnBackInvokedCallback onBackInvokedCallback = this.ai;
                if (onBackInvokedCallback != null) {
                    this.ah.unregisterOnBackInvokedCallback(onBackInvokedCallback);
                    this.ai = null;
                    return;
                }
                return;
            }
            if (this.ai == null) {
                OnBackInvokedDispatcher onBackInvokedDispatcher = this.ah;
                OnBackInvokedCallback onBackInvokedCallback2 = new OnBackInvokedCallback() { // from class: gw
                    public final void onBackInvoked() {
                        this.a.F();
                    }
                };
                onBackInvokedDispatcher.registerOnBackInvokedCallback(1000000, onBackInvokedCallback2);
                this.ai = onBackInvokedCallback2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final boolean E(android.view.KeyEvent r7) {
        /*
            Method dump skipped, instructions count: 245
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hf.E(android.view.KeyEvent):boolean");
    }

    final boolean F() {
        nc ncVar;
        boolean z = this.X;
        this.X = false;
        hd hdVarL = L(0);
        if (hdVarL.m) {
            if (!z) {
                x(hdVarL, true);
            }
            return true;
        }
        ij ijVar = this.q;
        if (ijVar != null) {
            ijVar.f();
            return true;
        }
        B();
        fs fsVar = this.n;
        if (fsVar == null || (ncVar = ((hr) fsVar).d) == null || !ncVar.s()) {
            return false;
        }
        ncVar.e();
        return true;
    }

    @Override // defpackage.jh
    public final boolean G(jj jjVar, MenuItem menuItem) {
        hd hdVarT;
        Window.Callback callback = this.l.getCallback();
        if (callback == null || this.F || (hdVarT = t(jjVar.a())) == null) {
            return false;
        }
        return callback.onMenuItemSelected(hdVarT.a, menuItem);
    }

    public final boolean H(hd hdVar, KeyEvent keyEvent) {
        nb nbVar;
        nb nbVar2;
        Resources.Theme themeNewTheme;
        nb nbVar3;
        nb nbVar4;
        if (this.F) {
            return false;
        }
        if (hdVar.k) {
            return true;
        }
        hd hdVar2 = this.D;
        if (hdVar2 != null && hdVar2 != hdVar) {
            x(hdVar2, false);
        }
        Window.Callback callback = this.l.getCallback();
        if (callback != null) {
            hdVar.g = callback.onCreatePanelView(hdVar.a);
        }
        int i2 = hdVar.a;
        boolean z = i2 == 0 || i2 == 108;
        if (z && (nbVar4 = this.p) != null) {
            nbVar4.l();
        }
        if (hdVar.g == null) {
            jj jjVar = hdVar.h;
            if (jjVar == null || hdVar.o) {
                if (jjVar == null) {
                    Context context = this.k;
                    if ((i2 == 0 || i2 == 108) && this.p != null) {
                        TypedValue typedValue = new TypedValue();
                        Resources.Theme theme = context.getTheme();
                        theme.resolveAttribute(com.google.android.katniss.R.attr.actionBarTheme, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            themeNewTheme = context.getResources().newTheme();
                            themeNewTheme.setTo(theme);
                            themeNewTheme.applyStyle(typedValue.resourceId, true);
                            themeNewTheme.resolveAttribute(com.google.android.katniss.R.attr.actionBarWidgetTheme, typedValue, true);
                        } else {
                            theme.resolveAttribute(com.google.android.katniss.R.attr.actionBarWidgetTheme, typedValue, true);
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
                            ve veVar = new ve(context, 0);
                            veVar.getTheme().setTo(themeNewTheme);
                            context = veVar;
                        }
                    }
                    jj jjVar2 = new jj(context);
                    jjVar2.b = this;
                    hdVar.a(jjVar2);
                    if (hdVar.h == null) {
                        return false;
                    }
                }
                if (z && (nbVar2 = this.p) != null) {
                    if (this.Q == null) {
                        this.Q = new gs(this);
                    }
                    nbVar2.k(hdVar.h, this.Q);
                }
                hdVar.h.q();
                if (!callback.onCreatePanelMenu(i2, hdVar.h)) {
                    hdVar.a(null);
                    if (z && (nbVar = this.p) != null) {
                        nbVar.k(null, this.Q);
                    }
                    return false;
                }
                hdVar.o = false;
            }
            hdVar.h.q();
            Bundle bundle = hdVar.p;
            if (bundle != null) {
                hdVar.h.l(bundle);
                hdVar.p = null;
            }
            if (!callback.onPreparePanel(0, hdVar.g, hdVar.h)) {
                if (z && (nbVar3 = this.p) != null) {
                    nbVar3.k(null, this.Q);
                }
                hdVar.h.p();
                return false;
            }
            hdVar.h.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
            hdVar.h.p();
        }
        hdVar.k = true;
        hdVar.l = false;
        this.D = hdVar;
        return true;
    }

    final boolean I() {
        ViewGroup viewGroup;
        return this.w && (viewGroup = this.x) != null && viewGroup.isLaidOut();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0195  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void J(boolean r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 433
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hf.J(boolean, boolean):void");
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
    public final android.view.View K(java.lang.String r8, android.content.Context r9, android.util.AttributeSet r10) {
        /*
            Method dump skipped, instructions count: 602
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hf.K(java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    public final hd L(int i2) {
        hd[] hdVarArr = this.W;
        if (hdVarArr == null || hdVarArr.length <= i2) {
            hd[] hdVarArr2 = new hd[i2 + 1];
            if (hdVarArr != null) {
                System.arraycopy(hdVarArr, 0, hdVarArr2, 0, hdVarArr.length);
            }
            this.W = hdVarArr2;
            hdVarArr = hdVarArr2;
        }
        hd hdVar = hdVarArr[i2];
        if (hdVar != null) {
            return hdVar;
        }
        hd hdVar2 = new hd(i2);
        hdVarArr[i2] = hdVar2;
        return hdVar2;
    }

    public final boolean M(hd hdVar, int i2, KeyEvent keyEvent) {
        jj jjVar;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((hdVar.k || H(hdVar, keyEvent)) && (jjVar = hdVar.h) != null) {
            return jjVar.performShortcut(i2, keyEvent, 1);
        }
        return false;
    }

    @Override // defpackage.gl
    public final Context a() {
        return this.k;
    }

    @Override // defpackage.gl
    public final View b(int i2) {
        A();
        return this.l.findViewById(i2);
    }

    @Override // defpackage.gl
    public final void c(View view, ViewGroup.LayoutParams layoutParams) {
        A();
        ((ViewGroup) this.x.findViewById(R.id.content)).addView(view, layoutParams);
        this.O.a(this.l.getCallback());
    }

    @Override // defpackage.gl
    public final void d() {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.k);
        if (layoutInflaterFrom.getFactory() == null) {
            layoutInflaterFrom.setFactory2(this);
        } else {
            if (layoutInflaterFrom.getFactory2() instanceof hf) {
                return;
            }
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    @Override // defpackage.gl
    public final void e() {
        if (this.n != null) {
            B();
            R(0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004c  */
    @Override // defpackage.gl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.j
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L11
            java.lang.Object r0 = defpackage.gl.g
            monitor-enter(r0)
            defpackage.gl.h(r3)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            goto L11
        Le:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r1
        L11:
            boolean r0 = r3.I
            if (r0 == 0) goto L20
            android.view.Window r0 = r3.l
            android.view.View r0 = r0.getDecorView()
            java.lang.Runnable r1 = r3.ae
            r0.removeCallbacks(r1)
        L20:
            r0 = 1
            r3.F = r0
            int r0 = r3.Z
            r1 = -100
            if (r0 == r1) goto L4c
            java.lang.Object r0 = r3.j
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L4c
            r1 = r0
            android.app.Activity r1 = (android.app.Activity) r1
            boolean r1 = r1.isChangingConfigurations()
            if (r1 == 0) goto L4c
            wx r1 = defpackage.hf.M
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getName()
            int r2 = r3.Z
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1.put(r0, r2)
            goto L5b
        L4c:
            java.lang.Object r0 = r3.j
            wx r1 = defpackage.hf.M
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getName()
            r1.remove(r0)
        L5b:
            ha r0 = r3.ac
            if (r0 == 0) goto L62
            r0.c()
        L62:
            ha r0 = r3.ad
            if (r0 == 0) goto L69
            r0.c()
        L69:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hf.f():void");
    }

    @Override // defpackage.gl
    public final void g() {
        B();
        fs fsVar = this.n;
        if (fsVar != null) {
            fsVar.e(false);
        }
    }

    @Override // defpackage.gl
    public final void i(int i2) {
        A();
        ViewGroup viewGroup = (ViewGroup) this.x.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.k).inflate(i2, viewGroup);
        this.O.a(this.l.getCallback());
    }

    @Override // defpackage.gl
    public final void j(View view) {
        A();
        ViewGroup viewGroup = (ViewGroup) this.x.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.O.a(this.l.getCallback());
    }

    @Override // defpackage.gl
    public final void k(View view, ViewGroup.LayoutParams layoutParams) {
        A();
        ViewGroup viewGroup = (ViewGroup) this.x.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.O.a(this.l.getCallback());
    }

    @Override // defpackage.gl
    public final void l(CharSequence charSequence) {
        this.P = charSequence;
        nb nbVar = this.p;
        if (nbVar != null) {
            nbVar.n(charSequence);
            return;
        }
        fs fsVar = this.n;
        if (fsVar != null) {
            fsVar.f(charSequence);
            return;
        }
        TextView textView = this.S;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    @Override // defpackage.gl
    public final void n() {
        String strC;
        this.E = true;
        J(false, true);
        Q();
        Object obj = this.j;
        if (obj instanceof Activity) {
            try {
                strC = aba.c((Activity) obj);
            } catch (IllegalArgumentException unused) {
                strC = null;
            }
            if (strC != null) {
                fs fsVar = this.n;
                if (fsVar == null) {
                    this.af = true;
                } else {
                    fsVar.c(true);
                }
            }
            synchronized (gl.g) {
                gl.h(this);
                gl.f.add(new WeakReference(this));
            }
        }
        this.G = new Configuration(this.k.getResources().getConfiguration());
        this.Y = true;
    }

    @Override // defpackage.gl
    public final void o(int i2) {
        if (i2 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i2 = 108;
        } else if (i2 == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i2 = 109;
        }
        if (this.C && i2 == 108) {
            return;
        }
        if (this.y && i2 == 1) {
            this.y = false;
        }
        if (i2 == 1) {
            T();
            this.C = true;
            return;
        }
        if (i2 == 2) {
            T();
            this.T = true;
            return;
        }
        if (i2 == 5) {
            T();
            this.U = true;
            return;
        }
        if (i2 == 10) {
            T();
            this.A = true;
        } else if (i2 == 108) {
            T();
            this.y = true;
        } else if (i2 != 109) {
            this.l.requestFeature(i2);
        } else {
            T();
            this.z = true;
        }
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return K(str, context, attributeSet);
    }

    public final int p() {
        int i2 = this.Z;
        return i2 != -100 ? i2 : gl.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:65:0x011a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x011b A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final int q(android.content.Context r22, int r23) {
        /*
            Method dump skipped, instructions count: 287
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hf.q(android.content.Context, int):int");
    }

    final Context r() {
        B();
        fs fsVar = this.n;
        Context contextA = fsVar != null ? fsVar.a() : null;
        return contextA == null ? this.k : contextA;
    }

    public final Configuration s(Context context, int i2, ads adsVar, Configuration configuration, boolean z) {
        int i3 = i2 != 1 ? i2 != 2 ? z ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i3 | (configuration2.uiMode & (-49));
        if (adsVar != null) {
            gv.b(configuration2, adsVar);
        }
        return configuration2;
    }

    final hd t(Menu menu) {
        hd[] hdVarArr = this.W;
        int length = hdVarArr != null ? hdVarArr.length : 0;
        for (int i2 = 0; i2 < length; i2++) {
            hd hdVar = hdVarArr[i2];
            if (hdVar != null && hdVar.h == menu) {
                return hdVar;
            }
        }
        return null;
    }

    final ads u(Context context) {
        ads adsVar;
        ads adsVarB;
        if (Build.VERSION.SDK_INT >= 33 || (adsVar = gl.c) == null) {
            return null;
        }
        ads adsVarA = gv.a(context.getApplicationContext().getResources().getConfiguration());
        LocaleList localeList = adsVar.b.a;
        if (localeList.isEmpty()) {
            adsVarB = ads.a;
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i2 = 0;
            while (true) {
                LocaleList localeList2 = adsVarA.b.a;
                if (i2 >= localeList.size() + localeList2.size()) {
                    break;
                }
                Locale locale = i2 < localeList.size() ? localeList.get(i2) : localeList2.get(i2 - localeList.size());
                if (locale != null) {
                    linkedHashSet.add(locale);
                }
                i2++;
            }
            adsVarB = ads.b(new LocaleList((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()])));
        }
        return adsVarB.b.a.isEmpty() ? adsVarA : adsVarB;
    }

    final void v(int i2, hd hdVar, Menu menu) {
        if (menu == null) {
            menu = hdVar.h;
        }
        if (hdVar.m && !this.F) {
            gx gxVar = this.O;
            Window.Callback callback = this.l.getCallback();
            try {
                gxVar.b = true;
                callback.onPanelClosed(i2, menu);
            } finally {
                gxVar.b = false;
            }
        }
    }

    final void w(jj jjVar) {
        if (this.V) {
            return;
        }
        this.V = true;
        this.p.a();
        Window.Callback callback = this.l.getCallback();
        if (callback != null && !this.F) {
            callback.onPanelClosed(108, jjVar);
        }
        this.V = false;
    }

    final void x(hd hdVar, boolean z) {
        ViewGroup viewGroup;
        nb nbVar;
        if (z && hdVar.a == 0 && (nbVar = this.p) != null && nbVar.r()) {
            w(hdVar.h);
            return;
        }
        WindowManager windowManager = (WindowManager) this.k.getSystemService("window");
        if (windowManager != null && hdVar.m && (viewGroup = hdVar.e) != null) {
            windowManager.removeView(viewGroup);
            if (z) {
                v(hdVar.a, hdVar, null);
            }
        }
        hdVar.k = false;
        hdVar.l = false;
        hdVar.m = false;
        hdVar.f = null;
        hdVar.n = true;
        if (this.D == hdVar) {
            this.D = null;
        }
        if (hdVar.a == 0) {
            D();
        }
    }

    final void y(int i2) {
        hd hdVarL = L(i2);
        if (hdVarL.h != null) {
            Bundle bundle = new Bundle();
            hdVarL.h.m(bundle);
            if (bundle.size() > 0) {
                hdVarL.p = bundle;
            }
            hdVarL.h.q();
            hdVarL.h.clear();
        }
        hdVarL.o = true;
        hdVarL.n = true;
        if ((i2 == 108 || i2 == 0) && this.p != null) {
            hd hdVarL2 = L(0);
            hdVarL2.k = false;
            H(hdVarL2, null);
        }
    }

    public final void z() {
        ahw ahwVar = this.u;
        if (ahwVar != null) {
            ahwVar.a();
        }
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return K(str, context, attributeSet);
    }
}
