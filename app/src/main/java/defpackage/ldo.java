package defpackage;

import java.lang.reflect.InvocationTargetException;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ldo implements Runnable {
    final /* synthetic */ boolean a;
    final /* synthetic */ leo b;

    public ldo(leo leoVar, boolean z) {
        this.a = z;
        this.b = leoVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        leo leoVar = this.b;
        lbk lbkVar = leoVar.y;
        boolean zS = lbkVar.s();
        boolean zR = lbkVar.r();
        boolean z = this.a;
        Boolean boolValueOf = Boolean.valueOf(z);
        lbkVar.v = boolValueOf;
        if (zR == z) {
            lab labVar = lbkVar.f;
            lbkVar.o(labVar);
            labVar.k.b("Default data collection state already set to", boolValueOf);
        }
        if (lbkVar.s() == zS || lbkVar.s() != lbkVar.r()) {
            lab labVar2 = lbkVar.f;
            lbkVar.o(labVar2);
            labVar2.h.c("Default data collection is different than actual status", boolValueOf, Boolean.valueOf(zS));
        }
        leoVar.J();
    }
}
