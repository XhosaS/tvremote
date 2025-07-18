package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class syl {
    public static final zdy a = zdy.h("com/google/android/libraries/search/audio/store/memory/SingleAudioRecordStore");
    public static final Duration b;
    public final zyh c;
    public final agzy d;
    public final sjp e;
    public final slj f;
    private final ahbt g;

    static {
        Duration durationOfMinutes = Duration.ofMinutes(5L);
        durationOfMinutes.getClass();
        b = durationOfMinutes;
    }

    public syl(slj sljVar, ahbt ahbtVar, zyh zyhVar) {
        sljVar.getClass();
        ahbtVar.getClass();
        zyhVar.getClass();
        this.f = sljVar;
        this.g = ahbtVar;
        this.c = zyhVar;
        this.d = new agzy(null, agzz.a);
        this.e = new sjp(ahbtVar);
    }
}
