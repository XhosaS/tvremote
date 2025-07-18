package defpackage;

import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class mvm implements Parcelable {
    public final String a;
    public final String b;

    public mvm() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mvm) {
            mvm mvmVar = (mvm) obj;
            if (this.a.equals(mvmVar.a) && this.b.equals(mvmVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "OptionItem{itemId=" + this.a + ", title=" + this.b + "}";
    }

    public mvm(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("Null itemId");
        }
        this.a = str;
        if (str2 == null) {
            throw new NullPointerException("Null title");
        }
        this.b = str2;
    }
}
