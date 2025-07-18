package defpackage;

import android.os.Handler;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ft {
    public final Object a;
    public boolean b;
    public final Object c;

    public ft(Handler handler, ele eleVar) {
        this.c = handler;
        this.a = eleVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, yqe] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, yrz] */
    public final void a() {
        this.c.t(new CancellationException("onBack cancelled"));
        this.a.t(null);
    }

    public final void b() {
        this.b = false;
    }

    public final boolean c(long j) {
        Object obj;
        List list = ((cpw) this.a).c;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = list.get(i);
            if (a.s(((btb) obj).a, j)) {
                break;
            }
            i++;
        }
        btb btbVar = (btb) obj;
        if (btbVar != null) {
            return btbVar.h;
        }
        return false;
    }

    public ft(jn jnVar, cpw cpwVar) {
        this.c = jnVar;
        this.a = cpwVar;
    }

    public ft(Executor executor) {
        executor.getClass();
        this.a = new Object();
        this.c = new ArrayList();
    }

    public ft(yow yowVar, boolean z, yjz yjzVar, fv fvVar) {
        this.b = z;
        this.c = vyf.R(-2, 1, 4);
        this.a = ykr.q(yowVar, null, 0, new mdr(fvVar, yjzVar, this, (yih) null, 1), 3);
    }
}
