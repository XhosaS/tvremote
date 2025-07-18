package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.katniss.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public class bap extends FrameLayout {
    public static final /* synthetic */ int f = 0;
    private static final Rect g = new Rect();
    public boolean a;
    public View b;
    public boolean c;
    public int d;
    int e;
    private Object h;
    private Paint i;

    public bap(Context context, int i, boolean z, float f2, float f3, int i2) {
        super(context);
        this.d = 1;
        if (this.a) {
            throw new IllegalStateException();
        }
        this.a = true;
        this.c = i2 > 0;
        this.d = i;
        if (i == 2) {
            setLayoutMode(1);
            LayoutInflater.from(getContext()).inflate(R.layout.lb_shadow, (ViewGroup) this, true);
            baw bawVar = new baw();
            bawVar.a = findViewById(R.id.lb_shadow_normal);
            bawVar.b = findViewById(R.id.lb_shadow_focused);
            this.h = bawVar;
        } else if (i == 3) {
            this.h = bao.a(this, f2, f3, i2);
        }
        if (!z) {
            setWillNotDraw(true);
            this.i = null;
            return;
        }
        setWillNotDraw(false);
        this.e = 0;
        Paint paint = new Paint();
        this.i = paint;
        paint.setColor(this.e);
        this.i.setStyle(Paint.Style.FILL);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.i == null || this.e == 0) {
            return;
        }
        canvas.drawRect(this.b.getLeft(), this.b.getTop(), this.b.getRight(), this.b.getBottom(), this.i);
    }

    public int getShadowType() {
        return this.d;
    }

    public View getWrappedView() {
        return this.b;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View view;
        super.onLayout(z, i, i2, i3, i4);
        if (!z || (view = this.b) == null) {
            return;
        }
        Rect rect = g;
        rect.left = (int) view.getPivotX();
        rect.top = (int) this.b.getPivotY();
        offsetDescendantRectToMyCoords(this.b, rect);
        setPivotX(rect.left);
        setPivotY(rect.top);
    }

    public void setOverlayColor(int i) {
        Paint paint = this.i;
        if (paint == null || i == this.e) {
            return;
        }
        this.e = i;
        paint.setColor(i);
        invalidate();
    }

    public void setShadowFocusLevel(float f2) {
        Object obj = this.h;
        if (obj != null) {
            int i = this.d;
            if (f2 < 0.0f) {
                f2 = 0.0f;
            } else if (f2 > 1.0f) {
                f2 = 1.0f;
            }
            if (i == 2) {
                baw bawVar = (baw) obj;
                bawVar.a.setAlpha(1.0f - f2);
                bawVar.b.setAlpha(f2);
            } else {
                if (i != 3) {
                    return;
                }
                int i2 = bao.b;
                ban banVar = (ban) obj;
                View view = banVar.a;
                float f3 = banVar.b;
                view.setZ(f3 + (f2 * (banVar.c - f3)));
            }
        }
    }
}
