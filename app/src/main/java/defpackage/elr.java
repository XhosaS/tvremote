package defpackage;

import android.content.Context;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class elr extends ViewGroup {
    public elr(Context context) {
        super(context, null);
    }

    public abstract elv a(int i);

    public abstract void e(int i, elv elvVar);

    public abstract void g(elv elvVar, int i, int i2);

    @Override // android.view.ViewGroup
    public boolean getClipChildren() {
        return super.getClipChildren();
    }

    public abstract int getMountItemCount();

    public abstract void k(elv elvVar);
}
