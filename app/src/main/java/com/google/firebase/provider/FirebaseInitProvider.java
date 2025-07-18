package com.google.firebase.provider;

import android.app.Application;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.katniss.R;
import defpackage.aagz;
import defpackage.aahd;
import defpackage.aahf;
import defpackage.aahp;
import defpackage.aahq;
import defpackage.kft;
import defpackage.kkk;
import defpackage.kkr;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class FirebaseInitProvider extends ContentProvider {
    public static final aahq a = new aagz(System.currentTimeMillis(), SystemClock.elapsedRealtime(), SystemClock.uptimeMillis());
    public static final AtomicBoolean b = new AtomicBoolean(false);

    @Override // android.content.ContentProvider
    public final void attachInfo(Context context, ProviderInfo providerInfo) {
        kkk.l(providerInfo, "FirebaseInitProvider ProviderInfo cannot be null.");
        if ("com.google.firebase.firebaseinitprovider".equals(providerInfo.authority)) {
            throw new IllegalStateException("Incorrect provider authority in manifest. Most likely due to a missing applicationId variable in application's build.gradle.");
        }
        super.attachInfo(context, providerInfo);
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        aahf aahfVar;
        aahf aahfVar2;
        aahf aahfVarA;
        try {
            b.set(true);
            Context context = getContext();
            Object obj = aahf.a;
            synchronized (obj) {
                Map map = aahf.b;
                if (map.containsKey("[DEFAULT]")) {
                    aahfVarA = aahf.a();
                } else {
                    kkk.k(context);
                    Resources resources = context.getResources();
                    String resourcePackageName = resources.getResourcePackageName(R.string.common_google_play_services_unknown_issue);
                    String strA = kkr.a("google_app_id", resources, resourcePackageName);
                    aahp aahpVar = null;
                    if (TextUtils.isEmpty(strA)) {
                        aahfVar = null;
                    } else {
                        aahfVar = null;
                        aahpVar = new aahp(strA, kkr.a("google_api_key", resources, resourcePackageName), kkr.a("firebase_database_url", resources, resourcePackageName), kkr.a("ga_trackingId", resources, resourcePackageName), kkr.a("gcm_defaultSenderId", resources, resourcePackageName), kkr.a("google_storage_bucket", resources, resourcePackageName), kkr.a("project_id", resources, resourcePackageName));
                    }
                    if (aahpVar == null) {
                        Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                        aahfVarA = aahfVar;
                    } else {
                        AtomicReference atomicReference = aahd.a;
                        if (context.getApplicationContext() instanceof Application) {
                            Application application = (Application) context.getApplicationContext();
                            AtomicReference atomicReference2 = aahd.a;
                            if (atomicReference2.get() == null) {
                                aahd aahdVar = new aahd();
                                while (true) {
                                    if (atomicReference2.compareAndSet(aahfVar, aahdVar)) {
                                        kft.b(application);
                                        kft.a.a(aahdVar);
                                        break;
                                    }
                                    if (atomicReference2.get() != null) {
                                        break;
                                    }
                                }
                            }
                        }
                        if (context.getApplicationContext() != null) {
                            context = context.getApplicationContext();
                        }
                        synchronized (obj) {
                            kkk.g(true ^ map.containsKey("[DEFAULT]"), "FirebaseApp name [DEFAULT] already exists!");
                            kkk.l(context, "Application context cannot be null.");
                            aahfVar2 = new aahf(context, "[DEFAULT]", aahpVar);
                            map.put("[DEFAULT]", aahfVar2);
                            aahfVar2.e();
                        }
                        aahfVarA = aahfVar2;
                    }
                }
            }
            if (aahfVarA == null) {
                Log.i("FirebaseInitProvider", "FirebaseApp initialization unsuccessful");
            } else {
                Log.i("FirebaseInitProvider", "FirebaseApp initialization successful");
            }
            return false;
        } finally {
            b.set(false);
        }
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
