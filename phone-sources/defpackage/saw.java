package defpackage;

import android.accounts.Account;
import android.content.Context;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class saw {
    private final ttm a;
    private final ttm b;
    private final Context c;
    private final tdt d;
    private final String e;
    private final tdu f;
    private final String g;
    private final long h;
    private final String i;
    private final String j;
    private tst m;
    private final Map l = new HashMap();
    private final Queue k = new ArrayDeque();
    private tdn n = new tdn();

    public saw(ttm ttmVar, ttm ttmVar2, Context context, tdt tdtVar, String str, tdu tduVar, String str2, long j, String str3, String str4) {
        this.a = ttmVar;
        this.c = context;
        this.b = ttmVar2;
        this.d = tdtVar;
        this.e = str;
        this.f = tduVar;
        this.g = str2;
        this.h = j;
        this.i = str3;
        this.j = str4;
    }

    private final void d(tdl tdlVar) {
        while (true) {
            Queue queue = this.k;
            if (queue.isEmpty()) {
                return;
            } else {
                tdlVar.b(f((rzy) queue.remove()));
            }
        }
    }

    private final void e() {
        tst tstVar = (tst) this.b.get();
        if (tstVar.equals(this.m)) {
            return;
        }
        this.m = tstVar;
        this.n = tstVar.g() ? new tdn((uir) this.m.c()) : new tdn();
    }

    private final tdw f(rzy rzyVar) {
        tdw tdwVar = new tdw();
        tdwVar.c = this.n;
        tdwVar.a = (byte[]) rzyVar.a;
        tdwVar.b = "";
        tdwVar.e = (whi) rzyVar.b;
        return tdwVar;
    }

    final tdl a() {
        Account account = (Account) ((tst) this.a.get()).f();
        Map map = this.l;
        tdl tdlVar = (tdl) map.get(account);
        if (tdlVar != null) {
            return tdlVar;
        }
        Context context = this.c;
        tds tdsVarC = tdv.c();
        tdsVarC.a = context;
        tdsVarC.b = null;
        tdsVarC.c = this.e;
        tdsVarC.d = this.f;
        tdsVarC.e = this.g;
        tdsVarC.b(this.h);
        tdsVarC.g = this.i;
        tdsVarC.h = this.j;
        tdsVarC.j = this.d;
        tdsVarC.m = true;
        tdsVarC.c();
        if (account != null) {
            tdsVarC.k = account;
        }
        tdv tdvVarA = tdsVarC.a();
        map.put(account, tdvVarA);
        return tdvVarA;
    }

    public final synchronized void b() {
        tdl tdlVarA = a();
        e();
        d(tdlVarA);
        tdlVarA.a(null);
    }

    public final synchronized void c(byte[] bArr, whi whiVar) {
        rzy rzyVar = new rzy(bArr, whiVar);
        if (!((tst) this.a.get()).g()) {
            this.k.add(rzyVar);
            return;
        }
        tdl tdlVarA = a();
        e();
        d(tdlVarA);
        tdlVarA.b(f(rzyVar));
    }
}
