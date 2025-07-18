package defpackage;

import android.content.Context;
import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.format.DateTimeFormatter;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sza implements AutoCloseable {
    public static final zdy a = zdy.h("com/google/android/libraries/search/audio/store/persistent/AudioFileWriter");
    public static final agyu b = new agyu("[\\\\/:*?\"<>|]");
    public final Context c;
    public final boolean d;
    public final szs e;
    public final syv f;
    public int g;
    public final int h;
    public final agzv i;
    public RandomAccessFile j;
    public File k;
    public RandomAccessFile l;
    public File m;
    private final ahbt n;
    private final sjp o;
    private final int p;
    private final agpc q;
    private final agpc r;
    private final agpc s;
    private final agpc t;
    private final agpc u;

    public sza(Context context, ahbt ahbtVar, mcw mcwVar, boolean z, long j, long j2, szs szsVar, syv syvVar) {
        context.getClass();
        ahbtVar.getClass();
        mcwVar.getClass();
        szsVar.getClass();
        this.c = context;
        this.n = ahbtVar;
        this.d = z;
        this.e = szsVar;
        this.f = syvVar;
        sjp sjpVar = new sjp(ahbtVar);
        this.o = sjpVar;
        int i = (int) j2;
        this.h = (i <= 3840 ? 3840 : i) * 1024;
        int i2 = (int) j;
        this.p = i2 <= 10 ? 10 : i2;
        this.i = new agzv(false, agzz.a);
        this.q = new agpn(new agum() { // from class: sym
            @Override // defpackage.agum
            public final Object a() {
                String absolutePath;
                sza szaVar = this.a;
                if (szaVar.d) {
                    Context context2 = szaVar.c;
                    File externalCacheDir = context2.getExternalCacheDir();
                    absolutePath = externalCacheDir != null ? String.valueOf(externalCacheDir.getAbsolutePath()).concat("/audio_library/recordings") : null;
                    if (absolutePath == null) {
                        ((zdv) sza.a.b().o(zfi.a, "ALT.AudioFileWriter").q("com/google/android/libraries/search/audio/store/persistent/AudioFileWriter", "fileNameWithoutExtension_delegate$lambda$1", 79, "AudioFileWriter.kt")).u("#audio# no external storage available, falling back to internal");
                        absolutePath = tfp.a(context2).getAbsolutePath();
                        absolutePath.getClass();
                    }
                } else {
                    absolutePath = tfp.a(szaVar.c).getAbsolutePath();
                    absolutePath.getClass();
                }
                String str = Instant.now().atZone(ZoneId.systemDefault()).format(DateTimeFormatter.ofPattern("yyyyMMdd'T'HHmmssSSS"));
                str.getClass();
                return a.i(str + "-" + sza.b.a(szaVar.f.a, ""), absolutePath, "/");
            }
        });
        this.r = new agpn(new agum() { // from class: syn
            @Override // defpackage.agum
            public final Object a() {
                return String.valueOf(this.a.d()).concat("_tmp.wav");
            }
        });
        this.s = new agpn(new agum() { // from class: syo
            @Override // defpackage.agum
            public final Object a() {
                return String.valueOf(this.a.d()).concat(".wav");
            }
        });
        this.t = new agpn(new agum() { // from class: syp
            @Override // defpackage.agum
            public final Object a() {
                return String.valueOf(this.a.d()).concat("_tmp.timestamps");
            }
        });
        this.u = new agpn(new agum() { // from class: syq
            @Override // defpackage.agum
            public final Object a() {
                return String.valueOf(this.a.d()).concat(".timestamps");
            }
        });
        sjpVar.a(new syu(this, null));
    }

    private final String i() {
        return (String) this.s.a();
    }

    private final String j() {
        return (String) this.u.a();
    }

    public final zyd a() {
        return this.i.b() ? zxn.f() : this.o.a(new syw(this, null));
    }

    public final zyd b(abvo abvoVar, Integer num, Long l) {
        return this.i.b() ? zxn.f() : this.o.a(new syz(this, abvoVar, num, l, null));
    }

    public final File c(String str) throws IOException {
        File file = new File(str);
        File parentFile = file.getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
        }
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
        if (file.createNewFile()) {
            return file;
        }
        throw new IOException();
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        a();
    }

    public final String d() {
        return (String) this.q.a();
    }

    public final String e() {
        return (String) this.r.a();
    }

    public final String f() {
        return (String) this.t.a();
    }

    public final void g() {
        if (this.i.a(true)) {
            return;
        }
        RandomAccessFile randomAccessFile = this.j;
        File file = null;
        if (randomAccessFile != null) {
            szb.a(randomAccessFile, new agux() { // from class: syt
                @Override // defpackage.agux
                public final Object a(Object obj) throws IOException {
                    RandomAccessFile randomAccessFile2 = (RandomAccessFile) obj;
                    zdy zdyVar = sza.a;
                    randomAccessFile2.getClass();
                    randomAccessFile2.getFD().sync();
                    randomAccessFile2.close();
                    return agpu.a;
                }
            });
            zdy zdyVar = a;
            zeo zeoVarB = zdyVar.b();
            zer zerVar = zfi.a;
            ((zdv) zeoVarB.o(zerVar, "ALT.AudioFileWriter").q("com/google/android/libraries/search/audio/store/persistent/AudioFileWriter", "closeFile", 235, "AudioFileWriter.kt")).D("#audio# finalized audio(%s); wrote %d", e(), this.g);
            File file2 = this.k;
            if (file2 == null) {
                agvy.b("file");
                file2 = null;
            }
            if (file2.renameTo(new File(i()))) {
                ((zdv) zdyVar.b().o(zerVar, "ALT.AudioFileWriter").q("com/google/android/libraries/search/audio/store/persistent/AudioFileWriter", "closeFile", 237, "AudioFileWriter.kt")).x("#audio# final audio location: %s", i());
            }
        }
        RandomAccessFile randomAccessFile2 = this.l;
        if (randomAccessFile2 != null) {
            szb.a(randomAccessFile2, new agux() { // from class: syr
                @Override // defpackage.agux
                public final Object a(Object obj) throws IOException {
                    RandomAccessFile randomAccessFile3 = (RandomAccessFile) obj;
                    zdy zdyVar2 = sza.a;
                    randomAccessFile3.getClass();
                    randomAccessFile3.getFD().sync();
                    randomAccessFile3.close();
                    return agpu.a;
                }
            });
            File file3 = this.m;
            if (file3 == null) {
                agvy.b("timestampFile");
                file3 = null;
            }
            if (file3.length() == 0) {
                ((zdv) a.b().o(zfi.a, "ALT.AudioFileWriter").q("com/google/android/libraries/search/audio/store/persistent/AudioFileWriter", "closeTimestampsFile", 248, "AudioFileWriter.kt")).x("#audio# no audio timestamps at: %s, removing...", f());
                File file4 = this.m;
                if (file4 == null) {
                    agvy.b("timestampFile");
                } else {
                    file = file4;
                }
                file.delete();
                return;
            }
            zdy zdyVar2 = a;
            zeo zeoVarB2 = zdyVar2.b();
            zer zerVar2 = zfi.a;
            ((zdv) zeoVarB2.o(zerVar2, "ALT.AudioFileWriter").q("com/google/android/libraries/search/audio/store/persistent/AudioFileWriter", "closeTimestampsFile", 252, "AudioFileWriter.kt")).x("#audio# finalized audio timestamps(%s)", f());
            File file5 = this.m;
            if (file5 == null) {
                agvy.b("timestampFile");
            } else {
                file = file5;
            }
            if (file.renameTo(new File(j()))) {
                ((zdv) zdyVar2.b().o(zerVar2, "ALT.AudioFileWriter").q("com/google/android/libraries/search/audio/store/persistent/AudioFileWriter", "closeTimestampsFile", 254, "AudioFileWriter.kt")).x("#audio# final audio timestamps location: %s", j());
            }
        }
    }

    public final void h(File file, String str) {
        File[] fileArrListFiles;
        Iterable iterableF;
        if (file == null || !file.exists() || !file.isDirectory() || (fileArrListFiles = file.listFiles()) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (File file2 : fileArrListFiles) {
            if (file2.isFile()) {
                file2.getClass();
                String name = file2.getName();
                name.getClass();
                if (agvy.c(agyv.l(name, '.', ""), str)) {
                    arrayList.add(file2);
                }
            }
        }
        List listW = agqq.w(arrayList, new syx());
        int i2 = this.p;
        if (listW.size() > i2) {
            int size = listW.size() - i2;
            ((zdv) a.b().o(zfi.a, "ALT.AudioFileWriter").q("com/google/android/libraries/search/audio/store/persistent/AudioFileWriter", "maintainMaxFiles", 286, "AudioFileWriter.kt")).x("#audio# removing oldest recordings files(*.%s) to free space...", str);
            if (size < 0) {
                throw new IllegalArgumentException(a.a(size, "Requested element count ", " is less than zero."));
            }
            if (size == 0) {
                iterableF = agrd.a;
            } else if (size >= listW.size()) {
                iterableF = agqq.x(listW);
            } else if (size == 1) {
                iterableF = Collections.singletonList(agqq.m(listW));
                iterableF.getClass();
            } else {
                ArrayList arrayList2 = new ArrayList(size);
                Iterator it = listW.iterator();
                while (it.hasNext()) {
                    arrayList2.add(it.next());
                    i++;
                    if (i == size) {
                        break;
                    }
                }
                iterableF = agqq.f(arrayList2);
            }
            Iterator it2 = iterableF.iterator();
            while (it2.hasNext()) {
                ((File) it2.next()).delete();
            }
        }
    }
}
