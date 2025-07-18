package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class keh extends dwt {
    public final String a;
    public final yft b;
    public boolean c;
    public final yft d;
    public kuw e;

    public keh(dwi dwiVar) {
        dwiVar.getClass();
        String str = (String) dwiVar.b("search_query");
        this.a = str == null ? "" : str;
        this.b = new yga(new kal(this, 20));
        this.d = new yga(new keu(dwiVar, 1));
    }
}
