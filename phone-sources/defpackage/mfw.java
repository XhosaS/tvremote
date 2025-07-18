package defpackage;

import android.content.Context;
import android.view.SurfaceView;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mfw extends FrameLayout {
    protected float a;
    protected float b;
    public final SurfaceView c;
    public int d;
    public int e;
    final /* synthetic */ mfx f;
    private final Runnable g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mfw(mfx mfxVar, Context context, SurfaceView surfaceView) {
        super(context);
        this.f = mfxVar;
        this.d = -1;
        this.e = -1;
        this.c = surfaceView;
        this.g = new ljl(mfxVar, 17, null);
        surfaceView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        surfaceView.setVisibility(0);
        addView(surfaceView);
        surfaceView.setSecure(true);
    }

    public final void a() {
        b();
        requestLayout();
    }

    public final void b() {
        mfx mfxVar = this.f;
        meq meqVar = mfxVar.c;
        int i = meqVar.a;
        int i2 = meqVar.b;
        if (!mfxVar.i || i <= 0 || i2 <= 0) {
            this.c.getHolder().setSizeFromLayout();
        } else {
            this.c.getHolder().setFixedSize(i, i2);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        float f;
        int i3;
        int i4;
        mfx mfxVar = this.f;
        meq meqVar = mfxVar.c;
        int i5 = meqVar.a;
        int i6 = meqVar.b;
        int defaultSize = this.d;
        if (defaultSize == -1) {
            defaultSize = getDefaultSize(i5, i);
        }
        int defaultSize2 = this.e;
        if (defaultSize2 == -1) {
            defaultSize2 = getDefaultSize(i6, i2);
        }
        float f2 = 1.0f;
        if (i5 <= 0 || i6 <= 0) {
            f = 1.0f;
        } else {
            float f3 = defaultSize;
            float f4 = defaultSize2;
            float f5 = i5 / i6;
            float f6 = (f5 / (f3 / f4)) - 1.0f;
            if (f6 > 0.01f) {
                i4 = (i6 * defaultSize) / i5;
                i3 = defaultSize;
            } else {
                i3 = f6 < -0.01f ? (i5 * defaultSize2) / i6 : defaultSize;
                i4 = defaultSize2;
            }
            mfxVar.g = i3;
            mfxVar.h = i4;
            if (mfxVar.d) {
                if (i3 < defaultSize) {
                    defaultSize = i3 + ((mfxVar.e * (defaultSize - i3)) / 100);
                    mfxVar.g = defaultSize;
                    mfxVar.h = (int) (defaultSize / f5);
                    defaultSize2 = i4;
                    f = 1.0f;
                    f2 = i3 / f3;
                } else if (i4 < defaultSize2) {
                    defaultSize2 = i4 + ((mfxVar.e * (defaultSize2 - i4)) / 100);
                    mfxVar.h = defaultSize2;
                    mfxVar.g = (int) (defaultSize2 * f5);
                    f = i4 / f4;
                    defaultSize = i3;
                }
            }
            defaultSize2 = i4;
            defaultSize = i3;
            f = 1.0f;
        }
        if (this.a != f2 || this.b != f) {
            this.a = f2;
            this.b = f;
            if (mfxVar.j != null) {
                post(this.g);
            }
        }
        int iResolveSize = resolveSize(defaultSize, i);
        int iResolveSize2 = resolveSize(defaultSize2, i2);
        setMeasuredDimension(iResolveSize, iResolveSize2);
        this.c.measure(View.MeasureSpec.makeMeasureSpec(iResolveSize, 1073741824), View.MeasureSpec.makeMeasureSpec(iResolveSize2, 1073741824));
    }
}
