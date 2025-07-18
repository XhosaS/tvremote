package androidx.leanback.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import defpackage.ahj;
import defpackage.awj;
import defpackage.axa;
import defpackage.azo;

/* compiled from: PG */
/* loaded from: classes.dex */
public class HorizontalGridView extends awj {
    public boolean ag;
    public Bitmap ah;
    private Paint ai;
    private LinearGradient aj;
    private int ak;
    private int al;
    private int am;
    private int an;
    private final Rect ao;

    public HorizontalGridView(Context context) {
        this(context, null);
    }

    public final void aF() {
        if (this.ag) {
            setLayerType(2, null);
            setWillNotDraw(false);
        } else {
            setLayerType(0, null);
            setWillNotDraw(true);
        }
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.View
    public final void draw(Canvas canvas) {
        if (this.ag) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = getChildAt(i);
                if (childAt.getLeft() + ((axa) childAt.getLayoutParams()).a < getPaddingLeft() - this.al) {
                    int paddingLeft = this.ag ? (getPaddingLeft() - this.al) - this.ak : 0;
                    int width = getWidth();
                    int iSave = canvas.save();
                    canvas.clipRect((this.ag ? this.ak : 0) + paddingLeft, 0, width, getHeight());
                    super.draw(canvas);
                    canvas.restoreToCount(iSave);
                    Canvas canvas2 = new Canvas();
                    Rect rect = this.ao;
                    rect.top = 0;
                    rect.bottom = getHeight();
                    if (this.ak > 0) {
                        Bitmap bitmap = this.ah;
                        if (bitmap == null || bitmap.getWidth() != this.ak || this.ah.getHeight() != getHeight()) {
                            this.ah = Bitmap.createBitmap(this.ak, getHeight(), Bitmap.Config.ARGB_8888);
                        }
                        Bitmap bitmap2 = this.ah;
                        bitmap2.eraseColor(0);
                        canvas2.setBitmap(bitmap2);
                        int iSave2 = canvas2.save();
                        canvas2.clipRect(0, 0, this.ak, getHeight());
                        float f = -paddingLeft;
                        canvas2.translate(f, 0.0f);
                        super.draw(canvas2);
                        canvas2.restoreToCount(iSave2);
                        this.ai.setShader(this.aj);
                        canvas2.drawRect(0.0f, 0.0f, this.ak, getHeight(), this.ai);
                        rect.left = 0;
                        rect.right = this.ak;
                        canvas.translate(paddingLeft, 0.0f);
                        canvas.drawBitmap(bitmap2, rect, rect, (Paint) null);
                        canvas.translate(f, 0.0f);
                        return;
                    }
                    return;
                }
            }
        }
        this.ah = null;
        super.draw(canvas);
    }

    public final boolean getFadingLeftEdge() {
        return this.ag;
    }

    public final int getFadingLeftEdgeLength() {
        return this.ak;
    }

    public final int getFadingLeftEdgeOffset() {
        return this.al;
    }

    public final boolean getFadingRightEdge() {
        return false;
    }

    public final int getFadingRightEdgeLength() {
        return this.am;
    }

    public final int getFadingRightEdgeOffset() {
        return this.an;
    }

    public final void setFadingLeftEdgeLength(int i) {
        if (this.ak != i) {
            this.ak = i;
            if (i != 0) {
                this.aj = new LinearGradient(0.0f, 0.0f, i, 0.0f, 0, -16777216, Shader.TileMode.CLAMP);
            } else {
                this.aj = null;
            }
            invalidate();
        }
    }

    public final void setFadingLeftEdgeOffset(int i) {
        if (this.al != i) {
            this.al = i;
            invalidate();
        }
    }

    public final void setFadingRightEdgeLength(int i) {
        if (this.am != i) {
            this.am = i;
            if (i != 0) {
                new LinearGradient(0.0f, 0.0f, i, 0.0f, -16777216, 0, Shader.TileMode.CLAMP);
            }
            invalidate();
        }
    }

    public final void setFadingRightEdgeOffset(int i) {
        if (this.an != i) {
            this.an = i;
            invalidate();
        }
    }

    public void setNumRows(int i) {
        this.ad.ag(i);
        requestLayout();
    }

    public void setRowHeight(int i) {
        this.ad.ap(i);
        requestLayout();
    }

    public HorizontalGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public HorizontalGridView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.ai = new Paint();
        this.ao = new Rect();
        this.ad.am(0);
        fa(context, attributeSet);
        int[] iArr = azo.b;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        ahj.m(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, 0, 0);
        if (typedArrayObtainStyledAttributes.peekValue(1) != null) {
            setRowHeight(typedArrayObtainStyledAttributes.getLayoutDimension(1, 0));
        }
        setNumRows(typedArrayObtainStyledAttributes.getInt(0, 1));
        typedArrayObtainStyledAttributes.recycle();
        aF();
        Paint paint = new Paint();
        this.ai = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
    }
}
