package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class aibc implements Runnable {
    public final /* synthetic */ aicf a;
    public final /* synthetic */ aicg b;

    public /* synthetic */ aibc(aicf aicfVar, aicg aicgVar) {
        this.a = aicfVar;
        this.b = aicgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.b.a();
        } catch (Throwable th) {
            this.a.b(new ahzy("System error", th));
        }
    }
}
