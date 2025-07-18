package defpackage;

import com.google.common.collect.ImmutableList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class rdg implements dvw {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ rdg(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Type inference failed for: r6v16, types: [java.lang.Object, qvh] */
    @Override // defpackage.dvw
    public final void dV(Object obj) {
        int i = this.c;
        if (i == 0) {
            tst tstVar = (tst) obj;
            Object obj2 = this.b;
            Object obj3 = this.a;
            if (obj2 == null || !tstVar.g()) {
                ((rem) obj3).n(trk.a);
                return;
            }
            rfb rfbVar = (rfb) tstVar.c();
            reo reoVarA = rep.a();
            reoVarA.b = tst.i(new rei(rfbVar.b(), rfbVar.a()));
            reoVarA.b(true);
            ((rem) obj3).n(tst.i(reoVarA.a()));
            return;
        }
        if (i == 1) {
            tst tstVar2 = (tst) obj;
            sjl.c();
            boolean zG = tstVar2.g();
            Object obj4 = this.b;
            Object obj5 = this.a;
            if (zG) {
                ((qun) obj5).b.put(obj4, (qua) tstVar2.c());
            } else {
                ((qun) obj5).b.remove(obj4);
            }
            ((qun) obj5).b();
            return;
        }
        if (i == 2) {
            ImmutableList immutableList = (ImmutableList) obj;
            immutableList.getClass();
            rdz rdzVar = (rdz) this.a;
            rdzVar.b = immutableList;
            rdzVar.b(this.b.a());
            return;
        }
        Object obj6 = this.a;
        ImmutableList.Builder builder = ImmutableList.builder();
        reb rebVar = (reb) obj6;
        builder.addAll((Iterable) rebVar.a);
        builder.addAll((Iterable) obj);
        builder.addAll((Iterable) rebVar.b);
        ((dvv) this.b).k(builder.build());
    }
}
