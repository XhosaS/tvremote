package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class tgr extends RelativeLayout {
    private final int a;
    private final Paint b;

    public tgr(Context context) {
        this(context, null, 0);
    }

    public tgr(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public tgr(Context context, AttributeSet attributeSet, int i) throws Resources.NotFoundException {
        super(context, attributeSet, i);
        setWillNotDraw(false);
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.play_hairline_separator_thickness);
        this.a = dimensionPixelSize;
        Paint paint = new Paint();
        this.b = paint;
        paint.setColor(resources.getColor(R.color.play_reason_separator));
        paint.setStrokeWidth(dimensionPixelSize);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, tdk.j);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(3, 0);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(2, 0);
        typedArrayObtainStyledAttributes.recycle();
    }
}
