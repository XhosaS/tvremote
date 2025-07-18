package defpackage;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yin implements yih, yiw {
    private static final AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(yin.class, Object.class, "result");
    private final yih b;
    private volatile Object result;

    public yin(yih yihVar, Object obj) {
        this.b = yihVar;
        this.result = obj;
    }

    @Override // defpackage.yiw
    public final yiw getCallerFrame() {
        yih yihVar = this.b;
        if (yihVar instanceof yiw) {
            return (yiw) yihVar;
        }
        return null;
    }

    @Override // defpackage.yih
    public final yil getContext() {
        return this.b.getContext();
    }

    @Override // defpackage.yiw
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // defpackage.yih
    public final void resumeWith(Object obj) {
        while (true) {
            Object obj2 = this.result;
            yio yioVar = yio.b;
            if (obj2 != yioVar) {
                yio yioVar2 = yio.a;
                if (obj2 != yioVar2) {
                    throw new IllegalStateException("Already resumed");
                }
                if (a.F(a, this, yioVar2, yio.c)) {
                    this.b.resumeWith(obj);
                    return;
                }
            } else if (a.F(a, this, yioVar, obj)) {
                return;
            }
        }
    }

    public final String toString() {
        yih yihVar = this.b;
        Objects.toString(yihVar);
        return "SafeContinuation for ".concat(yihVar.toString());
    }
}
