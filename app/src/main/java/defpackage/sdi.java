package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class sdi implements zxe {
    final /* synthetic */ sdj a;

    public sdi(sdj sdjVar) {
        this.a = sdjVar;
    }

    @Override // defpackage.zxe
    public final void a(Throwable th) {
        ((zdv) ((zdv) ((zdv) sdj.a.d().o(zfi.a, "ALT.AFCSession")).p(th)).q("com/google/android/libraries/search/audio/audiofocus/impl/AudioFocusSessionImpl$1", "onFailure", 'x', "AudioFocusSessionImpl.java")).u("#audio# Failed to get ReleaseAudioFocusStatus future.");
        this.a.i.b(skj.d(6));
    }

    @Override // defpackage.zxe
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        this.a.i.b((ruc) obj);
    }
}
