package defpackage;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import j$.util.concurrent.ConcurrentLinkedQueue;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tqy {
    public static final zdy a = zdy.h("com/google/android/libraries/speech/transcription/beeps/AudioPlayer");
    public final Context b;
    public final ConcurrentLinkedQueue c = new ConcurrentLinkedQueue();
    public final AtomicBoolean d = new AtomicBoolean(false);
    private final zyg e;

    public tqy(Context context, zyh zyhVar) {
        this.b = context;
        this.e = zyhVar;
    }

    public final void a(int i) {
        this.c.add(Integer.valueOf(i));
        b();
    }

    public final void b() {
        if (!this.c.isEmpty() && this.d.compareAndSet(false, true)) {
            this.e.eM(wyo.h(new Runnable() { // from class: tqw
                @Override // java.lang.Runnable
                public final void run() throws IllegalStateException, IOException {
                    tqy tqyVar = this.a;
                    int iIntValue = ((Integer) tqyVar.c.poll()).intValue();
                    try {
                        FileInputStream fileInputStreamCreateInputStream = tqyVar.b.getResources().openRawResourceFd(iIntValue).createInputStream();
                        try {
                            byte[] bArrB = abvo.w(fileInputStreamCreateInputStream).B();
                            if (fileInputStreamCreateInputStream != null) {
                                fileInputStreamCreateInputStream.close();
                            }
                            AudioFormat audioFormatBuild = new AudioFormat.Builder().setChannelMask(4).setEncoding(2).setSampleRate(16000).build();
                            AudioAttributes audioAttributesBuild = new AudioAttributes.Builder().setContentType(2).setUsage(10).build();
                            int length = bArrB.length;
                            AudioTrack audioTrack = new AudioTrack(audioAttributesBuild, audioFormatBuild, length, 1, 0);
                            audioTrack.write(bArrB, 0, length);
                            audioTrack.setNotificationMarkerPosition(audioTrack.getBufferSizeInFrames());
                            audioTrack.setPlaybackPositionUpdateListener(new tqx(tqyVar, audioTrack));
                            ((zdv) ((zdv) tqy.a.b()).q("com/google/android/libraries/speech/transcription/beeps/AudioPlayer", "playBlocking", 114, "AudioPlayer.java")).D("Playing beep %s (size %d bytes)", tqyVar.b.getResources().getResourceName(iIntValue), length);
                            audioTrack.play();
                        } finally {
                        }
                    } catch (IOException e) {
                        ((zdv) ((zdv) ((zdv) tqy.a.c()).p(e)).q("com/google/android/libraries/speech/transcription/beeps/AudioPlayer", "playBlocking", 'w', "AudioPlayer.java")).u("Could not play beep");
                    }
                }
            }));
        }
    }
}
