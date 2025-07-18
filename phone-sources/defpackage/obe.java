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
/* loaded from: classes2.dex */
public abstract class obe extends oat implements nwj, obf {
    private static volatile Executor a;
    public final oav M;
    public final Set N;
    private final Account b;

    protected obe(Context context, Looper looper, int i, oav oavVar, nyc nycVar, nzw nzwVar) {
        super(context, looper, obi.a(context), nvj.a, i, new pku(nycVar), new pku(nzwVar), oavVar.f);
        this.M = oavVar;
        this.b = oavVar.a;
        Set set = oavVar.c;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (!set.contains((Scope) it.next())) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        this.N = set;
    }

    @Override // defpackage.nwj
    public final Set A() {
        return i() ? this.N : Collections.EMPTY_SET;
    }

    @Override // defpackage.oat
    public final Account K() {
        return this.b;
    }

    @Override // defpackage.oat
    public final nvg[] V() {
        return new nvg[0];
    }

    @Override // defpackage.oat, defpackage.nwj
    public int a() {
        throw null;
    }

    @Override // defpackage.oat
    protected final void X() {
    }
}
