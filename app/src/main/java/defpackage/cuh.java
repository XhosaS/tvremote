package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class cuh extends cug {
    public boolean j;
    private crt k;
    private final List l;
    private final RectF m;
    private final RectF n;

    public cuh(cqd cqdVar, cuk cukVar, List list, cph cphVar) {
        cug cugVar;
        cug cuhVar;
        String str;
        super(cqdVar, cukVar);
        this.l = new ArrayList();
        this.m = new RectF();
        this.n = new RectF();
        new Paint();
        this.j = true;
        csy csyVar = cukVar.r;
        if (csyVar != null) {
            crt crtVarA = csyVar.a();
            this.k = crtVarA;
            k(crtVarA);
            this.k.h(this);
        } else {
            this.k = null;
        }
        wr wrVar = new wr(cphVar.g.size());
        int size = list.size() - 1;
        cug cugVar2 = null;
        while (true) {
            if (size < 0) {
                for (int i = 0; i < wrVar.c(); i++) {
                    cug cugVar3 = (cug) wrVar.e(wrVar.d(i));
                    if (cugVar3 != null && (cugVar = (cug) wrVar.e(cugVar3.c.e)) != null) {
                        cugVar3.f = cugVar;
                    }
                }
                return;
            }
            cuk cukVar2 = (cuk) list.get(size);
            int i2 = cukVar2.w;
            int i3 = i2 - 1;
            if (i2 == 0) {
                throw null;
            }
            if (i3 == 0) {
                cuhVar = new cuh(cqdVar, cukVar2, (List) cphVar.b.get(cukVar2.f), cphVar);
            } else if (i3 == 1) {
                cuhVar = new cun(cqdVar, cukVar2);
            } else if (i3 == 2) {
                cuhVar = new cui(cqdVar, cukVar2);
            } else if (i3 == 3) {
                cuhVar = new cul(cqdVar, cukVar2);
            } else if (i3 == 4) {
                cuhVar = new cum(cqdVar, cukVar2, this, cphVar);
            } else if (i3 != 5) {
                switch (i2) {
                    case 1:
                        str = "PRE_COMP";
                        break;
                    case 2:
                        str = "SOLID";
                        break;
                    case 3:
                        str = "IMAGE";
                        break;
                    case 4:
                        str = "NULL";
                        break;
                    case 5:
                        str = "SHAPE";
                        break;
                    case 6:
                        str = "TEXT";
                        break;
                    default:
                        str = "UNKNOWN";
                        break;
                }
                ((cwq) cwr.a).a("Unknown layer type ".concat(str), null);
                cuhVar = null;
            } else {
                cuhVar = new cur(cqdVar, cukVar2);
            }
            if (cuhVar != null) {
                wrVar.i(cuhVar.c.d, cuhVar);
                if (cugVar2 != null) {
                    cugVar2.e = cuhVar;
                    cugVar2 = null;
                } else {
                    this.l.add(0, cuhVar);
                    int i4 = cukVar2.x;
                    int i5 = i4 - 1;
                    if (i4 == 0) {
                        throw null;
                    }
                    if (i5 == 1 || i5 == 2) {
                        cugVar2 = cuhVar;
                    }
                }
            }
            size--;
        }
    }

    @Override // defpackage.cug, defpackage.cst
    public final void a(Object obj, cxb cxbVar) {
        this.g.e(obj, cxbVar);
        if (obj == cqi.E) {
            csl cslVar = new csl(cxbVar, null);
            this.k = cslVar;
            cslVar.h(this);
            k(this.k);
        }
    }

    @Override // defpackage.cug, defpackage.cqy
    public final void c(RectF rectF, Matrix matrix, boolean z) {
        super.c(rectF, matrix, z);
        List list = this.l;
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            RectF rectF2 = this.m;
            rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
            ((cug) list.get(size)).c(rectF2, this.a, true);
            rectF.union(rectF2);
        }
    }

    @Override // defpackage.cug
    public final void l(Canvas canvas, Matrix matrix, int i) throws Throwable {
        cuk cukVar = this.c;
        float f = cukVar.n;
        RectF rectF = this.n;
        rectF.set(0.0f, 0.0f, f, cukVar.o);
        matrix.mapRect(rectF);
        canvas.save();
        List list = this.l;
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                canvas.restore();
                coy.a();
                return;
            } else if ((!this.j && "__container".equals(cukVar.c)) || rectF.isEmpty() || canvas.clipRect(rectF)) {
                ((cug) list.get(size)).b(canvas, matrix, i);
            }
        }
    }

    @Override // defpackage.cug
    public final void n(css cssVar, int i, List list, css cssVar2) {
        int i2 = 0;
        while (true) {
            List list2 = this.l;
            if (i2 >= list2.size()) {
                return;
            }
            ((cug) list2.get(i2)).e(cssVar, i, list, cssVar2);
            i2++;
        }
    }

    @Override // defpackage.cug
    public final void o(float f) {
        super.o(f);
        crt crtVar = this.k;
        if (crtVar != null) {
            cph cphVar = this.b.a;
            float f2 = cphVar.j - cphVar.i;
            cph cphVar2 = this.c.b;
            f = ((((Float) crtVar.e()).floatValue() * cphVar2.k) - cphVar2.i) / (f2 + 0.01f);
        }
        if (this.k == null) {
            cuk cukVar = this.c;
            float f3 = cukVar.m;
            cph cphVar3 = cukVar.b;
            f -= f3 / (cphVar3.j - cphVar3.i);
        }
        cuk cukVar2 = this.c;
        float f4 = cukVar2.l;
        if (f4 != 0.0f && !"__container".equals(cukVar2.c)) {
            f /= f4;
        }
        List list = this.l;
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((cug) list.get(size)).o(f);
            }
        }
    }
}
