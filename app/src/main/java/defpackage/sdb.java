package defpackage;

import android.media.AudioManager;
import j$.util.OptionalInt;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sdb implements AudioManager.OnAudioFocusChangeListener {
    public static final /* synthetic */ int a = 0;
    private static final zdy b = zdy.h("com/google/android/libraries/search/audio/audiofocus/impl/AudioFocusChangeDelegatingListener");
    private final swl c;
    private final sdo d;
    private final sdl e;
    private final Executor f;
    private final Set g = new HashSet();
    private final Map h = new HashMap();

    public sdb(swl swlVar, sdo sdoVar, sdl sdlVar, Executor executor) {
        OptionalInt.empty();
        this.c = swlVar;
        this.d = sdoVar;
        this.e = sdlVar;
        this.f = executor;
    }

    private static boolean a(int i) {
        return i == -1 || i == -2;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0095 A[Catch: all -> 0x00cd, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:4:0x002d, B:6:0x0034, B:8:0x0042, B:9:0x004a, B:14:0x0075, B:16:0x007b, B:26:0x0095, B:22:0x008a, B:24:0x008e), top: B:35:0x0001 }] */
    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void onAudioFocusChange(final int r15) {
        /*
            r14 = this;
            monitor-enter(r14)
            zdy r0 = defpackage.sdb.b     // Catch: java.lang.Throwable -> Lcd
            zeo r1 = r0.b()     // Catch: java.lang.Throwable -> Lcd
            zer r2 = defpackage.zfi.a     // Catch: java.lang.Throwable -> Lcd
            java.lang.String r3 = "ALT.AFChangeListener"
            zeo r1 = r1.o(r2, r3)     // Catch: java.lang.Throwable -> Lcd
            zdv r1 = (defpackage.zdv) r1     // Catch: java.lang.Throwable -> Lcd
            java.lang.String r3 = "com/google/android/libraries/search/audio/audiofocus/impl/AudioFocusChangeDelegatingListener"
            java.lang.String r4 = "onAudioFocusChange"
            java.lang.String r5 = "AudioFocusChangeDelegatingListener.java"
            r6 = 64
            zeo r1 = r1.q(r3, r4, r6, r5)     // Catch: java.lang.Throwable -> Lcd
            zdv r1 = (defpackage.zdv) r1     // Catch: java.lang.Throwable -> Lcd
            java.lang.String r3 = "#audio# Audio focus changed: status=%d"
            r1.v(r3, r15)     // Catch: java.lang.Throwable -> Lcd
            j$.util.OptionalInt.of(r15)     // Catch: java.lang.Throwable -> Lcd
            java.util.Set r1 = r14.g     // Catch: java.lang.Throwable -> Lcd
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> Lcd
        L2d:
            boolean r3 = r1.hasNext()     // Catch: java.lang.Throwable -> Lcd
            r4 = 0
            if (r3 == 0) goto L6d
            java.lang.Object r3 = r1.next()     // Catch: java.lang.Throwable -> Lcd
            android.media.AudioManager$OnAudioFocusChangeListener r3 = (android.media.AudioManager.OnAudioFocusChangeListener) r3     // Catch: java.lang.Throwable -> Lcd
            java.util.Map r6 = r14.h     // Catch: java.lang.Throwable -> Lcd
            boolean r7 = r6.containsKey(r3)     // Catch: java.lang.Throwable -> Lcd
            if (r7 != 0) goto L4a
            zwv r7 = new zwv     // Catch: java.lang.Throwable -> Lcd
            r7.<init>()     // Catch: java.lang.Throwable -> Lcd
            r6.put(r3, r7)     // Catch: java.lang.Throwable -> Lcd
        L4a:
            java.lang.Object r6 = r6.get(r3)     // Catch: java.lang.Throwable -> Lcd
            zwv r6 = (defpackage.zwv) r6     // Catch: java.lang.Throwable -> Lcd
            sda r7 = new sda     // Catch: java.lang.Throwable -> Lcd
            r7.<init>()     // Catch: java.lang.Throwable -> Lcd
            java.util.concurrent.Callable r3 = defpackage.wyo.i(r7)     // Catch: java.lang.Throwable -> Lcd
            java.util.concurrent.Executor r7 = r14.f     // Catch: java.lang.Throwable -> Lcd
            zyd r11 = r6.a(r3, r7)     // Catch: java.lang.Throwable -> Lcd
            java.lang.Object[] r13 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> Lcd
            java.lang.String r12 = "Failed to notify OnAudioFocusChangeListener."
            java.lang.String r8 = "com/google/android/libraries/search/audio/audiofocus/impl/AudioFocusChangeDelegatingListener"
            java.lang.String r9 = "notifyListener"
            r10 = 126(0x7e, float:1.77E-43)
            defpackage.vqi.d(r8, r9, r10, r11, r12, r13)     // Catch: java.lang.Throwable -> Lcd
            goto L2d
        L6d:
            r1 = -3
            if (r15 != r1) goto L74
            r15 = 5
            r3 = r15
            r15 = r1
            goto L75
        L74:
            r3 = 3
        L75:
            swl r6 = r14.c     // Catch: java.lang.Throwable -> Lcd
            boolean r7 = r6.d     // Catch: java.lang.Throwable -> Lcd
            if (r7 == 0) goto L8a
            boolean r6 = a(r15)     // Catch: java.lang.Throwable -> Lcd
            r7 = 1
            if (r6 != 0) goto L88
            if (r15 != r1) goto L85
            goto L93
        L85:
            r1 = r15
            r7 = r4
            goto L93
        L88:
            r1 = r15
            goto L93
        L8a:
            boolean r1 = r6.e     // Catch: java.lang.Throwable -> Lcd
            if (r1 == 0) goto Lcb
            boolean r7 = a(r15)     // Catch: java.lang.Throwable -> Lcd
            goto L88
        L93:
            if (r7 == 0) goto Lcb
            zeo r15 = r0.b()     // Catch: java.lang.Throwable -> Lcd
            java.lang.String r0 = "ALT.AFChangeListener"
            zeo r15 = r15.o(r2, r0)     // Catch: java.lang.Throwable -> Lcd
            zdv r15 = (defpackage.zdv) r15     // Catch: java.lang.Throwable -> Lcd
            java.lang.String r0 = "com/google/android/libraries/search/audio/audiofocus/impl/AudioFocusChangeDelegatingListener"
            java.lang.String r2 = "onAudioFocusChange"
            r6 = 72
            zeo r15 = r15.q(r0, r2, r6, r5)     // Catch: java.lang.Throwable -> Lcd
            zdv r15 = (defpackage.zdv) r15     // Catch: java.lang.Throwable -> Lcd
            sdo r0 = r14.d     // Catch: java.lang.Throwable -> Lcd
            java.lang.String r2 = "#audio# releasing focus session=%s, change=%d"
            int r5 = r0.c     // Catch: java.lang.Throwable -> Lcd
            r15.z(r2, r5, r1)     // Catch: java.lang.Throwable -> Lcd
            sdl r15 = r14.e     // Catch: java.lang.Throwable -> Lcd
            zyd r8 = r15.b(r0, r3)     // Catch: java.lang.Throwable -> Lcd
            java.lang.Object[] r10 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> Lcd
            java.lang.String r9 = "Failed to release audio focus."
            java.lang.String r5 = "com/google/android/libraries/search/audio/audiofocus/impl/AudioFocusChangeDelegatingListener"
            java.lang.String r6 = "onAudioFocusChange"
            r7 = 74
            defpackage.vqi.d(r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> Lcd
            monitor-exit(r14)
            return
        Lcb:
            monitor-exit(r14)
            return
        Lcd:
            r0 = move-exception
            r15 = r0
            monitor-exit(r14)     // Catch: java.lang.Throwable -> Lcd
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sdb.onAudioFocusChange(int):void");
    }
}
