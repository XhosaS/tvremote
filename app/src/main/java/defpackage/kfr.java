package defpackage;

import com.google.android.gms.common.ConnectionResult;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kfr {
    private int d;
    private final we c = new we();
    public final lvj b = new lvj();
    private boolean e = false;
    public final we a = new we();

    public kfr(Iterable iterable) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            this.a.put(((kew) it.next()).e(), null);
        }
        this.d = ((wa) this.a.keySet()).a.d;
    }

    public final void a(kfq kfqVar, ConnectionResult connectionResult, String str) {
        we weVar = this.a;
        weVar.put(kfqVar, connectionResult);
        we weVar2 = this.c;
        weVar2.put(kfqVar, str);
        this.d--;
        if (!connectionResult.c()) {
            this.e = true;
        }
        if (this.d == 0) {
            if (!this.e) {
                this.b.a.p(weVar2);
            } else {
                this.b.a.o(new ken(weVar));
            }
        }
    }
}
