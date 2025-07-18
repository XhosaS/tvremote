package defpackage;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.support.v7.widget.ActionBarContainer;
import android.support.v7.widget.ActionBarContextView;
import android.support.v7.widget.ActionBarOverlayLayout;
import android.support.v7.widget.Toolbar;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ct extends bk implements et {
    private static final Interpolator r = new AccelerateInterpolator();
    private static final Interpolator s = new DecelerateInterpolator();
    Context a;
    ActionBarOverlayLayout b;
    public ActionBarContainer c;
    ActionBarContextView d;
    View e;
    cs f;
    cy g;
    cx h;
    public int i;
    public boolean j;
    public boolean k;
    public dg l;
    boolean m;
    final rd n;
    final rd o;
    public jx p;
    final byj q;
    private Context t;
    private boolean u;
    private boolean v;
    private final ArrayList w;
    private boolean x;
    private boolean y;
    private boolean z;

    public ct(Activity activity, boolean z) throws Resources.NotFoundException {
        new ArrayList();
        this.w = new ArrayList();
        this.i = 0;
        this.j = true;
        this.y = true;
        this.n = new cq(this);
        this.o = new cr(this);
        this.q = new byj(this, null);
        View decorView = activity.getWindow().getDecorView();
        l(decorView);
        if (z) {
            return;
        }
        this.e = decorView.findViewById(R.id.content);
    }

    static boolean j(boolean z, boolean z2) {
        return z2 || !z;
    }

    private final void l(View view) throws Resources.NotFoundException {
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(com.google.android.tv.remote.service.R.id.decor_content_parent);
        this.b = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.h = this;
            if (actionBarOverlayLayout.getWindowToken() != null) {
                ((ct) actionBarOverlayLayout.h).i = actionBarOverlayLayout.b;
                int i = actionBarOverlayLayout.g;
                if (i != 0) {
                    actionBarOverlayLayout.onWindowSystemUiVisibilityChanged(i);
                    int[] iArr = qv.a;
                    qk.j(actionBarOverlayLayout);
                }
            }
        }
        View viewFindViewById = view.findViewById(com.google.android.tv.remote.service.R.id.action_bar);
        if (!(viewFindViewById instanceof Toolbar)) {
            StringBuilder sb = new StringBuilder("Can't make a decor toolbar out of ");
            sb.append(viewFindViewById != null ? viewFindViewById.getClass().getSimpleName() : "null");
            throw new IllegalStateException(sb.toString());
        }
        this.p = ((Toolbar) viewFindViewById).x();
        this.d = (ActionBarContextView) view.findViewById(com.google.android.tv.remote.service.R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(com.google.android.tv.remote.service.R.id.action_bar_container);
        this.c = actionBarContainer;
        jx jxVar = this.p;
        if (jxVar == null || this.d == null || actionBarContainer == null) {
            throw new IllegalStateException(String.valueOf(getClass().getSimpleName()).concat(" can only be used with a compatible window decor layout"));
        }
        this.a = jxVar.a();
        if ((this.p.b & 4) != 0) {
            this.u = true;
        }
        Context context = this.a;
        int i2 = context.getApplicationInfo().targetSdkVersion;
        ii.I(context);
        k();
        TypedArray typedArrayObtainStyledAttributes = this.a.obtainStyledAttributes(null, cu.a, com.google.android.tv.remote.service.R.attr.actionBarStyle, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.b;
            if (!actionBarOverlayLayout2.d) {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
            this.m = true;
            actionBarOverlayLayout2.k(true);
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            int[] iArr2 = qv.a;
            qm.h(this.c, dimensionPixelSize);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // defpackage.bk
    public final Context a() {
        if (this.t == null) {
            TypedValue typedValue = new TypedValue();
            this.a.getTheme().resolveAttribute(com.google.android.tv.remote.service.R.attr.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.t = new ContextThemeWrapper(this.a, i);
            } else {
                this.t = this.a;
            }
        }
        return this.t;
    }

    @Override // defpackage.bk
    public final void b(boolean z) {
        if (z == this.v) {
            return;
        }
        this.v = z;
        ArrayList arrayList = this.w;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((bj) arrayList.get(i)).a();
        }
    }

    @Override // defpackage.bk
    public final void c(boolean z) {
        if (this.u) {
            return;
        }
        d(z);
    }

    @Override // defpackage.bk
    public final void d(boolean z) {
        h(true != z ? 0 : 4, 4);
    }

    @Override // defpackage.bk
    public final void e(boolean z) {
        dg dgVar;
        this.z = z;
        if (z || (dgVar = this.l) == null) {
            return;
        }
        dgVar.a();
    }

    @Override // defpackage.bk
    public final void f(CharSequence charSequence) {
        this.p.f(charSequence);
    }

    public final void g(boolean z) {
        asv asvVarG;
        asv asvVarG2;
        if (z) {
            if (!this.x) {
                this.x = true;
                i(false);
            }
        } else if (this.x) {
            this.x = false;
            i(false);
        }
        if (!this.c.isLaidOut()) {
            if (z) {
                this.p.e(4);
                this.d.setVisibility(0);
                return;
            } else {
                this.p.e(0);
                this.d.setVisibility(8);
                return;
            }
        }
        if (z) {
            asvVarG2 = this.p.g(4, 100L);
            asvVarG = this.d.g(0, 200L);
        } else {
            asvVarG = this.p.g(0, 200L);
            asvVarG2 = this.d.g(8, 100L);
        }
        dg dgVar = new dg();
        ArrayList arrayList = dgVar.a;
        arrayList.add(asvVarG2);
        View view = (View) ((WeakReference) asvVarG2.a).get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        View view2 = (View) ((WeakReference) asvVarG.a).get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        arrayList.add(asvVarG);
        dgVar.b();
    }

    public final void h(int i, int i2) {
        jx jxVar = this.p;
        int i3 = jxVar.b;
        if ((i2 & 4) != 0) {
            this.u = true;
        }
        jxVar.b((i & i2) | ((~i2) & i3));
    }

    public final void i(boolean z) {
        View view;
        View view2;
        View view3;
        if (!j(this.k, this.x)) {
            if (this.y) {
                this.y = false;
                dg dgVar = this.l;
                if (dgVar != null) {
                    dgVar.a();
                }
                if (this.i == 0) {
                    if (!this.z) {
                        if (z) {
                            z = true;
                        }
                    }
                    this.c.setAlpha(1.0f);
                    this.c.a(true);
                    dg dgVar2 = new dg();
                    float f = -this.c.getHeight();
                    if (z) {
                        this.c.getLocationInWindow(new int[]{0, 0});
                        f -= r6[1];
                    }
                    asv asvVarS = qv.s(this.c);
                    asvVarS.S(f);
                    asvVarS.ac(this.q);
                    dgVar2.f(asvVarS);
                    if (this.j && (view = this.e) != null) {
                        asv asvVarS2 = qv.s(view);
                        asvVarS2.S(f);
                        dgVar2.f(asvVarS2);
                    }
                    dgVar2.d(r);
                    dgVar2.c();
                    dgVar2.e(this.n);
                    this.l = dgVar2;
                    dgVar2.b();
                    return;
                }
                this.n.a();
                return;
            }
            return;
        }
        if (this.y) {
            return;
        }
        this.y = true;
        dg dgVar3 = this.l;
        if (dgVar3 != null) {
            dgVar3.a();
        }
        this.c.setVisibility(0);
        if (this.i != 0) {
            this.c.setAlpha(1.0f);
            this.c.setTranslationY(0.0f);
            if (this.j && (view2 = this.e) != null) {
                view2.setTranslationY(0.0f);
            }
            this.o.a();
        } else {
            if (!this.z) {
                if (z) {
                    z = true;
                }
                this.c.setAlpha(1.0f);
                this.c.setTranslationY(0.0f);
                if (this.j) {
                    view2.setTranslationY(0.0f);
                }
                this.o.a();
            }
            this.c.setTranslationY(0.0f);
            float f2 = -this.c.getHeight();
            if (z) {
                this.c.getLocationInWindow(new int[]{0, 0});
                f2 -= r6[1];
            }
            this.c.setTranslationY(f2);
            dg dgVar4 = new dg();
            asv asvVarS3 = qv.s(this.c);
            asvVarS3.S(0.0f);
            asvVarS3.ac(this.q);
            dgVar4.f(asvVarS3);
            if (this.j && (view3 = this.e) != null) {
                view3.setTranslationY(f2);
                asv asvVarS4 = qv.s(this.e);
                asvVarS4.S(0.0f);
                dgVar4.f(asvVarS4);
            }
            dgVar4.d(s);
            dgVar4.c();
            dgVar4.e(this.o);
            this.l = dgVar4;
            dgVar4.b();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.b;
        if (actionBarOverlayLayout != null) {
            int[] iArr = qv.a;
            qk.j(actionBarOverlayLayout);
        }
    }

    public final void k() {
        this.p.a.requestLayout();
        this.b.e = false;
    }

    public ct(Dialog dialog) throws Resources.NotFoundException {
        new ArrayList();
        this.w = new ArrayList();
        this.i = 0;
        this.j = true;
        this.y = true;
        this.n = new cq(this);
        this.o = new cr(this);
        this.q = new byj(this, null);
        l(dialog.getWindow().getDecorView());
    }
}
