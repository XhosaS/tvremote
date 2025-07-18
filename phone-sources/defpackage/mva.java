package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mva implements lhf {
    public final String a;

    public mva() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mva) {
            return this.a.equals(((mva) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "DownloadErrorDialogManageDownloadsEvent{videoId=" + this.a + "}";
    }

    public mva(String str) {
        this.a = str;
    }
}
