package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tdg extends szk implements suu {
    public final Context a;
    public final suv b;
    public final View.OnLayoutChangeListener c;
    public int d;
    public int e;
    public int f;
    public int g;
    public boolean h;
    public int i;
    public float j;
    public float k;
    public float l;
    public float m;
    public float n;
    private CharSequence o;
    private final Paint.FontMetrics p;
    private final Rect q;
    private int r;

    public tdg(Context context, int i) {
        super(context, null, 0, i);
        this.p = new Paint.FontMetrics();
        suv suvVar = new suv(this);
        this.b = suvVar;
        this.c = new fta(this, 8, null);
        this.q = new Rect();
        this.j = 1.0f;
        this.k = 1.0f;
        this.l = 0.5f;
        this.m = 0.5f;
        this.n = 1.0f;
        this.a = context;
        suvVar.a.density = context.getResources().getDisplayMetrics().density;
        suvVar.a.setTextAlign(Paint.Align.CENTER);
    }

    private final float d() {
        int i;
        Rect rect = this.q;
        if (((rect.right - getBounds().right) - this.r) - this.g < 0) {
            i = ((rect.right - getBounds().right) - this.r) - this.g;
        } else {
            if (((rect.left - getBounds().left) - this.r) + this.g <= 0) {
                return 0.0f;
            }
            i = ((rect.left - getBounds().left) - this.r) + this.g;
        }
        return i;
    }

    public final szg a() {
        float f = -d();
        float fWidth = (float) ((getBounds().width() - (this.i * Math.sqrt(2.0d))) / 2.0d);
        return new szl(new szh(this.i), Math.min(Math.max(f, -fWidth), fWidth));
    }

    public final void b(CharSequence charSequence) {
        if (TextUtils.equals(this.o, charSequence)) {
            return;
        }
        this.o = charSequence;
        this.b.g();
        invalidateSelf();
    }

    public final void c(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        this.r = iArr[0];
        view.getWindowVisibleDisplayFrame(this.q);
    }

    @Override // defpackage.szk, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Canvas canvas2;
        canvas.save();
        float fD = d();
        double dSqrt = this.i * Math.sqrt(2.0d);
        double d = this.i;
        canvas.scale(this.j, this.k, getBounds().left + (getBounds().width() * this.l), getBounds().top + (getBounds().height() * this.m));
        canvas.translate(fD, (float) (-(dSqrt - d)));
        super.draw(canvas);
        if (this.o == null) {
            canvas2 = canvas;
        } else {
            float fCenterY = getBounds().centerY();
            suv suvVar = this.b;
            Paint.FontMetrics fontMetrics = this.p;
            TextPaint textPaint = suvVar.a;
            textPaint.getFontMetrics(fontMetrics);
            float f = fontMetrics.descent + fontMetrics.ascent;
            if (suvVar.e != null) {
                textPaint.drawableState = getState();
                suvVar.d(this.a);
                textPaint.setAlpha((int) (this.n * 255.0f));
            }
            CharSequence charSequence = this.o;
            float f2 = (int) (fCenterY - (f / 2.0f));
            canvas2 = canvas;
            canvas2.drawText(charSequence, 0, charSequence.length(), r0.centerX(), f2, textPaint);
        }
        canvas2.restore();
    }

    @Override // defpackage.suu
    public final void g() {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) Math.max(this.b.a.getTextSize(), this.f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        int i = this.d;
        int i2 = i + i;
        CharSequence charSequence = this.o;
        return (int) Math.max(i2 + (charSequence == null ? 0.0f : this.b.a(charSequence.toString())), this.e);
    }

    @Override // defpackage.szk, android.graphics.drawable.Drawable
    protected final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        if (this.h) {
            szp szpVar = new szp(F());
            szpVar.g = a();
            p(new szq(szpVar));
        }
    }

    @Override // defpackage.szk, android.graphics.drawable.Drawable, defpackage.suu
    public final boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }
}
