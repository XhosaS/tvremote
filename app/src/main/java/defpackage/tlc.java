package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tlc implements nzy {
    final /* synthetic */ tld a;
    final /* synthetic */ tli b;

    public tlc(tld tldVar, tli tliVar) {
        this.a = tldVar;
        this.b = tliVar;
    }

    @Override // defpackage.nzz
    public final abwk a() {
        return this.a.a;
    }

    @Override // defpackage.nzy
    public final agff b(Object obj, nzx nzxVar) {
        final tlb tlbVar = new tlb(this.a, obj, nzxVar, this.b);
        final zwk zwkVar = zwk.a;
        return agff.c(new agfh() { // from class: tpd
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, zyd] */
            @Override // defpackage.agfh
            public final void a(final agih agihVar) {
                tlb tlbVar2 = tlbVar;
                Executor executor = zwkVar;
                try {
                    final ?? r0 = tlbVar2.get();
                    aghd.h(agihVar, new agha(new aggx() { // from class: tpb
                        @Override // defpackage.aggx
                        public final void a() {
                            r0.cancel(false);
                        }
                    }));
                    zxn.p(r0, wyo.f(new tpe(agihVar)), executor);
                } catch (Throwable th) {
                    aggq.a(th);
                    wyo.h(new Runnable() { // from class: tpc
                        @Override // java.lang.Runnable
                        public final void run() {
                            agihVar.b(th);
                        }
                    }).run();
                }
            }
        });
    }
}
