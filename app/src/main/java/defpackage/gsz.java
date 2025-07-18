package defpackage;

import android.accounts.Account;
import com.google.common.collect.Sets;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gsz {
    private final agow a;
    private final hag b;
    private boolean c;
    private Set d;

    public gsz(agow agowVar, hag hagVar) {
        hagVar.getClass();
        this.a = agowVar;
        this.b = hagVar;
        Set setF = Sets.f();
        setF.getClass();
        this.d = setF;
    }

    public final void a(Account account) {
        if (account == null) {
            this.c = true;
        } else {
            this.d = agrp.c(this.d, account);
        }
        if (this.b == hag.g) {
            ((ffp) this.a.a()).d(account);
        }
    }

    public final boolean b(Account account) {
        return account == null ? this.c : this.d.contains(account);
    }
}
