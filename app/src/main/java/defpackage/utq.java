package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.LruCache;
import com.google.android.katniss.R;
import java.io.IOException;
import java.util.Arrays;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class utq extends Drawable {
    public static final LruCache a = new LruCache(4);
    public static final int b = R.dimen.spotlight_shadow_blur_distance;
    public static final int c = R.color.spotlight_default_shadow_color;
    public int d;
    private utp e;
    private yqi f;
    private final RectF g;
    private final Paint h;
    private final ValueAnimator i;
    private Bitmap j;
    private float k;
    private float l;
    private boolean m;
    private final float[] n;
    private final int[] o;
    private final float[] p;
    private int q;
    private float r;
    private boolean s;

    public utq() {
        this.g = new RectF();
        this.h = new Paint();
        this.i = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.n = new float[32];
        this.o = new int[16];
        this.p = new float[20];
        this.r = 1.0f;
    }

    public static utp a(Context context) {
        return new utp(context.getResources(), context.getTheme());
    }

    protected final void b(utp utpVar) {
        this.e = utpVar;
        this.d = utpVar.a;
        this.l = utpVar.b;
        this.f = utpVar.d;
        this.g.set(utpVar.e);
        this.k = utpVar.c;
        boolean z = utpVar.g;
        this.m = z;
        if (z) {
            ValueAnimator valueAnimator = this.i;
            valueAnimator.setDuration(utpVar.f);
            valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: utm
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    this.a.invalidateSelf();
                }
            });
        }
        Bitmap bitmap = utpVar.h;
        if (bitmap == null) {
            afg afgVar = new afg(Float.valueOf(utpVar.b), Float.valueOf(utpVar.c));
            LruCache lruCache = a;
            utpVar.h = (Bitmap) lruCache.get(afgVar);
            if (utpVar.h == null) {
                float f = utpVar.b / 2.0f;
                float f2 = utpVar.c / 2.0f;
                float fMax = Math.max(f2, 1.0f);
                float fMax2 = Math.max(f, 1.0f) + fMax;
                int iRound = Math.round(4.0f * fMax2);
                Paint paint = new Paint();
                paint.setColor(-1);
                paint.setMaskFilter(new BlurMaskFilter((f * 9.0f) / 10.0f, BlurMaskFilter.Blur.NORMAL));
                Path path = new Path();
                float f3 = fMax2 - fMax;
                float f4 = (fMax2 * 3.0f) + fMax;
                path.addRoundRect(f3, f3, f4, f4, f2, f2, Path.Direction.CW);
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iRound, iRound, Bitmap.Config.ALPHA_8);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                canvas.drawPath(path, paint);
                canvas.setBitmap(null);
                utpVar.h = bitmapCreateBitmap;
                lruCache.put(afgVar, utpVar.h);
            }
            bitmap = utpVar.h;
        }
        this.j = bitmap;
        c(this.d);
    }

    public final void c(int i) {
        this.q = i;
        float fRed = Color.red(i);
        float[] fArr = this.p;
        fArr[4] = fRed;
        fArr[9] = Color.green(this.q);
        fArr[14] = Color.blue(this.q);
        fArr[18] = ((Float) this.f.apply(getBounds())).floatValue() * this.r;
        this.h.setColorFilter(new ColorMatrixColorFilter(fArr));
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.r == 0.0f) {
            return;
        }
        int[] iArr = null;
        if (this.m) {
            int iRound = Math.round(((Float) this.i.getAnimatedValue()).floatValue() * 255.0f);
            if (iRound == 0) {
                return;
            }
            if (iRound < 255) {
                iArr = this.o;
                Arrays.fill(iArr, Color.argb(iRound, 255, 255, 255));
            }
        }
        canvas.drawBitmapMesh(this.j, 3, 3, this.n, 0, iArr, 0, this.h);
    }

    @Override // android.graphics.drawable.Drawable
    public final /* synthetic */ Drawable.ConstantState getConstantState() {
        return this.e;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        super.inflate(resources, xmlPullParser, attributeSet, theme);
        b(new utp(resources, theme, attributeSet));
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return this.m;
    }

    @Override // android.graphics.drawable.Drawable
    protected final void onBoundsChange(Rect rect) {
        float f = rect.left;
        RectF rectF = this.g;
        RectF rectF2 = new RectF(f + rectF.left, rect.top + rectF.top, rect.right - rectF.right, rect.bottom - rectF.bottom);
        float fMax = Math.max(this.k, 2.0f);
        float fMax2 = Math.max(this.l, 2.0f);
        float f2 = -fMax2;
        float[] fArr = {f2, fMax, rectF2.width() - fMax, rectF2.width() + fMax2};
        float[] fArr2 = {f2, fMax, rectF2.height() - fMax, rectF2.height() + fMax2};
        int i = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            for (int i3 = 0; i3 < 4; i3++) {
                float[] fArr3 = this.n;
                int i4 = i + 1;
                fArr3[i] = fArr[i3] + rectF2.left;
                i += 2;
                fArr3[i4] = fArr2[i2] + rectF2.top;
            }
        }
        c(this.q);
    }

    @Override // android.graphics.drawable.Drawable
    protected final boolean onStateChange(int[] iArr) {
        boolean z;
        if (!this.m) {
            z = true;
            break;
        }
        if (iArr != null) {
            for (int i : iArr) {
                if (i == 16842908) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        if (z == this.s) {
            return false;
        }
        this.s = z;
        ValueAnimator valueAnimator = this.i;
        valueAnimator.cancel();
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), true != this.s ? 0.0f : 1.0f);
        valueAnimator.start();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.r = i / 255.0f;
        c(this.q);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        yqw.L(colorFilter == null);
    }

    public utq(utp utpVar) {
        this.g = new RectF();
        this.h = new Paint();
        this.i = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.n = new float[32];
        this.o = new int[16];
        this.p = new float[20];
        this.r = 1.0f;
        b(utpVar);
    }
}
