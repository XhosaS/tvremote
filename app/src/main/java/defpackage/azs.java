package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.katniss.R;

/* compiled from: PG */
/* loaded from: classes.dex */
final class azs extends LinearLayout {
    public final ViewGroup a;
    public Drawable b;
    private boolean c;

    public azs(Context context) {
        super(context, null, 0);
        this.c = true;
        setOrientation(1);
        LayoutInflater.from(context).inflate(R.layout.lb_row_container, this);
        this.a = (ViewGroup) findViewById(R.id.lb_row_container_header_dock);
        setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.b;
        if (drawable != null) {
            if (this.c) {
                this.c = false;
                drawable.setBounds(0, 0, getWidth(), getHeight());
            }
            this.b.draw(canvas);
        }
    }

    @Override // android.view.View
    public final Drawable getForeground() {
        return this.b;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.c = true;
    }

    @Override // android.view.View
    public final void setForeground(Drawable drawable) {
        this.b = drawable;
        setWillNotDraw(drawable == null);
        invalidate();
    }
}
