package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ldz implements Runnable {
    final /* synthetic */ AtomicReference a;
    final /* synthetic */ String b;
    final /* synthetic */ String c;
    final /* synthetic */ leo d;

    public ldz(leo leoVar, AtomicReference atomicReference, String str, String str2) {
        this.a = atomicReference;
        this.b = str;
        this.c = str2;
        this.d = leoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        lgp lgpVarK = this.d.y.k();
        lgpVarK.g();
        lgpVarK.a();
        lgpVarK.p(new lge(lgpVarK, this.a, this.b, this.c, lgpVarK.i(false)));
    }
}
