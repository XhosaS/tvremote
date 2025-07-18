package defpackage;

import android.os.SystemClock;
import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes2.dex */
class wmo extends afgc {
    final /* synthetic */ wkv a;
    final /* synthetic */ wmp b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wmo(wmp wmpVar, afep afepVar, wkv wkvVar) {
        super(afepVar);
        this.a = wkvVar;
        this.b = wmpVar;
    }

    @Override // defpackage.afep
    public final void a(Status status, afih afihVar) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        ((uqq) this.a.b.eV()).b(jElapsedRealtime - r2.b, this.b.b.a, Integer.valueOf(status.getCode().value()));
        i().a(status, afihVar);
    }
}
