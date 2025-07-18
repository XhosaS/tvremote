package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import androidx.media3.ui.PlayerControlView;
import com.google.android.videos.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ftk {
    public final PlayerControlView a;
    public final View b;
    public final ViewGroup c;
    public final ViewGroup d;
    public final ViewGroup e;
    public final ViewGroup f;
    public final ViewGroup g;
    public final ViewGroup h;
    public final ViewGroup i;
    public final View j;
    public final View k;
    public final AnimatorSet l;
    public final ValueAnimator m;
    public final ValueAnimator n;
    public final View.OnLayoutChangeListener q;
    public boolean t;
    public boolean u;
    private final AnimatorSet w;
    private final AnimatorSet x;
    private final AnimatorSet y;
    private final AnimatorSet z;
    public final Runnable o = new foe(this, 7);
    private final Runnable A = new foe(this, 8);
    public final Runnable p = new foe(this, 9);
    private final Runnable B = new foe(this, 10);
    private final Runnable C = new foe(this, 11);
    public boolean v = true;
    public int s = 0;
    public final List r = new ArrayList();

    public ftk(PlayerControlView playerControlView) throws Resources.NotFoundException {
        this.a = playerControlView;
        int i = 0;
        this.q = new fta(this, i);
        this.b = playerControlView.findViewById(R.id.exo_controls_background);
        this.c = (ViewGroup) playerControlView.findViewById(R.id.exo_center_controls);
        this.e = (ViewGroup) playerControlView.findViewById(R.id.exo_minimal_controls);
        ViewGroup viewGroup = (ViewGroup) playerControlView.findViewById(R.id.exo_bottom_bar);
        this.d = viewGroup;
        this.i = (ViewGroup) playerControlView.findViewById(R.id.exo_time);
        View viewFindViewById = playerControlView.findViewById(R.id.exo_progress);
        this.j = viewFindViewById;
        this.f = (ViewGroup) playerControlView.findViewById(R.id.exo_basic_controls);
        this.g = (ViewGroup) playerControlView.findViewById(R.id.exo_extra_controls);
        this.h = (ViewGroup) playerControlView.findViewById(R.id.exo_extra_controls_scroll_view);
        View viewFindViewById2 = playerControlView.findViewById(R.id.exo_overflow_show);
        this.k = viewFindViewById2;
        View viewFindViewById3 = playerControlView.findViewById(R.id.exo_overflow_hide);
        int i2 = 3;
        if (viewFindViewById2 != null && viewFindViewById3 != null) {
            viewFindViewById2.setOnClickListener(new fsq(this, i2));
            viewFindViewById3.setOnClickListener(new fsq(this, i2));
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new fsz(this, i));
        valueAnimatorOfFloat.addListener(new ftb(this));
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat2.addUpdateListener(new fsz(this, 2));
        valueAnimatorOfFloat2.addListener(new ftc(this));
        Resources resources = playerControlView.getResources();
        float dimension = resources.getDimension(R.dimen.exo_styled_bottom_bar_height) - resources.getDimension(R.dimen.exo_styled_progress_bar_height);
        float dimension2 = resources.getDimension(R.dimen.exo_styled_bottom_bar_height);
        AnimatorSet animatorSet = new AnimatorSet();
        this.l = animatorSet;
        animatorSet.setDuration(250L);
        animatorSet.addListener(new ftd(this, playerControlView));
        animatorSet.play(valueAnimatorOfFloat).with(q(0.0f, dimension, viewFindViewById)).with(q(0.0f, dimension, viewGroup));
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.w = animatorSet2;
        animatorSet2.setDuration(250L);
        animatorSet2.addListener(new fte(this, playerControlView));
        animatorSet2.play(q(dimension, dimension2, viewFindViewById)).with(q(dimension, dimension2, viewGroup));
        AnimatorSet animatorSet3 = new AnimatorSet();
        this.x = animatorSet3;
        animatorSet3.setDuration(250L);
        animatorSet3.addListener(new ftf(this, playerControlView));
        animatorSet3.play(valueAnimatorOfFloat).with(q(0.0f, dimension2, viewFindViewById)).with(q(0.0f, dimension2, viewGroup));
        AnimatorSet animatorSet4 = new AnimatorSet();
        this.y = animatorSet4;
        animatorSet4.setDuration(250L);
        animatorSet4.addListener(new ftg(this));
        animatorSet4.play(valueAnimatorOfFloat2).with(q(dimension, 0.0f, viewFindViewById)).with(q(dimension, 0.0f, viewGroup));
        AnimatorSet animatorSet5 = new AnimatorSet();
        this.z = animatorSet5;
        animatorSet5.setDuration(250L);
        animatorSet5.addListener(new fth(this));
        animatorSet5.play(valueAnimatorOfFloat2).with(q(dimension2, 0.0f, viewFindViewById)).with(q(dimension2, 0.0f, viewGroup));
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.m = valueAnimatorOfFloat3;
        valueAnimatorOfFloat3.setDuration(250L);
        valueAnimatorOfFloat3.addUpdateListener(new fsz(this, i2));
        valueAnimatorOfFloat3.addListener(new fti(this));
        ValueAnimator valueAnimatorOfFloat4 = ValueAnimator.ofFloat(1.0f, 0.0f);
        this.n = valueAnimatorOfFloat4;
        valueAnimatorOfFloat4.setDuration(250L);
        valueAnimatorOfFloat4.addUpdateListener(new fsz(this, 4));
        valueAnimatorOfFloat4.addListener(new ftj(this));
    }

    public static int a(View view) {
        if (view == null) {
            return 0;
        }
        int height = view.getHeight();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return height;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return height + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public static int b(View view) {
        if (view == null) {
            return 0;
        }
        int width = view.getWidth();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return width;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return width + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
    }

    public static /* synthetic */ void n(ftk ftkVar, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        View view = ftkVar.b;
        if (view != null) {
            view.setAlpha(fFloatValue);
        }
        ViewGroup viewGroup = ftkVar.c;
        if (viewGroup != null) {
            viewGroup.setAlpha(fFloatValue);
        }
        ViewGroup viewGroup2 = ftkVar.e;
        if (viewGroup2 != null) {
            viewGroup2.setAlpha(fFloatValue);
        }
    }

    public static final boolean p(View view) {
        int id = view.getId();
        return id == R.id.exo_bottom_bar || id == R.id.exo_prev || id == R.id.exo_next || id == R.id.exo_rew || id == R.id.exo_rew_with_amount || id == R.id.exo_ffwd || id == R.id.exo_ffwd_with_amount;
    }

    private static ObjectAnimator q(float f, float f2, View view) {
        return ObjectAnimator.ofFloat(view, "translationY", f, f2);
    }

    public final void c(float f) {
        ViewGroup viewGroup = this.h;
        if (viewGroup != null) {
            viewGroup.setTranslationX((int) (viewGroup.getWidth() * (1.0f - f)));
        }
        ViewGroup viewGroup2 = this.i;
        if (viewGroup2 != null) {
            viewGroup2.setAlpha(1.0f - f);
        }
        ViewGroup viewGroup3 = this.f;
        if (viewGroup3 != null) {
            viewGroup3.setAlpha(1.0f - f);
        }
    }

    public final void d() {
        this.x.start();
    }

    public final void e() {
        k(2);
    }

    public final void f() {
        this.w.start();
    }

    public final void g(Runnable runnable, long j) {
        this.a.postDelayed(runnable, j);
    }

    public final void h() {
        PlayerControlView playerControlView = this.a;
        playerControlView.removeCallbacks(this.C);
        playerControlView.removeCallbacks(this.A);
        playerControlView.removeCallbacks(this.B);
        playerControlView.removeCallbacks(this.p);
    }

    public final void i() {
        if (this.s == 3) {
            return;
        }
        h();
        int i = this.a.N;
        if (i > 0) {
            if (!this.v) {
                g(this.C, i);
            } else if (this.s == 1) {
                g(this.p, 2000L);
            } else {
                g(this.B, i);
            }
        }
    }

    public final void j(View view, boolean z) {
        if (view == null) {
            return;
        }
        if (!z) {
            view.setVisibility(8);
            this.r.remove(view);
            return;
        }
        if (this.t && p(view)) {
            view.setVisibility(4);
        } else {
            view.setVisibility(0);
        }
        this.r.add(view);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0083  */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, yjv] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k(int r8) {
        /*
            r7 = this;
            int r0 = r7.s
            r7.s = r8
            r1 = 8
            r2 = 0
            r3 = 2
            if (r8 != r3) goto L10
            androidx.media3.ui.PlayerControlView r3 = r7.a
            r3.setVisibility(r1)
            goto L18
        L10:
            if (r0 != r3) goto L18
            androidx.media3.ui.PlayerControlView r0 = r7.a
            r0.setVisibility(r2)
            r0 = r3
        L18:
            if (r0 == r8) goto L8a
            androidx.media3.ui.PlayerControlView r8 = r7.a
            java.util.concurrent.CopyOnWriteArrayList r0 = r8.h
            java.util.Iterator r0 = r0.iterator()
        L22:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L8a
            java.lang.Object r3 = r0.next()
            ftm r3 = (defpackage.ftm) r3
            int r4 = r8.getVisibility()
            androidx.media3.ui.PlayerView r3 = r3.a
            r3.p()
            jde r3 = r3.h
            if (r3 == 0) goto L22
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            java.lang.Object r6 = r3.a
            r6.a(r5)
            java.lang.Object r5 = r3.b
            androidx.media3.ui.PlayerView r5 = (androidx.media3.ui.PlayerView) r5
            androidx.media3.ui.SubtitleView r5 = r5.c
            if (r5 == 0) goto L51
            r5.c = r2
            r5.b()
        L51:
            if (r5 == 0) goto L58
            r5.d = r2
            r5.b()
        L58:
            if (r4 != 0) goto L74
            if (r5 == 0) goto L73
            java.lang.Object r4 = r3.c
            android.support.v7.app.AppCompatActivity r4 = (android.support.v7.app.AppCompatActivity) r4
            android.content.res.Resources r4 = r4.getResources()
            r6 = 2131165856(0x7f0702a0, float:1.794594E38)
            float r4 = r4.getDimension(r6)
            float r6 = defpackage.jbr.a
            float r6 = r6 - r4
            r5.setY(r6)
            r4 = r2
            goto L7d
        L73:
            r4 = r2
        L74:
            if (r5 == 0) goto L7d
            if (r4 != r1) goto L7d
            float r6 = defpackage.jbr.b
            r5.setY(r6)
        L7d:
            java.lang.Object r3 = r3.d
            if (r4 == r1) goto L83
            r4 = 1
            goto L84
        L83:
            r4 = r2
        L84:
            xcf r3 = (defpackage.xcf) r3
            defpackage.jbr.l(r3, r4)
            goto L22
        L8a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ftk.k(int):void");
    }

    public final void l() {
        if (!this.v) {
            k(0);
            i();
            return;
        }
        int i = this.s;
        if (i == 1) {
            this.y.start();
        } else if (i == 2) {
            this.z.start();
        } else if (i == 3) {
            this.u = true;
        } else if (i == 4) {
            return;
        }
        i();
    }

    public final boolean m(View view) {
        return view != null && this.r.contains(view);
    }
}
