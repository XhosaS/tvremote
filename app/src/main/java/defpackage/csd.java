package defpackage;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class csd extends csa {
    private final PointF e;
    private final float[] f;
    private final PathMeasure g;
    private csc h;

    public csd(List list) {
        super(list);
        this.e = new PointF();
        this.f = new float[2];
        this.g = new PathMeasure();
    }

    @Override // defpackage.crt
    public final /* bridge */ /* synthetic */ Object f(cwz cwzVar, float f) {
        float f2;
        csc cscVar = (csc) cwzVar;
        Path path = cscVar.a;
        if (path == null) {
            return (PointF) cwzVar.b;
        }
        cxb cxbVar = this.d;
        if (cxbVar != null) {
            f2 = f;
            PointF pointF = (PointF) cxbVar.b(cscVar.g, cscVar.h.floatValue(), (PointF) cscVar.b, (PointF) cscVar.c, c(), f2, this.c);
            if (pointF != null) {
                return pointF;
            }
        } else {
            f2 = f;
        }
        if (this.h != cscVar) {
            this.g.setPath(path, false);
            this.h = cscVar;
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
