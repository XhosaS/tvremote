package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class cqx implements cqy, crg, cro, cst {
    public final List a;
    private final Matrix b;
    private final Path c;
    private final RectF d;
    private final String e;
    private final boolean f;
    private final cqd g;
    private List h;
    private csk i;

    public cqx(cqd cqdVar, cug cugVar, ctz ctzVar, cph cphVar) {
        cti ctiVar;
        String str = ctzVar.a;
        boolean z = ctzVar.c;
        List list = ctzVar.b;
        ArrayList arrayList = new ArrayList(list.size());
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            cqw cqwVarA = ((ctn) list.get(i2)).a(cqdVar, cphVar, cugVar);
            if (cqwVarA != null) {
                arrayList.add(cqwVarA);
            }
        }
        List list2 = ctzVar.b;
        while (true) {
            if (i >= list2.size()) {
                ctiVar = null;
                break;
            }
            ctn ctnVar = (ctn) list2.get(i);
            if (ctnVar instanceof cti) {
                ctiVar = (cti) ctnVar;
                break;
            }
            i++;
        }
        this(cqdVar, cugVar, str, z, arrayList, ctiVar);
    }

    @Override // defpackage.cst
    public final void a(Object obj, cxb cxbVar) {
        csk cskVar = this.i;
        if (cskVar != null) {
            cskVar.e(obj, cxbVar);
        }
    }

    @Override // defpackage.cqy
    public final void b(Canvas canvas, Matrix matrix, int i) {
        if (this.f) {
            return;
        }
        Matrix matrix2 = this.b;
        matrix2.set(matrix);
        csk cskVar = this.i;
        if (cskVar != null) {
            matrix2.preConcat(cskVar.a());
            i = (int) (((((this.i.e == null ? 100 : ((Integer) r6.e()).intValue()) / 100.0f) * i) / 255.0f) * 255.0f);
        }
        List list = this.a;
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            Object obj = list.get(size);
            if (obj instanceof cqy) {
                ((cqy) obj).b(canvas, matrix2, i);
            }
        }
    }

    @Override // defpackage.cqy
    public final void c(RectF rectF, Matrix matrix, boolean z) {
        Matrix matrix2 = this.b;
        matrix2.set(matrix);
        csk cskVar = this.i;
        if (cskVar != null) {
            matrix2.preConcat(cskVar.a());
        }
        RectF rectF2 = this.d;
        rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
        List list = this.a;
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            cqw cqwVar = (cqw) list.get(size);
            if (cqwVar instanceof cqy) {
                ((cqy) cqwVar).c(rectF2, matrix2, z);
                rectF.union(rectF2);
            }
        }
    }

    @Override // defpackage.cro
    public final void d() {
        this.g.invalidateSelf();
    }

    @Override // defpackage.cst
    public final void e(css cssVar, int i, List list, css cssVar2) {
        String str = this.e;
        if (!cssVar.e(str, i) && !"__container".equals(str)) {
            return;
        }
        if (!"__container".equals(str)) {
            cssVar2 = cssVar2.b(str);
            if (cssVar.d(str, i)) {
                list.add(cssVar2.c(this));
            }
        }
        if (!cssVar.f(str, i)) {
            return;
        }
        int iA = i + cssVar.a(str, i);
        int i2 = 0;
        while (true) {
            List list2 = this.a;
            if (i2 >= list2.size()) {
                return;
            }
            cqw cqwVar = (cqw) list2.get(i2);
            if (cqwVar instanceof cst) {
                ((cst) cqwVar).e(cssVar, iA, list, cssVar2);
            }
            i2++;
        }
    }

    @Override // defpackage.cqw
    public final void f(List list, List list2) {
        List list3 = this.a;
        ArrayList arrayList = new ArrayList(list.size() + list3.size());
        arrayList.addAll(list);
        int size = list3.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            cqw cqwVar = (cqw) list3.get(size);
            cqwVar.f(arrayList, list3.subList(0, size));
            arrayList.add(cqwVar);
        }
    }

    @Override // defpackage.cqw
    public final String g() {
        throw null;
    }

    final Matrix h() {
        csk cskVar = this.i;
        if (cskVar != null) {
            return cskVar.a();
        }
        Matrix matrix = this.b;
        matrix.reset();
        return matrix;
    }

    @Override // defpackage.crg
    public final Path i() {
        Matrix matrix = this.b;
        matrix.reset();
        csk cskVar = this.i;
        if (cskVar != null) {
            matrix.set(cskVar.a());
        }
        Path path = this.c;
        path.reset();
        if (!this.f) {
            List list = this.a;
            int size = list.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                cqw cqwVar = (cqw) list.get(size);
                if (cqwVar instanceof crg) {
                    path.addPath(((crg) cqwVar).i(), matrix);
                }
            }
        }
        return path;
    }

    final List j() {
        if (this.h == null) {
            this.h = new ArrayList();
            int i = 0;
            while (true) {
                List list = this.a;
                if (i >= list.size()) {
                    break;
                }
                cqw cqwVar = (cqw) list.get(i);
                if (cqwVar instanceof crg) {
                    this.h.add((crg) cqwVar);
                }
                i++;
            }
        }
        return this.h;
    }

    public cqx(cqd cqdVar, cug cugVar, String str, boolean z, List list, cti ctiVar) {
        new cqs();
        new RectF();
        this.b = new Matrix();
        this.c = new Path();
        this.d = new RectF();
        this.e = str;
        this.g = cqdVar;
        this.f = z;
        this.a = list;
        if (ctiVar != null) {
            csk cskVar = new csk(ctiVar);
            this.i = cskVar;
            cskVar.c(cugVar);
            this.i.d(this);
        }
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            cqw cqwVar = (cqw) list.get(size);
            if (cqwVar instanceof crd) {
                arrayList.add((crd) cqwVar);
            }
        }
        int size2 = arrayList.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                return;
            } else {
                ((crd) arrayList.get(size2)).h(list.listIterator(list.size()));
            }
        }
    }
}
