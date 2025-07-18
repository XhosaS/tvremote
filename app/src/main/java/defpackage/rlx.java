package defpackage;

import android.content.Context;
import android.util.Log;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rlx {
    public final yrp a;
    private final Context c;
    private final yrp d;
    private final yrp e;
    private volatile int f = 0;
    public final CopyOnWriteArrayList b = new CopyOnWriteArrayList();
    private final Object g = new Object();
    private volatile zyd h = null;

    public rlx(Context context, yrp yrpVar, yrp yrpVar2, yrp yrpVar3) {
        this.c = context;
        this.d = yrpVar;
        this.e = yrpVar2;
        this.a = yrpVar3;
    }

    public final void a(aags aagsVar, rlv rlvVar) {
        final zyd zydVarK;
        final rmj rmjVar = (rmj) this.e.eV();
        if (rmjVar == null) {
            zyd zydVar = zxy.a;
            return;
        }
        int i = 1 << aagsVar.h;
        if ((this.f & i) == 0) {
            CopyOnWriteArrayList copyOnWriteArrayList = this.b;
            synchronized (copyOnWriteArrayList) {
                int i2 = this.f;
                if ((i2 & i) == 0) {
                    copyOnWriteArrayList.add(rlvVar);
                    this.f = i | i2;
                }
            }
        }
        if (this.h == null) {
            synchronized (this.g) {
                if (this.h == null) {
                    Context context = this.c;
                    if (mhv.g(context)) {
                        Runnable runnable = new Runnable() { // from class: rls
                            @Override // java.lang.Runnable
                            public final void run() {
                            }
                        };
                        yrp yrpVar = this.d;
                        zydVarK = zuz.h(mhv.c(context, Executors.callable(runnable, null), (Executor) yrpVar.eV()), new zvi() { // from class: rlt
                            @Override // defpackage.zvi
                            public final zyd a(Object obj) {
                                rlx rlxVar = this.a;
                                return ((rgy) rlxVar.a.eV()).k(new rlw(rlxVar, rmjVar));
                            }
                        }, (Executor) yrpVar.eV());
                        this.h = zydVarK;
                    } else {
                        zydVarK = ((rgy) this.a.eV()).k(new rlw(this, rmjVar));
                        this.h = zydVarK;
                    }
                    zydVarK.d(new Runnable() { // from class: rlu
                        @Override // java.lang.Runnable
                        public final void run() {
                            try {
                                zxn.o(zydVarK);
                            } catch (Exception e) {
                                Log.w("PhFlagUpdateRegistry", "Failed to register flag update listener which may lead to stale flags.", e);
                            }
                        }
                    }, (Executor) this.d.eV());
                }
            }
        }
    }
}
