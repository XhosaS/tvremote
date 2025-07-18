package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes2.dex */
class qol implements zxe {
    final /* synthetic */ boolean a;
    final /* synthetic */ long b;
    final /* synthetic */ qom c;
    private final String d;

    public qol(qom qomVar, boolean z, long j) {
        this.a = z;
        this.b = j;
        this.c = qomVar;
        this.d = qlw.a(qomVar.c);
    }

    @Override // defpackage.zxe
    public final void a(Throwable th) {
        String str = this.d;
        String strA = qjs.a(th);
        qom qomVar = this.c;
        String str2 = qomVar.b;
        qku qkuVar = qomVar.a;
        boolean z = this.a;
        qkuVar.d(str, strA, -1, str2, z);
        qkuVar.f(Instant.now().toEpochMilli() - this.b, str, strA, -1, str2, z);
    }

    @Override // defpackage.zxe
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        int iMin = Math.min(((yyk) obj).size(), 10);
        qom qomVar = this.c;
        qku qkuVar = qomVar.a;
        String str = qomVar.b;
        String str2 = this.d;
        boolean z = this.a;
        qkuVar.d(str2, "OK", iMin, str, z);
        qkuVar.f(Instant.now().toEpochMilli() - this.b, str2, "OK", iMin, str, z);
    }
}
