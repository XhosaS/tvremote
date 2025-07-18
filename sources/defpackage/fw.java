package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fw extends fs {
    public final SeekBar b;
    public Drawable c;
    private ColorStateList d;
    private PorterDuff.Mode e;
    private boolean f;
    private boolean g;

    public fw(SeekBar seekBar) {
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

    @Override // defpackage.fs
    public final void b(AttributeSet attributeSet, int i) {
        super.b(attributeSet, i);
        SeekBar seekBar = this.b;
        Context context = seekBar.getContext();
        int[] iArr = cu.g;
        aps apsVarR = aps.r(context, attributeSet, iArr, i, 0);
        qv.k(seekBar, seekBar.getContext(), iArr, attributeSet, (TypedArray) apsVarR.a, i, 0);
        Drawable drawableJ = apsVarR.j(0);
        if (drawableJ != null) {
            seekBar.setThumb(drawableJ);
        }
        Drawable drawableI = apsVarR.i(1);
        Drawable drawable = this.c;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.c = drawableI;
        if (drawableI != null) {
            drawableI.setCallback(seekBar);
            drawableI.setLayoutDirection(seekBar.getLayoutDirection());
            if (drawableI.isStateful()) {
                drawableI.setState(seekBar.getDrawableState());
            }
            c();
        }
        seekBar.invalidate();
        if (apsVarR.o(3)) {
            int iD = apsVarR.d(3, -1);
            PorterDuff.Mode mode = this.e;
            int i2 = hb.a;
            this.e = ii.V(iD, mode);
            this.g = true;
        }
        if (apsVarR.o(2)) {
            this.d = apsVarR.h(2);
            this.f = true;
        }
        apsVarR.m();
        c();
    }
}
