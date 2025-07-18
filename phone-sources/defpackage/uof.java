package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uof {
    public final boolean a;
    public final Object b;
    public final Object c;

    public uof(fux fuxVar, fux fuxVar2, boolean z) {
        this.b = fuxVar;
        this.c = fuxVar2;
        this.a = z;
    }

    public static uof g(char c) {
        return new uof(new ttf(new trs(c), 0));
    }

    public static uof h(String str) {
        int i = 1;
        sij.o(str.length() != 0, "The separator may not be the empty string.");
        return str.length() == 1 ? g(str.charAt(0)) : new uof(new ttf(str, i));
    }

    public static uof j(ksn ksnVar, ksy ksyVar) {
        return new uof(ksnVar, ksyVar.b);
    }

    public static uof k(ksn ksnVar, String str) {
        krf.c(str);
        return new uof(ksnVar, str);
    }

    public final synchronized boolean a() {
        return this.a;
    }

    public final Iterable b(CharSequence charSequence) {
        charSequence.getClass();
        return new tti(this, charSequence);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, ttj] */
    public final Iterator c(CharSequence charSequence) {
        return this.b.a(this, charSequence);
    }

    public final List d(CharSequence charSequence) {
        charSequence.getClass();
        Iterator itC = c(charSequence);
        ArrayList arrayList = new ArrayList();
        while (itC.hasNext()) {
            arrayList.add((String) itC.next());
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }

    public final void e(float f) {
        ((bdl) this.b).h(f);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, ttj] */
    public final uof f() {
        return new uof((ttj) this.b, true, (tsa) this.c);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, ttj] */
    public final uof i() {
        tsa tsaVar = trz.b;
        tsaVar.getClass();
        return new uof((ttj) this.b, this.a, tsaVar);
    }

    private uof(ttj ttjVar, boolean z, tsa tsaVar) {
        this.b = ttjVar;
        this.a = z;
        this.c = tsaVar;
    }

    public uof(Context context, String str) throws PackageManager.NameNotFoundException {
        Context contextCreateDeviceProtectedStorageContext = context.createDeviceProtectedStorageContext();
        this.b = contextCreateDeviceProtectedStorageContext;
        SharedPreferences sharedPreferences = contextCreateDeviceProtectedStorageContext.getSharedPreferences("com.google.firebase.common.prefs:".concat(str), 0);
        this.c = sharedPreferences;
        boolean z = true;
        if (sharedPreferences.contains("firebase_data_collection_default_enabled")) {
            z = sharedPreferences.getBoolean("firebase_data_collection_default_enabled", true);
        } else {
            try {
                Context context2 = contextCreateDeviceProtectedStorageContext;
                PackageManager packageManager = contextCreateDeviceProtectedStorageContext.getPackageManager();
                if (packageManager != null) {
                    Context context3 = contextCreateDeviceProtectedStorageContext;
                    ApplicationInfo applicationInfo = packageManager.getApplicationInfo(contextCreateDeviceProtectedStorageContext.getPackageName(), 128);
                    if (applicationInfo != null && applicationInfo.metaData != null && applicationInfo.metaData.containsKey("firebase_data_collection_default_enabled")) {
                        z = applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
                    }
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        this.a = z;
    }

    public uof(ksn ksnVar, String str) {
        ksnVar.getClass();
        this.c = ksnVar;
        this.b = str;
        this.a = TextUtils.isEmpty(str);
    }

    public uof(boolean z) {
        this.a = z;
        this.c = new AtomicReference(null);
        this.b = new bce(0.0f);
    }

    private uof(ttj ttjVar) {
        this(ttjVar, false, trx.a);
    }
}
