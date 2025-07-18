package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.videos.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tcr {
    private final float A;
    public final Context a;
    public final TextInputLayout b;
    public Animator c;
    public int d;
    public int e;
    public CharSequence f;
    public boolean g;
    public TextView h;
    public CharSequence i;
    public int j;
    public int k;
    public ColorStateList l;
    public CharSequence m;
    public boolean n;
    public TextView o;
    public int p;
    public ColorStateList q;
    private final int r;
    private final int s;
    private final int t;
    private final TimeInterpolator u;
    private final TimeInterpolator v;
    private final TimeInterpolator w;
    private LinearLayout x;
    private int y;
    private FrameLayout z;

    public tcr(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.a = context;
        this.b = textInputLayout;
        this.A = context.getResources().getDimensionPixelSize(R.dimen.design_textinput_caption_translate_y);
        this.r = sim.b(context, R.attr.motionDurationShort4, 217);
        this.s = sim.b(context, R.attr.motionDurationMedium4, 167);
        this.t = sim.b(context, R.attr.motionDurationShort4, 167);
        this.u = sim.k(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, sns.d);
        TimeInterpolator timeInterpolator = sns.a;
        this.v = sim.k(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, timeInterpolator);
        this.w = sim.k(context, R.attr.motionEasingLinearInterpolator, timeInterpolator);
    }

    static final boolean n(int i) {
        return i == 0 || i == 1;
    }

    private final int o(boolean z, int i, int i2) {
        return z ? this.a.getResources().getDimensionPixelSize(i) : i2;
    }

    private final TextView p(int i) {
        if (i == 1) {
            return this.h;
        }
        if (i != 2) {
            return null;
        }
        return this.o;
    }

    private final void q(List list, boolean z, TextView textView, int i, int i2, int i3) {
        if (textView == null || !z) {
            return;
        }
        if (i == i3 || i == i2) {
            boolean z2 = i3 == i;
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.ALPHA, i3 == i ? 1.0f : 0.0f);
            objectAnimatorOfFloat.setDuration(z2 ? this.s : this.t);
            objectAnimatorOfFloat.setInterpolator(z2 ? this.v : this.w);
            if (i3 == i && i2 != 0) {
                objectAnimatorOfFloat.setStartDelay(this.t);
            }
            list.add(objectAnimatorOfFloat);
            if (i3 != i || i2 == 0) {
                return;
            }
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.TRANSLATION_Y, -this.A, 0.0f);
            objectAnimatorOfFloat2.setDuration(this.r);
            objectAnimatorOfFloat2.setInterpolator(this.u);
            objectAnimatorOfFloat2.setStartDelay(this.t);
            list.add(objectAnimatorOfFloat2);
        }
    }

    public final void a(TextView textView, int i) {
        if (this.x == null && this.z == null) {
            Context context = this.a;
            LinearLayout linearLayout = new LinearLayout(context);
            this.x = linearLayout;
            linearLayout.setOrientation(0);
            TextInputLayout textInputLayout = this.b;
            textInputLayout.addView(this.x, -1, -2);
            this.z = new FrameLayout(context);
            this.x.addView(this.z, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (textInputLayout.c != null) {
                b();
            }
        }
        if (n(i)) {
            this.z.setVisibility(0);
            this.z.addView(textView);
        } else {
            this.x.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.x.setVisibility(0);
        this.y++;
    }

    public final void b() {
        EditText editText;
        if (this.x == null || (editText = this.b.c) == null) {
            return;
        }
        Context context = this.a;
        boolean zK = sin.k(context);
        this.x.setPaddingRelative(o(zK, R.dimen.material_helper_text_font_1_3_padding_horizontal, editText.getPaddingStart()), o(zK, R.dimen.material_helper_text_font_1_3_padding_top, context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_default_padding_top)), o(zK, R.dimen.material_helper_text_font_1_3_padding_horizontal, editText.getPaddingEnd()), 0);
    }

    public final void c() {
        Animator animator = this.c;
        if (animator != null) {
            animator.cancel();
        }
    }

    public final void d() {
        this.f = null;
        c();
        if (this.d == 1) {
            if (!this.n || TextUtils.isEmpty(this.m)) {
                this.e = 0;
            } else {
                this.e = 2;
            }
        }
        l(this.d, this.e, m(this.h, ""));
    }

    public final void e(TextView textView, int i) {
        FrameLayout frameLayout;
        LinearLayout linearLayout = this.x;
        if (linearLayout == null) {
            return;
        }
        if (!n(i) || (frameLayout = this.z) == null) {
            linearLayout.removeView(textView);
        } else {
            frameLayout.removeView(textView);
        }
        int i2 = this.y - 1;
        this.y = i2;
        LinearLayout linearLayout2 = this.x;
        if (i2 == 0) {
            linearLayout2.setVisibility(8);
        }
    }

    public final void f(int i) {
        this.j = i;
        TextView textView = this.h;
        if (textView != null) {
            textView.setAccessibilityLiveRegion(i);
        }
    }

    public final void g(CharSequence charSequence) {
        this.i = charSequence;
        TextView textView = this.h;
        if (textView != null) {
            textView.setContentDescription(charSequence);
        }
    }

    public final void h(int i) {
        this.k = i;
        TextView textView = this.h;
        if (textView != null) {
            this.b.r(textView, i);
        }
    }

    public final void i(ColorStateList colorStateList) {
        this.l = colorStateList;
        TextView textView = this.h;
        if (textView == null || colorStateList == null) {
            return;
        }
        textView.setTextColor(colorStateList);
    }

    public final void j(int i) {
        this.p = i;
        TextView textView = this.o;
        if (textView != null) {
            textView.setTextAppearance(i);
        }
    }

    public final void k(ColorStateList colorStateList) {
        this.q = colorStateList;
        TextView textView = this.o;
        if (textView == null || colorStateList == null) {
            return;
        }
        textView.setTextColor(colorStateList);
    }

    public final void l(int i, int i2, boolean z) {
        tcr tcrVar;
        TextView textViewP;
        TextView textViewP2;
        if (i == i2) {
            return;
        }
        if (z) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.c = animatorSet;
            ArrayList arrayList = new ArrayList();
            tcrVar = this;
            tcrVar.q(arrayList, this.n, this.o, 2, i, i2);
            tcrVar.q(arrayList, tcrVar.g, tcrVar.h, 1, i, i2);
            sin.b(animatorSet, arrayList);
            animatorSet.addListener(new tcp(tcrVar, i2, p(i), i, p(i2)));
            animatorSet.start();
        } else {
            tcrVar = this;
            if (i != i2) {
                if (i2 != 0 && (textViewP2 = p(i2)) != null) {
                    textViewP2.setVisibility(0);
                    textViewP2.setAlpha(1.0f);
                }
                if (i != 0 && (textViewP = p(i)) != null) {
                    textViewP.setVisibility(4);
                    if (i == 1) {
                        textViewP.setText((CharSequence) null);
                    }
                }
                tcrVar.d = i2;
            }
        }
        TextInputLayout textInputLayout = tcrVar.b;
        textInputLayout.t();
        textInputLayout.v(z);
        textInputLayout.x();
    }

    public final boolean m(TextView textView, CharSequence charSequence) {
        TextInputLayout textInputLayout = this.b;
        if (textInputLayout.isLaidOut() && textInputLayout.isEnabled()) {
            return (this.e == this.d && textView != null && TextUtils.equals(textView.getText(), charSequence)) ? false : true;
        }
        return false;
    }
}
