package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sdj {
    public static final zdy a = zdy.h("com/google/android/libraries/search/audio/audiofocus/impl/AudioFocusSessionImpl");
    public final sdo b;
    public final bfw c;
    public final sgo d;
    public final zyd e;
    public final zyd f = xt.a(new xq() { // from class: sdh
        @Override // defpackage.xq
        public final Object a(xo xoVar) {
            this.a.i = xoVar;
            return "releaseAudioFocusStatusFuture";
        }
    });
    public final sdl g;
    public final Executor h;
    public xo i;

    public sdj(sdo sdoVar, bfw bfwVar, sgo sgoVar, zyd zydVar, sdl sdlVar, Executor executor) {
        this.b = sdoVar;
        this.c = bfwVar;
        this.d = sgoVar;
        this.e = zydVar;
        this.g = sdlVar;
        this.h = executor;
    }
}
