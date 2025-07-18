package android.support.v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import defpackage.jh;
import defpackage.ji;
import defpackage.jj;
import defpackage.jm;
import defpackage.jy;
import defpackage.kt;
import defpackage.kw;
import defpackage.kx;
import defpackage.ky;
import defpackage.kz;
import defpackage.la;
import defpackage.om;
import defpackage.rx;
import defpackage.sm;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ActionMenuView extends om implements ji, jy {
    public jj a;
    public boolean b;
    public kw c;
    public jh d;
    public rx e;
    private Context g;
    private int h;
    private boolean i;
    private int j;
    private int k;
    private int l;

    public ActionMenuView(Context context) {
        this(context, null);
    }

    @Override // defpackage.jy
    public final void a(jj jjVar) {
        this.a = jjVar;
    }

    @Override // defpackage.ji
    public final boolean b(jm jmVar) {
        return this.a.x(jmVar, null, 0);
    }

    @Override // defpackage.om, android.view.ViewGroup
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final kz generateDefaultLayoutParams() {
        kz kzVar = new kz();
        kzVar.gravity = 16;
        return kzVar;
    }

    @Override // defpackage.om, android.view.ViewGroup
    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof kz;
    }

    @Override // defpackage.om, android.view.ViewGroup
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final kz generateLayoutParams(AttributeSet attributeSet) {
        return new kz(getContext(), attributeSet);
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // defpackage.om
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final kz generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams == null) {
            return generateDefaultLayoutParams();
        }
        kz kzVar = layoutParams instanceof kz ? new kz((kz) layoutParams) : new kz(layoutParams);
        if (kzVar.gravity <= 0) {
            kzVar.gravity = 16;
        }
        return kzVar;
    }

    public Menu getMenu() {
        if (this.a == null) {
            Context context = getContext();
            jj jjVar = new jj(context);
            this.a = jjVar;
            jjVar.n(new la(this));
            kw kwVar = new kw(context);
            this.c = kwVar;
            kwVar.r();
            kw kwVar2 = this.c;
            kwVar2.e = new ky();
            this.a.f(kwVar2, this.g);
            this.c.m(this);
        }
        return this.a;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        kt ktVar = this.c.g;
        if (ktVar != null) {
            return ktVar.getDrawable();
        }
        return null;
    }

    public int getPopupTheme() {
        return this.h;
    }

    public int getWindowAnimations() {
        return 0;
    }

    public final void i() {
        kw kwVar = this.c;
        if (kwVar != null) {
            kwVar.n();
            kwVar.q();
        }
    }

    public final void j(kw kwVar) {
        this.c = kwVar;
        kwVar.m(this);
    }

    protected final boolean k(int i) {
        boolean zB = false;
        if (i == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i - 1);
        KeyEvent.Callback childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof kx)) {
            zB = ((kx) childAt).b();
        }
        return (i <= 0 || !(childAt2 instanceof kx)) ? zB : ((kx) childAt2).c() | zB;
    }

    public final boolean l() {
        kw kwVar = this.c;
        return kwVar != null && kwVar.o();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        kw kwVar = this.c;
        if (kwVar != null) {
            kwVar.l();
            if (this.c.o()) {
                this.c.n();
                this.c.p();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        i();
    }

    @Override // defpackage.om, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int width;
        int paddingLeft;
        if (!this.i) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i6 = i4 - i2;
        int dividerWidth = getDividerWidth();
        int i7 = i3 - i;
        int paddingRight = (i7 - getPaddingRight()) - getPaddingLeft();
        boolean zA = sm.a(this);
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        while (true) {
            i5 = i6 / 2;
            if (i8 >= childCount) {
                break;
            }
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                kz kzVar = (kz) childAt.getLayoutParams();
                if (kzVar.a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (k(i8)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (zA) {
                        paddingLeft = getPaddingLeft() + kzVar.leftMargin;
                        width = paddingLeft + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - kzVar.rightMargin;
                        paddingLeft = width - measuredWidth;
                    }
                    int i11 = i5 - (measuredHeight / 2);
                    childAt.layout(paddingLeft, i11, width, measuredHeight + i11);
                    paddingRight -= measuredWidth;
                    i9 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + kzVar.leftMargin) + kzVar.rightMargin;
                    k(i8);
                    i10++;
                }
            }
            i8++;
        }
        if (childCount == 1) {
            if (i9 == 0) {
                View childAt2 = getChildAt(0);
                int measuredWidth2 = childAt2.getMeasuredWidth();
                int measuredHeight2 = childAt2.getMeasuredHeight();
                int i12 = i5 - (measuredHeight2 / 2);
                int i13 = (i7 / 2) - (measuredWidth2 / 2);
                childAt2.layout(i13, i12, measuredWidth2 + i13, measuredHeight2 + i12);
                return;
            }
            childCount = 1;
        }
        int i14 = i10 - (i9 ^ 1);
        int iMax = Math.max(0, i14 > 0 ? paddingRight / i14 : 0);
        if (zA) {
            int width2 = getWidth() - getPaddingRight();
            for (int i15 = 0; i15 < childCount; i15++) {
                View childAt3 = getChildAt(i15);
                kz kzVar2 = (kz) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !kzVar2.a) {
                    int i16 = width2 - kzVar2.rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i17 = i5 - (measuredHeight3 / 2);
                    childAt3.layout(i16 - measuredWidth3, i17, i16, measuredHeight3 + i17);
                    width2 = i16 - ((measuredWidth3 + kzVar2.leftMargin) + iMax);
                }
            }
            return;
        }
        int paddingLeft2 = getPaddingLeft();
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt4 = getChildAt(i18);
            kz kzVar3 = (kz) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !kzVar3.a) {
                int i19 = paddingLeft2 + kzVar3.leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i20 = i5 - (measuredHeight4 / 2);
                childAt4.layout(i19, i20, i19 + measuredWidth4, measuredHeight4 + i20);
                paddingLeft2 = i19 + measuredWidth4 + kzVar3.rightMargin + iMax;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:194:0x0162 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x015d  */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v46 */
    @Override // defpackage.om, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void onMeasure(int r30, int r31) {
        /*
            Method dump skipped, instructions count: 813
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.ActionMenuView.onMeasure(int, int):void");
    }

    public void setPopupTheme(int i) {
        if (this.h != i) {
            this.h = i;
            if (i == 0) {
                this.g = getContext();
            } else {
                this.g = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f = false;
        float f = context.getResources().getDisplayMetrics().density;
        this.k = (int) (56.0f * f);
        this.l = (int) (f * 4.0f);
        this.g = context;
        this.h = 0;
    }
}
