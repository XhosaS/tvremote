package defpackage;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ike extends ijy {
    public final gex a;
    public final gei b = new ikd();

    public ike(gex gexVar) {
        this.a = gexVar;
    }

    @Override // defpackage.ijf
    public final /* bridge */ /* synthetic */ Object a(Object[] objArr, yih yihVar) {
        throw null;
    }

    @Override // defpackage.ijf
    public final /* bridge */ /* synthetic */ Object b(Object[] objArr, yih yihVar) {
        return gez.l(this.a, false, true, new ijr(this, objArr, 7), yihVar);
    }

    @Override // defpackage.ijy
    public final Object c(String str, wni wniVar, yih yihVar) {
        return gez.k(this.a, new ikc(this, str, wniVar, 0), yihVar);
    }

    @Override // defpackage.ijy
    public final Object e(final String str, yih yihVar) {
        return gez.l(this.a, true, false, new yjv() { // from class: ika
            @Override // defpackage.yjv
            public final Object a(Object obj) {
                int i;
                Integer numValueOf;
                ghi ghiVarA = ((gic) obj).a("\n      SELECT * FROM `media_library_item` WHERE `account_name` = ?\n    ");
                try {
                    ghiVarA.i(1, str);
                    int iJ = gez.J(ghiVarA, "play_id");
                    int iJ2 = gez.J(ghiVarA, "media_library_item_id");
                    int iJ3 = gez.J(ghiVarA, "account_name");
                    int iJ4 = gez.J(ghiVarA, "type");
                    int iJ5 = gez.J(ghiVarA, "title");
                    int iJ6 = gez.J(ghiVarA, "order");
                    int iJ7 = gez.J(ghiVarA, "parent_id");
                    int iJ8 = gez.J(ghiVarA, "root_id");
                    int iJ9 = gez.J(ghiVarA, "component_bytes");
                    int iJ10 = gez.J(ghiVarA, "family_shared");
                    int iJ11 = gez.J(ghiVarA, "bundle_title");
                    int iJ12 = gez.J(ghiVarA, "media_library_item_info");
                    int iJ13 = gez.J(ghiVarA, "sort_column_1");
                    int iJ14 = gez.J(ghiVarA, "sort_column_2");
                    int iJ15 = gez.J(ghiVarA, "sort_column_3");
                    int iJ16 = gez.J(ghiVarA, "sort_column_4");
                    int iJ17 = gez.J(ghiVarA, "sort_column_5");
                    ArrayList arrayList = new ArrayList();
                    while (ghiVarA.l()) {
                        wni wniVarU = ipc.u(ghiVarA.k(iJ) ? null : ghiVarA.d(iJ));
                        if (wniVarU == null) {
                            throw new IllegalStateException("Expected NON-NULL 'com.google.wireless.android.tv.gtv.PlayId', but it was NULL.");
                        }
                        wmp wmpVarX = ipc.x(ghiVarA.k(iJ2) ? null : ghiVarA.m(iJ2));
                        if (wmpVarX == null) {
                            throw new IllegalStateException("Expected NON-NULL 'com.google.wireless.android.tv.gtv.MediaLibraryItemId', but it was NULL.");
                        }
                        String strD = ghiVarA.d(iJ3);
                        int i2 = iJ2;
                        int i3 = iJ3;
                        int iB = (int) ghiVarA.b(iJ4);
                        String strD2 = ghiVarA.k(iJ5) ? null : ghiVarA.d(iJ5);
                        if (ghiVarA.k(iJ6)) {
                            i = iB;
                            numValueOf = null;
                        } else {
                            i = iB;
                            numValueOf = Integer.valueOf((int) ghiVarA.b(iJ6));
                        }
                        wni wniVarU2 = ipc.u(ghiVarA.k(iJ7) ? null : ghiVarA.d(iJ7));
                        wni wniVarU3 = ipc.u(ghiVarA.k(iJ8) ? null : ghiVarA.d(iJ8));
                        wkx wkxVarF = ihz.f(ghiVarA.k(iJ9) ? null : ghiVarA.m(iJ9));
                        boolean z = ((int) ghiVarA.b(iJ10)) != 0;
                        String strD3 = ghiVarA.k(iJ11) ? null : ghiVarA.d(iJ11);
                        iia iiaVarW = ipc.w(ghiVarA.k(iJ12) ? null : ghiVarA.m(iJ12));
                        if (iiaVarW == null) {
                            throw new IllegalStateException("Expected NON-NULL 'com.google.android.apps.googletv.app.data.proto.MediaLibraryItemInfo', but it was NULL.");
                        }
                        int i4 = iJ15;
                        int i5 = iJ16;
                        int i6 = iJ;
                        int i7 = iJ17;
                        iJ17 = i7;
                        arrayList.add(new imb(wniVarU, wmpVarX, strD, i, strD2, numValueOf, wniVarU2, wniVarU3, wkxVarF, z, strD3, iiaVarW, ghiVarA.k(iJ13) ? null : ghiVarA.d(iJ13), ghiVarA.k(iJ14) ? null : ghiVarA.d(iJ14), ghiVarA.k(i4) ? null : ghiVarA.d(i4), ghiVarA.k(i5) ? null : ghiVarA.d(i5), ghiVarA.k(i7) ? null : ghiVarA.d(i7)));
                        iJ16 = i5;
                        iJ = i6;
                        iJ3 = i3;
                        iJ15 = i4;
                        iJ2 = i2;
                    }
                    return arrayList;
                } finally {
                    ghiVarA.close();
                }
            }
        }, yihVar);
    }

    @Override // defpackage.ijy
    public final Object f(String str, wni wniVar, yih yihVar) {
        return gez.l(this.a, true, false, new ijr(wniVar, str, 8), yihVar);
    }

    @Override // defpackage.ijy
    public final Object g(String str, String str2, int i, yih yihVar) {
        return gez.l(this.a, true, false, new aiy(str, str2, i, 9), yihVar);
    }

    @Override // defpackage.ijy
    public final Object h(String str, String str2, int i, yih yihVar) {
        return gez.l(this.a, true, false, new aiy(str, str2, i, 8), yihVar);
    }

    @Override // defpackage.ijy
    public final Object i(String str, yih yihVar) {
        return gez.l(this.a, true, false, new gxb(str, 9), yihVar);
    }

    @Override // defpackage.ijy
    public final Object j(String str, wni wniVar, yih yihVar) {
        return gez.l(this.a, true, false, new ijr(str, (Object) wniVar, 5), yihVar);
    }

    @Override // defpackage.ijy
    public final Object k(String str, long j, yih yihVar) {
        return gez.l(this.a, true, false, new ikb(j, str, 0), yihVar);
    }

    @Override // defpackage.ijy
    public final Object l(final String str, final long j, final int i, final int i2, yih yihVar) {
        return gez.l(this.a, true, false, new yjv() { // from class: ijz
            @Override // defpackage.yjv
            public final Object a(Object obj) {
                ghi ghiVarA = ((gic) obj).a("\n      SELECT Item.media_library_item_id from `media_library_item` Item LEFT JOIN `media_library_item_page_data` PageData  ON Item.account_name = PageData.account_name AND Item.play_id = PageData.play_id WHERE (IFNULL(PageData.expiration_time_millis, 0) < ? OR PageData.play_id IS NULL) AND Item.account_name = ? AND Item.type IN (?, ?) \n    ");
                long j2 = j;
                String str2 = str;
                int i3 = i;
                int i4 = i2;
                try {
                    ghiVarA.g(1, j2);
                    ghiVarA.i(2, str2);
                    ghiVarA.g(3, i3);
                    ghiVarA.g(4, i4);
                    ArrayList arrayList = new ArrayList();
                    while (ghiVarA.l()) {
                        wmp wmpVarX = ipc.x(ghiVarA.k(0) ? null : ghiVarA.m(0));
                        if (wmpVarX == null) {
                            throw new IllegalStateException("Expected NON-NULL 'com.google.wireless.android.tv.gtv.MediaLibraryItemId', but it was NULL.");
                        }
                        arrayList.add(wmpVarX);
                    }
                    return arrayList;
                } finally {
                    ghiVarA.close();
                }
            }
        }, yihVar);
    }

    @Override // defpackage.ijy
    public final Object m(String str, wni wniVar, yih yihVar) {
        return gez.l(this.a, true, false, new ijr(wniVar, str, 4), yihVar);
    }

    @Override // defpackage.ijy
    public final Object n(String str, yih yihVar) {
        return gez.l(this.a, true, false, new gxb(str, 10), yihVar);
    }

    @Override // defpackage.ijy
    public final ysx o(ghq ghqVar) {
        gfd gfdVar;
        ghj ghjVar = (ghj) ghqVar;
        Object[] objArr = ghjVar.b;
        String str = ghjVar.a;
        int length = objArr != null ? objArr.length : 0;
        TreeMap treeMap = gfd.a;
        synchronized (treeMap) {
            Map.Entry entryCeilingEntry = treeMap.ceilingEntry(Integer.valueOf(length));
            if (entryCeilingEntry != null) {
                treeMap.remove(entryCeilingEntry.getKey());
                gfdVar = (gfd) entryCeilingEntry.getValue();
                gfdVar.h(str, length);
                gfdVar.getClass();
            } else {
                gfdVar = new gfd(length);
                gfdVar.h(str, length);
            }
        }
        ghqVar.g(new gfc(gfdVar));
        ghd ghdVar = new ghd(gfdVar.f(), new fyq(gfdVar, 12));
        return gez.p(this.a, new String[]{"media_library_item", "media_library_item_metadata"}, new ijr((String) ghdVar.a, (Object) ghdVar, 2));
    }
}
