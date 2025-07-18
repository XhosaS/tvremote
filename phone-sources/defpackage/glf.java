package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes.dex */
final class glf extends Drawable.ConstantState {
    int a;
    gle b;
    ColorStateList c;
    PorterDuff.Mode d;
    boolean e;
    Bitmap f;
    ColorStateList g;
    PorterDuff.Mode h;
    int i;
    boolean j;
    boolean k;
    Paint l;

    public glf() {
        this.c = null;
        this.d = glh.a;
        this.b = new gle();
    }

    public final void a(int i, int i2) {
        this.f.eraseColor(0);
        Canvas canvas = new Canvas(this.f);
        gle gleVar = this.b;
        gleVar.a(gleVar.d, gle.a, canvas, i, i2);
    }

    public final boolean b() {
        gle gleVar = this.b;
        if (gleVar.k == null) {
            gleVar.k = Boolean.valueOf(gleVar.d.b());
        }
        return gleVar.k.booleanValue();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.a;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new glh(this);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new glh(this);
    }

    public glf(glf glfVar) {
        this.c = null;
        this.d = glh.a;
        if (glfVar != null) {
            this.a = glfVar.a;
            this.b = new gle(glfVar.b);
            Paint paint = glfVar.b.c;
            if (paint != null) {
                this.b.c = new Paint(paint);
            }
            Paint paint2 = glfVar.b.b;
            if (paint2 != null) {
                this.b.b = new Paint(paint2);
            }
            this.c = glfVar.c;
            this.d = glfVar.d;
            this.e = glfVar.e;
        }
    }
}
