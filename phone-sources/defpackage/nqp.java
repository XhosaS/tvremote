package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class nqp implements nqk {
    final /* synthetic */ nqr a;
    final /* synthetic */ obl b;

    public nqp(nqr nqrVar, obl oblVar) {
        this.b = oblVar;
        this.a = nqrVar;
    }

    @Override // defpackage.nqk
    public final void a(Bitmap bitmap) throws Resources.NotFoundException {
        obl oblVar = this.b;
        oblVar.b = bitmap;
        nqr nqrVar = this.a;
        nqrVar.g = oblVar;
        nqrVar.a();
    }
}
