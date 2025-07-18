package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class qnu extends gei {
    @Override // defpackage.gei
    public final String a() {
        return "INSERT OR ABORT INTO `gnp_accounts` (`id`,`account_specific_id`,`account_type`,`obfuscated_gaia_id`,`actual_account_name`,`actual_account_oid`,`registration_status`,`registration_id`,`sync_sources`,`representative_target_id`,`sync_version`,`last_registration_time_ms`,`last_registration_request_hash`,`first_registration_version`,`internal_target_id`,`fitbit_decoded_id`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
    }

    @Override // defpackage.gei
    public final /* synthetic */ void b(ghi ghiVar, Object obj) {
        qen qenVar = (qen) obj;
        ghiVar.g(1, qenVar.a);
        String str = qenVar.b;
        if (str == null) {
            ghiVar.h(2);
        } else {
            ghiVar.i(2, str);
        }
        int i = qenVar.p;
        if (i == 0) {
            throw null;
        }
        ghiVar.g(3, i);
        String str2 = qenVar.c;
        if (str2 == null) {
            ghiVar.h(4);
        } else {
            ghiVar.i(4, str2);
        }
        String str3 = qenVar.d;
        if (str3 == null) {
            ghiVar.h(5);
        } else {
            ghiVar.i(5, str3);
        }
        String str4 = qenVar.e;
        if (str4 == null) {
            ghiVar.h(6);
        } else {
            ghiVar.i(6, str4);
        }
        ghiVar.g(7, qenVar.f);
        String str5 = qenVar.g;
        if (str5 == null) {
            ghiVar.h(8);
        } else {
            ghiVar.i(8, str5);
        }
        ghiVar.i(9, qtl.S(qenVar.h));
        String str6 = qenVar.i;
        if (str6 == null) {
            ghiVar.h(10);
        } else {
            ghiVar.i(10, str6);
        }
        ghiVar.g(11, qenVar.j);
        ghiVar.g(12, qenVar.k);
        ghiVar.g(13, qenVar.l);
        ghiVar.g(14, qenVar.m);
        String str7 = qenVar.n;
        if (str7 == null) {
            ghiVar.h(15);
        } else {
            ghiVar.i(15, str7);
        }
        ghiVar.g(16, qenVar.o);
    }
}
