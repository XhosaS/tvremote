package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class gvc implements yjv {
    public final /* synthetic */ long a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ gvc(long j, ink inkVar, String str, int i) {
        this.d = i;
        this.a = j;
        this.c = inkVar;
        this.b = str;
    }

    @Override // defpackage.yjv
    public final Object a(Object obj) {
        ghi ghiVarA;
        int i = this.d;
        if (i == 0) {
            gic gicVar = (gic) obj;
            gicVar.getClass();
            ghiVarA = gicVar.a((String) this.c);
            String str = this.b;
            try {
                ghiVarA.g(1, this.a);
                ghiVarA.i(2, str);
                ghiVarA.l();
                ghiVarA.close();
                return ygi.a;
            } finally {
            }
        }
        if (i == 1) {
            gic gicVar2 = (gic) obj;
            gicVar2.getClass();
            ghiVarA = gicVar2.a((String) this.c);
            String str2 = this.b;
            try {
                ghiVarA.g(1, this.a);
                ghiVarA.i(2, str2);
                ghiVarA.l();
                int iK = gez.K(gicVar2);
                ghiVarA.close();
                return Integer.valueOf(iK);
            } finally {
            }
        }
        if (i != 2) {
            ghiVarA = ((gic) obj).a("UPDATE persistent_cache  SET access_time_millis = ? WHERE cache_key = ? AND account_name = ?");
            String str3 = this.b;
            Object obj2 = this.c;
            try {
                ghiVarA.g(1, this.a);
                ghiVarA.e(2, ihz.h((ink) obj2));
                ghiVarA.i(3, str3);
                ghiVarA.l();
                return ygi.a;
            } finally {
            }
        }
        ghiVarA = ((gic) obj).a("SELECT cache_value FROM persistent_cache WHERE cache_key = ? AND expiration_time_millis > ? AND account_name = ?");
        String str4 = this.b;
        long j = this.a;
        try {
            ghiVarA.e(1, ihz.h((ink) this.c));
            ghiVarA.g(2, j);
            ghiVarA.i(3, str4);
            inl inlVar = null;
            if (ghiVarA.l()) {
                byte[] bArrM = ghiVarA.k(0) ? null : ghiVarA.m(0);
                if (bArrM != null) {
                    try {
                        vuc vucVarP = vuc.p(inl.a, bArrM, 0, bArrM.length, vtp.a());
                        vuc.B(vucVarP);
                        inlVar = (inl) vucVarP;
                    } catch (Exception unused) {
                        krd.c("Failed to parse byteArray into CacheValue proto");
                    }
                }
            }
            return inlVar;
        } finally {
        }
    }

    public /* synthetic */ gvc(long j, String str, int i) {
        this.d = i;
        this.c = "UPDATE workspec SET last_enqueue_time=? WHERE id=?";
        this.a = j;
        this.b = str;
    }

    public /* synthetic */ gvc(long j, String str, int i, byte[] bArr) {
        this.d = i;
        this.c = "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
        this.a = j;
        this.b = str;
    }

    public /* synthetic */ gvc(ink inkVar, long j, String str, int i) {
        this.d = i;
        this.c = inkVar;
        this.a = j;
        this.b = str;
    }
}
