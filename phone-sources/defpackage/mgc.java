package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mgc extends RelativeLayout {
    public final mfx a;
    public mgb b;
    public final List c;
    private final ViewGroup d;
    private final View e;

    public mgc(Context context, SurfaceView surfaceView) {
        super(context);
        setFocusable(true);
        setDescendantFocusability(262144);
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        mfx mfxVar = new mfx(context, surfaceView);
        this.a = mfxVar;
        this.c = new ArrayList();
        a.ah(this.e == null, "videoView has already been set");
        this.e = mfxVar;
        mfz mfzVar = new mfz(-2, -2, false);
        mfzVar.addRule(13);
        addView(mfxVar, 0, mfzVar);
        addView(frameLayout, new mfz(-1, -1, false));
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final mfz generateLayoutParams(AttributeSet attributeSet) {
        return new mfz(getContext(), attributeSet);
    }

    public final void b(mga... mgaVarArr) {
        for (mga mgaVar : mgaVarArr) {
            addView(mgaVar.getView(), mgaVar.generateLayoutParams());
            this.c.add(mgaVar);
            mgaVar.isAvodOverlay();
        }
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup
    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof mfz;
    }

    @Override // android.view.View
    protected final boolean fitSystemWindows(Rect rect) {
        if (this.b != null) {
            Rect rect2 = new Rect(rect);
            mrc mrcVar = (mrc) this.b;
            if (!rect2.equals(mrcVar.a)) {
                mrcVar.a = rect2;
                mrcVar.c();
            }
        }
        return super.fitSystemWindows(rect);
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup
    protected final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new mfz(-2, -2, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0041  */
    @Override // android.widget.RelativeLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void onMeasure(int r9, int r10) {
        /*
            r8 = this;
            int r0 = android.view.View.MeasureSpec.getMode(r9)
            int r1 = android.view.View.MeasureSpec.getMode(r10)
            int r2 = android.view.View.MeasureSpec.getSize(r9)
            int r3 = android.view.View.MeasureSpec.getSize(r10)
            r4 = 1073741824(0x40000000, float:2.0)
            if (r0 != r4) goto L18
            if (r1 != r4) goto L17
            goto L44
        L17:
            r0 = r4
        L18:
            r5 = 1071871164(0x3fe374bc, float:1.777)
            if (r0 == r4) goto L41
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != r6) goto L24
            if (r1 != 0) goto L24
            goto L41
        L24:
            if (r1 == r4) goto L3d
            if (r1 != r6) goto L2b
            if (r0 != 0) goto L2b
            goto L3d
        L2b:
            r7 = 0
            if (r0 != r6) goto L3a
            if (r1 != r6) goto L3a
            float r0 = (float) r3
            float r1 = (float) r2
            float r1 = r1 / r5
            int r6 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r6 >= 0) goto L38
            goto L3e
        L38:
            int r3 = (int) r1
            goto L44
        L3a:
            r2 = r7
            r3 = r2
            goto L44
        L3d:
            float r0 = (float) r3
        L3e:
            float r0 = r0 * r5
            int r2 = (int) r0
            goto L44
        L41:
            float r0 = (float) r2
            float r0 = r0 / r5
            int r3 = (int) r0
        L44:
            int r9 = resolveSize(r2, r9)
            int r10 = resolveSize(r3, r10)
            mfx r0 = r8.a
            mfw r0 = r0.a
            r0.d = r9
            r0.e = r10
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r4)
            int r10 = android.view.View.MeasureSpec.makeMeasureSpec(r10, r4)
            super.onMeasure(r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mgc.onMeasure(int, int):void");
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup
    protected final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new mfz(layoutParams);
    }
}
