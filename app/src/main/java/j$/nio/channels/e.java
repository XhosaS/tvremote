package j$.nio.channels;

import java.nio.channels.CompletionHandler;

/* loaded from: classes3.dex */
public final /* synthetic */ class e implements CompletionHandler {
    public final /* synthetic */ f a;

    public /* synthetic */ e(f fVar) {
        this.a = fVar;
    }

    public static /* synthetic */ CompletionHandler a(f fVar) {
        if (fVar == null) {
            return null;
        }
        return fVar instanceof d ? ((d) fVar).a : new e(fVar);
    }

    @Override // java.nio.channels.CompletionHandler
    public final /* synthetic */ void completed(Object obj, Object obj2) {
        ((d) this.a).a(obj, obj2);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        f fVar = this.a;
        if (obj instanceof e) {
            obj = ((e) obj).a;
        }
        return fVar.equals(obj);
    }

    @Override // java.nio.channels.CompletionHandler
    public final /* synthetic */ void failed(Throwable th, Object obj) {
        ((d) this.a).c(th, obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
