package defpackage;

import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class ktd implements Parcelable {
    public static final Parcelable.Creator a = new geb(11);
    public final int b;

    public ktd() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof ktd) && this.b == ((ktd) obj).b;
    }

    public final int hashCode() {
        return this.b ^ 1000003;
    }

    public final String toString() {
        return "AssetRestriction{restrictedActionType=" + this.b + "}";
    }

    public ktd(int i) {
        this.b = i;
    }
}
