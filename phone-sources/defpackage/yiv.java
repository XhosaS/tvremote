package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class yiv extends yit {
    private final yil _context;
    private transient yih<Object> intercepted;

    public yiv(yih<Object> yihVar) {
        this(yihVar, yihVar != null ? yihVar.getContext() : null);
    }

    @Override // defpackage.yih
    public yil getContext() {
        yil yilVar = this._context;
        yilVar.getClass();
        return yilVar;
    }

    public final yih<Object> intercepted() {
        yih yihVarEF = this.intercepted;
        if (yihVarEF == null) {
            yii yiiVar = (yii) getContext().get(yii.k);
            yihVarEF = yiiVar != null ? yiiVar.eF(this) : this;
            this.intercepted = yihVarEF;
        }
        return yihVarEF;
    }

    @Override // defpackage.yit
    protected void releaseIntercepted() {
        yih<Object> yihVar = this.intercepted;
        if (yihVar != null && yihVar != this) {
            yij yijVar = getContext().get(yii.k);
            yijVar.getClass();
            ((yii) yijVar).d(yihVar);
        }
        this.intercepted = yiu.a;
    }

    public yiv(yih<Object> yihVar, yil yilVar) {
        super(yihVar);
        this._context = yilVar;
    }
}
