package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ikd extends gei {
    @Override // defpackage.gei
    public final String a() {
        return "INSERT OR REPLACE INTO `media_library_item` (`play_id`,`media_library_item_id`,`account_name`,`type`,`title`,`order`,`parent_id`,`root_id`,`component_bytes`,`family_shared`,`bundle_title`,`media_library_item_info`,`sort_column_1`,`sort_column_2`,`sort_column_3`,`sort_column_4`,`sort_column_5`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
    }

    @Override // defpackage.gei
    public final /* bridge */ /* synthetic */ void b(ghi ghiVar, Object obj) {
        imb imbVar = (imb) obj;
        String strT = ipc.t(imbVar.a);
        if (strT == null) {
            ghiVar.h(1);
        } else {
            ghiVar.i(1, strT);
        }
        ghiVar.e(2, imbVar.b.h());
        ghiVar.i(3, imbVar.c);
        ghiVar.g(4, imbVar.d);
        String str = imbVar.e;
        if (str == null) {
            ghiVar.h(5);
        } else {
            ghiVar.i(5, str);
        }
        if (imbVar.f == null) {
            ghiVar.h(6);
        } else {
            ghiVar.g(6, r0.intValue());
        }
        String strT2 = ipc.t(imbVar.g);
        if (strT2 == null) {
            ghiVar.h(7);
        } else {
            ghiVar.i(7, strT2);
        }
        String strT3 = ipc.t(imbVar.h);
        if (strT3 == null) {
            ghiVar.h(8);
        } else {
            ghiVar.i(8, strT3);
        }
        byte[] bArrG = ihz.g(imbVar.i);
        if (bArrG == null) {
            ghiVar.h(9);
        } else {
            ghiVar.e(9, bArrG);
        }
        ghiVar.g(10, imbVar.j ? 1L : 0L);
        String str2 = imbVar.k;
        if (str2 == null) {
            ghiVar.h(11);
        } else {
            ghiVar.i(11, str2);
        }
        ghiVar.e(12, imbVar.l.h());
        String str3 = imbVar.m;
        if (str3 == null) {
            ghiVar.h(13);
        } else {
            ghiVar.i(13, str3);
        }
        String str4 = imbVar.n;
        if (str4 == null) {
            ghiVar.h(14);
        } else {
            ghiVar.i(14, str4);
        }
        String str5 = imbVar.o;
        if (str5 == null) {
            ghiVar.h(15);
        } else {
            ghiVar.i(15, str5);
        }
        String str6 = imbVar.p;
        if (str6 == null) {
            ghiVar.h(16);
        } else {
            ghiVar.i(16, str6);
        }
        String str7 = imbVar.q;
        if (str7 == null) {
            ghiVar.h(17);
        } else {
            ghiVar.i(17, str7);
        }
    }
}
