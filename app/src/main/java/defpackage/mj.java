package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import com.google.android.katniss.R;

/* compiled from: PG */
/* loaded from: classes.dex */
class mj extends oz implements ml {
    public CharSequence a;
    ListAdapter b;
    public final Rect c;
    final /* synthetic */ mm d;
    private int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mj(mm mmVar, Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.spinnerStyle);
        this.d = mmVar;
        this.c = new Rect();
        this.k = mmVar;
        x();
        this.l = new mg(this);
    }

    @Override // defpackage.ml
    public final CharSequence d() {
        return this.a;
    }

    @Override // defpackage.oz, defpackage.ml
    public final void e(ListAdapter listAdapter) {
        super.e(listAdapter);
        this.b = listAdapter;
    }

    @Override // defpackage.ml
    public final void i(int i) {
        this.r = i;
    }

    @Override // defpackage.ml
    public final void j(CharSequence charSequence) {
        this.a = charSequence;
    }

    @Override // defpackage.ml
    public final void l(int i, int i2) {
        ViewTreeObserver viewTreeObserver;
        PopupWindow popupWindow = this.q;
        boolean zIsShowing = popupWindow.isShowing();
        n();
        w();
        super.s();
        nu nuVar = this.e;
        nuVar.setChoiceMode(1);
        nuVar.setTextDirection(i);
        nuVar.setTextAlignment(i2);
        mm mmVar = this.d;
        int selectedItemPosition = mmVar.getSelectedItemPosition();
        nu nuVar2 = this.e;
        if (popupWindow.isShowing() && nuVar2 != null) {
            nuVar2.a = false;
            nuVar2.setSelection(selectedItemPosition);
            if (nuVar2.getChoiceMode() != 0) {
                nuVar2.setItemChecked(selectedItemPosition, true);
            }
        }
        if (zIsShowing || (viewTreeObserver = mmVar.getViewTreeObserver()) == null) {
            return;
        }
        mh mhVar = new mh(this);
        viewTreeObserver.addOnGlobalLayoutListener(mhVar);
        popupWindow.setOnDismissListener(new mi(this, mhVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1, types: [android.widget.ListAdapter, android.widget.SpinnerAdapter] */
    final void n() {
        int i;
        PopupWindow popupWindow = this.q;
        Drawable background = popupWindow.getBackground();
        if (background != null) {
            mm mmVar = this.d;
            Rect rect = mmVar.c;
            background.getPadding(rect);
            i = sm.a(mmVar) ? rect.right : -rect.left;
        } else {
            Rect rect2 = this.d.c;
            rect2.right = 0;
            rect2.left = 0;
            i = 0;
        }
        mm mmVar2 = this.d;
        int paddingLeft = mmVar2.getPaddingLeft();
        int paddingRight = mmVar2.getPaddingRight();
        int width = mmVar2.getWidth();
        int i2 = mmVar2.b;
        if (i2 == -2) {
            int i3 = (width - paddingLeft) - paddingRight;
            int iA = mmVar2.a(this.b, popupWindow.getBackground());
            int i4 = mmVar2.getContext().getResources().getDisplayMetrics().widthPixels;
            Rect rect3 = mmVar2.c;
            int i5 = (i4 - rect3.left) - rect3.right;
            if (iA > i5) {
                iA = i5;
            }
            r(Math.max(iA, i3));
        } else if (i2 == -1) {
            r((width - paddingLeft) - paddingRight);
        } else {
            r(i2);
        }
        this.g = sm.a(mmVar2) ? i + (((width - paddingRight) - this.f) - this.r) : i + paddingLeft + this.r;
    }
}
