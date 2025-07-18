package defpackage;

import android.media.AudioTimestamp;
import android.media.AudioTrack;

/* compiled from: PG */
/* loaded from: classes.dex */
final class elz {
    public final AudioTrack a;
    public final AudioTimestamp b = new AudioTimestamp();
    public long c;
    public long d;
    public long e;
    public boolean f;
    public long g;

    public elz(AudioTrack audioTrack) {
        this.a = audioTrack;
    }

    public final long a() {
        return this.b.nanoTime / 1000;
    }
}
