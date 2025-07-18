package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agg implements bvt {
    private final yjk a;
    private final yjk b;

    public agg(yjk yjkVar, yjk yjkVar2) {
        this.a = yjkVar;
        this.b = yjkVar2;
    }

    @Override // defpackage.bvt
    public final /* synthetic */ int a(buz buzVar, List list, int i) {
        return fh.W(this, buzVar, list, i);
    }

    @Override // defpackage.bvt
    public final /* synthetic */ int b(buz buzVar, List list, int i) {
        return fh.X(this, buzVar, list, i);
    }

    @Override // defpackage.bvt
    public final /* synthetic */ int c(buz buzVar, List list, int i) {
        return fh.Y(this, buzVar, list, i);
    }

    @Override // defpackage.bvt
    public final /* synthetic */ int d(buz buzVar, List list, int i) {
        return fh.Z(this, buzVar, list, i);
    }

    @Override // defpackage.bvt
    public final bvu e(bvv bvvVar, List list, long j) {
        yfw yfwVar;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object obj = list.get(i);
            if (!(((bvs) obj).g() instanceof agi)) {
                arrayList.add(obj);
            }
        }
        List list2 = (List) this.b.a();
        ArrayList arrayList2 = null;
        if (list2 != null) {
            ArrayList arrayList3 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                bmy bmyVar = (bmy) list2.get(i2);
                if (bmyVar != null) {
                    bvs bvsVar = (bvs) arrayList.get(i2);
                    float f = bmyVar.d;
                    float f2 = bmyVar.b;
                    float fFloor = (float) Math.floor(f - f2);
                    float f3 = bmyVar.e;
                    float f4 = bmyVar.c;
                    yfwVar = new yfw(bvsVar.u(clw.k((int) fFloor, (int) Math.floor(f3 - f4), 5)), new cmf((Math.round(f2) << 32) | (Math.round(f4) & 4294967295L)));
                } else {
                    yfwVar = null;
                }
                if (yfwVar != null) {
                    arrayList3.add(yfwVar);
                }
            }
            arrayList2 = arrayList3;
        }
        ArrayList arrayList4 = new ArrayList(list.size());
        int size3 = list.size();
        for (int i3 = 0; i3 < size3; i3++) {
            Object obj2 = list.get(i3);
            if (((bvs) obj2).g() instanceof agi) {
                arrayList4.add(obj2);
            }
        }
        return bvvVar.cz(clv.b(j), clv.a(j), yhc.a, new afk(arrayList2, hp.m(arrayList4, this.a), 7));
    }
}
