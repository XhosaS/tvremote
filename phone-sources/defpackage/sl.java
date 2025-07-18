package defpackage;

import android.graphics.Canvas;
import android.graphics.RenderNode;
import android.widget.EdgeEffect;

/* compiled from: PG */
/* loaded from: classes.dex */
final class sl extends bxw implements byc {
    private final qj a;
    private final re b;
    private RenderNode c;

    public sl(bxv bxvVar, qj qjVar, re reVar) {
        this.a = qjVar;
        this.b = reVar;
        O(bxvVar);
    }

    private final RenderNode e() {
        RenderNode renderNode = this.c;
        if (renderNode != null) {
            return renderNode;
        }
        RenderNode renderNode2 = new RenderNode("AndroidEdgeEffectOverscrollEffect");
        this.c = renderNode2;
        return renderNode2;
    }

    private static final boolean f(float f, EdgeEffect edgeEffect, Canvas canvas) {
        if (f == 0.0f) {
            return edgeEffect.draw(canvas);
        }
        int iSave = canvas.save();
        canvas.rotate(f);
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    private static final boolean g(EdgeEffect edgeEffect, Canvas canvas) {
        return f(180.0f, edgeEffect, canvas);
    }

    private static final boolean h(EdgeEffect edgeEffect, Canvas canvas) {
        return f(270.0f, edgeEffect, canvas);
    }

    private static final boolean i(EdgeEffect edgeEffect, Canvas canvas) {
        return f(90.0f, edgeEffect, canvas);
    }

    private static final boolean l(EdgeEffect edgeEffect, Canvas canvas) {
        return f(0.0f, edgeEffect, canvas);
    }

    /* JADX WARN: Removed duplicated region for block: B:87:0x0193 A[PHI: r15
  0x0193: PHI (r15v2 boolean) = (r15v1 boolean), (r15v12 boolean) binds: [B:77:0x0161, B:85:0x0177] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.byc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void bU(defpackage.byu r22) {
        /*
            Method dump skipped, instructions count: 737
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sl.bU(byu):void");
    }

    @Override // defpackage.byc
    public final /* synthetic */ void bW() {
    }
}
