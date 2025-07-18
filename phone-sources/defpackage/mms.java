package defpackage;

import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class mms implements ieh {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    private final /* synthetic */ int f;

    public /* synthetic */ mms(idf idfVar, ksy ksyVar, idf idfVar2, idf idfVar3, idf idfVar4, int i) {
        this.f = i;
        this.a = idfVar;
        this.e = ksyVar;
        this.b = idfVar2;
        this.c = idfVar3;
        this.d = idfVar4;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [idr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v40, types: [iea, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v47, types: [iea, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [idr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [idf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [idf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v5, types: [idf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [idf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v12, types: [ieh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [idw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [idr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [idr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [idr, java.lang.Object] */
    @Override // defpackage.ieh
    public final Object a() {
        int i = this.f;
        if (i == 0) {
            ?? r0 = this.a;
            mmc mmcVarB = mmd.b();
            mmcVarB.f(((Boolean) r0.a()).booleanValue());
            ?? r02 = this.b;
            ieg iegVarF = ((ieg) r02.a()).m() ? ieg.f(((kwl) ((ieg) r02.a()).g()).d) : ieg.a;
            ?? r3 = this.e;
            ?? r4 = this.d;
            ?? r5 = this.c;
            mmcVarB.h(iegVarF);
            mmcVarB.g((ieg) r5.a());
            mmcVarB.b((ieg) r4.a());
            mmcVarB.i(((Boolean) r3.a()).booleanValue());
            mmcVarB.c(true);
            return mmcVarB.a();
        }
        if (i == 1) {
            int i2 = lxh.p;
            ieg iegVar = (ieg) this.a.b(this.e);
            if (iegVar.k()) {
                return ieg.b;
            }
            ieg iegVar2 = (ieg) this.c.b((List) this.b.b(((lcg) iegVar.g()).n));
            return iegVar2.k() ? ieg.b : ieg.f((List) this.d.b((List) iegVar2.g()));
        }
        ieg iegVar3 = (ieg) this.b.a();
        if (iegVar3.m() && this.a.b((kwn) iegVar3.g())) {
            ?? r03 = this.c;
            if (((ieg) r03.a()).m() && ((List) ((ieg) r03.a()).g()).size() > 0) {
                ?? r2 = this.d;
                List<kwl> list = (List) ((ieg) r03.a()).g();
                ImmutableList.Builder builder = ImmutableList.builder();
                kwl kwlVar = (kwl) ((ieg) r2.a()).h((kwl) list.get(0));
                mzg mzgVar = null;
                for (kwl kwlVar2 : list) {
                    if (kwlVar2 == null) {
                        throw new NullPointerException("Null season");
                    }
                    mzg mzgVar2 = new mzg(kwlVar2);
                    if (true == kwlVar.d.equals(kwlVar2.d)) {
                        mzgVar = mzgVar2;
                    }
                    builder.add((ImmutableList.Builder) mzgVar2);
                }
                tst tstVarH = tst.h(this.e);
                ImmutableList immutableListCopyOf = ImmutableList.copyOf((Collection) builder.build());
                if (immutableListCopyOf != null && mzgVar != null) {
                    return ieg.f(new mzf(immutableListCopyOf, mzgVar, tstVarH));
                }
                StringBuilder sb = new StringBuilder();
                if (immutableListCopyOf == null) {
                    sb.append(" seasons");
                }
                if (mzgVar == null) {
                    sb.append(" selectedSeason");
                }
                throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
            }
        }
        return ieg.a;
    }

    public /* synthetic */ mms(idr idrVar, idr idrVar2, idr idrVar3, idr idrVar4, idr idrVar5, int i) {
        this.f = i;
        this.a = idrVar;
        this.b = idrVar2;
        this.c = idrVar3;
        this.d = idrVar4;
        this.e = idrVar5;
    }

    public /* synthetic */ mms(iea ieaVar, idw idwVar, iea ieaVar2, iea ieaVar3, pjx pjxVar, int i) {
        this.f = i;
        this.b = ieaVar;
        this.a = idwVar;
        this.c = ieaVar2;
        this.d = ieaVar3;
        this.e = pjxVar;
    }
}
