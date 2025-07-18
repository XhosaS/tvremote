package defpackage;

import android.media.AudioManager;
import android.media.audiopolicy.AudioMix;
import android.media.audiopolicy.AudioPolicy;
import android.os.Build;
import android.util.ArraySet;
import java.util.concurrent.LinkedBlockingQueue;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bqh {
    public static final cbt a = cbt.k("com/google/android/tv/remote/service/audio/AudioBridgeX");
    public final AudioManager b;
    public bqj c;
    public ArraySet d = new ArraySet();
    public bqq e;
    public int f;
    private final AudioMix g;
    private final AudioPolicy.Builder h;
    private AudioPolicy i;
    private bqp j;
    private int k;
    private bqp l;
    private final bsi m;

    /* JADX WARN: Removed duplicated region for block: B:32:0x00ca A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public bqh(defpackage.buf r5, defpackage.dka r6, defpackage.bsi r7) throws defpackage.anp, java.lang.NumberFormatException {
        /*
            r4 = this;
            r4.<init>()
            android.util.ArraySet r0 = new android.util.ArraySet
            r0.<init>()
            r4.d = r0
            java.lang.Class<android.media.AudioManager> r0 = android.media.AudioManager.class
            java.lang.Object r0 = r5.getSystemService(r0)
            android.media.AudioManager r0 = (android.media.AudioManager) r0
            r4.b = r0
            r4.m = r7
            android.media.audiopolicy.AudioMix$Builder r7 = new android.media.audiopolicy.AudioMix$Builder
            android.media.audiopolicy.AudioMixingRule$Builder r1 = new android.media.audiopolicy.AudioMixingRule$Builder
            r1.<init>()
            android.media.AudioAttributes$Builder r2 = new android.media.AudioAttributes$Builder
            r2.<init>()
            r3 = 6
            android.media.AudioAttributes$Builder r2 = r2.setCapturePreset(r3)
            android.media.AudioAttributes r2 = r2.build()
            r3 = 2
            android.media.audiopolicy.AudioMixingRule$Builder r1 = r1.addRule(r2, r3)
            android.media.audiopolicy.AudioMixingRule r1 = r1.build()
            r7.<init>(r1)
            android.media.AudioFormat$Builder r1 = new android.media.AudioFormat$Builder
            r1.<init>()
            r2 = 48000(0xbb80, float:6.7262E-41)
            android.media.AudioFormat$Builder r1 = r1.setSampleRate(r2)
            android.media.AudioFormat$Builder r1 = r1.setEncoding(r3)
            r2 = 4
            android.media.AudioFormat$Builder r1 = r1.setChannelMask(r2)
            android.media.AudioFormat r1 = r1.build()
            android.media.audiopolicy.AudioMix$Builder r7 = r7.setFormat(r1)
            android.media.audiopolicy.AudioMix$Builder r7 = r7.setRouteFlags(r3)
            android.media.audiopolicy.AudioMix r7 = r7.build()
            r4.g = r7
            android.media.audiopolicy.AudioPolicy$Builder r1 = new android.media.audiopolicy.AudioPolicy$Builder
            r1.<init>(r5)
            android.media.audiopolicy.AudioPolicy$Builder r7 = r1.addMix(r7)
            r4.h = r7
            bqg r7 = new bqg
            java.util.List r1 = defpackage.k$$ExternalSyntheticApiModelOutline1.m(r0)
            r7.<init>(r4, r1)
            r1 = 0
            defpackage.k$$ExternalSyntheticApiModelOutline1.m(r0, r7, r1)
            ame r0 = new ame
            r2 = 18
            r0.<init>(r4, r7, r2, r1)
            r5.k(r0)
            java.lang.String r5 = "initial_audio_buffer_size"
            java.lang.String r5 = defpackage.dka.e(r5)
            boolean r7 = android.text.TextUtils.isEmpty(r5)
            if (r7 != 0) goto L91
            int r5 = java.lang.Integer.parseInt(r5)
            goto Ld0
        L91:
            java.lang.Object r5 = r6.a
            btn r5 = (defpackage.btn) r5
            android.content.ContentResolver r5 = r5.b
            anq r6 = defpackage.anl.a
            defpackage.anq.c(r5)
            java.lang.String r7 = "atvremoteservice:initial_audio_buffer_size"
            monitor-enter(r6)
            r6.a(r5)     // Catch: java.lang.Throwable -> Lf1
            java.lang.Object r0 = r6.e     // Catch: java.lang.Throwable -> Lf1
            java.util.HashMap r1 = r6.c     // Catch: java.lang.Throwable -> Lf1
            r2 = -1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> Lf1
            java.lang.Object r1 = defpackage.anq.e(r1, r7, r3)     // Catch: java.lang.Throwable -> Lf1
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Throwable -> Lf1
            monitor-exit(r6)     // Catch: java.lang.Throwable -> Lf1
            if (r1 == 0) goto Lb9
            int r5 = r1.intValue()
            goto Ld0
        Lb9:
            java.lang.String r5 = r6.d(r5, r7)
            if (r5 != 0) goto Lc1
        Lbf:
            r5 = r2
            goto Lc9
        Lc1:
            int r5 = java.lang.Integer.parseInt(r5)     // Catch: java.lang.NumberFormatException -> Lbf
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.NumberFormatException -> Lbf
        Lc9:
            monitor-enter(r6)
            java.util.HashMap r2 = r6.c     // Catch: java.lang.Throwable -> Lee
            r6.b(r0, r2, r7, r1)     // Catch: java.lang.Throwable -> Lee
            monitor-exit(r6)     // Catch: java.lang.Throwable -> Lee
        Ld0:
            if (r5 < 0) goto Led
            cbt r6 = defpackage.bqj.a
            cch r6 = r6.b()
            java.lang.String r7 = "com/google/android/tv/remote/service/audio/AudioTrackWrapper"
            java.lang.String r0 = "initialize"
            r1 = 82
            java.lang.String r2 = "AudioTrackWrapper.java"
            cch r6 = r6.j(r7, r0, r1, r2)
            cbs r6 = (defpackage.cbs) r6
            java.lang.String r7 = "Setting initial audio buffer size to %d bytes"
            r6.r(r7, r5)
            defpackage.bqj.b = r5
        Led:
            return
        Lee:
            r5 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> Lee
            throw r5
        Lf1:
            r5 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> Lf1
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bqh.<init>(buf, dka, bsi):void");
    }

    private final void g() {
        if (this.i == null) {
            AudioPolicy.Builder builder = this.h;
            AudioManager audioManager = this.b;
            long jCurrentTimeMillis = System.currentTimeMillis();
            AudioPolicy audioPolicyBuild = builder.build();
            if (audioManager.registerAudioPolicy(audioPolicyBuild) == -1) {
                throw new IllegalStateException("Failed to register audio policy. code: -1");
            }
            this.i = audioPolicyBuild;
            ((cbs) a.c().j("com/google/android/tv/remote/service/audio/AudioBridgeX", "maybeRegisterAudioPolicy", 190, "AudioBridgeX.java")).s("AudioPolicy is registered in %dms", System.currentTimeMillis() - jCurrentTimeMillis);
        }
    }

    private final void h(boolean z) {
        if (this.i == null || !this.d.isEmpty()) {
            return;
        }
        bqj bqjVar = this.c;
        if (bqjVar != null) {
            LinkedBlockingQueue linkedBlockingQueue = bqjVar.d;
            synchronized (linkedBlockingQueue) {
                linkedBlockingQueue.add(bqj.m);
                try {
                    linkedBlockingQueue.wait(250L);
                } catch (InterruptedException e) {
                    throw new IllegalStateException("The thread was unexpectedly interrupted", e);
                }
            }
            if (bqjVar.e != null && bqjVar.i.compareAndSet(false, true)) {
                ((cbs) bqj.a.g().j("com/google/android/tv/remote/service/audio/AudioTrackWrapper", "release", 179, "AudioTrackWrapper.java")).p("AudioTrack.write is hanging, releasing the track");
                LinkedBlockingQueue linkedBlockingQueue2 = bqjVar.d;
                linkedBlockingQueue2.clear();
                linkedBlockingQueue2.add(bqj.m);
                bqjVar.e.release();
                bqjVar.j.a(1002, 0L);
            }
            this.c = null;
        }
        if (Build.VERSION.SDK_INT <= 26 && !z) {
            ((cbs) a.g().j("com/google/android/tv/remote/service/audio/AudioBridgeX", "maybeUnregisterAudioPolicy", 206, "AudioBridgeX.java")).p("AudioPolicy unregistration skipped");
            return;
        }
        ((cbs) a.b().j("com/google/android/tv/remote/service/audio/AudioBridgeX", "maybeUnregisterAudioPolicy", 209, "AudioBridgeX.java")).p("AudioPolicy is being unregistered");
        this.b.unregisterAudioPolicyAsync(this.i);
        this.i = null;
    }

    public final void a(boolean z) {
        this.e = null;
        this.l = null;
        this.c.a(!z);
        if (z) {
            this.d.clear();
            h(true);
        }
    }

    public final synchronized void b(bqp bqpVar) {
        if (this.j == bqpVar) {
            return;
        }
        if (Build.VERSION.SDK_INT < 29) {
            g();
        }
        this.j = bqpVar;
    }

    public final synchronized void c(bqp bqpVar) {
        this.k--;
        ((cbs) a.e().j("com/google/android/tv/remote/service/audio/AudioBridgeX", "onDeviceUnavailable", 147, "AudioBridgeX.java")).r("Total number of connected audio devices is %d", this.k);
        boolean z = true;
        if (this.l == bqpVar) {
            a(true);
            return;
        }
        if (this.j == bqpVar || this.k == 0) {
            this.j = null;
            if (this.k != 0) {
                z = false;
            }
            h(z);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x006a A[Catch: all -> 0x014f, TryCatch #0 {, blocks: (B:3:0x0001, B:35:0x0108, B:37:0x0110, B:39:0x0118, B:41:0x0122, B:42:0x0129, B:44:0x012d, B:47:0x0132, B:6:0x000a, B:8:0x0014, B:10:0x001a, B:11:0x0038, B:13:0x0059, B:14:0x0060, B:15:0x0065, B:17:0x006a, B:19:0x006e, B:20:0x008a, B:22:0x008e, B:23:0x00a8, B:25:0x00bc, B:26:0x00c9, B:28:0x00d9, B:29:0x00dd, B:31:0x00e3, B:33:0x00f9, B:34:0x00fd), top: B:55:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008a A[Catch: all -> 0x014f, TryCatch #0 {, blocks: (B:3:0x0001, B:35:0x0108, B:37:0x0110, B:39:0x0118, B:41:0x0122, B:42:0x0129, B:44:0x012d, B:47:0x0132, B:6:0x000a, B:8:0x0014, B:10:0x001a, B:11:0x0038, B:13:0x0059, B:14:0x0060, B:15:0x0065, B:17:0x006a, B:19:0x006e, B:20:0x008a, B:22:0x008e, B:23:0x00a8, B:25:0x00bc, B:26:0x00c9, B:28:0x00d9, B:29:0x00dd, B:31:0x00e3, B:33:0x00f9, B:34:0x00fd), top: B:55:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void d(java.util.List r8, java.util.ArrayList r9, java.util.ArrayList r10) {
        /*
            Method dump skipped, instructions count: 338
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bqh.d(java.util.List, java.util.ArrayList, java.util.ArrayList):void");
    }

    public final synchronized void e() {
        this.j = null;
        h(false);
    }

    public final synchronized void f() {
        this.k++;
        ((cbs) a.e().j("com/google/android/tv/remote/service/audio/AudioBridgeX", "onDeviceConnected", 121, "AudioBridgeX.java")).r("Total number of connected audio devices is %d", this.k);
    }
}
