package defpackage;

import java.lang.reflect.InvocationTargetException;

/* compiled from: PG */
/* loaded from: classes.dex */
class lej implements Runnable {
    final /* synthetic */ lct a;
    final /* synthetic */ long b;
    final /* synthetic */ boolean c;
    final /* synthetic */ leo d;

    public lej(leo leoVar, lct lctVar, long j, boolean z) {
        this.a = lctVar;
        this.b = j;
        this.c = z;
        this.d = leoVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        leo leoVar = this.d;
        lct lctVar = this.a;
        leoVar.E(lctVar);
        leoVar.O(lctVar, this.b, this.c);
    }
}
