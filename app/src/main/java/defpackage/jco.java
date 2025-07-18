package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
class jco implements zxe {
    final /* synthetic */ jcv a;

    public jco(jcv jcvVar) {
        this.a = jcvVar;
    }

    @Override // defpackage.zxe
    public final void a(Throwable th) {
        zdy zdyVar = jcv.a;
        ((zdv) ((zdv) zdyVar.d()).q("com/google/android/apps/tvsearch/voice/dsp/DspManager$6", "onFailure", 626, "DspManager.java")).u("Could not calculate if software based hotword should run. Stopping by default");
        jcv jcvVar = this.a;
        if (jcvVar.C) {
            ((zdv) ((zdv) zdyVar.b()).q("com/google/android/apps/tvsearch/voice/dsp/DspManager$6", "onFailure", 631, "DspManager.java")).u("Stopping software based hotword");
            jcvVar.C = false;
            jcvVar.o.f();
        }
    }

    @Override // defpackage.zxe
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        if (!((Boolean) obj).booleanValue()) {
            jcv jcvVar = this.a;
            if (jcvVar.C) {
                ((zdv) ((zdv) jcv.a.b()).q("com/google/android/apps/tvsearch/voice/dsp/DspManager$6", "onSuccess", 616, "DspManager.java")).u("Stopping software based hotword");
                jcvVar.C = false;
                jcvVar.o.f();
                return;
            }
            return;
        }
        jcv jcvVar2 = this.a;
        jcvVar2.p.removeMessages(3);
        if (jcvVar2.C) {
            return;
        }
        jcvVar2.C = true;
        ((zdv) ((zdv) jcv.a.b()).q("com/google/android/apps/tvsearch/voice/dsp/DspManager$6", "onSuccess", 608, "DspManager.java")).u("Will start software based hotword");
        jcvVar2.o.e();
    }
}
