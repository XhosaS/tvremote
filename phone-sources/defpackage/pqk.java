package defpackage;

import android.app.Activity;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.libraries.material.featurehighlight.TextContentView;
import com.google.android.material.button.MaterialButton;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pqk extends bv {
    private ColorStateList A;
    private ColorStateList B;
    private int C;
    private int D;
    private ColorStateList E;
    private int F;
    private int I;
    private int J;
    private int K;
    private int L;
    private float M;
    private int N;
    private int O;
    private int P;
    private boolean Q;
    private boolean R;
    private boolean S;
    private int T;
    private prb U;
    private pql V;
    private int W;
    private boolean X;
    public prc a;
    public String b;
    public boolean c;
    public long d;
    CharSequence e;
    pqh f;
    public pqw g;
    private int l;
    private int m;
    private CharSequence n;
    private int o;
    private int p;
    private ColorStateList q;
    private int r;
    private CharSequence s;
    private int t;
    private int u;
    private ColorStateList v;
    private int w;
    private CharSequence x;
    private int y;
    private ColorStateList z;
    private int G = 0;
    private int H = 0;
    public int h = 0;
    public final Runnable i = new pqi(this, 3);
    public boolean j = false;
    public boolean k = false;

    public final View a() {
        by activity;
        int i = this.m;
        if (i == -1 || (activity = getActivity()) == null) {
            return null;
        }
        return activity.findViewById(i);
    }

    final void b(int i) {
        if (this.h != 1 || this.g == null) {
            return;
        }
        tbk tbkVarE = e();
        if (tbkVarE != null) {
            ((tvk) pgz.a.l().j("com/google/android/libraries/internal/growth/growthkit/internal/ui/impl/gm/taptarget/FeatureHighlightController$1", "onDismiss", 90, "FeatureHighlightController.java")).s("FeatureHighlight dismissed");
            Object obj = tbkVarE.b;
            uxd uxdVar = uxd.DISMISSED;
            pgz pgzVar = (pgz) obj;
            oyd oydVar = pgzVar.b;
            uyr uyrVar = oydVar.c.f;
            if (uyrVar == null) {
                uyrVar = uyr.a;
            }
            uyy uyyVar = uyrVar.c == 3 ? (uyy) uyrVar.d : uyy.a;
            if (i == 3) {
                uxw uxwVar = uyyVar.p;
                if (uxwVar == null) {
                    uxwVar = uxw.a;
                }
                uxv uxvVarB = uxv.b(uxwVar.e);
                if (uxvVarB == null) {
                    uxvVarB = uxv.ACTION_UNKNOWN;
                }
                if (uxvVarB == uxv.ACTION_ACKNOWLEDGE) {
                    uxdVar = uxd.ACKNOWLEDGE_RESPONSE;
                }
            }
            pgzVar.e.i(oydVar, uxdVar);
            tbkVarE.a = true;
        }
        d();
        this.g.g(new pqi(this, 0));
    }

    public final void c() {
        cr fragmentManager;
        if (getActivity() == null || getActivity().isFinishing() || !isAdded() || isRemoving() || (fragmentManager = getFragmentManager()) == null) {
            return;
        }
        at atVar = new at(fragmentManager);
        atVar.m(this);
        atVar.l();
    }

    public final void d() {
        this.h = 0;
    }

    public final tbk e() {
        pqh pqhVar = this.f;
        if (pqhVar != null) {
            return pqhVar.b();
        }
        return null;
    }

    @Override // defpackage.bv
    public final void onActivityCreated(Bundle bundle) throws Throwable {
        super.onActivityCreated(bundle);
        boolean z = bundle != null;
        this.j = z;
        if (z && this.h == 0) {
            c();
            return;
        }
        int i = this.W;
        pqw pqwVar = new pqw(i == 0 ? getContext() : new ContextThemeWrapper(getContext(), i), this.V);
        this.g = pqwVar;
        boolean z2 = this.Q;
        pqwVar.x = z2;
        pqz pqzVar = pqwVar.q;
        pqzVar.e = z2;
        pqwVar.y = this.R;
        pqwVar.z = this.S;
        pqzVar.f = this.T;
        int i2 = this.F;
        if (i2 != 0) {
            pqwVar.e.c(i2);
        }
        int i3 = this.G;
        if (i3 != 0) {
            int i4 = this.H;
            if (i4 != 0) {
                this.g.j(i3, i4);
            } else {
                pqw pqwVar2 = this.g;
                pqwVar2.j(i3, csq.g(i3, pqwVar2.getContext().getResources().getInteger(pqwVar2.F == pql.Legacy ? R.integer.libraries_material_featurehighlight_pulse_base_alpha : R.integer.libraries_material_featurehighlight_gm_pulse_base_alpha)));
            }
        }
        int i5 = this.I;
        if (i5 != 0) {
            this.g.e.d(i5);
        }
        int i6 = this.J;
        if (i6 != 0) {
            this.g.h = i6;
        }
        if (this.K != 0) {
            Resources resources = getResources();
            int i7 = this.K;
            Resources.Theme theme = getActivity().getTheme();
            ThreadLocal threadLocal = cso.a;
            Drawable drawable = resources.getDrawable(i7, theme);
            if (drawable != null) {
                if (this.L != 0) {
                    drawable.mutate();
                    drawable.setTint(this.L);
                }
                pqw pqwVar3 = this.g;
                pqwVar3.k = drawable;
                drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
                drawable.setCallback(pqwVar3);
            }
        }
        pqw pqwVar4 = this.g;
        float f = this.M;
        float f2 = pqwVar4.l;
        pqwVar4.l = f;
        if (pqwVar4.A && f2 != f) {
            pqwVar4.requestLayout();
        }
        pqw pqwVar5 = this.g;
        boolean z3 = this.X;
        pqwVar5.m = z3;
        if (pqwVar5.g != null) {
            if (z3) {
                pqwVar5.l();
            } else {
                ImageView imageView = pqwVar5.o;
                if (imageView != null) {
                    pqwVar5.removeView(imageView);
                    pqwVar5.o = null;
                }
            }
        }
        if (this.o != 0) {
            this.g.H.a.setTextSize(getResources().getDimension(this.o) / getResources().getDisplayMetrics().density);
        }
        int i8 = this.p;
        if (i8 != 0) {
            TextContentView textContentView = this.g.H;
            textContentView.a.setTextAppearance(i8);
            textContentView.d(textContentView.a, i8);
        }
        ColorStateList colorStateList = this.q;
        if (colorStateList != null) {
            this.g.H.a.setTextColor(colorStateList);
        }
        TextContentView.i(this.g.H.a, this.r);
        if (this.t != 0) {
            this.g.H.b.setTextSize(getResources().getDimension(this.t) / getResources().getDisplayMetrics().density);
        }
        int i9 = this.u;
        if (i9 != 0) {
            TextContentView textContentView2 = this.g.H;
            textContentView2.b.setTextAppearance(i9);
            textContentView2.d(textContentView2.b, i9);
        }
        ColorStateList colorStateList2 = this.v;
        if (colorStateList2 != null) {
            this.g.H.b.setTextColor(colorStateList2);
        }
        TextContentView.i(this.g.H.b, this.w);
        int i10 = this.y;
        if (i10 != 0) {
            TextContentView textContentView3 = this.g.H;
            textContentView3.c.setTextAppearance(i10);
            textContentView3.d(textContentView3.c, i10);
        }
        ColorStateList colorStateList3 = this.z;
        if (colorStateList3 != null) {
            this.g.H.c.setTextColor(colorStateList3);
        }
        ColorStateList colorStateList4 = this.A;
        if (colorStateList4 != null) {
            TextView textView = this.g.H.c;
            if (textView instanceof MaterialButton) {
                MaterialButton materialButton = (MaterialButton) textView;
                if (materialButton.u()) {
                    sqr sqrVar = materialButton.e;
                    if (sqrVar.n != colorStateList4) {
                        sqrVar.n = colorStateList4;
                        MaterialButton materialButton2 = sqrVar.a;
                        if (materialButton2.getBackground() instanceof RippleDrawable) {
                            ((RippleDrawable) materialButton2.getBackground()).setColor(syj.b(colorStateList4));
                        }
                    }
                }
            }
        }
        ColorStateList colorStateList5 = this.B;
        if (colorStateList5 != null) {
            TextView textView2 = this.g.H.c;
            if (textView2 instanceof MaterialButton) {
                MaterialButton materialButton3 = (MaterialButton) textView2;
                if (materialButton3.u()) {
                    sqr sqrVar2 = materialButton3.e;
                    if (sqrVar2.m != colorStateList5) {
                        sqrVar2.m = colorStateList5;
                        sqrVar2.h();
                    }
                }
            }
        }
        TextContentView.i(this.g.H.c, this.C);
        pqw pqwVar6 = this.g;
        int i11 = this.D;
        TextView textView3 = pqwVar6.H.c;
        if (i11 == 0) {
            TextContentView.h(textView3, 8388611);
        } else if (i11 == 1) {
            TextContentView.h(textView3, 8388613);
        }
        ColorStateList colorStateList6 = this.E;
        if (colorStateList6 != null) {
            this.g.H.c.setBackgroundColor(colorStateList6.getDefaultColor());
        }
        if (this.N != 0 && this.O != 0) {
            int dimensionPixelOffset = getResources().getDimensionPixelOffset(this.N);
            int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(this.O);
            pra praVar = this.g.e;
            praVar.f = dimensionPixelOffset;
            praVar.e = dimensionPixelOffset2;
        }
        if (this.P != 0) {
            this.g.e.a = getResources().getDimensionPixelOffset(this.P);
        }
        int i12 = this.l;
        if (i12 != 0) {
            pqw pqwVar7 = this.g;
            pqwVar7.D = i12;
            Paint paint = new Paint();
            paint.setColorFilter(new PorterDuffColorFilter(i12, PorterDuff.Mode.SRC_IN));
            pqwVar7.C = paint;
            if (pqwVar7.q()) {
                pqwVar7.i();
            }
        }
        pqw pqwVar8 = this.g;
        CharSequence charSequence = this.n;
        CharSequence charSequence2 = this.s;
        CharSequence charSequence3 = this.x;
        TextContentView textContentView4 = pqwVar8.H;
        TextContentView.j(textContentView4.a, charSequence);
        TextContentView.j(textContentView4.b, charSequence2);
        TextContentView.j(textContentView4.c, charSequence3);
        textContentView4.c.setOnClickListener(new phn(textContentView4, 2));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (!TextUtils.isEmpty(charSequence)) {
            spannableStringBuilder.append(charSequence);
        }
        if (!TextUtils.isEmpty(charSequence2)) {
            if (!TextUtils.isEmpty(charSequence)) {
                spannableStringBuilder.append('\n');
            }
            spannableStringBuilder.append(charSequence2);
        }
        if (!TextUtils.isEmpty(charSequence3)) {
            if (!TextUtils.isEmpty(charSequence) || !TextUtils.isEmpty(charSequence2)) {
                spannableStringBuilder.append('\n');
            }
            spannableStringBuilder.append(charSequence3);
        }
        this.g.setContentDescription(this.e);
        pqw pqwVar9 = this.g;
        pqwVar9.f.g = this.U;
        if (!pqwVar9.r && !pqwVar9.x && pqwVar9.A) {
            pqwVar9.n(pqwVar9.a());
        }
        this.g.setTag(R.id.featurehighlight_view_tag_fragment, this);
        ((ViewGroup) getActivity().findViewById(android.R.id.content)).addView(this.g);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.bv
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        dxd parentFragment = getParentFragment();
        if (parentFragment instanceof pqh) {
            this.f = (pqh) parentFragment;
        } else if (activity instanceof pqh) {
            this.f = (pqh) activity;
        }
    }

    @Override // defpackage.bv
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments == null) {
            return;
        }
        arguments.setClassLoader(pqk.class.getClassLoader());
        this.a = (prc) arguments.getParcelable("fh_view_finder");
        this.l = arguments.getInt("fh_target_view_tint_color");
        this.m = arguments.getInt("fh_confining_view_id");
        this.n = arguments.getCharSequence("fh_header_text");
        this.o = arguments.getInt("fh_header_text_size_res");
        this.p = arguments.getInt("fh_header_text_appearance");
        this.q = (ColorStateList) arguments.getParcelable("fh_header_text_color");
        this.r = arguments.getInt("fh_header_text_alignment");
        this.s = arguments.getCharSequence("fh_body_text");
        this.t = arguments.getInt("fh_body_text_size_res");
        this.u = arguments.getInt("fh_body_text_appearance");
        this.v = (ColorStateList) arguments.getParcelable("fh_body_text_color");
        this.w = arguments.getInt("fh_body_text_alignment");
        this.x = arguments.getCharSequence("fh_dismiss_action_text");
        this.y = arguments.getInt("fh_dismiss_action_text_appearance");
        this.z = (ColorStateList) arguments.getParcelable("fh_dismiss_action_text_color");
        this.A = (ColorStateList) arguments.getParcelable("fh_dismiss_action_ripple_color");
        this.B = (ColorStateList) arguments.getParcelable("fh_dismiss_action_stroke_color");
        this.C = arguments.getInt("fh_dismiss_action_text_alignment");
        this.D = arguments.getInt("fh_dismiss_action_button_alignment");
        this.E = (ColorStateList) arguments.getParcelable("fh_dismiss_action_button_background_color");
        this.F = arguments.getInt("fh_outer_color");
        this.G = arguments.getInt("fh_pulse_inner_color");
        this.H = arguments.getInt("fh_pulse_outer_color");
        this.I = arguments.getInt("fh_scrim_color");
        this.J = arguments.getInt("fh_target_text_color");
        this.K = arguments.getInt("fh_target_drawable");
        this.L = arguments.getInt("fh_target_drawable_color");
        this.M = arguments.getFloat("fh_target_scale");
        this.X = arguments.getBoolean("fh_target_shadow_enabled");
        arguments.getString("fh_callback_id");
        this.b = arguments.getString("fh_task_tag");
        this.N = arguments.getInt("fh_vertical_offset_res");
        this.O = arguments.getInt("fh_horizontal_offset_res");
        this.P = arguments.getInt("fh_center_threshold_res");
        this.c = arguments.getBoolean("fh_task_complete_on_tap");
        this.d = arguments.getLong("fh_duration");
        this.Q = arguments.getBoolean("fh_pin_to_closest_vertical_edge");
        this.R = arguments.getBoolean("fh_swipe_to_dismiss_enabled");
        this.S = arguments.getBoolean("fh_tap_to_dismiss_enabled");
        this.T = arguments.getInt("fh_text_vertical_gravity_hint");
        this.e = arguments.getCharSequence("fh_content_description");
        this.U = (prb) arguments.getSerializable("fh_pulse_animation_type");
        this.V = (pql) arguments.getSerializable("fh_feature_highlight_style");
        this.W = arguments.getInt("fh_theme_overlay");
        if (bundle != null) {
            int i = bundle.getInt("showState");
            if (i != 0 && i != 1) {
                throw new IllegalArgumentException("Unrecognised show state.");
            }
            this.h = i;
        }
    }

    @Override // defpackage.bv
    public final void onDestroy() {
        pqw pqwVar = this.g;
        if (pqwVar != null) {
            pqwVar.setTag(R.id.featurehighlight_view_tag_fragment, null);
            ((ViewGroup) getActivity().findViewById(android.R.id.content)).removeView(this.g);
            this.g = null;
        }
        super.onDestroy();
    }

    @Override // defpackage.bv
    public final void onDetach() {
        super.onDetach();
        tbk tbkVarE = e();
        if (tbkVarE != null) {
            ((tvk) pgz.a.l().j("com/google/android/libraries/internal/growth/growthkit/internal/ui/impl/gm/taptarget/FeatureHighlightController$1", "onDetached", 55, "FeatureHighlightController.java")).s("FeatureHighlight detached");
            if (!tbkVarE.a) {
                pgz pgzVar = (pgz) tbkVarE.b;
                if (!pgzVar.c.b) {
                    pgzVar.e.i(pgzVar.b, uxd.DISMISSED);
                    tbkVarE.a = true;
                }
            }
            pha phaVar = ((pgz) tbkVarE.b).c;
            if (phaVar != null) {
                phaVar.a();
            }
        }
        this.f = null;
    }

    @Override // defpackage.bv
    public final void onPause() {
        super.onPause();
        this.g.removeCallbacks(this.i);
    }

    @Override // defpackage.bv
    public final void onResume() {
        super.onResume();
        pqw pqwVar = this.g;
        if (pqwVar != null) {
            long j = this.d;
            if (j > 0) {
                pqwVar.postDelayed(this.i, j);
            }
            if (this.k) {
                return;
            }
            pqw pqwVar2 = this.g;
            pqi pqiVar = new pqi(this, 1);
            int[] iArr = cww.a;
            pqwVar2.postOnAnimation(pqiVar);
        }
    }

    @Override // defpackage.bv
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("showState", this.h);
    }
}
