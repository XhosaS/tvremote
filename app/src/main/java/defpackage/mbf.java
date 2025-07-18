package defpackage;

import com.google.android.libraries.assistant.soda.Soda;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mbf {
    public static final zdy a = zdy.h("com/google/android/libraries/assistant/soda/SodaAudioPusher");
    public final zyg b;
    public final Soda c;
    public final int d;
    public final int e;
    public zyu f;
    public final Object g = new Object();
    public zyd h;
    public zyu i;

    public mbf(zyg zygVar, Soda soda, int i, int i2) {
        this.b = zygVar;
        this.c = soda;
        this.d = i2;
        this.e = i;
        ((zdv) ((zdv) a.b()).q("com/google/android/libraries/assistant/soda/SodaAudioPusher", "<init>", 64, "SodaAudioPusher.java")).z("channelCount %d, sampleRate %d", i2, i);
    }

    static void b(Soda soda, InputStream inputStream, yqt yqtVar, zyu zyuVar, int i) throws Throwable {
        ((zdv) ((zdv) a.b()).q("com/google/android/libraries/assistant/soda/SodaAudioPusher", "runPushLoop", 161, "SodaAudioPusher.java")).u("Starting to push audio to Soda");
        byte[] bArr = new byte[i];
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(i);
        ByteBuffer.allocateDirect(16);
        if (i == 0) {
            zyuVar.q(new RuntimeException("Invalid audio buffer size for reading"));
            c(soda, byteBufferAllocateDirect, zyuVar, yqtVar);
        }
        while (!(zyuVar.valueField instanceof zue)) {
            try {
                try {
                    byteBufferAllocateDirect.clear();
                    int i2 = inputStream.read(bArr, 0, i);
                    if (i2 < 0) {
                        break;
                    }
                    if (i2 > 0) {
                        if (yqtVar.g()) {
                            try {
                                ((OutputStream) yqtVar.c()).write(bArr, 0, i2);
                            } catch (IOException e) {
                                ((zdv) ((zdv) a.c()).q("com/google/android/libraries/assistant/soda/SodaAudioPusher", "dumpAudioIfNeeded", 263, "SodaAudioPusher.java")).x("Failed to write to output stream: %s", e.getMessage());
                            }
                        }
                        byteBufferAllocateDirect.put(bArr, 0, i2);
                        soda.g(byteBufferAllocateDirect, i2);
                    }
                } catch (IOException e2) {
                    e = e2;
                    Throwable th = e;
                    ((zdv) ((zdv) ((zdv) a.d()).p(th)).q("com/google/android/libraries/assistant/soda/SodaAudioPusher", "runPushLoop", (char) 207, "SodaAudioPusher.java")).u("Failed to push audio to Soda");
                    zyuVar.q(th);
                    c(soda, byteBufferAllocateDirect, zyuVar, yqtVar);
                }
            } catch (UnsupportedOperationException e3) {
                e = e3;
                Throwable th2 = e;
                ((zdv) ((zdv) ((zdv) a.d()).p(th2)).q("com/google/android/libraries/assistant/soda/SodaAudioPusher", "runPushLoop", (char) 207, "SodaAudioPusher.java")).u("Failed to push audio to Soda");
                zyuVar.q(th2);
                c(soda, byteBufferAllocateDirect, zyuVar, yqtVar);
            }
        }
        c(soda, byteBufferAllocateDirect, zyuVar, yqtVar);
    }

    private static void c(Soda soda, ByteBuffer byteBuffer, zyu zyuVar, yqt yqtVar) throws Throwable {
        ((zdv) ((zdv) a.b()).q("com/google/android/libraries/assistant/soda/SodaAudioPusher", "endPushingAudioToSoda", 143, "SodaAudioPusher.java")).u("Sending end of audio to Soda.");
        try {
            soda.g(byteBuffer, 0);
        } catch (IllegalStateException e) {
            zyuVar.q(e);
        }
        if (yqtVar.g()) {
            try {
                ((OutputStream) yqtVar.c()).close();
            } catch (IOException e2) {
                ((zdv) ((zdv) a.c()).q("com/google/android/libraries/assistant/soda/SodaAudioPusher", "finishDumpingAudioIfNeeded", 273, "SodaAudioPusher.java")).x("Failed to write to output stream: %s", e2.getMessage());
            }
        }
    }

    public final void a() {
        synchronized (this.g) {
            zyu zyuVar = this.i;
            if (zyuVar != null) {
                zyuVar.p(null);
            }
            this.h = null;
        }
    }
}
