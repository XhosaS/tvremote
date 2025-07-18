package defpackage;

import android.content.Context;
import android.view.LayoutInflater;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ifn implements ixf, idy {
    public ifn(ldv ldvVar) {
        ldvVar.getClass();
    }

    @Override // defpackage.ixf
    public final void a(wkg wkgVar, Context context, String str, String str2) {
        if (!(hju.F(context) instanceof ldz)) {
            krd.b("Calling activity unable to handle auth");
            return;
        }
        LayoutInflater.Factory factoryF = hju.F(context);
        factoryF.getClass();
        ((ldz) factoryF).G();
    }

    @Override // defpackage.idy
    public final /* synthetic */ void c(Object obj) {
        ((ieg) obj).getClass();
    }

    @Override // defpackage.ixf
    public final /* synthetic */ void b() {
    }
}
