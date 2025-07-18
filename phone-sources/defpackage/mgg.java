package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import com.google.android.videos.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mgg extends mgl {
    public final Paint a;
    public final float b;
    public final float c;
    public final float d;
    public final RectF e;
    public String f;
    public float g;
    public mgh h;
    private final List o;
    private final int p;
    private final int q;

    public mgg(Context context) throws Resources.NotFoundException {
        super(context);
        this.e = new RectF();
        Resources resources = context.getResources();
        float dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.tag_shadow_radius);
        float dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.tag_shadow_y_offset);
        Paint paint = new Paint();
        this.a = paint;
        paint.setAntiAlias(true);
        paint.setTextAlign(Paint.Align.CENTER);
        float dimension = resources.getDimension(R.dimen.tag_text_size);
        this.c = dimension;
        this.b = resources.getDimension(R.dimen.tag_text_gap) + dimension;
        paint.setTextSize(dimension);
        paint.setShadowLayer(dimensionPixelSize, 0.0f, dimensionPixelOffset, context.getColor(R.color.tag_text_shadow_color));
        this.d = dimensionPixelSize + Math.abs(dimensionPixelOffset);
        this.p = context.getColor(R.color.tag_color);
        this.q = context.getColor(R.color.activated_tag_color);
        this.o = new ArrayList();
        setVisibility(8);
    }

    @Override // defpackage.mgl
    protected final float a() {
        return 1.0f;
    }

    public final void b(mgg mggVar) {
        this.o.add(mggVar);
    }

    @Override // android.view.View
    public final void dispatchSetActivated(boolean z) {
        super.dispatchSetActivated(z);
        mgh mghVar = this.h;
        if (mghVar != null && mghVar.isActivated() != z) {
            this.h.setActivated(z);
        }
        if (!z || getVisibility() == 0) {
            return;
        }
        int i = 0;
        setVisibility(0);
        while (true) {
            List list = this.o;
            if (i >= list.size()) {
                return;
            }
            ((mgg) list.get(i)).setVisibility(8);
            i++;
        }
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        int i = isActivated() ? this.q : this.p;
        Paint paint = this.a;
        paint.setColor(i);
        String str = this.f;
        float f = this.m;
        RectF rectF = this.l;
        canvas.drawText(str, f - rectF.left, this.g - rectF.top, paint);
    }
}
