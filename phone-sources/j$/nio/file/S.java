package j$.nio.file;

import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import java.nio.file.Watchable;

/* loaded from: classes4.dex */
public final /* synthetic */ class S implements Watchable {
    public final /* synthetic */ T a;

    public /* synthetic */ S(T t) {
        this.a = t;
    }

    public final /* synthetic */ boolean equals(Object obj) {
        T t = this.a;
        if (obj instanceof S) {
            obj = ((S) obj).a;
        }
        return t.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.nio.file.Watchable
    public final /* synthetic */ WatchKey register(WatchService watchService, WatchEvent.Kind[] kindArr) {
        return L.a(this.a.f(N.a(watchService), A.i(kindArr)));
    }

    @Override // java.nio.file.Watchable
    public final /* synthetic */ WatchKey register(WatchService watchService, WatchEvent.Kind[] kindArr, WatchEvent.Modifier[] modifierArr) {
        return L.a(this.a.c(N.a(watchService), A.i(kindArr), A.j(modifierArr)));
    }
}
