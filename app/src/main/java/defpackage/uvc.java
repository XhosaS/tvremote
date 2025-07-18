package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.os.Build;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import j$.util.Objects;
import java.util.Arrays;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uvc implements uvo {
    public static final zdy a = zdy.h("com/google/android/libraries/tv/widgets/scrim/GradientScrimRenderer");
    public final boolean b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final boolean h;
    public final float i;
    public final float[] j;
    public final int k;
    public final float l;
    public final float m;
    private final int n;
    private final int[] o;
    private final Paint p;
    private final boolean q;
    private final boolean r;
    private final PorterDuff.Mode s;

    public uvc(Context context, uva uvaVar) {
        Resources resources = context.getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        this.r = uvaVar.s && resources.getConfiguration().getLayoutDirection() == 1;
        this.l = uvaVar.b <= 0 ? displayMetrics.widthPixels : r10;
        this.m = uvaVar.c <= 0 ? displayMetrics.heightPixels : r10;
        this.b = uvaVar.p;
        this.c = a(uvaVar.d);
        this.d = uvaVar.e;
        this.e = a(uvaVar.g);
        this.f = uvaVar.h;
        float f = uvaVar.m;
        this.g = f == 0.0f ? 1.0f : f;
        boolean z = uvaVar.q;
        this.h = z;
        this.q = uvaVar.r;
        this.i = z ? 0.0f : (float) Math.hypot(r1 - r10, r4 - r0);
        this.n = uvaVar.n;
        int[] iArr = new int[uvaVar.j.size() + 2];
        this.o = iArr;
        iArr[0] = uvaVar.f;
        Iterator it = uvaVar.j.iterator();
        int i = 1;
        while (it.hasNext()) {
            this.o[i] = ((Integer) it.next()).intValue();
            i++;
        }
        this.o[i] = uvaVar.i;
        if (uvaVar.k.size() != 0) {
            yqw.L(uvaVar.k.size() == uvaVar.j.size());
            this.j = new float[this.o.length];
            Iterator it2 = uvaVar.k.iterator();
            int i2 = 1;
            while (it2.hasNext()) {
                this.j[i2] = ((Float) it2.next()).floatValue();
                i2++;
            }
            this.j[i2] = 1.0f;
            int i3 = 1;
            while (true) {
                float[] fArr = this.j;
                if (i3 >= fArr.length) {
                    break;
                }
                yqw.L(fArr[i3] > fArr[i3 + (-1)]);
                i3++;
            }
        } else {
            this.j = null;
        }
        int i4 = uvaVar.l;
        this.k = i4 <= 0 ? 100 : i4;
        String str = uvaVar.o;
        this.s = TextUtils.isEmpty(str) ? null : PorterDuff.Mode.valueOf(str);
        this.p = this.b ? null : m(0, null);
    }

    private static int l(int i, int i2) {
        return ((i * i2) + 127) / 255;
    }

    private final Paint m(int i, ColorFilter colorFilter) {
        Paint paint = new Paint();
        paint.setDither(true);
        paint.setColorFilter(colorFilter);
        PorterDuff.Mode mode = this.s;
        if (mode != null) {
            paint.setXfermode(new PorterDuffXfermode(mode));
        }
        int[] iArrG = g(i);
        if (iArrG.length == 1) {
            paint.setColor(iArrG[0]);
            return paint;
        }
        if (this.h) {
            paint.setShader(new LinearGradient(this.c, this.d, this.e, this.f, iArrG, this.j, Shader.TileMode.CLAMP));
            return paint;
        }
        paint.setShader(new RadialGradient(this.c, this.d, this.i, iArrG, this.j, Shader.TileMode.CLAMP));
        return paint;
    }

    private final void n(Canvas canvas, Paint paint) {
        canvas.save();
        canvas.scale(canvas.getWidth() / this.l, canvas.getHeight() / this.m);
        float f = this.g;
        if (f != 1.0f) {
            canvas.scale(1.0f, f, 0.0f, this.d);
        }
        canvas.drawPaint(paint);
        canvas.restore();
    }

    final float a(float f) {
        return this.r ? this.l - f : f;
    }

    @Override // defpackage.uvo
    public final /* synthetic */ uvq b() {
        return new uuy(this);
    }

    @Override // defpackage.uvo
    public final /* synthetic */ void c(Canvas canvas, bho bhoVar) {
        k(canvas, bhoVar);
    }

    @Override // defpackage.uvo
    public final boolean d() {
        if (!e()) {
            return false;
        }
        Bitmap bitmap = uvp.a;
        return !Build.HARDWARE.equals("robolectric");
    }

    @Override // defpackage.uvo
    public final boolean e() {
        return Color.alpha(this.n) == 255;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uvc)) {
            return false;
        }
        uvc uvcVar = (uvc) obj;
        return this.b == uvcVar.b && Float.compare(uvcVar.c, this.c) == 0 && Float.compare(uvcVar.d, this.d) == 0 && Float.compare(uvcVar.e, this.e) == 0 && Float.compare(uvcVar.f, this.f) == 0 && Float.compare(uvcVar.g, this.g) == 0 && this.h == uvcVar.h && this.n == uvcVar.n && Arrays.equals(this.o, uvcVar.o) && Arrays.equals(this.j, uvcVar.j) && this.k == uvcVar.k && this.q == uvcVar.q && this.s == uvcVar.s && this.l == uvcVar.l && this.m == uvcVar.m;
    }

    @Override // defpackage.uvo
    public final boolean f() {
        return this.b;
    }

    public final int[] g(int i) {
        int[] iArr = this.o;
        int[] iArr2 = new int[iArr.length];
        boolean z = true;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            int iArgb = iArr[i2];
            if (i != 0) {
                iArgb = Color.argb(l(Color.alpha(iArgb), Color.alpha(i)), l(Color.red(iArgb), Color.red(i)), l(Color.green(iArgb), Color.green(i)), l(Color.blue(iArgb), Color.blue(i)));
            }
            int iE = acr.e(iArgb, this.n);
            iArr2[i2] = iE;
            z &= iE == iArr2[0];
        }
        return z ? new int[]{iArr2[0]} : iArr2;
    }

    @Override // defpackage.uvo
    public final djg h(int i, int i2, Bitmap.Config config) {
        return !d() ? new uvh(this, null, null, i, i2, config) : new uvb(this, i, i2, config);
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.b), Float.valueOf(this.c), Float.valueOf(this.d), Float.valueOf(this.e), Float.valueOf(this.f), Float.valueOf(this.g), Boolean.valueOf(this.h), Integer.valueOf(this.n), Integer.valueOf(Arrays.hashCode(this.o)), Integer.valueOf(Arrays.hashCode(this.j)), Integer.valueOf(this.k), Boolean.valueOf(this.q), this.s, Float.valueOf(this.l), Float.valueOf(this.m));
    }

    @Override // defpackage.uvo
    public final /* synthetic */ void i(Canvas canvas) {
        j(canvas, null);
    }

    @Override // defpackage.uvo
    public final void j(Canvas canvas, ColorFilter colorFilter) {
        n(canvas, (this.b || colorFilter != null) ? m(0, colorFilter) : this.p);
    }

    @Override // defpackage.uvo
    public final void k(Canvas canvas, bho bhoVar) {
        n(canvas, !this.b ? this.p : m(bhoVar.a(), null));
    }

    public final String toString() {
        PorterDuff.Mode mode = this.s;
        float[] fArr = this.j;
        return "GradientScrimRenderer{useExtract=" + this.b + ", centerX=" + this.c + ", centerY=" + this.d + ", edgeX=" + this.e + ", edgeY=" + this.f + ", scaleY=" + this.g + ", isLinear=" + this.h + ", backgroundColor=" + this.n + ", colors=" + Arrays.toString(this.o) + ", colorOffsets=" + Arrays.toString(fArr) + ", isHighQuality=" + this.q + ", porterDuffMode=" + String.valueOf(mode) + ", gradientWidth=" + this.l + ", gradientHeight=" + this.m + "}";
    }
}
