package defpackage;

import j$.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sbz implements sbo {
    public static final zdy a = zdy.h("com/google/android/libraries/search/audio/audiobuffer/AudioBytesReceiverWithTimestamps");
    public static final rur b;
    public final Duration c;
    public final zyd d;
    public ahcb e;
    private final ruo f;
    private final sbo g;
    private final ahbt h;
    private final ArrayList i;

    static {
        rur rurVar = rur.a;
        b = rxo.a(new ruq());
    }

    public sbz(zyd zydVar, ruo ruoVar, sbo sboVar, Duration duration, ahbt ahbtVar) {
        this.f = ruoVar;
        this.g = sboVar;
        this.c = duration;
        this.h = ahbtVar;
        if (duration.isNegative()) {
            throw new IllegalArgumentException("Timestamp await timeout cannot be negative");
        }
        this.i = new ArrayList();
        zyd zydVarI = zxn.i(zydVar);
        zydVarI.getClass();
        this.d = zydVarI;
    }

    private final rsu c(rsu rsuVar) {
        ahcb ahcbVar = this.e;
        rur rurVar = ahcbVar != null ? (rur) ahcbVar.d() : null;
        if (rurVar == null) {
            throw new IllegalStateException("Start time must be determined before delegating");
        }
        if ((rurVar.b & 1) == 0) {
            return rsuVar;
        }
        int i = rsuVar.b;
        if ((i & 4) == 0 || (i & 2) != 0 || rsuVar.c == 2) {
            return rsuVar;
        }
        rst rstVar = new rst();
        rstVar.B(rsuVar);
        long jB = rurVar.c + sjx.b(rsuVar.g, this.f);
        if ((rstVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            rstVar.y();
        }
        rsu rsuVar2 = (rsu) rstVar.b;
        rsuVar2.b |= 2;
        rsuVar2.f = jB;
        return rsq.a(rstVar);
    }

    public final synchronized void a() {
        ArrayList arrayList = this.i;
        if (arrayList.isEmpty()) {
            return;
        }
        Iterator it = arrayList.iterator();
        it.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            next.getClass();
            this.g.b(c((rsu) next));
        }
        arrayList.clear();
        arrayList.trimToSize();
    }

    @Override // defpackage.sbo
    public final synchronized void b(rsu rsuVar) {
        ahcb ahcbVarD;
        rsuVar.getClass();
        ahcb ahcbVar = this.e;
        if (ahcbVar != null && ahcbVar.v()) {
            a();
            this.g.b(c(rsuVar));
            return;
        }
        this.i.add(rsuVar);
        if (this.e == null) {
            zyd zydVar = this.d;
            if (zydVar.isDone()) {
                ahcbVarD = ahba.a(zxn.o(zydVar));
            } else {
                Duration duration = this.c;
                if (duration.isZero()) {
                    ahcbVarD = ahba.a(b);
                } else if ((rsuVar.b & 2) != 0) {
                    ((zdv) a.b().o(zfi.a, "ALT.ReceiverTimestamp").q("com/google/android/libraries/search/audio/audiobuffer/AudioBytesReceiverWithTimestamps", "computeDeferredStartTime", 98, "AudioBytesReceiverWithTimestamps.kt")).u("#audio# using already provided timestamps");
                    ahcbVarD = ahba.a(b);
                } else {
                    ((zdv) a.b().o(zfi.a, "ALT.ReceiverTimestamp").q("com/google/android/libraries/search/audio/audiobuffer/AudioBytesReceiverWithTimestamps", "computeDeferredStartTime", 101, "AudioBytesReceiverWithTimestamps.kt")).x("#audio# waiting(%s) for audio start time", duration);
                    ahcbVarD = ahal.d(this.h, null, 0, new sby(this, null), 3);
                }
            }
            this.e = ahcbVarD;
            if (ahcbVarD != null) {
                ahcbVarD.w(new agux() { // from class: sbw
                    @Override // defpackage.agux
                    public final Object a(Object obj) {
                        rur rurVar;
                        zdv zdvVar = (zdv) sbz.a.b().o(zfi.a, "ALT.ReceiverTimestamp").q("com/google/android/libraries/search/audio/audiobuffer/AudioBytesReceiverWithTimestamps", "handleStartTimeCompletion", 72, "AudioBytesReceiverWithTimestamps.kt");
                        sbz sbzVar = this.a;
                        ahcb ahcbVar2 = sbzVar.e;
                        Boolean boolValueOf = null;
                        if (ahcbVar2 != null && (rurVar = (rur) ahcbVar2.d()) != null) {
                            boolValueOf = Boolean.valueOf(1 == (rurVar.b & 1));
                        }
                        zdvVar.x("#audio# start time defined(present=%s)", boolValueOf);
                        sbzVar.a();
                        return agpu.a;
                    }
                });
            }
        }
    }
}
