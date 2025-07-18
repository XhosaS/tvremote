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
public final class hcd {
    public static final Executor a = Executors.newCachedThreadPool();
    public volatile hcb b;
    private final Set c;
    private final Set d;
    private final Handler e;

    public hcd(Callable callable) {
        this(callable, false);
    }

    public final synchronized void a(Throwable th) {
        ArrayList arrayList = new ArrayList(this.d);
        if (arrayList.isEmpty()) {
            hhk.b("Lottie encountered an error but no failure listener was added:", th);
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((hbx) arrayList.get(i)).a(th);
        }
    }

    public final synchronized void b(Object obj) {
        ArrayList arrayList = new ArrayList(this.c);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((hbx) arrayList.get(i)).a(obj);
        }
    }

    public final void c(hcb hcbVar) {
        if (this.b != null) {
            throw new IllegalStateException("A task may only be set once.");
        }
        this.b = hcbVar;
        this.e.post(new gfe(this, 11));
    }

    public final synchronized void d(hbx hbxVar) {
        Throwable th;
        hcb hcbVar = this.b;
        if (hcbVar != null && (th = hcbVar.b) != null) {
            hbxVar.a(th);
        }
        this.d.add(hbxVar);
    }

    public final synchronized void e(hbx hbxVar) {
        Object obj;
        hcb hcbVar = this.b;
        if (hcbVar != null && (obj = hcbVar.a) != null) {
            hbxVar.a(obj);
        }
        this.c.add(hbxVar);
    }

    public final synchronized void f(hbx hbxVar) {
        this.d.remove(hbxVar);
    }

    public final synchronized void g(hbx hbxVar) {
        this.c.remove(hbxVar);
    }

    public hcd(Callable callable, boolean z) {
        this.c = new LinkedHashSet(1);
        this.d = new LinkedHashSet(1);
        this.e = new Handler(Looper.getMainLooper());
        this.b = null;
        if (!z) {
            a.execute(new hcc(this, callable));
            return;
        }
        try {
            c((hcb) callable.call());
        } catch (Throwable th) {
            c(new hcb(th));
        }
    }
}
