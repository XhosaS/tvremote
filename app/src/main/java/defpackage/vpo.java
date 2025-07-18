package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vpo {
    public final vos a;

    public vpo(vos vosVar) {
        this.a = vosVar;
    }

    public final zyd a(final wne wneVar, Executor executor) {
        executor.getClass();
        zvh zvhVar = (zvh) ((wnc) wneVar).b.f();
        zyd zydVarL = zvhVar != null ? zxn.l(wyo.b(zvhVar), executor) : zxn.h("");
        final agux aguxVar = new agux() { // from class: vpm
            @Override // defpackage.agux
            public final Object a(Object obj) {
                StringBuilder sb = new StringBuilder();
                wnc wncVar = (wnc) wneVar;
                sb.append(wncVar.a);
                sb.append((String) obj);
                sb.append(".pb");
                return this.a.a.a(wncVar.d, sb.toString()).a();
            }
        };
        return zuz.g(zydVarL, wyo.a(new yqi() { // from class: vpn
            @Override // defpackage.yqi
            public final Object apply(Object obj) {
                return aguxVar.a(obj);
            }
        }), executor);
    }
}
