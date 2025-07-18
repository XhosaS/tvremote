package defpackage;

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
public final class czi implements Closeable {
    public final File a;
    public final File b;
    public final File c;
    public Writer f;
    public int h;
    private final File j;
    public long e = 0;
    public final LinkedHashMap g = new LinkedHashMap(0, 0.75f, true);
    private long m = 0;
    final ThreadPoolExecutor i = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new cze());
    private final Callable n = new czd(this);
    private final int k = 1;
    public final int d = 1;
    private final long l = 262144000;

    public czi(File file) {
        this.a = file;
        this.b = new File(file, "journal");
        this.c = new File(file, "journal.tmp");
        this.j = new File(file, "journal.bkp");
    }

    public static void d(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    public static void g(File file, File file2, boolean z) throws IOException {
        if (z) {
            d(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    private final void l() {
        if (this.f == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    private static void m(Writer writer) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.close();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    private static void n(Writer writer) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.flush();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public final synchronized czh a(String str) {
        l();
        czg czgVar = (czg) this.g.get(str);
        if (czgVar != null && czgVar.e) {
            File[] fileArr = czgVar.c;
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
            if (i()) {
                this.i.submit(this.n);
            }
            return new czh(czgVar.c);
        }
        return null;
    }

    public final synchronized void b(czf czfVar, boolean z) {
        czg czgVar = czfVar.a;
        if (czgVar.f != czfVar) {
            throw new IllegalStateException();
        }
        if (z && !czgVar.e) {
            for (int i = 0; i < this.d; i = 1) {
                if (!czfVar.b[0]) {
                    czfVar.a();
                    throw new IllegalStateException("Newly created entry didn't create value for index 0");
                }
                if (!czgVar.d[0].exists()) {
                    czfVar.a();
                    return;
                }
            }
        }
        for (int i2 = 0; i2 < this.d; i2 = 1) {
            File file = czgVar.d[0];
            if (!z) {
                d(file);
            } else if (file.exists()) {
                File file2 = czgVar.c[0];
                file.renameTo(file2);
                long[] jArr = czgVar.b;
                long j = jArr[0];
                long length = file2.length();
                jArr[0] = length;
                this.e = (this.e - j) + length;
            }
        }
        this.h++;
        czgVar.f = null;
        if (czgVar.e || z) {
            czgVar.e = true;
            this.f.append((CharSequence) "CLEAN");
            this.f.append(' ');
            this.f.append((CharSequence) czgVar.a);
            this.f.append((CharSequence) czgVar.b());
            this.f.append('\n');
            if (z) {
                this.m++;
            }
        } else {
            LinkedHashMap linkedHashMap = this.g;
            String str = czgVar.a;
            linkedHashMap.remove(str);
            this.f.append((CharSequence) "REMOVE");
            this.f.append(' ');
            this.f.append((CharSequence) str);
            this.f.append('\n');
        }
        n(this.f);
        if (this.e > this.l || i()) {
            this.i.submit(this.n);
        }
    }

    public final void c() throws IOException {
        close();
        czl.b(this.a);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f == null) {
            return;
        }
        ArrayList arrayList = new ArrayList(this.g.values());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            czf czfVar = ((czg) arrayList.get(i)).f;
            if (czfVar != null) {
                czfVar.a();
            }
        }
        h();
        m(this.f);
        this.f = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00f3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 376
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.czi.e():void");
    }

    public final synchronized void f() {
        Writer writer = this.f;
        if (writer != null) {
            m(writer);
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.c), czl.a));
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
            for (czg czgVar : this.g.values()) {
                if (czgVar.f != null) {
                    bufferedWriter.write(a.e(czgVar.a, "DIRTY ", "\n"));
                } else {
                    bufferedWriter.write("CLEAN " + czgVar.a + czgVar.b() + "\n");
                }
            }
            m(bufferedWriter);
            File file = this.b;
            if (file.exists()) {
                g(file, this.j, true);
            }
            g(this.c, file, false);
            this.j.delete();
            this.f = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, true), czl.a));
        } catch (Throwable th) {
            m(bufferedWriter);
            throw th;
        }
    }

    public final void h() {
        while (this.e > this.l) {
            k((String) ((Map.Entry) this.g.entrySet().iterator().next()).getKey());
        }
    }

    public final boolean i() {
        int i = this.h;
        return i >= 2000 && i >= this.g.size();
    }

    public final synchronized czf j(String str) {
        l();
        LinkedHashMap linkedHashMap = this.g;
        czg czgVar = (czg) linkedHashMap.get(str);
        if (czgVar == null) {
            czgVar = new czg(this, str);
            linkedHashMap.put(str, czgVar);
        } else if (czgVar.f != null) {
            return null;
        }
        czf czfVar = new czf(this, czgVar);
        czgVar.f = czfVar;
        this.f.append((CharSequence) "DIRTY");
        this.f.append(' ');
        this.f.append((CharSequence) str);
        this.f.append('\n');
        n(this.f);
        return czfVar;
    }

    public final synchronized void k(String str) {
        l();
        LinkedHashMap linkedHashMap = this.g;
        czg czgVar = (czg) linkedHashMap.get(str);
        if (czgVar != null && czgVar.f == null) {
            for (int i = 0; i < this.d; i = 1) {
                File file = czgVar.c[0];
                if (file.exists() && !file.delete()) {
                    throw new IOException("failed to delete ".concat(String.valueOf(String.valueOf(file))));
                }
                long j = this.e;
                long[] jArr = czgVar.b;
                this.e = j - jArr[0];
                jArr[0] = 0;
            }
            this.h++;
            this.f.append((CharSequence) "REMOVE");
            this.f.append(' ');
            this.f.append((CharSequence) str);
            this.f.append('\n');
            linkedHashMap.remove(str);
            if (i()) {
                this.i.submit(this.n);
            }
        }
    }
}
