package defpackage;

import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class rlm implements Parcelable {
    public final boolean a;
    public final Parcelable b;

    public rlm() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof rlm) {
            rlm rlmVar = (rlm) obj;
            if (this.a == rlmVar.a && this.b.equals(rlmVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "State{isPortraitInFullScreen=" + this.a + ", parentState=" + this.b.toString() + "}";
    }

    public rlm(boolean z, Parcelable parcelable) {
        this.a = z;
        if (parcelable == null) {
            throw new NullPointerException("Null parentState");
        }
        this.b = parcelable;
    }
}
