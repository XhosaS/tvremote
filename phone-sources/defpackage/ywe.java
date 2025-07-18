package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ywe implements yih, yiw {
    private final yih a;
    private final yil b;

    public ywe(yih yihVar, yil yilVar) {
        this.a = yihVar;
        this.b = yilVar;
    }

    @Override // defpackage.yiw
    public final yiw getCallerFrame() {
        yih yihVar = this.a;
        if (yihVar instanceof yiw) {
            return (yiw) yihVar;
        }
        return null;
    }

    @Override // defpackage.yih
    public final yil getContext() {
        return this.b;
    }

    @Override // defpackage.yiw
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // defpackage.yih
    public final void resumeWith(Object obj) {
        this.a.resumeWith(obj);
    }
}
