package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* renamed from: new, reason: invalid class name */
/* loaded from: classes2.dex */
public final class Cnew implements efu, net {
    private String a = null;

    @Override // defpackage.net
    public final void G(String str) {
        this.a = str;
    }

    @Override // defpackage.efu
    public final Uri a(Uri uri) {
        return eci.o(uri, "cpn");
    }

    @Override // defpackage.efu
    public final eey b(eey eeyVar) {
        return this.a == null ? eeyVar : eeyVar.c(eeyVar.a.buildUpon().appendQueryParameter("cpn", this.a).build());
    }
}
