package defpackage;

import android.R;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ge extends Spinner {
    private static final int[] e = {R.attr.spinnerMode};
    public final Context a;
    public gd b;
    int c;
    final Rect d;
    private final fg f;
    private hj g;
    private SpinnerAdapter h;
    private final boolean i;

    /* JADX WARN: Not initialized variable reg: 5, insn: 0x00d5: MOVE (r4 I:??[OBJECT, ARRAY]) = (r5 I:??[OBJECT, ARRAY]) (LINE:214), block:B:39:0x00d5 */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ge(android.content.Context r11, android.util.AttributeSet r12) throws java.lang.Throwable {
        /*
            r10 = this;
            r0 = 2130969708(0x7f04046c, float:1.7548106E38)
            r10.<init>(r11, r12, r0)
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r10.d = r1
            android.content.Context r1 = r10.getContext()
            defpackage.jl.d(r10, r1)
            int[] r1 = defpackage.cu.u
            r2 = 0
            aps r1 = defpackage.aps.r(r11, r12, r1, r0, r2)
            fg r3 = new fg
            r3.<init>(r10)
            r10.f = r3
            r3 = 4
            int r3 = r1.g(r3, r2)
            if (r3 == 0) goto L31
            lh r4 = new lh
            r4.<init>(r11, r3)
            r10.a = r4
            goto L33
        L31:
            r10.a = r11
        L33:
            r3 = 1
            r4 = 0
            int[] r5 = defpackage.ge.e     // Catch: java.lang.Throwable -> L94 java.lang.Exception -> L96
            android.content.res.TypedArray r5 = r11.obtainStyledAttributes(r12, r5, r0, r2)     // Catch: java.lang.Throwable -> L94 java.lang.Exception -> L96
            boolean r6 = r5.hasValue(r2)     // Catch: java.lang.Exception -> L92 java.lang.Throwable -> Ld4
            if (r6 == 0) goto L46
            int r6 = r5.getInt(r2, r2)     // Catch: java.lang.Exception -> L92 java.lang.Throwable -> Ld4
            goto L47
        L46:
            r6 = -1
        L47:
            if (r5 == 0) goto L4c
            r5.recycle()
        L4c:
            r5 = 2
            if (r6 == 0) goto L83
            if (r6 == r3) goto L52
            goto La5
        L52:
            gb r6 = new gb
            android.content.Context r7 = r10.a
            r6.<init>(r10, r7, r12)
            android.content.Context r7 = r10.a
            int[] r8 = defpackage.cu.u
            aps r7 = defpackage.aps.r(r7, r12, r8, r0, r2)
            r8 = 3
            r9 = -2
            int r8 = r7.f(r8, r9)
            r10.c = r8
            android.graphics.drawable.Drawable r8 = r7.i(r3)
            r6.f(r8)
            java.lang.String r5 = r1.l(r5)
            r6.a = r5
            r7.m()
            r10.b = r6
            fx r5 = new fx
            r5.<init>(r10, r10, r6)
            r10.g = r5
            goto La5
        L83:
            fy r6 = new fy
            r6.<init>(r10)
            r10.b = r6
            java.lang.String r5 = r1.l(r5)
            r6.i(r5)
            goto La5
        L92:
            r6 = move-exception
            goto L99
        L94:
            r11 = move-exception
            goto Ld6
        L96:
            r5 = move-exception
            r6 = r5
            r5 = r4
        L99:
            java.lang.String r7 = "AppCompatSpinner"
            java.lang.String r8 = "Could not read android:spinnerMode"
            android.util.Log.i(r7, r8, r6)     // Catch: java.lang.Throwable -> Ld4
            if (r5 == 0) goto La5
            r5.recycle()
        La5:
            java.lang.Object r5 = r1.a
            android.content.res.TypedArray r5 = (android.content.res.TypedArray) r5
            java.lang.CharSequence[] r2 = r5.getTextArray(r2)
            if (r2 == 0) goto Lc0
            android.widget.ArrayAdapter r5 = new android.widget.ArrayAdapter
            r6 = 17367048(0x1090008, float:2.5162948E-38)
            r5.<init>(r11, r6, r2)
            r11 = 2131624103(0x7f0e00a7, float:1.8875376E38)
            r5.setDropDownViewResource(r11)
            r10.setAdapter(r5)
        Lc0:
            r1.m()
            r10.i = r3
            android.widget.SpinnerAdapter r11 = r10.h
            if (r11 == 0) goto Lce
            r10.setAdapter(r11)
            r10.h = r4
        Lce:
            fg r11 = r10.f
            r11.b(r12, r0)
            return
        Ld4:
            r11 = move-exception
            r4 = r5
        Ld6:
            if (r4 == 0) goto Ldb
            r4.recycle()
        Ldb:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ge.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    final int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int iMax = Math.max(0, getSelectedItemPosition());
        int iMin = Math.min(spinnerAdapter.getCount(), iMax + 15);
        int iMax2 = Math.max(0, iMax - (15 - (iMin - iMax)));
        View view = null;
        int iMax3 = 0;
        while (iMax2 < iMin) {
            int itemViewType = spinnerAdapter.getItemViewType(iMax2);
            int i2 = itemViewType != i ? itemViewType : i;
            if (itemViewType != i) {
                view = null;
            }
            view = spinnerAdapter.getView(iMax2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            iMax3 = Math.max(iMax3, view.getMeasuredWidth());
            iMax2++;
            i = i2;
        }
        if (drawable == null) {
            return iMax3;
        }
        Rect rect = this.d;
        drawable.getPadding(rect);
        return iMax3 + rect.left + rect.right;
    }

    public final void b() {
        this.b.l(getTextDirection(), getTextAlignment());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        fg fgVar = this.f;
        if (fgVar != null) {
            fgVar.a();
        }
    }

    @Override // android.widget.Spinner
    public final int getDropDownHorizontalOffset() {
        gd gdVar = this.b;
        return gdVar != null ? gdVar.a() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public final int getDropDownVerticalOffset() {
        gd gdVar = this.b;
        return gdVar != null ? gdVar.b() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public final int getDropDownWidth() {
        return this.b != null ? this.c : super.getDropDownWidth();
    }

    @Override // android.widget.Spinner
    public final Drawable getPopupBackground() {
        gd gdVar = this.b;
        return gdVar != null ? gdVar.c() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public final Context getPopupContext() {
        return this.a;
    }

    @Override // android.widget.Spinner
    public final CharSequence getPrompt() {
        gd gdVar = this.b;
        return gdVar != null ? gdVar.d() : super.getPrompt();
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        gd gdVar = this.b;
        if (gdVar == null || !gdVar.u()) {
            return;
        }
        this.b.k();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.b == null || View.MeasureSpec.getMode(i) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        gc gcVar = (gc) parcelable;
        super.onRestoreInstanceState(gcVar.getSuperState());
        if (!gcVar.a || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new el(this, 2));
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final Parcelable onSaveInstanceState() {
        gc gcVar = new gc(super.onSaveInstanceState());
        gd gdVar = this.b;
        boolean z = false;
        if (gdVar != null && gdVar.u()) {
            z = true;
        }
        gcVar.a = z;
        return gcVar;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        hj hjVar = this.g;
        if (hjVar == null || !hjVar.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        gd gdVar = this.b;
        if (gdVar == null) {
            return super.performClick();
        }
        if (gdVar.u()) {
            return true;
        }
        b();
        return true;
    }

    @Override // android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        fg fgVar = this.f;
        if (fgVar != null) {
            fgVar.e();
        }
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        fg fgVar = this.f;
        if (fgVar != null) {
            fgVar.c(i);
        }
    }

    @Override // android.widget.Spinner
    public final void setDropDownHorizontalOffset(int i) {
        gd gdVar = this.b;
        if (gdVar == null) {
            super.setDropDownHorizontalOffset(i);
        } else {
            gdVar.h(i);
            this.b.g(i);
        }
    }

    @Override // android.widget.Spinner
    public final void setDropDownVerticalOffset(int i) {
        gd gdVar = this.b;
        if (gdVar != null) {
            gdVar.j(i);
        } else {
            super.setDropDownVerticalOffset(i);
        }
    }

    @Override // android.widget.Spinner
    public final void setDropDownWidth(int i) {
        if (this.b != null) {
            this.c = i;
        } else {
            super.setDropDownWidth(i);
        }
    }

    @Override // android.widget.Spinner
    public final void setPopupBackgroundDrawable(Drawable drawable) {
        gd gdVar = this.b;
        if (gdVar != null) {
            gdVar.f(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public final void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(ii.J(this.a, i));
    }

    @Override // android.widget.Spinner
    public final void setPrompt(CharSequence charSequence) {
        gd gdVar = this.b;
        if (gdVar != null) {
            gdVar.i(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.i) {
            this.h = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.b != null) {
            Context context = this.a;
            if (context == null) {
                context = getContext();
            }
            this.b.e(new fz(spinnerAdapter, context.getTheme()));
        }
    }
}
