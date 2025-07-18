package defpackage;

import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class mvd implements Parcelable {
    public final int a;
    public final CharSequence b;

    public mvd() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mvd) {
            mvd mvdVar = (mvd) obj;
            if (this.a == mvdVar.a && this.b.equals(mvdVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "NoPreferredNetworkDialogViewModel{titleResId=" + this.a + ", message=" + this.b.toString() + "}";
    }

    public mvd(int i, CharSequence charSequence) {
        this.a = i;
        if (charSequence == null) {
            throw new NullPointerException("Null message");
        }
        this.b = charSequence;
    }
}
