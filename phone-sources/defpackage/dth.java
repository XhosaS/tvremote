package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class dth implements yjv {
    public final /* synthetic */ long a;
    private final /* synthetic */ int b;

    public /* synthetic */ dth(long j, int i) {
        this.b = i;
        this.a = j;
    }

    @Override // defpackage.yjv
    public final Object a(Object obj) {
        ghi ghiVarA;
        psh pshVar;
        int i = this.b;
        if (i == 0) {
            Long l = (Long) obj;
            if (l == null) {
                throw new IllegalStateException("Start the timer with startTimer before calling addTime");
            }
            long j = this.a;
            if (ynm.x(j)) {
                return Long.valueOf(l.longValue() + ynm.k(j));
            }
            throw new IllegalArgumentException("Cannot call addTime with a negative duration");
        }
        if (i == 1) {
            blr blrVar = (blr) obj;
            float fIntBitsToFloat = Float.intBitsToFloat((int) (blrVar.m() >> 32)) / 2.0f;
            return blrVar.p(new aer(fIntBitsToFloat, hw.z(blrVar, fIntBitsToFloat), new bnl(this.a, 5), 0));
        }
        if (i == 2) {
            ghiVarA = ((gic) obj).a("DELETE FROM persistent_cache WHERE expiration_time_millis < ?");
            try {
                ghiVarA.g(1, this.a);
                ghiVarA.l();
                return ygi.a;
            } finally {
            }
        }
        if (i == 3) {
            ghiVarA = ((gic) obj).a("DELETE FROM persistent_cache WHERE cache_id = ?");
            try {
                ghiVarA.g(1, this.a);
                ghiVarA.l();
                return ygi.a;
            } finally {
            }
        }
        if (i != 4) {
            ghiVarA = ((gic) obj).a("DELETE FROM chime_thread_states WHERE modified_timestamp < ?");
            try {
                ghiVarA.g(1, this.a);
                ghiVarA.l();
                return ygi.a;
            } finally {
            }
        }
        ghiVarA = ((gic) obj).a("SELECT * FROM channels WHERE _id= ?");
        try {
            ghiVarA.g(1, this.a);
            int iJ = gez.J(ghiVarA, "_id");
            int iJ2 = gez.J(ghiVarA, "package_name");
            int iJ3 = gez.J(ghiVarA, "display_name");
            int iJ4 = gez.J(ghiVarA, "description");
            int iJ5 = gez.J(ghiVarA, "app_link_icon_uri");
            int iJ6 = gez.J(ghiVarA, "app_link_text");
            int iJ7 = gez.J(ghiVarA, "app_link_intent_uri");
            int iJ8 = gez.J(ghiVarA, "internal_provider_id");
            int iJ9 = gez.J(ghiVarA, "internal_provider_data");
            int iJ10 = gez.J(ghiVarA, "internal_provider_flag1");
            int iJ11 = gez.J(ghiVarA, "internal_provider_flag2");
            int iJ12 = gez.J(ghiVarA, "internal_provider_flag3");
            int iJ13 = gez.J(ghiVarA, "internal_provider_flag4");
            if (ghiVarA.l()) {
                pshVar = new psh();
                pshVar.b = ghiVarA.b(iJ);
                if (ghiVarA.k(iJ2)) {
                    pshVar.c = null;
                } else {
                    pshVar.c = ghiVarA.d(iJ2);
                }
                if (ghiVarA.k(iJ3)) {
                    pshVar.d = null;
                } else {
                    pshVar.d = ghiVarA.d(iJ3);
                }
                if (ghiVarA.k(iJ4)) {
                    pshVar.e = null;
                } else {
                    pshVar.e = ghiVarA.d(iJ4);
                }
                if (ghiVarA.k(iJ5)) {
                    pshVar.f = null;
                } else {
                    pshVar.f = ghiVarA.d(iJ5);
                }
                if (ghiVarA.k(iJ6)) {
                    pshVar.g = null;
                } else {
                    pshVar.g = ghiVarA.d(iJ6);
                }
                if (ghiVarA.k(iJ7)) {
                    pshVar.h = null;
                } else {
                    pshVar.h = ghiVarA.d(iJ7);
                }
                if (ghiVarA.k(iJ8)) {
                    pshVar.i = null;
                } else {
                    pshVar.i = ghiVarA.d(iJ8);
                }
                if (ghiVarA.k(iJ9)) {
                    pshVar.j = null;
                } else {
                    pshVar.j = ghiVarA.m(iJ9);
                }
                pshVar.k = ghiVarA.b(iJ10);
                pshVar.l = ghiVarA.b(iJ11);
                pshVar.m = ghiVarA.b(iJ12);
                pshVar.n = ghiVarA.b(iJ13);
            } else {
                pshVar = null;
            }
            return pshVar;
        } finally {
        }
    }
}
