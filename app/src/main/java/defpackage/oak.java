package defpackage;

import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class oak {
    public abstract oal a();

    protected abstract void b(boolean z);

    public abstract void c(int i);

    public abstract void d(boolean z);

    protected abstract void e(WeakReference weakReference);

    public abstract void f(boolean z);

    public final oal g() {
        oal oalVarA = a();
        nyx nyxVar = (nyx) oalVarA;
        boolean z = true;
        if (nyxVar.q != null && nyxVar.r) {
            z = false;
        }
        yqw.M(z, "Setting an ElementsConfig overrides other values set on the ConversionContext, like useIncrementalMountOnChildren, useLegacyVisible, and elementsInteractionLogger. Configure them through the ElementsConfig instead of directly on the ConversionContext.");
        return oalVarA;
    }

    public final void h(acxn acxnVar) {
        e(acxnVar == null ? null : new WeakReference(acxnVar));
    }
}
