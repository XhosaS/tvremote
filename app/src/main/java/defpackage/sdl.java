package defpackage;

import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import androidx.media.AudioAttributesCompat;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sdl {
    private static final zdy a = zdy.h("com/google/android/libraries/search/audio/audiofocus/impl/AudioFocusSessionManager");
    private final sdg b;
    private final sdm c;
    private final sdc d;
    private final sdk e;
    private final smw f;
    private sdj g;
    private final swu h;

    public sdl(sdg sdgVar, sdm sdmVar, sdc sdcVar, sdk sdkVar, smw smwVar, swu swuVar) {
        this.b = sdgVar;
        this.c = sdmVar;
        this.d = sdcVar;
        this.e = sdkVar;
        this.f = smwVar;
        this.h = swuVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0023, code lost:
    
        if (defpackage.abza.a.a(r4.getClass()).k(r4, r0) != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final synchronized void d(defpackage.sdo r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            sdj r0 = r3.g     // Catch: java.lang.Throwable -> L2c
            if (r0 == 0) goto L2a
            sdo r0 = r0.b     // Catch: java.lang.Throwable -> L2c
            if (r4 != r0) goto La
            goto L25
        La:
            java.lang.Class r1 = r4.getClass()     // Catch: java.lang.Throwable -> L2c
            java.lang.Class r2 = r0.getClass()     // Catch: java.lang.Throwable -> L2c
            if (r1 == r2) goto L15
            goto L2a
        L15:
            java.lang.Class r1 = r4.getClass()     // Catch: java.lang.Throwable -> L2c
            abza r2 = defpackage.abza.a     // Catch: java.lang.Throwable -> L2c
            abzj r1 = r2.a(r1)     // Catch: java.lang.Throwable -> L2c
            boolean r4 = r1.k(r4, r0)     // Catch: java.lang.Throwable -> L2c
            if (r4 == 0) goto L2a
        L25:
            r4 = 0
            r3.g = r4     // Catch: java.lang.Throwable -> L2c
            monitor-exit(r3)
            return
        L2a:
            monitor-exit(r3)
            return
        L2c:
            r4 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L2c
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sdl.d(sdo):void");
    }

    public final synchronized sdj a(rua ruaVar) {
        sdj sdjVar;
        sgo sgoVar = ruaVar.g;
        if (sgoVar == null) {
            sgoVar = sgo.a;
        }
        sgo sgoVar2 = sgoVar;
        swu swuVar = this.h;
        sur surVar = ruaVar.i;
        if (surVar == null) {
            surVar = sur.a;
        }
        sgoVar2.getClass();
        surVar.getClass();
        Map map = swuVar.a;
        int iB = sgn.b(sgoVar2.b);
        if (iB == 0) {
            throw null;
        }
        final int i = iB - 1;
        Object obj = map.get(new swr() { // from class: swt
            @Override // defpackage.swr
            public final /* synthetic */ int a() {
                return i;
            }

            @Override // java.lang.annotation.Annotation
            public final /* synthetic */ Class annotationType() {
                return swr.class;
            }

            @Override // java.lang.annotation.Annotation
            public final boolean equals(Object obj2) {
                return (obj2 instanceof swr) && i == ((swr) obj2).a();
            }

            @Override // java.lang.annotation.Annotation
            public final int hashCode() {
                return i ^ (-1129414950);
            }

            @Override // java.lang.annotation.Annotation
            public final String toString() {
                return "@com.google.android.libraries.search.audio.policies.output.OutputPolicyUse(clientOrdinal=" + i + ")";
            }
        });
        if (obj == null) {
            obj = swuVar.b;
        }
        swl swlVarA = ((swq) obj).a(new swp(ruaVar));
        sdm sdmVar = this.c;
        sdo sdoVar = sdo.a;
        sdn sdnVar = new sdn();
        int iIncrementAndGet = sdmVar.a.incrementAndGet();
        if ((sdnVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            sdnVar.y();
        }
        sdo sdoVar2 = (sdo) sdnVar.b;
        sdoVar2.b |= 1;
        sdoVar2.c = iIncrementAndGet;
        sdo sdoVar3 = (sdo) sdnVar.v();
        zdv zdvVar = (zdv) ((zdv) a.b().o(zfi.a, "ALT.AFCSessionMgr")).q("com/google/android/libraries/search/audio/audiofocus/impl/AudioFocusSessionManager", "acquireAudioFocus", 76, "AudioFocusSessionManager.java");
        int iB2 = sgn.b(sgoVar2.b);
        if (iB2 == 0) {
            throw null;
        }
        zdvVar.D("#audio# acquire audio focus for client(%s) session(token(%d))", sgn.a(iB2), sdoVar3.c);
        smw smwVar = this.f;
        smwVar.i(sdoVar3, swlVarA, sgoVar2);
        sdc sdcVar = this.d;
        sdoVar3.getClass();
        sdl sdlVar = (sdl) sdcVar.a.a();
        sdlVar.getClass();
        Executor executor = (Executor) sdcVar.b.a();
        executor.getClass();
        sdb sdbVar = new sdb(swlVarA, sdoVar3, sdlVar, executor);
        int i2 = swlVarA.c;
        int i3 = bfw.b;
        if (i2 != 1 && i2 != 2 && i2 != 3 && i2 != 4) {
            throw new IllegalArgumentException(a.b(i2, "Illegal audio focus gain type "));
        }
        Handler handler = new Handler(Looper.getMainLooper());
        int i4 = AudioAttributesCompat.b;
        bfv bfvVar = new bfv();
        if ((swlVarA.b & 16) != 0) {
            bfvVar.a.setUsage(swlVarA.g);
            if ((swlVarA.b & 32) != 0) {
                bfvVar.a.setContentType(swlVarA.h);
            }
        } else {
            bfvVar.a.setLegacyStreamType(swlVarA.f);
        }
        final bfw bfwVar = new bfw(i2, sdbVar, handler, bft.a(bfvVar));
        final sdg sdgVar = this.b;
        zyd zydVarA = sdgVar.c.a(wyo.i(new Callable() { // from class: sde
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Object obj2 = bfwVar.a;
                AudioManager audioManager = sdgVar.b;
                int iRequestAudioFocus = audioManager.requestAudioFocus(rbe$$ExternalSyntheticApiModelOutline5.m209m(obj2));
                zer zerVar = zfi.a;
                if (iRequestAudioFocus == 1) {
                    return skj.c(2);
                }
                int mode = audioManager.getMode();
                return (mode == 2 || mode == 1 || mode == 3) ? skj.c(7) : skj.c(4);
            }
        }), sdgVar.a);
        sdk sdkVar = this.e;
        sdoVar3.getClass();
        sgoVar2.getClass();
        zydVarA.getClass();
        sdl sdlVar2 = (sdl) sdkVar.a.a();
        sdlVar2.getClass();
        Executor executor2 = (Executor) sdkVar.b.a();
        executor2.getClass();
        sdjVar = new sdj(sdoVar3, bfwVar, sgoVar2, zydVarA, sdlVar2, executor2);
        smwVar.A(sdoVar3, sdjVar, sgoVar2);
        c();
        this.g = sdjVar;
        return sdjVar;
    }

    public final synchronized zyd b(sdo sdoVar, final int i) {
        sdj sdjVar = this.g;
        if (sdjVar != null) {
            sdo sdoVar2 = sdjVar.b;
            if (sdoVar != sdoVar2) {
                if (sdoVar.getClass() == sdoVar2.getClass()) {
                    if (!abza.a.a(sdoVar.getClass()).k(sdoVar, sdoVar2)) {
                    }
                }
            }
            sdj sdjVar2 = this.g;
            final bfw bfwVar = sdjVar2.c;
            this.f.y(sdoVar, sdjVar2.d, i);
            final sdg sdgVar = this.b;
            zer zerVar = zfi.a;
            zyd zydVarA = sdgVar.c.a(wyo.i(new Callable() { // from class: sdf
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    int iAbandonAudioFocusRequest = sdgVar.b.abandonAudioFocusRequest(rbe$$ExternalSyntheticApiModelOutline5.m209m(bfwVar.a));
                    int i2 = i;
                    return iAbandonAudioFocusRequest == 1 ? skj.e(2, i2) : skj.e(3, i2);
                }
            }), sdgVar.a);
            zxn.p(zydVarA, wyo.f(new sdi(sdjVar2)), sdjVar2.h);
            d(sdoVar);
            return zydVarA;
        }
        ((zdv) ((zdv) a.d().o(zfi.a, "ALT.AFCSessionMgr")).q("com/google/android/libraries/search/audio/audiofocus/impl/AudioFocusSessionManager", "releaseAudioFocus", 108, "AudioFocusSessionManager.java")).v("#audio# release audio focus session(token(%d)) failed: session is inactive", sdoVar.c);
        return zxn.h(skj.e(5, i));
    }

    public final synchronized void c() {
        sdj sdjVar = this.g;
        if (sdjVar != null) {
            zdv zdvVar = (zdv) ((zdv) a.b().o(zfi.a, "ALT.AFCSessionMgr")).q("com/google/android/libraries/search/audio/audiofocus/impl/AudioFocusSessionManager", "deactivate", 131, "AudioFocusSessionManager.java");
            sdo sdoVar = sdjVar.b;
            zdvVar.v("#audio# deactivate audio focus client session(token(%d))", sdoVar.c);
            vqi.d("com/google/android/libraries/search/audio/audiofocus/impl/AudioFocusSessionManager", "deactivate", 134, b(sdoVar, 4), "Failed to release audio focus.", new Object[0]);
        }
    }
}
