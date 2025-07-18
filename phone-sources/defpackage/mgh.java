package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mgh extends mgl {
    public final float a;
    public final float b;
    public final RectF c;
    public lwu d;
    public mgg e;
    private final float f;
    private final int g;
    private final int h;
    private final int o;
    private final float p;
    private final float q;
    private final Paint r;

    public mgh(Context context) {
        super(context);
        this.c = new RectF();
        Resources resources = context.getResources();
        this.f = resources.getInteger(R.integer.tag_shape_alpha) / 255.0f;
        this.g = context.getColor(R.color.tag_color);
        this.h = context.getColor(R.color.activated_tag_color);
        this.a = resources.getDimension(R.dimen.tag_stroke_width);
        this.o = context.getColor(R.color.tag_shadow_color);
        float dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.tag_shadow_radius);
        this.q = dimensionPixelSize;
        float dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.tag_shadow_y_offset);
        this.p = dimensionPixelOffset;
        this.b = dimensionPixelSize + Math.abs(dimensionPixelOffset);
        Paint paint = new Paint();
        this.r = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setAntiAlias(true);
        setClickable(false);
        setFocusable(false);
        setLayerType(2, null);
    }

    @Override // defpackage.mgl
    protected final float a() {
        return 1.1f;
    }

    @Override // defpackage.mgl
    public final void c(int i) {
        super.c(i);
        mgg mggVar = this.e;
        if (mggVar == null || mggVar.getVisibility() != 0) {
            return;
        }
        this.e.c(i);
    }

    @Override // android.view.View
    protected final void dispatchSetActivated(boolean z) {
        super.dispatchSetActivated(z);
        mgg mggVar = this.e;
        if (mggVar != null) {
            mggVar.setActivated(z);
        }
    }

    @Override // defpackage.mgl
    protected final float ei() {
        return this.f;
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        lwo lwoVar = this.d.c;
        canvas.save();
        RectF rectF = this.l;
        float f = -rectF.left;
        float f2 = -rectF.top;
        float f3 = this.p;
        canvas.translate(f, f2 + f3);
        Paint paint = this.r;
        paint.setColor(this.o);
        float f4 = this.a;
        paint.setStrokeWidth(this.q + f4);
        lwoVar.a(canvas, paint);
        paint.setStrokeWidth(f4);
        lwoVar.a(canvas, paint);
        canvas.translate(0.0f, -f3);
        paint.setColor(isActivated() ? this.h : this.g);
        lwoVar.a(canvas, paint);
        canvas.restore();
    }
}
