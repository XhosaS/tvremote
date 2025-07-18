package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class qxs extends qyd {
    public final qyj a;
    private final yqt b;
    private final yqt c;
    private final yqt d;
    private final yqt e;

    public qxs(qyj qyjVar, yqt yqtVar, yqt yqtVar2, yqt yqtVar3, yqt yqtVar4) {
        this.a = qyjVar;
        this.b = yqtVar;
        this.c = yqtVar2;
        this.d = yqtVar3;
        this.e = yqtVar4;
    }

    @Override // defpackage.qyd
    public final qyj a() {
        return this.a;
    }

    @Override // defpackage.qyd
    public final yqt b() {
        return this.c;
    }

    @Override // defpackage.qyd
    public final yqt c() {
        return this.b;
    }

    @Override // defpackage.qyd
    public final yqt d() {
        return this.e;
    }

    @Override // defpackage.qyd
    public final yqt e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof qyd) {
            qyd qydVar = (qyd) obj;
            if (this.a.equals(qydVar.a())) {
                qydVar.g();
                qydVar.f();
                if (this.b.equals(qydVar.c()) && this.c.equals(qydVar.b()) && this.d.equals(qydVar.e()) && this.e.equals(qydVar.d())) {
                    return true;
                }
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

    @Override // defpackage.qyd
    public final void f() {
    }

    @Override // defpackage.qyd
    public final void g() {
    }
}
