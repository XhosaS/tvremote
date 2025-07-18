package defpackage;

import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.EditText;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tca extends tco {
    public EditText a;
    private final int b;
    private final int c;
    private final TimeInterpolator d;
    private final TimeInterpolator i;
    private final View.OnClickListener j;
    private final View.OnFocusChangeListener k;
    private AnimatorSet l;
    private ValueAnimator m;

    public tca(tcn tcnVar) {
        super(tcnVar);
        this.j = new tbx(this, 0);
        this.k = new tcg(this, 1);
        this.b = sim.b(tcnVar.getContext(), R.attr.motionDurationShort3, 100);
        this.c = sim.b(tcnVar.getContext(), R.attr.motionDurationShort3, 150);
        this.d = sim.k(tcnVar.getContext(), R.attr.motionEasingLinearInterpolator, sns.a);
        this.i = sim.k(tcnVar.getContext(), R.attr.motionEasingEmphasizedInterpolator, sns.d);
    }

    private final ValueAnimator m(float... fArr) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat.setInterpolator(this.d);
        valueAnimatorOfFloat.setDuration(this.b);
        valueAnimatorOfFloat.addUpdateListener(new fsz(this, 17));
        return valueAnimatorOfFloat;
    }

    @Override // defpackage.tco
    public final int a() {
        return R.string.clear_text_end_icon_content_description;
    }

    @Override // defpackage.tco
    public final int b() {
        return R.drawable.mtrl_ic_cancel;
    }

    @Override // defpackage.tco
    public final View.OnClickListener c() {
        return this.j;
    }

    @Override // defpackage.tco
    public final View.OnFocusChangeListener d() {
        return this.k;
    }

    @Override // defpackage.tco
    public final View.OnFocusChangeListener e() {
        return this.k;
    }

    public final void f(boolean z) {
        boolean zR = this.f.r();
        if (!z) {
            this.l.cancel();
            this.m.start();
            if (zR) {
                return;
            }
            this.m.end();
            return;
        }
        if (this.l.isRunning()) {
            return;
        }
        this.m.cancel();
        this.l.start();
        if (zR) {
            this.l.end();
        }
    }

    @Override // defpackage.tco
    public final void g(EditText editText) {
        this.a = editText;
        this.e.h(k());
    }

    @Override // defpackage.tco
    public final void h(boolean z) {
        if (this.f.h == null) {
            return;
        }
        f(z);
    }

    @Override // defpackage.tco
    public final void i() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(this.i);
        valueAnimatorOfFloat.setDuration(this.c);
        valueAnimatorOfFloat.addUpdateListener(new fsz(this, 18));
        ValueAnimator valueAnimatorM = m(0.0f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        this.l = animatorSet;
        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorM);
        this.l.addListener(new tby(this));
        ValueAnimator valueAnimatorM2 = m(1.0f, 0.0f);
        this.m = valueAnimatorM2;
        valueAnimatorM2.addListener(new tbz(this));
    }

    @Override // defpackage.tco
    public final void j() {
        EditText editText = this.a;
        if (editText != null) {
            editText.post(new tci(this, 1));
        }
    }

    public final boolean k() {
        EditText editText = this.a;
        if (editText != null) {
            return (editText.hasFocus() || this.h.hasFocus()) && this.a.getText().length() > 0;
        }
        return false;
    }

    @Override // defpackage.tco
    public final void l() {
        if (this.f.h != null) {
            return;
        }
        f(k());
    }
}
