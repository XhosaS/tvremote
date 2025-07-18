package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import com.google.android.tv.remote.service.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gb extends hz implements gd {
    public CharSequence a;
    public ListAdapter b;
    public final Rect c;
    public final /* synthetic */ ge d;
    private int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gb(ge geVar, Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.spinnerStyle);
        this.d = geVar;
        this.c = new Rect();
        this.l = geVar;
        y();
        this.m = new bef(this, 1);
    }

    @Override // defpackage.gd
    public final CharSequence d() {
        return this.a;
    }

    @Override // defpackage.hz, defpackage.gd
    public final void e(ListAdapter listAdapter) {
        super.e(listAdapter);
        this.b = listAdapter;
    }

    @Override // defpackage.gd
    public final void h(int i) {
        this.s = i;
    }

    @Override // defpackage.gd
    public final void i(CharSequence charSequence) {
        this.a = charSequence;
    }

    @Override // defpackage.gd
    public final void l(int i, int i2) {
        ViewTreeObserver viewTreeObserver;
        boolean zU = u();
        n();
        x();
        super.s();
        hf hfVar = this.e;
        hfVar.setChoiceMode(1);
        hfVar.setTextDirection(i);
        hfVar.setTextAlignment(i2);
        ge geVar = this.d;
        int selectedItemPosition = geVar.getSelectedItemPosition();
        hf hfVar2 = this.e;
        if (u() && hfVar2 != null) {
            hfVar2.a = false;
            hfVar2.setSelection(selectedItemPosition);
            if (hfVar2.getChoiceMode() != 0) {
                hfVar2.setItemChecked(selectedItemPosition, true);
            }
        }
        if (zU || (viewTreeObserver = geVar.getViewTreeObserver()) == null) {
            return;
        }
        el elVar = new el(this, 3);
        viewTreeObserver.addOnGlobalLayoutListener(elVar);
        v(new ga(this, elVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2, types: [android.widget.ListAdapter, android.widget.SpinnerAdapter] */
    public final void n() {
        int i;
        Drawable drawableC = c();
        if (drawableC != null) {
            ge geVar = this.d;
            Rect rect = geVar.d;
            drawableC.getPadding(rect);
            i = kc.a(geVar) ? rect.right : -rect.left;
        } else {
            Rect rect2 = this.d.d;
            rect2.right = 0;
            rect2.left = 0;
            i = 0;
        }
        ge geVar2 = this.d;
        int paddingLeft = geVar2.getPaddingLeft();
        int paddingRight = geVar2.getPaddingRight();
        int width = geVar2.getWidth();
        int i2 = geVar2.c;
        if (i2 == -2) {
            int i3 = (width - paddingLeft) - paddingRight;
            int iA = geVar2.a(this.b, c());
            int i4 = geVar2.getContext().getResources().getDisplayMetrics().widthPixels;
            Rect rect3 = geVar2.d;
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
        this.g = kc.a(geVar2) ? i + (((width - paddingRight) - this.f) - this.s) : i + paddingLeft + this.s;
    }
}
