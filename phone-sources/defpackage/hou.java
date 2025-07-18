package defpackage;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hou implements hos {
    private final File a;
    private hkm b;
    private final fse d = new fse((byte[]) null, (byte[]) null, (byte[]) null);
    private final fse c = new fse((char[]) null);

    @Deprecated
    public hou(File file) {
        this.a = file;
    }

    private final synchronized hkm c() {
        if (this.b == null) {
            File file = this.a;
            File file2 = new File(file, "journal.bkp");
            if (file2.exists()) {
                File file3 = new File(file, "journal");
                if (file3.exists()) {
                    file2.delete();
                } else {
                    hkm.e(file2, file3, false);
                }
            }
            hkm hkmVar = new hkm(file);
            if (hkmVar.b.exists()) {
                try {
                    hkmVar.c();
                    hkm.b(hkmVar.c);
                    Iterator it = hkmVar.g.values().iterator();
                    while (it.hasNext()) {
                        hkl hklVar = (hkl) it.next();
                        if (hklVar.f == null) {
                            for (int i = 0; i < hkmVar.d; i = 1) {
                                hkmVar.e += hklVar.b[0];
                            }
                        } else {
                            hklVar.f = null;
                            for (int i2 = 0; i2 < hkmVar.d; i2 = 1) {
                                hkm.b(hklVar.c());
                                hkm.b(hklVar.d());
                            }
                            it.remove();
                        }
                    }
                } catch (IOException e) {
                    System.out.println("DiskLruCache " + file.toString() + " is corrupt: " + e.getMessage() + ", removing");
                    hkmVar.close();
                    hkp.b(hkmVar.a);
                }
                this.b = hkmVar;
            } else {
                file.mkdirs();
                hkmVar = new hkm(file);
                hkmVar.d();
                this.b = hkmVar;
            }
        }
        return this.b;
    }

    @Override // defpackage.hos
    public final File a(hlg hlgVar) {
        try {
            hfx hfxVarJ = c().j(this.c.J(hlgVar));
            if (hfxVarJ != null) {
                return ((File[]) hfxVarJ.a)[0];
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

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.concurrent.locks.Lock] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object, java.util.Queue] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v3, types: [hkw, java.lang.Object] */
    @Override // defpackage.hos
    public final void b(hlg hlgVar, cvi cviVar) {
        zlj zljVar;
        File fileD;
        zlj zljVar2;
        fse fseVar = this.d;
        String strJ = this.c.J(hlgVar);
        synchronized (fseVar) {
            zljVar = (zlj) fseVar.b.get(strJ);
            if (zljVar == null) {
                ?? r1 = ((hfx) fseVar.a).a;
                synchronized (r1) {
                    zljVar2 = (zlj) r1.poll();
                }
                zljVar = zljVar2 == null ? new zlj((char[]) null) : zljVar2;
                fseVar.b.put(strJ, zljVar);
            }
            zljVar.a++;
        }
        zljVar.b.lock();
        try {
            try {
                hkm hkmVarC = c();
                if (hkmVarC.j(strJ) == null) {
                    hkk hkkVarH = hkmVarC.h(strJ);
                    if (hkkVarH == null) {
                        throw new IllegalStateException(a.cr(strJ, "Had two simultaneous puts for: "));
                    }
                    try {
                        hkm hkmVar = hkkVarH.d;
                        synchronized (hkmVar) {
                            hkl hklVar = hkkVarH.a;
                            if (hklVar.f != hkkVarH) {
                                throw new IllegalStateException();
                            }
                            if (!hklVar.e) {
                                hkkVarH.b[0] = true;
                            }
                            fileD = hklVar.d();
                            hkmVar.a.mkdirs();
                        }
                        if (cviVar.c.a(cviVar.b, fileD, (hll) cviVar.a)) {
                            hkmVar.a(hkkVarH, true);
                            hkkVarH.c = true;
                        }
                    } finally {
                        hkkVarH.b();
                    }
                }
            } catch (IOException e) {
                if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                    Log.w("DiskLruCacheWrapper", "Unable to put to disk cache", e);
                }
            }
        } finally {
            this.d.K(strJ);
        }
    }
}
