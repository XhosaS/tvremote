package defpackage;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hco implements hcl, hdb, hcr {
    float a;
    private final String b;
    private final boolean c;
    private final hfk d;
    private final jn e = new jn();
    private final jn f = new jn();
    private final Path g;
    private final Paint h;
    private final RectF i;
    private final List j;
    private final hdg k;
    private final hdg l;
    private final hdg m;
    private final hdg n;
    private hdg o;
    private hdx p;
    private final hbv q;
    private final int r;
    private hdg s;
    private hdj t;
    private final int u;

    public hco(hbv hbvVar, hbk hbkVar, hfk hfkVar, hew hewVar) {
        Path path = new Path();
        this.g = path;
        this.h = new hch(1);
        this.i = new RectF();
        this.j = new ArrayList();
        this.a = 0.0f;
        this.d = hfkVar;
        this.b = hewVar.f;
        this.c = hewVar.g;
        this.q = hbvVar;
        this.u = hewVar.h;
        path.setFillType(hewVar.a);
        this.r = (int) (hbkVar.a() / 32.0f);
        hdg hdgVarA = hewVar.b.a();
        this.k = hdgVarA;
        hdgVarA.h(this);
        hfkVar.i(hdgVarA);
        hdg hdgVarA2 = hewVar.c.a();
        this.l = hdgVarA2;
        hdgVarA2.h(this);
        hfkVar.i(hdgVarA2);
        hdg hdgVarA3 = hewVar.d.a();
        this.m = hdgVarA3;
        hdgVarA3.h(this);
        hfkVar.i(hdgVarA3);
        hdg hdgVarA4 = hewVar.e.a();
        this.n = hdgVarA4;
        hdgVarA4.h(this);
        hfkVar.i(hdgVarA4);
        if (hfkVar.q() != null) {
            hdg hdgVarA5 = ((hei) hfkVar.q().a).a();
            this.s = hdgVarA5;
            hdgVarA5.h(this);
            hfkVar.i(this.s);
        }
        if (hfkVar.r() != null) {
            this.t = new hdj(this, hfkVar, hfkVar.r());
        }
    }

    private final int h() {
        float f = this.m.c;
        float f2 = this.r;
        int iRound = Math.round(f * f2);
        int iRound2 = Math.round(this.n.c * f2);
        int iRound3 = Math.round(this.k.c * f2);
        int i = iRound != 0 ? iRound * 527 : 17;
        if (iRound2 != 0) {
            i = i * 31 * iRound2;
        }
        return iRound3 != 0 ? i * 31 * iRound3 : i;
    }

    private final int[] i(int[] iArr) {
        hdx hdxVar = this.p;
        if (hdxVar != null) {
            Integer[] numArr = (Integer[]) hdxVar.e();
            int length = iArr.length;
            int length2 = numArr.length;
            int i = 0;
            if (length == length2) {
                while (i < iArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            } else {
                iArr = new int[length2];
                while (i < numArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            }
        }
        return iArr;
    }

    @Override // defpackage.hee
    public final void a(Object obj, hhu hhuVar) {
        hdj hdjVar;
        hdj hdjVar2;
        hdj hdjVar3;
        hdj hdjVar4;
        hdj hdjVar5;
        if (obj == hca.d) {
            this.l.d = hhuVar;
            return;
        }
        if (obj == hca.K) {
            hdg hdgVar = this.o;
            if (hdgVar != null) {
                this.d.k(hdgVar);
            }
            hdx hdxVar = new hdx(hhuVar);
            this.o = hdxVar;
            hdxVar.h(this);
            this.d.i(this.o);
            return;
        }
        if (obj == hca.L) {
            hdx hdxVar2 = this.p;
            if (hdxVar2 != null) {
                this.d.k(hdxVar2);
            }
            this.e.i();
            this.f.i();
            hdx hdxVar3 = new hdx(hhuVar);
            this.p = hdxVar3;
            hdxVar3.h(this);
            this.d.i(this.p);
            return;
        }
        if (obj == hca.j) {
            hdg hdgVar2 = this.s;
            if (hdgVar2 != null) {
                hdgVar2.d = hhuVar;
                return;
            }
            hdx hdxVar4 = new hdx(hhuVar);
            this.s = hdxVar4;
            hdxVar4.h(this);
            this.d.i(this.s);
            return;
        }
        if (obj == hca.e && (hdjVar5 = this.t) != null) {
            hdjVar5.b(hhuVar);
            return;
        }
        if (obj == hca.G && (hdjVar4 = this.t) != null) {
            hdjVar4.f(hhuVar);
            return;
        }
        if (obj == hca.H && (hdjVar3 = this.t) != null) {
            hdjVar3.c(hhuVar);
            return;
        }
        if (obj == hca.I && (hdjVar2 = this.t) != null) {
            hdjVar2.e(hhuVar);
        } else {
            if (obj != hca.J || (hdjVar = this.t) == null) {
                return;
            }
            hdjVar.g(hhuVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0121  */
    @Override // defpackage.hcl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(android.graphics.Canvas r21, android.graphics.Matrix r22, int r23) {
        /*
            Method dump skipped, instructions count: 333
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hco.b(android.graphics.Canvas, android.graphics.Matrix, int):void");
    }

    @Override // defpackage.hcl
    public final void c(RectF rectF, Matrix matrix, boolean z) {
        Path path = this.g;
        path.reset();
        int i = 0;
        while (true) {
            List list = this.j;
            if (i >= list.size()) {
                path.computeBounds(rectF, false);
                rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
                return;
            } else {
                path.addPath(((hct) list.get(i)).i(), matrix);
                i++;
            }
        }
    }

    @Override // defpackage.hdb
    public final void d() {
        this.q.invalidateSelf();
    }

    @Override // defpackage.hee
    public final void e(hed hedVar, int i, List list, hed hedVar2) {
        hhm.d(hedVar, i, list, hedVar2, this);
    }

    @Override // defpackage.hcj
    public final void f(List list, List list2) {
        for (int i = 0; i < list2.size(); i++) {
            hcj hcjVar = (hcj) list2.get(i);
            if (hcjVar instanceof hct) {
                this.j.add((hct) hcjVar);
            }
        }
    }

    @Override // defpackage.hcj
    public final String g() {
        return this.b;
    }
}
