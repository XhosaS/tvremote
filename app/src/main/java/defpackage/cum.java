package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class cum extends cug {
    private final cqx j;
    private final cuh k;

    public cum(cqd cqdVar, cuk cukVar, cuh cuhVar, cph cphVar) {
        super(cqdVar, cukVar);
        this.k = cuhVar;
        cqx cqxVar = new cqx(cqdVar, this, new ctz("__container", cukVar.a, false), cphVar);
        this.j = cqxVar;
        cqxVar.f(Collections.EMPTY_LIST, Collections.EMPTY_LIST);
    }

    @Override // defpackage.cug, defpackage.cqy
    public final void c(RectF rectF, Matrix matrix, boolean z) {
        super.c(rectF, matrix, z);
        this.j.c(rectF, this.a, z);
    }

    @Override // defpackage.cug
    public final ctl i() {
        ctl ctlVar = this.c.u;
        return ctlVar != null ? ctlVar : this.k.i();
    }

    @Override // defpackage.cug
    public final cvf j() {
        cvf cvfVar = this.c.v;
        return cvfVar != null ? cvfVar : this.k.j();
    }

    @Override // defpackage.cug
    public final void l(Canvas canvas, Matrix matrix, int i) {
        this.j.b(canvas, matrix, i);
    }

    @Override // defpackage.cug
    public final void n(css cssVar, int i, List list, css cssVar2) {
        this.j.e(cssVar, i, list, cssVar2);
    }
}
