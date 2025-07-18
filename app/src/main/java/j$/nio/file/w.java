package j$.nio.file;

import java.nio.file.PathMatcher;

/* loaded from: classes3.dex */
public final /* synthetic */ class w implements y {
    public final /* synthetic */ PathMatcher a;

    public /* synthetic */ w(PathMatcher pathMatcher) {
        this.a = pathMatcher;
    }

    @Override // j$.nio.file.y
    public final /* synthetic */ boolean a(Path path) {
        return this.a.matches(r.i(path));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        PathMatcher pathMatcher = this.a;
        if (obj instanceof w) {
            obj = ((w) obj).a;
        }
        return pathMatcher.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
