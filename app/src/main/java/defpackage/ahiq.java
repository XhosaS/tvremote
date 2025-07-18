package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ahiq implements ahcn {
    public final ahis a;
    public final long b;
    public final Object c;
    public final agsw d;

    public ahiq(ahis ahisVar, long j, Object obj, agsw agswVar) {
        this.a = ahisVar;
        this.b = j;
        this.c = obj;
        this.d = agswVar;
    }

    @Override // defpackage.ahcn
    public final void fn() {
        ahis ahisVar = this.a;
        synchronized (ahisVar) {
            long j = this.b;
            if (j < ahisVar.b()) {
                return;
            }
            Object[] objArr = ahisVar.a;
            objArr.getClass();
            if (ahit.a(objArr, j) == this) {
                ahit.b(objArr, j, ahit.a);
                ahisVar.e();
            }
        }
    }
}
