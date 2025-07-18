package j$.nio.file;

import java.nio.file.PathMatcher;

/* loaded from: classes3.dex */
public final /* synthetic */ class x implements PathMatcher {
    public final /* synthetic */ y a;

    public /* synthetic */ x(y yVar) {
        this.a = yVar;
    }

    public final /* synthetic */ boolean equals(Object obj) {
        y yVar = this.a;
        if (obj instanceof x) {
            obj = ((x) obj).a;
        }
        return yVar.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.nio.file.PathMatcher
    public final /* synthetic */ boolean matches(java.nio.file.Path path) {
        return this.a.a(C0043q.i(path));
    }
}
