package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
class jcn implements zxe {
    final /* synthetic */ String a;
    final /* synthetic */ jcv b;

    public jcn(jcv jcvVar, String str) {
        this.a = str;
        this.b = jcvVar;
    }

    @Override // defpackage.zxe
    public final void a(Throwable th) {
        ((zdv) ((zdv) jcv.a.d()).q("com/google/android/apps/tvsearch/voice/dsp/DspManager$5", "onFailure", 570, "DspManager.java")).u("Could not check if DSP recognition should run. Stopping recognition.");
        jcv jcvVar = this.b;
        jcvVar.n();
        jcvVar.h();
    }

    @Override // defpackage.zxe
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        if (((Boolean) obj).booleanValue()) {
            ((zdv) ((zdv) jcv.a.b()).q("com/google/android/apps/tvsearch/voice/dsp/DspManager$5", "onSuccess", 559, "DspManager.java")).x("Start dsp recognition due to %s.", this.a);
            this.b.k();
        } else {
            ((zdv) ((zdv) jcv.a.b()).q("com/google/android/apps/tvsearch/voice/dsp/DspManager$5", "onSuccess", 562, "DspManager.java")).x("Stop dsp recognition due to %s.", this.a);
            this.b.n();
        }
        this.b.h();
    }
}
