package androidx.leanback.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.tv.remote.service.R;

/* compiled from: PG */
/* loaded from: classes.dex */
class MediaRowFocusView extends View {
    private final Paint a;
    private final RectF b;
    private int c;

    public MediaRowFocusView(Context context) {
        super(context);
        this.b = new RectF();
        this.a = a(context);
    }

    private static final Paint a(Context context) {
        Paint paint = new Paint();
        paint.setColor(context.getResources().getColor(R.color.lb_playback_media_row_highlight_color));
        return paint;
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight() / 2;
        this.c = height;
        int height2 = (height + height) - getHeight();
        float width = getWidth();
        float height3 = getHeight() + (height2 / 2);
        RectF rectF = this.b;
        rectF.set(0.0f, -r0, width, height3);
        float f = this.c;
        canvas.drawRoundRect(rectF, f, f, this.a);
    }

    public MediaRowFocusView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = new RectF();
        this.a = a(context);
    }

    public MediaRowFocusView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b = new RectF();
        this.a = a(context);
    }
}
