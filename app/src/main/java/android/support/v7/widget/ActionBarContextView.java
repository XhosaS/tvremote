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
import com.google.android.katniss.R;
import defpackage.ahj;
import defpackage.hs;
import defpackage.ij;
import defpackage.jj;
import defpackage.jy;
import defpackage.kg;
import defpackage.ki;
import defpackage.kw;
import defpackage.rv;
import defpackage.sm;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ActionBarContextView extends kg {
    public CharSequence g;
    public View h;
    public boolean i;
    public int j;
    public int k;
    public int l;
    private CharSequence m;
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

    public final void g(ij ijVar) {
        View view = this.h;
        if (view == null) {
            View viewInflate = LayoutInflater.from(getContext()).inflate(this.u, (ViewGroup) this, false);
            this.h = viewInflate;
            addView(viewInflate);
        } else if (view.getParent() == null) {
            addView(this.h);
        }
        View viewFindViewById = this.h.findViewById(R.id.action_mode_close_button);
        this.n = viewFindViewById;
        viewFindViewById.setOnClickListener(new ki(ijVar));
        Menu menuA = ijVar.a();
        kw kwVar = this.d;
        if (kwVar != null) {
            kwVar.n();
            kwVar.q();
        }
        this.d = new kw(getContext());
        this.d.r();
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        ((jj) menuA).f(this.d, this.b);
        kw kwVar2 = this.d;
        jy jyVar = kwVar2.f;
        if (kwVar2.f == null) {
            kwVar2.f = (jy) kwVar2.d.inflate(R.layout.abc_action_menu_layout, (ViewGroup) this, false);
            kwVar2.f.a(kwVar2.c);
            kwVar2.l();
        }
        jy jyVar2 = kwVar2.f;
        if (jyVar != jyVar2) {
            ((ActionMenuView) jyVar2).j(kwVar2);
        }
        this.c = (ActionMenuView) jyVar2;
        this.c.setBackground(null);
        addView(this.c, layoutParams);
    }

    @Override // android.view.ViewGroup
    protected final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // defpackage.kg
    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    @Override // defpackage.kg
    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.g;
    }

    public CharSequence getTitle() {
        return this.m;
    }

    public final void h() {
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
        this.q.setText(this.m);
        this.r.setText(this.g);
        boolean zIsEmpty = TextUtils.isEmpty(this.m);
        boolean zIsEmpty2 = TextUtils.isEmpty(this.g);
        this.r.setVisibility(true != zIsEmpty2 ? 0 : 8);
        this.p.setVisibility((zIsEmpty && zIsEmpty2) ? 8 : 0);
        if (this.p.getParent() == null) {
            addView(this.p);
        }
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
        this.m = charSequence;
        h();
        ahj.o(this, charSequence);
    }

    public final void l(boolean z) {
        if (z != this.i) {
            requestLayout();
        }
        this.i = z;
    }

    public final void m() {
        super.setPadding(this.j + this.v, this.k + this.w, this.l + this.x, this.y);
    }

    public final void n() {
        kw kwVar = this.d;
        if (kwVar != null) {
            kwVar.p();
        }
    }

    @Override // defpackage.kg, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, hs.d, R.attr.actionModeStyle, 0);
        setContentHeight(typedArrayObtainStyledAttributes.getLayoutDimension(3, 0));
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        kw kwVar = this.d;
        if (kwVar != null) {
            kwVar.n();
            this.d.q();
        }
    }

    @Override // defpackage.kg, android.view.View
    public final /* bridge */ /* synthetic */ boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean zA = sm.a(this);
        int paddingRight = zA ? (i3 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        View view = this.h;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.h.getLayoutParams();
            int i5 = zA ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i6 = zA ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int iA = a(paddingRight, i5, zA);
            paddingRight = a(iA + b(this.h, iA, paddingTop, paddingTop2, zA), i6, zA);
        }
        int iB = paddingRight;
        LinearLayout linearLayout = this.p;
        if (linearLayout != null && this.o == null && linearLayout.getVisibility() != 8) {
            iB += b(this.p, iB, paddingTop, paddingTop2, zA);
        }
        View view2 = this.o;
        if (view2 != null) {
            b(view2, iB, paddingTop, paddingTop2, zA);
        }
        int paddingLeft = zA ? getPaddingLeft() : (i3 - i) - getPaddingRight();
        ActionMenuView actionMenuView = this.c;
        if (actionMenuView != null) {
            b(actionMenuView, paddingLeft, paddingTop, paddingTop2, !zA);
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
        int size2 = i3 > 0 ? i3 + this.k : View.MeasureSpec.getSize(i2);
        int iMin = size2 - paddingTop;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, Integer.MIN_VALUE);
        View view = this.h;
        if (view != null) {
            int iF = f(view, paddingLeft, iMakeMeasureSpec);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.h.getLayoutParams();
            paddingLeft = iF - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.c;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = f(this.c, paddingLeft, iMakeMeasureSpec);
        }
        LinearLayout linearLayout = this.p;
        if (linearLayout != null && this.o == null) {
            if (this.i) {
                this.p.measure(View.MeasureSpec.makeMeasureSpec(0, 0), iMakeMeasureSpec);
                int measuredWidth = this.p.getMeasuredWidth();
                boolean z = measuredWidth <= paddingLeft;
                if (z) {
                    paddingLeft -= measuredWidth;
                }
                this.p.setVisibility(true != z ? 8 : 0);
            } else {
                paddingLeft = f(linearLayout, paddingLeft, iMakeMeasureSpec);
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

    @Override // defpackage.kg, android.view.View
    public final /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    @Override // defpackage.kg
    public void setContentHeight(int i) {
        this.e = i;
    }

    @Override // android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        this.v = i;
        this.w = i2;
        this.x = i3;
        this.y = i4;
        m();
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
        m();
    }

    @Override // defpackage.kg, android.view.View
    public /* bridge */ /* synthetic */ void setVisibility(int i) {
        super.setVisibility(i);
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
        rv rvVarF = rv.f(context, attributeSet, hs.d, i, 0);
        setBackground(rvVarF.b(0));
        this.s = rvVarF.b.getResourceId(5, 0);
        this.t = rvVarF.b.getResourceId(4, 0);
        this.e = rvVarF.b.getLayoutDimension(3, 0);
        this.u = rvVarF.b.getResourceId(2, R.layout.abc_action_mode_close_item_material);
        rvVarF.b.recycle();
        this.v = getPaddingLeft();
        this.w = getPaddingTop();
        this.x = getPaddingRight();
        this.y = getPaddingBottom();
    }
}
