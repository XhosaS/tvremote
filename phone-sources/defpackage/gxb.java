package defpackage;

import androidx.work.impl.WorkDatabase;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class gxb implements yjv {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ gxb(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, ysx] */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.lang.Object, yjv] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.Object, yjz] */
    @Override // defpackage.yjv
    public final Object a(Object obj) {
        ArrayList arrayList;
        gox goxVar;
        int i;
        gpw gpwVar;
        Iterator it;
        long jAN;
        boolean zValueOf;
        int i2 = 0;
        ima imaVar = null;
        byte[] bArrM = null;
        int i3 = 1;
        switch (this.b) {
            case 0:
                bwi bwiVar = (bwi) obj;
                bwiVar.getClass();
                bwiVar.r((bwj) this.a, 0, 0, 0.0f);
                return ygi.a;
            case 1:
                WorkDatabase workDatabase = (WorkDatabase) obj;
                workDatabase.getClass();
                String str = guw.a;
                List listL = workDatabase.D().l((String) this.a);
                if (listL != null) {
                    ArrayList arrayList2 = new ArrayList(yfm.z(listL, 10));
                    Iterator it2 = listL.iterator();
                    while (it2.hasNext()) {
                        guv guvVar = (guv) it2.next();
                        List list = guvVar.p;
                        gox goxVar2 = !list.isEmpty() ? (gox) list.get(i2) : gox.a;
                        UUID uuidFromString = UUID.fromString(guvVar.a);
                        uuidFromString.getClass();
                        gpx gpxVar = guvVar.b;
                        HashSet hashSet = new HashSet(guvVar.o);
                        gox goxVar3 = guvVar.c;
                        int i4 = guvVar.h;
                        int i5 = guvVar.l;
                        gou gouVar = guvVar.g;
                        int i6 = i3;
                        long j = guvVar.d;
                        long j2 = guvVar.e;
                        int i7 = j2 != 0 ? 0 : i6;
                        if (j2 != 0) {
                            goxVar = goxVar3;
                            i = i4;
                            gpwVar = new gpw(j2, guvVar.f);
                        } else {
                            goxVar = goxVar3;
                            i = i4;
                            gpwVar = null;
                        }
                        gpx gpxVar2 = gpx.a;
                        if (gpxVar == gpxVar2) {
                            it = it2;
                            jAN = fki.aN((gpxVar != gpxVar2 || i <= 0) ? 0 : i6, i, guvVar.q, guvVar.i, guvVar.j, guvVar.k, i7 ^ 1, j, guvVar.f, j2, guvVar.m);
                        } else {
                            it = it2;
                            jAN = Long.MAX_VALUE;
                        }
                        arrayList2.add(new gpy(uuidFromString, gpxVar, hashSet, goxVar, goxVar2, i, i5, gouVar, j, gpwVar, jAN, guvVar.n));
                        it2 = it;
                        i3 = i6;
                        i2 = 0;
                    }
                    arrayList = arrayList2;
                } else {
                    arrayList = null;
                }
                arrayList.getClass();
                return arrayList;
            case 2:
                bwi bwiVar2 = (bwi) obj;
                bwiVar2.getClass();
                bwi.y(bwiVar2, (bwj) this.a, 0, 0);
                return ygi.a;
            case 3:
                ((IOException) obj).getClass();
                ((gyb) this.a).c = true;
                return ygi.a;
            case 4:
                return new ysq(new uc((yjz) this.a, obj, (yih) null, 16));
            case 5:
                obj.getClass();
                return new ipi(new gxd(this.a.a(obj), 2), new kio((yih) null, 1, (byte[]) null), 14);
            case 6:
                ksn ksnVar = (ksn) obj;
                ksnVar.getClass();
                ((igp) this.a).a.b(ksnVar, new mig(i3));
                return ygi.a;
            case 7:
                ghi ghiVarA = ((gic) obj).a("SELECT * FROM library_config WHERE account_name = ? LIMIT 1");
                try {
                    ghiVarA.i(1, (String) this.a);
                    int iJ = gez.J(ghiVarA, "account_name");
                    int iJ2 = gez.J(ghiVarA, "media_library_config");
                    if (ghiVarA.l()) {
                        String strD = ghiVarA.d(iJ);
                        if (!ghiVarA.k(iJ2)) {
                            bArrM = ghiVarA.m(iJ2);
                        }
                        wmd wmdVarB = ihz.b(bArrM);
                        if (wmdVarB == null) {
                            throw new IllegalStateException("Expected NON-NULL 'com.google.wireless.android.tv.gtv.MediaLibraryConfig', but it was NULL.");
                        }
                        imaVar = new ima(strD, wmdVarB);
                    }
                    return imaVar;
                } finally {
                }
            case 8:
                ghi ghiVarA2 = ((gic) obj).a("SELECT * FROM library_config WHERE account_name = ? LIMIT 1");
                try {
                    ghiVarA2.i(1, (String) this.a);
                    int iJ3 = gez.J(ghiVarA2, "account_name");
                    int iJ4 = gez.J(ghiVarA2, "media_library_config");
                    ArrayList arrayList3 = new ArrayList();
                    while (ghiVarA2.l()) {
                        String strD2 = ghiVarA2.d(iJ3);
                        wmd wmdVarB2 = ihz.b(ghiVarA2.k(iJ4) ? null : ghiVarA2.m(iJ4));
                        if (wmdVarB2 == null) {
                            throw new IllegalStateException("Expected NON-NULL 'com.google.wireless.android.tv.gtv.MediaLibraryConfig', but it was NULL.");
                        }
                        arrayList3.add(new ima(strD2, wmdVarB2));
                    }
                    return arrayList3;
                } finally {
                }
            case 9:
                ghi ghiVarA3 = ((gic) obj).a("\n      SELECT media_library_item_id FROM `media_library_item` WHERE `account_name` = ?\n    ");
                try {
                    ghiVarA3.i(1, (String) this.a);
                    ArrayList arrayList4 = new ArrayList();
                    while (ghiVarA3.l()) {
                        wmp wmpVarX = ipc.x(ghiVarA3.k(0) ? null : ghiVarA3.m(0));
                        if (wmpVarX == null) {
                            throw new IllegalStateException("Expected NON-NULL 'com.google.wireless.android.tv.gtv.MediaLibraryItemId', but it was NULL.");
                        }
                        arrayList4.add(wmpVarX);
                    }
                    return arrayList4;
                } finally {
                }
            case 10:
                ghi ghiVarA4 = ((gic) obj).a("\n      SELECT CASE WHEN Count(play_id) = 0 THEN 1 ELSE 0 END FROM `media_library_item` WHERE `account_name` = ?\n    ");
                try {
                    ghiVarA4.i(1, (String) this.a);
                    if (ghiVarA4.l()) {
                        zValueOf = Boolean.valueOf(((int) ghiVarA4.b(0)) != 0);
                    } else {
                        zValueOf = false;
                    }
                    return zValueOf;
                } finally {
                }
            case 11:
                gic gicVar = (gic) obj;
                ghi ghiVarA5 = gicVar.a("\n      DELETE FROM media_library_item_metadata WHERE account_name = ? AND NOT EXISTS (SELECT play_id FROM media_library_item Item WHERE media_library_item_metadata.play_id = Item.play_id)\n    ");
                try {
                    ghiVarA5.i(1, (String) this.a);
                    ghiVarA5.l();
                    return Integer.valueOf(gez.K(gicVar));
                } finally {
                }
            case 12:
                ghi ghiVarA6 = ((gic) obj).a("SELECT * FROM `media_library_item_metadata` WHERE `account_name` = ?");
                try {
                    ghiVarA6.i(1, (String) this.a);
                    int iJ5 = gez.J(ghiVarA6, "play_id");
                    int iJ6 = gez.J(ghiVarA6, "account_name");
                    int iJ7 = gez.J(ghiVarA6, "expiration_time_millis");
                    int iJ8 = gez.J(ghiVarA6, "component");
                    int iJ9 = gez.J(ghiVarA6, "search_suggestion_component");
                    int iJ10 = gez.J(ghiVarA6, "media_library_item_metadata");
                    ArrayList arrayList5 = new ArrayList();
                    while (ghiVarA6.l()) {
                        wni wniVarU = ipc.u(ghiVarA6.k(iJ5) ? null : ghiVarA6.d(iJ5));
                        if (wniVarU == null) {
                            throw new IllegalStateException("Expected NON-NULL 'com.google.wireless.android.tv.gtv.PlayId', but it was NULL.");
                        }
                        String strD3 = ghiVarA6.d(iJ6);
                        long jB = ghiVarA6.b(iJ7);
                        wkx wkxVarF = ihz.f(ghiVarA6.k(iJ8) ? null : ghiVarA6.m(iJ8));
                        wkx wkxVarF2 = ihz.f(ghiVarA6.k(iJ9) ? null : ghiVarA6.m(iJ9));
                        wmu wmuVarV = ipc.v(ghiVarA6.k(iJ10) ? null : ghiVarA6.m(iJ10));
                        if (wmuVarV == null) {
                            throw new IllegalStateException("Expected NON-NULL 'com.google.wireless.android.tv.gtv.MediaLibraryItemMetadata', but it was NULL.");
                        }
                        arrayList5.add(new imc(wniVarU, strD3, jB, wkxVarF, wkxVarF2, wmuVarV));
                    }
                    return arrayList5;
                } finally {
                }
            case 13:
                ghi ghiVarA7 = ((gic) obj).a("\n      SELECT play_id FROM `media_library_item_page_data` WHERE `account_name` = ?\n    ");
                try {
                    ghiVarA7.i(1, (String) this.a);
                    ArrayList arrayList6 = new ArrayList();
                    while (ghiVarA7.l()) {
                        wni wniVarU2 = ipc.u(ghiVarA7.k(0) ? null : ghiVarA7.d(0));
                        if (wniVarU2 == null) {
                            throw new IllegalStateException("Expected NON-NULL 'com.google.wireless.android.tv.gtv.PlayId', but it was NULL.");
                        }
                        arrayList6.add(wniVarU2);
                    }
                    return arrayList6;
                } finally {
                }
            case 14:
                gic gicVar2 = (gic) obj;
                ghi ghiVarA8 = gicVar2.a("\n      DELETE FROM media_library_item_page_data WHERE account_name = ? AND NOT EXISTS (SELECT play_id FROM media_library_item Item WHERE media_library_item_page_data.play_id = Item.play_id)\n    ");
                try {
                    ghiVarA8.i(1, (String) this.a);
                    ghiVarA8.l();
                    return Integer.valueOf(gez.K(gicVar2));
                } finally {
                }
            case 15:
                gic gicVar3 = (gic) obj;
                ghi ghiVarA9 = gicVar3.a("\n      DELETE FROM media_library_item_rental WHERE account_name = ? AND NOT EXISTS (SELECT play_id FROM media_library_item Item WHERE media_library_item_rental.play_id = Item.play_id)\n    ");
                try {
                    ghiVarA9.i(1, (String) this.a);
                    ghiVarA9.l();
                    return Integer.valueOf(gez.K(gicVar3));
                } finally {
                }
            case 16:
                ghi ghiVarA10 = ((gic) obj).a("\n      SELECT * FROM media_library_item_tag WHERE play_id = ?\n    ");
                try {
                    ghiVarA10.i(1, (String) this.a);
                    int iJ11 = gez.J(ghiVarA10, "play_id");
                    int iJ12 = gez.J(ghiVarA10, "account_name");
                    int iJ13 = gez.J(ghiVarA10, "tag_id");
                    ArrayList arrayList7 = new ArrayList();
                    while (ghiVarA10.l()) {
                        wni wniVarU3 = ipc.u(ghiVarA10.k(iJ11) ? null : ghiVarA10.d(iJ11));
                        if (wniVarU3 == null) {
                            throw new IllegalStateException("Expected NON-NULL 'com.google.wireless.android.tv.gtv.PlayId', but it was NULL.");
                        }
                        arrayList7.add(new imf(wniVarU3, ghiVarA10.d(iJ12), ghiVarA10.d(iJ13)));
                    }
                    return arrayList7;
                } finally {
                }
            case 17:
                ghi ghiVarA11 = ((gic) obj).a("DELETE FROM media_library_item_tag WHERE account_name = ? AND tag_id = 'tftag;shared'");
                try {
                    ghiVarA11.i(1, (String) this.a);
                    ghiVarA11.l();
                    return ygi.a;
                } finally {
                }
            case 18:
                ghi ghiVarA12 = ((gic) obj).a(" \n        INSERT OR REPLACE INTO media_library_item_tag (play_id, account_name, tag_id) \n        SELECT play_id, account_name, 'tftag;shared'  \n        FROM media_library_item Items\n        WHERE type = 2 \n        AND EXISTS (\n          SELECT 1 \n          FROM media_library_item \n          WHERE root_id = Items.play_id \n          AND family_shared = 1 \n          AND account_name = ?\n        );\n  ");
                try {
                    ghiVarA12.i(1, (String) this.a);
                    ghiVarA12.l();
                    return ygi.a;
                } finally {
                }
            case 19:
                ghi ghiVarA13 = ((gic) obj).a("\n      INSERT INTO media_library_item_tag (play_id, account_name, tag_id) \n      SELECT play_id, account_name, 'tftag;shared' \n      FROM media_library_item \n      WHERE type = 1 \n      AND family_shared = 1 \n      AND account_name = ?\n    ");
                try {
                    ghiVarA13.i(1, (String) this.a);
                    ghiVarA13.l();
                    return ygi.a;
                } finally {
                }
            default:
                ghi ghiVarA14 = ((gic) obj).a("SELECT * FROM last_watched_item  WHERE account_name = ?");
                try {
                    ghiVarA14.i(1, (String) this.a);
                    int iJ14 = gez.J(ghiVarA14, "account_name");
                    int iJ15 = gez.J(ghiVarA14, "show_id");
                    int iJ16 = gez.J(ghiVarA14, "last_watched_episode_id");
                    ArrayList arrayList8 = new ArrayList();
                    while (ghiVarA14.l()) {
                        String strD4 = ghiVarA14.d(iJ14);
                        wni wniVarU4 = ipc.u(ghiVarA14.k(iJ15) ? null : ghiVarA14.d(iJ15));
                        if (wniVarU4 == null) {
                            throw new IllegalStateException("Expected NON-NULL 'com.google.wireless.android.tv.gtv.PlayId', but it was NULL.");
                        }
                        wni wniVarU5 = ipc.u(ghiVarA14.k(iJ16) ? null : ghiVarA14.d(iJ16));
                        if (wniVarU5 == null) {
                            throw new IllegalStateException("Expected NON-NULL 'com.google.wireless.android.tv.gtv.PlayId', but it was NULL.");
                        }
                        arrayList8.add(new img(strD4, wniVarU4, wniVarU5));
                    }
                    return arrayList8;
                } finally {
                }
        }
    }
}
