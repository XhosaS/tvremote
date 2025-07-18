package defpackage;

import com.google.common.collect.Iterables;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class ezl implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    public /* synthetic */ ezl(Object obj, int i, long j, long j2, int i2) {
        this.e = i2;
        this.d = obj;
        this.a = i;
        this.b = j;
        this.c = j2;
    }

    /* JADX WARN: Type inference failed for: r1v7, types: [els, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        if (this.e != 0) {
            String str = edt.a;
            long j = this.c;
            ((dwi) this.d).a.g(this.a, this.b, j);
            return;
        }
        ele eleVar = (ele) ((ft) this.d).a;
        eld eldVar = eleVar.b;
        evz evzVar = eldVar.b.isEmpty() ? null : (evz) Iterables.getLast(eldVar.b);
        long j2 = this.c;
        long j3 = this.b;
        int i = this.a;
        ekl eklVarH = eleVar.H(evzVar);
        eleVar.N(eklVarH, 1006, new ekq(eklVarH, i, j3, j2, 1));
    }
}
