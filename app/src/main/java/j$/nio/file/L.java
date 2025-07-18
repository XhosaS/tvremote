package j$.nio.file;

import java.nio.file.WatchKey;
import java.nio.file.Watchable;
import java.util.List;

/* loaded from: classes3.dex */
public final /* synthetic */ class L implements N {
    public final /* synthetic */ WatchKey a;

    public /* synthetic */ L(WatchKey watchKey) {
        this.a = watchKey;
    }

    public static /* synthetic */ N b(WatchKey watchKey) {
        if (watchKey == null) {
            return null;
        }
        return watchKey instanceof M ? ((M) watchKey).a : new L(watchKey);
    }

    public final /* synthetic */ void a() {
        this.a.cancel();
    }

    public final /* synthetic */ boolean c() {
        return this.a.isValid();
    }

    public final /* synthetic */ List d() {
        return AbstractC0002a.n(this.a.pollEvents());
    }

    public final /* synthetic */ boolean e() {
        return this.a.reset();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        WatchKey watchKey = this.a;
        if (obj instanceof L) {
            obj = ((L) obj).a;
        }
        return watchKey.equals(obj);
    }

    public final /* synthetic */ U f() {
        Watchable watchable = this.a.watchable();
        if (watchable == null) {
            return null;
        }
        return watchable instanceof T ? ((T) watchable).a : watchable instanceof java.nio.file.Path ? C0043q.i((java.nio.file.Path) watchable) : new S(watchable);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
