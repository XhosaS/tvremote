package j$.nio.file;

import java.nio.file.WatchKey;
import java.nio.file.Watchable;
import java.util.List;

/* loaded from: classes3.dex */
public final /* synthetic */ class M implements WatchKey {
    public final /* synthetic */ N a;

    public /* synthetic */ M(N n) {
        this.a = n;
    }

    public static /* synthetic */ WatchKey a(N n) {
        if (n == null) {
            return null;
        }
        return n instanceof L ? ((L) n).a : new M(n);
    }

    @Override // java.nio.file.WatchKey
    public final /* synthetic */ void cancel() {
        ((L) this.a).a();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        N n = this.a;
        if (obj instanceof M) {
            obj = ((M) obj).a;
        }
        return n.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.nio.file.WatchKey
    public final /* synthetic */ boolean isValid() {
        return ((L) this.a).c();
    }

    @Override // java.nio.file.WatchKey
    public final /* synthetic */ List pollEvents() {
        return AbstractC0002a.n(((L) this.a).d());
    }

    @Override // java.nio.file.WatchKey
    public final /* synthetic */ boolean reset() {
        return ((L) this.a).e();
    }

    @Override // java.nio.file.WatchKey
    public final /* synthetic */ Watchable watchable() {
        U uF = ((L) this.a).f();
        if (uF == null) {
            return null;
        }
        return uF instanceof S ? ((S) uF).a : uF instanceof Path ? r.i((Path) uF) : new T(uF);
    }
}
