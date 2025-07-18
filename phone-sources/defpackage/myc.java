package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class myc {
    public final String a;
    public final String b;

    public myc() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof myc) {
            myc mycVar = (myc) obj;
            if (this.a.equals(mycVar.a) && this.b.equals(mycVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "HideUnavailableEpisodesViewModel{messageText=" + this.a + ", toggleText=" + this.b + "}";
    }

    public myc(String str, String str2) {
        this.a = str;
        this.b = str2;
    }
}
