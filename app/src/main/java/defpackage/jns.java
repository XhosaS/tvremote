package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jns extends jnp {
    final /* synthetic */ jnw a;

    public jns(jnw jnwVar) {
        this.a = jnwVar;
    }

    @Override // defpackage.jnq
    public final void L() throws InterruptedException {
        jno jnoVar;
        jnw jnwVar = this.a;
        if (!((Boolean) jnwVar.b.a()).booleanValue() || (jnoVar = jnwVar.d) == null) {
            return;
        }
        ((zdv) hxr.f.b().q("com/google/android/apps/tvsearch/searchbar/activity/VoicePlateActivity$maybeSetUpSpeechRecognitionListener$1", "onFinishVoicePlate", 2476, "VoicePlateActivity.kt")).u("onFinishVoicePlate");
        ((hxc) jnoVar).a.a();
    }

    @Override // defpackage.jnq
    public final void c(jnn jnnVar) {
        jnnVar.getClass();
        Object obj = jnw.a;
        jnw jnwVar = this.a;
        synchronized (obj) {
            jnwVar.g = jnnVar;
        }
    }
}
