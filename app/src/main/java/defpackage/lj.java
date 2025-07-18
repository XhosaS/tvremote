package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CompoundButton;

/* compiled from: PG */
/* loaded from: classes.dex */
class lj {
    public PorterDuff.Mode a = null;
    public boolean b = false;
    public boolean c = false;
    private final CompoundButton d;
    private boolean e;

    public lj(CompoundButton compoundButton) {
        this.d = compoundButton;
    }

    final void a() {
        CompoundButton compoundButton = this.d;
        Drawable buttonDrawable = compoundButton.getButtonDrawable();
        if (buttonDrawable != null) {
            if (this.b || this.c) {
                Drawable drawableMutate = buttonDrawable.mutate();
                if (this.b) {
                    drawableMutate.setTintList(null);
                }
                if (this.c) {
                    drawableMutate.setTintMode(this.a);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(compoundButton.getDrawableState());
                }
                compoundButton.setButtonDrawable(drawableMutate);
            }
        }
    }

    final void b(AttributeSet attributeSet, int i) {
        int resourceId;
        int resourceId2;
        CompoundButton compoundButton = this.d;
        Context context = compoundButton.getContext();
        int[] iArr = hs.m;
        rv rvVarF = rv.f(context, attributeSet, iArr, i, 0);
        TypedArray typedArray = rvVarF.b;
        ahj.m(compoundButton, compoundButton.getContext(), iArr, attributeSet, typedArray, i, 0);
        try {
            if (!typedArray.hasValue(1) || (resourceId2 = typedArray.getResourceId(1, 0)) == 0) {
                TypedArray typedArray2 = rvVarF.b;
                if (typedArray2.hasValue(0) && (resourceId = typedArray2.getResourceId(0, 0)) != 0) {
                    CompoundButton compoundButton2 = this.d;
                    compoundButton2.setButtonDrawable(ra.e().c(compoundButton2.getContext(), resourceId));
                }
            } else {
                try {
                    compoundButton.setButtonDrawable(ra.e().c(compoundButton.getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                }
            }
            TypedArray typedArray3 = rvVarF.b;
            if (typedArray3.hasValue(2)) {
                this.d.setButtonTintList(rvVarF.a(2));
            }
            if (typedArray3.hasValue(3)) {
                this.d.setButtonTintMode(np.a(typedArray3.getInt(3, -1), null));
            }
        } finally {
            rvVarF.b.recycle();
        }
    }

    final void c() {
        if (this.e) {
            this.e = false;
        } else {
            this.e = true;
            a();
        }
    }
}
