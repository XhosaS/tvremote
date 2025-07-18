package defpackage;

import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.Bundle;
import android.os.StrictMode;
import android.view.View;
import com.google.android.videos.R;
import j$.util.DesugarCollections;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class pgc implements tsl {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ pgc(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, yjv] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, yjv] */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, yjv] */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, yjv] */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, yjv] */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, yjv] */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, java.util.concurrent.ConcurrentMap] */
    /* JADX WARN: Type inference failed for: r0v40, types: [android.content.ComponentCallbacks, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v111, types: [java.lang.Object, java.util.Set] */
    @Override // defpackage.tsl
    public final Object apply(Object obj) {
        smn smnVar;
        SQLiteDatabase sQLiteDatabaseE;
        byte b = 0;
        switch (this.b) {
            case 0:
                int i = pgd.a;
                return Boolean.valueOf(((String) this.a).equals(((View) obj).getTag(R.id.growthkit_view_tag)));
            case 1:
                int i2 = pgd.a;
                return Boolean.valueOf(((String) this.a).equals(((View) obj).getTag(R.id.growthkit_view_tag)));
            case 2:
                tvn tvnVar = pgh.a;
                Iterator it = ((List) obj).iterator();
                while (true) {
                    Object obj2 = this.a;
                    if (!it.hasNext()) {
                        return obj2;
                    }
                    Bundle bundle = (Bundle) it.next();
                    if (bundle != null) {
                        ((Intent) obj2).putExtras(bundle);
                    }
                }
            case 3:
                prt prtVar = (prt) obj;
                if (!pro.i(prtVar)) {
                    return ((pro) this.a).a();
                }
                uzr uzrVar = prtVar.b;
                if (uzrVar == null) {
                    uzrVar = uzr.a;
                }
                return tst.i(uzrVar);
            case 4:
                return this.a.a(obj);
            case 5:
                return this.a.a(obj);
            case 6:
                int i3 = pwz.a;
                return this.a.a(obj);
            case 7:
                return this.a.a(obj);
            case 8:
                return this.a.a(obj);
            case 9:
                return this.a.a(obj);
            case 10:
                try {
                    return new ProcessBuilder("/system/bin/trigger_perfetto", (String) obj).start();
                } catch (IOException unused) {
                    ((rqk) this.a).b = true;
                    return null;
                }
            case 11:
                oou oouVar = ((oox) ((nxb) obj).a).a;
                ocv.aF(oouVar);
                int i4 = oouVar.a;
                boolean z = i4 == 1 || i4 == 3;
                Object obj3 = this.a;
                Boolean boolValueOf = Boolean.valueOf(z);
                ((AtomicReference) ((uho) obj3).a).set(boolValueOf);
                return boolValueOf;
            case 12:
                return (rym) ((unc) this.a).e.get((String) obj);
            case 13:
                int i5 = ryy.a;
                vtw vtwVarM = rxx.a.m();
                for (Map.Entry entry : DesugarCollections.unmodifiableMap(((rxx) obj).b).entrySet()) {
                    Object obj4 = this.a;
                    rxv rxvVar = (rxv) entry.getValue();
                    vtw vtwVarM2 = rxv.a.m();
                    if (!rxvVar.d.equals(obj4)) {
                        String str = rxvVar.d;
                        if (!vtwVarM2.b.A()) {
                            vtwVarM2.u();
                        }
                        rxv rxvVar2 = (rxv) vtwVarM2.b;
                        str.getClass();
                        rxvVar2.b |= 1;
                        rxvVar2.d = str;
                    }
                    for (String str2 : rxvVar.c) {
                        if (!str2.equals(obj4)) {
                            vtwVarM2.al(str2);
                        }
                    }
                    vtwVarM.am((String) entry.getKey(), (rxv) vtwVarM2.r());
                }
                return (rxx) vtwVarM.r();
            case 14:
                int i6 = ryy.a;
                rxv rxvVar3 = rxv.a;
                vve vveVar = ((rxx) obj).b;
                Object obj5 = this.a;
                if (vveVar.containsKey(obj5)) {
                    rxvVar3 = (rxv) vveVar.get(obj5);
                }
                return rxvVar3.c;
            case 15:
                int i7 = ryy.a;
                Object obj6 = this.a;
                rxv rxvVar4 = rxv.a;
                obj6.getClass();
                vve vveVar2 = ((rxx) obj).b;
                if (vveVar2.containsKey(obj6)) {
                    rxvVar4 = (rxv) vveVar2.get(obj6);
                }
                return rxvVar4.d;
            case 16:
                rxt rxtVar = (rxt) obj;
                uri uriVar = new uri();
                StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskWrites().build());
                Object obj7 = this.a;
                try {
                    try {
                        synchronized (rzk.a) {
                            aafi aafiVar = (aafi) ((rzk) obj7).f.get();
                            Uri uri = ((rzk) obj7).i;
                            rxq rxqVar = rxtVar.c;
                            if (rxqVar == null) {
                                rxqVar = rxq.b;
                            }
                            skr skrVar = new skr(rxqVar);
                            skrVar.a = new uri[]{uriVar};
                            aafiVar.r(uri, skrVar);
                            rxq rxqVar2 = rxtVar.c;
                            if (rxqVar2 == null) {
                                rxqVar2 = rxq.b;
                            }
                            ((rzk) obj7).j = rxqVar2;
                        }
                        synchronized (rzk.b) {
                            aafi aafiVar2 = (aafi) ((rzk) obj7).f.get();
                            Uri uri2 = ((rzk) obj7).k;
                            rxr rxrVar = rxtVar.d;
                            if (rxrVar == null) {
                                rxrVar = rxr.b;
                            }
                            skr skrVar2 = new skr(rxrVar);
                            skrVar2.a = new uri[]{uriVar};
                            aafiVar2.r(uri2, skrVar2);
                            rxr rxrVar2 = rxtVar.d;
                            if (rxrVar2 == null) {
                                rxrVar2 = rxr.b;
                            }
                            ((rzk) obj7).l = rxrVar2;
                        }
                        StrictMode.setThreadPolicy(threadPolicy);
                        return null;
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                } catch (Throwable th) {
                    StrictMode.setThreadPolicy(threadPolicy);
                    throw th;
                }
            case 17:
                ((AtomicBoolean) this.a).set(false);
                return null;
            default:
                ?? r0 = this.a;
                smq smqVar = (smq) r0;
                Context context = smqVar.b;
                File databasePath = context.getDatabasePath((String) obj);
                if (!smqVar.l) {
                    ulp ulpVar = smqVar.o;
                    String path = databasePath.getPath();
                    if (!ulpVar.a.add(path)) {
                        throw new IllegalStateException(a.cg(path, "DB ", " opened from different AsyncSQLiteOpenHelper. Are you missing a scope on your binding?"));
                    }
                    smqVar.l = true;
                    boolean zF = smq.f(context, smqVar.n);
                    smqVar.m = zF;
                    if (zF) {
                        try {
                            File cacheDir = context.getCacheDir();
                            if (cacheDir != null) {
                                ((smq) r0).m = databasePath.getCanonicalPath().startsWith(cacheDir.getCanonicalPath());
                            }
                        } catch (IOException unused2) {
                        }
                    }
                }
                Set set = smqVar.g;
                if (!set.isEmpty()) {
                    Iterator it2 = set.iterator();
                    while (it2.hasNext()) {
                        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) ((WeakReference) it2.next()).get();
                        if (sQLiteDatabase == null) {
                            it2.remove();
                        } else if (sQLiteDatabase.isOpen()) {
                            throw new IllegalStateException("Open database reference to " + sQLiteDatabase.getPath() + " already exists. Follow instructions in source to file a bug against TikTok.");
                        }
                    }
                }
                try {
                    try {
                        sQLiteDatabaseE = smq.e(((smq) r0).b, databasePath, ((smq) r0).n, ((smq) r0).d, ((smq) r0).e, ((smq) r0).f);
                    } catch (smo e2) {
                        ((tug) ((tug) ((tug) smq.a.f()).i(e2)).j("com/google/android/libraries/storage/sqlite/AsyncSQLiteOpenHelper", "innerOpenDatabase", (char) 447, "AsyncSQLiteOpenHelper.java")).s("Fatal Exception when trying to upgrade database. Proceeding to delete.");
                        try {
                            File file = new File(String.valueOf(databasePath.getPath()).concat("-wal"));
                            File file2 = new File(String.valueOf(databasePath.getPath()).concat("-journal"));
                            File file3 = new File(String.valueOf(databasePath.getPath()).concat("-shm"));
                            try {
                                if ((!file.exists() || file.delete()) && ((!file2.exists() || file2.delete()) && ((!file3.exists() || file3.delete()) && databasePath.delete()))) {
                                    throw new smm("Failed to open the database with an unrecoverable Exception. Deleted its files so the next open attempt will create a new instance.", e2);
                                }
                                throw new smn(String.format("Unable to clean up database %s", databasePath.getAbsolutePath()));
                            } finally {
                            }
                        } catch (Throwable th2) {
                            throw new smm("Recovery by deletion failed.", th2);
                        }
                    } catch (smp e3) {
                        throw new smm("Probably-recoverable database upgrade failure.", e3);
                    }
                } catch (smm | smo | smp unused3) {
                    sQLiteDatabaseE = smq.e(((smq) r0).b, databasePath, ((smq) r0).n, ((smq) r0).d, ((smq) r0).e, ((smq) r0).f);
                }
                smqVar.g.add(new WeakReference(sQLiteDatabaseE));
                smqVar.b.registerComponentCallbacks(r0);
                return sQLiteDatabaseE;
        }
    }
}
