package j$.nio.file;

import java.nio.file.PathMatcher;

/* loaded from: classes4.dex */
public final /* synthetic */ class w implements PathMatcher {
    public final /* synthetic */ x a;

    public /* synthetic */ w(x xVar) {
        this.a = xVar;
    }

    public final /* synthetic */ boolean equals(Object obj) {
        x xVar = this.a;
        if (obj instanceof w) {
            obj = ((w) obj).a;
        }
        return xVar.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.nio.file.PathMatcher
    public final /* synthetic */ boolean matches(java.nio.file.Path path) {
        return this.a.a(C0078p.i(path));
    }
}
