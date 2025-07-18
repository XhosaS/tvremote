package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kqx extends Thread {
    final /* synthetic */ ieg a;
    final /* synthetic */ kqy b;

    public kqx(kqy kqyVar, ieg iegVar) {
        this.a = iegVar;
        this.b = kqyVar;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, lfn] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, ldv] */
    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            this.b.f.j(this.a);
        } catch (Exception unused) {
        }
        try {
            ?? r3 = this.b.c;
            boolean zCw = r3.cw();
            ete.g("video/avc", true, zCw);
            ete.g("video/avc", false, zCw);
            ete.g("audio/mp4a-latm", false, false);
            if (r3.dp()) {
                ete.g("video/hevc", true, zCw);
                ete.g("video/hevc", false, zCw);
                if (r3.dn()) {
                    ete.g("video/dolby-vision", true, zCw);
                    ete.g("video/dolby-vision", false, zCw);
                }
            }
        } catch (Exception unused2) {
        }
    }
}
