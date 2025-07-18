package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.ConditionalUserPropertyParcel;
import com.google.android.gms.measurement.internal.TriggerUriParcel;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
class kug extends lht {
    public static final String[] a = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};
    static final String[] b = {"associated_row_id", "ALTER TABLE upload_queue ADD COLUMN associated_row_id INTEGER;", "last_upload_timestamp", "ALTER TABLE upload_queue ADD COLUMN last_upload_timestamp INTEGER;"};
    public static final String[] c = {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};
    public static final String[] d = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;", "config_last_modified_time", "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;", "e_tag", "ALTER TABLE apps ADD COLUMN e_tag TEXT;", "session_stitching_token", "ALTER TABLE apps ADD COLUMN session_stitching_token TEXT;", "sgtm_upload_enabled", "ALTER TABLE apps ADD COLUMN sgtm_upload_enabled INTEGER;", "target_os_version", "ALTER TABLE apps ADD COLUMN target_os_version INTEGER;", "session_stitching_token_hash", "ALTER TABLE apps ADD COLUMN session_stitching_token_hash INTEGER;", "ad_services_version", "ALTER TABLE apps ADD COLUMN ad_services_version INTEGER;", "unmatched_first_open_without_ad_id", "ALTER TABLE apps ADD COLUMN unmatched_first_open_without_ad_id INTEGER;", "npa_metadata_value", "ALTER TABLE apps ADD COLUMN npa_metadata_value INTEGER;", "attribution_eligibility_status", "ALTER TABLE apps ADD COLUMN attribution_eligibility_status INTEGER;", "sgtm_preview_key", "ALTER TABLE apps ADD COLUMN sgtm_preview_key TEXT;", "dma_consent_state", "ALTER TABLE apps ADD COLUMN dma_consent_state INTEGER;", "daily_realtime_dcu_count", "ALTER TABLE apps ADD COLUMN daily_realtime_dcu_count INTEGER;", "bundle_delivery_index", "ALTER TABLE apps ADD COLUMN bundle_delivery_index INTEGER;", "serialized_npa_metadata", "ALTER TABLE apps ADD COLUMN serialized_npa_metadata TEXT;", "unmatched_pfo", "ALTER TABLE apps ADD COLUMN unmatched_pfo INTEGER;", "unmatched_uwa", "ALTER TABLE apps ADD COLUMN unmatched_uwa INTEGER;", "ad_campaign_info", "ALTER TABLE apps ADD COLUMN ad_campaign_info BLOB;", "daily_registered_triggers_count", "ALTER TABLE apps ADD COLUMN daily_registered_triggers_count INTEGER;", "client_upload_eligibility", "ALTER TABLE apps ADD COLUMN client_upload_eligibility INTEGER;", "gmp_version_for_remote_config", "ALTER TABLE apps ADD COLUMN gmp_version_for_remote_config INTEGER;"};
    public static final String[] e = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};
    public static final String[] f = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};
    public static final String[] g = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};
    public static final String[] h = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};
    public static final String[] i = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};
    public static final String[] j = {"consent_source", "ALTER TABLE consent_settings ADD COLUMN consent_source INTEGER;", "dma_consent_settings", "ALTER TABLE consent_settings ADD COLUMN dma_consent_settings TEXT;", "storage_consent_at_bundling", "ALTER TABLE consent_settings ADD COLUMN storage_consent_at_bundling TEXT;"};
    public static final String[] k = {"idempotent", "CREATE INDEX IF NOT EXISTS trigger_uris_index ON trigger_uris (app_id);"};
    public final lhl l;
    private final kuf n;

    public kug(lih lihVar) {
        super(lihVar);
        lbk lbkVar = this.y;
        klk klkVar = lbkVar.B;
        this.l = new lhl();
        ktx ktxVar = lbkVar.d;
        this.n = new kuf(this, lbkVar.a);
    }

    private final String aj() {
        lbk lbkVar = this.y;
        klk klkVar = lbkVar.B;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Locale locale = Locale.US;
        Integer numValueOf = Integer.valueOf(lex.GOOGLE_SIGNAL.g);
        Long lValueOf = Long.valueOf(jCurrentTimeMillis);
        Long l = (Long) kzg.S.a(null);
        l.longValue();
        return "(" + String.format(locale, "(upload_type = %d AND ABS(creation_timestamp - %d) > %d)", numValueOf, lValueOf, l) + " OR " + String.format(Locale.US, "(upload_type != %d AND ABS(creation_timestamp - %d) > %d)", numValueOf, lValueOf, Long.valueOf(lbkVar.d.l())) + ")";
    }

    private final String ak(List list) {
        return list.isEmpty() ? "" : String.format(" AND (upload_type IN (%s))", TextUtils.join(", ", list));
    }

    private final void al(String str, String str2) {
        kkk.h(str2);
        g();
        ag();
        try {
            e().delete(str, "app_id=?", new String[]{str2});
        } catch (SQLiteException e2) {
            lbk lbkVar = this.y;
            lab labVar = lbkVar.f;
            lbkVar.o(labVar);
            labVar.c.c("Error deleting snapshot. appId", lab.b(str2), e2);
        }
    }

    public final void A(long j2) {
        g();
        ag();
        try {
            if (e().delete("queue", "rowid=?", new String[]{String.valueOf(j2)}) == 1) {
            } else {
                throw new SQLiteException("Deleted fewer rows from queue than expected");
            }
        } catch (SQLiteException e2) {
            lbk lbkVar = this.y;
            lab labVar = lbkVar.f;
            lbkVar.o(labVar);
            labVar.c.b("Failed to delete a bundle in a queue table", e2);
            throw e2;
        }
    }

    public final void B(List list) {
        kkk.k(list);
        g();
        ag();
        StringBuilder sb = new StringBuilder("rowid in (");
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (i2 != 0) {
                sb.append(",");
            }
            sb.append(((Long) list.get(i2)).longValue());
        }
        sb.append(")");
        int iDelete = e().delete("raw_events", sb.toString(), null);
        if (iDelete != list.size()) {
            lbk lbkVar = this.y;
            lab labVar = lbkVar.f;
            lbkVar.o(labVar);
            labVar.c.c("Deleted fewer rows from raw events table than expected", Integer.valueOf(iDelete), Integer.valueOf(list.size()));
        }
    }

    public final void C(String str) throws SQLException {
        try {
            e().execSQL("delete from raw_events_metadata where app_id=? and metadata_fingerprint not in (select distinct metadata_fingerprint from raw_events where app_id=?)", new String[]{str, str});
        } catch (SQLiteException e2) {
            lbk lbkVar = this.y;
            lab labVar = lbkVar.f;
            lbkVar.o(labVar);
            labVar.c.c("Failed to remove unused event metadata. appId", lab.b(str), e2);
        }
    }

    public final void D(Long l) {
        g();
        ag();
        try {
            if (e().delete("upload_queue", "rowid=?", new String[]{l.toString()}) != 1) {
                lbk lbkVar = this.y;
                lab labVar = lbkVar.f;
                lbkVar.o(labVar);
                labVar.f.a("Deleted fewer rows from upload_queue than expected");
            }
        } catch (SQLiteException e2) {
            lbk lbkVar2 = this.y;
            lab labVar2 = lbkVar2.f;
            lbkVar2.o(labVar2);
            labVar2.c.b("Failed to delete a MeasurementBatch in a upload_queue table", e2);
            throw e2;
        }
    }

    public final void E() {
        ag();
        e().endTransaction();
    }

    final void F(Long l) throws SQLException {
        g();
        ag();
        if (P()) {
            if (c(a.c(l, "SELECT COUNT(1) FROM upload_queue WHERE rowid = ", " AND retry_count =  2147483647 LIMIT 1"), null) > 0) {
                lbk lbkVar = this.y;
                lab labVar = lbkVar.f;
                lbkVar.o(labVar);
                labVar.f.a("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                SQLiteDatabase sQLiteDatabaseE = e();
                klk klkVar = this.y.B;
                sQLiteDatabaseE.execSQL("UPDATE upload_queue" + a.l(System.currentTimeMillis(), " SET retry_count = retry_count + 1, last_upload_timestamp = ") + " WHERE rowid = " + l + " AND retry_count < 2147483647");
            } catch (SQLiteException e2) {
                lbk lbkVar2 = this.y;
                lab labVar2 = lbkVar2.f;
                lbkVar2.o(labVar2);
                labVar2.c.b("Error incrementing retry count. error", e2);
            }
        }
    }

    final void G() {
        int iDelete;
        g();
        ag();
        if (P()) {
            lih lihVar = this.m;
            lal lalVar = lihVar.i.a;
            lalVar.a();
            long j2 = lalVar.a;
            lbk lbkVar = this.y;
            klk klkVar = lbkVar.B;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long jAbs = Math.abs(jElapsedRealtime - j2);
            ktx ktxVar = lbkVar.d;
            if (jAbs > ktxVar.n()) {
                lihVar.i.a.b(jElapsedRealtime);
                g();
                ag();
                if (!P() || (iDelete = e().delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(System.currentTimeMillis()), String.valueOf(ktxVar.l())})) <= 0) {
                    return;
                }
                lab labVar = lbkVar.f;
                lbkVar.o(labVar);
                labVar.k.b("Deleted stale rows. rowsDeleted", Integer.valueOf(iDelete));
            }
        }
    }

    public final void H(String str, String str2) {
        kkk.h(str);
        kkk.h(str2);
        g();
        ag();
        try {
            e().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e2) {
            lbk lbkVar = this.y;
            lab labVar = lbkVar.f;
            lbkVar.o(labVar);
            labVar.c.d("Error deleting user property. appId", lab.b(str), lbkVar.j.e(str2), e2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void I(java.lang.String r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 224
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kug.I(java.lang.String):void");
    }

    public final void J() {
        ag();
        e().setTransactionSuccessful();
    }

    public final void K(String str, kun kunVar) {
        kkk.k(kunVar);
        g();
        ag();
        ContentValues contentValues = new ContentValues();
        String str2 = kunVar.a;
        contentValues.put("app_id", str2);
        contentValues.put("name", kunVar.b);
        contentValues.put("lifetime_count", Long.valueOf(kunVar.c));
        contentValues.put("current_bundle_count", Long.valueOf(kunVar.d));
        contentValues.put("last_fire_timestamp", Long.valueOf(kunVar.f));
        contentValues.put("last_bundled_timestamp", Long.valueOf(kunVar.g));
        contentValues.put("last_bundled_day", kunVar.h);
        contentValues.put("last_sampled_complex_event_id", kunVar.i);
        contentValues.put("last_sampling_rate", kunVar.j);
        contentValues.put("current_session_count", Long.valueOf(kunVar.e));
        Boolean bool = kunVar.k;
        contentValues.put("last_exempt_from_sampling", (bool == null || !bool.booleanValue()) ? null : 1L);
        try {
            if (e().insertWithOnConflict(str, null, contentValues, 5) == -1) {
                lbk lbkVar = this.y;
                lab labVar = lbkVar.f;
                lbkVar.o(labVar);
                labVar.c.b("Failed to insert/update event aggregates (got -1). appId", lab.b(str2));
            }
        } catch (SQLiteException e2) {
            lbk lbkVar2 = this.y;
            lab labVar2 = lbkVar2.f;
            lbkVar2.o(labVar2);
            labVar2.c.c("Error storing event aggregates. appId", lab.b(kunVar.a), e2);
        }
    }

    public final void L(String str, lct lctVar) {
        kkk.k(str);
        g();
        ag();
        M(str, m(str));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("storage_consent_at_bundling", lctVar.m());
        ab(contentValues);
    }

    public final void M(String str, lct lctVar) {
        kkk.k(str);
        kkk.k(lctVar);
        g();
        ag();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("consent_state", lctVar.m());
        contentValues.put("consent_source", Integer.valueOf(lctVar.c));
        ab(contentValues);
    }

    public final boolean N(String str) {
        lex[] lexVarArr = {lex.GOOGLE_SIGNAL};
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(Integer.valueOf(lexVarArr[0].g));
        String strAk = ak(arrayList);
        String strAj = aj();
        StringBuilder sb = new StringBuilder("SELECT COUNT(1) > 0 FROM upload_queue WHERE app_id=?");
        sb.append(strAk);
        sb.append(" AND NOT ");
        sb.append(strAj);
        return c(sb.toString(), new String[]{str}) != 0;
    }

    public final boolean O(String str, String str2) {
        return c("select count(1) from raw_events where app_id = ? and name = ?", new String[]{str, str2}) > 0;
    }

    protected final boolean P() {
        lbk lbkVar = this.y;
        ktx ktxVar = lbkVar.d;
        return lbkVar.a.getDatabasePath("google_app_measurement.db").exists();
    }

    public final boolean Q(ConditionalUserPropertyParcel conditionalUserPropertyParcel) {
        g();
        ag();
        String str = conditionalUserPropertyParcel.a;
        kkk.k(str);
        if (o(str, conditionalUserPropertyParcel.c.b) == null) {
            long jC = c("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{str});
            ktx ktxVar = this.y.d;
            if (jC >= 1000) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("origin", conditionalUserPropertyParcel.b);
        contentValues.put("name", conditionalUserPropertyParcel.c.b);
        Object objA = conditionalUserPropertyParcel.c.a();
        kkk.k(objA);
        Y(contentValues, objA);
        contentValues.put("active", Boolean.valueOf(conditionalUserPropertyParcel.e));
        contentValues.put("trigger_event_name", conditionalUserPropertyParcel.f);
        contentValues.put("trigger_timeout", Long.valueOf(conditionalUserPropertyParcel.h));
        lbk lbkVar = this.y;
        lio lioVar = lbkVar.i;
        lbkVar.m(lioVar);
        contentValues.put("timed_out_event", lioVar.aq(conditionalUserPropertyParcel.g));
        contentValues.put("creation_timestamp", Long.valueOf(conditionalUserPropertyParcel.d));
        lbkVar.m(lioVar);
        contentValues.put("triggered_event", lioVar.aq(conditionalUserPropertyParcel.i));
        contentValues.put("triggered_timestamp", Long.valueOf(conditionalUserPropertyParcel.c.c));
        contentValues.put("time_to_live", Long.valueOf(conditionalUserPropertyParcel.j));
        lbkVar.m(lioVar);
        contentValues.put("expired_event", lioVar.aq(conditionalUserPropertyParcel.k));
        try {
            if (e().insertWithOnConflict("conditional_properties", null, contentValues, 5) != -1) {
                return true;
            }
            lab labVar = lbkVar.f;
            lbkVar.o(labVar);
            labVar.c.b("Failed to insert/update conditional user property (got -1)", lab.b(str));
            return true;
        } catch (SQLiteException e2) {
            lbk lbkVar2 = this.y;
            lab labVar2 = lbkVar2.f;
            lbkVar2.o(labVar2);
            labVar2.c.c("Error storing conditional user property", lab.b(str), e2);
            return true;
        }
    }

    public final boolean R(lim limVar) {
        g();
        ag();
        String str = limVar.a;
        String str2 = limVar.c;
        if (o(str, str2) == null) {
            if (lio.an(str2)) {
                long jC = c("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{str});
                lbk lbkVar = this.y;
                if (jC >= lbkVar.d.i(str, kzg.V, 25, 100)) {
                    return false;
                }
            } else if (!"_npa".equals(str2)) {
                long jC2 = c("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{str, limVar.b});
                ktx ktxVar = this.y.d;
                if (jC2 >= 25) {
                    return false;
                }
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("origin", limVar.b);
        contentValues.put("name", str2);
        contentValues.put("set_timestamp", Long.valueOf(limVar.d));
        Y(contentValues, limVar.e);
        try {
            if (e().insertWithOnConflict("user_attributes", null, contentValues, 5) != -1) {
                return true;
            }
            lbk lbkVar2 = this.y;
            lab labVar = lbkVar2.f;
            lbkVar2.o(labVar);
            labVar.c.b("Failed to insert/update user property (got -1). appId", lab.b(str));
            return true;
        } catch (SQLiteException e2) {
            lbk lbkVar3 = this.y;
            lab labVar2 = lbkVar3.f;
            lbkVar3.o(labVar2);
            labVar2.c.c("Error storing user property. appId", lab.b(limVar.a), e2);
            return true;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x025a A[Catch: SQLiteException -> 0x02c0, all -> 0x02f6, TryCatch #3 {SQLiteException -> 0x02c0, blocks: (B:61:0x0151, B:63:0x0157, B:64:0x0160, B:65:0x016d, B:67:0x017a, B:68:0x017d, B:70:0x0197, B:71:0x019a, B:73:0x01b2, B:74:0x01b9, B:76:0x01bd, B:77:0x01c4, B:79:0x01cc, B:82:0x01e2, B:85:0x01ec, B:96:0x0224, B:98:0x0234, B:100:0x023c, B:106:0x025a, B:113:0x02a4, B:103:0x024b, B:88:0x01fd, B:89:0x0206, B:90:0x0207, B:93:0x020e, B:95:0x021e, B:109:0x0287, B:110:0x0290, B:112:0x0292, B:116:0x02ac), top: B:164:0x0151 }] */
    /* JADX WARN: Removed duplicated region for block: B:154:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x00e0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:193:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00cc A[Catch: all -> 0x02e0, SQLiteException -> 0x02e3, TryCatch #0 {all -> 0x02e0, blocks: (B:41:0x00c6, B:43:0x00cc, B:44:0x00e0, B:45:0x00e4, B:46:0x00f7, B:48:0x00fd, B:49:0x010f, B:52:0x011b, B:54:0x0123, B:58:0x0135, B:60:0x014d, B:57:0x012d, B:124:0x02ca), top: B:159:0x00c6 }] */
    /* JADX WARN: Type inference failed for: r17v11 */
    /* JADX WARN: Type inference failed for: r17v6 */
    /* JADX WARN: Type inference failed for: r17v8 */
    /* JADX WARN: Type inference failed for: r17v9 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v3, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void S(java.lang.String r23, long r24, long r26, defpackage.lie r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 804
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kug.S(java.lang.String, long, long, lie):void");
    }

    public final kuc T(long j2, String str, boolean z, boolean z2, boolean z3, boolean z4) {
        return k(j2, str, 1L, false, false, z, false, z2, z3, z4);
    }

    public final void U(lle lleVar, boolean z) {
        int iA;
        g();
        ag();
        kkk.k(lleVar);
        kkk.h(lleVar.r);
        kkk.f((lleVar.b & 8) != 0);
        G();
        lbk lbkVar = this.y;
        klk klkVar = lbkVar.B;
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j2 = lleVar.i;
        ktx ktxVar = lbkVar.d;
        if (j2 < jCurrentTimeMillis - ktxVar.l() || lleVar.i > ktxVar.l() + jCurrentTimeMillis) {
            lab labVar = lbkVar.f;
            lbkVar.o(labVar);
            labVar.f.d("Storing bundle outside of the max uploading time span. appId, now, timestamp", lab.b(lleVar.r), Long.valueOf(jCurrentTimeMillis), Long.valueOf(lleVar.i));
        }
        try {
            int i2 = lleVar.memoizedSerializedSize;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                iA = abza.a.a(lleVar.getClass()).a(lleVar);
                if (iA < 0) {
                    throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                }
            } else {
                iA = i2 & Integer.MAX_VALUE;
                if (iA == Integer.MAX_VALUE) {
                    iA = abza.a.a(lleVar.getClass()).a(lleVar);
                    if (iA < 0) {
                        throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                    }
                    lleVar.memoizedSerializedSize = (Integer.MIN_VALUE & lleVar.memoizedSerializedSize) | iA;
                }
            }
            byte[] bArr = new byte[iA];
            boolean z2 = abvz.e;
            abvw abvwVar = new abvw(bArr, 0, iA);
            abza.a.a(lleVar.getClass()).m(lleVar, abwa.a(abvwVar));
            abvwVar.K();
            try {
                byte[] bArrI = af().I(bArr);
                lbk lbkVar2 = this.y;
                lab labVar2 = lbkVar2.f;
                lbkVar2.o(labVar2);
                labVar2.k.b("Saving bundle, size", Integer.valueOf(bArrI.length));
                ContentValues contentValues = new ContentValues();
                contentValues.put("app_id", lleVar.r);
                contentValues.put("bundle_end_timestamp", Long.valueOf(lleVar.i));
                contentValues.put("data", bArrI);
                contentValues.put("has_realtime", Integer.valueOf(z ? 1 : 0));
                if ((lleVar.c & 2) != 0) {
                    contentValues.put("retry_count", Integer.valueOf(lleVar.J));
                }
                try {
                    if (e().insert("queue", null, contentValues) == -1) {
                        lbkVar2.o(labVar2);
                        labVar2.c.b("Failed to insert bundle (got -1). appId", lab.b(lleVar.r));
                    }
                } catch (SQLiteException e2) {
                    lbk lbkVar3 = this.y;
                    lab labVar3 = lbkVar3.f;
                    lbkVar3.o(labVar3);
                    labVar3.c.c("Error storing bundle. appId", lab.b(lleVar.r), e2);
                }
            } catch (IOException e3) {
                lbk lbkVar4 = this.y;
                lab labVar4 = lbkVar4.f;
                lbkVar4.o(labVar4);
                labVar4.c.c("Data loss. Failed to serialize bundle. appId", lab.b(lleVar.r), e3);
            }
        } catch (IOException e4) {
            throw new RuntimeException(a.u(lleVar, " to a byte array threw an IOException (should never happen)."), e4);
        }
    }

    public final void V(String str, TriggerUriParcel triggerUriParcel) {
        g();
        ag();
        kkk.h(str);
        lbk lbkVar = this.y;
        klk klkVar = lbkVar.B;
        long jCurrentTimeMillis = System.currentTimeMillis();
        kzf kzfVar = kzg.av;
        long jLongValue = jCurrentTimeMillis - ((Long) kzfVar.a(null)).longValue();
        long j2 = triggerUriParcel.b;
        if (j2 < jLongValue || j2 > ((Long) kzfVar.a(null)).longValue() + jCurrentTimeMillis) {
            lab labVar = lbkVar.f;
            lbkVar.o(labVar);
            labVar.f.d("Storing trigger URI outside of the max retention time span. appId, now, timestamp", lab.b(str), Long.valueOf(jCurrentTimeMillis), Long.valueOf(j2));
        }
        lab labVar2 = lbkVar.f;
        lbkVar.o(labVar2);
        labVar2.k.a("Saving trigger URI");
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("trigger_uri", triggerUriParcel.a);
        contentValues.put("source", Integer.valueOf(triggerUriParcel.c));
        contentValues.put("timestamp_millis", Long.valueOf(j2));
        try {
            if (e().insert("trigger_uris", null, contentValues) == -1) {
                lbkVar.o(labVar2);
                labVar2.c.b("Failed to insert trigger URI (got -1). appId", lab.b(str));
            }
        } catch (SQLiteException e2) {
            lbk lbkVar2 = this.y;
            lab labVar3 = lbkVar2.f;
            lbkVar2.o(labVar3);
            labVar3.c.c("Error storing trigger URI. appId", lab.b(str), e2);
        }
    }

    public final void W(String str, String str2) {
        kkk.h(str);
        kkk.h(str2);
        g();
        ag();
        try {
            e().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e2) {
            lbk lbkVar = this.y;
            lab labVar = lbkVar.f;
            lbkVar.o(labVar);
            labVar.c.d("Error deleting conditional property", lab.b(str), lbkVar.j.e(str2), e2);
        }
    }

    public final void X(String str, Long l, long j2, lkw lkwVar) {
        int iA;
        g();
        ag();
        kkk.k(lkwVar);
        kkk.h(str);
        try {
            int i2 = lkwVar.memoizedSerializedSize;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                iA = abza.a.a(lkwVar.getClass()).a(lkwVar);
                if (iA < 0) {
                    throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                }
            } else {
                iA = i2 & Integer.MAX_VALUE;
                if (iA == Integer.MAX_VALUE) {
                    iA = abza.a.a(lkwVar.getClass()).a(lkwVar);
                    if (iA < 0) {
                        throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                    }
                    lkwVar.memoizedSerializedSize = (Integer.MIN_VALUE & lkwVar.memoizedSerializedSize) | iA;
                }
            }
            byte[] bArr = new byte[iA];
            boolean z = abvz.e;
            abvw abvwVar = new abvw(bArr, 0, iA);
            abza.a.a(lkwVar.getClass()).m(lkwVar, abwa.a(abvwVar));
            abvwVar.K();
            lbk lbkVar = this.y;
            lab labVar = lbkVar.f;
            lbkVar.o(labVar);
            labVar.k.c("Saving complex main event, appId, data size", lbkVar.j.c(str), Integer.valueOf(iA));
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", str);
            contentValues.put("event_id", l);
            contentValues.put("children_to_process", Long.valueOf(j2));
            contentValues.put("main_event", bArr);
            try {
                if (e().insertWithOnConflict("main_event_params", null, contentValues, 5) == -1) {
                    lbkVar.o(labVar);
                    labVar.c.b("Failed to insert complex main event (got -1). appId", lab.b(str));
                }
            } catch (SQLiteException e2) {
                lbk lbkVar2 = this.y;
                lab labVar2 = lbkVar2.f;
                lbkVar2.o(labVar2);
                labVar2.c.c("Error storing complex main event. appId", lab.b(str), e2);
            }
        } catch (IOException e3) {
            throw new RuntimeException(a.u(lkwVar, " to a byte array threw an IOException (should never happen)."), e3);
        }
    }

    final void Y(ContentValues contentValues, Object obj) {
        kkk.h("value");
        if (obj instanceof String) {
            contentValues.put("value", (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put("value", (Long) obj);
        } else {
            if (!(obj instanceof Double)) {
                throw new IllegalArgumentException("Invalid value type");
            }
            contentValues.put("value", (Double) obj);
        }
    }

    public final String Z(String str, String[] strArr) {
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = e().rawQuery(str, strArr);
                if (cursorRawQuery.moveToFirst()) {
                    return cursorRawQuery.getString(0);
                }
                if (cursorRawQuery == null) {
                    return "";
                }
                cursorRawQuery.close();
                return "";
            } catch (SQLiteException e2) {
                lbk lbkVar = this.y;
                lab labVar = lbkVar.f;
                lbkVar.o(labVar);
                labVar.c.c("Database error", str, e2);
                throw e2;
            }
        } finally {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
        }
    }

    public final long a(String str, llc llcVar, String str2, Map map, lex lexVar, Long l) {
        int iA;
        int iDelete;
        g();
        ag();
        kkk.k(llcVar);
        kkk.h(str);
        g();
        ag();
        if (P()) {
            lih lihVar = this.m;
            lal lalVar = lihVar.i.b;
            lalVar.a();
            long j2 = lalVar.a;
            lbk lbkVar = this.y;
            klk klkVar = lbkVar.B;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long jAbs = Math.abs(jElapsedRealtime - j2);
            ktx ktxVar = lbkVar.d;
            if (jAbs > ktxVar.n()) {
                lihVar.i.b.b(jElapsedRealtime);
                g();
                ag();
                if (P() && (iDelete = e().delete("upload_queue", aj(), new String[0])) > 0) {
                    lab labVar = lbkVar.f;
                    lbkVar.o(labVar);
                    labVar.k.b("Deleted stale MeasurementBatch rows from upload_queue. rowsDeleted", Integer.valueOf(iDelete));
                }
                kkk.h(str);
                g();
                ag();
                try {
                    int iH = ktxVar.h(str, kzg.A);
                    if (iH > 0) {
                        e().delete("upload_queue", "rowid in (SELECT rowid FROM upload_queue WHERE app_id=? ORDER BY rowid DESC LIMIT -1 OFFSET ?)", new String[]{str, String.valueOf(iH)});
                    }
                } catch (SQLiteException e2) {
                    lbk lbkVar2 = this.y;
                    lab labVar2 = lbkVar2.f;
                    lbkVar2.o(labVar2);
                    labVar2.c.c("Error deleting over the limit queued batches. appId", lab.b(str), e2);
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add(((String) entry.getKey()) + "=" + ((String) entry.getValue()));
        }
        try {
            int i2 = llcVar.memoizedSerializedSize;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                iA = abza.a.a(llcVar.getClass()).a(llcVar);
                if (iA < 0) {
                    throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                }
            } else {
                iA = i2 & Integer.MAX_VALUE;
                if (iA == Integer.MAX_VALUE) {
                    iA = abza.a.a(llcVar.getClass()).a(llcVar);
                    if (iA < 0) {
                        throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                    }
                    llcVar.memoizedSerializedSize = (Integer.MIN_VALUE & llcVar.memoizedSerializedSize) | iA;
                }
            }
            byte[] bArr = new byte[iA];
            boolean z = abvz.e;
            abvw abvwVar = new abvw(bArr, 0, iA);
            abza.a.a(llcVar.getClass()).m(llcVar, abwa.a(abvwVar));
            abvwVar.K();
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", str);
            contentValues.put("measurement_batch", bArr);
            contentValues.put("upload_uri", str2);
            StringBuilder sb = new StringBuilder();
            Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                while (true) {
                    sb.append((CharSequence) it.next());
                    if (!it.hasNext()) {
                        break;
                    }
                    sb.append((CharSequence) "\r\n");
                }
            }
            contentValues.put("upload_headers", sb.toString());
            contentValues.put("upload_type", Integer.valueOf(lexVar.g));
            lbk lbkVar3 = this.y;
            klk klkVar2 = lbkVar3.B;
            contentValues.put("creation_timestamp", Long.valueOf(System.currentTimeMillis()));
            contentValues.put("retry_count", (Integer) 0);
            if (l != null) {
                contentValues.put("associated_row_id", l);
            }
            try {
                long jInsert = e().insert("upload_queue", null, contentValues);
                if (jInsert != -1) {
                    return jInsert;
                }
                lab labVar3 = lbkVar3.f;
                lbkVar3.o(labVar3);
                labVar3.c.b("Failed to insert MeasurementBatch (got -1) to upload_queue. appId", str);
                return -1L;
            } catch (SQLiteException e3) {
                lbk lbkVar4 = this.y;
                lab labVar4 = lbkVar4.f;
                lbkVar4.o(labVar4);
                labVar4.c.c("Error storing MeasurementBatch to upload_queue. appId", str, e3);
                return -1L;
            }
        } catch (IOException e4) {
            throw new RuntimeException(a.u(llcVar, " to a byte array threw an IOException (should never happen)."), e4);
        }
    }

    public final void aa(ksx ksxVar, boolean z) {
        g();
        ag();
        String strT = ksxVar.t();
        kkk.k(strT);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", strT);
        if (z) {
            contentValues.put("app_instance_id", (String) null);
        } else if (this.m.n(strT).n(lcs.ANALYTICS_STORAGE)) {
            contentValues.put("app_instance_id", ksxVar.u());
        }
        contentValues.put("gmp_app_id", ksxVar.y());
        lih lihVar = this.m;
        if (lihVar.n(strT).n(lcs.AD_STORAGE)) {
            contentValues.put("resettable_device_id_hash", ksxVar.z());
        }
        contentValues.put("last_bundle_index", Long.valueOf(ksxVar.l()));
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(ksxVar.m()));
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(ksxVar.k()));
        contentValues.put("app_version", ksxVar.w());
        contentValues.put("app_store", ksxVar.v());
        contentValues.put("gmp_version", Long.valueOf(ksxVar.i()));
        contentValues.put("dev_cert_hash", Long.valueOf(ksxVar.f()));
        contentValues.put("measurement_enabled", Boolean.valueOf(ksxVar.am()));
        lbk lbkVar = ksxVar.a;
        lbh lbhVar = lbkVar.g;
        lbkVar.o(lbhVar);
        lbhVar.g();
        contentValues.put("day", Long.valueOf(ksxVar.h));
        lbkVar.o(lbhVar);
        lbhVar.g();
        contentValues.put("daily_public_events_count", Long.valueOf(ksxVar.i));
        lbkVar.o(lbhVar);
        lbhVar.g();
        contentValues.put("daily_events_count", Long.valueOf(ksxVar.j));
        lbkVar.o(lbhVar);
        lbhVar.g();
        contentValues.put("daily_conversions_count", Long.valueOf(ksxVar.k));
        contentValues.put("config_fetched_time", Long.valueOf(ksxVar.e()));
        contentValues.put("failed_config_fetch_time", Long.valueOf(ksxVar.h()));
        contentValues.put("app_version_int", Long.valueOf(ksxVar.c()));
        contentValues.put("firebase_instance_id", ksxVar.x());
        lbkVar.o(lbhVar);
        lbhVar.g();
        contentValues.put("daily_error_events_count", Long.valueOf(ksxVar.l));
        lbkVar.o(lbhVar);
        lbhVar.g();
        contentValues.put("daily_realtime_events_count", Long.valueOf(ksxVar.m));
        lbkVar.o(lbhVar);
        lbhVar.g();
        contentValues.put("health_monitor_sample", ksxVar.n);
        contentValues.put("android_id", (Long) 0L);
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(ksxVar.al()));
        contentValues.put("dynamite_version", Long.valueOf(ksxVar.g()));
        if (lihVar.n(strT).n(lcs.ANALYTICS_STORAGE)) {
            contentValues.put("session_stitching_token", ksxVar.B());
        }
        contentValues.put("sgtm_upload_enabled", Boolean.valueOf(ksxVar.ao()));
        contentValues.put("target_os_version", Long.valueOf(ksxVar.o()));
        contentValues.put("session_stitching_token_hash", Long.valueOf(ksxVar.n()));
        aeuw.a.eV();
        lbk lbkVar2 = this.y;
        kzf kzfVar = kzg.aP;
        ktx ktxVar = lbkVar2.d;
        if (ktxVar.t(strT, kzfVar)) {
            contentValues.put("ad_services_version", Integer.valueOf(ksxVar.a()));
            contentValues.put("attribution_eligibility_status", Long.valueOf(ksxVar.d()));
        }
        contentValues.put("unmatched_first_open_without_ad_id", Boolean.valueOf(ksxVar.ap()));
        contentValues.put("npa_metadata_value", ksxVar.p());
        contentValues.put("bundle_delivery_index", Long.valueOf(ksxVar.j()));
        contentValues.put("sgtm_preview_key", ksxVar.C());
        lbkVar.o(lbhVar);
        lbhVar.g();
        contentValues.put("dma_consent_state", Integer.valueOf(ksxVar.e));
        lbkVar.o(lbhVar);
        lbhVar.g();
        contentValues.put("daily_realtime_dcu_count", Integer.valueOf(ksxVar.f));
        contentValues.put("serialized_npa_metadata", ksxVar.A());
        contentValues.put("client_upload_eligibility", Integer.valueOf(ksxVar.b()));
        List listD = ksxVar.D();
        if (listD != null) {
            if (listD.isEmpty()) {
                lab labVar = lbkVar2.f;
                lbkVar2.o(labVar);
                labVar.f.b("Safelisted events should not be an empty list. appId", strT);
            } else {
                contentValues.put("safelisted_events", TextUtils.join(",", listD));
            }
        }
        aety.a.eV();
        if (ktxVar.t(null, kzg.aK) && !contentValues.containsKey("safelisted_events")) {
            contentValues.put("safelisted_events", (String) null);
        }
        contentValues.put("unmatched_pfo", ksxVar.q());
        contentValues.put("unmatched_uwa", ksxVar.r());
        contentValues.put("ad_campaign_info", ksxVar.aq());
        try {
            SQLiteDatabase sQLiteDatabaseE = e();
            if (sQLiteDatabaseE.update("apps", contentValues, "app_id = ?", new String[]{strT}) == 0 && sQLiteDatabaseE.insertWithOnConflict("apps", null, contentValues, 5) == -1) {
                lab labVar2 = lbkVar2.f;
                lbkVar2.o(labVar2);
                labVar2.c.b("Failed to insert/update app (got -1). appId", lab.b(strT));
            }
        } catch (SQLiteException e2) {
            lbk lbkVar3 = this.y;
            lab labVar3 = lbkVar3.f;
            lbkVar3.o(labVar3);
            labVar3.c.c("Error storing app. appId", lab.b(strT), e2);
        }
    }

    public final void ab(ContentValues contentValues) {
        try {
            SQLiteDatabase sQLiteDatabaseE = e();
            if (contentValues.getAsString("app_id") == null) {
                lbk lbkVar = this.y;
                lab labVar = lbkVar.f;
                lbkVar.o(labVar);
                labVar.e.b("Value of the primary key is not set.", lab.b("app_id"));
                return;
            }
            if (sQLiteDatabaseE.update("consent_settings", contentValues, "app_id = ?", new String[]{r3}) == 0 && sQLiteDatabaseE.insertWithOnConflict("consent_settings", null, contentValues, 5) == -1) {
                lbk lbkVar2 = this.y;
                lab labVar2 = lbkVar2.f;
                lbkVar2.o(labVar2);
                labVar2.c.c("Failed to insert/update table (got -1). key", lab.b("consent_settings"), lab.b("app_id"));
            }
        } catch (SQLiteException e2) {
            lbk lbkVar3 = this.y;
            lab labVar3 = lbkVar3.f;
            lbkVar3.o(labVar3);
            labVar3.c.d("Error storing into table. key", lab.b("consent_settings"), lab.b("app_id"), e2);
        }
    }

    public final long c(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                Cursor cursorRawQuery = e().rawQuery(str, strArr);
                if (!cursorRawQuery.moveToFirst()) {
                    throw new SQLiteException("Database returned empty set");
                }
                long j2 = cursorRawQuery.getLong(0);
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
                return j2;
            } catch (SQLiteException e2) {
                lbk lbkVar = this.y;
                lab labVar = lbkVar.f;
                lbkVar.o(labVar);
                labVar.c.c("Database error", str, e2);
                throw e2;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    public final long d(String str, String[] strArr, long j2) {
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = e().rawQuery(str, strArr);
                if (cursorRawQuery.moveToFirst()) {
                    j2 = cursorRawQuery.getLong(0);
                }
                return j2;
            } catch (SQLiteException e2) {
                lbk lbkVar = this.y;
                lab labVar = lbkVar.f;
                lbkVar.o(labVar);
                labVar.c.c("Database error", str, e2);
                throw e2;
            }
        } finally {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
        }
    }

    final SQLiteDatabase e() {
        g();
        try {
            return this.n.getWritableDatabase();
        } catch (SQLiteException e2) {
            lbk lbkVar = this.y;
            lab labVar = lbkVar.f;
            lbkVar.o(labVar);
            labVar.f.b("Error opening database", e2);
            throw e2;
        }
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x0081: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]) (LINE:130), block:B:27:0x0081 */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.os.Bundle f(java.lang.String r6) throws java.lang.Throwable {
        /*
            r5 = this;
            r5.g()
            r5.ag()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r5.e()     // Catch: java.lang.Throwable -> L68 android.database.sqlite.SQLiteException -> L6a
            java.lang.String r2 = "select parameters from default_event_params where app_id=?"
            java.lang.String[] r3 = new java.lang.String[]{r6}     // Catch: java.lang.Throwable -> L68 android.database.sqlite.SQLiteException -> L6a
            android.database.Cursor r1 = r1.rawQuery(r2, r3)     // Catch: java.lang.Throwable -> L68 android.database.sqlite.SQLiteException -> L6a
            boolean r2 = r1.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L66 java.lang.Throwable -> L80
            if (r2 != 0) goto L2a
            lbk r6 = r5.y     // Catch: android.database.sqlite.SQLiteException -> L66 java.lang.Throwable -> L80
            lab r2 = r6.f     // Catch: android.database.sqlite.SQLiteException -> L66 java.lang.Throwable -> L80
            r6.o(r2)     // Catch: android.database.sqlite.SQLiteException -> L66 java.lang.Throwable -> L80
            kzz r6 = r2.k     // Catch: android.database.sqlite.SQLiteException -> L66 java.lang.Throwable -> L80
            java.lang.String r2 = "Default event parameters not found"
            r6.a(r2)     // Catch: android.database.sqlite.SQLiteException -> L66 java.lang.Throwable -> L80
            goto L7a
        L2a:
            r2 = 0
            byte[] r2 = r1.getBlob(r2)     // Catch: android.database.sqlite.SQLiteException -> L66 java.lang.Throwable -> L80
            lkw r3 = defpackage.lkw.a     // Catch: java.io.IOException -> L52 android.database.sqlite.SQLiteException -> L66 java.lang.Throwable -> L80
            lkv r3 = new lkv     // Catch: java.io.IOException -> L52 android.database.sqlite.SQLiteException -> L66 java.lang.Throwable -> L80
            r3.<init>()     // Catch: java.io.IOException -> L52 android.database.sqlite.SQLiteException -> L66 java.lang.Throwable -> L80
            abyq r2 = defpackage.lik.o(r3, r2)     // Catch: java.io.IOException -> L52 android.database.sqlite.SQLiteException -> L66 java.lang.Throwable -> L80
            lkv r2 = (defpackage.lkv) r2     // Catch: java.io.IOException -> L52 android.database.sqlite.SQLiteException -> L66 java.lang.Throwable -> L80
            abxd r2 = r2.v()     // Catch: java.io.IOException -> L52 android.database.sqlite.SQLiteException -> L66 java.lang.Throwable -> L80
            lkw r2 = (defpackage.lkw) r2     // Catch: java.io.IOException -> L52 android.database.sqlite.SQLiteException -> L66 java.lang.Throwable -> L80
            lik r6 = r5.af()     // Catch: android.database.sqlite.SQLiteException -> L66 java.lang.Throwable -> L80
            abxs r2 = r2.c     // Catch: android.database.sqlite.SQLiteException -> L66 java.lang.Throwable -> L80
            android.os.Bundle r6 = r6.f(r2)     // Catch: android.database.sqlite.SQLiteException -> L66 java.lang.Throwable -> L80
            if (r1 == 0) goto L51
            r1.close()
        L51:
            return r6
        L52:
            r2 = move-exception
            lbk r3 = r5.y     // Catch: android.database.sqlite.SQLiteException -> L66 java.lang.Throwable -> L80
            lab r4 = r3.f     // Catch: android.database.sqlite.SQLiteException -> L66 java.lang.Throwable -> L80
            r3.o(r4)     // Catch: android.database.sqlite.SQLiteException -> L66 java.lang.Throwable -> L80
            kzz r3 = r4.c     // Catch: android.database.sqlite.SQLiteException -> L66 java.lang.Throwable -> L80
            java.lang.String r4 = "Failed to retrieve default event parameters. appId"
            java.lang.Object r6 = defpackage.lab.b(r6)     // Catch: android.database.sqlite.SQLiteException -> L66 java.lang.Throwable -> L80
            r3.c(r4, r6, r2)     // Catch: android.database.sqlite.SQLiteException -> L66 java.lang.Throwable -> L80
            goto L7a
        L66:
            r6 = move-exception
            goto L6c
        L68:
            r6 = move-exception
            goto L82
        L6a:
            r6 = move-exception
            r1 = r0
        L6c:
            lbk r2 = r5.y     // Catch: java.lang.Throwable -> L80
            lab r3 = r2.f     // Catch: java.lang.Throwable -> L80
            r2.o(r3)     // Catch: java.lang.Throwable -> L80
            kzz r2 = r3.c     // Catch: java.lang.Throwable -> L80
            java.lang.String r3 = "Error selecting default event parameters"
            r2.b(r3, r6)     // Catch: java.lang.Throwable -> L80
        L7a:
            if (r1 == 0) goto L7f
            r1.close()
        L7f:
            return r0
        L80:
            r6 = move-exception
            r0 = r1
        L82:
            if (r0 == 0) goto L87
            r0.close()
        L87:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kug.f(java.lang.String):android.os.Bundle");
    }

    /* JADX WARN: Removed duplicated region for block: B:131:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x03c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.ksx h(java.lang.String r52) {
        /*
            Method dump skipped, instructions count: 966
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kug.h(java.lang.String):ksx");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0118  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.measurement.internal.ConditionalUserPropertyParcel i(java.lang.String r26, java.lang.String r27) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 284
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kug.i(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.ConditionalUserPropertyParcel");
    }

    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0084: MOVE (r1 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]) (LINE:133), block:B:27:0x0083 */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.kub j(java.lang.String r11) throws java.lang.Throwable {
        /*
            r10 = this;
            defpackage.kkk.h(r11)
            r10.g()
            r10.ag()
            r1 = 0
            android.database.sqlite.SQLiteDatabase r2 = r10.e()     // Catch: java.lang.Throwable -> L65 android.database.sqlite.SQLiteException -> L68
            java.lang.String r3 = "apps"
            java.lang.String r0 = "remote_config"
            java.lang.String r4 = "config_last_modified_time"
            java.lang.String r5 = "e_tag"
            java.lang.String[] r4 = new java.lang.String[]{r0, r4, r5}     // Catch: java.lang.Throwable -> L65 android.database.sqlite.SQLiteException -> L68
            java.lang.String r5 = "app_id=?"
            java.lang.String[] r6 = new java.lang.String[]{r11}     // Catch: java.lang.Throwable -> L65 android.database.sqlite.SQLiteException -> L68
            r8 = 0
            r9 = 0
            r7 = 0
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L65 android.database.sqlite.SQLiteException -> L68
            boolean r0 = r2.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L63 java.lang.Throwable -> L82
            if (r0 != 0) goto L2e
            goto L7c
        L2e:
            r0 = 0
            byte[] r0 = r2.getBlob(r0)     // Catch: android.database.sqlite.SQLiteException -> L63 java.lang.Throwable -> L82
            r3 = 1
            java.lang.String r3 = r2.getString(r3)     // Catch: android.database.sqlite.SQLiteException -> L63 java.lang.Throwable -> L82
            r4 = 2
            java.lang.String r4 = r2.getString(r4)     // Catch: android.database.sqlite.SQLiteException -> L63 java.lang.Throwable -> L82
            boolean r5 = r2.moveToNext()     // Catch: android.database.sqlite.SQLiteException -> L63 java.lang.Throwable -> L82
            if (r5 == 0) goto L55
            lbk r5 = r10.y     // Catch: android.database.sqlite.SQLiteException -> L63 java.lang.Throwable -> L82
            lab r6 = r5.f     // Catch: android.database.sqlite.SQLiteException -> L63 java.lang.Throwable -> L82
            r5.o(r6)     // Catch: android.database.sqlite.SQLiteException -> L63 java.lang.Throwable -> L82
            kzz r5 = r6.c     // Catch: android.database.sqlite.SQLiteException -> L63 java.lang.Throwable -> L82
            java.lang.String r6 = "Got multiple records for app config, expected one. appId"
            java.lang.Object r7 = defpackage.lab.b(r11)     // Catch: android.database.sqlite.SQLiteException -> L63 java.lang.Throwable -> L82
            r5.b(r6, r7)     // Catch: android.database.sqlite.SQLiteException -> L63 java.lang.Throwable -> L82
        L55:
            if (r0 != 0) goto L58
            goto L7c
        L58:
            kub r5 = new kub     // Catch: android.database.sqlite.SQLiteException -> L63 java.lang.Throwable -> L82
            r5.<init>(r0, r3, r4)     // Catch: android.database.sqlite.SQLiteException -> L63 java.lang.Throwable -> L82
            if (r2 == 0) goto L62
            r2.close()
        L62:
            return r5
        L63:
            r0 = move-exception
            goto L6a
        L65:
            r0 = move-exception
            r11 = r0
            goto L85
        L68:
            r0 = move-exception
            r2 = r1
        L6a:
            lbk r3 = r10.y     // Catch: java.lang.Throwable -> L82
            lab r4 = r3.f     // Catch: java.lang.Throwable -> L82
            r3.o(r4)     // Catch: java.lang.Throwable -> L82
            kzz r3 = r4.c     // Catch: java.lang.Throwable -> L82
            java.lang.String r4 = "Error querying remote config. appId"
            java.lang.Object r11 = defpackage.lab.b(r11)     // Catch: java.lang.Throwable -> L82
            r3.c(r4, r11, r0)     // Catch: java.lang.Throwable -> L82
        L7c:
            if (r2 == 0) goto L81
            r2.close()
        L81:
            return r1
        L82:
            r0 = move-exception
            r11 = r0
            r1 = r2
        L85:
            if (r1 == 0) goto L8a
            r1.close()
        L8a:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kug.j(java.lang.String):kub");
    }

    public final kuc k(long j2, String str, long j3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        kkk.h(str);
        g();
        ag();
        String[] strArr = {str};
        kuc kucVar = new kuc();
        Cursor cursorQuery = null;
        try {
            try {
                SQLiteDatabase sQLiteDatabaseE = e();
                cursorQuery = sQLiteDatabaseE.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count", "daily_realtime_dcu_count", "daily_registered_triggers_count"}, "app_id=?", new String[]{str}, null, null, null);
                if (cursorQuery.moveToFirst()) {
                    if (cursorQuery.getLong(0) == j2) {
                        kucVar.b = cursorQuery.getLong(1);
                        kucVar.a = cursorQuery.getLong(2);
                        kucVar.c = cursorQuery.getLong(3);
                        kucVar.d = cursorQuery.getLong(4);
                        kucVar.e = cursorQuery.getLong(5);
                        kucVar.f = cursorQuery.getLong(6);
                        kucVar.g = cursorQuery.getLong(7);
                    }
                    if (z) {
                        kucVar.b += j3;
                    }
                    if (z2) {
                        kucVar.a += j3;
                    }
                    if (z3) {
                        kucVar.c += j3;
                    }
                    if (z4) {
                        kucVar.d += j3;
                    }
                    if (z5) {
                        kucVar.e += j3;
                    }
                    if (z6) {
                        kucVar.f += j3;
                    }
                    if (z7) {
                        kucVar.g += j3;
                    }
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("day", Long.valueOf(j2));
                    contentValues.put("daily_public_events_count", Long.valueOf(kucVar.a));
                    contentValues.put("daily_events_count", Long.valueOf(kucVar.b));
                    contentValues.put("daily_conversions_count", Long.valueOf(kucVar.c));
                    contentValues.put("daily_error_events_count", Long.valueOf(kucVar.d));
                    contentValues.put("daily_realtime_events_count", Long.valueOf(kucVar.e));
                    contentValues.put("daily_realtime_dcu_count", Long.valueOf(kucVar.f));
                    contentValues.put("daily_registered_triggers_count", Long.valueOf(kucVar.g));
                    sQLiteDatabaseE.update("apps", contentValues, "app_id=?", strArr);
                } else {
                    lbk lbkVar = this.y;
                    lab labVar = lbkVar.f;
                    lbkVar.o(labVar);
                    labVar.f.b("Not updating daily counts, app is not known. appId", lab.b(str));
                }
            } catch (SQLiteException e2) {
                lbk lbkVar2 = this.y;
                lab labVar2 = lbkVar2.f;
                lbkVar2.o(labVar2);
                labVar2.c.c("Error updating daily counts. appId", lab.b(str), e2);
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return kucVar;
        } finally {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x012b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.kun l(java.lang.String r30, java.lang.String r31, java.lang.String r32) {
        /*
            Method dump skipped, instructions count: 303
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kug.l(java.lang.String, java.lang.String, java.lang.String):kun");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0056, code lost:
    
        if (r5 != 0) goto L20;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0065  */
    /* JADX WARN: Type inference failed for: r2v2, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v12, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0056 -> B:20:0x0058). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.lct m(java.lang.String r5) {
        /*
            r4 = this;
            defpackage.kkk.k(r5)
            r4.g()
            r4.ag()
            java.lang.String[] r5 = new java.lang.String[]{r5}
            java.lang.String r0 = "select consent_state, consent_source from consent_settings where app_id=? limit 1;"
            r1 = 0
            android.database.sqlite.SQLiteDatabase r2 = r4.e()     // Catch: java.lang.Throwable -> L42 android.database.sqlite.SQLiteException -> L45
            android.database.Cursor r5 = r2.rawQuery(r0, r5)     // Catch: java.lang.Throwable -> L42 android.database.sqlite.SQLiteException -> L45
            boolean r0 = r5.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L40 java.lang.Throwable -> L61
            if (r0 != 0) goto L2f
            lbk r0 = r4.y     // Catch: android.database.sqlite.SQLiteException -> L40 java.lang.Throwable -> L61
            lab r2 = r0.f     // Catch: android.database.sqlite.SQLiteException -> L40 java.lang.Throwable -> L61
            r0.o(r2)     // Catch: android.database.sqlite.SQLiteException -> L40 java.lang.Throwable -> L61
            kzz r0 = r2.k     // Catch: android.database.sqlite.SQLiteException -> L40 java.lang.Throwable -> L61
            java.lang.String r2 = "No data found"
            r0.a(r2)     // Catch: android.database.sqlite.SQLiteException -> L40 java.lang.Throwable -> L61
            if (r5 == 0) goto L5b
            goto L58
        L2f:
            r0 = 0
            java.lang.String r0 = r5.getString(r0)     // Catch: android.database.sqlite.SQLiteException -> L40 java.lang.Throwable -> L61
            r2 = 1
            int r2 = r5.getInt(r2)     // Catch: android.database.sqlite.SQLiteException -> L40 java.lang.Throwable -> L61
            lct r1 = defpackage.lct.h(r0, r2)     // Catch: android.database.sqlite.SQLiteException -> L40 java.lang.Throwable -> L61
            if (r5 == 0) goto L5b
            goto L58
        L40:
            r0 = move-exception
            goto L48
        L42:
            r5 = move-exception
            r0 = r5
            goto L63
        L45:
            r5 = move-exception
            r0 = r5
            r5 = r1
        L48:
            lbk r2 = r4.y     // Catch: java.lang.Throwable -> L61
            lab r3 = r2.f     // Catch: java.lang.Throwable -> L61
            r2.o(r3)     // Catch: java.lang.Throwable -> L61
            kzz r2 = r3.c     // Catch: java.lang.Throwable -> L61
            java.lang.String r3 = "Error querying database."
            r2.b(r3, r0)     // Catch: java.lang.Throwable -> L61
            if (r5 == 0) goto L5b
        L58:
            r5.close()
        L5b:
            if (r1 != 0) goto L60
            lct r5 = defpackage.lct.a
            return r5
        L60:
            return r1
        L61:
            r0 = move-exception
            r1 = r5
        L63:
            if (r1 == 0) goto L68
            r1.close()
        L68:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kug.m(java.lang.String):lct");
    }

    public final lij n(String str, long j2, byte[] bArr, String str2, String str3, int i2, int i3, long j3, long j4, long j5) {
        lex lexVar;
        if (TextUtils.isEmpty(str2)) {
            lbk lbkVar = this.y;
            lab labVar = lbkVar.f;
            lbkVar.o(labVar);
            labVar.j.a("Upload uri is null or empty. Destination is unknown. Dropping batch. ");
            return null;
        }
        try {
            llc llcVar = llc.a;
            llb llbVar = (llb) lik.o(new llb(), bArr);
            lex[] lexVarArrValues = lex.values();
            int length = lexVarArrValues.length;
            int i4 = 0;
            while (true) {
                if (i4 >= length) {
                    lexVar = lex.UNKNOWN;
                    break;
                }
                lexVar = lexVarArrValues[i4];
                if (lexVar.g == i2) {
                    break;
                }
                i4++;
            }
            lex lexVar2 = lexVar;
            if (lexVar2 != lex.GOOGLE_SIGNAL && lexVar2 != lex.GOOGLE_SIGNAL_PENDING && i3 > 0) {
                ArrayList arrayList = new ArrayList();
                for (lle lleVar : DesugarCollections.unmodifiableList(((llc) llbVar.b).c)) {
                    lld lldVar = new lld();
                    lldVar.B(lleVar);
                    if ((lldVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        lldVar.y();
                    }
                    lle lleVar2 = (lle) lldVar.b;
                    lle lleVar3 = lle.a;
                    lleVar2.c |= 2;
                    lleVar2.J = i3;
                    arrayList.add((lle) lldVar.v());
                }
                if ((llbVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    llbVar.y();
                }
                ((llc) llbVar.b).c = abzb.b;
                llbVar.a(arrayList);
            }
            HashMap map = new HashMap();
            if (str3 != null) {
                String[] strArrSplit = str3.split("\r\n");
                int length2 = strArrSplit.length;
                int i5 = 0;
                while (true) {
                    if (i5 >= length2) {
                        break;
                    }
                    String str4 = strArrSplit[i5];
                    if (str4.isEmpty()) {
                        break;
                    }
                    String[] strArrSplit2 = str4.split("=", 2);
                    if (strArrSplit2.length != 2) {
                        lbk lbkVar2 = this.y;
                        lab labVar2 = lbkVar2.f;
                        lbkVar2.o(labVar2);
                        labVar2.c.b("Invalid upload header: ", str4);
                        break;
                    }
                    map.put(strArrSplit2[0], strArrSplit2[1]);
                    i5++;
                }
            }
            return new lij(j2, (llc) llbVar.v(), str2, map, lexVar2, j3, j4, j5, i3);
        } catch (IOException e2) {
            lbk lbkVar3 = this.y;
            lab labVar3 = lbkVar3.f;
            lbkVar3.o(labVar3);
            labVar3.c.c("Failed to queued MeasurementBatch from upload_queue. appId", str, e2);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.lim o(java.lang.String r11, java.lang.String r12) {
        /*
            r10 = this;
            defpackage.kkk.h(r11)
            defpackage.kkk.h(r12)
            r10.g()
            r10.ag()
            r1 = 0
            android.database.sqlite.SQLiteDatabase r2 = r10.e()     // Catch: java.lang.Throwable -> L70 android.database.sqlite.SQLiteException -> L73
            java.lang.String r3 = "user_attributes"
            java.lang.String r0 = "set_timestamp"
            java.lang.String r4 = "value"
            java.lang.String r5 = "origin"
            java.lang.String[] r4 = new java.lang.String[]{r0, r4, r5}     // Catch: java.lang.Throwable -> L70 android.database.sqlite.SQLiteException -> L73
            java.lang.String r5 = "app_id=? and name=?"
            java.lang.String[] r6 = new java.lang.String[]{r11, r12}     // Catch: java.lang.Throwable -> L70 android.database.sqlite.SQLiteException -> L73
            r8 = 0
            r9 = 0
            r7 = 0
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L70 android.database.sqlite.SQLiteException -> L73
            boolean r0 = r2.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L6b java.lang.Throwable -> L96
            if (r0 != 0) goto L32
            goto L90
        L32:
            r0 = 0
            long r7 = r2.getLong(r0)     // Catch: android.database.sqlite.SQLiteException -> L6b java.lang.Throwable -> L96
            r0 = 1
            java.lang.Object r9 = r10.p(r2, r0)     // Catch: android.database.sqlite.SQLiteException -> L6b java.lang.Throwable -> L96
            if (r9 != 0) goto L3f
            goto L90
        L3f:
            r0 = 2
            java.lang.String r5 = r2.getString(r0)     // Catch: android.database.sqlite.SQLiteException -> L6b java.lang.Throwable -> L96
            lim r3 = new lim     // Catch: android.database.sqlite.SQLiteException -> L6b java.lang.Throwable -> L96
            r4 = r11
            r6 = r12
            r3.<init>(r4, r5, r6, r7, r9)     // Catch: android.database.sqlite.SQLiteException -> L69 java.lang.Throwable -> L96
            boolean r11 = r2.moveToNext()     // Catch: android.database.sqlite.SQLiteException -> L69 java.lang.Throwable -> L96
            if (r11 == 0) goto L63
            lbk r11 = r10.y     // Catch: android.database.sqlite.SQLiteException -> L69 java.lang.Throwable -> L96
            lab r12 = r11.f     // Catch: android.database.sqlite.SQLiteException -> L69 java.lang.Throwable -> L96
            r11.o(r12)     // Catch: android.database.sqlite.SQLiteException -> L69 java.lang.Throwable -> L96
            kzz r11 = r12.c     // Catch: android.database.sqlite.SQLiteException -> L69 java.lang.Throwable -> L96
            java.lang.String r12 = "Got multiple records for user property, expected one. appId"
            java.lang.Object r0 = defpackage.lab.b(r4)     // Catch: android.database.sqlite.SQLiteException -> L69 java.lang.Throwable -> L96
            r11.b(r12, r0)     // Catch: android.database.sqlite.SQLiteException -> L69 java.lang.Throwable -> L96
        L63:
            if (r2 == 0) goto L68
            r2.close()
        L68:
            return r3
        L69:
            r0 = move-exception
            goto L6e
        L6b:
            r0 = move-exception
            r4 = r11
            r6 = r12
        L6e:
            r11 = r0
            goto L78
        L70:
            r0 = move-exception
            r11 = r0
            goto L99
        L73:
            r0 = move-exception
            r4 = r11
            r6 = r12
            r11 = r0
            r2 = r1
        L78:
            lbk r12 = r10.y     // Catch: java.lang.Throwable -> L96
            lab r0 = r12.f     // Catch: java.lang.Throwable -> L96
            r12.o(r0)     // Catch: java.lang.Throwable -> L96
            kzz r0 = r0.c     // Catch: java.lang.Throwable -> L96
            java.lang.String r3 = "Error querying user property. appId"
            java.lang.Object r4 = defpackage.lab.b(r4)     // Catch: java.lang.Throwable -> L96
            kzu r12 = r12.j     // Catch: java.lang.Throwable -> L96
            java.lang.String r12 = r12.e(r6)     // Catch: java.lang.Throwable -> L96
            r0.d(r3, r4, r12, r11)     // Catch: java.lang.Throwable -> L96
        L90:
            if (r2 == 0) goto L95
            r2.close()
        L95:
            return r1
        L96:
            r0 = move-exception
            r11 = r0
            r1 = r2
        L99:
            if (r1 == 0) goto L9e
            r1.close()
        L9e:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kug.o(java.lang.String, java.lang.String):lim");
    }

    final Object p(Cursor cursor, int i2) {
        int type = cursor.getType(i2);
        if (type == 0) {
            lbk lbkVar = this.y;
            lab labVar = lbkVar.f;
            lbkVar.o(labVar);
            labVar.c.a("Loaded invalid null value from database");
            return null;
        }
        if (type == 1) {
            return Long.valueOf(cursor.getLong(i2));
        }
        if (type == 2) {
            return Double.valueOf(cursor.getDouble(i2));
        }
        if (type == 3) {
            return cursor.getString(i2);
        }
        if (type != 4) {
            lbk lbkVar2 = this.y;
            lab labVar2 = lbkVar2.f;
            lbkVar2.o(labVar2);
            labVar2.c.b("Loaded invalid unknown value type, ignoring it", Integer.valueOf(type));
            return null;
        }
        lbk lbkVar3 = this.y;
        lab labVar3 = lbkVar3.f;
        lbkVar3.o(labVar3);
        labVar3.c.a("Loaded invalid blob type value, ignoring it");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003d  */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String q() throws java.lang.Throwable {
        /*
            r6 = this;
            android.database.sqlite.SQLiteDatabase r0 = r6.e()
            r1 = 0
            java.lang.String r2 = "select app_id from queue order by has_realtime desc, rowid asc limit 1;"
            android.database.Cursor r0 = r0.rawQuery(r2, r1)     // Catch: java.lang.Throwable -> L1e android.database.sqlite.SQLiteException -> L20
            boolean r2 = r0.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L1c java.lang.Throwable -> L37
            if (r2 == 0) goto L31
            r2 = 0
            java.lang.String r1 = r0.getString(r2)     // Catch: android.database.sqlite.SQLiteException -> L1c java.lang.Throwable -> L37
            if (r0 == 0) goto L1b
            r0.close()
        L1b:
            return r1
        L1c:
            r2 = move-exception
            goto L23
        L1e:
            r0 = move-exception
            goto L3b
        L20:
            r0 = move-exception
            r2 = r0
            r0 = r1
        L23:
            lbk r3 = r6.y     // Catch: java.lang.Throwable -> L37
            lab r4 = r3.f     // Catch: java.lang.Throwable -> L37
            r3.o(r4)     // Catch: java.lang.Throwable -> L37
            kzz r3 = r4.c     // Catch: java.lang.Throwable -> L37
            java.lang.String r4 = "Database error getting next bundle app id"
            r3.b(r4, r2)     // Catch: java.lang.Throwable -> L37
        L31:
            if (r0 == 0) goto L36
            r0.close()
        L36:
            return r1
        L37:
            r1 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
        L3b:
            if (r1 == 0) goto L40
            r1.close()
        L40:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kug.q():java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:109:0x01d3, code lost:
    
        r2 = r17.y;
        r3 = r2.f;
        r2.o(r3);
        r3.c.c("Error querying bundles. appId", defpackage.lab.b(r18), r0);
        r0 = java.util.Collections.EMPTY_LIST;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x01ed, code lost:
    
        if (r5 != null) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x01ef, code lost:
    
        r5.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x01f2, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00fa, code lost:
    
        r19 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00fc, code lost:
    
        r4 = r13.f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x012a, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x012b, code lost:
    
        r5 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x012f, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0130, code lost:
    
        r5 = r19;
     */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List r(java.lang.String r18, int r19, int r20) {
        /*
            Method dump skipped, instructions count: 499
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kug.r(java.lang.String, int, int):java.util.List");
    }

    public final List s(String str, String str2, String str3) {
        kkk.h(str);
        g();
        ag();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(String.valueOf(str3).concat("*"));
            sb.append(" and name glob ?");
        }
        return t(sb.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0052, code lost:
    
        r2 = r12.f;
        r12.o(r2);
        r2.c.b("Read more than the max allowed conditional properties, ignoring extra", 1000);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List t(java.lang.String r29, java.lang.String[] r30) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kug.t(java.lang.String, java.lang.String[]):java.util.List");
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List u(java.lang.String r18, com.google.android.gms.measurement.internal.UploadBatchesCriteria r19, int r20) throws java.lang.Throwable {
        /*
            r17 = this;
            r1 = r17
            java.lang.String r0 = "app_id=?"
            defpackage.kkk.h(r18)
            r1.g()
            r1.ag()
            r2 = 0
            android.database.sqlite.SQLiteDatabase r3 = r1.e()     // Catch: java.lang.Throwable -> Lbe android.database.sqlite.SQLiteException -> Lc0
            java.lang.String r4 = "upload_queue"
            java.lang.String r5 = "rowId"
            java.lang.String r6 = "app_id"
            java.lang.String r7 = "measurement_batch"
            java.lang.String r8 = "upload_uri"
            java.lang.String r9 = "upload_headers"
            java.lang.String r10 = "upload_type"
            java.lang.String r11 = "retry_count"
            java.lang.String r12 = "creation_timestamp"
            java.lang.String r13 = "associated_row_id"
            java.lang.String r14 = "last_upload_timestamp"
            java.lang.String[] r5 = new java.lang.String[]{r5, r6, r7, r8, r9, r10, r11, r12, r13, r14}     // Catch: java.lang.Throwable -> Lbe android.database.sqlite.SQLiteException -> Lc0
            r6 = r19
            java.util.List r6 = r6.a     // Catch: java.lang.Throwable -> Lbe android.database.sqlite.SQLiteException -> Lc0
            java.lang.String r6 = r1.ak(r6)     // Catch: java.lang.Throwable -> Lbe android.database.sqlite.SQLiteException -> Lc0
            java.lang.String r7 = r1.aj()     // Catch: java.lang.Throwable -> Lbe android.database.sqlite.SQLiteException -> Lc0
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lbe android.database.sqlite.SQLiteException -> Lc0
            r8.<init>(r0)     // Catch: java.lang.Throwable -> Lbe android.database.sqlite.SQLiteException -> Lc0
            r8.append(r6)     // Catch: java.lang.Throwable -> Lbe android.database.sqlite.SQLiteException -> Lc0
            java.lang.String r0 = " AND NOT "
            r8.append(r0)     // Catch: java.lang.Throwable -> Lbe android.database.sqlite.SQLiteException -> Lc0
            r8.append(r7)     // Catch: java.lang.Throwable -> Lbe android.database.sqlite.SQLiteException -> Lc0
            java.lang.String r6 = r8.toString()     // Catch: java.lang.Throwable -> Lbe android.database.sqlite.SQLiteException -> Lc0
            java.lang.String[] r7 = new java.lang.String[]{r18}     // Catch: java.lang.Throwable -> Lbe android.database.sqlite.SQLiteException -> Lc0
            java.lang.String r10 = "creation_timestamp ASC"
            if (r20 <= 0) goto L5a
            java.lang.String r0 = java.lang.String.valueOf(r20)     // Catch: java.lang.Throwable -> Lbe android.database.sqlite.SQLiteException -> Lc0
            r11 = r0
            goto L5b
        L5a:
            r11 = r2
        L5b:
            r8 = 0
            r9 = 0
            android.database.Cursor r2 = r3.query(r4, r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> Lbe android.database.sqlite.SQLiteException -> Lc0
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lb2 android.database.sqlite.SQLiteException -> Lb8
            r0.<init>()     // Catch: java.lang.Throwable -> Lb2 android.database.sqlite.SQLiteException -> Lb8
        L66:
            boolean r3 = r2.moveToNext()     // Catch: java.lang.Throwable -> Lb2 android.database.sqlite.SQLiteException -> Lb8
            if (r3 == 0) goto Laf
            r3 = 0
            long r3 = r2.getLong(r3)     // Catch: java.lang.Throwable -> Lb2 android.database.sqlite.SQLiteException -> Lb8
            r5 = 2
            byte[] r5 = r2.getBlob(r5)     // Catch: java.lang.Throwable -> Lb2 android.database.sqlite.SQLiteException -> Lb8
            r6 = 3
            java.lang.String r6 = r2.getString(r6)     // Catch: java.lang.Throwable -> Lb2 android.database.sqlite.SQLiteException -> Lb8
            r7 = 4
            java.lang.String r7 = r2.getString(r7)     // Catch: java.lang.Throwable -> Lb2 android.database.sqlite.SQLiteException -> Lb8
            r8 = 5
            int r8 = r2.getInt(r8)     // Catch: java.lang.Throwable -> Lb2 android.database.sqlite.SQLiteException -> Lb8
            r9 = 6
            int r9 = r2.getInt(r9)     // Catch: java.lang.Throwable -> Lb2 android.database.sqlite.SQLiteException -> Lb8
            r10 = 7
            long r10 = r2.getLong(r10)     // Catch: java.lang.Throwable -> Lb2 android.database.sqlite.SQLiteException -> Lb8
            r12 = 8
            long r12 = r2.getLong(r12)     // Catch: java.lang.Throwable -> Lb2 android.database.sqlite.SQLiteException -> Lb8
            r14 = 9
            long r14 = r2.getLong(r14)     // Catch: java.lang.Throwable -> Lb2 android.database.sqlite.SQLiteException -> Lb8
            r16 = r2
            r2 = r18
            lij r3 = r1.n(r2, r3, r5, r6, r7, r8, r9, r10, r12, r14)     // Catch: java.lang.Throwable -> Lab android.database.sqlite.SQLiteException -> Lad
            if (r3 == 0) goto La8
            r0.add(r3)     // Catch: java.lang.Throwable -> Lab android.database.sqlite.SQLiteException -> Lad
        La8:
            r2 = r16
            goto L66
        Lab:
            r0 = move-exception
            goto Lb5
        Lad:
            r0 = move-exception
            goto Lbb
        Laf:
            r16 = r2
            goto Ld3
        Lb2:
            r0 = move-exception
            r16 = r2
        Lb5:
            r2 = r16
            goto Ld9
        Lb8:
            r0 = move-exception
            r16 = r2
        Lbb:
            r2 = r16
            goto Lc1
        Lbe:
            r0 = move-exception
            goto Ld9
        Lc0:
            r0 = move-exception
        Lc1:
            lbk r3 = r1.y     // Catch: java.lang.Throwable -> Lbe
            lab r4 = r3.f     // Catch: java.lang.Throwable -> Lbe
            r3.o(r4)     // Catch: java.lang.Throwable -> Lbe
            kzz r3 = r4.c     // Catch: java.lang.Throwable -> Lbe
            java.lang.String r4 = "Error to querying MeasurementBatch from upload_queue. appId"
            r5 = r18
            r3.c(r4, r5, r0)     // Catch: java.lang.Throwable -> Lbe
            java.util.List r0 = java.util.Collections.EMPTY_LIST     // Catch: java.lang.Throwable -> Lbe
        Ld3:
            if (r2 == 0) goto Ld8
            r2.close()
        Ld8:
            return r0
        Ld9:
            if (r2 == 0) goto Lde
            r2.close()
        Lde:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kug.u(java.lang.String, com.google.android.gms.measurement.internal.UploadBatchesCriteria, int):java.util.List");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List v(java.lang.String r13) {
        /*
            r12 = this;
            defpackage.kkk.h(r13)
            r12.g()
            r12.ag()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.String r9 = "1000"
            r10 = 0
            android.database.sqlite.SQLiteDatabase r1 = r12.e()     // Catch: java.lang.Throwable -> L7c android.database.sqlite.SQLiteException -> L82
            java.lang.String r2 = "user_attributes"
            java.lang.String r3 = "name"
            java.lang.String r4 = "origin"
            java.lang.String r5 = "set_timestamp"
            java.lang.String r6 = "value"
            java.lang.String[] r3 = new java.lang.String[]{r3, r4, r5, r6}     // Catch: java.lang.Throwable -> L7c android.database.sqlite.SQLiteException -> L82
            java.lang.String r4 = "app_id=?"
            java.lang.String[] r5 = new java.lang.String[]{r13}     // Catch: java.lang.Throwable -> L7c android.database.sqlite.SQLiteException -> L82
            java.lang.String r8 = "rowid"
            lbk r11 = r12.y     // Catch: java.lang.Throwable -> L7c android.database.sqlite.SQLiteException -> L82
            ktx r6 = r11.d     // Catch: java.lang.Throwable -> L7c android.database.sqlite.SQLiteException -> L82
            r6 = 0
            r7 = 0
            android.database.Cursor r10 = r1.query(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L7c android.database.sqlite.SQLiteException -> L82
            boolean r1 = r10.moveToFirst()     // Catch: java.lang.Throwable -> L7c android.database.sqlite.SQLiteException -> L7f
            if (r1 == 0) goto L99
        L3b:
            r1 = 0
            java.lang.String r5 = r10.getString(r1)     // Catch: java.lang.Throwable -> L7c android.database.sqlite.SQLiteException -> L7f
            r1 = 1
            java.lang.String r1 = r10.getString(r1)     // Catch: java.lang.Throwable -> L7c android.database.sqlite.SQLiteException -> L7f
            if (r1 != 0) goto L49
            java.lang.String r1 = ""
        L49:
            r4 = r1
            r1 = 2
            long r6 = r10.getLong(r1)     // Catch: java.lang.Throwable -> L7c android.database.sqlite.SQLiteException -> L7f
            r1 = 3
            java.lang.Object r8 = r12.p(r10, r1)     // Catch: java.lang.Throwable -> L7c android.database.sqlite.SQLiteException -> L7f
            if (r8 != 0) goto L68
            lab r1 = r11.f     // Catch: java.lang.Throwable -> L7c android.database.sqlite.SQLiteException -> L7f
            r11.o(r1)     // Catch: java.lang.Throwable -> L7c android.database.sqlite.SQLiteException -> L7f
            kzz r1 = r1.c     // Catch: java.lang.Throwable -> L7c android.database.sqlite.SQLiteException -> L7f
            java.lang.String r2 = "Read invalid user property value, ignoring it. appId"
            java.lang.Object r3 = defpackage.lab.b(r13)     // Catch: java.lang.Throwable -> L7c android.database.sqlite.SQLiteException -> L7f
            r1.b(r2, r3)     // Catch: java.lang.Throwable -> L7c android.database.sqlite.SQLiteException -> L7f
            r3 = r13
            goto L71
        L68:
            lim r2 = new lim     // Catch: java.lang.Throwable -> L7c android.database.sqlite.SQLiteException -> L7f
            r3 = r13
            r2.<init>(r3, r4, r5, r6, r8)     // Catch: android.database.sqlite.SQLiteException -> L7a java.lang.Throwable -> L7c
            r0.add(r2)     // Catch: android.database.sqlite.SQLiteException -> L7a java.lang.Throwable -> L7c
        L71:
            boolean r13 = r10.moveToNext()     // Catch: android.database.sqlite.SQLiteException -> L7a java.lang.Throwable -> L7c
            if (r13 != 0) goto L78
            goto L99
        L78:
            r13 = r3
            goto L3b
        L7a:
            r0 = move-exception
            goto L85
        L7c:
            r0 = move-exception
            r13 = r0
            goto L9f
        L7f:
            r0 = move-exception
            r3 = r13
            goto L85
        L82:
            r0 = move-exception
            r3 = r13
            r13 = r0
        L85:
            lbk r13 = r12.y     // Catch: java.lang.Throwable -> L7c
            lab r1 = r13.f     // Catch: java.lang.Throwable -> L7c
            r13.o(r1)     // Catch: java.lang.Throwable -> L7c
            kzz r13 = r1.c     // Catch: java.lang.Throwable -> L7c
            java.lang.String r1 = "Error querying user properties. appId"
            java.lang.Object r2 = defpackage.lab.b(r3)     // Catch: java.lang.Throwable -> L7c
            r13.c(r1, r2, r0)     // Catch: java.lang.Throwable -> L7c
            java.util.List r0 = java.util.Collections.EMPTY_LIST     // Catch: java.lang.Throwable -> L7c
        L99:
            if (r10 == 0) goto L9e
            r10.close()
        L9e:
            return r0
        L9f:
            if (r10 == 0) goto La4
            r10.close()
        La4:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kug.v(java.lang.String):java.util.List");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00a0, code lost:
    
        r0 = r8.f;
        r8.o(r0);
        r0.c.b("Read more than the max allowed user properties, ignoring excess", 1000);
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x011d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List w(java.lang.String r18, java.lang.String r19, java.lang.String r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 289
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kug.w(java.lang.String, java.lang.String, java.lang.String):java.util.List");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:(7:14|126|15|121|16|(3:18|(1:20)|(3:49|(3:52|(1:1)(1:142)|50)|138)(1:137))(10:21|128|22|130|23|(1:25)|26|(1:28)|47|(0)(0))|139)(1:136)|123|91|92|(2:94|(1:96)(3:133|97|98))(2:99|(2:102|(1:104)(3:134|114|115))(1:101))|105|106|124|107|(1:109)|113|141|139) */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x02e0, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x02e1, code lost:
    
        r3 = r27.y;
        r4 = r3.f;
        r3.o(r4);
        r4.c.c("Error updating raw event. appId", defpackage.lab.b(r6.a), r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02cb A[Catch: SQLiteException -> 0x02e0, TRY_LEAVE, TryCatch #3 {SQLiteException -> 0x02e0, blocks: (B:107:0x02b0, B:109:0x02cb), top: B:124:0x02b0 }] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x011f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0227 A[Catch: IOException -> 0x0303, TRY_ENTER, TryCatch #1 {IOException -> 0x0303, blocks: (B:91:0x021d, B:94:0x0227, B:105:0x025f, B:97:0x0238, B:98:0x0241, B:99:0x0242, B:102:0x0249, B:104:0x0259, B:114:0x02f9, B:115:0x0302), top: B:123:0x021d }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0242 A[Catch: IOException -> 0x0303, TryCatch #1 {IOException -> 0x0303, blocks: (B:91:0x021d, B:94:0x0227, B:105:0x025f, B:97:0x0238, B:98:0x0241, B:99:0x0242, B:102:0x0249, B:104:0x0259, B:114:0x02f9, B:115:0x0302), top: B:123:0x021d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void x(java.lang.String r28, java.lang.Long r29, java.lang.String r30, android.os.Bundle r31) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 793
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kug.x(java.lang.String, java.lang.Long, java.lang.String, android.os.Bundle):void");
    }

    public final void y() {
        ag();
        e().beginTransaction();
    }

    public final void z(String str) {
        kun kunVarL;
        al("events_snapshot", str);
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = e().query("events", (String[]) Collections.singletonList("name").toArray(new String[0]), "app_id=?", new String[]{str}, null, null, null);
                if (cursorQuery.moveToFirst()) {
                    do {
                        String string = cursorQuery.getString(0);
                        if (string != null && (kunVarL = l("events", str, string)) != null) {
                            K("events_snapshot", kunVarL);
                        }
                    } while (cursorQuery.moveToNext());
                }
            } catch (SQLiteException e2) {
                lbk lbkVar = this.y;
                lab labVar = lbkVar.f;
                lbkVar.o(labVar);
                labVar.c.c("Error creating snapshot. appId", lab.b(str), e2);
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        } finally {
        }
    }

    @Override // defpackage.lht
    protected final void b() {
    }
}
