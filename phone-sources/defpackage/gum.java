package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gum implements guk {
    public final gex a;
    public final gei b = new gul();

    public gum(gex gexVar) {
        this.a = gexVar;
    }

    @Override // defpackage.guk
    public final /* synthetic */ guj a(gun gunVar) {
        return (guj) gez.j(this.a, true, false, new aiy(gunVar.a, gunVar.b, 4, (byte[]) null));
    }

    @Override // defpackage.guk
    public final List b() {
        return (List) gez.j(this.a, true, false, new fyq(13));
    }

    @Override // defpackage.guk
    public final void c(guj gujVar) {
        gez.j(this.a, false, true, new bct(this, gujVar, 19));
    }

    @Override // defpackage.guk
    public final /* synthetic */ void d(gun gunVar) {
        gez.j(this.a, false, true, new aiy(gunVar.a, gunVar.b, 3));
    }

    @Override // defpackage.guk
    public final void e(String str) {
        str.getClass();
        gez.j(this.a, false, true, new bct(str, 20, (short[]) null));
    }
}
