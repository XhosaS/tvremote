package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class psp extends gei {
    @Override // defpackage.gei
    public final String a() {
        return "INSERT OR ABORT INTO `channels` (`_id`,`package_name`,`display_name`,`description`,`app_link_icon_uri`,`app_link_text`,`app_link_intent_uri`,`internal_provider_id`,`internal_provider_data`,`internal_provider_flag1`,`internal_provider_flag2`,`internal_provider_flag3`,`internal_provider_flag4`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?)";
    }

    @Override // defpackage.gei
    public final /* bridge */ /* synthetic */ void b(ghi ghiVar, Object obj) {
        psh pshVar = (psh) obj;
        ghiVar.g(1, pshVar.b);
        String str = pshVar.c;
        if (str == null) {
            ghiVar.h(2);
        } else {
            ghiVar.i(2, str);
        }
        String str2 = pshVar.d;
        if (str2 == null) {
            ghiVar.h(3);
        } else {
            ghiVar.i(3, str2);
        }
        String str3 = pshVar.e;
        if (str3 == null) {
            ghiVar.h(4);
        } else {
            ghiVar.i(4, str3);
        }
        String str4 = pshVar.f;
        if (str4 == null) {
            ghiVar.h(5);
        } else {
            ghiVar.i(5, str4);
        }
        String str5 = pshVar.g;
        if (str5 == null) {
            ghiVar.h(6);
        } else {
            ghiVar.i(6, str5);
        }
        String str6 = pshVar.h;
        if (str6 == null) {
            ghiVar.h(7);
        } else {
            ghiVar.i(7, str6);
        }
        String str7 = pshVar.i;
        if (str7 == null) {
            ghiVar.h(8);
        } else {
            ghiVar.i(8, str7);
        }
        byte[] bArr = pshVar.j;
        if (bArr == null) {
            ghiVar.h(9);
        } else {
            ghiVar.e(9, bArr);
        }
        ghiVar.g(10, pshVar.k);
        ghiVar.g(11, pshVar.l);
        ghiVar.g(12, pshVar.m);
        ghiVar.g(13, pshVar.n);
    }
}
