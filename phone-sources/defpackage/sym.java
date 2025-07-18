package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.support.v7.content.res.AppCompatResources;
import android.support.v7.widget.ActionMenuView;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class sym extends Toolbar {
    public final TextView a;
    public final TextView b;
    public final int c;
    public final ColorStateList d;
    public View e;
    public int f;
    public szk g;
    public final sin h;
    private final FrameLayout i;
    private boolean j;
    private final boolean k;
    private final boolean l;
    private final Drawable m;
    private final boolean n;
    private final boolean o;
    private Integer p;
    private Drawable q;
    private boolean r;
    private boolean s;
    private int t;
    private final boolean u;
    private final int v;
    private ActionMenuView w;
    private ImageButton x;
    private final zft y;

    public sym(Context context) {
        this(context, null);
    }

    private final AppBarLayout h() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof AppBarLayout) {
                return (AppBarLayout) parent;
            }
        }
        return null;
    }

    private final void i() {
        if (Build.VERSION.SDK_INT < 34) {
            return;
        }
        boolean z = getLayoutDirection() == 1;
        ImageButton imageButtonB = suz.b(this);
        int width = (imageButtonB == null || !imageButtonB.isClickable()) ? 0 : z ? getWidth() - imageButtonB.getLeft() : imageButtonB.getRight();
        ActionMenuView actionMenuViewA = suz.a(this);
        int right = actionMenuViewA != null ? z ? actionMenuViewA.getRight() : getWidth() - actionMenuViewA.getLeft() : 0;
        int i = true != z ? width : right;
        if (true != z) {
            width = right;
        }
        setHandwritingBoundsOffsets(-i, 0.0f, -width, 0.0f);
    }

    private final void j(boolean z) {
        ImageButton imageButtonB = suz.b(this);
        if (imageButtonB == null) {
            return;
        }
        boolean z2 = !z;
        imageButtonB.setClickable(z2);
        imageButtonB.setFocusable(z2);
        Drawable background = imageButtonB.getBackground();
        if (background != null) {
            this.q = background;
        }
        imageButtonB.setBackgroundDrawable(z ? null : this.q);
        i();
    }

    private static final int k(int i, int i2) {
        return i == 0 ? i2 : i;
    }

    protected int a() {
        return R.dimen.m3_searchbar_margin_vertical;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (this.k && this.e == null && !(view instanceof ActionMenuView)) {
            this.e = view;
            view.setAlpha(0.0f);
        }
        super.addView(view, i, layoutParams);
    }

    protected int b() {
        return R.drawable.ic_search_black_24;
    }

    public final float c() {
        return this.g.w();
    }

    public final CharSequence d() {
        return this.a.getHint();
    }

    public final CharSequence e() {
        return this.a.getText();
    }

    final void f(String str) {
        this.b.setText(str);
    }

    public final void g(CharSequence charSequence) {
        this.a.setText(charSequence);
        this.b.setText(charSequence);
    }

    @Override // android.support.v7.widget.Toolbar
    public final void inflateMenu(int i) {
        super.inflateMenu(i);
        this.f = i;
    }

    @Override // android.support.v7.widget.Toolbar, android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() throws Resources.NotFoundException {
        AppBarLayout appBarLayoutH;
        super.onAttachedToWindow();
        szg.f(this, this.g);
        if (this.l && (getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            Resources resources = getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.m3_searchbar_margin_horizontal);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(a());
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
            marginLayoutParams.leftMargin = k(marginLayoutParams.leftMargin, dimensionPixelSize);
            marginLayoutParams.topMargin = k(marginLayoutParams.topMargin, dimensionPixelSize2);
            marginLayoutParams.rightMargin = k(marginLayoutParams.rightMargin, dimensionPixelSize);
            marginLayoutParams.bottomMargin = k(marginLayoutParams.bottomMargin, dimensionPixelSize2);
        }
        if (getLayoutParams() instanceof soc) {
            soc socVar = (soc) getLayoutParams();
            if (this.r) {
                if (socVar.a == 0) {
                    socVar.a = 53;
                }
            } else if (socVar.a == 53) {
                socVar.a = 0;
            }
        }
        if (!this.j || (appBarLayoutH = h()) == null || this.d == null) {
            return;
        }
        appBarLayoutH.h.add(this.y);
    }

    @Override // android.support.v7.widget.Toolbar, android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AppBarLayout appBarLayoutH = h();
        if (appBarLayoutH != null) {
            appBarLayoutH.h.remove(this.y);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(EditText.class.getCanonicalName());
        accessibilityNodeInfo.setEditable(isEnabled());
        CharSequence charSequenceE = e();
        boolean zIsEmpty = TextUtils.isEmpty(charSequenceE);
        if (Build.VERSION.SDK_INT >= 26) {
            accessibilityNodeInfo.setHintText(d());
            accessibilityNodeInfo.setShowingHintText(zIsEmpty);
        }
        if (zIsEmpty) {
            charSequenceE = d();
        }
        accessibilityNodeInfo.setText(charSequenceE);
    }

    @Override // android.support.v7.widget.Toolbar, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        View view = this.e;
        if (view != null) {
            int measuredWidth = view.getMeasuredWidth();
            int measuredWidth2 = (getMeasuredWidth() / 2) - (measuredWidth / 2);
            int i5 = measuredWidth + measuredWidth2;
            int measuredHeight = view.getMeasuredHeight();
            int measuredHeight2 = (getMeasuredHeight() / 2) - (measuredHeight / 2);
            int i6 = measuredHeight + measuredHeight2;
            if (getLayoutDirection() == 1) {
                view.layout(getMeasuredWidth() - i5, measuredHeight2, getMeasuredWidth() - measuredWidth2, i6);
            } else {
                view.layout(measuredWidth2, measuredHeight2, i5, i6);
            }
        }
        i();
        TextView textView = this.a;
        if (textView == null || !this.s) {
            return;
        }
        int measuredWidth3 = getMeasuredWidth() / 2;
        FrameLayout frameLayout = this.i;
        int measuredWidth4 = measuredWidth3 - (frameLayout.getMeasuredWidth() / 2);
        int measuredWidth5 = frameLayout.getMeasuredWidth() + measuredWidth4;
        int measuredHeight3 = (getMeasuredHeight() / 2) - (frameLayout.getMeasuredHeight() / 2);
        int measuredHeight4 = frameLayout.getMeasuredHeight() + measuredHeight3;
        int layoutDirection = getLayoutDirection();
        if (this.w == null) {
            this.w = suz.a(this);
        }
        View view2 = this.w;
        if (this.x == null) {
            this.x = suz.b(this);
        }
        View view3 = this.x;
        int measuredWidth6 = (frameLayout.getMeasuredWidth() / 2) - (textView.getMeasuredWidth() / 2);
        int measuredWidth7 = textView.getMeasuredWidth() + measuredWidth6;
        int i7 = measuredWidth6 + measuredWidth4;
        int i8 = measuredWidth7 + measuredWidth4;
        View view4 = layoutDirection == 1 ? view2 : view3;
        if (layoutDirection == 1) {
            view2 = view3;
        }
        int iMax = view4 != null ? Math.max(view4.getRight() - i7, 0) : 0;
        int i9 = i7 + iMax;
        int i10 = i8 + iMax;
        int iMax2 = view2 != null ? Math.max(i10 - view2.getLeft(), 0) : 0;
        int i11 = i9 - iMax2;
        int i12 = i10 - iMax2;
        int iMax3 = ((iMax - iMax2) + Math.max(Math.max(getPaddingLeft() - i11, getContentInsetLeft() - i11), 0)) - Math.max(Math.max(i12 - (getMeasuredWidth() - getPaddingRight()), i12 - (getMeasuredWidth() - getContentInsetRight())), 0);
        frameLayout.layout(measuredWidth4 + iMax3, measuredHeight3, measuredWidth5 + iMax3, measuredHeight4);
    }

    @Override // android.support.v7.widget.Toolbar, android.view.View
    protected final void onMeasure(int i, int i2) {
        int i3;
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int i4 = this.t;
        if (i4 >= 0 && size > i4) {
            i = View.MeasureSpec.makeMeasureSpec(i4, mode);
        } else if (this.u && size > (i3 = this.v)) {
            i = View.MeasureSpec.makeMeasureSpec(Math.max(i3, Math.round(size * 0.5f)), mode);
        }
        super.onMeasure(i, i2);
        View view = this.e;
        if (view != null) {
            view.measure(i, i2);
        }
    }

    @Override // android.support.v7.widget.Toolbar, android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof syl)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        syl sylVar = (syl) parcelable;
        super.onRestoreInstanceState(sylVar.getSuperState());
        g(sylVar.a);
    }

    @Override // android.support.v7.widget.Toolbar, android.view.View
    protected final Parcelable onSaveInstanceState() {
        syl sylVar = new syl(super.onSaveInstanceState());
        CharSequence charSequenceE = e();
        sylVar.a = charSequenceE == null ? null : charSequenceE.toString();
        return sylVar;
    }

    @Override // android.view.View
    public final void setElevation(float f) {
        super.setElevation(f);
        szk szkVar = this.g;
        if (szkVar != null) {
            szkVar.M(f);
        }
    }

    @Override // android.support.v7.widget.Toolbar
    public final void setNavigationIcon(Drawable drawable) {
        int iC;
        if (this.n && drawable != null) {
            Integer num = this.p;
            if (num != null) {
                iC = num.intValue();
            } else {
                iC = sip.c(this, drawable == this.m ? R.attr.colorOnSurfaceVariant : R.attr.colorOnSurface);
            }
            drawable = drawable.mutate();
            drawable.setTint(iC);
        }
        super.setNavigationIcon(drawable);
    }

    @Override // android.support.v7.widget.Toolbar
    public final void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        if (this.o) {
            return;
        }
        super.setNavigationOnClickListener(onClickListener);
        j(onClickListener == null);
    }

    public sym(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialSearchBarStyle);
    }

    public sym(Context context, AttributeSet attributeSet, int i) {
        super(tde.a(context, attributeSet, i, R.style.Widget_Material3_SearchBar), attributeSet, i);
        this.f = -1;
        this.y = new zft(this, null);
        Context context2 = getContext();
        if (attributeSet != null) {
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "title") == null) {
                if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "subtitle") != null) {
                    throw new UnsupportedOperationException("SearchBar does not support subtitle. Use hint or text instead.");
                }
            } else {
                throw new UnsupportedOperationException("SearchBar does not support title. Use hint or text instead.");
            }
        }
        this.v = getResources().getDimensionPixelSize(R.dimen.m3_searchbar_parent_width_breakpoint);
        Drawable drawable = AppCompatResources.getDrawable(context2, b());
        this.m = drawable;
        this.h = new sin(null, null);
        TypedArray typedArrayA = suy.a(context2, attributeSet, syk.a, i, R.style.Widget_Material3_SearchBar, new int[0]);
        szq szqVar = new szq(szq.c(context2, attributeSet, i, R.style.Widget_Material3_SearchBar));
        int color = typedArrayA.getColor(5, 0);
        this.c = color;
        this.d = sin.h(context2, typedArrayA, 12);
        float dimension = typedArrayA.getDimension(8, 0.0f);
        this.l = typedArrayA.getBoolean(6, true);
        this.r = typedArrayA.getBoolean(7, true);
        boolean z = typedArrayA.getBoolean(10, false);
        this.o = typedArrayA.getBoolean(9, false);
        this.n = typedArrayA.getBoolean(17, true);
        if (typedArrayA.hasValue(13)) {
            this.p = Integer.valueOf(typedArrayA.getColor(13, -1));
        }
        int resourceId = typedArrayA.getResourceId(0, -1);
        String string = typedArrayA.getString(2);
        String string2 = typedArrayA.getString(3);
        float dimension2 = typedArrayA.getDimension(15, -1.0f);
        int color2 = typedArrayA.getColor(14, 0);
        this.s = typedArrayA.getBoolean(16, false);
        this.j = typedArrayA.getBoolean(11, false);
        this.t = typedArrayA.getDimensionPixelSize(1, -1);
        this.u = typedArrayA.getBoolean(4, false);
        typedArrayA.recycle();
        if (!z) {
            setNavigationIcon(getNavigationIcon() != null ? getNavigationIcon() : drawable);
            j(true);
        }
        setClickable(true);
        setFocusable(true);
        LayoutInflater.from(context2).inflate(R.layout.mtrl_search_bar, this);
        this.k = true;
        TextView textView = (TextView) findViewById(R.id.open_search_bar_text_view);
        this.a = textView;
        TextView textView2 = (TextView) findViewById(R.id.open_search_bar_placeholder_text_view);
        this.b = textView2;
        this.i = (FrameLayout) findViewById(R.id.open_search_bar_text_view_container);
        setElevation(dimension);
        if (resourceId != -1) {
            textView.setTextAppearance(resourceId);
            textView2.setTextAppearance(resourceId);
        }
        g(string);
        textView.setHint(string2);
        boolean z2 = this.s;
        if (textView != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textView.getLayoutParams();
            if (z2) {
                layoutParams.gravity = 1;
                textView.setGravity(1);
            } else {
                layoutParams.gravity = 0;
                textView.setGravity(0);
            }
            textView.setLayoutParams(layoutParams);
            textView2.setLayoutParams(layoutParams);
        }
        szk szkVar = new szk(szqVar);
        this.g = szkVar;
        szkVar.J(getContext());
        this.g.M(dimension);
        if (dimension2 >= 0.0f) {
            this.g.S(dimension2, color2);
        }
        int iC = sip.c(this, R.attr.colorControlHighlight);
        this.g.N(ColorStateList.valueOf(color));
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(iC);
        szk szkVar2 = this.g;
        setBackground(new RippleDrawable(colorStateListValueOf, szkVar2, szkVar2));
    }

    @Override // android.support.v7.widget.Toolbar
    public final void setSubtitle(CharSequence charSequence) {
    }

    @Override // android.support.v7.widget.Toolbar
    public final void setTitle(CharSequence charSequence) {
    }
}
