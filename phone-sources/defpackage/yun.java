package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class yun implements ypm {
    public final yup a;
    public final long b;
    public final Object c;
    public final yih d;

    public yun(yup yupVar, long j, Object obj, yih yihVar) {
        this.a = yupVar;
        this.b = j;
        this.c = obj;
        this.d = yihVar;
    }

    @Override // defpackage.ypm
    public final void eD() {
        yup yupVar = this.a;
        synchronized (yupVar) {
            long j = this.b;
            if (j < yupVar.e()) {
                return;
            }
            Object[] objArr = yupVar.a;
            objArr.getClass();
            if (yuq.a(objArr, j) == this) {
                yuq.b(objArr, j, yuq.a);
                yupVar.i();
            }
        }
    }
}
