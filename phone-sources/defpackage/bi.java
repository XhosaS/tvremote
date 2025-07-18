package defpackage;

import android.transition.Transition;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bi extends bc {
    public final Object b;
    public final boolean c;
    public final Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bi(C0038do c0038do, boolean z, boolean z2) {
        Object exitTransition;
        super(c0038do);
        c0038do.getClass();
        boolean z3 = false;
        if (c0038do.h == 2) {
            if (z) {
                exitTransition = c0038do.a.getReenterTransition();
                z3 = true;
            } else {
                exitTransition = c0038do.a.getEnterTransition();
            }
        } else if (z) {
            exitTransition = c0038do.a.getReturnTransition();
            z3 = true;
        } else {
            exitTransition = c0038do.a.getExitTransition();
        }
        this.b = exitTransition;
        this.c = c0038do.h == 2 ? z3 ? c0038do.a.getAllowReturnTransitionOverlap() : c0038do.a.getAllowEnterTransitionOverlap() : true;
        this.d = z2 ? z3 ? c0038do.a.getSharedElementReturnTransition() : c0038do.a.getSharedElementEnterTransition() : null;
    }

    private final dg d(Object obj) {
        if (obj == null) {
            return null;
        }
        dg dgVar = cz.a;
        if (obj instanceof Transition) {
            return dgVar;
        }
        dg dgVar2 = cz.b;
        if (dgVar2 != null && dgVar2.m(obj)) {
            return dgVar2;
        }
        throw new IllegalArgumentException("Transition " + obj + " for fragment " + this.a.a + " is not a valid framework Transition or AndroidX Transition");
    }

    public final dg a() {
        Object obj = this.d;
        Object obj2 = this.b;
        dg dgVarD = d(obj2);
        dg dgVarD2 = d(obj);
        if (dgVarD == null || dgVarD2 == null || dgVarD == dgVarD2) {
            return dgVarD == null ? dgVarD2 : dgVarD;
        }
        throw new IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + this.a.a + " returned Transition " + obj2 + " which uses a different Transition  type than its shared element transition " + obj);
    }

    public final boolean c() {
        return this.d != null;
    }
}
