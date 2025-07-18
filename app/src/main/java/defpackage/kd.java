package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.google.android.katniss.R;

/* compiled from: PG */
/* loaded from: classes.dex */
final class kd extends js implements PopupWindow.OnDismissListener, AdapterView.OnItemClickListener, View.OnKeyListener, jw {
    final pc a;
    View c;
    ViewTreeObserver d;
    private final Context e;
    private final jj f;
    private final jg h;
    private final boolean i;
    private final int j;
    private final int k;
    private PopupWindow.OnDismissListener m;
    private View n;
    private jv o;
    private boolean p;
    private boolean q;
    private int r;
    private boolean t;
    final ViewTreeObserver.OnGlobalLayoutListener b = new kb(this);
    private final View.OnAttachStateChangeListener l = new kc(this);
    private int s = 0;

    public kd(Context context, jj jjVar, View view, int i, boolean z) {
        this.e = context;
        this.f = jjVar;
        this.i = z;
        this.h = new jg(jjVar, LayoutInflater.from(context), z, R.layout.abc_popup_menu_item_layout);
        this.k = i;
        Resources resources = context.getResources();
        this.j = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.n = view;
        this.a = new pc(context, i);
        jjVar.f(this, context);
    }

    @Override // defpackage.ka
    public final ListView cl() {
        return this.a.e;
    }

    @Override // defpackage.jw
    public final void d(jj jjVar, boolean z) {
        if (jjVar != this.f) {
            return;
        }
        f();
        jv jvVar = this.o;
        if (jvVar != null) {
            jvVar.a(jjVar, z);
        }
    }

    @Override // defpackage.jw
    public final void e(jv jvVar) {
        this.o = jvVar;
    }

    @Override // defpackage.ka
    public final void f() {
        if (u()) {
            this.a.f();
        }
    }

    @Override // defpackage.jw
    public final boolean g() {
        return false;
    }

    @Override // defpackage.jw
    public final boolean h(ke keVar) {
        if (keVar.hasVisibleItems()) {
            ju juVar = new ju(this.e, keVar, this.c, this.i, this.k);
            juVar.e(this.o);
            juVar.d(js.w(keVar));
            juVar.c = this.m;
            this.m = null;
            this.f.g(false);
            pc pcVar = this.a;
            int width = pcVar.g;
            int iCn = pcVar.cn();
            if ((Gravity.getAbsoluteGravity(this.s, this.n.getLayoutDirection()) & 7) == 5) {
                width += this.n.getWidth();
            }
            if (!juVar.g()) {
                if (juVar.a != null) {
                    juVar.f(width, iCn, true, true);
                }
            }
            jv jvVar = this.o;
            if (jvVar != null) {
                jvVar.b(keVar);
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.js
    public final void k(View view) {
        this.n = view;
    }

    @Override // defpackage.jw
    public final void l() {
        this.q = false;
        jg jgVar = this.h;
        if (jgVar != null) {
            jgVar.notifyDataSetChanged();
        }
    }

    @Override // defpackage.js
    public final void m(boolean z) {
        this.h.b = z;
    }

    @Override // defpackage.js
    public final void n(int i) {
        this.s = i;
    }

    @Override // defpackage.js
    public final void o(int i) {
        this.a.g = i;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.p = true;
        this.f.g(true);
        ViewTreeObserver viewTreeObserver = this.d;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.d = this.c.getViewTreeObserver();
            }
            this.d.removeGlobalOnLayoutListener(this.b);
            this.d = null;
        }
        this.c.removeOnAttachStateChangeListener(this.l);
        PopupWindow.OnDismissListener onDismissListener = this.m;
        if (onDismissListener != null) {
            ((jt) onDismissListener).a.c();
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        f();
        return true;
    }

    @Override // defpackage.js
    public final void p(PopupWindow.OnDismissListener onDismissListener) {
        this.m = onDismissListener;
    }

    @Override // defpackage.js
    public final void q(boolean z) {
        this.t = z;
    }

    @Override // defpackage.js
    public final void r(int i) {
        this.a.k(i);
    }

    @Override // defpackage.ka
    public final void s() {
        View view;
        if (u()) {
            return;
        }
        if (this.p || (view = this.n) == null) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
        this.c = view;
        pc pcVar = this.a;
        pcVar.q.setOnDismissListener(this);
        pcVar.l = this;
        pcVar.x();
        View view2 = this.c;
        ViewTreeObserver viewTreeObserver = this.d;
        ViewTreeObserver viewTreeObserver2 = view2.getViewTreeObserver();
        this.d = viewTreeObserver2;
        if (viewTreeObserver == null) {
            viewTreeObserver2.addOnGlobalLayoutListener(this.b);
        }
        view2.addOnAttachStateChangeListener(this.l);
        pcVar.k = view2;
        pcVar.j = this.s;
        if (!this.q) {
            this.r = x(this.h, this.e, this.j);
            this.q = true;
        }
        pcVar.r(this.r);
        pcVar.w();
        pcVar.t(this.g);
        pcVar.s();
        nu nuVar = pcVar.e;
        nuVar.setOnKeyListener(this);
        if (this.t) {
            jj jjVar = this.f;
            if (jjVar.g != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.e).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) nuVar, false);
                TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                if (textView != null) {
                    textView.setText(jjVar.g);
                }
                frameLayout.setEnabled(false);
                nuVar.addHeaderView(frameLayout, null, false);
            }
        }
        pcVar.e(this.h);
        pcVar.s();
    }

    @Override // defpackage.ka
    public final boolean u() {
        return !this.p && this.a.q.isShowing();
    }

    @Override // defpackage.js
    public final void b(jj jjVar) {
    }
}
