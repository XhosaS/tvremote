package defpackage;

import android.database.Cursor;
import android.net.Uri;
import android.os.CancellationSignal;

/* compiled from: PG */
/* loaded from: classes2.dex */
class vxa implements upx {
    final /* synthetic */ Uri a;
    final /* synthetic */ String[] b;
    final /* synthetic */ vxe c;

    public vxa(vxe vxeVar, Uri uri, String[] strArr) {
        this.a = uri;
        this.b = strArr;
        this.c = vxeVar;
    }

    @Override // defpackage.upx
    public final Cursor a(CancellationSignal cancellationSignal) {
        return this.c.a.c(this.a, this.b, cancellationSignal);
    }

    @Override // defpackage.upx
    public final String b() {
        return vsw.d(this.b, this.a, null, null);
    }

    @Override // defpackage.upx
    public final void c() {
    }
}
