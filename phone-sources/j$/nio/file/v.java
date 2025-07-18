package j$.nio.file;

import java.nio.file.PathMatcher;

/* loaded from: classes4.dex */
public final /* synthetic */ class v implements x {
    public final /* synthetic */ PathMatcher a;

    public /* synthetic */ v(PathMatcher pathMatcher) {
        this.a = pathMatcher;
    }

    @Override // j$.nio.file.x
    public final /* synthetic */ boolean a(Path path) {
        return this.a.matches(C0079q.i(path));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        PathMatcher pathMatcher = this.a;
        if (obj instanceof v) {
            obj = ((v) obj).a;
        }
        return pathMatcher.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
