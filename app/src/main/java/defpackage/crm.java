package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;

/* compiled from: PG */
/* loaded from: classes.dex */
public class crm extends cqu {
    private final cug d;
    private final String e;
    private final boolean f;
    private final crt g;
    private crt h;

    public crm(cqd cqdVar, cug cugVar, cud cudVar) {
        super(cqdVar, cugVar, cub.a(cudVar.i), cuc.a(cudVar.j), cudVar.g, cudVar.e, cudVar.f, cudVar.c, cudVar.b);
        this.d = cugVar;
        this.e = cudVar.a;
        this.f = cudVar.h;
        crt crtVarA = cudVar.d.a();
        this.g = crtVarA;
        crtVarA.h(this);
        cugVar.k(crtVarA);
    }

    @Override // defpackage.cqu, defpackage.cst
    public final void a(Object obj, cxb cxbVar) {
        super.a(obj, cxbVar);
        if (obj == cqi.b) {
            this.g.d = cxbVar;
            return;
        }
        if (obj == cqi.K) {
            crt crtVar = this.h;
            if (crtVar != null) {
                this.d.m(crtVar);
            }
            csl cslVar = new csl(cxbVar, null);
            this.h = cslVar;
            cslVar.h(this);
            this.d.k(this.g);
        }
    }

    @Override // defpackage.cqu, defpackage.cqy
    public final void b(Canvas canvas, Matrix matrix, int i) {
        if (this.f) {
            return;
        }
        Paint paint = this.b;
        paint.setColor(((cru) this.g).k());
        crt crtVar = this.h;
        if (crtVar != null) {
            paint.setColorFilter((ColorFilter) crtVar.e());
        }
        super.b(canvas, matrix, i);
    }

    @Override // defpackage.cqw
    public final String g() {
        return this.e;
    }
}
