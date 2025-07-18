package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class aibg implements Runnable {
    public final /* synthetic */ aicf a;
    public final /* synthetic */ aicg b;

    public /* synthetic */ aibg(aicf aicfVar, aicg aicgVar) {
        this.a = aicfVar;
        this.b = aicgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.b.a();
        } catch (Throwable th) {
            this.a.c(th);
        }
    }
}
