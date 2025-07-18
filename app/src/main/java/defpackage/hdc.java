package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hdc extends agtu implements agvb {
    int a;
    final /* synthetic */ hdd b;
    final /* synthetic */ Uri c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hdc(hdd hddVar, Uri uri, agsw agswVar) {
        super(2, agswVar);
        this.b = hddVar;
        this.c = uri;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((hdc) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agtg agtgVar = agtg.a;
        int i = this.a;
        agpl.b(obj);
        if (i == 0) {
            hdd hddVar = this.b;
            String lastPathSegment = this.c.getLastPathSegment();
            if (lastPathSegment == null) {
                lastPathSegment = "";
            }
            this.a = 1;
            if (hddVar.a.a(lastPathSegment, this) == agtgVar) {
                return agtgVar;
            }
        }
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new hdc(this.b, this.c, agswVar);
    }
}
