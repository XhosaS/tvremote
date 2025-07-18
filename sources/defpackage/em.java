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
import com.google.android.tv.remote.service.R;

/* compiled from: PG */
/* loaded from: classes.dex */
final class em extends ec implements PopupWindow.OnDismissListener, AdapterView.OnItemClickListener, View.OnKeyListener, eg {
    final ic a;
    View c;
    ViewTreeObserver d;
    private final Context e;
    private final du f;
    private final dr h;
    private final boolean i;
    private final int j;
    private final int k;
    private PopupWindow.OnDismissListener m;
    private View n;
    private ef o;
    private boolean p;
    private boolean q;
    private int r;
    private boolean t;
    final ViewTreeObserver.OnGlobalLayoutListener b = new el(this, 0);
    private final View.OnAttachStateChangeListener l = new dm(this, 2);
    private int s = 0;

    public em(Context context, du duVar, View view, int i, boolean z) {
        this.e = context;
        this.f = duVar;
        this.i = z;
        this.h = new dr(duVar, LayoutInflater.from(context), z, R.layout.abc_popup_menu_item_layout);
        this.k = i;
        Resources resources = context.getResources();
        this.j = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.n = view;
        this.a = new ic(context, i);
        duVar.h(this, context);
    }

    @Override // defpackage.ek
    public final ListView aF() {
        return this.a.e;
    }

    @Override // defpackage.eg
    public final void c(du duVar, boolean z) {
        if (duVar != this.f) {
            return;
        }
        k();
        ef efVar = this.o;
        if (efVar != null) {
            efVar.a(duVar, z);
        }
    }

    @Override // defpackage.eg
    public final void d(ef efVar) {
        this.o = efVar;
    }

    @Override // defpackage.eg
    public final boolean e() {
        return false;
    }

    @Override // defpackage.eg
    public final boolean f(en enVar) {
        if (enVar.hasVisibleItems()) {
            ee eeVar = new ee(this.e, enVar, this.c, this.i, this.k);
            eeVar.e(this.o);
            eeVar.d(ec.w(enVar));
            eeVar.c = this.m;
            this.m = null;
            this.f.i(false);
            ic icVar = this.a;
            int width = icVar.g;
            int iB = icVar.b();
            if ((Gravity.getAbsoluteGravity(this.s, this.n.getLayoutDirection()) & 7) == 5) {
                width += this.n.getWidth();
            }
            if (!eeVar.g()) {
                if (eeVar.a != null) {
                    eeVar.f(width, iB, true, true);
                }
            }
            ef efVar = this.o;
            if (efVar != null) {
                efVar.b(enVar);
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.eg
    public final void i() {
        this.q = false;
        dr drVar = this.h;
        if (drVar != null) {
            drVar.notifyDataSetChanged();
        }
    }

    @Override // defpackage.ek
    public final void k() {
        if (u()) {
            this.a.k();
        }
    }

    @Override // defpackage.ec
    public final void l(View view) {
        this.n = view;
    }

    @Override // defpackage.ec
    public final void m(boolean z) {
        this.h.b = z;
    }

    @Override // defpackage.ec
    public final void n(int i) {
        this.s = i;
    }

    @Override // defpackage.ec
    public final void o(int i) {
        this.a.g = i;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.p = true;
        this.f.close();
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
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        k();
        return true;
    }

    @Override // defpackage.ec
    public final void p(PopupWindow.OnDismissListener onDismissListener) {
        this.m = onDismissListener;
    }

    @Override // defpackage.ec
    public final void q(boolean z) {
        this.t = z;
    }

    @Override // defpackage.ec
    public final void r(int i) {
        this.a.j(i);
    }

    @Override // defpackage.ek
    public final void s() {
        View view;
        if (u()) {
            return;
        }
        if (this.p || (view = this.n) == null) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
        this.c = view;
        ic icVar = this.a;
        icVar.v(this);
        icVar.m = this;
        icVar.y();
        View view2 = this.c;
        ViewTreeObserver viewTreeObserver = this.d;
        ViewTreeObserver viewTreeObserver2 = view2.getViewTreeObserver();
        this.d = viewTreeObserver2;
        if (viewTreeObserver == null) {
            viewTreeObserver2.addOnGlobalLayoutListener(this.b);
        }
        view2.addOnAttachStateChangeListener(this.l);
        icVar.l = view2;
        icVar.j = this.s;
        if (!this.q) {
            this.r = x(this.h, this.e, this.j);
            this.q = true;
        }
        icVar.r(this.r);
        icVar.x();
        icVar.t(this.g);
        icVar.s();
        hf hfVar = icVar.e;
        hfVar.setOnKeyListener(this);
        if (this.t) {
            du duVar = this.f;
            if (duVar.e != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.e).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) hfVar, false);
                TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                if (textView != null) {
                    textView.setText(duVar.e);
                }
                frameLayout.setEnabled(false);
                hfVar.addHeaderView(frameLayout, null, false);
            }
        }
        icVar.e(this.h);
        icVar.s();
    }

    @Override // defpackage.ek
    public final boolean u() {
        return !this.p && this.a.u();
    }

    @Override // defpackage.ec
    public final void j(du duVar) {
    }
}
