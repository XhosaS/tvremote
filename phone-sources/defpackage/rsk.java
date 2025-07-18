package defpackage;

import android.app.Activity;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class rsk {
    public final rmp a;

    public rsk() {
        throw null;
    }

    static rsk a(Activity activity) {
        return new rsk(new rmp(activity.getClass().getName()));
    }

    final String b() {
        return this.a.a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof rsk) && b().equals(((rsk) obj).b());
    }

    public final int hashCode() {
        return (b().hashCode() * 31) ^ 1231;
    }

    public final String toString() {
        return a.cg(this.a.a, "MeasurementKey{rawStringEventName=null, noPiiEventName=", ", isActivity=true}");
    }

    public rsk(rmp rmpVar) {
        this.a = rmpVar;
    }
}
