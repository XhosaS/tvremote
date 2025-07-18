package defpackage;

import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.text.SpannableString;
import com.google.android.videos.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lyl implements idy {
    private final /* synthetic */ int a;
    private final Object b;

    public lyl(int i) {
        this.a = i;
        this.b = "Unable to fetch updated last playback";
    }

    /* JADX WARN: Type inference failed for: r3v9, types: [icv, java.lang.Object] */
    @Override // defpackage.idy
    public final /* synthetic */ void c(Object obj) {
        int i;
        ArrayList arrayList = null;
        switch (this.a) {
            case 0:
                lyh lyhVar = (lyh) obj;
                String str = lyhVar.a;
                String str2 = lyhVar.b;
                String strB = ksg.b(lyhVar.c);
                List<lyj> list = lyhVar.d;
                SQLiteDatabase sQLiteDatabaseA = ((lyz) this.b).a();
                try {
                    SQLiteStatement sQLiteStatementCompileStatement = sQLiteDatabaseA.compileStatement("INSERT OR REPLACE INTO cached_items (cache_account,cache_type,cache_key,cache_value,cache_play_country,cache_locale,cache_last_update_sec,cache_expiration_sec,cache_persistent) VALUES (?, ?, ?, ?, ?, ?, ?, ?, COALESCE((SELECT cache_persistent FROM cached_items WHERE cache_account = ? AND cache_type = ? AND cache_key = ? AND cache_play_country = ? AND cache_locale = ?), 0))");
                    for (lyj lyjVar : list) {
                        sQLiteStatementCompileStatement.bindString(1, str);
                        lyc lycVar = lyjVar.a;
                        long j = lycVar.a;
                        sQLiteStatementCompileStatement.bindLong(2, j);
                        String str3 = lycVar.b;
                        sQLiteStatementCompileStatement.bindString(3, str3);
                        sQLiteStatementCompileStatement.bindBlob(4, lyjVar.b.h());
                        sQLiteStatementCompileStatement.bindString(5, str2);
                        sQLiteStatementCompileStatement.bindString(6, strB);
                        sQLiteStatementCompileStatement.bindLong(7, lyjVar.c);
                        sQLiteStatementCompileStatement.bindLong(8, lyjVar.d);
                        sQLiteStatementCompileStatement.bindString(9, str);
                        sQLiteStatementCompileStatement.bindLong(10, j);
                        sQLiteStatementCompileStatement.bindString(11, str3);
                        sQLiteStatementCompileStatement.bindString(12, str2);
                        sQLiteStatementCompileStatement.bindString(13, strB);
                        sQLiteStatementCompileStatement.executeInsert();
                    }
                    ((lyz) this.b).f(sQLiteDatabaseA, true, 15);
                    return;
                } catch (Throwable th) {
                    ((lyz) this.b).f(sQLiteDatabaseA, false, 15);
                    throw th;
                }
            case 1:
                SQLiteDatabase sQLiteDatabaseA2 = ((lyz) this.b).a();
                if (sQLiteDatabaseA2 != null) {
                    try {
                        sQLiteDatabaseA2.delete("cached_items", "cache_persistent = 0 AND cache_expiration_sec < ?", new String[]{Long.toString(System.currentTimeMillis() / 1000)});
                        ((lyz) this.b).e(sQLiteDatabaseA2, true);
                        return;
                    } catch (Throwable th2) {
                        ((lyz) this.b).e(sQLiteDatabaseA2, false);
                        throw th2;
                    }
                }
                return;
            case 2:
                krd.d((String) this.b, (Throwable) obj);
                return;
            case 3:
                Intent intent = (Intent) obj;
                Object obj2 = this.b;
                synchronized (((dyd) obj2).b) {
                    String action = intent.getAction();
                    String strResolveTypeIfNeeded = intent.resolveTypeIfNeeded(((dyd) obj2).a.getContentResolver());
                    Uri data = intent.getData();
                    String scheme = intent.getScheme();
                    Set<String> categories = intent.getCategories();
                    boolean z = (8 & intent.getFlags()) != 0;
                    if (z) {
                        Objects.toString(intent);
                    }
                    ArrayList arrayList2 = (ArrayList) ((dyd) obj2).c.get(intent.getAction());
                    if (arrayList2 != null) {
                        if (z) {
                            Objects.toString(arrayList2);
                        }
                        int i2 = 0;
                        while (i2 < arrayList2.size()) {
                            dyc dycVar = (dyc) arrayList2.get(i2);
                            if (z) {
                                Objects.toString(dycVar.a);
                            }
                            if (dycVar.c) {
                                i = i2;
                            } else {
                                i = i2;
                                int iMatch = dycVar.a.match(action, strResolveTypeIfNeeded, scheme, data, categories, "LocalBroadcastManager");
                                if (iMatch >= 0) {
                                    if (z) {
                                        Integer.toHexString(iMatch);
                                    }
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.add(dycVar);
                                    dycVar.c = true;
                                }
                            }
                            i2 = i + 1;
                        }
                        if (arrayList != null) {
                            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                                ((dyc) arrayList.get(i3)).c = false;
                            }
                            ((dyd) obj2).d.add(new dwi(intent, arrayList));
                            Handler handler = ((dyd) obj2).e;
                            if (!handler.hasMessages(1)) {
                                handler.sendEmptyMessage(1);
                            }
                            return;
                        }
                    }
                    return;
                }
            case 4:
                krd.g((String) this.b, (Throwable) obj);
                return;
            case 5:
                kvf kvfVar = (kvf) obj;
                this.b.a(kvfVar.o(), kvfVar.E());
                return;
            case 6:
                Drawable drawable = (Drawable) obj;
                AppCompatActivity appCompatActivity = (AppCompatActivity) ((bv) this.b).getActivity();
                if (appCompatActivity == null || appCompatActivity.getSupportActionBar() == null) {
                    return;
                }
                ActionBar supportActionBar = appCompatActivity.getSupportActionBar();
                supportActionBar.setElevation(0.0f);
                supportActionBar.setBackgroundDrawable(drawable);
                return;
            default:
                String str4 = (String) obj;
                SpannableString spannableString = new SpannableString(str4);
                Object obj3 = this.b;
                spannableString.setSpan(new mwm((Context) obj3, R.style.Theme_GoogleTv_Dark), 0, str4.length(), 33);
                AppCompatActivity appCompatActivity2 = (AppCompatActivity) obj3;
                appCompatActivity2.getSupportActionBar().setTitle(spannableString);
                appCompatActivity2.setTitle((CharSequence) null);
                return;
        }
    }

    public lyl(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    public lyl(bv bvVar, int i, byte[] bArr) {
        this.a = i;
        this.b = (AppCompatActivity) bvVar.getActivity();
    }
}
