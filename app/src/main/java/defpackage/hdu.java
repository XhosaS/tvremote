package defpackage;

import android.accounts.Account;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hdu implements zxe {
    final /* synthetic */ hec a;
    final /* synthetic */ Account b;

    public hdu(hec hecVar, Account account) {
        this.a = hecVar;
        this.b = account;
    }

    @Override // defpackage.zxe
    public final void a(Throwable th) {
        th.getClass();
    }

    @Override // defpackage.zxe
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        ymc ymcVar = (ymc) obj;
        ymcVar.getClass();
        if ((ymcVar.b & 32) != 0) {
            this.a.f(this.b);
        }
    }
}
