package defpackage;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.os.Build;
import android.os.SystemClock;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tck extends tco {
    public AutoCompleteTextView a;
    public boolean b;
    public boolean c;
    public ValueAnimator d;
    private final int i;
    private final int j;
    private final TimeInterpolator k;
    private final View.OnClickListener l;
    private final View.OnFocusChangeListener m;
    private final AccessibilityManager.TouchExplorationStateChangeListener n;
    private boolean o;
    private long p;
    private AccessibilityManager q;
    private ValueAnimator r;

    public tck(tcn tcnVar) {
        super(tcnVar);
        this.l = new tbx(this, 2);
        this.m = new tcg(this, 0);
        this.n = new tch(this, 0);
        this.p = Long.MAX_VALUE;
        this.j = sim.b(tcnVar.getContext(), R.attr.motionDurationShort3, 67);
        this.i = sim.b(tcnVar.getContext(), R.attr.motionDurationShort3, 50);
        this.k = sim.k(tcnVar.getContext(), R.attr.motionEasingLinearInterpolator, sns.a);
    }

    private final ValueAnimator z(int i, float... fArr) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat.setInterpolator(this.k);
        valueAnimatorOfFloat.setDuration(i);
        valueAnimatorOfFloat.addUpdateListener(new fsz(this, 19));
        return valueAnimatorOfFloat;
    }

    @Override // defpackage.tco
    public final AccessibilityManager.TouchExplorationStateChangeListener A() {
        return this.n;
    }

    @Override // defpackage.tco
    public final int a() {
        return R.string.exposed_dropdown_menu_content_description;
    }

    @Override // defpackage.tco
    public final int b() {
        return R.drawable.mtrl_dropdown_arrow;
    }

    @Override // defpackage.tco
    public final View.OnClickListener c() {
        return this.l;
    }

    @Override // defpackage.tco
    public final View.OnFocusChangeListener d() {
        return this.m;
    }

    @Override // defpackage.tco
    public final void g(EditText editText) {
        if (!(editText instanceof AutoCompleteTextView)) {
            throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
        }
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
        this.a = autoCompleteTextView;
        autoCompleteTextView.setOnTouchListener(new jcd(this, 8));
        this.a.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: tcf
            @Override // android.widget.AutoCompleteTextView.OnDismissListener
            public final void onDismiss() {
                tck tckVar = this.a;
                tckVar.n();
                tckVar.k(false);
            }
        });
        this.a.setThreshold(0);
        TextInputLayout textInputLayout = this.e;
        textInputLayout.b.m(null);
        if (!szg.g(editText) && this.q.isTouchExplorationEnabled()) {
            this.h.setImportantForAccessibility(2);
        }
        textInputLayout.h(true);
    }

    @Override // defpackage.tco
    public final void i() {
        this.d = z(this.j, 0.0f, 1.0f);
        ValueAnimator valueAnimatorZ = z(this.i, 1.0f, 0.0f);
        this.r = valueAnimatorZ;
        valueAnimatorZ.addListener(new tcj(this));
        this.q = (AccessibilityManager) this.g.getSystemService("accessibility");
    }

    @Override // defpackage.tco
    public final void j() {
        AutoCompleteTextView autoCompleteTextView = this.a;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            this.a.setOnDismissListener(null);
        }
    }

    public final void k(boolean z) {
        if (this.o != z) {
            this.o = z;
            this.d.cancel();
            this.r.start();
        }
    }

    @Override // defpackage.tco
    public final void l() {
        if (this.q.isTouchExplorationEnabled() && szg.g(this.a) && !this.h.hasFocus()) {
            this.a.dismissDropDown();
        }
        this.a.post(new tci(this, 0));
    }

    public final void m() {
        if (this.a == null) {
            return;
        }
        if (p()) {
            this.c = false;
        }
        if (this.c) {
            this.c = false;
            return;
        }
        k(!this.o);
        if (!this.o) {
            this.a.dismissDropDown();
        } else {
            this.a.requestFocus();
            this.a.showDropDown();
        }
    }

    public final void n() {
        this.c = true;
        this.p = SystemClock.uptimeMillis();
    }

    @Override // defpackage.tco
    public final boolean o(int i) {
        return i != 0;
    }

    public final boolean p() {
        long jUptimeMillis = SystemClock.uptimeMillis() - this.p;
        return jUptimeMillis < 0 || jUptimeMillis > 300;
    }

    @Override // defpackage.tco
    public final boolean q() {
        return true;
    }

    @Override // defpackage.tco
    public final boolean r() {
        return this.b;
    }

    @Override // defpackage.tco
    public final boolean s() {
        return true;
    }

    @Override // defpackage.tco
    public final boolean t() {
        return this.o;
    }

    @Override // defpackage.tco
    public final boolean u() {
        return true;
    }

    @Override // defpackage.tco
    public final void v(cyq cyqVar) {
        if (!szg.g(this.a)) {
            cyqVar.t(Spinner.class.getName());
        }
        if (Build.VERSION.SDK_INT >= 26 ? cyqVar.b.isShowingHintText() : cyqVar.Z(4)) {
            cyqVar.E(null);
        }
    }

    @Override // defpackage.tco
    public final void w(AccessibilityEvent accessibilityEvent) {
        if (!this.q.isEnabled() || szg.g(this.a)) {
            return;
        }
        boolean z = false;
        if ((accessibilityEvent.getEventType() == 32768 || accessibilityEvent.getEventType() == 8) && this.o && !this.a.isPopupShowing()) {
            z = true;
        }
        if (accessibilityEvent.getEventType() == 1 || z) {
            m();
            n();
        }
    }
}
