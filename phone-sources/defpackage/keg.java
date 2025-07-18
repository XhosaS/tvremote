package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class keg extends dwt {
    public final String a;
    public String b;
    public final yft c;
    public kuw d;
    private final yft e;

    public keg(dwi dwiVar) {
        dwiVar.getClass();
        String str = (String) dwiVar.b("search_query");
        this.a = str == null ? "" : str;
        String str2 = (String) dwiVar.b("search_query");
        this.b = str2 != null ? str2 : "";
        this.e = new yga(new kal(this, 16));
        this.c = new yga(new kal(dwiVar, 17));
    }

    public final jth a() {
        Object objA = this.e.a();
        objA.getClass();
        return (jth) objA;
    }
}
