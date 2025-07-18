package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class jcp implements zxe {
    final /* synthetic */ jcv a;

    public jcp(jcv jcvVar) {
        this.a = jcvVar;
    }

    @Override // defpackage.zxe
    public final void a(Throwable th) {
        ((zdv) ((zdv) jcv.a.d()).q("com/google/android/apps/tvsearch/voice/dsp/DspManager$7", "onFailure", 728, "DspManager.java")).u("Could not check if DSP recognition should run. Not starting DSP recognition");
    }

    @Override // defpackage.zxe
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        if (((Boolean) obj).booleanValue()) {
            jcv jcvVar = this.a;
            jcvVar.k();
            if (jcvVar.m()) {
                jcvVar.o.e();
            }
        }
    }
}
