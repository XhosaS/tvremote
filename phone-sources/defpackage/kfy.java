package defpackage;

import android.view.View;
import android.view.ViewStub;
import com.google.common.collect.HashMultimap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class kfy implements yjk {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ kfy(Object obj, dwt dwtVar, Object obj2, int i) {
        this.d = i;
        this.c = obj;
        this.a = dwtVar;
        this.b = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [bcb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, yjk] */
    @Override // defpackage.yjk
    public final Object a() {
        sbx sbxVar = null;
        switch (this.d) {
            case 0:
                Object obj = this.a;
                kfz kfzVar = (kfz) obj;
                bv bvVar = (bv) obj;
                kfzVar.b().e(bvVar, (View) this.b, kfzVar.b().b((wkx) this.c));
                return ygi.a;
            case 1:
                Object obj2 = this.c;
                kfn kfnVar = ((kfk) obj2).b;
                if (kfnVar == null) {
                    yks.c("seasonSelectionMenuPresenter");
                } else {
                    sbxVar = kfnVar;
                }
                Object obj3 = this.b;
                kfp kfpVar = (kfp) sbxVar.l(((kfi) this.a).a);
                obj3.getClass();
                sfy.l((bv) obj2, (View) obj3).a(kfpVar);
                return ygi.a;
            case 2:
                this.b.b(Boolean.valueOf(false));
                this.c.a();
                ((kiq) this.a).e(kgs.a);
                return ygi.a;
            case 3:
                krp krpVar = (krp) this.b;
                HashMultimap hashMultimap = krpVar.a;
                if (hashMultimap.isEmpty()) {
                    krpVar.b.a();
                }
                hashMultimap.put(this.c, this.a);
                return ygi.a;
            case 4:
                krp krpVar2 = (krp) this.b;
                HashMultimap hashMultimap2 = krpVar2.a;
                if (hashMultimap2.remove(this.c, this.a) && hashMultimap2.isEmpty()) {
                    krpVar2.c.a();
                }
                return ygi.a;
            case 5:
                Object obj4 = this.a;
                moa moaVar = ((mns) obj4).a;
                if (moaVar == null) {
                    yks.c("valuePropositionPresenter");
                } else {
                    sbxVar = moaVar;
                }
                Object obj5 = this.b;
                mny mnyVar = (mny) sbxVar.l(this.c);
                obj5.getClass();
                sfy.l((bv) obj4, (View) obj5).a(mnyVar);
                return ygi.a;
            case 6:
                ((qwo) ((vvd) this.c).c).d((rdd) this.b);
                return ygi.a;
            default:
                int i = zde.n;
                zgb zgbVar = ((zbp) this.a).c;
                zgbVar.getClass();
                return zgbVar.a(((zcb) this.c).a(), ((zbi) this.b).h.c);
        }
    }

    public /* synthetic */ kfy(Object obj, Object obj2, Object obj3, int i) {
        this.d = i;
        this.a = obj;
        this.c = obj2;
        this.b = obj3;
    }

    public /* synthetic */ kfy(kfz kfzVar, ViewStub viewStub, wkx wkxVar, int i) {
        this.d = i;
        this.a = kfzVar;
        this.b = viewStub;
        this.c = wkxVar;
    }

    public /* synthetic */ kfy(krp krpVar, Object obj, ksb ksbVar, int i) {
        this.d = i;
        this.b = krpVar;
        this.c = obj;
        this.a = ksbVar;
    }

    public /* synthetic */ kfy(vvd vvdVar, rdd rddVar, qwp qwpVar, int i) {
        this.d = i;
        this.c = vvdVar;
        this.b = rddVar;
        this.a = qwpVar;
    }
}
