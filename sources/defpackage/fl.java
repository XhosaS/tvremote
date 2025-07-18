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
public final class fl {
    public PorterDuff.Mode a = null;
    public boolean b = false;
    public boolean c = false;
    private final CompoundButton d;
    private boolean e;

    public fl(CompoundButton compoundButton) {
        this.d = compoundButton;
    }

    public final void a() {
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
        int iG;
        int iG2;
        CompoundButton compoundButton = this.d;
        Context context = compoundButton.getContext();
        int[] iArr = cu.m;
        aps apsVarR = aps.r(context, attributeSet, iArr, i, 0);
        qv.k(compoundButton, compoundButton.getContext(), iArr, attributeSet, (TypedArray) apsVarR.a, i, 0);
        try {
            if (apsVarR.o(1) && (iG2 = apsVarR.g(1, 0)) != 0) {
                try {
                    compoundButton.setButtonDrawable(ii.J(compoundButton.getContext(), iG2));
                } catch (Resources.NotFoundException unused) {
                }
            } else if (apsVarR.o(0) && (iG = apsVarR.g(0, 0)) != 0) {
                CompoundButton compoundButton2 = this.d;
                compoundButton2.setButtonDrawable(ii.J(compoundButton2.getContext(), iG));
            }
            if (apsVarR.o(2)) {
                this.d.setButtonTintList(apsVarR.h(2));
            }
            if (apsVarR.o(3)) {
                CompoundButton compoundButton3 = this.d;
                int iD = apsVarR.d(3, -1);
                int i2 = hb.a;
                compoundButton3.setButtonTintMode(ii.V(iD, null));
            }
        } finally {
            apsVarR.m();
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
