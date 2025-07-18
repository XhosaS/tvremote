package defpackage;

import java.io.Serializable;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class yit implements Serializable, yih, yiw {
    private final yih<Object> completion;

    public yit(yih<Object> yihVar) {
        this.completion = yihVar;
    }

    public yih<ygi> create(Object obj, yih<?> yihVar) {
        yihVar.getClass();
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    @Override // defpackage.yiw
    public yiw getCallerFrame() {
        yih<Object> yihVar = this.completion;
        if (yihVar instanceof yiw) {
            return (yiw) yihVar;
        }
        return null;
    }

    public final yih<Object> getCompletion() {
        return this.completion;
    }

    @Override // defpackage.yiw
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    protected abstract Object invokeSuspend(Object obj);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.yih
    public final void resumeWith(Object obj) {
        yih yihVar = this;
        while (true) {
            yihVar.getClass();
            yit yitVar = (yit) yihVar;
            yih yihVar2 = yitVar.completion;
            yihVar2.getClass();
            try {
                obj = yitVar.invokeSuspend(obj);
                if (obj == yio.a) {
                    return;
                }
            } catch (Throwable th) {
                obj = ybn.e(th);
            }
            yitVar.releaseIntercepted();
            if (!(yihVar2 instanceof yit)) {
                yihVar2.resumeWith(obj);
                return;
            }
            yihVar = yihVar2;
        }
    }

    public String toString() {
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        Objects.toString(stackTraceElement);
        return "Continuation at ".concat(String.valueOf(stackTraceElement));
    }

    public yih<ygi> create(yih<?> yihVar) {
        yihVar.getClass();
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    protected void releaseIntercepted() {
    }
}
