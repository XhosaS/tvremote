package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class myw {
    public final String a;
    public final CharSequence b;
    public final String c;
    public final ieg d;

    public myw() {
        throw null;
    }

    public static nag a() {
        nag nagVar = new nag();
        nagVar.e("");
        nagVar.a = "";
        nagVar.d("");
        nagVar.f(ieg.a);
        return nagVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof myw) {
            myw mywVar = (myw) obj;
            if (this.a.equals(mywVar.a) && this.b.equals(mywVar.b) && this.c.equals(mywVar.c) && this.d.equals(mywVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        ieg iegVar = this.d;
        return "MoreInfoItemViewModel{title=" + this.a + ", description=" + String.valueOf(this.b) + ", contentRatingId=" + this.c + ", tomatometerModelResult=" + String.valueOf(iegVar) + "}";
    }

    public myw(String str, CharSequence charSequence, String str2, ieg iegVar) {
        this.a = str;
        this.b = charSequence;
        this.c = str2;
        this.d = iegVar;
    }
}
