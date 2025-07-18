package defpackage;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class qyw implements yjk {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ qyw(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, rjq] */
    /* JADX WARN: Type inference failed for: r0v31, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v34, types: [dvk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, ofl] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, ofk] */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Object, rjp] */
    /* JADX WARN: Type inference failed for: r1v14, types: [dvw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, java.util.Observer] */
    /* JADX WARN: Type inference failed for: r1v16, types: [iej, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v19, types: [dvj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object, yow] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.Object, yjv] */
    @Override // defpackage.yjk
    public final Object a() {
        sbu sbuVar;
        switch (this.c) {
            case 0:
                ofa ofaVar = ((qzb) this.a).a;
                vun vunVar = ofaVar.c;
                vunVar.getClass();
                ArrayList<ofi> arrayList = new ArrayList();
                for (Object obj : vunVar) {
                    if (qva.a(ofaVar.b, (ofi) obj) != null) {
                        arrayList.add(obj);
                    }
                }
                for (ofi ofiVar : arrayList) {
                    if (!ofiVar.h) {
                        ofr.b(ofaVar.b, ofiVar.b, (ogd) ((qza) this.b).b);
                    }
                }
                break;
            case 1:
                ofy.c(this.b, (ogd) ((tae) this.a).e);
                break;
            case 2:
                ofr.d(this.b, (ogd) ((qza) this.a).b);
                break;
            case 3:
                ((rbi) this.a).b.d(this.b);
                break;
            case 4:
                ykr.q(((aafi) this.b).a, null, 4, new sbl((yjv) this.a, (yih) null, 0), 1);
                break;
            case 5:
                ((sbu) this.b).b(this.a);
                break;
            case 6:
                ((dvs) this.a).i(this.b);
                break;
            case 7:
                ((Observable) this.a).deleteObserver(this.b);
                break;
            case 8:
                ((ids) this.a).ee(this.b);
                break;
            case 9:
                ((sby) this.a).c((sbu) this.b);
                break;
            case 10:
                ?? r0 = this.a;
                Object obj2 = this.b;
                for (sbu sbuVar2 : r0) {
                    if (!sbuVar2.d() && !sbuVar2.k.isEmpty()) {
                        Object obj3 = sbuVar2.f;
                        Set set = sbuVar2.l;
                        ((sby) obj2).c(sbuVar2);
                        if (!yks.e(obj3, sbuVar2.f) && (sbuVar = sbuVar2.a) != null) {
                            sbuVar.b(sbuVar2, set);
                        }
                    }
                }
                break;
            default:
                this.b.getLifecycle().d(this.a);
                break;
        }
        return ygi.a;
    }

    public /* synthetic */ qyw(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
