package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* compiled from: PG */
/* loaded from: classes.dex */
public class cqm {
    public static Executor a = Executors.newCachedThreadPool();
    private final Set c = new LinkedHashSet(1);
    private final Set d = new LinkedHashSet(1);
    private final Handler e = new Handler(Looper.getMainLooper());
    public volatile cqj b = null;

    public cqm(Callable callable, boolean z) {
        if (!z) {
            a.execute(new cql(this, callable));
            return;
        }
        try {
            c((cqj) callable.call());
        } catch (Throwable th) {
            c(new cqj(th));
        }
    }

    public final synchronized void a(Throwable th) {
        ArrayList arrayList = new ArrayList(this.d);
        if (arrayList.isEmpty()) {
            cwr.a("Lottie encountered an error but no failure listener was added:", th);
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((cqf) arrayList.get(i)).a(th);
        }
    }

    public final synchronized void b(Object obj) {
        ArrayList arrayList = new ArrayList(this.c);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((cqf) arrayList.get(i)).a(obj);
        }
    }

    public final void c(cqj cqjVar) {
        if (this.b != null) {
            throw new IllegalStateException("A task may only be set once.");
        }
        this.b = cqjVar;
        this.e.post(new Runnable() { // from class: cqk
            @Override // java.lang.Runnable
            public final void run() {
                cqm cqmVar = this.a;
                cqj cqjVar2 = cqmVar.b;
                if (cqjVar2 == null) {
                    return;
                }
                Object obj = cqjVar2.a;
                if (obj != null) {
                    cqmVar.b(obj);
                } else {
                    cqmVar.a(cqjVar2.b);
                }
            }
        });
    }

    public final synchronized void d(cqf cqfVar) {
        Throwable th;
        cqj cqjVar = this.b;
        if (cqjVar != null && (th = cqjVar.b) != null) {
            cqfVar.a(th);
        }
        this.d.add(cqfVar);
    }

    public final synchronized void e(cqf cqfVar) {
        Object obj;
        cqj cqjVar = this.b;
        if (cqjVar != null && (obj = cqjVar.a) != null) {
            cqfVar.a(obj);
        }
        this.c.add(cqfVar);
    }

    public final synchronized void f(cqf cqfVar) {
        this.d.remove(cqfVar);
    }

    public final synchronized void g(cqf cqfVar) {
        this.c.remove(cqfVar);
    }
}
