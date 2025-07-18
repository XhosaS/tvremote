package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aerj implements aeri {
    public static final rgi a;
    public static final rgi b;
    public static final rgi c;

    static {
        rgg rggVarB = new rgg("com.google.android.libraries.home.phenotype").a().b();
        rggVarB.e("45626832", 120000L);
        rggVarB.e("45626821", 1800000L);
        rggVarB.e("45626822", 1740000L);
        rggVarB.e("45626809", 30000L);
        rggVarB.e("45625805", 120000L);
        rggVarB.e("45625806", 900000L);
        rggVarB.e("45647146", 129892405L);
        new rgc(rggVarB, "45701481", "foo");
        rggVarB.f("45701480", false);
        rggVarB.f("45647145", false);
        rggVarB.f("45477347", false);
        rggVarB.f("45646593", false);
        a = rggVarB.e("45477346", 443L);
        b = rggVarB.e("45424189", 30000L);
        c = new rgc(rggVarB, "45477348", "googlehomefoyer-pa.googleapis.com");
        rggVarB.f("45477345", false);
        rggVarB.e("45477355", 8790L);
        new rgc(rggVarB, "45477344", ".*");
        new rgc(rggVarB, "45647168", "X-Client-Pctx-bin");
    }

    @Override // defpackage.aeri
    public final long a() {
        return ((Long) a.b()).longValue();
    }

    @Override // defpackage.aeri
    public final long b() {
        return ((Long) b.b()).longValue();
    }

    @Override // defpackage.aeri
    public final String c() {
        return (String) c.b();
    }
}
