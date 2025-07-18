package defpackage;

import android.os.CancellationSignal;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class cem implements CancellationSignal.OnCancelListener {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ cem(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, yqe] */
    @Override // android.os.CancellationSignal.OnCancelListener
    public final void onCancel() {
        if (this.b == 0) {
            this.a.t(null);
            return;
        }
        akb akbVar = (akb) this.a;
        aid aidVar = akbVar.a;
        ahu ahuVar = akbVar.b;
        aidVar.a.b().c();
        ahw ahwVar = aidVar.a;
        ahwVar.c();
        akbVar.m(ahwVar);
        aid.h(aidVar, true, 1);
    }
}
