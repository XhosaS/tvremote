package defpackage;

import android.support.v7.widget.ActivityChooserView;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class ajg implements yjv {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    public /* synthetic */ ajg(ajk ajkVar, int i, bwj bwjVar, bvv bvvVar, int i2) {
        this.e = i2;
        this.b = ajkVar;
        this.a = i;
        this.c = bwjVar;
        this.d = bvvVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [bvv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v4, types: [bvv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v14, types: [java.lang.Object, yjz] */
    /* JADX WARN: Type inference failed for: r7v3, types: [bvv, clx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.yjv
    public final Object a(Object obj) {
        ?? r7;
        int i = this.e;
        if (i == 0) {
            bwi bwiVar = (bwi) obj;
            bwj bwjVar = (bwj) this.c;
            int i2 = bwjVar.a;
            ajk ajkVar = (ajk) this.b;
            ajkVar.l(bwiVar, this.a, i2, ajkVar.c.e().d, this.d.n());
            bwi.y(bwiVar, bwjVar, -ajkVar.g.c(), 0);
            return ygi.a;
        }
        if (i != 1) {
            if (i == 2) {
                bwi bwiVar2 = (bwi) obj;
                bwj bwjVar2 = (bwj) this.c;
                int i3 = bwjVar2.b;
                ajk ajkVar2 = (ajk) this.b;
                ajkVar2.l(bwiVar2, this.a, i3, ajkVar2.c.e().d, this.d.n());
                bwi.y(bwiVar2, bwjVar2, 0, -ajkVar2.g.c());
                return ygi.a;
            }
            if (i == 3) {
                bwi bwiVar3 = (bwi) obj;
                ?? r0 = this.d;
                int size = r0.size();
                for (int i4 = 0; i4 < size; i4++) {
                    List list = (List) r0.get(i4);
                    int size2 = list.size();
                    int[] iArr = new int[size2];
                    int i5 = 0;
                    while (true) {
                        r7 = this.b;
                        if (i5 >= size2) {
                            break;
                        }
                        iArr[i5] = ((bwj) list.get(i5)).a + (i5 < yfm.q(list) ? r7.cu(8.0f) : 0);
                        i5++;
                    }
                    int[] iArr2 = new int[size2];
                    xk.b.b(r7, this.a, iArr, r7.n(), iArr2);
                    int size3 = list.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        bwiVar3.r((bwj) list.get(i6), iArr2[i6], ((Number) this.c.get(i4)).intValue(), 0.0f);
                    }
                }
                return ygi.a;
            }
            if (i == 4) {
                if (obj == this.d) {
                    throw new IllegalStateException("A derived state calculation cannot read itself");
                }
                if (obj instanceof bjk) {
                    int i7 = this.a;
                    jz jzVar = (jz) this.b;
                    jzVar.g(obj, Math.min(((bhr) this.c).a - i7, jzVar.c(obj, ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED)));
                }
                return ygi.a;
            }
            if (i != 5) {
                ((bcm) obj).getClass();
                int i8 = this.a;
                ?? r3 = this.c;
                Object obj2 = this.d;
                pju pjuVar = (pju) this.b;
                pju pjuVar2 = (pju) obj2;
                ntp.s(new qyt(pjuVar, pjuVar2, (yjz) r3, i8, 1));
                return new pkn(pjuVar, pjuVar2, r3, i8);
            }
            ghi ghiVarA = ((gic) obj).a((String) this.b);
            Object obj3 = this.d;
            int i9 = this.a;
            try {
                Iterator it = this.c.iterator();
                int i10 = 1;
                while (it.hasNext()) {
                    ghiVarA.i(i10, ijn.o((wlh) it.next()));
                    i10++;
                }
                ghiVarA.i(i9 + 1, (String) obj3);
                ghiVarA.l();
                return ygi.a;
            } finally {
                ghiVarA.close();
            }
        }
        bwi bwiVar4 = (bwi) obj;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            bwj[] bwjVarArr = (bwj[]) this.c;
            if (i11 >= bwjVarArr.length) {
                return ygi.a;
            }
            bwj bwjVar3 = bwjVarArr[i11];
            int i13 = i12 + 1;
            bwjVar3.getClass();
            ze zeVarL = wv.l(bwjVar3);
            ye yeVar = zeVarL != null ? zeVarL.c : null;
            int i14 = this.a;
            bwiVar4.r(bwjVar3, ((int[]) this.d)[i12], yeVar != null ? yeVar.a(i14 - bwjVar3.b, cmi.a) : ((zg) this.b).a.a(0, i14 - bwjVar3.b), 0.0f);
            i11++;
            i12 = i13;
        }
    }

    public /* synthetic */ ajg(bbh bbhVar, bhr bhrVar, jz jzVar, int i, int i2) {
        this.e = i2;
        this.d = bbhVar;
        this.c = bhrVar;
        this.b = jzVar;
        this.a = i;
    }

    public /* synthetic */ ajg(String str, List list, int i, String str2, int i2) {
        this.e = i2;
        this.b = str;
        this.c = list;
        this.a = i;
        this.d = str2;
    }

    public /* synthetic */ ajg(List list, bvv bvvVar, int i, List list2, int i2) {
        this.e = i2;
        this.d = list;
        this.b = bvvVar;
        this.a = i;
        this.c = list2;
    }

    public /* synthetic */ ajg(pju pjuVar, pju pjuVar2, yjz yjzVar, int i, int i2) {
        this.e = i2;
        this.b = pjuVar;
        this.d = pjuVar2;
        this.c = yjzVar;
        this.a = i;
    }

    public /* synthetic */ ajg(bwj[] bwjVarArr, zg zgVar, int i, int[] iArr, int i2) {
        this.e = i2;
        this.c = bwjVarArr;
        this.b = zgVar;
        this.a = i;
        this.d = iArr;
    }
}
