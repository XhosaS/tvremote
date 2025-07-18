package defpackage;

import android.accounts.Account;
import com.google.common.collect.HashMultimap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jaw implements qqd {
    private final ldv a;

    public jaw(ldv ldvVar) {
        ldvVar.getClass();
        this.a = ldvVar;
    }

    @Override // defpackage.qqd
    public final Object a(yih yihVar) {
        Account[] accountArrU = this.a.u();
        accountArrU.getClass();
        HashMultimap hashMultimapCreate = HashMultimap.create();
        for (Account account : accountArrU) {
            hashMultimapCreate.put(account.name, qqj.a);
            hashMultimapCreate.put(account.name, qqj.b);
        }
        return new qqf(hashMultimapCreate);
    }

    @Override // defpackage.qqd
    public final Object d() {
        return yhb.a;
    }

    @Override // defpackage.qqd
    public final void b() {
    }

    @Override // defpackage.qqd
    public final void c() {
    }
}
