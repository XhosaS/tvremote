package defpackage;

import android.media.AudioTrack;
import android.media.audiopolicy.AudioMix;
import android.media.audiopolicy.AudioPolicy;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bqj {
    public AudioTrack e;
    public boolean f;
    public int g;
    public int h;
    public final bsi j;
    public static final cbt a = cbt.k("com/google/android/tv/remote/service/audio/AudioTrackWrapper");
    public static final dln k = new dln(0, (byte[]) null);
    public static final dln l = new dln(0, (byte[]) null);
    public static final dln m = new dln(0, (byte[]) null);
    public static int b = 1778;
    public final LinkedBlockingQueue d = new LinkedBlockingQueue();
    public final AtomicBoolean i = new AtomicBoolean();
    public final bqk c = new bqk(48000);

    public bqj(final bsi bsiVar, final AudioPolicy audioPolicy, final AudioMix audioMix) {
        this.j = bsiVar;
        Thread thread = new Thread(new Runnable() { // from class: bqi
            @Override // java.lang.Runnable
            public final void run() throws IllegalStateException {
                boolean z;
                int iWrite;
                AudioPolicy audioPolicy2 = audioPolicy;
                bqj bqjVar = this.a;
                AudioMix audioMix2 = audioMix;
                long jCurrentTimeMillis = System.currentTimeMillis();
                bqjVar.e = audioPolicy2.createAudioTrackSource(audioMix2);
                int state = bqjVar.e.getState();
                bsi bsiVar2 = bsiVar;
                boolean z2 = false;
                z2 = false;
                if (state == 0) {
                    ((cbs) bqj.a.f().j("com/google/android/tv/remote/service/audio/AudioTrackWrapper", "<init>", 98, "AudioTrackWrapper.java")).p("Unable to create AudioTrack to inject audio from remote");
                } else {
                    cbt cbtVar = bqj.a;
                    ((cbs) cbtVar.b().j("com/google/android/tv/remote/service/audio/AudioTrackWrapper", "<init>", 100, "AudioTrackWrapper.java")).s("Created Audio Track in %dms", System.currentTimeMillis() - jCurrentTimeMillis);
                    while (true) {
                        try {
                            dln dlnVar = (dln) bqjVar.d.take();
                            String str = "unknown";
                            if (dlnVar.b == null) {
                                long jCurrentTimeMillis2 = System.currentTimeMillis();
                                if (dlnVar != bqj.k) {
                                    if (dlnVar != bqj.l) {
                                        if (dlnVar == bqj.m) {
                                            break;
                                        }
                                    } else {
                                        str = "stopped";
                                        bqjVar.e.stop();
                                    }
                                } else {
                                    str = "paused";
                                    bqjVar.e.pause();
                                    bqjVar.e.flush();
                                }
                                bqjVar.f = z2;
                                bqjVar.g = z2 ? 1 : 0;
                                int underrunCount = bqjVar.e.getUnderrunCount() - bqjVar.h;
                                ((cbs) cbtVar.b().j("com/google/android/tv/remote/service/audio/AudioTrackWrapper", "<init>", 123, "AudioTrackWrapper.java")).A("AudioTrack %s in %dms (underrun count: %d)", str, Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis2), Integer.valueOf(underrunCount));
                                if (underrunCount != 0) {
                                    bsiVar2.a(1001, underrunCount);
                                    bqjVar.h += underrunCount;
                                }
                            } else {
                                byte[] bArrB = bqjVar.c.b(dlnVar);
                                if (bqjVar.f) {
                                    z = false;
                                    iWrite = bqjVar.e.write(bArrB, 0, bArrB.length);
                                } else {
                                    AudioTrack audioTrack = bqjVar.e;
                                    int length = bArrB.length;
                                    iWrite = audioTrack.write(bArrB, z2 ? 1 : 0, length, 1);
                                    if (iWrite >= 0) {
                                        int i = bqjVar.g + iWrite;
                                        bqjVar.g = i;
                                        if (iWrite != length || i >= bqj.b) {
                                            long jCurrentTimeMillis3 = System.currentTimeMillis();
                                            bqjVar.e.play();
                                            ((cbs) cbtVar.b().j("com/google/android/tv/remote/service/audio/AudioTrackWrapper", "play", 206, "AudioTrackWrapper.java")).s("Playing Audio Track in %dms", System.currentTimeMillis() - jCurrentTimeMillis3);
                                            bqjVar.f = true;
                                            if (iWrite != length) {
                                                ((cbs) cbtVar.g().j("com/google/android/tv/remote/service/audio/AudioTrackWrapper", "play", 210, "AudioTrackWrapper.java")).r("AudioTrack internal buffer is full after %d bytes", bqjVar.g);
                                                iWrite = bqjVar.e.write(bArrB, iWrite, length - iWrite);
                                            }
                                        }
                                    }
                                    z = false;
                                }
                                if (iWrite < 0) {
                                    ((cbs) cbtVar.f().j("com/google/android/tv/remote/service/audio/AudioTrackWrapper", "play", 221, "AudioTrackWrapper.java")).B("Failed writing %d bytes of data to AudioTrack. AudioTrack state: %d, playState: %d, status: %d", Integer.valueOf(bArrB.length), Integer.valueOf(bqjVar.e.getState()), Integer.valueOf(bqjVar.e.getPlayState()), Integer.valueOf(iWrite));
                                }
                                z2 = z;
                            }
                        } catch (InterruptedException e) {
                            throw new IllegalStateException("AudioTrackWrapper thread was unexpectedly interrupted", e);
                        }
                    }
                }
                if (bqjVar.i.compareAndSet(z2, true)) {
                    bqjVar.e.release();
                    LinkedBlockingQueue linkedBlockingQueue = bqjVar.d;
                    synchronized (linkedBlockingQueue) {
                        linkedBlockingQueue.notify();
                    }
                }
            }
        });
        thread.setName("AudioTrackWrapper");
        thread.setPriority(10);
        thread.start();
    }

    final void a(boolean z) {
        if (z) {
            this.d.add(l);
            return;
        }
        LinkedBlockingQueue linkedBlockingQueue = this.d;
        linkedBlockingQueue.clear();
        linkedBlockingQueue.add(k);
    }
}
