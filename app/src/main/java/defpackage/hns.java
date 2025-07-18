package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.tvsearch.results.searchentity.EntityCard;
import com.google.android.apps.tvsearch.widget.imagedownload.ImageDownloadView;
import com.google.android.flexbox.FlexboxLayout;
import com.google.android.katniss.R;
import j$.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class hns extends hux implements hog {
    protected final TextView A;
    protected final View B;
    protected final FlexboxLayout C;
    protected final FlexboxLayout D;
    public final FlexboxLayout E;
    public final ViewGroup F;
    public final View G;
    public final View H;
    public final int I;
    public final int J;
    public List K;
    public boolean L;
    public final hny M;
    public final hmb N;
    private final int P;
    private final int Q;
    private final int R;
    private final Interpolator S;
    private final ViewGroup T;
    private final ViewGroup U;
    private final heo V;
    private boolean W;
    private final boolean X;
    private final hmc Y;
    protected final Resources a;
    public hoh b;
    protected final int c;
    protected final int d;
    public final int e;
    public final int f;
    final EntityCard t;
    protected final LinearLayout u;
    protected final TextView v;
    final TextView w;
    public final ViewGroup x;
    public final TextView y;
    public final ViewGroup z;

    public hns(View view, hmb hmbVar, boolean z, hmc hmcVar) {
        super(view);
        this.W = false;
        this.N = hmbVar;
        this.X = z;
        this.Y = hmcVar;
        Resources resources = view.getResources();
        this.a = resources;
        this.Q = resources.getInteger(R.integer.suggest_flash_in_duration_ms);
        this.R = resources.getInteger(R.integer.suggest_flash_out_duration_ms);
        this.P = resources.getColor(R.color.G400, null);
        this.c = resources.getColor(R.color.G900, null);
        this.d = resources.getColor(R.color.G300p08, null);
        this.e = resources.getColor(R.color.G400, null);
        this.f = resources.getColor(R.color.G50, null);
        this.S = AnimationUtils.loadInterpolator(view.getContext(), R.anim.press_curve);
        this.J = resources.getDimensionPixelSize(R.dimen.entity_details_action_button_height);
        EntityCard entityCard = (EntityCard) view.findViewById(R.id.entity_card);
        this.t = entityCard;
        entityCard.h = new hnl(this);
        ViewGroup viewGroup = (ViewGroup) entityCard.findViewById(R.id.description_container);
        this.x = viewGroup;
        ViewStub viewStub = (ViewStub) viewGroup.findViewById(R.id.attribution_button_stub);
        viewStub.setLayoutResource(d());
        View viewInflate = viewStub.inflate();
        this.B = viewInflate;
        this.A = f(viewInflate);
        r();
        this.M = g(entityCard, hmbVar, hmcVar);
        LinearLayout linearLayout = (LinearLayout) this.g.findViewById(R.id.header_container);
        this.u = linearLayout;
        this.v = (TextView) this.g.findViewById(R.id.entity_row_header_title);
        TextView textView = (TextView) view.findViewById(R.id.entity_detail_description);
        this.y = textView;
        this.z = (ViewGroup) view.findViewById(R.id.badge_under_description_container);
        TextView textView2 = (TextView) view.findViewById(R.id.fact);
        this.w = textView2;
        FlexboxLayout flexboxLayout = (FlexboxLayout) view.findViewById(R.id.entity_metadata_row_metadata);
        this.D = flexboxLayout;
        FlexboxLayout flexboxLayout2 = (FlexboxLayout) view.findViewById(R.id.app_metadata);
        this.C = flexboxLayout2;
        this.T = (ViewGroup) view.findViewById(R.id.rt_container);
        this.U = (ViewGroup) view.findViewById(R.id.imdb_container);
        Drawable drawableE = e();
        flexboxLayout.f(drawableE);
        flexboxLayout2.f(drawableE);
        this.F = (ViewGroup) view.findViewById(R.id.action_list);
        this.V = new heo(view.getContext(), hmbVar);
        FlexboxLayout flexboxLayout3 = (FlexboxLayout) view.findViewById(R.id.entity_action_flexbox);
        this.E = flexboxLayout3;
        flexboxLayout3.setVisibility(0);
        View viewFindViewById = this.g.findViewById(R.id.action_list_end);
        this.H = viewFindViewById;
        this.I = viewFindViewById.getLayoutParams().width;
        this.G = this.g.findViewById(R.id.on_device_search_running);
        if (hmbVar.m().isTouchExplorationEnabled()) {
            entityCard.setFocusable(false);
            y(linearLayout);
            y(textView2);
            y(flexboxLayout);
            y(flexboxLayout2);
            y(textView);
        }
    }

    static void l(View view, int i, String str) {
        View viewFindViewById = view.findViewById(i);
        if (!TextUtils.isEmpty(str) && (viewFindViewById instanceof TextView)) {
            viewFindViewById.setVisibility(0);
            ((TextView) viewFindViewById).setText(str);
        } else if (viewFindViewById != null) {
            viewFindViewById.setVisibility(8);
        }
    }

    static boolean v(adwo adwoVar) {
        if (adwoVar != null) {
            return (adwoVar.b || adwoVar.c) ? false : true;
        }
        return true;
    }

    private static void x(TextView textView, String str) {
        if (TextUtils.isEmpty(str)) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
            textView.setText(str);
        }
    }

    private final void y(View view) {
        if (view != null) {
            view.setFocusable(true);
            view.setFocusableInTouchMode(true);
        }
    }

    private final boolean z() {
        return this.Y.B();
    }

    protected int d() {
        return R.layout.entity_description_attribution_watson;
    }

    protected Drawable e() {
        return hmh.a(this.a);
    }

    protected TextView f(View view) {
        return (TextView) view.findViewById(R.id.attribution_text);
    }

    protected hny g(ViewGroup viewGroup, hmb hmbVar, hmc hmcVar) {
        return new hof(viewGroup, hmbVar, hmcVar);
    }

    protected void h() throws Resources.NotFoundException {
        Resources resources = this.a;
        final Drawable drawable = resources.getDrawable(R.drawable.attribution_link_icon, null);
        if (drawable != null) {
            TextView textView = this.A;
            int textSize = (int) textView.getTextSize();
            drawable.setBounds(0, 0, textSize, textSize);
            textView.setCompoundDrawablesRelative(null, null, drawable, null);
            textView.setCompoundDrawablePadding((int) resources.getDimension(R.dimen.space_white));
        }
        int dimension = (int) resources.getDimension(R.dimen.space_aqua);
        int dimension2 = (int) resources.getDimension(R.dimen.space_light_yellow);
        View view = this.B;
        view.setPaddingRelative(dimension2, dimension, dimension, dimension);
        final GradientDrawable gradientDrawable = (GradientDrawable) resources.getDrawable(R.drawable.entity_image_attribution_background, null);
        gradientDrawable.mutate();
        view.setBackground(gradientDrawable);
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: hni
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                gradientDrawable.setColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        };
        ArgbEvaluator argbEvaluator = new ArgbEvaluator();
        Integer numValueOf = Integer.valueOf(this.c);
        Integer numValueOf2 = Integer.valueOf(this.P);
        ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(argbEvaluator, numValueOf, numValueOf2);
        valueAnimatorOfObject.setDuration(this.Q);
        Interpolator interpolator = this.S;
        valueAnimatorOfObject.setInterpolator(interpolator);
        valueAnimatorOfObject.addUpdateListener(animatorUpdateListener);
        ValueAnimator valueAnimatorOfObject2 = ValueAnimator.ofObject(new ArgbEvaluator(), numValueOf2, Integer.valueOf(this.d));
        valueAnimatorOfObject2.setDuration(this.R);
        valueAnimatorOfObject2.setInterpolator(interpolator);
        valueAnimatorOfObject2.addUpdateListener(animatorUpdateListener);
        final AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(valueAnimatorOfObject, valueAnimatorOfObject2);
        view.getViewTreeObserver().addOnPreDrawListener(new hnq(this, gradientDrawable, new View.OnFocusChangeListener() { // from class: hnh
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                hns hnsVar = this.a;
                Drawable drawable2 = drawable;
                if (z) {
                    Animator animator = animatorSet;
                    hnsVar.B.setTag(R.id.suggestion_flash_animator, animator);
                    animator.start();
                    TextView textView2 = hnsVar.A;
                    int i = hnsVar.f;
                    textView2.setTextColor(i);
                    if (drawable2 != null) {
                        drawable2.setTint(i);
                        return;
                    }
                    return;
                }
                View view3 = hnsVar.B;
                Animator animator2 = (Animator) view3.getTag(R.id.suggestion_flash_animator);
                if (animator2 != null) {
                    animator2.cancel();
                    view3.setTag(R.id.suggestion_flash_animator, null);
                }
                gradientDrawable.setColor(hnsVar.c);
                TextView textView3 = hnsVar.A;
                int i2 = hnsVar.e;
                textView3.setTextColor(i2);
                if (drawable2 != null) {
                    drawable2.setTint(i2);
                }
            }
        }));
    }

    public final void i() {
        LinearLayout linearLayout = this.u;
        View viewFindViewById = linearLayout.findViewById(R.id.badge_in_title);
        if (viewFindViewById != null) {
            linearLayout.removeView(viewFindViewById);
        }
    }

    public final void j() {
        ViewGroup viewGroup = this.z;
        View viewFindViewById = viewGroup.findViewById(R.id.badge_under_description);
        if (viewFindViewById != null) {
            viewGroup.removeView(viewFindViewById);
        }
    }

    public void k(ViewGroup viewGroup, hoh hohVar) throws Resources.NotFoundException {
        String str;
        String string;
        l(viewGroup, R.id.tv_network, hohVar.q());
        l(viewGroup, R.id.genre, hohVar.k());
        if (v(hohVar.d())) {
            l(viewGroup, R.id.subname, hohVar.m());
        } else {
            viewGroup.findViewById(R.id.subname).setVisibility(8);
        }
        adyf adyfVarG = hohVar.g();
        aead aeadVar = null;
        if (adyfVarG == null || adyfVarG.d.isEmpty()) {
            str = null;
        } else if (adyfVarG.e.isEmpty()) {
            str = adyfVarG.d;
        } else {
            str = adyfVarG.d + " - " + adyfVarG.e;
        }
        l(viewGroup, R.id.display_date, str);
        if (adyfVarG != null) {
            Duration durationH = hohVar.h();
            if (ztt.b(durationH)) {
                long hours = durationH.toHours();
                int minutesPart = durationH.toMinutesPart();
                string = minutesPart == 0 ? this.a.getString(R.string.tvm_duration_hours, Long.valueOf(hours)) : hours == 0 ? this.a.getString(R.string.tvm_duration_minutes, Integer.valueOf(minutesPart)) : this.a.getString(R.string.tvm_duration_hours_minutes, Long.valueOf(hours), Integer.valueOf(minutesPart));
            } else {
                string = null;
            }
            l(viewGroup, R.id.display_duration, string);
        } else {
            View viewFindViewById = viewGroup.findViewById(R.id.display_duration);
            if (viewFindViewById != null) {
                viewFindViewById.setVisibility(8);
            }
            adyfVarG = null;
        }
        if (adyfVarG == null || adyfVarG.c.size() == 0) {
            this.U.setVisibility(8);
            this.T.setVisibility(8);
        } else {
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
            if (aeadVar2 == null && aeadVar != null) {
                aeadVar2 = aeadVar;
            }
            if (aeadVar3 != null) {
                ImageView imageView = (ImageView) this.T.findViewById(R.id.rt_icon);
                Resources resources = this.a;
                hmb hmbVar = this.N;
                int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.s2_text_size);
                cyx cyxVarF = hmbVar.k().a().f(Uri.parse(aeadVar3.e));
                cyxVarF.p(new hnr(imageView, imageView, dimensionPixelSize), cyxVarF, dqc.a);
            }
            ViewGroup viewGroup2 = this.T;
            TextView textView = (TextView) viewGroup2.findViewById(R.id.rt_rating);
            if (aeadVar3 != null) {
                viewGroup2.setVisibility(0);
                textView.setText(aeadVar3.d);
                if (this.b.k) {
                    viewGroup2.findViewById(R.id.rt_disclaimer_icon).setVisibility(0);
                }
            } else {
                viewGroup2.setVisibility(8);
            }
            ViewGroup viewGroup3 = this.U;
            TextView textView2 = (TextView) viewGroup3.findViewById(R.id.imdb_score);
            if (aeadVar2 != null) {
                viewGroup3.setVisibility(0);
                textView2.setText(aeadVar2.d);
                if (this.b.k) {
                    viewGroup3.findViewById(R.id.imdb_disclaimer_icon).setVisibility(0);
                }
            } else {
                viewGroup3.setVisibility(8);
            }
        }
        for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
            if (viewGroup.getChildAt(i2).getVisibility() == 0) {
                viewGroup.setVisibility(0);
                return;
            }
        }
        viewGroup.setVisibility(8);
    }

    @Override // defpackage.hog
    public final void m() throws Resources.NotFoundException {
        t(this.b);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0075  */
    @Override // defpackage.hog
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void n() {
        /*
            Method dump skipped, instructions count: 625
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hns.n():void");
    }

    @Override // defpackage.jac
    public final void o() {
        this.G.setVisibility(0);
    }

    @Override // defpackage.jac
    public final void p() {
        this.G.setVisibility(8);
    }

    protected void q() {
        TextView textView = this.A;
        textView.setTextAppearance(R.style.s1G400TextAppearance);
        textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        View view = this.B;
        view.setPaddingRelative(0, 0, 0, 0);
        view.setBackgroundResource(0);
        view.setOnFocusChangeListener(null);
    }

    protected void r() {
        hnp hnpVar = new hnp(this.a.getDimensionPixelSize(R.dimen.lb_rounded_rect_corner_radius));
        View view = this.B;
        view.setOutlineProvider(hnpVar);
        view.setClipToOutline(true);
    }

    public final void s(ViewGroup viewGroup, View view) {
        float width = view.getWidth();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            width += marginLayoutParams.getMarginStart() + marginLayoutParams.getMarginEnd();
        }
        if (view.getResources().getConfiguration().getLayoutDirection() == 0) {
            width = -width;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(viewGroup, (Property<ViewGroup, Float>) View.TRANSLATION_X, width);
        objectAnimatorOfFloat.setDuration(300L);
        objectAnimatorOfFloat.addListener(new hnm(view, viewGroup));
        objectAnimatorOfFloat.start();
    }

    public final void t(hoh hohVar) throws Resources.NotFoundException {
        adyd adydVar;
        int iA;
        List list = hohVar.e;
        if (list.isEmpty()) {
            this.F.setVisibility(8);
            ((ViewGroup.MarginLayoutParams) this.H.getLayoutParams()).setMarginStart(-this.I);
            return;
        }
        if (hohVar.v() && !z()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                hej hejVar = (hej) it.next();
                if (hejVar != null && hejVar.i < 2.0d) {
                    it.remove();
                }
            }
        }
        if (z() && (adydVar = hohVar.d) != null && (adydVar.b & 16384) != 0 && (iA = adyc.a(adydVar.o)) != 0 && iA == 22) {
            Iterator it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                hej hejVar2 = (hej) it2.next();
                if (hejVar2 != null && hejVar2.a()) {
                    it2.remove();
                    break;
                }
            }
        }
        heo heoVar = this.V;
        heoVar.d = list;
        ViewGroup viewGroup = this.F;
        viewGroup.setVisibility(0);
        if (this.Y.B()) {
            this.E.getViewTreeObserver().addOnGlobalLayoutListener(new hnn(this, this.a.getDimensionPixelSize(R.dimen.space_salmon)));
        } else {
            ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            layoutParams.height = this.J;
            viewGroup.setLayoutParams(layoutParams);
            viewGroup.setClipChildren(true);
            viewGroup.getViewTreeObserver().addOnGlobalLayoutListener(new hno(this, viewGroup));
        }
        FlexboxLayout flexboxLayout = this.E;
        if (flexboxLayout.hasFocus()) {
            this.W = false;
        }
        flexboxLayout.removeAllViews();
        this.K = new ArrayList();
        for (int i = 0; i < heoVar.a(); i++) {
            qv qvVarD = heoVar.d(flexboxLayout, 0);
            heoVar.f(qvVarD, i);
            flexboxLayout.addView(qvVarD.a);
            this.K.add(qvVarD);
        }
        if (this.W) {
            return;
        }
        this.W = true;
        if (this.t.hasFocus()) {
            flexboxLayout.requestFocus();
        }
    }

    protected void u() {
        String strTrim;
        int iA;
        hoh hohVar = this.b;
        adyd adydVar = hohVar.d;
        if (adydVar == null || adydVar.f.size() <= 0) {
            strTrim = "";
        } else {
            adyd adydVar2 = hohVar.d;
            if ((adydVar2 == null || (adydVar2.b & 16384) == 0 || (iA = adyc.a(adydVar2.o)) == 0 || iA != 15) && !hohVar.x()) {
                strTrim = ((adxg) hohVar.d.f.get(0)).c;
            } else {
                StringBuilder sb = new StringBuilder();
                for (adxg adxgVar : hohVar.d.f) {
                    if (!adxgVar.b.isEmpty() && !adxgVar.c.isEmpty()) {
                        sb.append(adxgVar.b);
                        sb.append(": ");
                        sb.append(adxgVar.c);
                        sb.append("\n");
                    }
                }
                strTrim = sb.toString().trim();
            }
        }
        x(this.w, strTrim);
    }

    public boolean w(hoh hohVar) {
        ImageDownloadView imageDownloadView = this.M.e;
        if (imageDownloadView != null) {
            return !hohVar.w() && imageDownloadView.getDrawable() == null;
        }
        return true;
    }
}
