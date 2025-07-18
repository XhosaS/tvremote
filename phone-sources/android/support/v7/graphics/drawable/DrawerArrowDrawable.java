package android.support.v7.graphics.drawable;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v7.appcompat.R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: PG */
/* loaded from: classes.dex */
public class DrawerArrowDrawable extends Drawable {
    public static final int ARROW_DIRECTION_END = 3;
    public static final int ARROW_DIRECTION_LEFT = 0;
    public static final int ARROW_DIRECTION_RIGHT = 1;
    public static final int ARROW_DIRECTION_START = 2;
    private static final float ARROW_HEAD_ANGLE = (float) Math.toRadians(45.0d);
    private float mArrowHeadLength;
    private float mArrowShaftLength;
    private float mBarGap;
    private float mBarLength;
    private int mDirection;
    private float mMaxCutForBarSize;
    private final Paint mPaint;
    private final Path mPath;
    private float mProgress;
    private final int mSize;
    private boolean mSpin;
    private boolean mVerticalMirror;

    /* compiled from: PG */
    @Retention(RetentionPolicy.SOURCE)
    public @interface ArrowDirection {
    }

    public DrawerArrowDrawable(Context context) {
        Paint paint = new Paint();
        this.mPaint = paint;
        this.mPath = new Path();
        this.mVerticalMirror = false;
        this.mDirection = 2;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.MITER);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, R.styleable.DrawerArrowToggle, com.google.android.videos.R.attr.drawerArrowStyle, 2132083081);
        setColor(typedArrayObtainStyledAttributes.getColor(3, 0));
        setBarThickness(typedArrayObtainStyledAttributes.getDimension(7, 0.0f));
        setSpinEnabled(typedArrayObtainStyledAttributes.getBoolean(6, true));
        setGapSize(Math.round(typedArrayObtainStyledAttributes.getDimension(5, 0.0f)));
        this.mSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(4, 0);
        this.mBarLength = Math.round(typedArrayObtainStyledAttributes.getDimension(2, 0.0f));
        this.mArrowHeadLength = Math.round(typedArrayObtainStyledAttributes.getDimension(R.styleable.DrawerArrowToggle_arrowHeadLength, 0.0f));
        this.mArrowShaftLength = typedArrayObtainStyledAttributes.getDimension(1, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
    }

    private static float lerp(float f, float f2, float f3) {
        return f + ((f2 - f) * f3);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int i = this.mDirection;
        boolean z = false;
        if (i != 0 && (i == 1 || (i == 3 ? getLayoutDirection() == 0 : getLayoutDirection() == 1))) {
            z = true;
        }
        float f = this.mArrowHeadLength;
        float f2 = f * f;
        float fSqrt = (float) Math.sqrt(f2 + f2);
        float f3 = this.mBarLength;
        float f4 = this.mProgress;
        float fLerp = lerp(f3, fSqrt, f4);
        float fLerp2 = lerp(f3, this.mArrowShaftLength, f4);
        float fRound = Math.round(lerp(0.0f, this.mMaxCutForBarSize, f4));
        float f5 = ARROW_HEAD_ANGLE;
        float f6 = this.mProgress;
        float fLerp3 = lerp(0.0f, f5, f6);
        float fLerp4 = lerp(true != z ? -180.0f : 0.0f, true != z ? 0.0f : 180.0f, f6);
        double d = fLerp;
        double d2 = fLerp3;
        boolean z2 = z;
        float fRound2 = Math.round(Math.cos(d2) * d);
        float fRound3 = Math.round(d * Math.sin(d2));
        this.mPath.rewind();
        float fLerp5 = lerp(this.mBarGap + this.mPaint.getStrokeWidth(), -this.mMaxCutForBarSize, this.mProgress);
        float f7 = (-fLerp2) / 2.0f;
        this.mPath.moveTo(f7 + fRound, 0.0f);
        this.mPath.rLineTo(fLerp2 - (fRound + fRound), 0.0f);
        this.mPath.moveTo(f7, fLerp5);
        this.mPath.rLineTo(fRound2, fRound3);
        this.mPath.moveTo(f7, -fLerp5);
        this.mPath.rLineTo(fRound2, -fRound3);
        this.mPath.close();
        canvas.save();
        float strokeWidth = this.mPaint.getStrokeWidth();
        float f8 = this.mBarGap;
        int iHeight = ((int) ((bounds.height() - (3.0f * strokeWidth)) - (f8 + f8))) / 4;
        canvas.translate(bounds.centerX(), iHeight + iHeight + (strokeWidth * 1.5f) + f8);
        if (this.mSpin) {
            canvas.rotate(fLerp4 * (true == (this.mVerticalMirror ^ z2) ? -1 : 1));
        } else if (z2) {
            canvas.rotate(180.0f);
        }
        canvas.drawPath(this.mPath, this.mPaint);
        canvas.restore();
    }

    public float getArrowHeadLength() {
        return this.mArrowHeadLength;
    }

    public float getArrowShaftLength() {
        return this.mArrowShaftLength;
    }

    public float getBarLength() {
        return this.mBarLength;
    }

    public float getBarThickness() {
        return this.mPaint.getStrokeWidth();
    }

    public int getColor() {
        return this.mPaint.getColor();
    }

    public int getDirection() {
        return this.mDirection;
    }

    public float getGapSize() {
        return this.mBarGap;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.mSize;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.mSize;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public final Paint getPaint() {
        return this.mPaint;
    }

    public float getProgress() {
        return this.mProgress;
    }

    public boolean isSpinEnabled() {
        return this.mSpin;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (i != this.mPaint.getAlpha()) {
            this.mPaint.setAlpha(i);
            invalidateSelf();
        }
    }

    public void setArrowHeadLength(float f) {
        if (this.mArrowHeadLength != f) {
            this.mArrowHeadLength = f;
            invalidateSelf();
        }
    }

    public void setArrowShaftLength(float f) {
        if (this.mArrowShaftLength != f) {
            this.mArrowShaftLength = f;
            invalidateSelf();
        }
    }

    public void setBarLength(float f) {
        if (this.mBarLength != f) {
            this.mBarLength = f;
            invalidateSelf();
        }
    }

    public void setBarThickness(float f) {
        if (this.mPaint.getStrokeWidth() != f) {
            this.mPaint.setStrokeWidth(f);
            this.mMaxCutForBarSize = (float) ((f / 2.0f) * Math.cos(ARROW_HEAD_ANGLE));
            invalidateSelf();
        }
    }

    public void setColor(int i) {
        if (i != this.mPaint.getColor()) {
            this.mPaint.setColor(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.mPaint.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public void setDirection(int i) {
        if (i != this.mDirection) {
            this.mDirection = i;
            invalidateSelf();
        }
    }

    public void setGapSize(float f) {
        if (f != this.mBarGap) {
            this.mBarGap = f;
            invalidateSelf();
        }
    }

    public void setProgress(float f) {
        if (this.mProgress != f) {
            this.mProgress = f;
            invalidateSelf();
        }
    }

    public void setSpinEnabled(boolean z) {
        if (this.mSpin != z) {
            this.mSpin = z;
            invalidateSelf();
        }
    }

    public void setVerticalMirror(boolean z) {
        if (this.mVerticalMirror != z) {
            this.mVerticalMirror = z;
            invalidateSelf();
        }
    }
}
