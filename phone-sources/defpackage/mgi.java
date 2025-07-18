package defpackage;

import android.graphics.RectF;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class mgi extends mgm {
    @Override // defpackage.mgm
    protected final float a(mgl mglVar, mgl mglVar2) {
        RectF rectF = mglVar.l;
        float fWidth = rectF.width() * rectF.height();
        RectF rectF2 = mglVar2.l;
        return fWidth - (rectF2.width() * rectF2.height());
    }
}
