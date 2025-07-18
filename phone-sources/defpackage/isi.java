package defpackage;

import android.content.Context;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class isi extends icu implements iej, yow, ids {
    private static final tui m = tui.l("com/google/android/apps/googletv/app/data/store/impl/UserSettingsStoreImpl");
    public final Context g;
    public final iea h;
    public iod i;
    public final isi j;
    public yqe k;
    public final yyk l;
    private final /* synthetic */ yow n;
    private final Map o = new LinkedHashMap();

    public isi(Context context, iea ieaVar, yow yowVar) {
        this.n = yowVar;
        this.g = context;
        this.h = ieaVar;
        iod iodVar = iod.a;
        iodVar.getClass();
        this.i = iodVar;
        this.j = this;
        this.l = new yyk();
        ieaVar.ea(this);
        dM();
    }

    public final dbd a(ksn ksnVar) {
        Map map = this.o;
        String str = ksnVar.a;
        Object objD = map.get(str);
        if (objD == null) {
            objD = cwo.d(ioe.a, new dcw(new gwp(12)), null, new isg(this, ksnVar, 0), 12);
            map.put(str, objD);
        }
        return (dbd) objD;
    }

    public final ids b(yjv yjvVar) {
        return new ish(this, yjvVar.a(this.i), yjvVar);
    }

    @Override // defpackage.yow
    public final yil c() {
        return ((ywq) this.n).a;
    }

    @Override // defpackage.iej
    public final void dM() {
        this.k = ((ldy) this.h).a().m() ? ykr.q(this, null, 0, new gow(this, (yih) null, 15), 3) : null;
    }

    public final ypc e(yjv yjvVar) {
        iea ieaVar = this.h;
        iod iodVar = this.i;
        ieg iegVarA = ((ldy) ieaVar).a();
        iegVarA.getClass();
        if (iegVarA.m()) {
            return ykr.o(this, null, new ajo(this, iegVarA, iodVar, yjvVar, (yih) null, 12), 3);
        }
        ((tug) ((tug) m.g()).i(iegVarA.d).j("com/google/android/apps/googletv/app/data/store/impl/UserSettingsStoreImpl", "editAsync", 59, "UserSettingsStoreImpl.kt")).s("Account not found");
        iod iodVar2 = iod.a;
        yol yolVar = new yol();
        yolVar.S(iodVar2);
        return yolVar;
    }

    public final synchronized void f(iod iodVar) {
        if (yks.e(this.i, iodVar)) {
            return;
        }
        this.i = iodVar;
        eb();
    }
}
