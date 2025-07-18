package defpackage;

import java.security.PrivilegedExceptionAction;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dqv implements PrivilegedExceptionAction {
    private final /* synthetic */ int a;

    public dqv(int i) {
        this.a = i;
    }

    @Override // java.security.PrivilegedExceptionAction
    public final /* synthetic */ Object run() {
        int i = this.a;
        return i != 0 ? i != 1 ? a.V() : a.V() : a.V();
    }
}
