package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
abstract class rgi implements tsl {
    public abstract void a(rjn rjnVar, seu seuVar);

    @Override // defpackage.tsl
    public final /* synthetic */ Object apply(Object obj) {
        Object obj2;
        int i;
        int i2;
        rjn rjnVar = (rjn) obj;
        seu seuVar = new seu();
        seuVar.m(true);
        seuVar.l(false);
        seuVar.e = 1;
        seuVar.d = 1;
        seuVar.m(rjnVar.b);
        String str = rjnVar.c;
        if (str != null) {
            seuVar.f = str;
        }
        String str2 = rjnVar.a;
        if (str2 == null) {
            throw new NullPointerException("Null accountName");
        }
        seuVar.k = str2;
        String str3 = rjnVar.d;
        if (str3 != null) {
            seuVar.b = str3;
        }
        String str4 = rjnVar.e;
        if (str4 != null) {
            seuVar.a = str4;
        }
        seuVar.l(rjnVar.g);
        a(rjnVar, seuVar);
        String str5 = rjnVar.f;
        if (str5 != null) {
            seuVar.g = str5;
        }
        String str6 = rjnVar.h;
        if (str6 != null) {
            seuVar.c = str6;
        }
        b(rjnVar, seuVar);
        if (seuVar.j == 3 && (obj2 = seuVar.k) != null && (i = seuVar.e) != 0 && (i2 = seuVar.d) != 0) {
            return new rgj(seuVar.h, seuVar.f, (String) obj2, seuVar.b, seuVar.a, seuVar.i, i, seuVar.g, seuVar.c, i2);
        }
        StringBuilder sb = new StringBuilder();
        if ((1 & seuVar.j) == 0) {
            sb.append(" isMetadataAvailable");
        }
        if (seuVar.k == null) {
            sb.append(" accountName");
        }
        if ((seuVar.j & 2) == 0) {
            sb.append(" isG1User");
        }
        if (seuVar.e == 0) {
            sb.append(" isDasherUser");
        }
        if (seuVar.d == 0) {
            sb.append(" isUnicornUser");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public abstract void b(rjn rjnVar, seu seuVar);
}
