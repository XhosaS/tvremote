package defpackage;

import android.content.ContentProvider;
import android.content.ContentProviderResult;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.content.OperationApplicationException;
import android.content.UriMatcher;
import android.database.SQLException;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.libraries.mediahome.providers.video.database.Database;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class prz extends ContentProvider {
    public static final /* synthetic */ int a = 0;
    private static final tui b = tui.l("com/google/android/libraries/mediahome/providers/video/BaseVideoProvider");
    private static final UriMatcher c;
    private final ThreadLocal d = new ThreadLocal();
    private volatile Database e;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        c = uriMatcher;
        uriMatcher.addURI("com.google.android.mediahome.video", "channel", 1);
        uriMatcher.addURI("com.google.android.mediahome.video", "channel/#", 2);
        uriMatcher.addURI("com.google.android.mediahome.video", "preview_program", 3);
        uriMatcher.addURI("com.google.android.mediahome.video", "preview_program/#", 4);
        uriMatcher.addURI("com.google.android.mediahome.video", "watch_next_program", 5);
        uriMatcher.addURI("com.google.android.mediahome.video", "watch_next_program/#", 6);
    }

    private static Uri i(Uri uri, String str) {
        return uri.buildUpon().clearQuery().appendQueryParameter("package", str).build();
    }

    private static Uri j(Uri uri, long j) {
        return uri.buildUpon().clearQuery().appendQueryParameter("channel", String.valueOf(j)).build();
    }

    private final Database k() {
        if (this.e == null) {
            synchronized (prz.class) {
                if (this.e == null) {
                    this.e = Database.y(d());
                }
            }
        }
        return this.e;
    }

    private final void l(Uri uri) {
        Set set = (Set) this.d.get();
        if (set != null) {
            set.add(uri);
        } else {
            d().getContentResolver().notifyChange(uri, null);
        }
    }

    protected abstract long a();

    @Override // android.content.ContentProvider
    public final ContentProviderResult[] applyBatch(ArrayList arrayList) {
        this.d.set(new HashSet());
        return (ContentProviderResult[]) k().e(new grz(this, arrayList, 9, null));
    }

    protected abstract long b();

    @Override // android.content.ContentProvider
    public final int bulkInsert(Uri uri, ContentValues[] contentValuesArr) {
        f();
        this.d.set(new HashSet());
        return ((Integer) k().e(new hbn(this, uri, contentValuesArr, 11, (short[]) null))).intValue();
    }

    protected abstract long c();

    protected final Context d() {
        Context context = getContext();
        if (context != null) {
            return context;
        }
        throw new NullPointerException("Context cannot be null");
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x013f  */
    @Override // android.content.ContentProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int delete(android.net.Uri r8, java.lang.String r9, java.lang.String[] r10) {
        /*
            Method dump skipped, instructions count: 360
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.prz.delete(android.net.Uri, java.lang.String, java.lang.String[]):int");
    }

    public final /* synthetic */ Integer e(Uri uri, ContentValues[] contentValuesArr) {
        ThreadLocal threadLocal = this.d;
        int iBulkInsert = super.bulkInsert(uri, contentValuesArr);
        Set set = (Set) threadLocal.get();
        Context contextD = d();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            contextD.getContentResolver().notifyChange((Uri) it.next(), null);
        }
        return Integer.valueOf(iBulkInsert);
    }

    protected abstract void f();

    protected abstract boolean g();

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        switch (c.match(uri)) {
            case 1:
                return "vnd.android.cursor.dir/channel";
            case 2:
                return "vnd.android.cursor.item/channel";
            case 3:
                return "vnd.android.cursor.dir/preview_program";
            case 4:
                return "vnd.android.cursor.item/preview_program";
            case 5:
                return "vnd.android.cursor.dir/watch_next_program";
            case 6:
                return "vnd.android.cursor.item/watch_next_program";
            default:
                throw new IllegalArgumentException("Unknown URI ".concat(String.valueOf(String.valueOf(uri))));
        }
    }

    public final /* synthetic */ ContentProviderResult[] h(ArrayList arrayList) throws OperationApplicationException {
        ThreadLocal threadLocal = this.d;
        ContentProviderResult[] contentProviderResultArrApplyBatch = super.applyBatch(arrayList);
        Set set = (Set) threadLocal.get();
        Context contextD = d();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            contextD.getContentResolver().notifyChange((Uri) it.next(), null);
        }
        return contentProviderResultArrApplyBatch;
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        byte[] bArr = null;
        if (contentValues != null) {
            f();
            String callingPackage = getCallingPackage();
            if (!TextUtils.isEmpty(callingPackage)) {
                int i = 1;
                switch (c.match(uri)) {
                    case 1:
                        long jLongValue = ((Long) gez.j(((psv) k().z()).a, true, false, new psn(callingPackage, 2))).longValue();
                        long jA = a();
                        if (jLongValue >= jA) {
                            throw new IllegalStateException(String.format("Failed to insert channel: the app already has max number (%d) of channels created.", Long.valueOf(jA)));
                        }
                        contentValues.put("package_name", callingPackage);
                        psl pslVarZ = k().z();
                        psh pshVar = new psh();
                        psh.a(pshVar, contentValues);
                        long jLongValue2 = ((Long) gez.j(((psv) pslVarZ).a, false, true, new jzu(pslVarZ, pshVar, 16))).longValue();
                        if (jLongValue2 <= 0) {
                            throw new SQLException("Failed to insert row into channels");
                        }
                        Uri uriI = i(ContentUris.withAppendedId(tdh.a, jLongValue2), callingPackage);
                        l(uriI);
                        return uriI;
                    case 2:
                    case 4:
                    case 6:
                        throw new UnsupportedOperationException("Cannot insertChannel into that URI: ".concat(String.valueOf(String.valueOf(uri))));
                    case 3:
                        if (!contentValues.containsKey("type")) {
                            throw new IllegalArgumentException("Missing the required column: type");
                        }
                        if (!contentValues.containsKey("channel_id")) {
                            throw new IllegalArgumentException("Missing the required column: channel_id");
                        }
                        Long asLong = contentValues.getAsLong("channel_id");
                        asLong.getClass();
                        long jLongValue3 = asLong.longValue();
                        long jLongValue4 = ((Long) gez.j(((psv) k().z()).a, true, false, new ikb(jLongValue3, callingPackage, 4))).longValue();
                        long jB = b();
                        if (jLongValue4 >= jB) {
                            throw new IllegalStateException(String.format("Failed to insert preview program: the app already has max number (%d) of programs created in the channel.", Long.valueOf(jB)));
                        }
                        contentValues.put("package_name", callingPackage);
                        psl pslVarZ2 = k().z();
                        psj psjVar = new psj();
                        psj.b(psjVar, contentValues);
                        long jLongValue5 = ((Long) gez.j(((psv) pslVarZ2).a, false, true, new jzu(pslVarZ2, psjVar, 15))).longValue();
                        if (jLongValue5 <= 0) {
                            throw new SQLException("Failed to insert row into preview_programs");
                        }
                        Uri uriJ = j(ContentUris.withAppendedId(tdi.a, jLongValue5), jLongValue3);
                        l(uriJ);
                        return uriJ;
                    case 5:
                        if (!contentValues.containsKey("type")) {
                            throw new IllegalArgumentException("Missing the required column: type");
                        }
                        if (!g() || !contentValues.containsKey("package_name")) {
                            contentValues.put("package_name", callingPackage);
                        }
                        psl pslVarZ3 = k().z();
                        String asString = contentValues.getAsString("package_name");
                        asString.getClass();
                        long jLongValue6 = ((Long) gez.j(((psv) pslVarZ3).a, true, false, new psn(asString, i))).longValue();
                        long jC = c();
                        if (jLongValue6 >= jC) {
                            throw new IllegalStateException(String.format("Failed to insert watch next program : the app already has max number (%d) of programs created.", Long.valueOf(jC)));
                        }
                        psl pslVarZ4 = k().z();
                        psw pswVar = new psw();
                        psw.b(pswVar, contentValues);
                        long jLongValue7 = ((Long) gez.j(((psv) pslVarZ4).a, false, true, new jzu(pslVarZ4, pswVar, 20, bArr))).longValue();
                        if (jLongValue7 <= 0) {
                            throw new SQLException("Failed to insert row into watch_next_programs");
                        }
                        Uri uriWithAppendedId = ContentUris.withAppendedId(tdj.a, jLongValue7);
                        l(uriWithAppendedId);
                        return uriWithAppendedId;
                    default:
                        throw new IllegalArgumentException("Unknown URI ".concat(String.valueOf(String.valueOf(uri))));
                }
            }
        }
        return null;
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        ((tug) ((tug) b.e()).j("com/google/android/libraries/mediahome/providers/video/BaseVideoProvider", "onCreate", 86, "BaseVideoProvider.java")).s("Creating VideoProvider");
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x01f0, code lost:
    
        if (r0 >= r11.length) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01f2, code lost:
    
        r5 = r11[r0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01f4, code lost:
    
        if (r0 <= 0) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01f6, code lost:
    
        r4.append(", ");
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01fb, code lost:
    
        r4.append(r5);
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0201, code lost:
    
        r4.append(' ');
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0207, code lost:
    
        r4.append("* ");
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x020c, code lost:
    
        r4.append("FROM ");
        r4.append(r1);
        defpackage.ghr.a(r4, " WHERE ", r2);
        defpackage.ghr.a(r4, " GROUP BY ", null);
        defpackage.ghr.a(r4, " HAVING ", null);
        defpackage.ghr.a(r4, " ORDER BY ", r14);
        defpackage.ghr.a(r4, " LIMIT ", null);
        r14 = new defpackage.ghj(r4.toString(), r13);
        r12.m();
        r12.n();
        r11 = r12.d().b().a(r14);
        r11.setNotificationUri(d().getContentResolver(), r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0253, code lost:
    
        return r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0109, code lost:
    
        if (g() == false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x010b, code lost:
    
        r12 = r10.getQueryParameter("package");
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0115, code lost:
    
        if (android.text.TextUtils.isEmpty(r12) != false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0117, code lost:
    
        r2 = android.database.DatabaseUtils.concatenateWhere(r2, defpackage.a.cg(r12, "package_name='", "'"));
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0120, code lost:
    
        r2 = android.database.DatabaseUtils.concatenateWhere(r2, "package_name='" + getCallingPackage() + "'");
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0137, code lost:
    
        r1 = "watch_next_programs";
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0145, code lost:
    
        switch(defpackage.prz.c.match(r10)) {
            case 1: goto L85;
            case 2: goto L84;
            case 3: goto L81;
            case 4: goto L79;
            case 5: goto L78;
            case 6: goto L77;
            default: goto L75;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x015b, code lost:
    
        throw new java.lang.IllegalArgumentException("Unknown URI: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(r10))));
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x015c, code lost:
    
        r12 = defpackage.psw.R;
        r2 = android.database.DatabaseUtils.concatenateWhere(r2, "_id=".concat(java.lang.String.valueOf(r10.getLastPathSegment())));
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x016f, code lost:
    
        r12 = defpackage.psw.R;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0172, code lost:
    
        r12 = defpackage.psj.R;
        r2 = android.database.DatabaseUtils.concatenateWhere(r2, "_id=".concat(java.lang.String.valueOf(r10.getLastPathSegment())));
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0184, code lost:
    
        r1 = "preview_programs";
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0186, code lost:
    
        r12 = defpackage.psj.R;
        r1 = r10.getQueryParameter("channel");
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x018e, code lost:
    
        if (r1 == null) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0190, code lost:
    
        r2 = android.database.DatabaseUtils.concatenateWhere(r2, "channel_id=" + java.lang.Long.parseLong(r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01a7, code lost:
    
        r12 = defpackage.psh.a;
        r2 = android.database.DatabaseUtils.concatenateWhere(r2, "_id=".concat(java.lang.String.valueOf(r10.getLastPathSegment())));
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01ba, code lost:
    
        r12 = defpackage.psh.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01bc, code lost:
    
        r1 = "channels";
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01bd, code lost:
    
        r3 = defpackage.ghr.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01bf, code lost:
    
        if (r11 != null) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01c1, code lost:
    
        r11 = (java.lang.String[]) r12.keySet().toArray(new java.lang.String[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01d2, code lost:
    
        if (true != android.text.TextUtils.isEmpty(r14)) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01d4, code lost:
    
        r14 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01d5, code lost:
    
        r12 = k();
        r13 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01d9, code lost:
    
        if (r13 != null) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01db, code lost:
    
        r13 = new java.lang.Object[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01dd, code lost:
    
        r4 = new java.lang.StringBuilder(android.support.v7.appcompat.R.styleable.AppCompatTheme_windowFixedHeightMajor);
        r4.append("SELECT ");
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01e9, code lost:
    
        if (r11 == null) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01ec, code lost:
    
        if (r11.length != 0) goto L101;
     */
    @Override // android.content.ContentProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.database.Cursor query(android.net.Uri r10, java.lang.String[] r11, java.lang.String r12, java.lang.String[] r13, java.lang.String r14) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 612
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.prz.query(android.net.Uri, java.lang.String[], java.lang.String, java.lang.String[], java.lang.String):android.database.Cursor");
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        f();
        int iIntValue = 0;
        if (contentValues == null) {
            return 0;
        }
        UriMatcher uriMatcher = c;
        switch (uriMatcher.match(uri)) {
            case 1:
            case 3:
            case 5:
                if (!contentValues.containsKey("_id")) {
                    throw new IllegalArgumentException("ID is required to make update");
                }
                break;
            case 2:
            case 4:
            case 6:
                if (!contentValues.containsKey("_id")) {
                    contentValues.put("_id", uri.getLastPathSegment());
                    break;
                } else if (!TextUtils.equals(contentValues.getAsString("_id"), uri.getLastPathSegment())) {
                    throw new IllegalArgumentException("Not allowed to change ID.");
                }
                break;
        }
        if (contentValues.containsKey("package_name") && !g() && !TextUtils.equals(contentValues.getAsString("package_name"), getCallingPackage())) {
            throw new IllegalArgumentException("Not allowed to change package name.");
        }
        Long asLong = contentValues.getAsLong("_id");
        if (asLong == null) {
            throw new IllegalArgumentException("Id cannot be null.");
        }
        switch (uriMatcher.match(uri)) {
            case 1:
            case 2:
                psh pshVar = (psh) gez.j(((psv) k().z()).a, true, false, new dth(asLong.longValue(), 4));
                if (pshVar != null) {
                    if (!TextUtils.equals(pshVar.c, getCallingPackage()) && !g()) {
                        throw new SecurityException("Accessing data of other package is not allowed");
                    }
                    psh.a(pshVar, contentValues);
                    psl pslVarZ = k().z();
                    iIntValue = ((Integer) gez.j(((psv) pslVarZ).a, false, true, new jzu(pslVarZ, pshVar, 19))).intValue();
                    uri = i(uri, pshVar.c);
                    break;
                }
                break;
            case 3:
            case 4:
                psj psjVarB = k().z().b(asLong.longValue());
                if (psjVarB != null) {
                    if (!TextUtils.equals(psjVarB.c, getCallingPackage()) && !g()) {
                        throw new SecurityException("Accessing data of other package is not allowed");
                    }
                    psj.b(psjVarB, contentValues);
                    psl pslVarZ2 = k().z();
                    iIntValue = ((Integer) gez.j(((psv) pslVarZ2).a, false, true, new jzu(pslVarZ2, psjVarB, 17))).intValue();
                    uri = j(uri, psjVarB.S);
                    break;
                }
                break;
            case 5:
            case 6:
                psl pslVarZ3 = k().z();
                final long jLongValue = asLong.longValue();
                psw pswVar = (psw) gez.j(((psv) pslVarZ3).a, true, false, new yjv() { // from class: pso
                    @Override // defpackage.yjv
                    public final Object a(Object obj) {
                        psw pswVar2;
                        ghi ghiVarA = ((gic) obj).a("SELECT * FROM watch_next_programs WHERE _id= ?");
                        try {
                            ghiVarA.g(1, jLongValue);
                            int iJ = gez.J(ghiVarA, "watch_next_type");
                            int iJ2 = gez.J(ghiVarA, "last_engagement_time_utc_millis");
                            int iJ3 = gez.J(ghiVarA, "_id");
                            int iJ4 = gez.J(ghiVarA, "package_name");
                            int iJ5 = gez.J(ghiVarA, "author");
                            int iJ6 = gez.J(ghiVarA, "availability");
                            int iJ7 = gez.J(ghiVarA, "canonical_genre");
                            int iJ8 = gez.J(ghiVarA, "content_id");
                            int iJ9 = gez.J(ghiVarA, "content_rating");
                            int iJ10 = gez.J(ghiVarA, "duration_millis");
                            int iJ11 = gez.J(ghiVarA, "episode_display_number");
                            int iJ12 = gez.J(ghiVarA, "episode_title");
                            int iJ13 = gez.J(ghiVarA, "genre");
                            int iJ14 = gez.J(ghiVarA, "intent_uri");
                            int iJ15 = gez.J(ghiVarA, "interaction_count");
                            int iJ16 = gez.J(ghiVarA, "interaction_type");
                            int iJ17 = gez.J(ghiVarA, "internal_provider_id");
                            int iJ18 = gez.J(ghiVarA, "item_count");
                            int iJ19 = gez.J(ghiVarA, "last_playback_position_millis");
                            int iJ20 = gez.J(ghiVarA, "live");
                            int iJ21 = gez.J(ghiVarA, "logo_uri");
                            int iJ22 = gez.J(ghiVarA, "logo_content_description");
                            int iJ23 = gez.J(ghiVarA, "offer_price");
                            int iJ24 = gez.J(ghiVarA, "poster_art_aspect_ratio");
                            int iJ25 = gez.J(ghiVarA, "poster_art_uri");
                            int iJ26 = gez.J(ghiVarA, "preview_audio_uri");
                            int iJ27 = gez.J(ghiVarA, "preview_video_uri");
                            int iJ28 = gez.J(ghiVarA, "release_date");
                            int iJ29 = gez.J(ghiVarA, "review_rating");
                            int iJ30 = gez.J(ghiVarA, "review_rating_style");
                            int iJ31 = gez.J(ghiVarA, "season_display_number");
                            int iJ32 = gez.J(ghiVarA, "season_title");
                            int iJ33 = gez.J(ghiVarA, "short_description");
                            int iJ34 = gez.J(ghiVarA, "start_time_utc_millis");
                            int iJ35 = gez.J(ghiVarA, "end_time_utc_millis");
                            int iJ36 = gez.J(ghiVarA, "starting_price");
                            int iJ37 = gez.J(ghiVarA, "poster_thumbnail_aspect_ratio");
                            int iJ38 = gez.J(ghiVarA, "thumbnail_uri");
                            int iJ39 = gez.J(ghiVarA, "title");
                            int iJ40 = gez.J(ghiVarA, "type");
                            int iJ41 = gez.J(ghiVarA, "series_id");
                            int iJ42 = gez.J(ghiVarA, "tv_series_item_type");
                            int iJ43 = gez.J(ghiVarA, "video_height");
                            int iJ44 = gez.J(ghiVarA, "video_width");
                            if (ghiVarA.l()) {
                                pswVar2 = new psw();
                                pswVar2.S = (int) ghiVarA.b(iJ);
                                pswVar2.T = ghiVarA.b(iJ2);
                                pswVar2.b = ghiVarA.b(iJ3);
                                if (ghiVarA.k(iJ4)) {
                                    pswVar2.c = null;
                                } else {
                                    pswVar2.c = ghiVarA.d(iJ4);
                                }
                                if (ghiVarA.k(iJ5)) {
                                    pswVar2.d = null;
                                } else {
                                    pswVar2.d = ghiVarA.d(iJ5);
                                }
                                pswVar2.e = (int) ghiVarA.b(iJ6);
                                if (ghiVarA.k(iJ7)) {
                                    pswVar2.f = null;
                                } else {
                                    pswVar2.f = ghiVarA.d(iJ7);
                                }
                                if (ghiVarA.k(iJ8)) {
                                    pswVar2.g = null;
                                } else {
                                    pswVar2.g = ghiVarA.d(iJ8);
                                }
                                if (ghiVarA.k(iJ9)) {
                                    pswVar2.h = null;
                                } else {
                                    pswVar2.h = ghiVarA.d(iJ9);
                                }
                                pswVar2.i = ghiVarA.b(iJ10);
                                if (ghiVarA.k(iJ11)) {
                                    pswVar2.j = null;
                                } else {
                                    pswVar2.j = ghiVarA.d(iJ11);
                                }
                                if (ghiVarA.k(iJ12)) {
                                    pswVar2.k = null;
                                } else {
                                    pswVar2.k = ghiVarA.d(iJ12);
                                }
                                if (ghiVarA.k(iJ13)) {
                                    pswVar2.l = null;
                                } else {
                                    pswVar2.l = ghiVarA.d(iJ13);
                                }
                                if (ghiVarA.k(iJ14)) {
                                    pswVar2.m = null;
                                } else {
                                    pswVar2.m = ghiVarA.d(iJ14);
                                }
                                pswVar2.n = ghiVarA.b(iJ15);
                                pswVar2.o = (int) ghiVarA.b(iJ16);
                                if (ghiVarA.k(iJ17)) {
                                    pswVar2.p = null;
                                } else {
                                    pswVar2.p = ghiVarA.d(iJ17);
                                }
                                pswVar2.q = (int) ghiVarA.b(iJ18);
                                pswVar2.r = ghiVarA.b(iJ19);
                                pswVar2.s = ((int) ghiVarA.b(iJ20)) != 0;
                                if (ghiVarA.k(iJ21)) {
                                    pswVar2.t = null;
                                } else {
                                    pswVar2.t = ghiVarA.d(iJ21);
                                }
                                if (ghiVarA.k(iJ22)) {
                                    pswVar2.u = null;
                                } else {
                                    pswVar2.u = ghiVarA.d(iJ22);
                                }
                                if (ghiVarA.k(iJ23)) {
                                    pswVar2.v = null;
                                } else {
                                    pswVar2.v = ghiVarA.d(iJ23);
                                }
                                pswVar2.w = (int) ghiVarA.b(iJ24);
                                if (ghiVarA.k(iJ25)) {
                                    pswVar2.x = null;
                                } else {
                                    pswVar2.x = ghiVarA.d(iJ25);
                                }
                                if (ghiVarA.k(iJ26)) {
                                    pswVar2.y = null;
                                } else {
                                    pswVar2.y = ghiVarA.d(iJ26);
                                }
                                if (ghiVarA.k(iJ27)) {
                                    pswVar2.z = null;
                                } else {
                                    pswVar2.z = ghiVarA.d(iJ27);
                                }
                                if (ghiVarA.k(iJ28)) {
                                    pswVar2.A = null;
                                } else {
                                    pswVar2.A = ghiVarA.d(iJ28);
                                }
                                if (ghiVarA.k(iJ29)) {
                                    pswVar2.B = null;
                                } else {
                                    pswVar2.B = ghiVarA.d(iJ29);
                                }
                                pswVar2.C = (int) ghiVarA.b(iJ30);
                                if (ghiVarA.k(iJ31)) {
                                    pswVar2.D = null;
                                } else {
                                    pswVar2.D = ghiVarA.d(iJ31);
                                }
                                if (ghiVarA.k(iJ32)) {
                                    pswVar2.E = null;
                                } else {
                                    pswVar2.E = ghiVarA.d(iJ32);
                                }
                                if (ghiVarA.k(iJ33)) {
                                    pswVar2.F = null;
                                } else {
                                    pswVar2.F = ghiVarA.d(iJ33);
                                }
                                pswVar2.G = ghiVarA.b(iJ34);
                                pswVar2.H = ghiVarA.b(iJ35);
                                if (ghiVarA.k(iJ36)) {
                                    pswVar2.I = null;
                                } else {
                                    pswVar2.I = ghiVarA.d(iJ36);
                                }
                                pswVar2.J = (int) ghiVarA.b(iJ37);
                                if (ghiVarA.k(iJ38)) {
                                    pswVar2.K = null;
                                } else {
                                    pswVar2.K = ghiVarA.d(iJ38);
                                }
                                if (ghiVarA.k(iJ39)) {
                                    pswVar2.L = null;
                                } else {
                                    pswVar2.L = ghiVarA.d(iJ39);
                                }
                                pswVar2.M = (int) ghiVarA.b(iJ40);
                                if (ghiVarA.k(iJ41)) {
                                    pswVar2.N = null;
                                } else {
                                    pswVar2.N = ghiVarA.d(iJ41);
                                }
                                pswVar2.O = (int) ghiVarA.b(iJ42);
                                pswVar2.P = (int) ghiVarA.b(iJ43);
                                pswVar2.Q = (int) ghiVarA.b(iJ44);
                            } else {
                                pswVar2 = null;
                            }
                            return pswVar2;
                        } finally {
                            ghiVarA.close();
                        }
                    }
                });
                if (pswVar != null) {
                    if (!TextUtils.equals(pswVar.c, getCallingPackage()) && !g()) {
                        throw new SecurityException("Accessing data of other package is not allowed");
                    }
                    psl pslVarZ4 = k().z();
                    psw.b(pswVar, contentValues);
                    iIntValue = ((Integer) gez.j(((psv) pslVarZ4).a, false, true, new jzu(pslVarZ4, pswVar, 18, null))).intValue();
                    break;
                }
                break;
            default:
                throw new IllegalArgumentException("Unknown URI: ".concat(String.valueOf(String.valueOf(uri))));
        }
        if (iIntValue > 0) {
            l(uri);
        }
        return iIntValue;
    }
}
