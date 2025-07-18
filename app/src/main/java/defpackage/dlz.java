package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class dlz extends Drawable implements Animatable, dme {
    public final dly a;
    public boolean b;
    public List d;
    private boolean e;
    private boolean f;
    private int h;
    private boolean i;
    private Paint j;
    private Rect k;
    private boolean g = true;
    public int c = -1;

    public dlz(dly dlyVar) {
        this.a = dlyVar;
    }

    private final Paint d() {
        if (this.j == null) {
            this.j = new Paint(2);
        }
        return this.j;
    }

    private final Rect e() {
        if (this.k == null) {
            this.k = new Rect();
        }
        return this.k;
    }

    private final void f() {
        dqk.a(!this.b, "You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.");
        dmg dmgVar = this.a.a;
        if (dmgVar.a() == 1) {
            invalidateSelf();
            return;
        }
        if (this.e) {
            return;
        }
        this.e = true;
        if (dmgVar.f) {
            throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
        }
        List list = dmgVar.b;
        if (list.contains(this)) {
            throw new IllegalStateException("Cannot subscribe twice in a row");
        }
        boolean zIsEmpty = list.isEmpty();
        list.add(this);
        if (zIsEmpty && !dmgVar.d) {
            dmgVar.d = true;
            dmgVar.f = false;
            dmgVar.b();
        }
        invalidateSelf();
    }

    private final void g() {
        this.e = false;
        dmg dmgVar = this.a.a;
        List list = dmgVar.b;
        list.remove(this);
        if (list.isEmpty()) {
            dmgVar.d = false;
        }
    }

    public final Bitmap a() {
        return this.a.a.h;
    }

    public final ByteBuffer b() {
        return ((czq) this.a.a.a).a.asReadOnlyBuffer();
    }

    @Override // defpackage.dme
    public final void c() {
        Object callback = getCallback();
        while (callback instanceof Drawable) {
            callback = ((Drawable) callback).getCallback();
        }
        if (callback == null) {
            stop();
            invalidateSelf();
            return;
        }
        invalidateSelf();
        dmd dmdVar = this.a.a.e;
        if ((dmdVar != null ? dmdVar.a : -1) == r0.a() - 1) {
            this.h++;
        }
        int i = this.c;
        if (i == -1 || this.h < i) {
            return;
        }
        stop();
        List list = this.d;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((bwd) this.d.get(i2)).b(this);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.b) {
            return;
        }
        if (this.i) {
            Gravity.apply(119, getIntrinsicWidth(), getIntrinsicHeight(), getBounds(), e());
            this.i = false;
        }
        dmg dmgVar = this.a.a;
        dmd dmdVar = dmgVar.e;
        canvas.drawBitmap(dmdVar != null ? dmdVar.b : dmgVar.h, (Rect) null, e(), d());
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.a;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.a.a.l;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.a.a.k;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.e;
    }

    @Override // android.graphics.drawable.Drawable
    protected final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.i = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        d().setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        d().setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        dqk.a(!this.b, "Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.");
        this.g = z;
        if (!z) {
            g();
        } else if (this.f) {
            f();
        }
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        this.f = true;
        this.h = 0;
        if (this.g) {
            f();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.f = false;
        g();
    }
}
