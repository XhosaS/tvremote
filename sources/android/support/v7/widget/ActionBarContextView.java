package android.support.v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.tv.remote.service.R;
import defpackage.aps;
import defpackage.cu;
import defpackage.cy;
import defpackage.du;
import defpackage.ei;
import defpackage.ep;
import defpackage.er;
import defpackage.fa;
import defpackage.kc;
import defpackage.qv;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ActionBarContextView extends ep {
    public CharSequence g;
    public CharSequence h;
    public View i;
    public boolean j;
    public int k;
    public int l;
    public int m;
    private View n;
    private View o;
    private LinearLayout p;
    private TextView q;
    private TextView r;
    private int s;
    private int t;
    private int u;
    private int v;
    private int w;
    private int x;
    private int y;

    public ActionBarContextView(Context context) {
        this(context, null);
    }

    private final void p() {
        if (this.p == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.p = linearLayout;
            this.q = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.r = (TextView) this.p.findViewById(R.id.action_bar_subtitle);
            if (this.s != 0) {
                this.q.setTextAppearance(getContext(), this.s);
            }
            if (this.t != 0) {
                this.r.setTextAppearance(getContext(), this.t);
            }
        }
        this.q.setText(this.g);
        this.r.setText(this.h);
        boolean zIsEmpty = TextUtils.isEmpty(this.g);
        boolean zIsEmpty2 = TextUtils.isEmpty(this.h);
        this.r.setVisibility(true != zIsEmpty2 ? 0 : 8);
        this.p.setVisibility((zIsEmpty && zIsEmpty2) ? 8 : 0);
        if (this.p.getParent() == null) {
            addView(this.p);
        }
    }

    @Override // defpackage.ep
    public final void c(int i) {
        this.e = i;
    }

    @Override // android.view.ViewGroup
    protected final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public final void h(cy cyVar) {
        View view = this.i;
        if (view == null) {
            View viewInflate = LayoutInflater.from(getContext()).inflate(this.u, (ViewGroup) this, false);
            this.i = viewInflate;
            addView(viewInflate);
        } else if (view.getParent() == null) {
            addView(this.i);
        }
        View viewFindViewById = this.i.findViewById(R.id.action_mode_close_button);
        this.n = viewFindViewById;
        viewFindViewById.setOnClickListener(new er(cyVar, 0));
        Menu menuA = cyVar.a();
        fa faVar = this.d;
        if (faVar != null) {
            faVar.n();
        }
        this.d = new fa(getContext());
        this.d.p();
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        ((du) menuA).h(this.d, this.b);
        fa faVar2 = this.d;
        ei eiVar = faVar2.f;
        if (faVar2.f == null) {
            faVar2.f = (ei) faVar2.d.inflate(R.layout.abc_action_menu_layout, (ViewGroup) this, false);
            faVar2.f.a(faVar2.c);
            faVar2.i();
        }
        ei eiVar2 = faVar2.f;
        if (eiVar != eiVar2) {
            ((ActionMenuView) eiVar2).j(faVar2);
        }
        this.c = (ActionMenuView) eiVar2;
        this.c.setBackground(null);
        addView(this.c, layoutParams);
    }

    public final void i() {
        removeAllViews();
        this.o = null;
        this.c = null;
        this.d = null;
        View view = this.n;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    public final void j(View view) {
        LinearLayout linearLayout;
        View view2 = this.o;
        if (view2 != null) {
            removeView(view2);
        }
        this.o = view;
        if (view != null && (linearLayout = this.p) != null) {
            removeView(linearLayout);
            this.p = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public final void k(CharSequence charSequence) {
        this.h = charSequence;
        p();
    }

    public final void l(CharSequence charSequence) {
        this.g = charSequence;
        p();
        qv.m(this, charSequence);
    }

    public final void m(boolean z) {
        if (z != this.j) {
            requestLayout();
        }
        this.j = z;
    }

    public final void n() {
        super.setPadding(this.k + this.v, this.l + this.w, this.m + this.x, this.y);
    }

    public final void o() {
        fa faVar = this.d;
        if (faVar != null) {
            faVar.m();
        }
    }

    @Override // defpackage.ep, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, cu.d, R.attr.actionModeStyle, 0);
        this.e = typedArrayObtainStyledAttributes.getLayoutDimension(3, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        fa faVar = this.d;
        if (faVar != null) {
            faVar.k();
            this.d.q();
        }
    }

    @Override // defpackage.ep, android.view.View
    public final /* bridge */ /* synthetic */ boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean zA = kc.a(this);
        int paddingRight = zA ? (i3 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        View view = this.i;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.i.getLayoutParams();
            int i5 = zA ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i6 = zA ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int iA = a(paddingRight, i5, zA);
            paddingRight = a(iA + f(this.i, iA, paddingTop, paddingTop2, zA), i6, zA);
        }
        LinearLayout linearLayout = this.p;
        if (linearLayout != null && this.o == null && linearLayout.getVisibility() != 8) {
            paddingRight += f(this.p, paddingRight, paddingTop, paddingTop2, zA);
        }
        View view2 = this.o;
        if (view2 != null) {
            f(view2, paddingRight, paddingTop, paddingTop2, zA);
        }
        int paddingLeft = zA ? getPaddingLeft() : (i3 - i) - getPaddingRight();
        ActionMenuView actionMenuView = this.c;
        if (actionMenuView != null) {
            f(actionMenuView, paddingLeft, paddingTop, paddingTop2, !zA);
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            throw new IllegalStateException(String.valueOf(getClass().getSimpleName()).concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
        }
        if (View.MeasureSpec.getMode(i2) == 0) {
            throw new IllegalStateException(String.valueOf(getClass().getSimpleName()).concat(" can only be used with android:layout_height=\"wrap_content\""));
        }
        int size = View.MeasureSpec.getSize(i);
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int i3 = this.e;
        int size2 = i3 > 0 ? i3 + this.l : View.MeasureSpec.getSize(i2);
        int iMin = size2 - paddingTop;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, Integer.MIN_VALUE);
        View view = this.i;
        if (view != null) {
            int iE = e(view, paddingLeft, iMakeMeasureSpec);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.i.getLayoutParams();
            paddingLeft = iE - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.c;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = e(this.c, paddingLeft, iMakeMeasureSpec);
        }
        LinearLayout linearLayout = this.p;
        if (linearLayout != null && this.o == null) {
            if (this.j) {
                this.p.measure(View.MeasureSpec.makeMeasureSpec(0, 0), iMakeMeasureSpec);
                int measuredWidth = this.p.getMeasuredWidth();
                boolean z = measuredWidth <= paddingLeft;
                if (z) {
                    paddingLeft -= measuredWidth;
                }
                this.p.setVisibility(true != z ? 8 : 0);
            } else {
                paddingLeft = e(linearLayout, paddingLeft, iMakeMeasureSpec);
            }
        }
        View view2 = this.o;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i4 = layoutParams.width != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (layoutParams.width >= 0) {
                paddingLeft = Math.min(layoutParams.width, paddingLeft);
            }
            int i5 = layoutParams.height == -2 ? Integer.MIN_VALUE : 1073741824;
            if (layoutParams.height >= 0) {
                iMin = Math.min(layoutParams.height, iMin);
            }
            this.o.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i4), View.MeasureSpec.makeMeasureSpec(iMin, i5));
        }
        if (this.e > 0) {
            setMeasuredDimension(size, size2);
            return;
        }
        int childCount = getChildCount();
        int i6 = 0;
        for (int i7 = 0; i7 < childCount; i7++) {
            int measuredHeight = getChildAt(i7).getMeasuredHeight() + paddingTop;
            if (measuredHeight > i6) {
                i6 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i6);
    }

    @Override // defpackage.ep, android.view.View
    public final /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    @Override // android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        this.v = i;
        this.w = i2;
        this.x = i3;
        this.y = i4;
        n();
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i, int i2, int i3, int i4) {
        if (getLayoutDirection() == 1) {
            i3 = i;
            i = i3;
        }
        this.v = i;
        this.x = i3;
        this.w = i2;
        this.y = i4;
        n();
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.actionModeStyle);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        aps apsVarR = aps.r(context, attributeSet, cu.d, i, 0);
        setBackground(apsVarR.i(0));
        this.s = apsVarR.g(5, 0);
        this.t = apsVarR.g(4, 0);
        this.e = apsVarR.f(3, 0);
        this.u = apsVarR.g(2, R.layout.abc_action_mode_close_item_material);
        apsVarR.m();
        this.v = getPaddingLeft();
        this.w = getPaddingTop();
        this.x = getPaddingRight();
        this.y = getPaddingBottom();
    }
}
