package defpackage;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import com.google.android.videos.R;
import com.google.common.collect.FluentIterable;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class ktw {
    private static Set a;

    public static boolean A(Set set, Class cls, tsv tsvVar) {
        tst tstVarFirstMatch = FluentIterable.from(set).firstMatch(tsvVar);
        if (!tstVarFirstMatch.g()) {
            return false;
        }
        krd.e(cls.getSimpleName() + " got task " + ((String) tstVarFirstMatch.c()));
        return true;
    }

    public static void B(isy isyVar, kuh kuhVar, ContentValues contentValues) {
        SQLiteDatabase sQLiteDatabaseF = isyVar.f();
        try {
            if (sQLiteDatabaseF.update("purchased_assets", contentValues, "account = ? AND asset_type IN (6,20) AND asset_id = ?", new String[]{kuhVar.a.a, kuhVar.b}) > 0) {
                isyVar.l(sQLiteDatabaseF, kuhVar.a, kuhVar.b);
            } else {
                isyVar.g(sQLiteDatabaseF, true);
            }
        } catch (Throwable th) {
            isyVar.g(sQLiteDatabaseF, false);
            throw th;
        }
    }

    public static boolean C(isy isyVar, ksn ksnVar, String str, boolean z, int i, int i2, boolean z2) {
        SQLiteDatabase sQLiteDatabaseF = isyVar.f();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("pinned", Long.valueOf(z ? System.currentTimeMillis() : 0L));
            contentValues.put("pinning_notification_active", Boolean.valueOf(z));
            if (z) {
                contentValues.put("pinning_status", (Integer) 5);
                contentValues.put(krh.DOWNLOAD_QUALITY, Integer.valueOf(i));
                contentValues.put("external_storage_index", Integer.valueOf(i2));
                contentValues.put("license_release_pending", (Boolean) false);
            } else {
                if (z2) {
                    contentValues.put("pinning_status", (Integer) 6);
                    contentValues.put("pinning_status_reason", (Integer) 27);
                } else {
                    contentValues.putNull("pinning_status");
                }
                contentValues.putAll(r());
            }
            contentValues.putNull("pinning_status_reason");
            contentValues.putNull("pinning_drm_error_code");
            int iUpdate = sQLiteDatabaseF.update("purchased_assets", contentValues, z ? "account = ? AND asset_type IN (6,20) AND asset_id = ? AND NOT (pinned IS NOT NULL AND pinned > 0)" : "account = ? AND asset_type IN (6,20) AND asset_id = ? AND (pinned IS NOT NULL AND pinned > 0)", new String[]{ksnVar.a, str});
            if (iUpdate > 0) {
                isyVar.l(sQLiteDatabaseF, ksnVar, str);
            } else {
                isyVar.g(sQLiteDatabaseF, true);
            }
            return iUpdate > 0;
        } catch (Throwable th) {
            isyVar.g(sQLiteDatabaseF, false);
            throw th;
        }
    }

    public static boolean D(isy isyVar, ksn ksnVar, String str, boolean z) {
        return C(isyVar, ksnVar, str, false, -1, -1, z);
    }

    private static synchronized Set E() {
        if (a == null) {
            a = new HashSet();
            for (Field field : krh.class.getDeclaredFields()) {
                if (field.isAnnotationPresent(krg.class)) {
                    try {
                        a.add((String) field.get(null));
                    } catch (IllegalAccessException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
        return a;
    }

    private static float F(Resources resources, int i, int i2, int i3) {
        try {
            return resources.getDimension(i);
        } catch (Exception unused) {
            Log.e("RESOURCE_NOT_FOUND", "Resource : ".concat(String.valueOf(String.valueOf(resources))));
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            return displayMetrics != null ? TypedValue.complexToDimension(i2, displayMetrics) : i3;
        }
    }

    private static int G(Resources resources, int i, int i2) {
        try {
            return resources.getDimensionPixelSize(i);
        } catch (Exception unused) {
            Log.e("RESOURCE_NOT_FOUND", "resource: ".concat(String.valueOf(String.valueOf(resources))));
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            return displayMetrics != null ? TypedValue.complexToDimensionPixelSize(i2, displayMetrics) : i2 * 3;
        }
    }

    public static String a(ieg iegVar, String str, String str2) {
        boolean zM = iegVar.m();
        String strConcat = krh.MULTI_AUDIO_LANGUAGE_ASSET_PREFIX;
        if (zM) {
            strConcat = krh.MULTI_AUDIO_LANGUAGE_ASSET_PREFIX.concat(iegVar.g().toString());
        }
        return str2 == null ? a.cq(str, strConcat, "_") : a.cq(str2, strConcat, "_");
    }

    public static String b(ieg iegVar) {
        return iegVar.m() ? krh.MULTI_AUDIO_LANGUAGE_FUTURE_PREFIX.concat(iegVar.g().toString()) : krh.MULTI_AUDIO_LANGUAGE_FUTURE_PREFIX;
    }

    public static String c(ieg iegVar) {
        return krh.NUR_COOKIE_PREFIX.concat((iegVar.m() ? iegVar.g() : "").toString());
    }

    public static boolean d(String str) {
        if (str == null) {
            krd.c("isEligibleForBackup received null key");
            return false;
        }
        Set<String> setE = E();
        if (setE.contains(str) || str.contains(krh.WELCOME_CARD_DISMISSED)) {
            return true;
        }
        for (String str2 : setE) {
            if (str.startsWith(str2) || str.endsWith(str2)) {
                return true;
            }
        }
        return false;
    }

    public static boolean e(Activity activity, DialogInterface.OnCancelListener onCancelListener) {
        nvj nvjVar = nvj.a;
        return nvjVar.d(activity, nvjVar.h(activity, 14700000), 906, onCancelListener);
    }

    public static ieg f(Parcel parcel, Parcelable.Creator creator) {
        return parcel.readByte() == 1 ? ieg.f(parcel.createTypedArrayList(creator)) : ieg.a;
    }

    public static ieg g(Parcel parcel, Class cls) {
        return parcel.readByte() == 1 ? ieg.f(parcel.readParcelable(cls.getClassLoader())) : ieg.a;
    }

    public static void h(Parcel parcel, ieg iegVar) {
        boolean zM = iegVar.m();
        parcel.writeByte(zM ? (byte) 1 : (byte) 0);
        if (zM) {
            parcel.writeTypedList((List) iegVar.g());
        }
    }

    public static void i(Parcel parcel, ieg iegVar) {
        boolean zM = iegVar.m();
        parcel.writeByte(zM ? (byte) 1 : (byte) 0);
        if (zM) {
            parcel.writeParcelable((Parcelable) iegVar.g(), 0);
        }
    }

    public static /* synthetic */ String j(int i) {
        switch (i) {
            case 1:
                return "EXTERNAL_DEEP_LINK_ACTION";
            case 2:
                return "OPEN_CLUSTER_PAGE_ACTION";
            case 3:
                return "OPEN_DETAILS_PAGE_ACTION";
            case 4:
                return "OPEN_HOME_PAGE_ACTION";
            case 5:
                return "OPEN_SHOP_PAGE_ACTION";
            case 6:
                return "OPEN_WATCHLIST_PAGE_ACTION";
            case 7:
                return "OPEN_LIBRARY_PAGE_ACTION";
            case 8:
                return "PLAYBACK_ACTION";
            case 9:
                return "OPEN_SETTINGS_PAGE_ACTION";
            case 10:
                return "OPEN_SETUP_PAGE_ACTION";
            default:
                return "ANDROID_APP_ACTION";
        }
    }

    public static /* synthetic */ String k(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "null" : "UNSELECTED" : "THUMB_DOWN" : "THUMB_UP";
    }

    public static int l(lcu lcuVar) {
        int iOrdinal = lcuVar.ordinal();
        return iOrdinal != 2 ? iOrdinal != 3 ? R.drawable.ic_rotten : R.drawable.ic_certified_fresh : R.drawable.ic_fresh;
    }

    public static final ieg m(Parcel parcel) {
        return ieg.a(parcel.readString());
    }

    public static final void n(ieg iegVar, Parcel parcel) {
        parcel.writeString((String) iegVar.c);
    }

    public static ieg o(ksn ksnVar, ksy ksyVar, ieg iegVar, ieg iegVar2, kuf kufVar, lys lysVar, lfn lfnVar) {
        ieg iegVarF;
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        long jAG = jCurrentTimeMillis + lfnVar.aG();
        if (ksy.v(ksyVar)) {
            lyc lycVarB = lyc.b(ksyVar);
            vtw vtwVarM = kzw.a.m();
            String str = kufVar.b;
            Collection collection = lbk.a;
            vtw vtwVarM2 = lbp.a.m();
            lar larVarJ = lbk.j(str);
            if (!vtwVarM2.b.A()) {
                vtwVarM2.u();
            }
            lbp lbpVar = (lbp) vtwVarM2.b;
            larVarJ.getClass();
            lbpVar.c = larVarJ;
            lbpVar.b |= 1;
            lbp lbpVar2 = (lbp) vtwVarM2.r();
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            kzw kzwVar = (kzw) vtwVarM.b;
            lbpVar2.getClass();
            kzwVar.c = lbpVar2;
            kzwVar.b = 8;
            iegVarF = ieg.f(new lyj(lycVarB, (kzw) vtwVarM.r(), jCurrentTimeMillis, jAG));
        } else if (ksy.t(ksyVar) && iegVar.m() && iegVar2.m()) {
            lyc lycVarC = lyc.c((ksy) iegVar2.g());
            vtw vtwVarM3 = kzw.a.m();
            ksy ksyVar2 = (ksy) iegVar2.g();
            ksy ksyVar3 = (ksy) iegVar.g();
            String str2 = kufVar.b;
            Collection collection2 = lbk.a;
            vtw vtwVarM4 = lci.a.m();
            a.H(ksy.t(ksyVar));
            a.H(ksy.x(ksyVar3));
            a.H(ksy.y(ksyVar2));
            vtw vtwVarM5 = law.a.m();
            String str3 = ksyVar.b;
            if (!vtwVarM5.b.A()) {
                vtwVarM5.u();
            }
            ((law) vtwVarM5.b).c = str3;
            lce lceVarM = lbk.m(ksyVar3.b, lbk.n(ksyVar2.b));
            if (!vtwVarM5.b.A()) {
                vtwVarM5.u();
            }
            law lawVar = (law) vtwVarM5.b;
            lceVarM.getClass();
            lawVar.d = lceVarM;
            lawVar.b |= 1;
            law lawVar2 = (law) vtwVarM5.r();
            if (!vtwVarM4.b.A()) {
                vtwVarM4.u();
            }
            lci lciVar = (lci) vtwVarM4.b;
            lawVar2.getClass();
            lciVar.c = lawVar2;
            lciVar.b |= 1;
            lar larVarJ2 = lbk.j(str2);
            if (!vtwVarM4.b.A()) {
                vtwVarM4.u();
            }
            lci lciVar2 = (lci) vtwVarM4.b;
            larVarJ2.getClass();
            lciVar2.d = larVarJ2;
            lciVar2.b |= 2;
            lci lciVar3 = (lci) vtwVarM4.r();
            if (!vtwVarM3.b.A()) {
                vtwVarM3.u();
            }
            kzw kzwVar2 = (kzw) vtwVarM3.b;
            lciVar3.getClass();
            kzwVar2.c = lciVar3;
            kzwVar2.b = 9;
            iegVarF = ieg.f(new lyj(lycVarC, (kzw) vtwVarM3.r(), jCurrentTimeMillis, jAG));
        } else {
            iegVarF = ieg.a;
        }
        return iegVarF.m() ? ieg.f(new lyh(ksnVar.a, lysVar.d(ksnVar), Locale.getDefault(), Collections.singletonList((lyj) iegVarF.g()))) : ieg.a;
    }

    public static int p(int i) {
        return (i & 64) != 0 ? R.string.pending_detail_wifi_or_unrestricted_data : (i & 8) != 0 ? R.string.pending_detail_wifi : (i & 2) != 0 ? R.string.pending_detail_network : (i & 4) != 0 ? R.string.pending_detail_storage : (i & 16) != 0 ? R.string.pending_detail_queued : (i & 32) != 0 ? R.string.pending_detail_streaming : R.string.pending_detail_generic;
    }

    public static String q(Context context, int i, Long l, Integer num, boolean z) {
        if (i == 1) {
            return context.getString(R.string.pinning_error_fetching_license, num);
        }
        if (i == 2) {
            return context.getString(true != z ? R.string.pinning_error_purchase_pinned_elsewhere : R.string.pinning_error_rental_pinned_elsewhere, num);
        }
        if (i == 3) {
            return context.getString(R.string.pinning_error_restricted_in_region, num);
        }
        if (i == 6) {
            return context.getString(R.string.pinning_error_unsupported_video_format);
        }
        if (i == 7) {
            return context.getString(R.string.pinning_error_insufficient_free_space_with_size, Formatter.formatFileSize(context, l.longValue()));
        }
        switch (i) {
            case 20:
                return context.getString(R.string.pinning_error_too_many_active_devices_for_account);
            case 21:
                return context.getString(R.string.pinning_error_too_many_accounts_on_device);
            case 22:
                return context.getString(R.string.pinning_error_too_many_device_deactivations_on_account);
            case 23:
                return context.getString(R.string.pinning_error_too_many_activations_on_device);
            default:
                return context.getString(R.string.pinning_error_pinning_failed);
        }
    }

    public static ContentValues r() {
        ContentValues contentValues = new ContentValues();
        contentValues.putNull(krh.DOWNLOAD_QUALITY);
        contentValues.putNull("external_storage_index");
        contentValues.put("license_release_pending", (Boolean) true);
        return contentValues;
    }

    public static ContentValues s() {
        ContentValues contentValues = new ContentValues();
        contentValues.putNull("license_type");
        contentValues.putNull("license_activation");
        contentValues.putNull("license_force_sync");
        contentValues.putNull("license_last_synced_timestamp");
        contentValues.putNull("license_last_synced_sdk_int");
        contentValues.putNull("license_expiration_timestamp");
        contentValues.putNull("license_file_path_key");
        contentValues.putNull("license_key_id");
        contentValues.putNull("license_asset_id");
        contentValues.putNull("license_system_id");
        contentValues.putNull("license_cenc_key_set_id");
        contentValues.putNull("license_cenc_pssh_data");
        contentValues.putNull("license_cenc_security_level");
        contentValues.putNull("license_cenc_mimetype");
        contentValues.putNull("download_relative_filepath");
        contentValues.putNull("download_extra_proto");
        contentValues.put("license_release_pending", (Boolean) false);
        return contentValues;
    }

    public static kug t(lyz lyzVar, kuh kuhVar) {
        lat latVar;
        kso ksoVar;
        Cursor cursorQuery = lyzVar.b().query("purchased_assets", lzn.a, "account = ? AND asset_type IN (6,20) AND asset_id = ?", new String[]{kuhVar.a.a, kuhVar.b}, null, null, null);
        try {
            byte[] blob = null;
            kug kugVar = null;
            if (cursorQuery.moveToFirst()) {
                int iA = mei.a(cursorQuery, 4, 0);
                try {
                    if (cursorQuery.isNull(3)) {
                        latVar = null;
                    } else {
                        byte[] blob2 = cursorQuery.getBlob(3);
                        vuc vucVarP = vuc.p(lat.a, blob2, 0, blob2.length, vtp.a());
                        vuc.B(vucVarP);
                        latVar = (lat) vucVarP;
                    }
                    if (latVar == null) {
                        vtw vtwVarM = lcl.a.m();
                        long j = cursorQuery.getLong(1);
                        if (!vtwVarM.b.A()) {
                            vtwVarM.u();
                        }
                        lcl lclVar = (lcl) vtwVarM.b;
                        lclVar.b |= 2;
                        lclVar.d = j;
                        int iA2 = mei.a(cursorQuery, 14, -1);
                        if (!vtwVarM.b.A()) {
                            vtwVarM.u();
                        }
                        lcl lclVar2 = (lcl) vtwVarM.b;
                        lclVar2.b = 1 | lclVar2.b;
                        lclVar2.c = iA2;
                        long jA = meh.a(cursorQuery.getString(13));
                        if (!vtwVarM.b.A()) {
                            vtwVarM.u();
                        }
                        vuc vucVar = vtwVarM.b;
                        lcl lclVar3 = (lcl) vucVar;
                        lclVar3.b |= 8;
                        lclVar3.f = jA;
                        if (!vucVar.A()) {
                            vtwVarM.u();
                        }
                        lcl lclVar4 = (lcl) vtwVarM.b;
                        lclVar4.r = 2;
                        lclVar4.b |= 32768;
                        lcl lclVar5 = (lcl) vtwVarM.r();
                        vtw vtwVarM2 = lat.a.m();
                        vtwVarM2.D(lclVar5);
                        latVar = (lat) vtwVarM2.r();
                    }
                    lat latVar2 = latVar;
                    if (cursorQuery.isNull(5)) {
                        ksoVar = null;
                    } else {
                        ByteBuffer byteBufferWrap = ByteBuffer.wrap(cursorQuery.getBlob(5));
                        byteBufferWrap.getInt();
                        ksoVar = new kso(byteBufferWrap.getLong(), byteBufferWrap.getLong());
                    }
                    byte[] blob3 = cursorQuery.isNull(6) ? null : cursorQuery.getBlob(6);
                    if (!cursorQuery.isNull(7)) {
                        blob = cursorQuery.getBlob(7);
                    }
                    if (blob == null) {
                        Iterator<E> it = latVar2.b.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            lcl lclVar6 = (lcl) it.next();
                            if ((lclVar6.b & 16) != 0) {
                                blob = lclVar6.g.w();
                                break;
                            }
                        }
                    }
                    byte[] bArr = blob;
                    String string = cursorQuery.getString(8);
                    if (TextUtils.isEmpty(string)) {
                        string = "video/mp4";
                    }
                    kugVar = new kug(cursorQuery.getString(0), iA, mei.h(cursorQuery, 10), cursorQuery.getInt(2), cursorQuery.getInt(11), cursorQuery.getLong(12), latVar2, ksoVar, blob3, string, bArr, cursorQuery.getInt(9));
                } catch (vuq e) {
                    krd.d("Failed to deserialize DownloadExtra proto", e);
                    throw new IllegalArgumentException(e);
                }
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return kugVar;
        } finally {
        }
    }

    public static void u(lyz lyzVar, kuh kuhVar, ContentValues contentValues) {
        SQLiteDatabase sQLiteDatabaseA = lyzVar.a();
        try {
            sQLiteDatabaseA.update("purchased_assets", contentValues, "account = ? AND asset_type IN (6,20) AND asset_id = ?", new String[]{kuhVar.a.a, kuhVar.b});
            lyzVar.g(sQLiteDatabaseA, true, kuhVar.a, kuhVar.b);
        } catch (Throwable th) {
            lyzVar.g(sQLiteDatabaseA, false, kuhVar.a, kuhVar.b);
            throw th;
        }
    }

    public static List v(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            xba xbaVar = (xba) it.next();
            String str = xbaVar.b;
            boolean z = xbaVar.d;
            int iBm = a.bm(xbaVar.e);
            int i = 1;
            if (iBm == 0) {
                iBm = 1;
            }
            kzp kzpVarA = lbk.A(iBm);
            int iAR = a.aR(xbaVar.c);
            if (iAR != 0) {
                i = iAR;
            }
            arrayList.add(new ktj(str, z, kzpVarA, lbk.B(i)));
        }
        return arrayList;
    }

    public static List w(xah xahVar) {
        if (xahVar == null) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        for (xbc xbcVar : xahVar.d) {
            String str = xbcVar.b;
            int iAS = a.aS(xbcVar.c);
            if (iAS == 0) {
                iAS = 1;
            }
            arrayList.add(new ktl(str, lbk.C(iAS)));
        }
        return arrayList;
    }

    public static boolean x(String str) {
        return !TextUtils.isEmpty(str) && str.length() == 2 && Character.isUpperCase(str.charAt(0)) && Character.isUpperCase(str.charAt(1)) && !str.equals("ZZ");
    }

    public static lxl y(Context context) {
        Resources resources = context.getResources();
        if (new kwy(context.getContentResolver(), (byte[]) null).n(context)) {
            int iG = G(resources, R.dimen.pano_max_wallpaper_width, 960);
            return new lxl(G(resources, R.dimen.pano_max_movie_poster_width, 138), iG, G(resources, R.dimen.pano_max_show_poster_width, 200), iG, G(resources, R.dimen.pano_max_episode_screenshot_width, 320), G(resources, R.dimen.max_android_app_icon_width, 64), G(resources, R.dimen.pano_default_poster_height, 180), true);
        }
        float f = resources.getDisplayMetrics().density;
        float fMax = (Math.max(r15.heightPixels, r15.widthPixels) / f) * Math.min(f, 1.5f);
        float f2 = 2.0f;
        if (f <= 2.0f) {
            f2 = f;
        } else if (f >= 3.5f) {
            f2 = (-1.5f) + f;
        }
        int i = (int) fMax;
        return new lxl((int) ((F(resources, R.dimen.max_movie_poster_width, 170, 540) / f) * f2), i, (int) ((F(resources, R.dimen.max_show_poster_width, kwx.JSON3, 800) / f) * f2), i, (int) ((F(resources, R.dimen.max_episode_screenshot_width, 480, 960) / f) * f2), (int) ((F(resources, R.dimen.max_android_app_icon_width, 64, 128) / f) * f2), (int) ((F(resources, R.dimen.max_movie_poster_width, 170, 540) / f) * f2), false);
    }

    public static idf z(lfb lfbVar, ldv ldvVar, idf idfVar, idf idfVar2, vvq vvqVar, Class cls, idf idfVar3, long j, long j2, boolean z) {
        lfa lfaVar = new lfa(lfbVar, new lfh(new lfc(vvqVar, cls)), idfVar3);
        lbj lbjVar = new lbj(vvqVar, 13);
        idh idhVarD = idh.d();
        idhVarD.e(new lzl(ldvVar, idfVar2, idfVar));
        return kdw.q(lfaVar, idhVarD.b(new jxt(lbjVar, 8)), j, j2, z);
    }
}
