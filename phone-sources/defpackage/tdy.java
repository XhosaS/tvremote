package defpackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tdy {
    public final long a;
    public final tdx b;
    public File c;
    public FileOutputStream d;
    public final ArrayList e;
    public final ArrayList f;
    public final File g;
    public final tdo h;
    public final boolean i;
    private final String j;
    private final String k;
    private final boolean l;

    public tdy(File file, long j, tdx tdxVar, tdo tdoVar, boolean z, boolean z2) {
        File[] fileArrListFiles;
        a.aD(j > 0, "recommendedFileSize must be positive");
        a.aD(true, "maxStorageSize must be positive");
        a.aD(true, "callbacks cannot be null");
        a.aD(tdoVar != null, "helper cannot be null");
        this.g = file;
        this.j = "eventlog.store";
        this.k = ".log";
        this.a = j;
        this.b = tdxVar;
        this.h = tdoVar;
        this.i = z;
        this.l = z2;
        ArrayList arrayList = new ArrayList();
        this.e = arrayList;
        this.f = new ArrayList();
        d();
        if (this.c == null) {
            tho.a("Could not create a temp file with prefix %s and suffix %s in dir %s", "eventlog.store", ".log", file.getAbsolutePath());
        }
        if (!file.exists()) {
            c();
        }
        if (!z2) {
            a.ah(file.isDirectory(), "Expected a directory for path: ".concat(String.valueOf(file.getAbsolutePath())));
        }
        arrayList.clear();
        if (file.exists() && (fileArrListFiles = file.listFiles()) != null) {
            for (File file2 : fileArrListFiles) {
                if (file2.isFile() && !file2.equals(this.c)) {
                    if (file2.length() == 0) {
                        file2.delete();
                    } else {
                        this.e.add(file2);
                    }
                }
            }
        }
        Collections.sort(this.e, bxy.i);
        e();
    }

    public final long a() {
        File file = this.c;
        if (file != null) {
            return file.length();
        }
        return 0L;
    }

    public final long b() {
        int i = 0;
        long length = 0;
        while (true) {
            ArrayList arrayList = this.e;
            if (i >= arrayList.size()) {
                return length;
            }
            length += ((File) arrayList.get(i)).length();
            i++;
        }
    }

    public final void c() {
        try {
            FileOutputStream fileOutputStream = this.d;
            if (fileOutputStream != null) {
                fileOutputStream.close();
            }
        } catch (IOException unused) {
            tho.a("Failed to close mFileOutputStream", new Object[0]);
        }
        this.d = null;
        this.c = null;
        this.f.clear();
        this.e.clear();
        this.g.mkdirs();
    }

    public final void d() {
        File file = this.g;
        if (!file.exists()) {
            c();
        }
        this.c = null;
        try {
            this.c = File.createTempFile(this.j, this.k, file);
            this.d = new FileOutputStream(this.c);
            ((tdv) this.b).f = null;
        } catch (FileNotFoundException unused) {
            File file2 = this.c;
            if (file2 != null) {
                file2.delete();
            }
            this.c = null;
            this.h.e(5);
        } catch (IOException unused2) {
            this.h.e(6);
        }
    }

    public final void e() {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        long length = 0;
        for (int i = 0; i < size; i++) {
            length += ((File) arrayList.get(i)).length();
        }
        ArrayList arrayList2 = this.e;
        int size2 = arrayList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            length += ((File) arrayList2.get(i2)).length();
        }
        File file = this.c;
        if (file != null) {
            length += file.length();
        }
        long length2 = length;
        int i3 = 0;
        while (length2 > 2097152) {
            i3++;
            if (arrayList.size() > 0) {
                File file2 = (File) arrayList.remove(0);
                length2 -= file2.length();
                file2.delete();
            } else if (arrayList2.size() > 0) {
                File file3 = (File) arrayList2.remove(0);
                length2 -= file3.length();
                file3.delete();
            } else {
                File file4 = this.c;
                if (file4 != null) {
                    length2 -= file4.length();
                    this.c.delete();
                    this.c = null;
                }
            }
        }
        if (i3 > 0) {
            Object[] objArr = {Integer.valueOf(i3), 2097152L};
            int i4 = tho.a;
            ngh.a("%d files were purged due to exceeding total storage size of %d", objArr);
            tdo tdoVar = this.h;
            vtw vtwVar = tdoVar.e;
            vuc vucVar = vtwVar.b;
            int i5 = ((wha) vucVar).g + i3;
            if (!vucVar.A()) {
                vtwVar.u();
            }
            wha whaVar = (wha) vtwVar.b;
            whaVar.b |= 8;
            whaVar.g = i5;
            tdoVar.b();
            vuc vucVar2 = vtwVar.b;
            int i6 = ((wha) vucVar2).f + ((int) (length - length2));
            if (!vucVar2.A()) {
                vtwVar.u();
            }
            wha whaVar2 = (wha) vtwVar.b;
            whaVar2.b |= 4;
            whaVar2.f = i6;
            tdoVar.b();
        }
    }

    public final void f() {
        ArrayList arrayList = this.e;
        ArrayList arrayList2 = this.f;
        arrayList.addAll(arrayList2);
        Collections.sort(arrayList, bxy.i);
        arrayList2.clear();
    }

    public final boolean g() throws IOException {
        File file = this.c;
        if (file != null && file.length() != 0) {
            if (this.e.size() + this.f.size() + 1 < 3000) {
                try {
                    this.d.close();
                    this.e.add(this.c);
                    e();
                    this.c = null;
                    this.d = null;
                    return true;
                } catch (IOException unused) {
                    tdo tdoVar = this.h;
                    tdoVar.g.aD(13);
                    tdoVar.b();
                }
            }
        }
        return false;
    }
}
