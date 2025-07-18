package defpackage;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.SparseArray;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lfz implements iej, ids {
    private static final lfy c = new lfy();
    public final SharedPreferences a;
    public final idr b;
    private final idy d;
    private final Map e;
    private final idr f;

    public lfz(SharedPreferences sharedPreferences, xbw xbwVar, idy idyVar, Executor executor) {
        new ConcurrentHashMap();
        this.e = new ConcurrentHashMap();
        new SparseArray();
        new ConcurrentHashMap();
        new ConcurrentHashMap();
        new ConcurrentHashMap();
        new AtomicBoolean(false);
        this.f = new idz(false);
        sharedPreferences.getClass();
        this.a = sharedPreferences;
        xbwVar.getClass();
        this.d = idyVar;
        executor.getClass();
        this.b = new idz(c);
    }

    public final int a() {
        return this.a.getInt("max_allowed_movie_rating_filter_level", -1);
    }

    public final int b() {
        return this.a.getInt("max_allowed_tv_rating_filter_level", -1);
    }

    public final ids c() {
        return this.b;
    }

    @Override // defpackage.iej
    public final synchronized void dM() {
    }

    public final idw e() {
        return new mcb(this, 1);
    }

    @Override // defpackage.ids
    public final void ea(iej iejVar) {
        this.b.ea(iejVar);
    }

    @Override // defpackage.ids
    public final void ee(iej iejVar) {
        this.b.ee(iejVar);
    }

    public final void f() {
        this.a.edit().putInt("max_allowed_movie_rating_authority", -1).putInt("max_allowed_movie_rating_filter_level", -1).putInt("max_allowed_movie_rating_safe_search_level", -1).putInt("max_allowed_tv_rating_authority", -1).putInt("max_allowed_tv_rating_filter_level", -1).putInt("max_allowed_tv_rating_safe_search_level", -1).apply();
        idr idrVar = this.b;
        lfy lfyVar = c;
        if (((lfy) idrVar.a()).equals(lfyVar)) {
            return;
        }
        this.d.c(Long.valueOf(System.currentTimeMillis()));
        idrVar.c(lfyVar);
        this.f.c(true);
    }

    public final boolean g() {
        lfy lfyVar = (lfy) this.b.a();
        String str = lfyVar.a;
        if (!sij.F(null)) {
            return true;
        }
        String str2 = lfyVar.b;
        return !sij.F(null);
    }

    public final boolean i(String str, String str2, boolean z) {
        if (!TextUtils.isEmpty(str)) {
            laf lafVar = (laf) this.e.get("null:" + (true != z ? 18 : 6));
            if (lafVar == null) {
                return false;
            }
            vun<lad> vunVar = lafVar.e;
            if (vunVar.isEmpty()) {
                return false;
            }
            for (lad ladVar : vunVar) {
                if (str.equals(ladVar.c)) {
                    return true;
                }
                if (str2.equals(ladVar.c)) {
                    return false;
                }
            }
        }
        return false;
    }

    public final synchronized void j() {
    }

    public final synchronized void k() {
    }

    public final void m() {
        String str = ((lfy) this.b.a()).a;
    }

    public final void n() {
        String str = ((lfy) this.b.a()).b;
    }

    public final boolean o() {
        String str = ((lfy) this.b.a()).a;
        sij.F(null);
        return true;
    }

    public final boolean p() {
        String str = ((lfy) this.b.a()).b;
        sij.F(null);
        return true;
    }
}
