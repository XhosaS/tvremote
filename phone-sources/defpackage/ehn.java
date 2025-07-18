package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ehn extends Thread {
    final /* synthetic */ eho a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ehn(eho ehoVar) {
        super("ExoPlayer:SimpleDecoder");
        this.a = ehoVar;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        do {
            try {
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
        } while (this.a.q());
    }
}
