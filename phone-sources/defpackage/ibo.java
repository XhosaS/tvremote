package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ibo implements ysy {
    final /* synthetic */ ysy a;
    final /* synthetic */ boolean b;
    final /* synthetic */ Throwable c;
    private int d;

    public ibo(ysy ysyVar, boolean z, Throwable th) {
        this.b = z;
        this.c = th;
        this.a = ysyVar;
    }

    @Override // defpackage.ysy
    public final Object emit(Object obj, yih yihVar) {
        int i = this.d;
        this.d = i + 1;
        if (i < 0) {
            throw new ArithmeticException("Index overflow has happened");
        }
        ysy ysyVar = this.a;
        int i2 = 2;
        if (i == 0 && this.b && this.c == null) {
            i2 = 3;
        }
        Object objEmit = ysyVar.emit(new iar(obj, i2), yihVar);
        return objEmit == yio.a ? objEmit : ygi.a;
    }
}
