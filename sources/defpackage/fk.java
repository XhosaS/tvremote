package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.CheckedTextView;
import com.google.android.tv.remote.service.R;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fk {
    public boolean a;
    private final CheckedTextView b;

    public fk(CheckedTextView checkedTextView) {
        this.b = checkedTextView;
    }

    final void a() {
        this.b.getCheckMarkDrawable();
    }

    final void b(AttributeSet attributeSet) {
        int iG;
        int iG2;
        CheckedTextView checkedTextView = this.b;
        Context context = checkedTextView.getContext();
        int[] iArr = cu.l;
        aps apsVarR = aps.r(context, attributeSet, iArr, R.attr.checkedTextViewStyle, 0);
        qv.k(checkedTextView, checkedTextView.getContext(), iArr, attributeSet, (TypedArray) apsVarR.a, R.attr.checkedTextViewStyle, 0);
        try {
            if (apsVarR.o(1) && (iG2 = apsVarR.g(1, 0)) != 0) {
                try {
                    checkedTextView.setCheckMarkDrawable(ii.J(checkedTextView.getContext(), iG2));
                } catch (Resources.NotFoundException unused) {
                }
            } else if (apsVarR.o(0) && (iG = apsVarR.g(0, 0)) != 0) {
                CheckedTextView checkedTextView2 = this.b;
                checkedTextView2.setCheckMarkDrawable(ii.J(checkedTextView2.getContext(), iG));
            }
            if (apsVarR.o(2)) {
                this.b.setCheckMarkTintList(apsVarR.h(2));
            }
            if (apsVarR.o(3)) {
                CheckedTextView checkedTextView3 = this.b;
                int iD = apsVarR.d(3, -1);
                int i = hb.a;
                checkedTextView3.setCheckMarkTintMode(ii.V(iD, null));
            }
        } finally {
            apsVarR.m();
        }
    }
}
