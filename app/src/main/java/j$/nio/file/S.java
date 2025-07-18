package j$.nio.file;

import java.nio.file.Watchable;

/* loaded from: classes3.dex */
public final /* synthetic */ class S implements U {
    public final /* synthetic */ Watchable a;

    public /* synthetic */ S(Watchable watchable) {
        this.a = watchable;
    }

    @Override // j$.nio.file.U
    public final /* synthetic */ N c(Q q, E[] eArr, H[] hArr) {
        return L.b(this.a.register(P.a(q), B.l(eArr), B.m(hArr)));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        Watchable watchable = this.a;
        if (obj instanceof S) {
            obj = ((S) obj).a;
        }
        return watchable.equals(obj);
    }

    @Override // j$.nio.file.U
    public final /* synthetic */ N f(Q q, E[] eArr) {
        return L.b(this.a.register(P.a(q), B.l(eArr)));
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
