package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class jcm implements zxe {
    final /* synthetic */ jcv a;

    public jcm(jcv jcvVar) {
        this.a = jcvVar;
    }

    @Override // defpackage.zxe
    public final void a(Throwable th) {
        ((zdv) ((zdv) jcv.a.d()).q("com/google/android/apps/tvsearch/voice/dsp/DspManager$4", "onFailure", 474, "DspManager.java")).u("Could not calculate if software based hotword should run. Set to false by default.");
        this.a.C = false;
    }

    @Override // defpackage.zxe
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        this.a.C = ((Boolean) obj).booleanValue();
    }
}
