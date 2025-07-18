package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes.dex */
class pcs implements pcl {
    final /* synthetic */ pct a;

    public pcs(pct pctVar) {
        this.a = pctVar;
    }

    @Override // defpackage.pcl
    public final /* synthetic */ void a(Object obj) {
        long epochMilli = Instant.now().toEpochMilli();
        if (epochMilli != -1) {
            pcb pcbVar = ((pbv) obj).a;
            long j = epochMilli * 1000;
            if ((pcbVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                pcbVar.y();
            }
            pcc pccVar = (pcc) pcbVar.b;
            pcc pccVar2 = pcc.a;
            pccVar.b |= 4;
            pccVar.f = j;
        }
        pct pctVar = this.a;
        if (pctVar.b.e((pbv) obj)) {
            pctVar.b();
        }
    }

    @Override // defpackage.pcl
    public final /* synthetic */ void b(Object obj) {
        long epochMilli = Instant.now().toEpochMilli();
        if (epochMilli != -1) {
            pcb pcbVar = ((pbv) obj).a;
            long j = epochMilli * 1000;
            if ((pcbVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                pcbVar.y();
            }
            pcc pccVar = (pcc) pcbVar.b;
            pcc pccVar2 = pcc.a;
            pccVar.b |= 4;
            pccVar.f = j;
        }
        pct pctVar = this.a;
        pbv pbvVar = (pbv) obj;
        pcm pcmVar = pbvVar.c;
        if (pctVar.b.d(pbvVar)) {
            pctVar.b();
        }
    }

    @Override // defpackage.pcl
    public final /* synthetic */ void c(Object obj) {
        ((pbv) obj).d();
    }

    @Override // defpackage.pcl
    public final /* bridge */ /* synthetic */ void e() {
        uea.c();
    }

    @Override // defpackage.pcl
    public final /* bridge */ /* synthetic */ void f() {
        uea.c();
        final pct pctVar = this.a;
        Runnable runnable = pctVar.f;
        if (runnable != null) {
            uea.a().removeCallbacks(runnable);
            pctVar.g.a(new Runnable() { // from class: pcr
                @Override // java.lang.Runnable
                public final void run() {
                    pctVar.a();
                }
            }).run();
        }
    }

    @Override // defpackage.pcl
    public final /* synthetic */ void g(Object obj, int i) {
        long epochMilli = Instant.now().toEpochMilli();
        if (epochMilli != -1) {
            pcb pcbVar = ((pbv) obj).a;
            long j = epochMilli * 1000;
            if ((pcbVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                pcbVar.y();
            }
            pcc pccVar = (pcc) pcbVar.b;
            pcc pccVar2 = pcc.a;
            pccVar.b |= 4;
            pccVar.f = j;
        }
        pct pctVar = this.a;
        if (pctVar.b.f((pbv) obj, i)) {
            pctVar.b();
        }
    }

    @Override // defpackage.pcl
    public final /* synthetic */ void d() {
    }
}
