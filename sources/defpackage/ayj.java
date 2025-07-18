package defpackage;

import android.content.Context;
import java.io.File;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class ayj implements byo {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ ayj(Object obj, Object obj2, int i) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [cov, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object, java.util.concurrent.ConcurrentMap] */
    /* JADX WARN: Type inference failed for: r0v37, types: [java.lang.Object, java.util.concurrent.ConcurrentMap] */
    @Override // defpackage.byo
    public final Object aL() {
        int i = this.c;
        if (i == 0) {
            int i2 = ayk.a;
            return ((att) this.a).b(((ayh) this.b.a()).a);
        }
        if (i != 1) {
            if (i == 2) {
                return ((cga) ((bzt) this.a).c).b(((ckv) this.b).t());
            }
            if (i != 3) {
                Set set = (Set) ((bck) this.b).a.c.get(((adh) this.a).h);
                return set != null ? set : cbd.a;
            }
            adh adhVar = (adh) this.a;
            Set set2 = (Set) ((bck) this.b).a.e.get(new byh(adhVar.h, adhVar.g));
            return set2 != null ? set2 : cbd.a;
        }
        Object obj = this.a;
        synchronized (this.b) {
            String strB = atb.b();
            String str = strB + ".trace";
            File file = new File(((Context) obj).getFilesDir(), b.g(strB, "primes_profiling_"));
            if (!file.exists() && !file.mkdir()) {
                ((cbs) aqn.a.b().j("com/google/android/libraries/performance/primes/metrics/cpuprofiling/CpuProfilingService", "<init>", 117, "CpuProfilingService.java")).p("Could not create directory");
                return bxw.a;
            }
            File file2 = new File(file, str);
            file2.deleteOnExit();
            try {
                if (file2.exists()) {
                    file2.delete();
                }
            } catch (RuntimeException e) {
                ((cbs) ((cbs) aqn.a.b().i(e)).j("com/google/android/libraries/performance/primes/metrics/cpuprofiling/CpuProfilingService", "clearFileAndSwallowResultingExceptions", 368, "CpuProfilingService.java")).p("Exception when clearing trace file.");
            }
            return byg.h(file2);
        }
    }

    public /* synthetic */ ayj(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }
}
