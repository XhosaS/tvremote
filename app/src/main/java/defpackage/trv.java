package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class trv implements ager {
    private final ager a;

    public trv(ager agerVar) {
        this.a = agerVar;
    }

    @Override // defpackage.ager
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void g(adkb adkbVar) {
        try {
            this.a.g(adkbVar);
        } catch (IllegalStateException e) {
            ((zdv) ((zdv) ((zdv) trw.a.d()).p(e)).q("com/google/android/libraries/speech/transcription/grpc/S3ConnectionUtil$CatchingStreamObserver", "onNext", '8', "S3ConnectionUtil.java")).u("Calling onNext failed.");
        }
    }

    @Override // defpackage.ager
    public final void e() {
        try {
            this.a.e();
        } catch (IllegalStateException e) {
            ((zdv) ((zdv) ((zdv) trw.a.d()).p(e)).q("com/google/android/libraries/speech/transcription/grpc/S3ConnectionUtil$CatchingStreamObserver", "onCompleted", 'A', "S3ConnectionUtil.java")).u("Calling onCompleted failed.");
        }
    }

    @Override // defpackage.ager
    public final void f(Throwable th) {
        try {
            this.a.f(th);
        } catch (IllegalStateException e) {
            ((zdv) ((zdv) ((zdv) trw.a.d()).p(e)).q("com/google/android/libraries/speech/transcription/grpc/S3ConnectionUtil$CatchingStreamObserver", "onError", 'J', "S3ConnectionUtil.java")).u("Calling onError failed.");
        }
    }
}
