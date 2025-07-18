package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Scope;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class aij extends aib implements afx {
    private static volatile Executor t;
    public final Set s;
    private final Account u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected aij(Context context, Looper looper, int i, aid aidVar, agx agxVar, ahl ahlVar) {
        super(context, looper, ail.h, aeu.a, i, new byj(agxVar, null), new byj(ahlVar, null), aidVar.e);
        synchronized (ail.a) {
            if (ail.h == null) {
                ail.h = new ail(context.getApplicationContext(), context.getMainLooper());
            }
        }
        this.u = aidVar.a;
        Set set = aidVar.c;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (!set.contains((Scope) it.next())) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        this.s = set;
    }

    @Override // defpackage.aib
    public final aes[] B() {
        return new aes[0];
    }

    @Override // defpackage.aib, defpackage.afx
    public int a() {
        throw null;
    }

    @Override // defpackage.afx
    public final Set g() {
        return l() ? this.s : Collections.EMPTY_SET;
    }

    @Override // defpackage.aib
    public final Account r() {
        return this.u;
    }

    @Override // defpackage.aib
    protected final void D() {
    }
}
