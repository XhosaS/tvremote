package defpackage;

import android.os.SystemClock;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class rmv extends tts {
    @Override // defpackage.tts
    public final long a() {
        return osc.a ? SystemClock.elapsedRealtimeNanos() : SystemClock.elapsedRealtime() * 1000000;
    }
}
