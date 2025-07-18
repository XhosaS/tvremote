package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class bfq implements cht {
    public final /* synthetic */ bfr a;
    public final /* synthetic */ int b;
    public final /* synthetic */ List c;
    private final /* synthetic */ int d;

    public /* synthetic */ bfq(bfr bfrVar, int i, List list, int i2) {
        this.d = i2;
        this.a = bfrVar;
        this.b = i;
        this.c = list;
    }

    @Override // defpackage.cht
    public final cja a(Object obj) {
        if (this.d == 0) {
            int i = this.b;
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 < i; i2++) {
                if (((Boolean) qm.P((Future) this.c.get(i2))).booleanValue()) {
                    arrayList.add(((bfo) this.a.a.get(i2)).a());
                }
            }
            return qm.I(arrayList).a(new bdb(3), chz.a);
        }
        final cmz cmzVar = (cmz) obj;
        final List list = this.c;
        final int i3 = this.b;
        cip cipVarG = qm.G(list);
        final bfr bfrVar = this.a;
        chs chsVarA = bxr.a(new chs() { // from class: bfp
            @Override // defpackage.chs
            public final cja a() {
                cja cjaVarK = qm.K(cmzVar);
                for (int i4 = 0; i4 < i3; i4++) {
                    if (((Boolean) qm.P((Future) list.get(i4))).booleanValue()) {
                        cjaVarK = chk.i(cjaVarK, bxr.b(new avs((bfo) bfrVar.a.get(i4), 6)), chz.a);
                    }
                }
                return cjaVarK;
            }
        });
        return new chy((bzl) cipVarG.b, cipVarG.a, bfrVar.b, chsVarA);
    }

    public /* synthetic */ bfq(bfr bfrVar, List list, int i, int i2) {
        this.d = i2;
        this.a = bfrVar;
        this.c = list;
        this.b = i;
    }
}
