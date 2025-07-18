package defpackage;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class syu extends agtu implements agvb {
    final /* synthetic */ sza a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public syu(sza szaVar, agsw agswVar) {
        super(2, agswVar);
        this.a = szaVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((syu) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) throws IOException {
        Object objA;
        Object objA2;
        agpl.b(obj);
        zdv zdvVar = (zdv) sza.a.b().o(zfi.a, "ALT.AudioFileWriter").q("com/google/android/libraries/search/audio/store/persistent/AudioFileWriter", "initFile", 113, "AudioFileWriter.kt");
        sza szaVar = this.a;
        zdvVar.x("#audio# persisting audio to %s", szaVar.e());
        try {
            File fileC = szaVar.c(szaVar.e());
            szaVar.j = new RandomAccessFile(fileC, "rw");
            objA = fileC;
        } catch (Throwable th) {
            objA = agpl.a(th);
        }
        File file = null;
        if (agpk.a(objA) == null) {
            szaVar.k = (File) objA;
            File file2 = szaVar.k;
            if (file2 == null) {
                agvy.b("file");
                file2 = null;
            }
            szaVar.h(file2.getParentFile(), "wav");
            tab tabVar = tab.a;
            RandomAccessFile randomAccessFile = szaVar.j;
            if (randomAccessFile == null) {
                agvy.b("raf");
                randomAccessFile = null;
            }
            syv syvVar = szaVar.f;
            randomAccessFile.getClass();
            int i = syvVar.b;
            int iA = szr.a(i) * 8;
            tabVar.b(randomAccessFile, "RIFF");
            tabVar.a(randomAccessFile, 0, 4);
            tabVar.b(randomAccessFile, "WAVE");
            tabVar.b(randomAccessFile, "fmt ");
            tabVar.a(randomAccessFile, 16, 4);
            if (i == 4) {
                tabVar.a(randomAccessFile, 3, 2);
            } else {
                tabVar.a(randomAccessFile, 1, 2);
            }
            int i2 = syvVar.c;
            int i3 = syvVar.d;
            tabVar.a(randomAccessFile, i2, 2);
            tabVar.a(randomAccessFile, i3, 4);
            int i4 = iA >> 3;
            tabVar.a(randomAccessFile, i3 * i2 * i4, 4);
            tabVar.a(randomAccessFile, i2 * i4, 2);
            tabVar.a(randomAccessFile, iA, 2);
            tabVar.b(randomAccessFile, "data");
            tabVar.a(randomAccessFile, 0, 4);
        } else {
            ((zdv) sza.a.b().o(zfi.a, "ALT.AudioFileWriter").q("com/google/android/libraries/search/audio/store/persistent/AudioFileWriter", "initFile", 118, "AudioFileWriter.kt")).x("#audio# failed to make path %s", szaVar.e());
        }
        ((zdv) sza.a.b().o(zfi.a, "ALT.AudioFileWriter").q("com/google/android/libraries/search/audio/store/persistent/AudioFileWriter", "initTimestampFile", 133, "AudioFileWriter.kt")).x("#audio# persisting audio timestamps (if present) to %s", szaVar.f());
        try {
            File fileC2 = szaVar.c(szaVar.f());
            szaVar.l = new RandomAccessFile(fileC2, "rw");
            objA2 = fileC2;
        } catch (Throwable th2) {
            objA2 = agpl.a(th2);
        }
        if (agpk.a(objA2) == null) {
            szaVar.m = (File) objA2;
            File file3 = szaVar.m;
            if (file3 == null) {
                agvy.b("timestampFile");
            } else {
                file = file3;
            }
            szaVar.h(file.getParentFile(), "timestamps");
        } else {
            ((zdv) sza.a.b().o(zfi.a, "ALT.AudioFileWriter").q("com/google/android/libraries/search/audio/store/persistent/AudioFileWriter", "initTimestampFile", 140, "AudioFileWriter.kt")).x("#audio# failed to make path %s", szaVar.f());
        }
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new syu(this.a, agswVar);
    }
}
