package defpackage;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class hci implements hdb, hcr, hcl {
    protected final hfk a;
    final Paint b;
    float c;
    private final hbv h;
    private final float[] j;
    private final hdg k;
    private final hdg l;
    private final List m;
    private final hdg n;
    private hdg o;
    private hdg p;
    private hdj q;
    private final PathMeasure d = new PathMeasure();
    private final Path e = new Path();
    private final Path f = new Path();
    private final RectF g = new RectF();
    private final List i = new ArrayList();

    public hci(hbv hbvVar, hfk hfkVar, Paint.Cap cap, Paint.Join join, float f, hek hekVar, hei heiVar, List list, hei heiVar2) {
        hch hchVar = new hch(1);
        this.b = hchVar;
        this.c = 0.0f;
        this.h = hbvVar;
        this.a = hfkVar;
        hchVar.setStyle(Paint.Style.STROKE);
        hchVar.setStrokeCap(cap);
        hchVar.setStrokeJoin(join);
        hchVar.setStrokeMiter(f);
        this.l = hekVar.a();
        this.k = heiVar.a();
        if (heiVar2 == null) {
            this.n = null;
        } else {
            this.n = heiVar2.a();
        }
        this.m = new ArrayList(list.size());
        this.j = new float[list.size()];
        for (int i = 0; i < list.size(); i++) {
            this.m.add(((hei) list.get(i)).a());
        }
        hfkVar.i(this.l);
        hfkVar.i(this.k);
        for (int i2 = 0; i2 < this.m.size(); i2++) {
            hfkVar.i((hdg) this.m.get(i2));
        }
        hdg hdgVar = this.n;
        if (hdgVar != null) {
            hfkVar.i(hdgVar);
        }
        this.l.h(this);
        this.k.h(this);
        for (int i3 = 0; i3 < list.size(); i3++) {
            ((hdg) this.m.get(i3)).h(this);
        }
        hdg hdgVar2 = this.n;
        if (hdgVar2 != null) {
            hdgVar2.h(this);
        }
        if (hfkVar.q() != null) {
            hdg hdgVarA = ((hei) hfkVar.q().a).a();
            this.p = hdgVarA;
            hdgVarA.h(this);
            hfkVar.i(this.p);
        }
        if (hfkVar.r() != null) {
            this.q = new hdj(this, hfkVar, hfkVar.r());
        }
    }

    @Override // defpackage.hee
    public void a(Object obj, hhu hhuVar) {
        hdj hdjVar;
        hdj hdjVar2;
        hdj hdjVar3;
        hdj hdjVar4;
        hdj hdjVar5;
        if (obj == hca.d) {
            this.l.d = hhuVar;
            return;
        }
        if (obj == hca.s) {
            this.k.d = hhuVar;
            return;
        }
        if (obj == hca.K) {
            hdg hdgVar = this.o;
            if (hdgVar != null) {
                this.a.k(hdgVar);
            }
            hdx hdxVar = new hdx(hhuVar);
            this.o = hdxVar;
            hdxVar.h(this);
            this.a.i(this.o);
            return;
        }
        if (obj == hca.j) {
            hdg hdgVar2 = this.p;
            if (hdgVar2 != null) {
                hdgVar2.d = hhuVar;
                return;
            }
            hdx hdxVar2 = new hdx(hhuVar);
            this.p = hdxVar2;
            hdxVar2.h(this);
            this.a.i(this.p);
            return;
        }
        if (obj == hca.e && (hdjVar5 = this.q) != null) {
            hdjVar5.b(hhuVar);
            return;
        }
        if (obj == hca.G && (hdjVar4 = this.q) != null) {
            hdjVar4.f(hhuVar);
            return;
        }
        if (obj == hca.H && (hdjVar3 = this.q) != null) {
            hdjVar3.c(hhuVar);
            return;
        }
        if (obj == hca.I && (hdjVar2 = this.q) != null) {
            hdjVar2.e(hhuVar);
        } else {
            if (obj != hca.J || (hdjVar = this.q) == null) {
                return;
            }
            hdjVar.g(hhuVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x01f4  */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v16, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.hcl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b(android.graphics.Canvas r20, android.graphics.Matrix r21, int r22) {
        /*
            Method dump skipped, instructions count: 616
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hci.b(android.graphics.Canvas, android.graphics.Matrix, int):void");
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.hcl
    public final void c(RectF rectF, Matrix matrix, boolean z) {
        Path path = this.e;
        path.reset();
        int i = 0;
        while (true) {
            List list = this.i;
            if (i >= list.size()) {
                RectF rectF2 = this.g;
                path.computeBounds(rectF2, false);
                float fK = ((hdk) this.k).k() / 2.0f;
                rectF2.set(rectF2.left - fK, rectF2.top - fK, rectF2.right + fK, rectF2.bottom + fK);
                rectF.set(rectF2);
                rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
                hbd.a();
                return;
            }
            fse fseVar = (fse) list.get(i);
            int i2 = 0;
            while (true) {
                ?? r4 = fseVar.a;
                if (i2 < r4.size()) {
                    path.addPath(((hct) r4.get(i2)).i(), matrix);
                    i2++;
                }
            }
            i++;
        }
    }

    @Override // defpackage.hdb
    public final void d() {
        this.h.invalidateSelf();
    }

    @Override // defpackage.hee
    public final void e(hed hedVar, int i, List list, hed hedVar2) {
        hhm.d(hedVar, i, list, hedVar2, this);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.hcj
    public final void f(List list, List list2) {
        fse fseVar = null;
        hda hdaVar = null;
        for (int size = list.size() - 1; size >= 0; size--) {
            hcj hcjVar = (hcj) list.get(size);
            if (hcjVar instanceof hda) {
                hda hdaVar2 = (hda) hcjVar;
                if (hdaVar2.e == 2) {
                    hdaVar = hdaVar2;
                }
            }
        }
        if (hdaVar != null) {
            hdaVar.a(this);
        }
        int size2 = list2.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            hcj hcjVar2 = (hcj) list2.get(size2);
            if (hcjVar2 instanceof hda) {
                hda hdaVar3 = (hda) hcjVar2;
                if (hdaVar3.e == 2) {
                    if (fseVar != null) {
                        this.i.add(fseVar);
                    }
                    fse fseVar2 = new fse(hdaVar3);
                    hdaVar3.a(this);
                    fseVar = fseVar2;
                }
            }
            if (hcjVar2 instanceof hct) {
                if (fseVar == null) {
                    fseVar = new fse(hdaVar);
                }
                fseVar.a.add((hct) hcjVar2);
            }
        }
        if (fseVar != null) {
            this.i.add(fseVar);
        }
    }
}
