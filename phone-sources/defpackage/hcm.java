package defpackage;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hcm implements hct, hdb, hcr {
    private final String b;
    private final hbv c;
    private final hdg d;
    private final hdg e;
    private final heu f;
    private boolean g;
    private final Path a = new Path();
    private final hfw h = new hfw((byte[]) null);

    public hcm(hbv hbvVar, hfk hfkVar, heu heuVar) {
        this.b = heuVar.a;
        this.c = hbvVar;
        hdg hdgVarA = heuVar.c.a();
        this.d = hdgVarA;
        hdg hdgVarA2 = heuVar.b.a();
        this.e = hdgVarA2;
        this.f = heuVar;
        hfkVar.i(hdgVarA);
        hfkVar.i(hdgVarA2);
        hdgVarA.h(this);
        hdgVarA2.h(this);
    }

    @Override // defpackage.hee
    public final void a(Object obj, hhu hhuVar) {
        hdg hdgVar;
        if (obj == hca.k) {
            hdgVar = this.d;
        } else if (obj != hca.n) {
            return;
        } else {
            hdgVar = this.e;
        }
        hdgVar.d = hhuVar;
    }

    @Override // defpackage.hdb
    public final void d() {
        this.g = false;
        this.c.invalidateSelf();
    }

    @Override // defpackage.hee
    public final void e(hed hedVar, int i, List list, hed hedVar2) {
        hhm.d(hedVar, i, list, hedVar2, this);
    }

    @Override // defpackage.hcj
    public final void f(List list, List list2) {
        for (int i = 0; i < list.size(); i++) {
            hcj hcjVar = (hcj) list.get(i);
            if (hcjVar instanceof hda) {
                hda hdaVar = (hda) hcjVar;
                if (hdaVar.e == 1) {
                    this.h.d(hdaVar);
                    hdaVar.a(this);
                }
            }
        }
    }

    @Override // defpackage.hcj
    public final String g() {
        return this.b;
    }

    @Override // defpackage.hct
    public final Path i() {
        if (this.g) {
            return this.a;
        }
        Path path = this.a;
        path.reset();
        heu heuVar = this.f;
        if (heuVar.e) {
            this.g = true;
            return path;
        }
        PointF pointF = (PointF) this.d.e();
        float f = pointF.x / 2.0f;
        float f2 = pointF.y / 2.0f;
        path.reset();
        float f3 = f2 * 0.55228f;
        float f4 = -f;
        float f5 = -f3;
        float f6 = f3 + 0.0f;
        float f7 = 0.55228f * f;
        float f8 = -f7;
        float f9 = f7 + 0.0f;
        float f10 = -f2;
        if (heuVar.d) {
            path.moveTo(0.0f, f10);
            path.cubicTo(f8, f10, f4, f5, f4, 0.0f);
            path.cubicTo(f4, f6, f8, f2, 0.0f, f2);
            path.cubicTo(f9, f2, f, f6, f, 0.0f);
            path.cubicTo(f, f5, f9, f10, 0.0f, f10);
        } else {
            path.moveTo(0.0f, f10);
            path.cubicTo(f9, f10, f, f5, f, 0.0f);
            path.cubicTo(f, f6, f9, f2, 0.0f, f2);
            path.cubicTo(f8, f2, f4, f6, f4, 0.0f);
            path.cubicTo(f4, f5, f8, f10, 0.0f, f10);
        }
        PointF pointF2 = (PointF) this.e.e();
        path.offset(pointF2.x, pointF2.y);
        path.close();
        this.h.e(path);
        this.g = true;
        return path;
    }
}
