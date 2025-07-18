package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class muz implements lhf {
    public final String a;

    public muz() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof muz) {
            return this.a.equals(((muz) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "DownloadErrorDialogDismissEvent{videoId=" + this.a + "}";
    }

    public muz(String str) {
        this.a = str;
    }
}
