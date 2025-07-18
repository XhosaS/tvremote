package defpackage;

import android.os.Process;
import android.os.StrictMode;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mgs implements mgr {
    private final Map b = new ConcurrentHashMap();
    private final mgl c;
    private final AtomicInteger d;
    private final AtomicInteger e;
    private volatile mgj f;

    public mgs(mgl mglVar) {
        new ConcurrentHashMap();
        this.d = new AtomicInteger();
        this.e = new AtomicInteger();
        this.c = mglVar;
        this.f = mgj.d;
    }

    @Override // defpackage.mgr
    public final void a() {
        this.e.getAndIncrement();
    }

    @Override // defpackage.mgr
    public final void b() {
        this.d.getAndIncrement();
    }

    @Override // defpackage.mgr
    public final void c(long j) {
        mgk mgkVar = (mgk) this.b.remove(Long.valueOf(j));
        if (mgkVar != null) {
            int iA = mgkVar.a();
            StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
            try {
                mgj mgjVarA = mgi.a(new File(String.format(Locale.US, "/proc/self/task/%d/schedstat", Integer.valueOf(iA))));
                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                if (mgjVarA != mgj.d) {
                    mgf mgfVar = (mgf) this.f;
                    mgf mgfVar2 = (mgf) mgjVarA;
                    this.f = new mgf(mgfVar.a + mgfVar2.a, mgfVar.b + mgfVar2.b, mgfVar.c + mgfVar2.c);
                }
            } catch (Throwable th) {
                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                throw th;
            }
        }
    }

    @Override // defpackage.mgr
    public final void d(long j) {
        Map map = this.b;
        Long lValueOf = Long.valueOf(j);
        if (map.containsKey(lValueOf)) {
            return;
        }
        map.put(lValueOf, new mgg(Process.myTid(), j, Thread.currentThread().getName(), ((mgh) this.c).a));
    }
}
