package defpackage;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hdp extends hdn {
    private final PointF e;
    private final float[] f;
    private final PathMeasure g;
    private hdo h;

    public hdp(List list) {
        super(list);
        this.e = new PointF();
        this.f = new float[2];
        this.g = new PathMeasure();
    }

    @Override // defpackage.hdg
    public final /* bridge */ /* synthetic */ Object f(hhs hhsVar, float f) {
        float f2;
        hdo hdoVar = (hdo) hhsVar;
        Path path = hdoVar.a;
        if (path == null) {
            return (PointF) hhsVar.b;
        }
        hhu hhuVar = this.d;
        if (hhuVar != null) {
            f2 = f;
            PointF pointF = (PointF) hhuVar.b(hdoVar.g, hdoVar.h.floatValue(), (PointF) hdoVar.b, (PointF) hdoVar.c, c(), f2, this.c);
            if (pointF != null) {
                return pointF;
            }
        } else {
            f2 = f;
        }
        if (this.h != hdoVar) {
            this.g.setPath(path, false);
            this.h = hdoVar;
        }
        PathMeasure pathMeasure = this.g;
        float length = pathMeasure.getLength() * f2;
        float[] fArr = this.f;
        pathMeasure.getPosTan(length, fArr, null);
        PointF pointF2 = this.e;
        pointF2.set(fArr[0], fArr[1]);
        return pointF2;
    }
}
