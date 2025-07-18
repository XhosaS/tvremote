package j$.nio.file;

import java.nio.file.Watchable;

/* loaded from: classes4.dex */
public final /* synthetic */ class Q implements T {
    public final /* synthetic */ Watchable a;

    public /* synthetic */ Q(Watchable watchable) {
        this.a = watchable;
    }

    @Override // j$.nio.file.T
    public final /* synthetic */ M c(P p, D[] dArr, G[] gArr) {
        return K.b(this.a.register(O.a(p), A.l(dArr), A.m(gArr)));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        Watchable watchable = this.a;
        if (obj instanceof Q) {
            obj = ((Q) obj).a;
        }
        return watchable.equals(obj);
    }

    @Override // j$.nio.file.T
    public final /* synthetic */ M f(P p, D[] dArr) {
        return K.b(this.a.register(O.a(p), A.l(dArr)));
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
