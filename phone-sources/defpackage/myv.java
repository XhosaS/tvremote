package defpackage;

import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class myv implements Parcelable {
    public final boolean a;
    public final String b;

    public myv() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof myv) {
            myv myvVar = (myv) obj;
            if (this.a == myvVar.a && this.b.equals(myvVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "RemoveItemDialogViewModel{isShow=" + this.a + ", title=" + this.b + "}";
    }

    public myv(boolean z, String str) {
        this.a = z;
        if (str == null) {
            throw new NullPointerException("Null title");
        }
        this.b = str;
    }
}
