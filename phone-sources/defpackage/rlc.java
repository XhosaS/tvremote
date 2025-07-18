package defpackage;

import com.google.common.collect.ImmutableList;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class rlc implements uha {
    final /* synthetic */ boolean a;
    final /* synthetic */ long b;
    final /* synthetic */ rld c;
    private final String d;

    public rlc(rld rldVar, boolean z, long j) {
        this.a = z;
        this.b = j;
        this.c = rldVar;
        this.d = rrx.T(rldVar.a);
    }

    @Override // defpackage.uha
    public final void a(Throwable th) {
        String str = this.d;
        String strAq = rrx.aq(th);
        rld rldVar = this.c;
        rzy rzyVar = (rzy) rldVar.d;
        String str2 = (String) rldVar.c;
        boolean z = this.a;
        rzyVar.l(str, strAq, -1, str2, z);
        rzyVar.o(Instant.now().toEpochMilli() - this.b, str, strAq, -1, str2, z);
    }

    @Override // defpackage.uha
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        int iMin = Math.min(((ImmutableList) obj).size(), 10);
        rld rldVar = this.c;
        rzy rzyVar = (rzy) rldVar.d;
        String str = (String) rldVar.c;
        String str2 = this.d;
        boolean z = this.a;
        rzyVar.l(str2, "OK", iMin, str, z);
        rzyVar.o(Instant.now().toEpochMilli() - this.b, str2, "OK", iMin, str, z);
    }
}
