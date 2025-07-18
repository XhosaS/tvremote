package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class est extends Exception {
    public final String a;
    public final boolean b;
    public final ess c;
    public final String d;

    public est(dze dzeVar, Throwable th, boolean z, int i) {
        this("Decoder init failed: [" + i + "], " + dzeVar.toString(), th, dzeVar.Y, z, null, "androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_neg_" + Math.abs(i));
    }

    public est(String str, Throwable th, String str2, boolean z, ess essVar, String str3) {
        super(str, th);
        this.a = str2;
        this.b = z;
        this.c = essVar;
        this.d = str3;
    }
}
