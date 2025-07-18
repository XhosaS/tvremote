package j$.nio.file.attribute;

import java.nio.file.attribute.UserPrincipalLookupService;

/* loaded from: classes4.dex */
public final /* synthetic */ class W extends j$.desugar.sun.nio.fs.g {
    public final /* synthetic */ UserPrincipalLookupService a;

    public W(UserPrincipalLookupService userPrincipalLookupService) {
        this.a = userPrincipalLookupService;
    }

    public final /* synthetic */ boolean equals(Object obj) {
        UserPrincipalLookupService userPrincipalLookupService = this.a;
        if (obj instanceof W) {
            obj = ((W) obj).a;
        }
        return userPrincipalLookupService.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // j$.desugar.sun.nio.fs.g
    public final /* synthetic */ H x(String str) {
        return F.a(this.a.lookupPrincipalByGroupName(str));
    }

    @Override // j$.desugar.sun.nio.fs.g
    public final /* synthetic */ V y(String str) {
        return T.a(this.a.lookupPrincipalByName(str));
    }
}
