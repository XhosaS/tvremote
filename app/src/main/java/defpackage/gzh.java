package defpackage;

import android.location.Address;
import java.io.IOException;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gzh extends agtu implements agvb {
    final /* synthetic */ gzj a;
    final /* synthetic */ double b;
    final /* synthetic */ double c;
    final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gzh(gzj gzjVar, double d, double d2, int i, agsw agswVar) {
        super(2, agswVar);
        this.a = gzjVar;
        this.b = d;
        this.c = d2;
        this.d = i;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((gzh) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) throws IOException {
        agpl.b(obj);
        List<Address> fromLocation = this.a.a.getFromLocation(this.b, this.c, this.d);
        return fromLocation == null ? agrd.a : fromLocation;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new gzh(this.a, this.b, this.c, this.d, agswVar);
    }
}
