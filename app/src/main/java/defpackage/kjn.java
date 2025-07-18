package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class kjn extends kiz implements keg {
    private static volatile Executor t;
    private final Set u;
    private final Account v;

    protected kjn(Context context, Looper looper, int i, kjd kjdVar, kgd kgdVar, khm khmVar) {
        super(context, looper, kjp.b(context), kcx.a, i, new kjl(kgdVar), new kjm(khmVar), kjdVar.e);
        this.v = kjdVar.a;
        Set set = kjdVar.c;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (!set.contains((Scope) it.next())) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        this.u = set;
    }

    @Override // defpackage.kiz
    public final Feature[] G() {
        return new Feature[0];
    }

    @Override // defpackage.kiz, defpackage.keg
    public int a() {
        throw null;
    }

    @Override // defpackage.keg
    public final Set j() {
        return o() ? this.u : Collections.EMPTY_SET;
    }

    @Override // defpackage.kiz
    public final Account t() {
        return this.v;
    }

    @Override // defpackage.kiz
    protected final Set x() {
        return this.u;
    }

    @Override // defpackage.kiz
    protected final void I() {
    }
}
