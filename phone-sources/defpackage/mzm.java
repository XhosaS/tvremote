package defpackage;

import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class mzm implements Parcelable {
    public final kwl a;

    public mzm() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mzm) {
            return this.a.equals(((mzm) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "SeasonViewModel{season=" + this.a.toString() + "}";
    }

    public mzm(kwl kwlVar) {
        if (kwlVar == null) {
            throw new NullPointerException("Null season");
        }
        this.a = kwlVar;
    }
}
