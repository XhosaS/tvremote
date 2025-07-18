package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cjy extends bku {
    @Override // defpackage.bku
    public final String a() {
        return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
    }

    @Override // defpackage.bku
    public final /* bridge */ /* synthetic */ void b(brj brjVar, Object obj) {
        cju cjuVar = (cju) obj;
        brjVar.i(1, cjuVar.a);
        brjVar.g(2, cjuVar.b.longValue());
    }
}
