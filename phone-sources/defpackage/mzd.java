package defpackage;

import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class mzd implements Parcelable {
    public final String a;
    public final String b;

    public mzd() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mzd) {
            mzd mzdVar = (mzd) obj;
            if (this.a.equals(mzdVar.a) && this.b.equals(mzdVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "MovieExtraInfoDialogViewModel{title=" + this.a + ", message=" + this.b + "}";
    }

    public mzd(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("Null title");
        }
        this.a = str;
        if (str2 == null) {
            throw new NullPointerException("Null message");
        }
        this.b = str2;
    }
}
