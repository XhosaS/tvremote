package defpackage;

import android.accounts.Account;
import java.util.Iterator;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class oum implements ouk {
    public static final zdy a = zdy.h("com/google/android/libraries/home/auth/AuthServiceRequestRunnerImpl");
    public final oug b;
    public final ScheduledExecutorService c;
    public boolean d;
    public final oun e;
    public final ouh f;
    private final fza g;

    public oum(fza fzaVar, oun ounVar, oty otyVar, ouh ouhVar, oug ougVar, ScheduledExecutorService scheduledExecutorService) {
        ounVar.getClass();
        otyVar.getClass();
        ougVar.getClass();
        this.g = fzaVar;
        this.e = ounVar;
        this.f = ouhVar;
        this.b = ougVar;
        this.c = scheduledExecutorService;
    }

    @Override // defpackage.ouk
    public final void a() {
        uea.c();
        this.d = true;
        this.f.a();
    }

    @Override // defpackage.ouk
    public final void b() {
        uea.c();
        this.f.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ouk
    public final void c(oui ouiVar, ouj oujVar) {
        oujVar.getClass();
        String strA = ouiVar.a();
        Account account = null;
        if (strA == null) {
            Account accountC = this.g.a.c();
            strA = accountC != null ? accountC.name : null;
        }
        ouiVar.d(strA);
        fza fzaVar = this.g;
        if (strA != null) {
            Iterator it = fzaVar.a.n().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (agvy.c(strA, ((Account) next).name)) {
                    account = next;
                    break;
                }
            }
            account = account;
        }
        if (ouiVar.b() == null) {
            oujVar.b(ouiVar);
        } else if (account == null) {
            oujVar.a(ouiVar, "No user account");
        } else {
            this.c.execute(new oul(this, ouiVar, oujVar, account));
        }
    }
}
