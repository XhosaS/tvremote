package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hfo extends hfk {
    public hfo(hbv hbvVar, hfn hfnVar) {
        super(hbvVar, hfnVar);
    }

    @Override // defpackage.hfk, defpackage.hcl
    public final void c(RectF rectF, Matrix matrix, boolean z) {
        super.c(rectF, matrix, z);
        rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
    }

    @Override // defpackage.hfk
    public final void j(Canvas canvas, Matrix matrix, int i) {
    }
}
