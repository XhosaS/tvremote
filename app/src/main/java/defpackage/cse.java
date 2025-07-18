package defpackage;

import android.graphics.PointF;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class cse extends csa {
    private final PointF e;

    public cse(List list) {
        super(list);
        this.e = new PointF();
    }

    @Override // defpackage.crt
    public final /* synthetic */ Object f(cwz cwzVar, float f) {
        return g(cwzVar, f, f, f);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.crt
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public final PointF g(cwz cwzVar, float f, float f2, float f3) {
        Object obj;
        PointF pointF;
        Object obj2 = cwzVar.b;
        if (obj2 == null || (obj = cwzVar.c) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        PointF pointF2 = (PointF) obj2;
        PointF pointF3 = (PointF) obj;
        cxb cxbVar = this.d;
        if (cxbVar != null && (pointF = (PointF) cxbVar.b(cwzVar.g, cwzVar.h.floatValue(), pointF2, pointF3, f, c(), this.c)) != null) {
            return pointF;
        }
        PointF pointF4 = this.e;
        pointF4.set(pointF2.x + (f2 * (pointF3.x - pointF2.x)), pointF2.y + (f3 * (pointF3.y - pointF2.y)));
        return pointF4;
    }
}
