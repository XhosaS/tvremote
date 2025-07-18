package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mul {
    public final CharSequence a;
    public final CharSequence b;
    public final sdk c;
    private final tst d;

    public mul() {
        throw null;
    }

    public static nag a() {
        nag nagVar = new nag((byte[]) null, (byte[]) null, (byte[]) null);
        nagVar.c = null;
        nagVar.d = null;
        nagVar.b = trk.a;
        return nagVar;
    }

    public final boolean equals(Object obj) {
        CharSequence charSequence;
        sdk sdkVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof mul) {
            mul mulVar = (mul) obj;
            if (this.a.equals(mulVar.a) && ((charSequence = this.b) != null ? charSequence.equals(mulVar.b) : mulVar.b == null) && ((sdkVar = this.c) != null ? sdkVar.equals(mulVar.c) : mulVar.c == null) && this.d.equals(mulVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        CharSequence charSequence = this.b;
        int iHashCode2 = ((iHashCode * 1000003) ^ (charSequence == null ? 0 : charSequence.hashCode())) * 1000003;
        sdk sdkVar = this.c;
        return ((iHashCode2 ^ (sdkVar != null ? sdkVar.hashCode() : 0)) * 1000003) ^ 2040732332;
    }

    public final String toString() {
        tst tstVar = this.d;
        sdk sdkVar = this.c;
        CharSequence charSequence = this.b;
        return "AssetCollectionHeaderViewModel{title=" + String.valueOf(this.a) + ", subtitle=" + String.valueOf(charSequence) + ", iconImageBinder=" + String.valueOf(sdkVar) + ", optionalOnClickListener=" + String.valueOf(tstVar) + "}";
    }

    public mul(CharSequence charSequence, CharSequence charSequence2, sdk sdkVar, tst tstVar) {
        this.a = charSequence;
        this.b = charSequence2;
        this.c = sdkVar;
        this.d = tstVar;
    }
}
