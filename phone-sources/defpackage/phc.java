package defpackage;

import android.app.Activity;
import android.os.BadParcelableException;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class phc extends prc {
    private final pgd b;
    private final phb c;
    private final String d;
    private static final tvn a = tvn.n("GnpSdk");
    public static final Parcelable.Creator<phc> CREATOR = new omd(17);

    public phc(Parcel parcel) {
        this.d = parcel.readString();
        this.c = (phb) b(parcel, phb.class.getClassLoader(), phb.class, phb.UNKNOWN);
        this.b = (pgd) b(parcel, pgd.class.getClassLoader(), pgd.class, null);
    }

    private static Object b(Parcel parcel, ClassLoader classLoader, Class cls, Object obj) {
        Object serializable;
        try {
            serializable = ctk.b() ? parcel.readSerializable(classLoader, cls) : cls.cast(parcel.readSerializable());
        } catch (BadParcelableException | ClassCastException unused) {
            ((tvk) ((tvk) a.g()).j("com/google/android/libraries/internal/growth/growthkit/internal/ui/impl/gm/taptarget/FeatureHighlightViewFinder", "readSerializable", 91, "FeatureHighlightViewFinder.java")).v("Failed to read %s data from parcel", cls.getName());
            serializable = null;
        }
        return serializable != null ? serializable : obj;
    }

    @Override // defpackage.prc
    public final View a(Activity activity, View view) {
        pgd pgdVar = this.b;
        if (pgdVar == null) {
            return null;
        }
        int iOrdinal = this.c.ordinal();
        if (iOrdinal == 1) {
            return pgd.c(activity, view, this.d);
        }
        if (iOrdinal == 2) {
            return pgd.d(activity, view, this.d);
        }
        if (iOrdinal != 3) {
            return null;
        }
        return pgdVar.a(activity, view, Integer.parseInt(this.d));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.d);
        parcel.writeSerializable(this.c);
        parcel.writeSerializable(this.b);
    }

    public phc(pgd pgdVar, uyy uyyVar) {
        this.b = pgdVar;
        int i = uyyVar.c;
        int i2 = i != 0 ? i != 1 ? i != 10 ? i != 11 ? 0 : 3 : 2 : 1 : 4;
        if (i2 == 0) {
            throw null;
        }
        int i3 = i2 - 1;
        if (i3 == 0) {
            this.d = i == 1 ? (String) uyyVar.d : "";
            this.c = phb.ID;
            return;
        }
        if (i3 == 1) {
            this.d = i == 10 ? (String) uyyVar.d : "";
            this.c = phb.TAG;
        } else if (i3 != 2) {
            ((tvk) ((tvk) a.g()).j("com/google/android/libraries/internal/growth/growthkit/internal/ui/impl/gm/taptarget/FeatureHighlightViewFinder", "<init>", 58, "FeatureHighlightViewFinder.java")).s("No tap target element was specified.");
            this.d = "";
            this.c = phb.UNKNOWN;
        } else {
            this.d = String.valueOf(i == 11 ? ((Integer) uyyVar.d).intValue() : 0);
            this.c = phb.VE_ID;
        }
    }
}
