package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ywa<T> extends yiv implements ysy, yiw {
    public final ysy a;
    public final yil b;
    public final int c;
    private yil d;
    private yih e;

    public ywa(ysy ysyVar, yil yilVar) {
        super(yvx.a, yim.a);
        this.a = ysyVar;
        this.b = yilVar;
        this.c = ((Number) yilVar.fold(0, new dsc(18))).intValue();
    }

    @Override // defpackage.ysy
    public final Object emit(T t, yih<? super ygi> yihVar) {
        try {
            yil context = yihVar.getContext();
            yoz.z(context);
            yil yilVar = this.d;
            if (yilVar != context) {
                if (yilVar instanceof yvu) {
                    throw new IllegalStateException(ylh.r("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((yvu) yilVar).a + ", but then emission attempt of value '" + t + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            "));
                }
                if (((Number) context.fold(0, new ynl(this, 2))).intValue() != this.c) {
                    throw new IllegalStateException("Flow invariant is violated:\n\t\tFlow was collected in " + this.b + ",\n\t\tbut emission happened in " + context + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead");
                }
                this.d = context;
            }
            this.e = yihVar;
            yka ykaVar = ywc.a;
            ysy ysyVar = this.a;
            ysyVar.getClass();
            Object objA = ykaVar.a(ysyVar, t, this);
            yio yioVar = yio.a;
            if (!yks.e(objA, yioVar)) {
                this.e = null;
            }
            if (objA == yioVar) {
                yihVar.getClass();
            }
            return objA == yioVar ? objA : ygi.a;
        } catch (Throwable th) {
            this.d = new yvu(th, yihVar.getContext());
            throw th;
        }
    }

    @Override // defpackage.yit, defpackage.yiw
    public final yiw getCallerFrame() {
        yih yihVar = this.e;
        if (yihVar instanceof yiw) {
            return (yiw) yihVar;
        }
        return null;
    }

    @Override // defpackage.yiv, defpackage.yih
    public final yil getContext() {
        yil yilVar = this.d;
        return yilVar == null ? yim.a : yilVar;
    }

    @Override // defpackage.yit, defpackage.yiw
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // defpackage.yit
    protected final Object invokeSuspend(Object obj) {
        Throwable thA = yfy.a(obj);
        if (thA != null) {
            this.d = new yvu(thA, getContext());
        }
        yih yihVar = this.e;
        if (yihVar != null) {
            yihVar.resumeWith(obj);
        }
        return yio.a;
    }

    @Override // defpackage.yiv, defpackage.yit
    public final void releaseIntercepted() {
        super.releaseIntercepted();
    }
}
