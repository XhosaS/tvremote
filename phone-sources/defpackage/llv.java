package defpackage;

import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class llv implements Parcelable {
    public final int a;
    public final boolean b;

    public llv() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof llv) {
            llv llvVar = (llv) obj;
            if (this.a == llvVar.a && this.b == llvVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (true != this.b ? 1237 : 1231) ^ ((this.a ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "PlaybackRestriction{maxHeight=" + this.a + ", allowHdr=" + this.b + "}";
    }

    public llv(int i, boolean z) {
        this.a = i;
        this.b = z;
    }
}
