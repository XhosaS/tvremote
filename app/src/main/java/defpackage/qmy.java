package defpackage;

import android.accounts.Account;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
class qmy implements zxe {
    final /* synthetic */ qmz a;

    public qmy(qmz qmzVar) {
        this.a = qmzVar;
    }

    @Override // defpackage.zxe
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        Iterator it = ((List) obj).iterator();
        while (it.hasNext()) {
            this.a.h((Account) it.next());
        }
    }

    @Override // defpackage.zxe
    public final void a(Throwable th) {
    }
}
