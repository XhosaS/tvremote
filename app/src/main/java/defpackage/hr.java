package defpackage;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.support.v7.widget.ActionBarContainer;
import android.support.v7.widget.ActionBarContextView;
import android.support.v7.widget.ActionBarOverlayLayout;
import android.support.v7.widget.Toolbar;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public class hr extends fs implements km {
    private static final Interpolator q = new AccelerateInterpolator();
    private static final Interpolator r = new DecelerateInterpolator();
    Context a;
    ActionBarOverlayLayout b;
    public ActionBarContainer c;
    public nc d;
    ActionBarContextView e;
    View f;
    hq g;
    ij h;
    ii i;
    boolean j;
    boolean k;
    ir l;
    boolean m;
    final ahx n;
    final ahx o;
    final hp p;
    private Context s;
    private boolean t;
    private boolean u;
    private final ArrayList v;
    private int w;
    private boolean x;
    private boolean y;
    private boolean z;

    public hr(Activity activity, boolean z) {
        new ArrayList();
        this.v = new ArrayList();
        this.w = 0;
        this.j = true;
        this.y = true;
        this.n = new hn(this);
        this.o = new ho(this);
        this.p = new hp(this);
        View decorView = activity.getWindow().getDecorView();
        p(decorView);
        if (z) {
            return;
        }
        this.f = decorView.findViewById(R.id.content);
    }

    static boolean o(boolean z, boolean z2) {
        return z2 || !z;
    }

    private final void p(View view) {
        nc wrapper;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(com.google.android.katniss.R.id.decor_content_parent);
        this.b = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.h = this;
            if (actionBarOverlayLayout.getWindowToken() != null) {
                actionBarOverlayLayout.h.k(actionBarOverlayLayout.b);
                int i = actionBarOverlayLayout.g;
                if (i != 0) {
                    actionBarOverlayLayout.onWindowSystemUiVisibilityChanged(i);
                    int[] iArr = ahj.a;
                    aha.c(actionBarOverlayLayout);
                }
            }
        }
        KeyEvent.Callback callbackFindViewById = view.findViewById(com.google.android.katniss.R.id.action_bar);
        if (callbackFindViewById instanceof nc) {
            wrapper = (nc) callbackFindViewById;
        } else {
            if (!(callbackFindViewById instanceof Toolbar)) {
                StringBuilder sb = new StringBuilder("Can't make a decor toolbar out of ");
                sb.append(callbackFindViewById != null ? callbackFindViewById.getClass().getSimpleName() : "null");
                throw new IllegalStateException(sb.toString());
            }
            wrapper = ((Toolbar) callbackFindViewById).getWrapper();
        }
        this.d = wrapper;
        this.e = (ActionBarContextView) view.findViewById(com.google.android.katniss.R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(com.google.android.katniss.R.id.action_bar_container);
        this.c = actionBarContainer;
        nc ncVar = this.d;
        if (ncVar == null || this.e == null || actionBarContainer == null) {
            throw new IllegalStateException(String.valueOf(getClass().getSimpleName()).concat(" can only be used with a compatible window decor layout"));
        }
        this.a = ncVar.b();
        if ((this.d.a() & 4) != 0) {
            this.t = true;
        }
        Context context = this.a;
        int i2 = context.getApplicationInfo().targetSdkVersion;
        this.d.z();
        m(ih.b(context));
        TypedArray typedArrayObtainStyledAttributes = this.a.obtainStyledAttributes(null, hs.a, com.google.android.katniss.R.attr.actionBarStyle, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.b;
            if (!actionBarOverlayLayout2.d) {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
            this.m = true;
            actionBarOverlayLayout2.j(true);
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            int[] iArr2 = ahj.a;
            ahc.j(this.c, dimensionPixelSize);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    private final void q(boolean z) {
        View view;
        View view2;
        View view3;
        if (!o(this.k, this.x)) {
            if (this.y) {
                this.y = false;
                ir irVar = this.l;
                if (irVar != null) {
                    irVar.a();
                }
                if (this.w == 0) {
                    if (!this.z) {
                        if (z) {
                            z = true;
                        }
                    }
                    this.c.setAlpha(1.0f);
                    this.c.a(true);
                    ir irVar2 = new ir();
                    float f = -this.c.getHeight();
                    if (z) {
                        this.c.getLocationInWindow(new int[]{0, 0});
                        f -= r6[1];
                    }
                    ahw ahwVarD = ahj.d(this.c);
                    ahwVarD.f(f);
                    ahwVarD.e(this.p);
                    irVar2.c(ahwVarD);
                    if (this.j && (view = this.f) != null) {
                        ahw ahwVarD2 = ahj.d(view);
                        ahwVarD2.f(f);
                        irVar2.c(ahwVarD2);
                    }
                    irVar2.e(q);
                    irVar2.d();
                    irVar2.f(this.n);
                    this.l = irVar2;
                    irVar2.b();
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
        ir irVar3 = this.l;
        if (irVar3 != null) {
            irVar3.a();
        }
        this.c.setVisibility(0);
        if (this.w != 0) {
            this.c.setAlpha(1.0f);
            this.c.setTranslationY(0.0f);
            if (this.j && (view2 = this.f) != null) {
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
            ir irVar4 = new ir();
            ahw ahwVarD3 = ahj.d(this.c);
            ahwVarD3.f(0.0f);
            ahwVarD3.e(this.p);
            irVar4.c(ahwVarD3);
            if (this.j && (view3 = this.f) != null) {
                view3.setTranslationY(f2);
                ahw ahwVarD4 = ahj.d(this.f);
                ahwVarD4.f(0.0f);
                irVar4.c(ahwVarD4);
            }
            irVar4.e(r);
            irVar4.d();
            irVar4.f(this.o);
            this.l = irVar4;
            irVar4.b();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.b;
        if (actionBarOverlayLayout != null) {
            int[] iArr = ahj.a;
            aha.c(actionBarOverlayLayout);
        }
    }

    @Override // defpackage.fs
    public final Context a() {
        if (this.s == null) {
            TypedValue typedValue = new TypedValue();
            this.a.getTheme().resolveAttribute(com.google.android.katniss.R.attr.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.s = new ContextThemeWrapper(this.a, i);
            } else {
                this.s = this.a;
            }
        }
        return this.s;
    }

    @Override // defpackage.fs
    public final void b(boolean z) {
        if (z == this.u) {
            return;
        }
        this.u = z;
        ArrayList arrayList = this.v;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((fr) arrayList.get(i)).a();
        }
    }

    @Override // defpackage.fs
    public final void c(boolean z) {
        if (this.t) {
            return;
        }
        d(z);
    }

    @Override // defpackage.fs
    public final void d(boolean z) {
        l(true != z ? 0 : 4, 4);
    }

    @Override // defpackage.fs
    public final void e(boolean z) {
        ir irVar;
        this.z = z;
        if (z || (irVar = this.l) == null) {
            return;
        }
        irVar.a();
    }

    @Override // defpackage.fs
    public final void f(CharSequence charSequence) {
        this.d.q(charSequence);
    }

    public final void g(boolean z) {
        ahw ahwVarC;
        ahw ahwVarC2;
        if (z) {
            if (!this.x) {
                this.x = true;
                q(false);
            }
        } else if (this.x) {
            this.x = false;
            q(false);
        }
        if (!this.c.isLaidOut()) {
            if (z) {
                this.d.o(4);
                this.e.setVisibility(0);
                return;
            } else {
                this.d.o(0);
                this.e.setVisibility(8);
                return;
            }
        }
        if (z) {
            ahwVarC2 = this.d.c(4, 100L);
            ahwVarC = this.e.c(0, 200L);
        } else {
            ahwVarC = this.d.c(0, 200L);
            ahwVarC2 = this.e.c(8, 100L);
        }
        ir irVar = new ir();
        ArrayList arrayList = irVar.a;
        arrayList.add(ahwVarC2);
        View view = (View) ahwVarC2.a.get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        View view2 = (View) ahwVarC.a.get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        arrayList.add(ahwVarC);
        irVar.b();
    }

    @Override // defpackage.km
    public final void h(boolean z) {
        this.j = z;
    }

    @Override // defpackage.km
    public final void i() {
        if (this.k) {
            return;
        }
        this.k = true;
        q(true);
    }

    @Override // defpackage.km
    public final void j() {
        ir irVar = this.l;
        if (irVar != null) {
            irVar.a();
            this.l = null;
        }
    }

    @Override // defpackage.km
    public final void k(int i) {
        this.w = i;
    }

    public final void l(int i, int i2) {
        int iA = this.d.a();
        if ((i2 & 4) != 0) {
            this.t = true;
        }
        this.d.i((i & i2) | ((~i2) & iA));
    }

    public final void m(boolean z) {
        if (z) {
            this.d.y();
        } else {
            this.d.y();
        }
        this.d.x();
        this.d.A();
        this.b.e = false;
    }

    @Override // defpackage.km
    public final void n() {
        if (this.k) {
            this.k = false;
            q(true);
        }
    }

    public hr(Dialog dialog) {
        new ArrayList();
        this.v = new ArrayList();
        this.w = 0;
        this.j = true;
        this.y = true;
        this.n = new hn(this);
        this.o = new ho(this);
        this.p = new hp(this);
        p(dialog.getWindow().getDecorView());
    }
}
