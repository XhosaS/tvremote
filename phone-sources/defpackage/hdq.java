package defpackage;

import android.graphics.PointF;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hdq extends hdn {
    private final PointF e;

    public hdq(List list) {
        super(list);
        this.e = new PointF();
    }

    @Override // defpackage.hdg
    public final /* synthetic */ Object f(hhs hhsVar, float f) {
        return g(hhsVar, f, f, f);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.hdg
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public final PointF g(hhs hhsVar, float f, float f2, float f3) {
        Object obj;
        PointF pointF;
        Object obj2 = hhsVar.b;
        if (obj2 == null || (obj = hhsVar.c) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        PointF pointF2 = (PointF) obj2;
        PointF pointF3 = (PointF) obj;
        hhu hhuVar = this.d;
        if (hhuVar != null && (pointF = (PointF) hhuVar.b(hhsVar.g, hhsVar.h.floatValue(), pointF2, pointF3, f, c(), this.c)) != null) {
            return pointF;
        }
        PointF pointF4 = this.e;
        pointF4.set(pointF2.x + (f2 * (pointF3.x - pointF2.x)), pointF2.y + (f3 * (pointF3.y - pointF2.y)));
        return pointF4;
    }
}
