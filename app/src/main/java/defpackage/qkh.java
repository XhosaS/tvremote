package defpackage;

import android.graphics.Bitmap;

/* compiled from: PG */
/* loaded from: classes2.dex */
class qkh implements zxe {
    final /* synthetic */ dav a;

    public qkh(dav davVar) {
        this.a = davVar;
    }

    @Override // defpackage.zxe
    public final void a(Throwable th) {
        this.a.e(th instanceof Exception ? (Exception) th : new Exception(th));
    }

    @Override // defpackage.zxe
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        this.a.b((Bitmap) obj);
    }
}
