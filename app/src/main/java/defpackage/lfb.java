package defpackage;

import java.lang.reflect.InvocationTargetException;

/* compiled from: PG */
/* loaded from: classes.dex */
class lfb implements Runnable {
    final /* synthetic */ lez a;
    final /* synthetic */ lez b;
    final /* synthetic */ long c;
    final /* synthetic */ boolean d;
    final /* synthetic */ lfg e;

    public lfb(lfg lfgVar, lez lezVar, lez lezVar2, long j, boolean z) {
        this.a = lezVar;
        this.b = lezVar2;
        this.c = j;
        this.d = z;
        this.e = lfgVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        this.e.l(this.a, this.b, this.c, this.d, null);
    }
}
