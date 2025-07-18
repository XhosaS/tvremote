package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class los implements yjv {
    public final /* synthetic */ long a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ int d;
    private final /* synthetic */ int e;

    public /* synthetic */ los(long j, String str, String str2, int i, int i2) {
        this.e = i2;
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = i;
    }

    @Override // defpackage.yjv
    public final Object a(Object obj) {
        ghi ghiVarA;
        if (this.e == 0) {
            gic gicVar = (gic) obj;
            ghiVarA = gicVar.a("UPDATE watchlist SET in_cloud = ?, asset_order = ? WHERE account_name = ? AND asset_id = ? AND asset_type = ? AND asset_state != ?");
            int i = this.d;
            String str = this.c;
            String str2 = this.b;
            long j = this.a;
            try {
                ghiVarA.g(1, 1L);
                ghiVarA.g(2, j);
                ghiVarA.i(3, str2);
                ghiVarA.i(4, str);
                ghiVarA.g(5, i);
                ghiVarA.g(6, 2L);
                ghiVarA.l();
                return Integer.valueOf(gez.K(gicVar));
            } finally {
            }
        }
        long j2 = ikt.a;
        ghiVarA = ((gic) obj).a("SELECT DISTINCT * FROM search_history WHERE account_name = ? AND last_write_mills > ? AND query LIKE '%' || ? || '%' ORDER BY last_write_mills DESC LIMIT ?");
        int i2 = this.d;
        String str3 = this.c;
        long j3 = this.a;
        try {
            ghiVarA.i(1, this.b);
            ghiVarA.g(2, j3);
            ghiVarA.i(3, str3);
            ghiVarA.g(4, i2);
            int iJ = gez.J(ghiVarA, "account_name");
            int iJ2 = gez.J(ghiVarA, "query");
            int iJ3 = gez.J(ghiVarA, "last_write_mills");
            ArrayList arrayList = new ArrayList();
            while (ghiVarA.l()) {
                arrayList.add(new imh(ghiVarA.d(iJ), ghiVarA.d(iJ2), ghiVarA.b(iJ3)));
            }
            return arrayList;
        } finally {
        }
    }

    public /* synthetic */ los(String str, long j, String str2, int i, int i2) {
        this.e = i2;
        this.b = str;
        this.a = j;
        this.c = str2;
        this.d = i;
    }
}
