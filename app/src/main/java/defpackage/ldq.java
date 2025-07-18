package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ldq implements Runnable {
    final /* synthetic */ long a;
    final /* synthetic */ leo b;

    public ldq(leo leoVar, long j) {
        this.a = j;
        this.b = leoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        lbk lbkVar = this.b.y;
        lao laoVar = lbkVar.e;
        lbkVar.m(laoVar);
        lal lalVar = laoVar.j;
        long j = this.a;
        lalVar.b(j);
        lab labVar = lbkVar.f;
        lbkVar.o(labVar);
        labVar.j.b("Session timeout duration set", Long.valueOf(j));
    }
}
