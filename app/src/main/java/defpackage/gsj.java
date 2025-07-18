package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gsj {
    public final String a;
    public final String b;

    public gsj(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gsj)) {
            return false;
        }
        gsj gsjVar = (gsj) obj;
        return agvy.c(this.a, gsjVar.a) && agvy.c(this.b, gsjVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "NotificationChannelInfo(channelId=" + this.a + ", channelName=" + this.b + ")";
    }
}
