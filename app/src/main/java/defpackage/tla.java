package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tla extends tkz {
    private final String a;
    private final nzy b;

    public tla(String str, nzy nzyVar) {
        this.a = str;
        this.b = nzyVar;
    }

    @Override // defpackage.tkz
    public final nzy a(tor torVar, tli tliVar) {
        return new toq(torVar, this.b, this.a);
    }
}
