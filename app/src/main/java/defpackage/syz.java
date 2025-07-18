package defpackage;

import j$.time.ZoneId;
import j$.time.format.DateTimeFormatter;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class syz extends agtu implements agvb {
    final /* synthetic */ sza a;
    final /* synthetic */ abvo b;
    final /* synthetic */ Integer c;
    final /* synthetic */ Long d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public syz(sza szaVar, abvo abvoVar, Integer num, Long l, agsw agswVar) {
        super(2, agswVar);
        this.a = szaVar;
        this.b = abvoVar;
        this.c = num;
        this.d = l;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((syz) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) throws IOException {
        agpl.b(obj);
        sza szaVar = this.a;
        if (!szaVar.i.b() && szaVar.j != null) {
            abvo abvoVar = this.b;
            if (!abvoVar.A()) {
                final byte[] bArrB = abvoVar.B();
                szaVar.g += bArrB.length;
                RandomAccessFile randomAccessFile = szaVar.j;
                RandomAccessFile randomAccessFile2 = null;
                if (randomAccessFile == null) {
                    agvy.b("raf");
                    randomAccessFile = null;
                }
                if (agpk.a(szb.a(randomAccessFile, new agux() { // from class: syy
                    @Override // defpackage.agux
                    public final Object a(Object obj2) throws IOException {
                        ((RandomAccessFile) obj2).write(bArrB);
                        return agpu.a;
                    }
                })) != null) {
                    ((zdv) sza.a.d().o(zfi.a, "ALT.AudioFileWriter").q("com/google/android/libraries/search/audio/store/persistent/AudioFileWriter$writeBytesWithMetadata$1", "invokeSuspend", 184, "AudioFileWriter.kt")).x("#audio# writing audio(%s) failed, finalizing...", szaVar.e());
                    szaVar.g();
                }
                tab tabVar = tab.a;
                RandomAccessFile randomAccessFile3 = szaVar.j;
                if (randomAccessFile3 == null) {
                    agvy.b("raf");
                    randomAccessFile3 = null;
                }
                int i = szaVar.g;
                randomAccessFile3.getClass();
                randomAccessFile3.seek(4L);
                tabVar.a(randomAccessFile3, i + 36, 4);
                randomAccessFile3.seek(40L);
                tabVar.a(randomAccessFile3, i, 4);
                randomAccessFile3.seek(randomAccessFile3.length());
                final Integer num = this.c;
                final Long l = this.d;
                if (szaVar.l != null && num != null && l != null) {
                    final String str = ztu.b(szaVar.e.a(l.longValue())).atZone(ZoneId.systemDefault()).format(DateTimeFormatter.ofPattern("MM-dd'T'HH:mm:ss.SSS"));
                    str.getClass();
                    RandomAccessFile randomAccessFile4 = szaVar.l;
                    if (randomAccessFile4 == null) {
                        agvy.b("timestampRaf");
                    } else {
                        randomAccessFile2 = randomAccessFile4;
                    }
                    szb.a(randomAccessFile2, new agux() { // from class: sys
                        @Override // defpackage.agux
                        public final Object a(Object obj2) throws IOException {
                            RandomAccessFile randomAccessFile5 = (RandomAccessFile) obj2;
                            zdy zdyVar = sza.a;
                            randomAccessFile5.getClass();
                            Long l2 = l;
                            Objects.toString(l2);
                            randomAccessFile5.writeBytes(l2.toString().concat(","));
                            randomAccessFile5.writeBytes(str.concat(","));
                            Integer num2 = num;
                            Objects.toString(num2);
                            randomAccessFile5.writeBytes(num2.toString().concat("\n"));
                            return agpu.a;
                        }
                    });
                }
                if (szaVar.g >= szaVar.h) {
                    ((zdv) sza.a.b().o(zfi.a, "ALT.AudioFileWriter").q("com/google/android/libraries/search/audio/store/persistent/AudioFileWriter$writeBytesWithMetadata$1", "invokeSuspend", 192, "AudioFileWriter.kt")).x("#audio# audio(%s) reached maximum size, finalizing...", szaVar.e());
                    szaVar.g();
                }
            }
        }
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new syz(this.a, this.b, this.c, this.d, agswVar);
    }
}
