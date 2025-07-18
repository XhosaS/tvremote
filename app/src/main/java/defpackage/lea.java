package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public class lea implements Runnable {
    final /* synthetic */ AtomicReference a;
    final /* synthetic */ String b;
    final /* synthetic */ String c;
    final /* synthetic */ boolean d;
    final /* synthetic */ leo e;

    public lea(leo leoVar, AtomicReference atomicReference, String str, String str2, boolean z) {
        this.a = atomicReference;
        this.b = str;
        this.c = str2;
        this.d = z;
        this.e = leoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        lgp lgpVarK = this.e.y.k();
        lgpVarK.g();
        lgpVarK.a();
        lgpVarK.p(new lgg(lgpVarK, this.a, this.b, this.c, lgpVarK.i(false), this.d));
    }
}
