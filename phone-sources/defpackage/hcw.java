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
public final class hcw implements hcl, hct, hcq, hdb, hcr {
    private final Matrix a = new Matrix();
    private final Path b = new Path();
    private final hbv c;
    private final hfk d;
    private final String e;
    private final boolean f;
    private final hdg g;
    private final hdg h;
    private final hdw i;
    private hck j;

    public hcw(hbv hbvVar, hfk hfkVar, hfb hfbVar) {
        this.c = hbvVar;
        this.d = hfkVar;
        this.e = hfbVar.a;
        this.f = hfbVar.e;
        hdg hdgVarA = hfbVar.b.a();
        this.g = hdgVarA;
        hfkVar.i(hdgVarA);
        hdgVarA.h(this);
        hdg hdgVarA2 = hfbVar.c.a();
        this.h = hdgVarA2;
        hfkVar.i(hdgVarA2);
        hdgVarA2.h(this);
        hdw hdwVar = new hdw(hfbVar.d);
        this.i = hdwVar;
        hdwVar.c(hfkVar);
        hdwVar.d(this);
    }

    @Override // defpackage.hee
    public final void a(Object obj, hhu hhuVar) {
        hdg hdgVar;
        if (this.i.e(obj, hhuVar)) {
            return;
        }
        if (obj == hca.u) {
            hdgVar = this.g;
        } else if (obj != hca.v) {
            return;
        } else {
            hdgVar = this.h;
        }
        hdgVar.d = hhuVar;
    }

    @Override // defpackage.hcl
    public final void b(Canvas canvas, Matrix matrix, int i) {
        float fFloatValue = ((Float) this.g.e()).floatValue();
        float fFloatValue2 = ((Float) this.h.e()).floatValue();
        hdw hdwVar = this.i;
        float fFloatValue3 = ((Float) hdwVar.h.e()).floatValue() / 100.0f;
        float fFloatValue4 = ((Float) hdwVar.i.e()).floatValue() / 100.0f;
        int i2 = (int) fFloatValue;
        while (true) {
            i2--;
            if (i2 < 0) {
                return;
            }
            Matrix matrix2 = this.a;
            matrix2.set(matrix);
            float f = i2;
            matrix2.preConcat(hdwVar.b(f + fFloatValue2));
            PointF pointF = hhm.a;
            this.j.b(canvas, matrix2, (int) (i * (((f / fFloatValue) * (fFloatValue4 - fFloatValue3)) + fFloatValue3)));
        }
    }

    @Override // defpackage.hcl
    public final void c(RectF rectF, Matrix matrix, boolean z) {
        this.j.c(rectF, matrix, z);
    }

    @Override // defpackage.hdb
    public final void d() {
        this.c.invalidateSelf();
    }

    @Override // defpackage.hee
    public final void e(hed hedVar, int i, List list, hed hedVar2) {
        hhm.d(hedVar, i, list, hedVar2, this);
        for (int i2 = 0; i2 < this.j.a.size(); i2++) {
            hcj hcjVar = (hcj) this.j.a.get(i2);
            if (hcjVar instanceof hcr) {
                hhm.d(hedVar, i, list, hedVar2, (hcr) hcjVar);
            }
        }
    }

    @Override // defpackage.hcj
    public final void f(List list, List list2) {
        this.j.f(list, list2);
    }

    @Override // defpackage.hcj
    public final String g() {
        return this.e;
    }

    @Override // defpackage.hcq
    public final void h(ListIterator listIterator) {
        if (this.j == null) {
            while (listIterator.hasPrevious() && listIterator.previous() != this) {
            }
            ArrayList arrayList = new ArrayList();
            while (listIterator.hasPrevious()) {
                arrayList.add((hcj) listIterator.previous());
                listIterator.remove();
            }
            Collections.reverse(arrayList);
            this.j = new hck(this.c, this.d, "Repeater", this.f, arrayList, null);
        }
    }

    @Override // defpackage.hct
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
