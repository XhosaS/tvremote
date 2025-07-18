package defpackage;

import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class muw implements Parcelable {
    public final String a;
    public final String b;
    public final boolean c;

    public muw() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof muw) {
            muw muwVar = (muw) obj;
            if (this.a.equals(muwVar.a) && this.b.equals(muwVar.b) && this.c == muwVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ (true != this.c ? 1237 : 1231);
    }

    public final String toString() {
        return "DownloadErrorDialogViewModel{videoId=" + this.a + ", message=" + this.b + ", showManageDownloads=" + this.c + "}";
    }

    public muw(String str, String str2, boolean z) {
        if (str == null) {
            throw new NullPointerException("Null videoId");
        }
        this.a = str;
        if (str2 == null) {
            throw new NullPointerException("Null message");
        }
        this.b = str2;
        this.c = z;
    }
}
