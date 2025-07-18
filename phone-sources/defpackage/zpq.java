package defpackage;

import java.security.PrivilegedAction;
import java.security.Provider;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class zpq implements PrivilegedAction {
    final /* synthetic */ String a;
    final /* synthetic */ String b;
    final /* synthetic */ String c;
    final /* synthetic */ zpr d;

    public zpq(zpr zprVar, String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = zprVar;
    }

    @Override // java.security.PrivilegedAction
    public final /* bridge */ /* synthetic */ Object run() {
        zpr zprVar = this.d;
        Provider.Service service = super/*java.security.Provider*/.getService(this.a, this.b);
        if (service == null) {
            return null;
        }
        zprVar.l.put(this.c, service);
        super/*java.security.Provider*/.remove(service.getType() + "." + service.getAlgorithm());
        super/*java.security.Provider*/.putService(service);
        return service;
    }
}
