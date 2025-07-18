package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
class jcr implements zxe {
    final /* synthetic */ jcv a;

    public jcr(jcv jcvVar) {
        this.a = jcvVar;
    }

    @Override // defpackage.zxe
    public final void a(Throwable th) {
        ((zdv) ((zdv) jcv.a.d()).q("com/google/android/apps/tvsearch/voice/dsp/DspManager$9", "onFailure", 871, "DspManager.java")).u("Could not check if DSP recognition should run. Stopping recognition.");
        jcv jcvVar = this.a;
        if (jcvVar.s) {
            jcvVar.n();
            jcvVar.e();
        }
        jcvVar.h();
    }

    @Override // defpackage.zxe
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        zdy zdyVar = jcv.a;
        if (((Boolean) obj).booleanValue()) {
            jcv jcvVar = this.a;
            if (jcvVar.v == null) {
                jcvVar.v = Locale.getDefault().toLanguageTag();
            }
            if (jcvVar.w == null) {
                jcvVar.w = jcvVar.c();
            }
            jcvVar.f(jcvVar.v, jcvVar.w);
        } else {
            jcv jcvVar2 = this.a;
            if (jcvVar2.s) {
                jcvVar2.n();
                jcvVar2.e();
            }
        }
        this.a.h();
    }
}
