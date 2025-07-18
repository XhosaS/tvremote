package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hck implements hcl, hct, hdb, hee {
    public final List a;
    private final Matrix b;
    private final Path c;
    private final RectF d;
    private final String e;
    private final boolean f;
    private final hbv g;
    private List h;
    private hdw i;

    public hck(hbv hbvVar, hfk hfkVar, hff hffVar, hbk hbkVar) {
        her herVar;
        String str = hffVar.a;
        boolean z = hffVar.c;
        List list = hffVar.b;
        ArrayList arrayList = new ArrayList(list.size());
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            hcj hcjVarA = ((hev) list.get(i2)).a(hbvVar, hbkVar, hfkVar);
            if (hcjVarA != null) {
                arrayList.add(hcjVarA);
            }
        }
        List list2 = hffVar.b;
        while (true) {
            if (i >= list2.size()) {
                herVar = null;
                break;
            }
            hev hevVar = (hev) list2.get(i);
            if (hevVar instanceof her) {
                herVar = (her) hevVar;
                break;
            }
            i++;
        }
        this(hbvVar, hfkVar, str, z, arrayList, herVar);
    }

    @Override // defpackage.hee
    public final void a(Object obj, hhu hhuVar) {
        hdw hdwVar = this.i;
        if (hdwVar != null) {
            hdwVar.e(obj, hhuVar);
        }
    }

    @Override // defpackage.hcl
    public final void b(Canvas canvas, Matrix matrix, int i) {
        if (this.f) {
            return;
        }
        Matrix matrix2 = this.b;
        matrix2.set(matrix);
        hdw hdwVar = this.i;
        if (hdwVar != null) {
            matrix2.preConcat(hdwVar.a());
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
            if (obj instanceof hcl) {
                ((hcl) obj).b(canvas, matrix2, i);
            }
        }
    }

    @Override // defpackage.hcl
    public final void c(RectF rectF, Matrix matrix, boolean z) {
        Matrix matrix2 = this.b;
        matrix2.set(matrix);
        hdw hdwVar = this.i;
        if (hdwVar != null) {
            matrix2.preConcat(hdwVar.a());
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
            hcj hcjVar = (hcj) list.get(size);
            if (hcjVar instanceof hcl) {
                ((hcl) hcjVar).c(rectF2, matrix2, z);
                rectF.union(rectF2);
            }
        }
    }

    @Override // defpackage.hdb
    public final void d() {
        this.g.invalidateSelf();
    }

    @Override // defpackage.hee
    public final void e(hed hedVar, int i, List list, hed hedVar2) {
        String str = this.e;
        if (!hedVar.e(str, i) && !"__container".equals(str)) {
            return;
        }
        if (!"__container".equals(str)) {
            hedVar2 = hedVar2.b(str);
            if (hedVar.d(str, i)) {
                list.add(hedVar2.c(this));
            }
        }
        if (!hedVar.f(str, i)) {
            return;
        }
        int iA = i + hedVar.a(str, i);
        int i2 = 0;
        while (true) {
            List list2 = this.a;
            if (i2 >= list2.size()) {
                return;
            }
            hcj hcjVar = (hcj) list2.get(i2);
            if (hcjVar instanceof hee) {
                ((hee) hcjVar).e(hedVar, iA, list, hedVar2);
            }
            i2++;
        }
    }

    @Override // defpackage.hcj
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
            hcj hcjVar = (hcj) list3.get(size);
            hcjVar.f(arrayList, list3.subList(0, size));
            arrayList.add(hcjVar);
        }
    }

    @Override // defpackage.hcj
    public final String g() {
        throw null;
    }

    final Matrix h() {
        hdw hdwVar = this.i;
        if (hdwVar != null) {
            return hdwVar.a();
        }
        Matrix matrix = this.b;
        matrix.reset();
        return matrix;
    }

    @Override // defpackage.hct
    public final Path i() {
        Matrix matrix = this.b;
        matrix.reset();
        hdw hdwVar = this.i;
        if (hdwVar != null) {
            matrix.set(hdwVar.a());
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
                hcj hcjVar = (hcj) list.get(size);
                if (hcjVar instanceof hct) {
                    path.addPath(((hct) hcjVar).i(), matrix);
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
                hcj hcjVar = (hcj) list.get(i);
                if (hcjVar instanceof hct) {
                    this.h.add((hct) hcjVar);
                }
                i++;
            }
        }
        return this.h;
    }

    public hck(hbv hbvVar, hfk hfkVar, String str, boolean z, List list, her herVar) {
        new hch();
        new RectF();
        this.b = new Matrix();
        this.c = new Path();
        this.d = new RectF();
        this.e = str;
        this.g = hbvVar;
        this.f = z;
        this.a = list;
        if (herVar != null) {
            hdw hdwVar = new hdw(herVar);
            this.i = hdwVar;
            hdwVar.c(hfkVar);
            this.i.d(this);
        }
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            hcj hcjVar = (hcj) list.get(size);
            if (hcjVar instanceof hcq) {
                arrayList.add((hcq) hcjVar);
            }
        }
        int size2 = arrayList.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                return;
            } else {
                ((hcq) arrayList.get(size2)).h(list.listIterator(list.size()));
            }
        }
    }
}
