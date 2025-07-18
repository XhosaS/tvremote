package androidx.leanback.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;
import defpackage.atk;

/* compiled from: PG */
/* loaded from: classes.dex */
class ResizingTextView extends TextView {
    private int a;
    private int b;
    private boolean c;
    private int d;
    private int e;
    private boolean f;
    private int g;
    private float h;
    private int i;
    private int j;

    public ResizingTextView(Context context) {
        this(context, null);
    }

    private final void a(int i, int i2) {
        if (isPaddingRelative()) {
            setPaddingRelative(getPaddingStart(), i, getPaddingEnd(), i2);
        } else {
            setPadding(getPaddingLeft(), i, getPaddingRight(), i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c5  */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void onMeasure(int r6, int r7) {
        /*
            Method dump skipped, instructions count: 230
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.leanback.widget.ResizingTextView.onMeasure(int, int):void");
    }

    public ResizingTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    public ResizingTextView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public ResizingTextView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        this.f = false;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, atk.h, i, i2);
        try {
            this.a = typedArrayObtainStyledAttributes.getInt(1, 1);
            this.b = typedArrayObtainStyledAttributes.getDimensionPixelSize(4, -1);
            this.c = typedArrayObtainStyledAttributes.getBoolean(0, false);
            this.d = typedArrayObtainStyledAttributes.getDimensionPixelOffset(3, 0);
            this.e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(2, 0);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}
