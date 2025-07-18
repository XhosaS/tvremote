package defpackage;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class cqz implements crg, cro, cre {
    private final String b;
    private final cqd c;
    private final crt d;
    private final crt e;
    private final ctm f;
    private boolean h;
    private final Path a = new Path();
    private final cqv g = new cqv();

    public cqz(cqd cqdVar, cug cugVar, ctm ctmVar) {
        this.b = ctmVar.a;
        this.c = cqdVar;
        crt crtVarA = ctmVar.c.a();
        this.d = crtVarA;
        crt crtVarA2 = ctmVar.b.a();
        this.e = crtVarA2;
        this.f = ctmVar;
        cugVar.k(crtVarA);
        cugVar.k(crtVarA2);
        crtVarA.h(this);
        crtVarA2.h(this);
    }

    @Override // defpackage.cst
    public final void a(Object obj, cxb cxbVar) {
        crt crtVar;
        if (obj == cqi.k) {
            crtVar = this.d;
        } else if (obj != cqi.n) {
            return;
        } else {
            crtVar = this.e;
        }
        crtVar.d = cxbVar;
    }

    @Override // defpackage.cro
    public final void d() {
        this.h = false;
        this.c.invalidateSelf();
    }

    @Override // defpackage.cst
    public final void e(css cssVar, int i, List list, css cssVar2) {
        cwt.c(cssVar, i, list, cssVar2, this);
    }

    @Override // defpackage.cqw
    public final void f(List list, List list2) {
        for (int i = 0; i < list.size(); i++) {
            cqw cqwVar = (cqw) list.get(i);
            if (cqwVar instanceof crn) {
                crn crnVar = (crn) cqwVar;
                if (crnVar.e == 1) {
                    this.g.a(crnVar);
                    crnVar.a(this);
                }
            }
        }
    }

    @Override // defpackage.cqw
    public final String g() {
        return this.b;
    }

    @Override // defpackage.crg
    public final Path i() {
        if (this.h) {
            return this.a;
        }
        Path path = this.a;
        path.reset();
        ctm ctmVar = this.f;
        if (ctmVar.e) {
            this.h = true;
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
        if (ctmVar.d) {
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
        this.g.b(path);
        this.h = true;
        return path;
    }
}
