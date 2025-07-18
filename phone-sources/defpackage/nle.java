package defpackage;

import com.google.android.gms.cast.MediaInfo;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nle {
    public nli a;
    private String b;
    private int c;
    private String d;
    private long e;
    private String f;
    private String g;

    public nle() {
        this.c = -1;
        this.e = -1L;
    }

    public final MediaInfo a() {
        return new MediaInfo(this.b, this.c, this.d, this.a, this.e, null, null, this.f, null, null, this.g, null, -1L, null, null, null, null);
    }

    public final void b() {
        this.d = "video/mp4";
    }

    public final void c(JSONObject jSONObject) {
        this.f = jSONObject.toString();
    }

    public final void d(long j) {
        if (j < 0 && j != -1) {
            throw new IllegalArgumentException("Invalid stream duration");
        }
        this.e = j;
    }

    public final void e() {
        this.c = 1;
    }

    public nle(String str) {
        this.c = -1;
        this.e = -1L;
        this.b = str;
    }

    public nle(String str, byte[] bArr) {
        this.c = -1;
        this.e = -1L;
        this.b = "";
        this.g = str;
    }
}
