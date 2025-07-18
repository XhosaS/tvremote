package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class aps implements yjv {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ aps(int i, Object obj, int i2) {
        this.c = i2;
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.CharSequence, java.lang.Object] */
    @Override // defpackage.yjv
    public final Object a(Object obj) {
        ghi ghiVarA;
        int i;
        switch (this.c) {
            case 0:
                bwi bwiVar = (bwi) obj;
                ?? r2 = this.b;
                int size = r2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    int i3 = this.a;
                    bwj bwjVar = (bwj) r2.get(i2);
                    bwi.y(bwiVar, bwjVar, 0, (i3 - bwjVar.b) / 2);
                }
                return ygi.a;
            case 1:
                ahw ahwVar = (ahw) obj;
                chb chbVar = ahwVar.c;
                ?? r3 = this.b;
                if (chbVar != null) {
                    long j = chbVar.b;
                    hu.B(ahwVar, chb.e(j), chb.a(j), r3);
                } else {
                    hu.B(ahwVar, chb.e(ahwVar.b), chb.a(ahwVar.b), r3);
                }
                int i4 = this.a;
                int iL = ykn.l(i4 > 0 ? (r4 + i4) - 1 : (chb.e(ahwVar.b) + i4) - ((String) r3).length(), 0, ahwVar.a());
                ahwVar.g(ccf.N(iL, iL));
                return ygi.a;
            case 2:
                int i5 = this.a;
                Object obj2 = this.b;
                bkp bkpVar = axr.a;
                ((bwi) obj).r((bwj) obj2, 0, -i5, 0.0f);
                return ygi.a;
            case 3:
                int i6 = this.a;
                Object obj3 = this.b;
                bkp bkpVar2 = axr.a;
                ((bwi) obj).r((bwj) obj3, -i6, 0, 0.0f);
                return ygi.a;
            case 4:
                return Boolean.valueOf(((List) obj).addAll(this.a, this.b));
            case 5:
                ghiVarA = ((gic) obj).a("SELECT asset_id, asset_type FROM watchlist WHERE account_name = ? AND asset_state = ?");
                int i7 = this.a;
                try {
                    ghiVarA.i(1, (String) this.b);
                    ghiVarA.g(2, i7);
                    ArrayList arrayList = new ArrayList();
                    while (ghiVarA.l()) {
                        arrayList.add(new loq(ghiVarA.k(0) ? null : ghiVarA.d(0), ghiVarA.k(1) ? null : Integer.valueOf((int) ghiVarA.b(1))));
                    }
                    return arrayList;
                } finally {
                }
            case 6:
                wcx wcxVar = (wcx) obj;
                wcxVar.getClass();
                vun vunVar = wcxVar.b;
                vunVar.getClass();
                Iterator<E> it = vunVar.iterator();
                int i8 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i = -1;
                    } else if (((wcw) it.next()).c == this.a) {
                        i = i8;
                    } else {
                        i8++;
                    }
                }
                if (i == -1) {
                    return wcxVar;
                }
                ((ylf) this.b).a = (wcw) wcxVar.b.get(i);
                vtw vtwVar = (vtw) wcxVar.a(5, null);
                vtwVar.x(wcxVar);
                if (!vtwVar.b.A()) {
                    vtwVar.u();
                }
                wcx wcxVar2 = (wcx) vtwVar.b;
                wcxVar2.c();
                wcxVar2.b.remove(i);
                return (wcx) vtwVar.r();
            case 7:
                ((Integer) obj).getClass();
                int i9 = this.a;
                return new opz((Context) this.b, i9 == -1 ? null : Integer.valueOf(i9));
            case 8:
                ghiVarA = ((gic) obj).a("SELECT * FROM gnp_accounts WHERE account_type = ? AND account_specific_id = ?");
                Object obj4 = this.b;
                try {
                    ghiVarA.g(1, this.a);
                    ghiVarA.i(2, (String) obj4);
                    int iJ = gez.J(ghiVarA, "id");
                    int iJ2 = gez.J(ghiVarA, "account_specific_id");
                    int iJ3 = gez.J(ghiVarA, "account_type");
                    int iJ4 = gez.J(ghiVarA, "obfuscated_gaia_id");
                    int iJ5 = gez.J(ghiVarA, "actual_account_name");
                    int iJ6 = gez.J(ghiVarA, "actual_account_oid");
                    int iJ7 = gez.J(ghiVarA, "registration_status");
                    int iJ8 = gez.J(ghiVarA, "registration_id");
                    int iJ9 = gez.J(ghiVarA, "sync_sources");
                    int iJ10 = gez.J(ghiVarA, "representative_target_id");
                    int iJ11 = gez.J(ghiVarA, "sync_version");
                    int iJ12 = gez.J(ghiVarA, "last_registration_time_ms");
                    int iJ13 = gez.J(ghiVarA, "last_registration_request_hash");
                    int iJ14 = gez.J(ghiVarA, "first_registration_version");
                    int iJ15 = gez.J(ghiVarA, "internal_target_id");
                    return ghiVarA.l() ? qen.d(ghiVarA.b(iJ), ghiVarA.k(iJ2) ? null : ghiVarA.d(iJ2), qtl.T((int) ghiVarA.b(iJ3)), ghiVarA.k(iJ4) ? null : ghiVarA.d(iJ4), ghiVarA.k(iJ5) ? null : ghiVarA.d(iJ5), ghiVarA.k(iJ6) ? null : ghiVarA.d(iJ6), (int) ghiVarA.b(iJ7), ghiVarA.k(iJ8) ? null : ghiVarA.d(iJ8), qtl.R(ghiVarA.k(iJ9) ? null : ghiVarA.d(iJ9)), ghiVarA.k(iJ10) ? null : ghiVarA.d(iJ10), ghiVarA.b(iJ11), ghiVarA.b(iJ12), (int) ghiVarA.b(iJ13), ghiVarA.b(iJ14), ghiVarA.k(iJ15) ? null : ghiVarA.d(iJ15), ghiVarA.b(gez.J(ghiVarA, "fitbit_decoded_id"))) : null;
                } finally {
                }
            case 9:
                gic gicVar = (gic) obj;
                ghiVarA = gicVar.a("DELETE FROM gnp_accounts WHERE account_type = ? AND account_specific_id = ?");
                Object obj5 = this.b;
                try {
                    ghiVarA.g(1, this.a);
                    ghiVarA.i(2, (String) obj5);
                    ghiVarA.l();
                    return Integer.valueOf(gez.K(gicVar));
                } finally {
                }
            default:
                ghiVarA = ((gic) obj).a("SELECT * FROM gnp_accounts WHERE account_type = ? AND account_specific_id = ?");
                Object obj6 = this.b;
                try {
                    ghiVarA.g(1, this.a);
                    ghiVarA.i(2, (String) obj6);
                    int iJ16 = gez.J(ghiVarA, "id");
                    int iJ17 = gez.J(ghiVarA, "account_specific_id");
                    int iJ18 = gez.J(ghiVarA, "account_type");
                    int iJ19 = gez.J(ghiVarA, "obfuscated_gaia_id");
                    int iJ20 = gez.J(ghiVarA, "actual_account_name");
                    int iJ21 = gez.J(ghiVarA, "actual_account_oid");
                    int iJ22 = gez.J(ghiVarA, "registration_status");
                    int iJ23 = gez.J(ghiVarA, "registration_id");
                    int iJ24 = gez.J(ghiVarA, "sync_sources");
                    int iJ25 = gez.J(ghiVarA, "representative_target_id");
                    int iJ26 = gez.J(ghiVarA, "sync_version");
                    int iJ27 = gez.J(ghiVarA, "last_registration_time_ms");
                    int iJ28 = gez.J(ghiVarA, "last_registration_request_hash");
                    int iJ29 = gez.J(ghiVarA, "first_registration_version");
                    int iJ30 = gez.J(ghiVarA, "internal_target_id");
                    return ghiVarA.l() ? qen.d(ghiVarA.b(iJ16), ghiVarA.k(iJ17) ? null : ghiVarA.d(iJ17), qtl.T((int) ghiVarA.b(iJ18)), ghiVarA.k(iJ19) ? null : ghiVarA.d(iJ19), ghiVarA.k(iJ20) ? null : ghiVarA.d(iJ20), ghiVarA.k(iJ21) ? null : ghiVarA.d(iJ21), (int) ghiVarA.b(iJ22), ghiVarA.k(iJ23) ? null : ghiVarA.d(iJ23), qtl.R(ghiVarA.k(iJ24) ? null : ghiVarA.d(iJ24)), ghiVarA.k(iJ25) ? null : ghiVarA.d(iJ25), ghiVarA.b(iJ26), ghiVarA.b(iJ27), (int) ghiVarA.b(iJ28), ghiVarA.b(iJ29), ghiVarA.k(iJ30) ? null : ghiVarA.d(iJ30), ghiVarA.b(gez.J(ghiVarA, "fitbit_decoded_id"))) : null;
                } finally {
                }
        }
    }

    public /* synthetic */ aps(Object obj, int i, int i2) {
        this.c = i2;
        this.b = obj;
        this.a = i;
    }
}
