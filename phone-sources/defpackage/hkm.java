package defpackage;

import android.os.Build;
import android.os.StrictMode;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hkm implements Closeable {
    public final File a;
    public final File b;
    public final File c;
    public Writer f;
    public int h;
    private final File j;
    public long e = 0;
    public final LinkedHashMap g = new LinkedHashMap(0, 0.75f, true);
    private long m = 0;
    final ThreadPoolExecutor i = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new hkj());
    private final Callable n = new hki(this);
    private final int k = 1;
    public final int d = 1;
    private final long l = 262144000;

    public hkm(File file) {
        this.a = file;
        this.b = new File(file, "journal");
        this.c = new File(file, "journal.tmp");
        this.j = new File(file, "journal.bkp");
    }

    public static void b(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    public static void e(File file, File file2, boolean z) throws IOException {
        if (z) {
            b(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    private final void k() {
        if (this.f == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    private static void l(Writer writer) throws IOException {
        if (Build.VERSION.SDK_INT < 26) {
            writer.close();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.close();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    private static void m(Writer writer) throws IOException {
        if (Build.VERSION.SDK_INT < 26) {
            writer.flush();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.flush();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public final synchronized void a(hkk hkkVar, boolean z) {
        hkl hklVar = hkkVar.a;
        if (hklVar.f != hkkVar) {
            throw new IllegalStateException();
        }
        if (z && !hklVar.e) {
            for (int i = 0; i < this.d; i = 1) {
                if (!hkkVar.b[0]) {
                    hkkVar.a();
                    throw new IllegalStateException("Newly created entry didn't create value for index 0");
                }
                if (!hklVar.d().exists()) {
                    hkkVar.a();
                    return;
                }
            }
        }
        for (int i2 = 0; i2 < this.d; i2 = 1) {
            File fileD = hklVar.d();
            if (!z) {
                b(fileD);
            } else if (fileD.exists()) {
                File fileC = hklVar.c();
                fileD.renameTo(fileC);
                long[] jArr = hklVar.b;
                long j = jArr[0];
                long length = fileC.length();
                jArr[0] = length;
                this.e = (this.e - j) + length;
            }
        }
        this.h++;
        hklVar.f = null;
        if (hklVar.e || z) {
            hklVar.e = true;
            this.f.append((CharSequence) "CLEAN");
            this.f.append(' ');
            this.f.append((CharSequence) hklVar.a);
            this.f.append((CharSequence) hklVar.a());
            this.f.append('\n');
            if (z) {
                this.m++;
            }
        } else {
            LinkedHashMap linkedHashMap = this.g;
            String str = hklVar.a;
            linkedHashMap.remove(str);
            this.f.append((CharSequence) "REMOVE");
            this.f.append(' ');
            this.f.append((CharSequence) str);
            this.f.append('\n');
        }
        m(this.f);
        if (this.e > this.l || g()) {
            this.i.submit(this.n);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00f3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 377
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hkm.c():void");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f == null) {
            return;
        }
        ArrayList arrayList = new ArrayList(this.g.values());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            hkk hkkVar = ((hkl) arrayList.get(i)).f;
            if (hkkVar != null) {
                hkkVar.a();
            }
        }
        f();
        l(this.f);
        this.f = null;
    }

    public final synchronized void d() {
        Writer writer = this.f;
        if (writer != null) {
            l(writer);
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.c), hkp.a));
        try {
            bufferedWriter.write("libcore.io.DiskLruCache");
            bufferedWriter.write("\n");
            bufferedWriter.write("1");
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.k));
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.d));
            bufferedWriter.write("\n");
            bufferedWriter.write("\n");
            for (hkl hklVar : this.g.values()) {
                if (hklVar.f != null) {
                    bufferedWriter.write(a.cg(hklVar.a, "DIRTY ", "\n"));
                } else {
                    bufferedWriter.write("CLEAN " + hklVar.a + hklVar.a() + "\n");
                }
            }
            l(bufferedWriter);
            File file = this.b;
            if (file.exists()) {
                e(file, this.j, true);
            }
            e(this.c, file, false);
            this.j.delete();
            this.f = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, true), hkp.a));
        } catch (Throwable th) {
            l(bufferedWriter);
            throw th;
        }
    }

    public final void f() {
        while (this.e > this.l) {
            i((String) ((Map.Entry) this.g.entrySet().iterator().next()).getKey());
        }
    }

    public final boolean g() {
        int i = this.h;
        return i >= 2000 && i >= this.g.size();
    }

    public final synchronized hkk h(String str) {
        k();
        LinkedHashMap linkedHashMap = this.g;
        hkl hklVar = (hkl) linkedHashMap.get(str);
        if (hklVar == null) {
            hklVar = new hkl(this, str);
            linkedHashMap.put(str, hklVar);
        } else if (hklVar.f != null) {
            return null;
        }
        hkk hkkVar = new hkk(this, hklVar);
        hklVar.f = hkkVar;
        this.f.append((CharSequence) "DIRTY");
        this.f.append(' ');
        this.f.append((CharSequence) str);
        this.f.append('\n');
        m(this.f);
        return hkkVar;
    }

    public final synchronized void i(String str) {
        k();
        LinkedHashMap linkedHashMap = this.g;
        hkl hklVar = (hkl) linkedHashMap.get(str);
        if (hklVar != null && hklVar.f == null) {
            for (int i = 0; i < this.d; i = 1) {
                File fileC = hklVar.c();
                if (fileC.exists() && !fileC.delete()) {
                    throw new IOException("failed to delete ".concat(String.valueOf(String.valueOf(fileC))));
                }
                long j = this.e;
                long[] jArr = hklVar.b;
                this.e = j - jArr[0];
                jArr[0] = 0;
            }
            this.h++;
            this.f.append((CharSequence) "REMOVE");
            this.f.append(' ');
            this.f.append((CharSequence) str);
            this.f.append('\n');
            linkedHashMap.remove(str);
            if (g()) {
                this.i.submit(this.n);
            }
        }
    }

    public final synchronized hfx j(String str) {
        k();
        hkl hklVar = (hkl) this.g.get(str);
        if (hklVar != null && hklVar.e) {
            File[] fileArr = hklVar.c;
            int length = fileArr.length;
            for (int i = 0; i < length; i = 1) {
                if (fileArr[0].exists()) {
                }
            }
            this.h++;
            this.f.append((CharSequence) "READ");
            this.f.append(' ');
            this.f.append((CharSequence) str);
            this.f.append('\n');
            if (g()) {
                this.i.submit(this.n);
            }
            return new hfx(hklVar.c, (byte[]) null);
        }
        return null;
    }
}
