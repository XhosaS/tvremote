package defpackage;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Queue;

/* compiled from: PG */
/* loaded from: classes.dex */
public class dev implements dep {
    private final File b;
    private czi d;
    private final det c = new det();
    private final dfe a = new dfe();

    @Deprecated
    public dev(File file) {
        this.b = file;
    }

    private final synchronized czi d() {
        if (this.d == null) {
            File file = this.b;
            File file2 = new File(file, "journal.bkp");
            if (file2.exists()) {
                File file3 = new File(file, "journal");
                if (file3.exists()) {
                    file2.delete();
                } else {
                    czi.g(file2, file3, false);
                }
            }
            czi cziVar = new czi(file);
            if (cziVar.b.exists()) {
                try {
                    cziVar.e();
                    czi.d(cziVar.c);
                    Iterator it = cziVar.g.values().iterator();
                    while (it.hasNext()) {
                        czg czgVar = (czg) it.next();
                        if (czgVar.f == null) {
                            for (int i = 0; i < cziVar.d; i = 1) {
                                cziVar.e += czgVar.b[0];
                            }
                        } else {
                            czgVar.f = null;
                            for (int i2 = 0; i2 < cziVar.d; i2 = 1) {
                                czi.d(czgVar.c[0]);
                                czi.d(czgVar.d[0]);
                            }
                            it.remove();
                        }
                    }
                } catch (IOException e) {
                    System.out.println("DiskLruCache " + file.toString() + " is corrupt: " + e.getMessage() + ", removing");
                    cziVar.c();
                }
                this.d = cziVar;
            } else {
                file.mkdirs();
                cziVar = new czi(file);
                cziVar.f();
                this.d = cziVar;
            }
        }
        return this.d;
    }

    private final synchronized void e() {
        this.d = null;
    }

    @Override // defpackage.dep
    public final File a(daj dajVar) {
        String strA = this.a.a(dajVar);
        if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
            Log.v("DiskLruCacheWrapper", a.r(dajVar, strA, "Get: Obtained: ", " for for Key: "));
        }
        try {
            czh czhVarA = d().a(strA);
            if (czhVarA != null) {
                return czhVarA.a[0];
            }
            return null;
        } catch (IOException e) {
            if (!Log.isLoggable("DiskLruCacheWrapper", 5)) {
                return null;
            }
            Log.w("DiskLruCacheWrapper", "Unable to get from disk cache", e);
            return null;
        }
    }

    @Override // defpackage.dep
    public final synchronized void b() {
        try {
            try {
                d().c();
            } catch (IOException e) {
                if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                    Log.w("DiskLruCacheWrapper", "Unable to clear disk cache or disk cache cleared externally", e);
                }
            }
        } finally {
            e();
        }
    }

    @Override // defpackage.dep
    public final void c(daj dajVar, dcc dccVar) {
        der derVar;
        File file;
        der derVar2;
        String strA = this.a.a(dajVar);
        det detVar = this.c;
        synchronized (detVar) {
            derVar = (der) detVar.a.get(strA);
            if (derVar == null) {
                Queue queue = detVar.b.a;
                synchronized (queue) {
                    derVar2 = (der) queue.poll();
                }
                derVar = derVar2 == null ? new der() : derVar2;
                detVar.a.put(strA, derVar);
            }
            derVar.b++;
        }
        derVar.a.lock();
        try {
            if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
                Log.v("DiskLruCacheWrapper", a.r(dajVar, strA, "Put: Obtained: ", " for for Key: "));
            }
            try {
                czi cziVarD = d();
                if (cziVarD.a(strA) == null) {
                    czf czfVarJ = cziVarD.j(strA);
                    if (czfVarJ == null) {
                        throw new IllegalStateException(a.j(strA, "Had two simultaneous puts for: "));
                    }
                    try {
                        czi cziVar = czfVarJ.d;
                        synchronized (cziVar) {
                            czg czgVar = czfVarJ.a;
                            if (czgVar.f != czfVarJ) {
                                throw new IllegalStateException();
                            }
                            if (!czgVar.e) {
                                czfVarJ.b[0] = true;
                            }
                            file = czgVar.d[0];
                            cziVar.a.mkdirs();
                        }
                        if (dccVar.a.a(dccVar.b, file, dccVar.c)) {
                            cziVar.b(czfVarJ, true);
                            czfVarJ.c = true;
                        }
                    } finally {
                        czfVarJ.b();
                    }
                }
            } catch (IOException e) {
                if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                    Log.w("DiskLruCacheWrapper", "Unable to put to disk cache", e);
                }
            }
        } finally {
            this.c.a(strA);
        }
    }
}
