package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rse {
    public final rsk a;
    private final tst b;
    private final tst c;
    private final tst d;
    private final tst e;

    public rse() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof rse) {
            rse rseVar = (rse) obj;
            if (this.a.equals(rseVar.a) && this.b.equals(rseVar.b) && this.c.equals(rseVar.c) && this.d.equals(rseVar.d) && this.e.equals(rseVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((this.a.hashCode() ^ 1000003) * (-721379959)) ^ 1237) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332;
    }

    public final String toString() {
        return "InternalJankEventCollectionParameters{measurementKey=" + this.a.toString() + ", metricExtension=null, enablePerfettoTraceCollection=false, perfettoTimeoutOverride=Optional.absent(), perfettoBucketOverride=Optional.absent(), perfettoTriggerJankFrameRatioThresholdOverride=Optional.absent(), perfettoTriggerJankDurationThresholdOverride=Optional.absent()}";
    }

    public rse(rsk rskVar, tst tstVar, tst tstVar2, tst tstVar3, tst tstVar4) {
        this.a = rskVar;
        this.b = tstVar;
        this.c = tstVar2;
        this.d = tstVar3;
        this.e = tstVar4;
    }
}
