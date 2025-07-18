package j$.nio.file;

import java.nio.file.WatchKey;
import java.nio.file.Watchable;
import java.util.List;

/* loaded from: classes4.dex */
public final /* synthetic */ class L implements WatchKey {
    public final /* synthetic */ M a;

    public /* synthetic */ L(M m) {
        this.a = m;
    }

    public static /* synthetic */ WatchKey a(M m) {
        if (m == null) {
            return null;
        }
        return m instanceof K ? ((K) m).a : new L(m);
    }

    @Override // java.nio.file.WatchKey
    public final /* synthetic */ void cancel() {
        ((K) this.a).a();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        M m = this.a;
        if (obj instanceof L) {
            obj = ((L) obj).a;
        }
        return m.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.nio.file.WatchKey
    public final /* synthetic */ boolean isValid() {
        return ((K) this.a).c();
    }

    @Override // java.nio.file.WatchKey
    public final /* synthetic */ List pollEvents() {
        return AbstractC0040a.n(((K) this.a).d());
    }

    @Override // java.nio.file.WatchKey
    public final /* synthetic */ boolean reset() {
        return ((K) this.a).e();
    }

    @Override // java.nio.file.WatchKey
    public final /* synthetic */ Watchable watchable() {
        T tF = ((K) this.a).f();
        if (tF == null) {
            return null;
        }
        return tF instanceof Q ? ((Q) tF).a : tF instanceof Path ? C0079q.i((Path) tF) : new S(tF);
    }
}
