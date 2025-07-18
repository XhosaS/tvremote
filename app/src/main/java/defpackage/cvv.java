package defpackage;

import android.graphics.PointF;

/* compiled from: PG */
/* loaded from: classes.dex */
public class cvv implements cwh {
    public static final cvv a = new cvv();

    private cvv() {
    }

    @Override // defpackage.cwh
    public final /* bridge */ /* synthetic */ Object a(cwm cwmVar, float f) {
        int iQ = cwmVar.q();
        if (iQ == 1) {
            return cvo.c(cwmVar, f);
        }
        if (iQ == 3) {
            return cvo.c(cwmVar, f);
        }
        if (iQ != 7) {
            throw new IllegalArgumentException("Cannot convert json to point. Next token is ".concat(cwl.a(iQ)));
        }
        PointF pointF = new PointF(((float) cwmVar.a()) * f, ((float) cwmVar.a()) * f);
        while (cwmVar.o()) {
            cwmVar.n();
        }
        return pointF;
    }
}
