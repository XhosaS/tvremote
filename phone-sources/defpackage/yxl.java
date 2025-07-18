package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class yxl extends ynw implements yiw {
    public final yih e;

    public yxl(yil yilVar, yih yihVar) {
        super(yilVar, true, true);
        this.e = yihVar;
    }

    @Override // defpackage.ynw
    protected void eM(Object obj) {
        yih yihVar = this.e;
        yihVar.resumeWith(yks.l(obj, yihVar));
    }

    @Override // defpackage.yql
    protected void eR(Object obj) {
        yih yihVar = this.e;
        ywv.a(wcq.S(yihVar), yks.l(obj, yihVar));
    }

    @Override // defpackage.yql
    protected final boolean eS() {
        return true;
    }

    @Override // defpackage.yiw
    public final yiw getCallerFrame() {
        yih yihVar = this.e;
        if (yihVar instanceof yiw) {
            return (yiw) yihVar;
        }
        return null;
    }

    @Override // defpackage.yiw
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    public void e() {
    }
}
