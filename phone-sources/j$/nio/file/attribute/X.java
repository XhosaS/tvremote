package j$.nio.file.attribute;

import java.nio.file.attribute.GroupPrincipal;
import java.nio.file.attribute.UserPrincipal;
import java.nio.file.attribute.UserPrincipalLookupService;

/* loaded from: classes4.dex */
public final /* synthetic */ class X extends UserPrincipalLookupService {
    public static final /* synthetic */ int b = 0;
    public final /* synthetic */ j$.desugar.sun.nio.fs.g a;

    public /* synthetic */ X(j$.desugar.sun.nio.fs.g gVar) {
        this.a = gVar;
    }

    public final /* synthetic */ boolean equals(Object obj) {
        j$.desugar.sun.nio.fs.g gVar = this.a;
        if (obj instanceof X) {
            obj = ((X) obj).a;
        }
        return gVar.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.nio.file.attribute.UserPrincipalLookupService
    public final /* synthetic */ GroupPrincipal lookupPrincipalByGroupName(String str) {
        return G.a(this.a.x(str));
    }

    @Override // java.nio.file.attribute.UserPrincipalLookupService
    public final /* synthetic */ UserPrincipal lookupPrincipalByName(String str) {
        return U.a(this.a.y(str));
    }
}
