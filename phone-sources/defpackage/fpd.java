package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fpd implements uha {
    final /* synthetic */ eab a;
    final /* synthetic */ String b;
    final /* synthetic */ Uri c;
    final /* synthetic */ long d;
    final /* synthetic */ fpe e;

    public fpd(fpe fpeVar, eab eabVar, String str, Uri uri, long j) {
        this.a = eabVar;
        this.b = str;
        this.c = uri;
        this.d = j;
        this.e = fpeVar;
    }

    @Override // defpackage.uha
    public final void a(Throwable th) {
        if (this != this.e.a.g) {
            return;
        }
        edb.e("MediaSessionLegacyStub", fph.c(th));
    }

    @Override // defpackage.uha
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        fph fphVar = this.e.a;
        if (this != fphVar.g) {
            return;
        }
        fphVar.d.h(fnm.f(this.a, this.b, this.c, this.d, bitmap));
        foo fooVar = fphVar.b;
        edt.aB(fooVar.m, new ehq(2));
    }
}
