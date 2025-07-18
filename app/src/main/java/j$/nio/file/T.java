package j$.nio.file;

import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import java.nio.file.Watchable;

/* loaded from: classes3.dex */
public final /* synthetic */ class T implements Watchable {
    public final /* synthetic */ U a;

    public /* synthetic */ T(U u) {
        this.a = u;
    }

    public final /* synthetic */ boolean equals(Object obj) {
        U u = this.a;
        if (obj instanceof T) {
            obj = ((T) obj).a;
        }
        return u.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.nio.file.Watchable
    public final /* synthetic */ WatchKey register(WatchService watchService, WatchEvent.Kind[] kindArr) {
        return M.a(this.a.f(O.a(watchService), B.i(kindArr)));
    }

    @Override // java.nio.file.Watchable
    public final /* synthetic */ WatchKey register(WatchService watchService, WatchEvent.Kind[] kindArr, WatchEvent.Modifier[] modifierArr) {
        return M.a(this.a.c(O.a(watchService), B.i(kindArr), B.j(modifierArr)));
    }
}
