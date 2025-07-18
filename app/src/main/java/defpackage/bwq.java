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
class bwq extends Drawable.ConstantState {
    int a;
    bwp b;
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

    public bwq() {
        this.c = null;
        this.d = bws.a;
        this.b = new bwp();
    }

    public final void a(int i, int i2) {
        this.f.eraseColor(0);
        Canvas canvas = new Canvas(this.f);
        bwp bwpVar = this.b;
        bwpVar.b(bwpVar.d, bwp.a, canvas, i, i2);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.a;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new bws(this);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new bws(this);
    }

    public bwq(bwq bwqVar) {
        this.c = null;
        this.d = bws.a;
        if (bwqVar != null) {
            this.a = bwqVar.a;
            this.b = new bwp(bwqVar.b);
            Paint paint = bwqVar.b.c;
            if (paint != null) {
                this.b.c = new Paint(paint);
            }
            Paint paint2 = bwqVar.b.b;
            if (paint2 != null) {
                this.b.b = new Paint(paint2);
            }
            this.c = bwqVar.c;
            this.d = bwqVar.d;
            this.e = bwqVar.e;
        }
    }
}
