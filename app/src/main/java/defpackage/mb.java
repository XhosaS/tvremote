package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import com.google.android.katniss.R;

/* compiled from: PG */
/* loaded from: classes.dex */
class mb extends lx {
    public final SeekBar b;
    public Drawable c;
    private ColorStateList d;
    private PorterDuff.Mode e;
    private boolean f;
    private boolean g;

    public mb(SeekBar seekBar) {
        super(seekBar);
        this.d = null;
        this.e = null;
        this.f = false;
        this.g = false;
        this.b = seekBar;
    }

    private final void c() {
        Drawable drawable = this.c;
        if (drawable != null) {
            if (this.f || this.g) {
                Drawable drawableMutate = drawable.mutate();
                this.c = drawableMutate;
                if (this.f) {
                    drawableMutate.setTintList(this.d);
                }
                if (this.g) {
                    this.c.setTintMode(this.e);
                }
                if (this.c.isStateful()) {
                    this.c.setState(this.b.getDrawableState());
                }
            }
        }
    }

    @Override // defpackage.lx
    public final void b(AttributeSet attributeSet, int i) {
        super.b(attributeSet, R.attr.seekBarStyle);
        SeekBar seekBar = this.b;
        Context context = seekBar.getContext();
        int[] iArr = hs.g;
        rv rvVarF = rv.f(context, attributeSet, iArr, R.attr.seekBarStyle, 0);
        TypedArray typedArray = rvVarF.b;
        ahj.m(seekBar, seekBar.getContext(), iArr, attributeSet, typedArray, R.attr.seekBarStyle, 0);
        Drawable drawableC = rvVarF.c(0);
        if (drawableC != null) {
            seekBar.setThumb(drawableC);
        }
        Drawable drawableB = rvVarF.b(1);
        Drawable drawable = this.c;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.c = drawableB;
        if (drawableB != null) {
            drawableB.setCallback(seekBar);
            drawableB.setLayoutDirection(seekBar.getLayoutDirection());
            if (drawableB.isStateful()) {
                drawableB.setState(seekBar.getDrawableState());
            }
            c();
        }
        seekBar.invalidate();
        if (typedArray.hasValue(3)) {
            this.e = np.a(typedArray.getInt(3, -1), this.e);
            this.g = true;
        }
        if (typedArray.hasValue(2)) {
            this.d = rvVarF.a(2);
            this.f = true;
        }
        typedArray.recycle();
        c();
    }
}
