package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.tvsearch.widget.imagedownload.ImageDownloadView;
import com.google.android.flexbox.FlexboxLayout;
import com.google.android.katniss.R;
import j$.time.Duration;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class hsh extends hux implements hog {
    public static final zdy a = zdy.h("com/google/android/apps/tvsearch/results/searchslimentity/SlimEntityDetailViewHolder");
    public final View A;
    public final int B;
    public final int C;
    public boolean D;
    public final hmb E;
    int F;
    private final Resources G;
    private final View H;
    private final LinearLayout I;
    private final TextView J;
    private final TextView K;
    private final TextView L;
    private final TextView M;
    private final TextView N;
    private final TextView P;
    private final FlexboxLayout Q;
    private final TextView R;
    private final FlexboxLayout S;
    private final ViewGroup T;
    private final ViewGroup U;
    private final heo V;
    private View.OnClickListener W;
    private View.OnFocusChangeListener X;
    private boolean Y;
    private final hmc Z;
    public hsj b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int t;
    public final Interpolator u;
    final ImageDownloadView v;
    final View w;
    final View x;
    public final FlexboxLayout y;
    public final ViewGroup z;

    public hsh(View view, hmb hmbVar, hmc hmcVar) throws Resources.NotFoundException {
        super(view);
        this.Y = false;
        this.E = hmbVar;
        this.Z = hmcVar;
        Resources resources = view.getResources();
        this.G = resources;
        this.f = resources.getInteger(R.integer.suggest_flash_in_duration_ms);
        this.t = resources.getInteger(R.integer.suggest_flash_out_duration_ms);
        this.c = resources.getColor(R.color.G800, null);
        this.d = resources.getColor(R.color.G700, null);
        this.e = resources.getColor(R.color.G400, null);
        this.u = AnimationUtils.loadInterpolator(view.getContext(), R.anim.press_curve);
        this.L = (TextView) view.findViewById(R.id.subname);
        this.M = (TextView) view.findViewById(R.id.app_subname);
        this.N = (TextView) view.findViewById(R.id.genre);
        this.P = (TextView) view.findViewById(R.id.tv_network);
        View viewFindViewById = view.findViewById(R.id.slim_entity_card);
        this.H = viewFindViewById;
        FlexboxLayout flexboxLayout = (FlexboxLayout) view.findViewById(R.id.slim_entity_metadata_row_metadata);
        this.S = flexboxLayout;
        this.I = (LinearLayout) view.findViewById(R.id.header_container);
        this.J = (TextView) this.g.findViewById(R.id.entity_row_header_title);
        ImageDownloadView imageDownloadView = (ImageDownloadView) view.findViewById(R.id.foreground_image);
        this.v = imageDownloadView;
        this.w = view.findViewById(R.id.foreground_image_attribution_button);
        View viewFindViewById2 = view.findViewById(R.id.foreground_image_attribution_group);
        this.x = viewFindViewById2;
        this.K = (TextView) view.findViewById(R.id.foreground_image_attribution_text);
        this.R = (TextView) view.findViewById(R.id.display_rating);
        FlexboxLayout flexboxLayout2 = (FlexboxLayout) view.findViewById(R.id.app_metadata);
        this.Q = flexboxLayout2;
        this.T = (ViewGroup) view.findViewById(R.id.rt_container);
        this.U = (ViewGroup) view.findViewById(R.id.imdb_container);
        this.z = (ViewGroup) view.findViewById(R.id.action_list);
        this.V = new heo(view.getContext(), hmbVar);
        FlexboxLayout flexboxLayout3 = (FlexboxLayout) view.findViewById(R.id.entity_action_flexbox);
        this.y = flexboxLayout3;
        flexboxLayout3.setVisibility(0);
        View viewFindViewById3 = this.g.findViewById(R.id.action_list_end);
        this.A = viewFindViewById3;
        this.B = viewFindViewById3.getLayoutParams().width;
        this.C = resources.getDimensionPixelSize(R.dimen.entity_details_action_button_height);
        Drawable drawableA = hmh.a(resources);
        flexboxLayout.f(drawableA);
        flexboxLayout2.f(drawableA);
        imageDownloadView.setVisibility(4);
        viewFindViewById2.setVisibility(4);
        this.F = 1;
        imageDownloadView.setOutlineProvider(new hsb(resources.getDimensionPixelSize(R.dimen.lb_rounded_rect_corner_radius)));
        imageDownloadView.setClipToOutline(true);
        viewFindViewById.setClipToOutline(true);
    }

    private static void f(TextView textView, String str) {
        if (TextUtils.isEmpty(str)) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
            textView.setText(str);
        }
    }

    private final void g(hsj hsjVar) throws Resources.NotFoundException {
        List list = hsjVar.e;
        if (list.isEmpty()) {
            this.z.setVisibility(8);
            ((ViewGroup.MarginLayoutParams) this.A.getLayoutParams()).setMarginStart(-this.B);
            return;
        }
        if (hsjVar.v() && !this.Z.B()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                hej hejVar = (hej) it.next();
                if (hejVar != null && hejVar.i < 2.0d) {
                    it.remove();
                }
            }
        }
        Iterator it2 = list.iterator();
        boolean z = false;
        while (it2.hasNext()) {
            hej hejVar2 = (hej) it2.next();
            if (!hejVar2.l) {
                it2.remove();
            } else if (!hejVar2.a() && !hejVar2.m) {
                if (z) {
                    it2.remove();
                }
                z = true;
            }
        }
        heo heoVar = this.V;
        heoVar.d = list;
        ViewGroup viewGroup = this.z;
        viewGroup.setVisibility(0);
        if (this.Z.B()) {
            this.y.getViewTreeObserver().addOnGlobalLayoutListener(new hsc(this, this.G.getDimensionPixelSize(R.dimen.space_salmon)));
        } else {
            ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            layoutParams.height = this.C;
            viewGroup.setLayoutParams(layoutParams);
            viewGroup.getViewTreeObserver().addOnGlobalLayoutListener(new hsd(this, viewGroup));
        }
        FlexboxLayout flexboxLayout = this.y;
        if (flexboxLayout.hasFocus()) {
            this.Y = false;
        }
        flexboxLayout.removeAllViews();
        for (int i = 0; i < heoVar.a(); i++) {
            qv qvVarD = heoVar.d(flexboxLayout, 0);
            heoVar.f(qvVarD, i);
            flexboxLayout.addView(qvVarD.a);
        }
        if (this.Y) {
            return;
        }
        this.Y = true;
        if (this.H.hasFocus()) {
            flexboxLayout.requestFocus();
        }
    }

    public final void d() {
        ImageDownloadView imageDownloadView = this.v;
        imageDownloadView.setOnClickListener(this.W);
        imageDownloadView.setOnFocusChangeListener(this.X);
        if (this.X == null) {
            this.x.setVisibility(4);
            return;
        }
        this.x.setVisibility(0);
        GradientDrawable gradientDrawable = (GradientDrawable) this.w.getBackground();
        if (imageDownloadView.hasFocus()) {
            gradientDrawable.setColor(this.d);
        } else {
            gradientDrawable.setColor(this.c);
        }
    }

    public final void e(final hsj hsjVar) {
        if (this.F != 3) {
            String strJ = hsjVar.j();
            adwq adwqVarE = hsjVar.e();
            if (strJ != null && adwqVarE != null && hsjVar.l() != null) {
                ImageDownloadView imageDownloadView = this.v;
                imageDownloadView.setFocusable(true);
                this.D = true;
                this.K.setText(hsjVar.l());
                this.W = new View.OnClickListener() { // from class: hry
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.a.E.p().h(new hse(hsjVar));
                    }
                };
                this.X = new View.OnFocusChangeListener() { // from class: hrz
                    @Override // android.view.View.OnFocusChangeListener
                    public final void onFocusChange(View view, boolean z) {
                        hsh hshVar = this.a;
                        final GradientDrawable gradientDrawable = (GradientDrawable) hshVar.w.getBackground();
                        if (!z) {
                            ImageDownloadView imageDownloadView2 = hshVar.v;
                            Animator animator = (Animator) imageDownloadView2.getTag(R.id.suggestion_flash_animator);
                            if (animator != null) {
                                if (animator.isRunning()) {
                                    animator.cancel();
                                }
                                imageDownloadView2.setTag(R.id.suggestion_flash_animator, null);
                            }
                            gradientDrawable.setColor(hshVar.c);
                        } else if (hshVar.D) {
                            gradientDrawable.setColor(hshVar.d);
                        } else {
                            ValueAnimator.AnimatorUpdateListener animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: hsa
                                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    gradientDrawable.setColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
                                }
                            };
                            ArgbEvaluator argbEvaluator = new ArgbEvaluator();
                            Integer numValueOf = Integer.valueOf(hshVar.c);
                            Integer numValueOf2 = Integer.valueOf(hshVar.e);
                            ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(argbEvaluator, numValueOf, numValueOf2);
                            valueAnimatorOfObject.setDuration(hshVar.f);
                            Interpolator interpolator = hshVar.u;
                            valueAnimatorOfObject.setInterpolator(interpolator);
                            valueAnimatorOfObject.addUpdateListener(animatorUpdateListener);
                            ValueAnimator valueAnimatorOfObject2 = ValueAnimator.ofObject(new ArgbEvaluator(), numValueOf2, Integer.valueOf(hshVar.d));
                            valueAnimatorOfObject2.setDuration(hshVar.t);
                            valueAnimatorOfObject2.setInterpolator(interpolator);
                            valueAnimatorOfObject2.addUpdateListener(animatorUpdateListener);
                            AnimatorSet animatorSet = new AnimatorSet();
                            animatorSet.playSequentially(valueAnimatorOfObject, valueAnimatorOfObject2);
                            hshVar.v.setTag(R.id.suggestion_flash_animator, animatorSet);
                            animatorSet.start();
                        }
                        hshVar.D = false;
                    }
                };
                Resources resources = this.G;
                imageDownloadView.setForeground(new jrq(ColorStateList.valueOf(resources.getColor(R.color.pressed_foreground_ripple_color, null)), (int) resources.getDimension(R.dimen.pressed_foreground_ripple_radius)));
                return;
            }
        }
        ImageDownloadView imageDownloadView2 = this.v;
        imageDownloadView2.setFocusable(false);
        imageDownloadView2.setForeground(null);
        this.K.setText("");
        this.W = null;
        this.X = null;
    }

    @Override // defpackage.hog
    public final void m() throws Resources.NotFoundException {
        g(this.b);
    }

    @Override // defpackage.hog
    public final void n() throws Resources.NotFoundException {
        String string;
        hsj hsjVar = this.b;
        String strJ = hsjVar.j();
        if (!TextUtils.isEmpty(strJ)) {
            this.x.setVisibility(4);
            this.F = 1;
            ImageDownloadView imageDownloadView = this.v;
            imageDownloadView.d = new hsg(this);
            imageDownloadView.b(Uri.parse(strJ), true != hsjVar.g ? R.drawable.ic_search_default : R.drawable.ic_card_noface, this.E.k());
        }
        hsj hsjVar2 = this.b;
        aead aeadVar = null;
        if (TextUtils.isEmpty(hsjVar2.n())) {
            TextView textView = this.J;
            textView.setText(hsjVar2.B());
            textView.setTextAppearance(R.style.h6MediumG200TextAppearance);
            textView.setMaxLines(Integer.MAX_VALUE);
            textView.setEllipsize(null);
            this.v.setVisibility(8);
            LinearLayout linearLayout = this.I;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) linearLayout.getLayoutParams();
            Resources resources = this.G;
            marginLayoutParams.topMargin = resources.getDimensionPixelSize(R.dimen.space_light_blue);
            marginLayoutParams.setMarginStart(resources.getDimensionPixelSize(R.dimen.space_purple));
            linearLayout.setLayoutParams(marginLayoutParams);
        } else {
            this.J.setText(hsjVar2.n());
        }
        adwo adwoVarD = this.b.d();
        if (adwoVarD == null || !(adwoVarD.b || adwoVarD.c)) {
            this.Q.setVisibility(8);
        } else {
            FlexboxLayout flexboxLayout = this.Q;
            flexboxLayout.setVisibility(0);
            View viewFindViewById = flexboxLayout.findViewById(R.id.gp_required_container);
            View viewFindViewById2 = flexboxLayout.findViewById(R.id.in_app_purchase_label);
            viewFindViewById.setVisibility(true != adwoVarD.b ? 8 : 0);
            viewFindViewById2.setVisibility(true != adwoVarD.c ? 8 : 0);
        }
        if (this.Q.getVisibility() == 0) {
            f(this.M, this.b.m());
            this.L.setVisibility(8);
        } else {
            f(this.L, this.b.m());
            this.M.setVisibility(8);
        }
        f(this.P, this.b.q());
        f(this.N, this.b.k());
        adyf adyfVarG = this.b.g();
        Duration durationH = this.b.h();
        if (adyfVarG != null) {
            String str = (adyfVarG.d.isEmpty() || adyfVarG.e.isEmpty()) ? !adyfVarG.d.isEmpty() ? adyfVarG.d : "" : adyfVarG.d + " - " + adyfVarG.e;
            FlexboxLayout flexboxLayout2 = this.S;
            f((TextView) flexboxLayout2.findViewById(R.id.display_date), str);
            TextView textView2 = (TextView) flexboxLayout2.findViewById(R.id.display_duration);
            if (ztt.b(durationH)) {
                long hours = durationH.toHours();
                int minutesPart = durationH.toMinutesPart();
                string = minutesPart == 0 ? this.G.getString(R.string.tvm_duration_hours, Long.valueOf(hours)) : hours == 0 ? this.G.getString(R.string.tvm_duration_minutes, Integer.valueOf(minutesPart)) : this.G.getString(R.string.tvm_duration_hours_minutes, Long.valueOf(hours), Integer.valueOf(minutesPart));
            } else {
                string = null;
            }
            f(textView2, string);
            f(this.R, adyfVarG.g);
            if (adyfVarG.c.size() != 0) {
                aead aeadVar2 = null;
                aead aeadVar3 = null;
                for (aead aeadVar4 : adyfVarG.c) {
                    int i = aeadVar4.b;
                    int iA = aeac.a(i);
                    if (iA == 0 || iA != 2) {
                        int iA2 = aeac.a(i);
                        if (iA2 == 0 || iA2 == 1) {
                            if (aeadVar == null) {
                                aeadVar = aeadVar4;
                            }
                            if (ypx.d("IMDb", aeadVar4.c)) {
                                aeadVar2 = aeadVar4;
                            }
                        }
                    } else if (!aeadVar4.e.isEmpty() && !aeadVar4.d.isEmpty()) {
                        aeadVar3 = aeadVar4;
                    }
                    if (aeadVar2 != null && aeadVar3 != null) {
                        break;
                    }
                }
                ViewGroup viewGroup = this.T;
                ImageView imageView = (ImageView) viewGroup.findViewById(R.id.rt_icon);
                if (aeadVar3 != null) {
                    Resources resources2 = this.G;
                    hmb hmbVar = this.E;
                    int dimensionPixelSize = resources2.getDimensionPixelSize(R.dimen.s2_text_size);
                    cyx cyxVarF = hmbVar.k().a().f(Uri.parse(aeadVar3.e));
                    cyxVarF.p(new hsf(imageView, imageView, dimensionPixelSize), cyxVarF, dqc.a);
                }
                if (aeadVar2 != null || aeadVar == null) {
                    aeadVar = aeadVar2;
                }
                ViewGroup viewGroup2 = this.U;
                TextView textView3 = (TextView) viewGroup2.findViewById(R.id.imdb_score);
                if (aeadVar != null) {
                    viewGroup2.setVisibility(0);
                    textView3.setText(aeadVar.d);
                } else {
                    viewGroup2.setVisibility(8);
                }
                TextView textView4 = (TextView) viewGroup.findViewById(R.id.rt_rating);
                if (aeadVar3 != null) {
                    viewGroup.setVisibility(0);
                    textView4.setText(aeadVar3.d);
                } else {
                    viewGroup.setVisibility(8);
                }
            }
        }
        FlexboxLayout flexboxLayout3 = this.S;
        int i2 = 0;
        while (true) {
            if (i2 >= flexboxLayout3.getChildCount()) {
                flexboxLayout3.setVisibility(8);
                break;
            } else {
                if (flexboxLayout3.getChildAt(i2).getVisibility() == 0) {
                    flexboxLayout3.setVisibility(0);
                    break;
                }
                i2++;
            }
        }
        g(this.b);
        e(this.b);
        if (this.F == 2) {
            d();
        }
        paq.c(this.H, new pan(this.b.c()));
    }

    @Override // defpackage.jac
    public final void o() {
    }

    @Override // defpackage.jac
    public final void p() {
    }
}
