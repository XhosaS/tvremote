package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mjy {
    public String a;
    public int b;
    public int c;
    public kwx d;
    public final String e = "";

    public mjy(String str, int i, int i2, kwx kwxVar) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = kwxVar;
    }

    public final String toString() {
        return "RemotePlayerState [videoId=" + this.a + ", state=" + this.b + ", time=" + this.c + ", bufferedPercentage=0, subtitleTrack=" + String.valueOf(this.d) + ", errorMessage=" + this.e + ", canRetry=false]";
    }
}
