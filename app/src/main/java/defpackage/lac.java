package defpackage;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.EventParams;
import com.google.android.gms.measurement.internal.EventParcel;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lac {
    public final String a;
    public final String b;
    public final long c;
    public final Bundle d;

    public lac(String str, String str2, Bundle bundle, long j) {
        this.a = str;
        this.b = str2;
        this.d = bundle;
        this.c = j;
    }

    public static lac b(EventParcel eventParcel) {
        return new lac(eventParcel.a, eventParcel.c, eventParcel.b.a(), eventParcel.d);
    }

    public final EventParcel a() {
        return new EventParcel(this.a, new EventParams(new Bundle(this.d)), this.b, this.c);
    }

    public final String toString() {
        return "origin=" + this.b + ",name=" + this.a + ",params=" + this.d.toString();
    }
}
