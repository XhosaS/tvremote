package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class mbe implements zxe {
    final /* synthetic */ mbf a;

    public mbe(mbf mbfVar) {
        this.a = mbfVar;
    }

    @Override // defpackage.zxe
    public final void a(Throwable th) {
        ((zdv) ((zdv) mbf.a.b()).q("com/google/android/libraries/assistant/soda/SodaAudioPusher$1", "onFailure", 127, "SodaAudioPusher.java")).x("Failed with: %s", th.getMessage());
        mbf mbfVar = this.a;
        mbfVar.f.q(th);
        mbfVar.a();
    }

    @Override // defpackage.zxe
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        mbf mbfVar = this.a;
        mbfVar.f.p(null);
        mbfVar.a();
    }
}
