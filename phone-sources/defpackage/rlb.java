package defpackage;

import android.graphics.Bitmap;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class rlb implements uha {
    final /* synthetic */ boolean a;
    final /* synthetic */ long b;
    final /* synthetic */ int c;
    final /* synthetic */ rld d;
    private final String e;
    private final String f;

    public rlb(rld rldVar, int i, boolean z, long j) {
        this.c = i;
        this.a = z;
        this.b = j;
        this.d = rldVar;
        this.e = rrx.T(rldVar.a);
        this.f = i != 32 ? i != 48 ? i != 64 ? i != 120 ? i != 240 ? "null" : "X_LARGE" : "LARGE" : "MEDIUM" : "SMALL" : "TINY";
    }

    @Override // defpackage.uha
    public final void a(Throwable th) {
        String str = this.f;
        String strAq = rrx.aq(th);
        rld rldVar = this.d;
        rzy rzyVar = (rzy) rldVar.d;
        String str2 = (String) rldVar.c;
        String str3 = this.e;
        boolean z = this.a;
        rzyVar.k(str3, str, strAq, str2, z);
        rzyVar.n(Instant.now().toEpochMilli() - this.b, str3, str, strAq, str2, z);
    }

    @Override // defpackage.uha
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        String str = ((Bitmap) obj) != null ? "OK" : "NULL";
        boolean z = this.a;
        rld rldVar = this.d;
        String str2 = this.f;
        String str3 = this.e;
        rzy rzyVar = (rzy) rldVar.d;
        String str4 = (String) rldVar.c;
        rzyVar.k(str3, str2, str, str4, z);
        rzyVar.n(Instant.now().toEpochMilli() - this.b, str3, str2, str, str4, z);
    }
}
