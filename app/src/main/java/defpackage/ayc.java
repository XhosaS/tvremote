package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.leanback.widget.GuidanceStylingRelativeLayout;
import androidx.leanback.widget.GuidedActionsRelativeLayout;
import androidx.leanback.widget.VerticalGridView;
import androidx.leanback.widget.picker.DatePicker;
import com.google.android.katniss.R;
import java.util.ArrayList;
import java.util.Calendar;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ayc {
    static final ayj a;
    public static final /* synthetic */ int j = 0;
    public ViewGroup b;
    public VerticalGridView c;
    public VerticalGridView d;
    public boolean e;
    public axh f = null;
    public Object g;
    public float h;
    public ato i;
    private View k;
    private View l;
    private float m;
    private float n;
    private float o;
    private float p;
    private float q;
    private float r;
    private int s;
    private int t;
    private int u;
    private int v;
    private int w;

    static {
        ayj ayjVar = new ayj();
        a = ayjVar;
        ayi ayiVar = new ayi();
        ayiVar.b = R.id.guidedactions_item_title;
        ayiVar.g = true;
        ayiVar.d = 0;
        ayiVar.f = true;
        ayiVar.a(0.0f);
        ayjVar.a(new ayi[]{ayiVar});
    }

    private static float m(Context context, TypedValue typedValue, int i) {
        context.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.getFloat();
    }

    private static float n(Resources resources, TypedValue typedValue, int i) throws Resources.NotFoundException {
        resources.getValue(i, typedValue, true);
        return typedValue.getFloat();
    }

    private static int o(Context context, TypedValue typedValue, int i) {
        context.getTheme().resolveAttribute(i, typedValue, true);
        return context.getResources().getInteger(typedValue.resourceId);
    }

    private static void p(TextView textView, int i) {
        if (i == 1) {
            textView.setSingleLine(true);
        } else {
            textView.setSingleLine(false);
            textView.setMaxLines(i);
        }
    }

    private final void q(EditText editText) {
        if (editText != null) {
            editText.setImeOptions(5);
        }
    }

    private final void r(ayb aybVar) {
        float f = 0.0f;
        if (!aybVar.A) {
            axh axhVar = this.f;
            if (axhVar == null) {
                View view = aybVar.a;
                view.setVisibility(0);
                view.setTranslationY(0.0f);
                if (aybVar.v != null) {
                    aybVar.C(false);
                }
            } else if (aybVar.s == axhVar) {
                View view2 = aybVar.a;
                view2.setVisibility(0);
                axh axhVar2 = aybVar.s;
                if (aybVar.v != null) {
                    view2.setTranslationY(0.0f);
                    aybVar.C(true);
                }
            } else {
                View view3 = aybVar.a;
                view3.setVisibility(4);
                view3.setTranslationY(0.0f);
            }
        }
        ImageView imageView = aybVar.y;
        if (imageView != null) {
            axh axhVar3 = aybVar.s;
            if ((axhVar3.d & 4) != 4) {
                imageView.setVisibility(8);
                return;
            }
            imageView.setVisibility(0);
            imageView.setAlpha(axhVar3.g() ? this.q : this.r);
            ViewGroup viewGroup = this.b;
            if (viewGroup != null && viewGroup.getLayoutDirection() == 1) {
                f = 180.0f;
            }
            imageView.setRotation(f);
        }
    }

    public int a() {
        return R.layout.lb_guidedactions_item;
    }

    public int b() {
        return this.e ? R.layout.lb_guidedbuttonactions : R.layout.lb_guidedactions;
    }

    public View c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        float f = layoutInflater.getContext().getTheme().obtainStyledAttributes(atk.a).getFloat(46, 40.0f);
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(b(), viewGroup, false);
        this.b = viewGroup2;
        this.l = viewGroup2.findViewById(true != this.e ? R.id.guidedactions_content : R.id.guidedactions_content2);
        ViewGroup viewGroup3 = this.b;
        if (viewGroup3 instanceof VerticalGridView) {
            this.c = (VerticalGridView) viewGroup3;
        } else {
            VerticalGridView verticalGridView = (VerticalGridView) viewGroup3.findViewById(true != this.e ? R.id.guidedactions_list : R.id.guidedactions_list2);
            this.c = verticalGridView;
            if (verticalGridView == null) {
                throw new IllegalStateException("No ListView exists.");
            }
            verticalGridView.setWindowAlignmentOffsetPercent(f);
            this.c.setWindowAlignment(0);
            if (!this.e) {
                this.d = (VerticalGridView) this.b.findViewById(R.id.guidedactions_sub_list);
                this.k = this.b.findViewById(R.id.guidedactions_sub_list_background);
            }
        }
        this.c.setFocusable(false);
        this.c.setFocusableInTouchMode(false);
        Context context = this.b.getContext();
        TypedValue typedValue = new TypedValue();
        this.q = m(context, typedValue, R.attr.guidedActionEnabledChevronAlpha);
        this.r = m(context, typedValue, R.attr.guidedActionDisabledChevronAlpha);
        this.s = o(context, typedValue, R.attr.guidedActionTitleMinLines);
        this.t = o(context, typedValue, R.attr.guidedActionTitleMaxLines);
        this.u = o(context, typedValue, R.attr.guidedActionDescriptionMinLines);
        context.getTheme().resolveAttribute(R.attr.guidedActionVerticalPadding, typedValue, true);
        this.v = context.getResources().getDimensionPixelSize(typedValue.resourceId);
        this.w = ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getHeight();
        this.m = n(context.getResources(), typedValue, R.dimen.lb_guidedactions_item_unselected_text_alpha);
        this.n = n(context.getResources(), typedValue, R.dimen.lb_guidedactions_item_disabled_text_alpha);
        this.o = n(context.getResources(), typedValue, R.dimen.lb_guidedactions_item_unselected_description_text_alpha);
        this.p = n(context.getResources(), typedValue, R.dimen.lb_guidedactions_item_disabled_description_text_alpha);
        this.h = GuidanceStylingRelativeLayout.a(context);
        View view = this.l;
        if (view instanceof GuidedActionsRelativeLayout) {
            ((GuidedActionsRelativeLayout) view).a = new axu();
        }
        return this.b;
    }

    public final void d(boolean z) {
        if (l() || this.f == null || ((axp) this.c.getAdapter()).m(this.f) < 0) {
            return;
        }
        k(null, z);
    }

    public void e(ayb aybVar, axh axhVar) {
        aybVar.s = axhVar;
        TextView textView = aybVar.t;
        if (textView != null) {
            textView.setInputType(axhVar.h);
            textView.setText(axhVar.b);
            textView.setAlpha(axhVar.g() ? this.m : this.n);
            textView.setFocusable(false);
            textView.setClickable(false);
            textView.setLongClickable(false);
            if (axhVar.f()) {
                textView.setAutofillHints(null);
            } else {
                textView.setAutofillHints(null);
            }
        }
        TextView textView2 = aybVar.u;
        if (textView2 != null) {
            textView2.setInputType(axhVar.i);
            textView2.setText(axhVar.c);
            textView2.setVisibility(true != TextUtils.isEmpty(axhVar.c) ? 0 : 8);
            textView2.setAlpha(axhVar.g() ? this.o : this.p);
            textView2.setFocusable(false);
            textView2.setClickable(false);
            textView2.setLongClickable(false);
            textView2.setAutofillHints(null);
        }
        ImageView imageView = aybVar.x;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        ImageView imageView2 = aybVar.w;
        if (imageView2 != null) {
            imageView2.setVisibility(8);
        }
        if ((axhVar.d & 2) != 2) {
            if (textView != null) {
                p(textView, this.s);
            }
            if (textView2 != null) {
                p(textView2, this.u);
            }
        } else if (textView != null) {
            p(textView, this.t);
            textView.setInputType(textView.getInputType() | 131072);
            if (textView2 != null) {
                textView2.setInputType(textView2.getInputType() | 131072);
                int i = this.w;
                int i2 = this.v;
                int i3 = i - (i2 + i2);
                int i4 = this.t;
                textView2.setMaxHeight(i3 - ((i4 + i4) * textView.getLineHeight()));
            }
        }
        View view = aybVar.v;
        if (view != null && (axhVar instanceof ayd)) {
            ayd aydVar = (ayd) axhVar;
            DatePicker datePicker = (DatePicker) view;
            datePicker.b(null);
            long j2 = aydVar.m;
            long j3 = aydVar.n;
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(aydVar.l);
            datePicker.e(calendar.get(1), calendar.get(2), calendar.get(5));
        }
        j(aybVar, false, false);
        if (axhVar.h()) {
            View view2 = aybVar.a;
            view2.setFocusable(true);
            ((ViewGroup) view2).setDescendantFocusability(131072);
        } else {
            View view3 = aybVar.a;
            view3.setFocusable(false);
            ((ViewGroup) view3).setDescendantFocusability(393216);
        }
        q(aybVar.A());
        q(aybVar.z());
        r(aybVar);
    }

    public final void f() {
        this.f = null;
        this.g = null;
        this.c = null;
        this.d = null;
        this.k = null;
        this.l = null;
        this.b = null;
    }

    final void g(ayb aybVar, boolean z, boolean z2) {
        if (z) {
            k(aybVar, z2);
            aybVar.a.setFocusable(false);
            View view = aybVar.v;
            view.requestFocus();
            view.setOnClickListener(new axw(this, aybVar));
            return;
        }
        axh axhVar = aybVar.s;
        if (axhVar instanceof ayd) {
            ayd aydVar = (ayd) axhVar;
            DatePicker datePicker = (DatePicker) aybVar.v;
            if (aydVar.l != datePicker.getDate()) {
                aydVar.l = datePicker.getDate();
                ato atoVar = this.i;
                if (atoVar != null) {
                    atoVar.a.aC(aybVar.s);
                }
            }
        }
        View view2 = aybVar.a;
        view2.setFocusable(true);
        view2.requestFocus();
        k(null, z2);
        View view3 = aybVar.v;
        view3.setOnClickListener(null);
        view3.setClickable(false);
    }

    protected void h(ayb aybVar, boolean z, boolean z2) {
        axh axhVar = aybVar.s;
        TextView textView = aybVar.t;
        TextView textView2 = aybVar.u;
        if (!z) {
            if (textView != null) {
                textView.setText(axhVar.b);
            } else {
                textView = null;
            }
            if (textView2 != null) {
                textView2.setText(axhVar.c);
            } else {
                textView2 = null;
            }
            int i = aybVar.z;
            if (i == 2) {
                if (textView2 != null) {
                    textView2.setVisibility(true != TextUtils.isEmpty(axhVar.c) ? 0 : 8);
                    textView2.setInputType(axhVar.i);
                }
            } else if (i == 1) {
                if (textView != null) {
                    textView.setInputType(axhVar.h);
                }
            } else if (i == 3 && aybVar.v != null) {
                g(aybVar, false, z2);
            }
            aybVar.z = 0;
            return;
        }
        CharSequence charSequence = axhVar.e;
        if (textView == null) {
            textView = null;
        } else if (charSequence != null) {
            textView.setText(charSequence);
        }
        CharSequence charSequence2 = axhVar.f;
        if (textView2 != null && charSequence2 != null) {
            textView2.setText(charSequence2);
        }
        if (axhVar.f()) {
            if (textView != null) {
                textView.setInputType(axhVar.j);
                textView.requestFocusFromTouch();
            }
            aybVar.z = 1;
            return;
        }
        if (aybVar.v != null) {
            g(aybVar, true, z2);
            aybVar.z = 3;
        }
    }

    public final void i(axh axhVar) {
        axp axpVar = (axp) this.c.getAdapter();
        int iIndexOf = new ArrayList(axpVar.e).indexOf(axhVar);
        if (iIndexOf < 0 || !axhVar.f()) {
            return;
        }
        VerticalGridView verticalGridView = this.c;
        axv axvVar = new axv(axpVar);
        qv qvVarK = verticalGridView.k(iIndexOf, false);
        if (qvVarK == null || verticalGridView.as()) {
            verticalGridView.ad.K(new awf(verticalGridView, iIndexOf, axvVar));
        } else {
            axvVar.a(qvVarK);
        }
        verticalGridView.setSelectedPosition(iIndexOf);
    }

    final void j(ayb aybVar, boolean z, boolean z2) {
        if (z == (aybVar.z != 0) || l()) {
            return;
        }
        h(aybVar, z, z2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:38:0x011a A[LOOP:2: B:37:0x0118->B:38:0x011a, LOOP_END] */
    /* JADX WARN: Type inference failed for: r2v11, types: [android.transition.Transition$TransitionListener, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [android.support.v7.widget.RecyclerView, androidx.leanback.widget.VerticalGridView] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r8v1, types: [android.transition.Transition] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final void k(defpackage.ayb r17, boolean r18) {
        /*
            Method dump skipped, instructions count: 301
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ayc.k(ayb, boolean):void");
    }

    public final boolean l() {
        return this.g != null;
    }
}
