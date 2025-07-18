package j$.nio.file;

import java.nio.file.WatchKey;
import java.nio.file.Watchable;
import java.util.List;

/* loaded from: classes4.dex */
public final /* synthetic */ class K implements M {
    public final /* synthetic */ WatchKey a;

    public /* synthetic */ K(WatchKey watchKey) {
        this.a = watchKey;
    }

    public static /* synthetic */ M b(WatchKey watchKey) {
        if (watchKey == null) {
            return null;
        }
        return watchKey instanceof L ? ((L) watchKey).a : new K(watchKey);
    }

    public final /* synthetic */ void a() {
        this.a.cancel();
    }

    public final /* synthetic */ boolean c() {
        return this.a.isValid();
    }

    public final /* synthetic */ List d() {
        return AbstractC0040a.n(this.a.pollEvents());
    }

    public final /* synthetic */ boolean e() {
        return this.a.reset();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        WatchKey watchKey = this.a;
        if (obj instanceof K) {
            obj = ((K) obj).a;
        }
        return watchKey.equals(obj);
    }

    public final /* synthetic */ T f() {
        Watchable watchable = this.a.watchable();
        if (watchable == null) {
            return null;
        }
        return watchable instanceof S ? ((S) watchable).a : watchable instanceof java.nio.file.Path ? C0078p.i((java.nio.file.Path) watchable) : new Q(watchable);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
