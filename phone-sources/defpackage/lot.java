package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class lot implements yjv {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    public /* synthetic */ lot(int i, int i2, jz jzVar, eph ephVar, int i3) {
        this.e = i3;
        this.b = i;
        this.a = i2;
        this.c = jzVar;
        this.d = ephVar;
    }

    @Override // defpackage.yjv
    public final Object a(Object obj) {
        if (this.e == 0) {
            gic gicVar = (gic) obj;
            ghi ghiVarA = gicVar.a("UPDATE watchlist SET asset_state = ? WHERE account_name = ? AND asset_id = ? AND asset_type = ?");
            int i = this.a;
            Object obj2 = this.d;
            Object obj3 = this.c;
            try {
                ghiVarA.g(1, this.b);
                ghiVarA.i(2, (String) obj3);
                ghiVarA.i(3, (String) obj2);
                ghiVarA.g(4, i);
                ghiVarA.l();
                return Integer.valueOf(gez.K(gicVar));
            } finally {
                ghiVarA.close();
            }
        }
        gb gbVar = (gb) obj;
        yjv yjvVarA = ((acn) gbVar.c).a();
        int i2 = gbVar.a;
        int iMax = Math.max(this.b, i2);
        int iMin = Math.min(this.a, (gbVar.b + i2) - 1);
        if (iMax <= iMin) {
            while (true) {
                Object objA = yjvVarA != null ? yjvVarA.a(Integer.valueOf(iMax - i2)) : new acf(iMax);
                Object obj4 = this.d;
                ((jz) this.c).g(objA, iMax);
                eph ephVar = (eph) obj4;
                ((Object[]) ephVar.c)[iMax - ephVar.a] = objA;
                if (iMax == iMin) {
                    break;
                }
                iMax++;
            }
        }
        return ygi.a;
    }

    public /* synthetic */ lot(int i, String str, String str2, int i2, int i3) {
        this.e = i3;
        this.b = i;
        this.c = str;
        this.d = str2;
        this.a = i2;
    }
}
