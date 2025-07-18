package defpackage;

import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class npw implements onu {
    public final /* synthetic */ long a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ npw(Object obj, long j, int i) {
        this.c = i;
        this.b = obj;
        this.a = j;
    }

    @Override // defpackage.onu
    public final void d(Exception exc) {
        int i = this.c;
        if (i == 0) {
            ((npx) this.b).b.d.l(this.a, exc instanceof nwk ? ((nwk) exc).a() : 13);
        } else if (i == 1) {
            ((AtomicLong) ((rbi) this.b).b).set(this.a);
        } else {
            ((oxn) this.b).b(this.a, true);
            ((tvk) ((tvk) oxn.a.g()).i(exc)).s("Failed to add notification impression to cross-app capping, API might not be available.");
        }
    }
}
