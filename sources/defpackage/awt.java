package defpackage;

import android.app.Activity;

/* compiled from: PG */
/* loaded from: classes.dex */
final class awt {
    public final aqe a;

    public awt() {
        throw null;
    }

    static awt a(Activity activity) {
        return new awt(new aqe(activity.getClass().getName()));
    }

    final String b() {
        return this.a.a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof awt) && b().equals(((awt) obj).b());
    }

    public final int hashCode() {
        return (b().hashCode() * 31) ^ 1231;
    }

    public final String toString() {
        return b.c(this.a.a, "MeasurementKey{rawStringEventName=null, noPiiEventName=", ", isActivity=true}");
    }

    public awt(aqe aqeVar) {
        this.a = aqeVar;
    }
}
