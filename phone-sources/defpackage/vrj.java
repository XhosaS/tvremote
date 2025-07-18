package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vrj {
    public final String a;
    public final CharSequence b;
    public final CharSequence c;
    public final yjv d;
    public final CharSequence e;

    public vrj(String str, CharSequence charSequence, CharSequence charSequence2, yjv yjvVar, CharSequence charSequence3) {
        charSequence2.getClass();
        this.a = str;
        this.b = charSequence;
        this.c = charSequence2;
        this.d = yjvVar;
        this.e = charSequence3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vrj)) {
            return false;
        }
        vrj vrjVar = (vrj) obj;
        return yks.e(this.a, vrjVar.a) && yks.e(this.b, vrjVar.b) && yks.e(this.c, vrjVar.c) && yks.e(this.d, vrjVar.d) && yks.e(this.e, vrjVar.e);
    }

    public final int hashCode() {
        int iHashCode = (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
        CharSequence charSequence = this.e;
        return (iHashCode * 31) + (charSequence == null ? 0 : charSequence.hashCode());
    }

    public final String toString() {
        return "CustomDialogData(title=" + this.a + ", message=" + ((Object) this.b) + ", positiveButtonText=" + ((Object) this.c) + ", onPisitiveButtonClicked=" + this.d + ", negativeButtonText=" + ((Object) this.e) + ")";
    }
}
