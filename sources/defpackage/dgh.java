package defpackage;

import java.security.PrivilegedAction;
import java.security.Provider;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dgh implements PrivilegedAction {
    final /* synthetic */ String a;
    final /* synthetic */ String b;
    final /* synthetic */ String c;
    final /* synthetic */ dgi d;

    public dgh(dgi dgiVar, String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = dgiVar;
    }

    @Override // java.security.PrivilegedAction
    public final /* bridge */ /* synthetic */ Object run() {
        dgi dgiVar = this.d;
        Provider.Service service = super/*java.security.Provider*/.getService(this.a, this.b);
        if (service == null) {
            return null;
        }
        dgiVar.k.put(this.c, service);
        super/*java.security.Provider*/.remove(service.getType() + "." + service.getAlgorithm());
        super/*java.security.Provider*/.putService(service);
        return service;
    }
}
