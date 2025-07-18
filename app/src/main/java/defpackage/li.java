package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.CheckedTextView;
import com.google.android.katniss.R;

/* compiled from: PG */
/* loaded from: classes.dex */
class li {
    public final CheckedTextView a;
    public boolean b;

    public li(CheckedTextView checkedTextView) {
        this.a = checkedTextView;
    }

    final void a(AttributeSet attributeSet) {
        int resourceId;
        int resourceId2;
        CheckedTextView checkedTextView = this.a;
        Context context = checkedTextView.getContext();
        int[] iArr = hs.l;
        rv rvVarF = rv.f(context, attributeSet, iArr, R.attr.checkedTextViewStyle, 0);
        TypedArray typedArray = rvVarF.b;
        ahj.m(checkedTextView, checkedTextView.getContext(), iArr, attributeSet, typedArray, R.attr.checkedTextViewStyle, 0);
        try {
            if (!typedArray.hasValue(1) || (resourceId2 = typedArray.getResourceId(1, 0)) == 0) {
                TypedArray typedArray2 = rvVarF.b;
                if (typedArray2.hasValue(0) && (resourceId = typedArray2.getResourceId(0, 0)) != 0) {
                    CheckedTextView checkedTextView2 = this.a;
                    checkedTextView2.setCheckMarkDrawable(ra.e().c(checkedTextView2.getContext(), resourceId));
                }
            } else {
                try {
                    checkedTextView.setCheckMarkDrawable(ra.e().c(checkedTextView.getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                }
            }
            TypedArray typedArray3 = rvVarF.b;
            if (typedArray3.hasValue(2)) {
                this.a.setCheckMarkTintList(rvVarF.a(2));
            }
            if (typedArray3.hasValue(3)) {
                this.a.setCheckMarkTintMode(np.a(typedArray3.getInt(3, -1), null));
            }
        } finally {
            rvVarF.b.recycle();
        }
    }
}
