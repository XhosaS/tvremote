package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.play.layout.ForegroundRelativeLayout;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class nbp extends ForegroundRelativeLayout {
    protected ImageView a;
    private final int b;
    private float c;

    public nbp(Context context) {
        this(context, null, 0);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.a = (ImageView) findViewById(R.id.thumbnail_frame);
        cww.y(this);
    }

    @Override // android.widget.RelativeLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        ImageView imageView = this.a;
        if (imageView != null) {
            int i3 = this.b;
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            if (i3 != 1) {
                if (i3 == 2) {
                    if (layoutParams.height == -1) {
                        int size = View.MeasureSpec.getSize(i2) - (getPaddingTop() + getPaddingBottom());
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.a.getLayoutParams();
                        int i4 = (size - marginLayoutParams.topMargin) - marginLayoutParams.bottomMargin;
                        marginLayoutParams.height = i4;
                        marginLayoutParams.width = (int) (i4 * this.c);
                    } else {
                        layoutParams.width = (int) (layoutParams.height * this.c);
                    }
                }
            } else if (layoutParams.width == -1) {
                int size2 = View.MeasureSpec.getSize(i) - (getPaddingLeft() + getPaddingRight());
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.a.getLayoutParams();
                int i5 = (size2 - marginLayoutParams2.leftMargin) - marginLayoutParams2.rightMargin;
                marginLayoutParams2.width = i5;
                marginLayoutParams2.height = (int) (i5 / this.c);
            } else {
                layoutParams.height = (int) (layoutParams.width / this.c);
            }
        }
        super.onMeasure(i, i2);
    }

    public nbp(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public nbp(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, mui.a);
        float f = typedArrayObtainStyledAttributes.getFloat(0, 0.6939625f);
        if (f != this.c) {
            this.c = f;
            requestLayout();
        }
        this.b = typedArrayObtainStyledAttributes.getInteger(1, 3);
        typedArrayObtainStyledAttributes.recycle();
    }
}
