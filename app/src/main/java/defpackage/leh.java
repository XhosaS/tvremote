package defpackage;

import java.lang.reflect.InvocationTargetException;

/* compiled from: PG */
/* loaded from: classes.dex */
class leh implements Runnable {
    final /* synthetic */ Boolean a;
    final /* synthetic */ leo b;

    public leh(leo leoVar, Boolean bool) {
        this.a = bool;
        this.b = leoVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        this.b.F(this.a, true);
    }
}
