package defpackage;

import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class myj implements Parcelable {
    public final ksn a;
    public final ksy b;
    public final String c;
    public final boolean d;

    public myj() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof myj) {
            myj myjVar = (myj) obj;
            if (this.a.equals(myjVar.a) && this.b.equals(myjVar.b) && this.c.equals(myjVar.c) && this.d == myjVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ (true != this.d ? 1237 : 1231);
    }

    public final String toString() {
        ksy ksyVar = this.b;
        return "FamilyLibraryShareStatusUpdate{account=" + this.a.toString() + ", assetId=" + ksyVar.toString() + ", assetTitle=" + this.c + ", isToShare=" + this.d + "}";
    }

    public myj(ksn ksnVar, ksy ksyVar, String str, boolean z) {
        if (ksnVar == null) {
            throw new NullPointerException("Null account");
        }
        this.a = ksnVar;
        if (ksyVar == null) {
            throw new NullPointerException("Null assetId");
        }
        this.b = ksyVar;
        if (str == null) {
            throw new NullPointerException("Null assetTitle");
        }
        this.c = str;
        this.d = z;
    }
}
