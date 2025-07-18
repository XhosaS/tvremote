package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rzt implements Parcelable {
    final Bundle a;
    private static final rzt b = new rzt();
    private static final tui c = tui.l("com/google/android/libraries/play/logging/ulex/LogId");
    public static final Parcelable.Creator<rzt> CREATOR = new ous(9);

    public rzt(Bundle bundle) {
        this.a = bundle;
    }

    public static rzt a(bv bvVar) {
        Bundle arguments = bvVar.getArguments();
        if (arguments == null) {
            return b();
        }
        rzt rztVar = (rzt) arguments.getParcelable("com.google.android.libraries.play.logging.ulex.ULEX_CAUSE_EVENT_ID");
        return rztVar == null ? b() : rztVar;
    }

    public static rzt b() {
        ((tug) ((tug) ((tug) c.b()).k(tvj.MEDIUM)).j("com/google/android/libraries/play/logging/ulex/LogId", "logWarningAndReturnEmptyLogId", 158, "LogId.java")).s("Could not extract cause log ID from object. Returning empty log ID instead.");
        return b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.a);
    }

    public rzt() {
        this(new Bundle());
    }
}
