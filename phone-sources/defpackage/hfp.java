package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hfp extends hfk {
    private final hck j;
    private final hfl k;

    public hfp(hbv hbvVar, hfn hfnVar, hfl hflVar, hbk hbkVar) {
        super(hbvVar, hfnVar);
        this.k = hflVar;
        hck hckVar = new hck(hbvVar, this, new hff("__container", hfnVar.a, false), hbkVar);
        this.j = hckVar;
        hckVar.f(Collections.EMPTY_LIST, Collections.EMPTY_LIST);
    }

    @Override // defpackage.hfk, defpackage.hcl
    public final void c(RectF rectF, Matrix matrix, boolean z) {
        super.c(rectF, matrix, z);
        this.j.c(rectF, this.a, z);
    }

    @Override // defpackage.hfk
    public final void j(Canvas canvas, Matrix matrix, int i) {
        this.j.b(canvas, matrix, i);
    }

    @Override // defpackage.hfk
    public final void l(hed hedVar, int i, List list, hed hedVar2) {
        this.j.e(hedVar, i, list, hedVar2);
    }

    @Override // defpackage.hfk
    public final hfw q() {
        hfw hfwVarQ = super.q();
        return hfwVarQ != null ? hfwVarQ : this.k.q();
    }

    @Override // defpackage.hfk
    public final gag r() {
        gag gagVarR = super.r();
        return gagVarR != null ? gagVarR : this.k.r();
    }
}
