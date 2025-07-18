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
final class acc extends Drawable.ConstantState {
    int a;
    acb b;
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

    public acc() {
        this.c = null;
        this.d = ace.a;
        this.b = new acb();
    }

    public final void a(int i, int i2) {
        this.f.eraseColor(0);
        Canvas canvas = new Canvas(this.f);
        acb acbVar = this.b;
        acbVar.a(acbVar.d, acb.a, canvas, i, i2);
    }

    public final boolean b() {
        acb acbVar = this.b;
        if (acbVar.k == null) {
            acbVar.k = Boolean.valueOf(acbVar.d.n());
        }
        return acbVar.k.booleanValue();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.a;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new ace(this);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new ace(this);
    }

    public acc(acc accVar) {
        this.c = null;
        this.d = ace.a;
        if (accVar != null) {
            this.a = accVar.a;
            this.b = new acb(accVar.b);
            Paint paint = accVar.b.c;
            if (paint != null) {
                this.b.c = new Paint(paint);
            }
            Paint paint2 = accVar.b.b;
            if (paint2 != null) {
                this.b.b = new Paint(paint2);
            }
            this.c = accVar.c;
            this.d = accVar.d;
            this.e = accVar.e;
        }
    }
}
