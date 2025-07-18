package android.support.v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import defpackage.byj;
import defpackage.ds;
import defpackage.dt;
import defpackage.du;
import defpackage.dw;
import defpackage.ei;
import defpackage.fa;
import defpackage.fb;
import defpackage.fc;
import defpackage.fd;
import defpackage.hp;
import defpackage.hq;
import defpackage.jq;
import defpackage.kc;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ActionMenuView extends hq implements dt, ei {
    public du a;
    public boolean b;
    public fa c;
    public ds d;
    public byj e;
    private Context i;
    private int j;
    private boolean k;
    private int l;
    private int m;
    private int n;

    public ActionMenuView(Context context) {
        this(context, null);
    }

    public static final fd m() {
        fd fdVar = new fd();
        fdVar.gravity = 16;
        return fdVar;
    }

    public static final fd n(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams == null) {
            return m();
        }
        fd fdVar = layoutParams instanceof fd ? new fd((fd) layoutParams) : new fd(layoutParams);
        if (fdVar.gravity <= 0) {
            fdVar.gravity = 16;
        }
        return fdVar;
    }

    @Override // defpackage.ei
    public final void a(du duVar) {
        this.a = duVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.hq
    /* renamed from: aQ */
    public final /* bridge */ /* synthetic */ hp generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return n(layoutParams);
    }

    @Override // defpackage.dt
    public final boolean b(dw dwVar) {
        return this.a.z(dwVar, 0);
    }

    @Override // defpackage.hq, android.view.ViewGroup
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final fd generateLayoutParams(AttributeSet attributeSet) {
        return new fd(getContext(), attributeSet);
    }

    @Override // defpackage.hq, android.view.ViewGroup
    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof fd;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.hq
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ hp generateDefaultLayoutParams() {
        return m();
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public final Menu g() {
        if (this.a == null) {
            Context context = getContext();
            du duVar = new du(context);
            this.a = duVar;
            duVar.p(new jq(this, 1));
            fa faVar = new fa(context);
            this.c = faVar;
            faVar.p();
            fa faVar2 = this.c;
            faVar2.e = new fc();
            this.a.h(faVar2, this.i);
            this.c.j(this);
        }
        return this.a;
    }

    @Override // defpackage.hq, android.view.ViewGroup
    protected final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return m();
    }

    public final void h() {
        fa faVar = this.c;
        if (faVar != null) {
            faVar.n();
        }
    }

    public final void i(int i) {
        if (this.j != i) {
            this.j = i;
            if (i == 0) {
                this.i = getContext();
            } else {
                this.i = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public final void j(fa faVar) {
        this.c = faVar;
        faVar.j(this);
    }

    protected final boolean k(int i) {
        boolean zC = false;
        if (i == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i - 1);
        KeyEvent.Callback childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof fb)) {
            zC = ((fb) childAt).c();
        }
        return (i <= 0 || !(childAt2 instanceof fb)) ? zC : ((fb) childAt2).d() | zC;
    }

    public final boolean l() {
        fa faVar = this.c;
        return faVar != null && faVar.l();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        fa faVar = this.c;
        if (faVar != null) {
            faVar.i();
            if (this.c.l()) {
                this.c.k();
                this.c.m();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        h();
    }

    @Override // defpackage.hq, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int width;
        int paddingLeft;
        if (!this.k) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i6 = i4 - i2;
        int i7 = this.h;
        int i8 = i3 - i;
        int paddingRight = (i8 - getPaddingRight()) - getPaddingLeft();
        boolean zA = kc.a(this);
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            i5 = i6 / 2;
            if (i9 >= childCount) {
                break;
            }
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                fd fdVar = (fd) childAt.getLayoutParams();
                if (fdVar.a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (k(i9)) {
                        measuredWidth += i7;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (zA) {
                        paddingLeft = getPaddingLeft() + fdVar.leftMargin;
                        width = paddingLeft + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - fdVar.rightMargin;
                        paddingLeft = width - measuredWidth;
                    }
                    int i12 = i5 - (measuredHeight / 2);
                    childAt.layout(paddingLeft, i12, width, measuredHeight + i12);
                    paddingRight -= measuredWidth;
                    i10 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + fdVar.leftMargin) + fdVar.rightMargin;
                    k(i9);
                    i11++;
                }
            }
            i9++;
        }
        if (childCount == 1) {
            if (i10 == 0) {
                View childAt2 = getChildAt(0);
                int measuredWidth2 = childAt2.getMeasuredWidth();
                int measuredHeight2 = childAt2.getMeasuredHeight();
                int i13 = i5 - (measuredHeight2 / 2);
                int i14 = (i8 / 2) - (measuredWidth2 / 2);
                childAt2.layout(i14, i13, measuredWidth2 + i14, measuredHeight2 + i13);
                return;
            }
            childCount = 1;
        }
        int i15 = i11 - (i10 ^ 1);
        int iMax = Math.max(0, i15 > 0 ? paddingRight / i15 : 0);
        if (zA) {
            int width2 = getWidth() - getPaddingRight();
            for (int i16 = 0; i16 < childCount; i16++) {
                View childAt3 = getChildAt(i16);
                fd fdVar2 = (fd) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !fdVar2.a) {
                    int i17 = width2 - fdVar2.rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i18 = i5 - (measuredHeight3 / 2);
                    childAt3.layout(i17 - measuredWidth3, i18, i17, measuredHeight3 + i18);
                    width2 = i17 - ((measuredWidth3 + fdVar2.leftMargin) + iMax);
                }
            }
            return;
        }
        int paddingLeft2 = getPaddingLeft();
        for (int i19 = 0; i19 < childCount; i19++) {
            View childAt4 = getChildAt(i19);
            fd fdVar3 = (fd) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !fdVar3.a) {
                int i20 = paddingLeft2 + fdVar3.leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i21 = i5 - (measuredHeight4 / 2);
                childAt4.layout(i20, i21, i20 + measuredWidth4, measuredHeight4 + i21);
                paddingLeft2 = i20 + measuredWidth4 + fdVar3.rightMargin + iMax;
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
    @Override // defpackage.hq, android.view.View
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

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        s();
        float f = context.getResources().getDisplayMetrics().density;
        this.m = (int) (56.0f * f);
        this.n = (int) (f * 4.0f);
        this.i = context;
        this.j = 0;
    }

    @Override // defpackage.hq, android.view.ViewGroup
    protected final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return n(layoutParams);
    }
}
