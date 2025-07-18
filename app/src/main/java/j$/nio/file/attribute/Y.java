package j$.nio.file.attribute;

import java.nio.file.attribute.UserPrincipalLookupService;

/* loaded from: classes3.dex */
public final /* synthetic */ class Y extends j$.desugar.sun.nio.fs.g {
    public final /* synthetic */ UserPrincipalLookupService a;

    public Y(UserPrincipalLookupService userPrincipalLookupService) {
        this.a = userPrincipalLookupService;
    }

    public final /* synthetic */ boolean equals(Object obj) {
        UserPrincipalLookupService userPrincipalLookupService = this.a;
        if (obj instanceof Y) {
            obj = ((Y) obj).a;
        }
        return userPrincipalLookupService.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // j$.desugar.sun.nio.fs.g
    public final /* synthetic */ J x(String str) {
        return H.a(this.a.lookupPrincipalByGroupName(str));
    }

    @Override // j$.desugar.sun.nio.fs.g
    public final /* synthetic */ X y(String str) {
        return V.a(this.a.lookupPrincipalByName(str));
    }
}
