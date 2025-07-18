package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.support.v7.widget.ActivityChooserView;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.videos.R;
import com.google.common.collect.ImmutableList;
import j$.util.DesugarCollections;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Formatter;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class krh {

    @krg
    public static final String ADAPTIVE_DISABLE_HD_ON_MOBILE_NETWORK = "adaptive_disable_hd_on_mobile_network";
    public static final String ATV_DEFAULT_CHANNEL_ID = "atv_default_channel_id";
    public static final String ATV_TOPSELLING_MOVIES_CHANNEL_ID = "atv_top_movie_channel_id";
    public static final String ATV_TOPSELLING_SHOWS_CHANNEL_ID = "atv_top_episode_channel_id";

    @krg
    public static final String AUDIO_LANGUAGE = "audio_language";
    public static final String AUDIO_LANGUAGE_PRISM_DOWNLOADS = "audio_language_prism_downloads";
    public static final String BACKUP_NAME = "backup";

    @krg
    public static final String CAST_V2_ROUTE_ID = "castv2_route_id";

    @krg
    public static final String CAST_V2_SESSION_ID = "castv2_session_id";
    public static final String CHECK_ACCOUNTS_PERIODIC_SYNC = "check_accounts_periodic_sync";
    public static final String CHECK_ACCOUNTS_SYNC_STATUS = "check_accounts_sync_status";
    public static final String CLOSE_ACTION_TAG = "close_action_";
    public static final String COMPLETED_PRIMETIME_SETUP = "completed_primetime_setup";
    public static final String CONNECTED_ACCOUNTS_CATEGORY = "connected_accounts_category";
    public static final String CONTENT_FILTERING_SETTINGS = "content_filtering_settings";
    public static final String CONTENT_FILTERING_SETTINGS_CATEGORY_V2 = "content_restrictions_category";
    public static final String CONTENT_FILTERING_SETTINGS_V2 = "content_filtering_settings_v2";
    public static final String DEBUG_EXPERIMENTS = "debug_experiments";
    public static final String DEVICE_SUMMARY = "device_summary";
    private static final String DISCOUNTS_AND_PROMOTIONS_KEY = "discounts_and_promotions";

    @krg
    public static final String DISCOUNTS_AND_PROMOTIONS_PREFIX = "discounts_and_promotions_";

    @krg
    public static final String DISCOUNTS_AND_PROMOTIONS_SETTINGS_SHOWN = "settings_shown_discounts_and_promotions";

    @krg
    public static final String DISCOUNTS_AND_PROMOTIONS_TIMESTAMP_PREFIX = "timestamp_discounts_and_promotions_";
    public static final String DMA_UNLINK_ACCOUNT = "dma_unlink_account";
    public static final String DOGFOOD_NAME = "experiments";
    public static final String DOWNLOAD_CATEGORY = "download_category";

    @krg
    public static final String DOWNLOAD_NETWORK = "download_policy";

    @krg
    public static final String DOWNLOAD_QUALITY = "download_quality";
    public static final String DOWNLOAD_SETTING_SHOWN_FLAGS = "download_setting_shown_flags";
    public static final String DOWNLOAD_STORAGE = "download_storage";

    @krg
    public static final String ENABLE_BINGE_WATCHING = "binge-watching-enabled";
    public static final String ENABLE_GUIDE_IMPRESSION_CAP = "enable_guide_impression_cap";

    @krg
    public static final String ENABLE_INFO_CARDS = "enable_info_cards";

    @krg
    public static final String ENABLE_SURROUND_SOUND = "enable_surround_sound";

    @krg
    public static final String ENABLE_VIRTUAL_REMOTE_FAB = "virtual_remote_fab_enabled";
    public static final String EXPERIMENTS_PREFIX = "experiments_prefix_";
    public static final String FAILED_USER_ACCOUNT = "failed_user_account";
    public static final String FCM_LATEST_REGISTRATION_ID = "latest_registration_id";
    public static final String FCM_NOTIFICATION_KEY_SUFFIX = "_notification_key";
    public static final String FCM_REGISTRATION_ID_SUFFIX = "_registration_id";
    public static final String FCM_SHARED_PREFS_NAME_SUFFIX = "_fcm";

    @krg
    public static final String GENERAL_ANNOUNCEMENTS_PREFIX = "general_announcements_";

    @krg
    public static final String GENERAL_ANNOUNCEMENTS_SHOWN = "settings_shown_general_announcements";

    @krg
    public static final String GENERAL_ANNOUNCEMENTS_TIMESTAMP_PREFIX = "timestamp_general_announcements_";
    public static final String GSERVICES_ID = "gservices_id";
    public static final String GTV_APP_FIRST_LAUNCH_COMPLETED = "gtv_app_first_launch_completed";
    public static final String GTV_INTRODUCTION_NEEDED = "gtv_introduction_needed";
    public static final String GTV_ONBOARDING_STATE_KEY_PREFIX = "gtv_onboarding_state_key_prefix_";
    public static final String IMPRESSION_CAP_TAG = "impression_cap_";
    public static final String INITIAL_SYNC_COMPLETED = "initial_sync_completed";
    public static final String ITAG_INFO_STORE_SERVER = "itag_info_store_server";
    public static final String ITAG_INFO_STORE_VERSION = "itag_info_store_version";
    public static final String LAST_ANALYZE_TIMESTAMP = "last_analyze_timestamp";
    public static final String LAST_CLEANUP_SEARCH_HISTORY_TIMESTAMP = "last_cleanup_search_history_timestamp";
    public static final String LAST_SYNC_WAS_SUCCESS_PREFIX = "last_sync_was_success_prefix";

    @krg
    public static final String LAST_WELCOME_CARD_DISMISSED_TIMESTAMP = "_last_promo_dismissed_timestamp";

    @krg
    public static final String LEGACY_WELCOME_CARD_DISMISSED = "_promo_dismissed";
    public static final String LONG_SPINNER_LOGGED_PREFERENCE_KEY = "long_guide_spinner_logged";
    public static final String MANAGE_DOWNLOADS = "manage_downloads";
    public static final String MAX_ALLOWED_MOVIE_RATING_PREFIX = "max_allowed_movie_rating_";
    public static final String MAX_ALLOWED_TV_RATING_PREFIX = "max_allowed_tv_rating_";
    public static final String MOBILE_NETWORK_STREAMING_CATEGORY = "mobile_network_streaming_category";
    public static final String MOVIES_ANYWHERE_UNLINK_ACCOUNT = "movies_anywhere_unlink_account";
    public static final String MULTI_AUDIO_LANGUAGE_ASSET_PREFIX = "multi_audio_language_asset_";
    public static final String MULTI_AUDIO_LANGUAGE_FUTURE_PREFIX = "multi_audio_language_future_";
    public static final String MULTI_AUDIO_SUBTITLE_ASSET_PREFIX = "multi_audio_subtitle_asset_";
    public static final String MULTI_AUDIO_SUBTITLE_FUTURE_PREFIX = "multi_audio_subtitle_future_";

    @krg
    public static final String MY_TV_SHOWS_PREFIX = "my_tv_shows_";

    @krg
    public static final String MY_TV_SHOWS_SETTINGS_SHOWN = "settings_shown_my_tv_shows";

    @krg
    public static final String MY_TV_SHOWS_TIMESTAMP_PREFIX = "timestamp_my_tv_shows_";

    @krg
    public static final String MY_WISHLIST_PREFIX = "my_wishlist_";

    @krg
    public static final String MY_WISHLIST_SETTINGS_SHOWN = "settings_shown_my_wishlist";

    @krg
    public static final String MY_WISHLIST_TIMESTAMP_PREFIX = "timestamp_my_wishlist_";

    @krg
    public static final String NEWLY_AVAILABLE_CONTENT_ON_SERVICE_PREFIX = "newly_available_content_on_service_";

    @krg
    public static final String NEWLY_AVAILABLE_CONTENT_ON_SERVICE_SHOWN = "newly_available_content_on_service_shown";

    @krg
    public static final String NEWLY_AVAILABLE_CONTENT_ON_SERVICE_TIMESTAMP_PREFIX = "timestamp_newly_available_content_on_service_";
    public static final String NEW_MOVIE_4K_UPGRADE_PURCHASE_CUTOFF_TIMESTAMP_SECONDS = "new_movie_4k_upgrade_purchase_cutoff_timestamp_seconds";
    public static final String NOTIFICATIONS_CATEGORY = "notifications_category";

    @krg
    public static final String NOTIFICATION_SETTINGS_TIMESTAMP_PREFIX = "timestamp_notification_settings_";
    public static final String NUR_COOKIE_PREFIX = "nur_cookie_prefix_";
    public static final String NUR_EXPERIMENTS_PREFIX = "nur_experiments_prefix_";
    public static final String OPEN_SOURCE_LICENSES = "open_source_licenses";
    public static final String PENDING_AUTHENTICATION = "pending_authentication";
    public static final String PRIMETIME_GUIDE_SAVED_STATE_DATE_KEY_PREFIX = "primetime_guide_saved_state_date_key_prefix_";
    public static final String PRIMETIME_GUIDE_SETUP_STATE_KEY_PREFIX = "primetime_guide_setup_state_key_prefix_";

    @krg
    public static final String PROMOTION_CODE_REDEEMED_PREFIX = "promotion_code_redeemed_";

    @krg
    public static final String RECOMMENDATIONS_AND_OFFERS_PREFIX = "recommendations_and_offers_";

    @krg
    public static final String RECOMMENDATIONS_AND_OFFERS_SETTINGS_SHOWN = "settings_shown_recommendations_and_offers";

    @krg
    public static final String RECOMMENDATIONS_AND_OFFERS_TIMESTAMP_PREFIX = "timestamp_recommendations_and_offers_";

    @krg
    public static final String RECOMMENDATION_TOKEN_PREFIX = "recommendation_token_";

    @krg
    public static final String RECONSENT_DIALOG_SHOWN_TIMESTAMP = "reconsent_dialog_shown_timestamp";
    public static final String RETRY_LOGGED_PREFERENCE_KEY = "guide_retry_logged";
    public static final String RETRY_TIMESTAMP_PREFERENCE_KEY = "guide_retry_timestamp";

    @krg
    public static final String SELECT_SUBTITLE_WHEN_NO_AUDIO_IN_DEVICE_LANGUAGE = "select_subtitle_when_no_audio_in_device_language";
    public static final String SHARED_NAME = "youtube";
    public static final String SHOW_DISTRIBUTOR_TOOLTIP_TAG = "show_distributor_tool_tip_";
    public static final String SHOW_EDU_TOOLTIP_TAG = "show_educational_tool_tip_";
    public static final String SHOW_FAMILY_SHARING_CONFIRMATION_DIALOG_FOR_SHOWS = "show_family_sharing_confirmation_dialog_for_shows";

    @krg
    public static final String SHOW_SETTING_OPTION_DOWNLOAD_ON_5G = "show_download_on_5g_settings_option";
    public static final String SPINNER_START_PREFERENCE_KEY = "guide_spinner_timestamp";
    public static final String STALENESS_TIME = "staleness_time";
    public static final String SURROUND_SOUND_CATEGORY = "surround_sound_category";

    @krg
    public static final String TV_INPUT_LAST_WATCHED_MOVIE_ID = "last_watched_movie_id";

    @krg
    public static final String TV_INPUT_LAST_WATCHED_MOVIE_TIMESTAMP = "last_watched_movie_timestamp";
    public static final String TV_INPUT_NAME = "tv_input";

    @krg
    public static final String UPDATE_WORKER_LAST_RUN_VERSION_CODE = "update_worker_last_run_version_code";

    @krg
    public static final String USER_ACCOUNT = "user_account";
    public static final String USER_SENTIMENTS_UPDATE_TOKEN = "user_sentiments_update_token";
    public static final String VERSION = "version";
    public static final String VIRTUAL_REMOTE_CATEGORY = "virtual_remote_category";

    @krg
    public static final String WARNING_STREAMING_BANDWIDTH = "warning_streaming_bandwidth";

    @krg
    public static final String WATCHED_MOVIE_IDS = "watched_movie_ids";

    @krg
    public static final String WATCHLIST_CONTENT_AVAILABLE_PREFIX = "watchlist_content_available_";

    @krg
    public static final String WATCHLIST_CONTENT_AVAILABLE_SHOWN = "watchlist_content_available_shown";

    @krg
    public static final String WATCHLIST_CONTENT_AVAILABLE_TIMESTAMP_PREFIX = "timestamp_watchlist_content_available_";

    @krg
    public static final String WATCHLIST_FREE_CONTENT_PREFIX = "watchlist_free_content_";

    @krg
    public static final String WATCHLIST_FREE_CONTENT_SHOWN = "watchlist_free_content_shown";

    @krg
    public static final String WATCHLIST_FREE_CONTENT_TIMESTAMP_PREFIX = "timestamp_watchlist_free_content_";

    @krg
    public static final String WATCHLIST_PRICE_DROP_PREFIX = "watchlist_price_drop_";

    @krg
    public static final String WATCHLIST_PRICE_DROP_SHOWN = "watchlist_price_drop_shown";

    @krg
    public static final String WATCHLIST_PRICE_DROP_TIMESTAMP_PREFIX = "timestamp_watchlist_price_drop_";
    public static final String WATCH_NEXT_SYNC_TIMESTAMP_PREFIX = "watch_next_sync_timestamp_prefix_";

    @krg
    public static final String WATCH_REMINDERS_PREFIX = "watch_reminders_";

    @krg
    public static final String WATCH_REMINDERS_SHOWN = "watch_reminders_shown";

    @krg
    public static final String WATCH_REMINDERS_TIMESTAMP_PREFIX = "timestamp_watch_reminders_";

    @krg
    public static final String WELCOME_CARD_DISMISSED = "_promo_dismissed_";
    private static Set<String> keyPartsToBackup;

    private krh() {
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x005e A[PHI: r2
  0x005e: PHI (r2v3 int) = (r2v2 int), (r2v8 int), (r2v12 int), (r2v13 int) binds: [B:10:0x001b, B:19:0x0038, B:28:0x0051, B:31:0x0056] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0061 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A(defpackage.kzo r5, defpackage.kzo r6, boolean r7) {
        /*
            r0 = 0
            r1 = 1
            if (r5 != 0) goto L8
            if (r6 != 0) goto L7
            return r1
        L7:
            return r0
        L8:
            if (r6 != 0) goto Lb
            return r0
        Lb:
            com.google.common.collect.Ordering r2 = com.google.common.collect.Ordering.natural()
            com.google.common.collect.Ordering r2 = r2.nullsLast()
            java.lang.String r3 = r5.c
            java.lang.String r4 = r6.c
            int r2 = r2.compare(r3, r4)
            if (r2 == 0) goto L1e
            goto L5e
        L1e:
            int r2 = r5.f
            int r2 = defpackage.a.bm(r2)
            if (r2 != 0) goto L27
            r2 = r1
        L27:
            int r3 = r6.f
            int r3 = defpackage.a.bm(r3)
            if (r3 != 0) goto L30
            r3 = r1
        L30:
            int r2 = r2 + (-1)
            int r3 = r3 + (-1)
            int r2 = java.lang.Integer.compare(r2, r3)
            if (r2 == 0) goto L3b
            goto L5e
        L3b:
            int r2 = r5.d
            int r2 = defpackage.a.aR(r2)
            if (r2 != 0) goto L44
            r2 = r1
        L44:
            int r3 = r6.d
            int r3 = defpackage.a.aR(r3)
            if (r3 != 0) goto L4d
            r3 = r1
        L4d:
            int r2 = java.lang.Integer.compare(r2, r3)
            if (r2 == 0) goto L54
            goto L5e
        L54:
            if (r7 != 0) goto L62
            boolean r5 = r5.e
            boolean r6 = r6.e
            int r2 = java.lang.Boolean.compare(r5, r6)
        L5e:
            if (r2 != 0) goto L61
            goto L62
        L61:
            return r0
        L62:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.krh.A(kzo, kzo, boolean):boolean");
    }

    private static String B(byte[] bArr) {
        Formatter formatter = new Formatter();
        try {
            for (byte b : bArr) {
                formatter.format("%02X", Byte.valueOf(b));
            }
            String string = formatter.toString();
            formatter.close();
            return string;
        } catch (Throwable th) {
            try {
                formatter.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private static byte[] C(InputStream inputStream, String str) throws NoSuchAlgorithmException, IOException {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        byte[] bArr = new byte[RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT];
        while (true) {
            int i = inputStream.read(bArr);
            if (i < 0) {
                return messageDigest.digest();
            }
            messageDigest.update(bArr, 0, i);
        }
    }

    public static idy a(Looper looper, idy idyVar) {
        return new jbj(new Handler(looper, new etv(idyVar, 4)), 5);
    }

    public static idy b(idy idyVar) {
        return a(Looper.getMainLooper(), idyVar);
    }

    public static String c(Signature signature) {
        try {
            return d(new ByteArrayInputStream(signature.toByteArray()));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static String d(InputStream inputStream) {
        try {
            return B(C(inputStream, "sha1"));
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    public static String e(String str) {
        if (str == null) {
            return null;
        }
        try {
            return d(new ByteArrayInputStream(str.getBytes()));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static String f(String str) {
        try {
            return B(C(new ByteArrayInputStream(str.getBytes(ksg.a)), "sha256"));
        } catch (IOException | NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    public static ArrayList g(Object obj) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(obj);
        return arrayList;
    }

    private static synchronized Set<String> getGetKeyPartsToBackup() {
        if (keyPartsToBackup == null) {
            keyPartsToBackup = new HashSet();
            for (Field field : krh.class.getDeclaredFields()) {
                if (field.isAnnotationPresent(krg.class)) {
                    try {
                        keyPartsToBackup.add((String) field.get(null));
                    } catch (IllegalAccessException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
        return keyPartsToBackup;
    }

    public static List h(Collection collection) {
        return collection.isEmpty() ? Collections.EMPTY_LIST : DesugarCollections.unmodifiableList(new ArrayList(collection));
    }

    @SafeVarargs
    public static List i(Object... objArr) {
        return DesugarCollections.unmodifiableList(Arrays.asList(objArr));
    }

    public static boolean isBingeWatchingEnabledInPreferences(SharedPreferences sharedPreferences) {
        return sharedPreferences.getBoolean(ENABLE_BINGE_WATCHING, true);
    }

    public static boolean isEligibleForBackup(String str) {
        Set<String> getKeyPartsToBackup = getGetKeyPartsToBackup();
        if (getKeyPartsToBackup.contains(str) || str.contains(WELCOME_CARD_DISMISSED)) {
            return true;
        }
        for (String str2 : getKeyPartsToBackup) {
            if (str.startsWith(str2) || str.endsWith(str2)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isInfoCardsEnabledInPreferences(SharedPreferences sharedPreferences) {
        return sharedPreferences.getBoolean(ENABLE_INFO_CARDS, true);
    }

    public static boolean isVirtualRemoteFabEnabledInPreferences(SharedPreferences sharedPreferences) {
        return sharedPreferences.getBoolean(ENABLE_VIRTUAL_REMOTE_FAB, true);
    }

    @SafeVarargs
    public static List j(Collection... collectionArr) {
        int size = 0;
        for (int i = 0; i < 2; i++) {
            size += collectionArr[i].size();
        }
        ArrayList arrayList = new ArrayList(size);
        for (int i2 = 0; i2 < 2; i2++) {
            arrayList.addAll(collectionArr[i2]);
        }
        return arrayList;
    }

    public static final ImmutableList k(Parcel parcel) {
        ArrayList arrayList = new ArrayList();
        parcel.readStringList(arrayList);
        return ImmutableList.copyOf((Collection) arrayList);
    }

    public static final ieg l(Parcel parcel) {
        return ktw.g(parcel, kvo.class);
    }

    public static final ieg m(Parcel parcel) {
        return parcel.readByte() == 1 ? ieg.f(Integer.valueOf(parcel.readInt())) : ieg.a;
    }

    public static final void n(ieg iegVar, Parcel parcel) {
        boolean zM = iegVar.m();
        parcel.writeByte(zM ? (byte) 1 : (byte) 0);
        if (zM) {
            parcel.writeInt(((Integer) iegVar.g()).intValue());
        }
    }

    public static final ieg o(Parcel parcel) {
        return ktw.g(parcel, kul.class);
    }

    public static String p(String str) {
        return String.valueOf(str).concat(" gzip");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ieg q(lwk lwkVar, qza qzaVar, idf idfVar, idf idfVar2, idf idfVar3, int i) {
        tju tjuVarE;
        tju tjuVarE2;
        tju tjuVar;
        String str;
        ieg iegVar = (ieg) idfVar.b(qzaVar);
        if (!iegVar.m()) {
            iegVar.p();
            return iegVar;
        }
        lxb lxbVar = (lxb) iegVar.g();
        int i2 = qzaVar.a;
        a.ah(lxbVar.f, "Source not yet parsed");
        ieg iegVar2 = (ieg) idfVar2.b(new sro(i2, lxbVar.h, lwkVar.c, lwkVar.d, lwkVar.b));
        if (iegVar2.k()) {
            krd.d("Error requesting asset resources for knowledge request ".concat(String.valueOf(String.valueOf(lwkVar))), iegVar2.i());
        }
        Map map = (Map) iegVar2.h(Collections.EMPTY_MAP);
        a.ah(lxbVar.f, "Source not yet parsed");
        int i3 = 1;
        a.ah(lxbVar.g == null, "Source did not succeed parsing");
        toz tozVar = lxbVar.d.d;
        if (tozVar == null) {
            tozVar = toz.a;
        }
        TreeMap treeMap = new TreeMap();
        vun vunVar = tozVar.h;
        Set<Integer> set = lxbVar.i;
        int size = vunVar.size();
        lwp[] lwpVarArr = new lwp[size];
        for (Integer num : set) {
            toz tozVar2 = (toz) vunVar.get(num.intValue());
            String str2 = tozVar2.b;
            xax xaxVar = TextUtils.isEmpty(str2) ? null : (xax) map.get(str2);
            if (xaxVar == null || (xaxVar.b & i3) == 0) {
                str = null;
            } else {
                xaz xazVar = xaxVar.c;
                if (xazVar == null) {
                    xazVar = xaz.a;
                }
                str = xazVar.c;
            }
            if (tozVar2.i) {
                Objects.toString(num);
                lwpVarArr[num.intValue()] = new lwv(tozVar2.c, tozVar2.d, tozVar2.j, lxbVar.f(xaxVar, 1, i, 1.0f, "poster.".concat(String.valueOf(num)), treeMap), str);
            } else {
                Objects.toString(num);
                lwpVarArr[num.intValue()] = new lwr(tozVar2.c, tozVar2.d, tozVar2.e, lxbVar.f(xaxVar, 3, i, 0.6939625f, "poster.".concat(String.valueOf(num)), treeMap), str);
            }
            i3 = 1;
        }
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        ArrayList arrayList = new ArrayList();
        Iterator it = tozVar.f.iterator();
        while (it.hasNext()) {
            tpb tpbVar = (tpb) it.next();
            int i4 = tpbVar.j;
            if ((tpbVar.b & 16) != 0) {
                tpa tpaVar = tpbVar.e;
                if (tpaVar == null) {
                    tpaVar = tpa.a;
                }
                tjuVarE2 = lxbVar.e(tpaVar, a.cf(i4, "actor."), treeMap);
            } else {
                tjuVarE2 = null;
            }
            if (tjuVarE2 != null) {
                hashSet.add(tjuVarE2);
            }
            int[] iArrC = lxbVar.c(tpbVar.m);
            List list = lxbVar.b;
            list.clear();
            Iterator it2 = tpbVar.f.iterator();
            while (it2.hasNext()) {
                toy toyVar = (toy) it2.next();
                Iterator it3 = it2;
                if (!toyVar.b.isEmpty()) {
                    list.add(toyVar.b);
                }
                it2 = it3;
            }
            List list2 = lxbVar.c;
            list2.clear();
            int size2 = tpbVar.l.size();
            Iterator it4 = it;
            int i5 = 0;
            while (i5 < size2) {
                int i6 = size2;
                int iE = tpbVar.l.e(i5);
                if (iE >= 0 && iE < size) {
                    list2.add(lwpVarArr[iE]);
                    if (i5 < 5 && (tjuVar = lwpVarArr[iE].d) != null) {
                        hashSet2.add(tjuVar);
                    }
                }
                i5++;
                size2 = i6;
            }
            arrayList.add(new lws(i4, tpbVar.k, tpbVar.d, tjuVarE2, iArrC, list, tpbVar.g, tpbVar.h, tpbVar.i, list2, tpbVar.c));
            list.clear();
            list2.clear();
            it = it4;
        }
        for (tpd tpdVar : tozVar.g) {
            int i7 = tpdVar.f;
            if ((tpdVar.b & 64) != 0) {
                tpa tpaVar2 = tpdVar.g;
                if (tpaVar2 == null) {
                    tpaVar2 = tpa.a;
                }
                tjuVarE = lxbVar.e(tpaVar2, a.cf(i7, "song."), treeMap);
            } else {
                tjuVarE = null;
            }
            if (tjuVarE != null) {
                hashSet.add(tjuVarE);
            }
            arrayList.add(new lwt(i7, tpdVar.c, tjuVarE, !tpdVar.h.v() ? lxbVar.c(tpdVar.h) : null, tpdVar.d, tpdVar.e));
        }
        vsz vszVar = lxbVar.a;
        int iD = vszVar.d();
        int size3 = lxbVar.d.e.size();
        ArrayList arrayList2 = new ArrayList(size3);
        tpe tpeVar = (tpe) lxbVar.d.e.get(0);
        int iA = lxbVar.a(tpeVar.b);
        int i8 = tpeVar.c;
        int i9 = 1;
        while (i9 < size3) {
            tpe tpeVar2 = (tpe) lxbVar.d.e.get(i9);
            int iA2 = lxbVar.a(tpeVar2.b);
            int i10 = tpeVar2.c;
            arrayList2.add(new lwh(iA, iA2, i8, i10 - i8));
            i9++;
            i8 = i10;
            iA = iA2;
        }
        arrayList2.add(new lwh(iA, ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED, i8, iD - i8));
        lwx lwxVar = new lwx(vszVar, lxbVar.e, arrayList, hashSet, hashSet2, arrayList2);
        Iterator it5 = lwxVar.c.iterator();
        while (it5.hasNext()) {
            ieg iegVar3 = (ieg) idfVar3.b((tju) it5.next());
            if (iegVar3.m()) {
                ((rin) iegVar3.g()).b();
            } else {
                krd.d("Error requesting knowledge bundle image ", iegVar3.i());
            }
        }
        Iterator it6 = lwxVar.d.iterator();
        while (it6.hasNext()) {
            ieg iegVar4 = (ieg) idfVar3.b((tju) it6.next());
            if (iegVar4.m()) {
                ((rin) iegVar4.g()).b();
            } else {
                krd.d("Error requesting knowledge bundle image ", iegVar4.i());
            }
        }
        return ieg.f(lwxVar);
    }

    public static int r(Context context) {
        return context.getResources().getDimensionPixelSize(R.dimen.knowledge_card_desired_image_size);
    }

    public static idf s(ldv ldvVar, idf idfVar) {
        idh idhVarD = idh.d();
        idhVarD.e(new lzl(ldvVar, new kzj(17), idfVar));
        return idhVarD.b(new jxt(new kzj(18), 8));
    }

    public static void setBingeWatchingEnabledInPreferences(SharedPreferences sharedPreferences, boolean z) {
        sharedPreferences.edit().putBoolean(ENABLE_BINGE_WATCHING, z).apply();
    }

    public static void setInfoCardsEnabledInPreferences(SharedPreferences sharedPreferences, boolean z) {
        sharedPreferences.edit().putBoolean(ENABLE_INFO_CARDS, true).apply();
    }

    public static void setVirtualRemoteFabEnabledInPreferences(SharedPreferences sharedPreferences, boolean z) {
        Log.e("pref", "setVirtualRemoteFabEnabledInPreferences=" + z);
        sharedPreferences.edit().putBoolean(ENABLE_VIRTUAL_REMOTE_FAB, z).apply();
    }

    public static idf t(idf idfVar, lfx lfxVar, ldv ldvVar) {
        idh idhVarD = idh.d();
        idhVarD.e(idfVar);
        idf idfVarB = idhVarD.b(new ltu(9));
        idh idhVarD2 = idh.d();
        idhVarD2.e(new lqs(idfVarB, lfxVar.a(ldvVar.a()).c, 5));
        return idhVarD2.b(new ltu(10));
    }

    public static List u(List list, kwx kwxVar) {
        ImmutableList.Builder builder = ImmutableList.builder();
        builder.add((ImmutableList.Builder) kwxVar);
        for (int i = 0; i < list.size(); i++) {
            kwx kwxVar2 = (kwx) list.get(i);
            if (!kwxVar2.isForced()) {
                builder.add((ImmutableList.Builder) kwxVar2);
            }
        }
        return builder.build();
    }

    public static String v(kwx kwxVar, Resources resources) {
        if (kwxVar.isDisableTrack()) {
            return kwxVar.trackName();
        }
        String strD = ksg.d(kwxVar.languageCode());
        if (!TextUtils.isEmpty(kwxVar.trackName()) && !kwxVar.trackName().equalsIgnoreCase(strD)) {
            strD = kwxVar.trackName();
        }
        return kwxVar.isClosedCaption() ? resources.getString(R.string.caption_language, strD) : strD;
    }

    public static String x(Resources resources, kzo kzoVar) {
        String strC = ksg.c(kzoVar.c);
        int iBm = a.bm(kzoVar.f);
        if (iBm == 0) {
            iBm = 1;
        }
        String string = iBm + (-1) != 1 ? "" : resources.getString(R.string.original_track);
        int iAR = a.aR(kzoVar.d);
        int i = iAR != 0 ? iAR : 1;
        return jwq.D(resources, ImmutableList.of(strC, string, i != 2 ? i != 3 ? i != 4 ? "" : resources.getString(R.string.narration_track) : resources.getString(R.string.descriptive_track) : resources.getString(R.string.commentary_track), kzoVar.e ? resources.getString(R.string.audio_51_track) : ""));
    }

    public static String y(Resources resources, kzp kzpVar) {
        return kzpVar.ordinal() != 1 ? "" : resources.getString(R.string.original_track);
    }

    public static String z(Resources resources, kzq kzqVar) {
        int iOrdinal = kzqVar.ordinal();
        return iOrdinal != 2 ? iOrdinal != 3 ? iOrdinal != 4 ? "" : resources.getString(R.string.narration_track) : resources.getString(R.string.descriptive_track) : resources.getString(R.string.commentary_track);
    }

    public krh(byte[] bArr) {
    }
}
