package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import com.google.common.collect.ImmutableList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lgf implements lge {
    public final lyz b;
    private static final tui c = tui.l("com/google/android/apps/play/movies/common/service/database/PurchasedAssetsImpl");
    public static final String a = "NOT (ifnull(hidden,0) IN (1, 3)) AND NOT (ifnull(is_bonus_content OR purchase_is_bonus_content, 0)) AND account = ?  AND purchase_status = 2 AND purchase_type IN(" + kvm.TYPE_RENTAL.f + "," + kvm.TYPE_PURCHASE.f + ") AND cast(ifnull(min(expiration_timestamp_seconds * 1000,ifnull(license_expiration_timestamp,9223372036854775807)),9223372036854775807) as integer) > ? AND asset_type = 6";

    public lgf(lyz lyzVar) {
        this.b = lyzVar;
    }

    @Override // defpackage.lge
    public final ImmutableList a(ksn ksnVar, ksy ksyVar) {
        String[] strArr;
        String str;
        SQLiteDatabase sQLiteDatabaseA = this.b.a();
        if (ksy.y(ksyVar)) {
            strArr = new String[]{ksnVar.a, ksyVar.b};
            str = "account = ? AND asset_type IN (19,20 ) AND root_asset_id = ? AND (share_type = 2 OR share_type = 3)";
        } else {
            strArr = new String[]{ksnVar.a, Integer.toString(ksyVar.a), ksyVar.b};
            str = "account = ? AND asset_type = ? AND asset_id = ?";
        }
        try {
            Cursor cursorQuery = sQLiteDatabaseA.query(true, "purchased_assets", new String[]{"purchase_id"}, str, strArr, null, null, null, null);
            try {
                ImmutableList.Builder builder = ImmutableList.builder();
                while (cursorQuery.moveToNext()) {
                    String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("purchase_id"));
                    if (!sij.F(string)) {
                        builder.add((ImmutableList.Builder) string);
                    }
                }
                ImmutableList immutableListBuild = builder.build();
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return immutableListBuild;
            } finally {
            }
        } finally {
            this.b.e(sQLiteDatabaseA, true);
        }
    }

    @Override // defpackage.lge
    public final ImmutableList b(ksn ksnVar, String str) {
        if (str.isEmpty()) {
            return ImmutableList.of();
        }
        String strE = mei.e(str);
        SQLiteDatabase sQLiteDatabaseA = this.b.a();
        try {
            Cursor cursorQuery = sQLiteDatabaseA.query(true, "purchased_assets JOIN assets ON assets_type = asset_type AND assets_id = asset_id", new String[]{"assets_id", "assets_title", "assets_poster"}, a + " AND (" + mei.c("assets_title") + " OR " + mei.c("assets_title") + ")", new String[]{ksnVar.a, Long.toString(System.currentTimeMillis()), strE + "%", a.cg(strE, "% ", "%")}, null, null, "assets_title", Integer.toString(10));
            try {
                int columnIndex = cursorQuery.getColumnIndex("assets_id");
                int columnIndex2 = cursorQuery.getColumnIndex("assets_title");
                int columnIndex3 = cursorQuery.getColumnIndex("assets_poster");
                ImmutableList.Builder builder = ImmutableList.builder();
                while (cursorQuery.moveToNext()) {
                    kve kveVarT = kvf.T(ksy.i(cursorQuery.getString(columnIndex)));
                    kveVarT.K(cursorQuery.getString(columnIndex2));
                    kveVarT.A(Uri.parse(cursorQuery.getString(columnIndex3)));
                    builder.add((ImmutableList.Builder) kveVarT.a());
                }
                ImmutableList immutableListBuild = builder.build();
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return immutableListBuild;
            } finally {
            }
        } finally {
            this.b.e(sQLiteDatabaseA, true);
        }
    }

    @Override // defpackage.lge
    public final ImmutableList c(ksn ksnVar, String str) {
        if (str.isEmpty()) {
            return ImmutableList.of();
        }
        String strE = mei.e(str);
        SQLiteDatabase sQLiteDatabaseA = this.b.a();
        try {
            Cursor cursorQuery = sQLiteDatabaseA.query(true, "purchased_assets JOIN assets ON assets_type = 18 AND assets_id = root_asset_id AND asset_type IN (20, 19)", new String[]{"assets_id", "assets_title", "assets_poster"}, "NOT (ifnull(hidden,0) IN (1, 3)) AND account = ? AND purchase_status = 2 AND cast(ifnull(min(expiration_timestamp_seconds * 1000,ifnull(license_expiration_timestamp,9223372036854775807)),9223372036854775807) as integer) > ? AND asset_type = 20 AND (" + mei.c("assets_title") + " OR " + mei.c("assets_title") + ")", new String[]{ksnVar.a, Long.toString(System.currentTimeMillis()), strE + "%", a.cg(strE, "% ", "%")}, "assets_id", null, "assets_title", Integer.toString(10));
            try {
                int columnIndex = cursorQuery.getColumnIndex("assets_id");
                int columnIndex2 = cursorQuery.getColumnIndex("assets_title");
                int columnIndex3 = cursorQuery.getColumnIndex("assets_poster");
                ImmutableList.Builder builder = ImmutableList.builder();
                while (cursorQuery.moveToNext()) {
                    kwm kwmVarC = kwn.c(ksy.l(cursorQuery.getString(columnIndex)));
                    kwmVarC.r(cursorQuery.getString(columnIndex2));
                    kwmVarC.m(Uri.parse(cursorQuery.getString(columnIndex3)));
                    builder.add((ImmutableList.Builder) kwmVarC.a());
                }
                ImmutableList immutableListBuild = builder.build();
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return immutableListBuild;
            } finally {
            }
        } finally {
            this.b.e(sQLiteDatabaseA, true);
        }
    }

    public final ImmutableList d(String str, String[] strArr) {
        SQLiteDatabase sQLiteDatabaseA = this.b.a();
        try {
            Cursor cursorQuery = sQLiteDatabaseA.query(true, "purchased_assets JOIN assets ON assets_type = asset_type AND assets_id = asset_id", new String[]{"asset_type", "asset_id"}, str, strArr, null, null, null, null);
            try {
                ImmutableList.Builder builder = ImmutableList.builder();
                while (cursorQuery.moveToNext()) {
                    builder.add((ImmutableList.Builder) ksy.c(cursorQuery.getInt(0), cursorQuery.getString(1)));
                }
                ImmutableList immutableListBuild = builder.build();
                ((tug) ((tug) c.e()).j("com/google/android/apps/play/movies/common/service/database/PurchasedAssetsImpl", "getAssetIds", 297, "PurchasedAssetsImpl.java")).t("[NON_UMP_LIBRARY] Library store returned itemCount=%d", immutableListBuild.size());
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return immutableListBuild;
            } finally {
            }
        } finally {
            this.b.e(sQLiteDatabaseA, true);
        }
    }

    public final ImmutableList e(String str, String[] strArr) {
        SQLiteDatabase sQLiteDatabaseA = this.b.a();
        try {
            Cursor cursorQuery = sQLiteDatabaseA.query(true, "purchased_assets", new String[]{"root_asset_id"}, str, strArr, "root_asset_id", "", null, null);
            try {
                ImmutableList.Builder builder = ImmutableList.builder();
                while (cursorQuery.moveToNext()) {
                    builder.add((ImmutableList.Builder) ksy.l(cursorQuery.getString(0)));
                }
                ImmutableList immutableListBuild = builder.build();
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return immutableListBuild;
            } finally {
            }
        } finally {
            this.b.e(sQLiteDatabaseA, true);
        }
    }
}
