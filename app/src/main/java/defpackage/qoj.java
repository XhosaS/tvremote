package defpackage;

import android.graphics.Bitmap;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes2.dex */
class qoj implements zxe {
    final /* synthetic */ boolean a;
    final /* synthetic */ long b;
    final /* synthetic */ qok c;
    final /* synthetic */ int d;
    private final String e;
    private final String f;

    public qoj(qok qokVar, int i, boolean z, long j) {
        this.d = i;
        this.a = z;
        this.b = j;
        this.c = qokVar;
        this.e = qlw.a(qokVar.c);
        String str = i != 32 ? i != 48 ? i != 64 ? i != 120 ? i != 240 ? "null" : "X_LARGE" : "LARGE" : "MEDIUM" : "SMALL" : "TINY";
        if (i == 0) {
            throw null;
        }
        this.f = str;
    }

    @Override // defpackage.zxe
    public final void a(Throwable th) {
        String str = this.f;
        String strA = qjs.a(th);
        qok qokVar = this.c;
        qku qkuVar = qokVar.a;
        String str2 = qokVar.b;
        String str3 = this.e;
        boolean z = this.a;
        qkuVar.c(str3, str, strA, str2, z);
        qkuVar.e(Instant.now().toEpochMilli() - this.b, str3, str, strA, str2, z);
    }

    @Override // defpackage.zxe
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        String str = ((Bitmap) obj) != null ? "OK" : "NULL";
        boolean z = this.a;
        qok qokVar = this.c;
        String str2 = this.f;
        String str3 = this.e;
        qku qkuVar = qokVar.a;
        String str4 = qokVar.b;
        qkuVar.c(str3, str2, str, str4, z);
        qkuVar.e(Instant.now().toEpochMilli() - this.b, str3, str2, str, str4, z);
    }
}
