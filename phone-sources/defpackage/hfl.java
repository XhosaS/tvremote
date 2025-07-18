package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hfl extends hfk {
    public boolean j;
    private hdg k;
    private final List l;
    private final RectF m;
    private final RectF n;

    public hfl(hbv hbvVar, hfn hfnVar, List list, hbk hbkVar) {
        hfk hfkVar;
        hfk hflVar;
        String str;
        super(hbvVar, hfnVar);
        this.l = new ArrayList();
        this.m = new RectF();
        this.n = new RectF();
        new Paint();
        this.j = true;
        hei heiVar = hfnVar.q;
        if (heiVar != null) {
            hdg hdgVarA = heiVar.a();
            this.k = hdgVarA;
            i(hdgVarA);
            this.k.h(this);
        } else {
            this.k = null;
        }
        jn jnVar = new jn(hbkVar.f.size());
        int size = list.size() - 1;
        hfk hfkVar2 = null;
        while (true) {
            if (size < 0) {
                for (int i = 0; i < jnVar.b(); i++) {
                    hfk hfkVar3 = (hfk) jnVar.e(jnVar.c(i));
                    if (hfkVar3 != null && (hfkVar = (hfk) jnVar.e(hfkVar3.c.e)) != null) {
                        hfkVar3.f = hfkVar;
                    }
                }
                return;
            }
            hfn hfnVar2 = (hfn) list.get(size);
            int i2 = hfnVar2.t;
            int i3 = i2 - 1;
            if (i2 == 0) {
                throw null;
            }
            if (i3 == 0) {
                hflVar = new hfl(hbvVar, hfnVar2, (List) hbkVar.a.get(hfnVar2.f), hbkVar);
            } else if (i3 == 1) {
                hflVar = new hfq(hbvVar, hfnVar2);
            } else if (i3 == 2) {
                hflVar = new hfm(hbvVar, hfnVar2);
            } else if (i3 == 3) {
                hflVar = new hfo(hbvVar, hfnVar2);
            } else if (i3 == 4) {
                hflVar = new hfp(hbvVar, hfnVar2, this, hbkVar);
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
                hhk.a("Unknown layer type ".concat(str));
                hflVar = null;
            } else {
                hflVar = new hft(hbvVar, hfnVar2);
            }
            if (hflVar != null) {
                jnVar.j(hflVar.c.d, hflVar);
                if (hfkVar2 != null) {
                    hfkVar2.e = hflVar;
                    hfkVar2 = null;
                } else {
                    this.l.add(0, hflVar);
                    int i4 = hfnVar2.u;
                    int i5 = i4 - 1;
                    if (i4 == 0) {
                        throw null;
                    }
                    if (i5 == 1 || i5 == 2) {
                        hfkVar2 = hflVar;
                    }
                }
            }
            size--;
        }
    }

    @Override // defpackage.hfk, defpackage.hee
    public final void a(Object obj, hhu hhuVar) {
        super.a(obj, hhuVar);
        if (obj == hca.E) {
            hdx hdxVar = new hdx(hhuVar);
            this.k = hdxVar;
            hdxVar.h(this);
            i(this.k);
        }
    }

    @Override // defpackage.hfk, defpackage.hcl
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
            ((hfk) list.get(size)).c(rectF2, this.a, true);
            rectF.union(rectF2);
        }
    }

    @Override // defpackage.hfk
    public final void j(Canvas canvas, Matrix matrix, int i) {
        hfn hfnVar = this.c;
        float f = hfnVar.n;
        RectF rectF = this.n;
        rectF.set(0.0f, 0.0f, f, hfnVar.o);
        matrix.mapRect(rectF);
        canvas.save();
        List list = this.l;
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                canvas.restore();
                hbd.a();
                return;
            } else if ((!this.j && "__container".equals(hfnVar.c)) || rectF.isEmpty() || canvas.clipRect(rectF)) {
                ((hfk) list.get(size)).b(canvas, matrix, i);
            }
        }
    }

    @Override // defpackage.hfk
    public final void l(hed hedVar, int i, List list, hed hedVar2) {
        int i2 = 0;
        while (true) {
            List list2 = this.l;
            if (i2 >= list2.size()) {
                return;
            }
            ((hfk) list2.get(i2)).e(hedVar, i, list, hedVar2);
            i2++;
        }
    }

    @Override // defpackage.hfk
    public final void m(float f) {
        super.m(f);
        if (this.k != null) {
            float fB = this.b.a.b() + 0.01f;
            hbk hbkVar = this.c.b;
            f = ((((Float) this.k.e()).floatValue() * hbkVar.j) - hbkVar.h) / fB;
        }
        if (this.k == null) {
            hfn hfnVar = this.c;
            f -= hfnVar.m / hfnVar.b.b();
        }
        hfn hfnVar2 = this.c;
        float f2 = hfnVar2.l;
        if (f2 != 0.0f && !"__container".equals(hfnVar2.c)) {
            f /= f2;
        }
        List list = this.l;
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((hfk) list.get(size)).m(f);
            }
        }
    }
}
