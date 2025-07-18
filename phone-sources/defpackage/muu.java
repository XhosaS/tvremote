package defpackage;

import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class muu implements Parcelable {
    public final String a;
    public final int b;
    public final CharSequence c;

    public muu() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof muu) {
            muu muuVar = (muu) obj;
            if (this.a.equals(muuVar.a) && this.b == muuVar.b && this.c.equals(muuVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        return "CancelDownloadDialogViewModel{videoId=" + this.a + ", titleResId=" + this.b + ", message=" + this.c.toString() + "}";
    }

    public muu(String str, int i, CharSequence charSequence) {
        if (str == null) {
            throw new NullPointerException("Null videoId");
        }
        this.a = str;
        this.b = i;
        if (charSequence == null) {
            throw new NullPointerException("Null message");
        }
        this.c = charSequence;
    }
}
