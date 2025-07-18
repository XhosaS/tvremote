package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public class crj implements cqy, crg, crd, cro, cre {
    private final Matrix a = new Matrix();
    private final Path b = new Path();
    private final cqd c;
    private final cug d;
    private final String e;
    private final boolean f;
    private final crt g;
    private final crt h;
    private final csk i;
    private cqx j;

    public crj(cqd cqdVar, cug cugVar, ctv ctvVar) {
        this.c = cqdVar;
        this.d = cugVar;
        this.e = ctvVar.a;
        this.f = ctvVar.e;
        crt crtVarA = ctvVar.b.a();
        this.g = crtVarA;
        cugVar.k(crtVarA);
        crtVarA.h(this);
        crt crtVarA2 = ctvVar.c.a();
        this.h = crtVarA2;
        cugVar.k(crtVarA2);
        crtVarA2.h(this);
        csk cskVar = new csk(ctvVar.d);
        this.i = cskVar;
        cskVar.c(cugVar);
        cskVar.d(this);
    }

    @Override // defpackage.cst
    public final void a(Object obj, cxb cxbVar) {
        crt crtVar;
        if (this.i.e(obj, cxbVar)) {
            return;
        }
        if (obj == cqi.u) {
            crtVar = this.g;
        } else if (obj != cqi.v) {
            return;
        } else {
            crtVar = this.h;
        }
        crtVar.d = cxbVar;
    }

    @Override // defpackage.cqy
    public final void b(Canvas canvas, Matrix matrix, int i) {
        float fFloatValue = ((Float) this.g.e()).floatValue();
        float fFloatValue2 = ((Float) this.h.e()).floatValue();
        csk cskVar = this.i;
        float fFloatValue3 = ((Float) cskVar.h.e()).floatValue() / 100.0f;
        float fFloatValue4 = ((Float) cskVar.i.e()).floatValue() / 100.0f;
        int i2 = (int) fFloatValue;
        while (true) {
            i2--;
            if (i2 < 0) {
                return;
            }
            Matrix matrix2 = this.a;
            matrix2.set(matrix);
            float f = i2;
            matrix2.preConcat(cskVar.b(f + fFloatValue2));
            PointF pointF = cwt.a;
            this.j.b(canvas, matrix2, (int) (i * (((f / fFloatValue) * (fFloatValue4 - fFloatValue3)) + fFloatValue3)));
        }
    }

    @Override // defpackage.cqy
    public final void c(RectF rectF, Matrix matrix, boolean z) {
        this.j.c(rectF, matrix, z);
    }

    @Override // defpackage.cro
    public final void d() {
        this.c.invalidateSelf();
    }

    @Override // defpackage.cst
    public final void e(css cssVar, int i, List list, css cssVar2) {
        cwt.c(cssVar, i, list, cssVar2, this);
        for (int i2 = 0; i2 < this.j.a.size(); i2++) {
            cqw cqwVar = (cqw) this.j.a.get(i2);
            if (cqwVar instanceof cre) {
                cwt.c(cssVar, i, list, cssVar2, (cre) cqwVar);
            }
        }
    }

    @Override // defpackage.cqw
    public final void f(List list, List list2) {
        this.j.f(list, list2);
    }

    @Override // defpackage.cqw
    public final String g() {
        return this.e;
    }

    @Override // defpackage.crd
    public final void h(ListIterator listIterator) {
        if (this.j == null) {
            while (listIterator.hasPrevious() && listIterator.previous() != this) {
            }
            ArrayList arrayList = new ArrayList();
            while (listIterator.hasPrevious()) {
                arrayList.add((cqw) listIterator.previous());
                listIterator.remove();
            }
            Collections.reverse(arrayList);
            this.j = new cqx(this.c, this.d, "Repeater", this.f, arrayList, null);
        }
    }

    @Override // defpackage.crg
    public final Path i() {
        Path pathI = this.j.i();
        Path path = this.b;
        path.reset();
        float fFloatValue = ((Float) this.g.e()).floatValue();
        float fFloatValue2 = ((Float) this.h.e()).floatValue();
        int i = (int) fFloatValue;
        while (true) {
            i--;
            if (i < 0) {
                return path;
            }
            Matrix matrix = this.a;
            matrix.set(this.i.b(i + fFloatValue2));
            path.addPath(pathI, matrix);
        }
    }
}
