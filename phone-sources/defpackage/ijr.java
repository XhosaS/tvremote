package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class ijr implements yjv {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ ijr(Object obj, Object obj2, int i) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, yjv] */
    @Override // defpackage.yjv
    public final Object a(Object obj) throws Exception {
        wkx wkxVarF;
        wni wniVar;
        iia iiaVar;
        wmu wmuVar;
        iju ijuVar = null;
        Long lValueOf = null;
        ime imeVar = null;
        womVar = null;
        womVar = null;
        wom womVar = null;
        byte[] bArrM = null;
        wmu wmuVarV = null;
        Long lValueOf2 = null;
        switch (this.c) {
            case 0:
                return ((ijq) this.b).b.d((gic) obj, (Object[]) this.a);
            case 1:
                return ((ijn) this.b).b.d((gic) obj, (Object[]) this.a);
            case 2:
                ghi ghiVarA = ((gic) obj).a((String) this.a);
                try {
                    ((ghd) this.b).b.a(ghiVarA);
                    int iH = gez.H(ghiVarA, "component");
                    int iH2 = gez.H(ghiVarA, "play_id");
                    int iH3 = gez.H(ghiVarA, "short_rental_expiration_timestamp");
                    int iH4 = gez.H(ghiVarA, "media_library_item_info");
                    int iH5 = gez.H(ghiVarA, "media_library_item_metadata");
                    ArrayList arrayList = new ArrayList();
                    while (ghiVarA.l()) {
                        if (iH == -1) {
                            wkxVarF = null;
                        } else {
                            wkxVarF = ihz.f(ghiVarA.k(iH) ? null : ghiVarA.m(iH));
                        }
                        if (iH2 == -1) {
                            wniVar = null;
                        } else {
                            wni wniVarU = ipc.u(ghiVarA.k(iH2) ? null : ghiVarA.d(iH2));
                            if (wniVarU == null) {
                                throw new IllegalStateException("Expected NON-NULL 'com.google.wireless.android.tv.gtv.PlayId', but it was NULL.");
                            }
                            wniVar = wniVarU;
                        }
                        Long lValueOf3 = (iH3 == -1 || ghiVarA.k(iH3)) ? null : Long.valueOf(ghiVarA.b(iH3));
                        if (iH4 == -1) {
                            iiaVar = null;
                        } else {
                            iia iiaVarW = ipc.w(ghiVarA.k(iH4) ? null : ghiVarA.m(iH4));
                            if (iiaVarW == null) {
                                throw new IllegalStateException("Expected NON-NULL 'com.google.android.apps.googletv.app.data.proto.MediaLibraryItemInfo', but it was NULL.");
                            }
                            iiaVar = iiaVarW;
                        }
                        if (iH5 == -1) {
                            wmuVar = null;
                        } else {
                            wmu wmuVarV2 = ipc.v(ghiVarA.k(iH5) ? null : ghiVarA.m(iH5));
                            if (wmuVarV2 == null) {
                                throw new IllegalStateException("Expected NON-NULL 'com.google.wireless.android.tv.gtv.MediaLibraryItemMetadata', but it was NULL.");
                            }
                            wmuVar = wmuVarV2;
                        }
                        arrayList.add(new ijt(wkxVarF, wniVar, lValueOf3, iiaVar, wmuVar));
                    }
                    return arrayList;
                } finally {
                }
            case 3:
                ghi ghiVarA2 = ((gic) obj).a("\n      DELETE FROM media_library_item\n      WHERE account_name = ?\n        AND play_id = ?\n    ");
                Object obj2 = this.b;
                try {
                    ghiVarA2.i(1, (String) this.a);
                    String strT = ipc.t((wni) obj2);
                    if (strT == null) {
                        ghiVarA2.h(2);
                    } else {
                        ghiVarA2.i(2, strT);
                    }
                    ghiVarA2.l();
                    return ygi.a;
                } finally {
                }
            case 4:
                ghi ghiVarA3 = ((gic) obj).a("\n  SELECT T.title, T.play_id, Metadata.media_library_item_metadata,\n          (SELECT COUNT(*) FROM media_library_item WHERE parent_id = T.play_id) as episodeCount \n      FROM media_library_item T JOIN media_library_item_metadata Metadata\n      ON T.account_name = Metadata.account_name AND T.play_id = Metadata.play_id\n      WHERE T.parent_id = ? \n      AND T.account_name = ?\n      ORDER BY `order`\n    ");
                Object obj3 = this.a;
                try {
                    String strT2 = ipc.t((wni) this.b);
                    if (strT2 == null) {
                        ghiVarA3.h(1);
                    } else {
                        ghiVarA3.i(1, strT2);
                    }
                    ghiVarA3.i(2, (String) obj3);
                    ArrayList arrayList2 = new ArrayList();
                    while (ghiVarA3.l()) {
                        String strD = ghiVarA3.d(0);
                        wni wniVarU2 = ipc.u(ghiVarA3.k(1) ? null : ghiVarA3.d(1));
                        if (wniVarU2 == null) {
                            throw new IllegalStateException("Expected NON-NULL 'com.google.wireless.android.tv.gtv.PlayId', but it was NULL.");
                        }
                        wmu wmuVarV3 = ipc.v(ghiVarA3.k(2) ? null : ghiVarA3.m(2));
                        if (wmuVarV3 == null) {
                            throw new IllegalStateException("Expected NON-NULL 'com.google.wireless.android.tv.gtv.MediaLibraryItemMetadata', but it was NULL.");
                        }
                        arrayList2.add(new ijv(strD, wniVarU2, wmuVarV3, (int) ghiVarA3.b(3)));
                    }
                    return arrayList2;
                } finally {
                }
            case 5:
                ghi ghiVarA4 = ((gic) obj).a("\n      SELECT Item.media_library_item_info, Item.play_id, Rental.short_rental_expiration_timestamp FROM `media_library_item` Item LEFT JOIN `media_library_item_rental` Rental ON Item.account_name = Rental.account_name AND Item.play_id = Rental.play_id  WHERE Item.account_name = ? AND Item.play_id = ?\n    ");
                Object obj4 = this.b;
                try {
                    ghiVarA4.i(1, (String) this.a);
                    String strT3 = ipc.t((wni) obj4);
                    if (strT3 == null) {
                        ghiVarA4.h(2);
                    } else {
                        ghiVarA4.i(2, strT3);
                    }
                    if (ghiVarA4.l()) {
                        iia iiaVarW2 = ipc.w(ghiVarA4.k(0) ? null : ghiVarA4.m(0));
                        if (iiaVarW2 == null) {
                            throw new IllegalStateException("Expected NON-NULL 'com.google.android.apps.googletv.app.data.proto.MediaLibraryItemInfo', but it was NULL.");
                        }
                        wni wniVarU3 = ipc.u(ghiVarA4.k(1) ? null : ghiVarA4.d(1));
                        if (wniVarU3 == null) {
                            throw new IllegalStateException("Expected NON-NULL 'com.google.wireless.android.tv.gtv.PlayId', but it was NULL.");
                        }
                        if (!ghiVarA4.k(2)) {
                            lValueOf2 = Long.valueOf(ghiVarA4.b(2));
                        }
                        ijuVar = new iju(iiaVarW2, wniVarU3, lValueOf2);
                    }
                    return ijuVar;
                } finally {
                }
            case 6:
                ghi ghiVarA5 = ((gic) obj).a("\n      DELETE FROM media_library_item_tag \n      WHERE account_name = ?\n      AND play_id = ?\n    ");
                Object obj5 = this.b;
                try {
                    ghiVarA5.i(1, (String) this.a);
                    String strT4 = ipc.t((wni) obj5);
                    if (strT4 == null) {
                        ghiVarA5.h(2);
                    } else {
                        ghiVarA5.i(2, strT4);
                    }
                    ghiVarA5.l();
                    return ygi.a;
                } finally {
                }
            case 7:
                return ((ike) this.b).b.d((gic) obj, (Object[]) this.a);
            case 8:
                ghi ghiVarA6 = ((gic) obj).a("\n     SELECT Metadata.component FROM media_library_item_metadata Metadata JOIN media_library_item Item ON Item.account_name = Metadata.account_name AND Item.play_id = Metadata.play_id WHERE Item.parent_id = ? AND Item.account_name = ? ORDER BY Item.`order` ASC\n   ");
                Object obj6 = this.a;
                try {
                    String strT5 = ipc.t((wni) this.b);
                    if (strT5 == null) {
                        ghiVarA6.h(1);
                    } else {
                        ghiVarA6.i(1, strT5);
                    }
                    ghiVarA6.i(2, (String) obj6);
                    ArrayList arrayList3 = new ArrayList();
                    while (ghiVarA6.l()) {
                        wkx wkxVarF2 = ihz.f(ghiVarA6.k(0) ? null : ghiVarA6.m(0));
                        if (wkxVarF2 == null) {
                            throw new IllegalStateException("Expected NON-NULL 'com.google.wireless.android.tv.gtv.Component', but it was NULL.");
                        }
                        arrayList3.add(wkxVarF2);
                    }
                    return arrayList3;
                } finally {
                }
            case 9:
                ghi ghiVarA7 = ((gic) obj).a("SELECT media_library_item_metadata FROM `media_library_item_metadata` WHERE `account_name` = ? and play_id = ?");
                Object obj7 = this.b;
                try {
                    ghiVarA7.i(1, (String) this.a);
                    String strT6 = ipc.t((wni) obj7);
                    if (strT6 == null) {
                        ghiVarA7.h(2);
                    } else {
                        ghiVarA7.i(2, strT6);
                    }
                    if (ghiVarA7.l()) {
                        if (!ghiVarA7.k(0)) {
                            bArrM = ghiVarA7.m(0);
                        }
                        wmuVarV = ipc.v(bArrM);
                    }
                    return wmuVarV;
                } finally {
                }
            case 10:
                return ((ikf) this.b).b.d((gic) obj, (Object[]) this.a);
            case 11:
                ghi ghiVarA8 = ((gic) obj).a("\n      SELECT entity_stream FROM `media_library_item_page_data` WHERE `account_name` = ? AND  `play_id` = ?\n    ");
                Object obj8 = this.b;
                try {
                    ghiVarA8.i(1, (String) this.a);
                    String strT7 = ipc.t((wni) obj8);
                    if (strT7 == null) {
                        ghiVarA8.h(2);
                    } else {
                        ghiVarA8.i(2, strT7);
                    }
                    if (ghiVarA8.l()) {
                        byte[] bArrM2 = ghiVarA8.k(0) ? null : ghiVarA8.m(0);
                        if (bArrM2 != null) {
                            try {
                                vuc vucVarP = vuc.p(wom.a, bArrM2, 0, bArrM2.length, vtp.a());
                                vuc.B(vucVarP);
                                womVar = (wom) vucVarP;
                            } catch (Exception e) {
                                krd.d("Failed to parse byteArray into the Stream proto", e);
                            }
                        }
                    }
                    return womVar;
                } finally {
                }
            case 12:
                return ((ikh) this.b).b.d((gic) obj, (Object[]) this.a);
            case 13:
                ghi ghiVarA9 = ((gic) obj).a("SELECT * FROM media_library_item_rental WHERE play_id = ? AND account_name = ?");
                Object obj9 = this.a;
                try {
                    String strT8 = ipc.t((wni) this.b);
                    if (strT8 == null) {
                        ghiVarA9.h(1);
                    } else {
                        ghiVarA9.i(1, strT8);
                    }
                    ghiVarA9.i(2, (String) obj9);
                    int iJ = gez.J(ghiVarA9, "play_id");
                    int iJ2 = gez.J(ghiVarA9, "account_name");
                    int iJ3 = gez.J(ghiVarA9, "short_rental_expiration_timestamp");
                    if (ghiVarA9.l()) {
                        wni wniVarU4 = ipc.u(ghiVarA9.k(iJ) ? null : ghiVarA9.d(iJ));
                        if (wniVarU4 == null) {
                            throw new IllegalStateException("Expected NON-NULL 'com.google.wireless.android.tv.gtv.PlayId', but it was NULL.");
                        }
                        String strD2 = ghiVarA9.d(iJ2);
                        if (!ghiVarA9.k(iJ3)) {
                            lValueOf = Long.valueOf(ghiVarA9.b(iJ3));
                        }
                        imeVar = new ime(wniVarU4, strD2, lValueOf);
                    }
                    return imeVar;
                } finally {
                }
            case 14:
                return ((ikj) this.b).b.d((gic) obj, (Object[]) this.a);
            case 15:
                return ikm.e((ikm) this.b, (String) this.a, (yih) obj);
            case 16:
                return ((ikp) this.b).b.d((gic) obj, (Object[]) this.a);
            case 17:
                ((ikp) this.b).c.e((gic) obj, (Object[]) this.a);
                return ygi.a;
            case 18:
                return ((ikq) this.b).b.d((gic) obj, (Object[]) this.a);
            case 19:
                return ((ikt) this.b).c.d((gic) obj, (Object[]) this.a);
            default:
                long j = ikt.a;
                ghi ghiVarA10 = ((gic) obj).a("DELETE FROM search_history WHERE account_name = ? AND query = ?");
                Object obj10 = this.a;
                try {
                    ghiVarA10.i(1, (String) this.b);
                    ghiVarA10.i(2, (String) obj10);
                    ghiVarA10.l();
                    return ygi.a;
                } finally {
                }
        }
    }

    public /* synthetic */ ijr(String str, Object obj, int i) {
        this.c = i;
        this.a = str;
        this.b = obj;
    }
}
