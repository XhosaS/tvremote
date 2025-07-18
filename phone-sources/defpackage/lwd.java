package defpackage;

import android.app.ActivityManager;
import android.content.SharedPreferences;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lwd implements iea, ict, iej {
    private final idr a;
    private final iea b;
    private final boolean c;
    private final iea d;
    private final ids e;
    private final idb f;
    private final String g;
    private final ieh h;
    private final Executor i;
    private final Executor j;
    private final idf k;
    private final idf l;
    private ieg m;
    private final idt n = new idt(this);
    private final lys o;

    public lwd(lfn lfnVar, ieh iehVar, lys lysVar, SharedPreferences sharedPreferences, idf idfVar, idf idfVar2, ExecutorService executorService, Executor executor, iea ieaVar, boolean z, iea ieaVar2, String str, boolean z2, ActivityManager activityManager) {
        ieg iegVar = ieg.a;
        this.a = new idz(iegVar);
        this.m = iegVar;
        this.h = iehVar;
        this.o = lysVar;
        this.k = idfVar;
        this.l = idfVar2;
        this.i = executorService;
        this.j = executor;
        this.b = ieaVar;
        this.c = z;
        this.d = ieaVar2;
        int i = 0;
        this.e = hjt.f(hjt.j(!z2), ieaVar, ieaVar2, new ien(sharedPreferences, krh.ENABLE_INFO_CARDS));
        idb[] idbVarArr = new idb[4];
        idbVarArr[0] = hjt.j(lfnVar.cP() && !z2);
        idbVarArr[1] = hjt.i(new krk(iehVar, i));
        idbVarArr[2] = hjt.i(new mtg(activityManager, 1));
        idbVarArr[3] = new krk(sharedPreferences, 5);
        this.f = hjt.g(idbVarArr);
        this.g = str;
    }

    @Override // defpackage.ieh
    public final /* bridge */ /* synthetic */ Object a() {
        return (ieg) this.a.a();
    }

    @Override // defpackage.iej
    public final void dM() {
        lwk lwkVarA;
        ieg iegVar = (ieg) this.b.a();
        ldy ldyVar = (ldy) this.h;
        lys lysVar = this.o;
        ieg iegVarA = ldyVar.a();
        String strC = lysVar.c(iegVarA);
        int iIntValue = ((Integer) this.d.a()).intValue();
        if (iegVar.m()) {
            String str = this.g;
            lvd lvdVar = (lvd) iegVar.g();
            if (lvdVar.c.d) {
                lwkVarA = lwk.a(iegVarA, str, strC, iIntValue);
            } else {
                lcl lclVar = lvdVar.b;
                lwkVarA = new lwk(iegVarA, str, strC, Locale.getDefault(), lclVar.c, Long.toHexString(lclVar.f / 1000), iIntValue);
            }
        } else {
            lwkVarA = lwk.a(iegVarA, this.g, strC, iIntValue);
        }
        idb idbVar = this.f;
        ieg iegVarF = ieg.f(lwkVarA);
        if (!idbVar.a()) {
            ieg iegVar2 = ieg.a;
            this.m = iegVar2;
            this.a.c(iegVar2);
        } else {
            if (this.m.equals(iegVarF)) {
                return;
            }
            this.m = iegVarF;
            boolean z = false;
            if (this.c && iIntValue != -1) {
                z = true;
            }
            mjo.e(this.a, new iei(z ? this.l : this.k, lwkVarA), z ? this.i : this.j);
        }
    }

    @Override // defpackage.ids
    public final void ea(iej iejVar) {
        this.n.ea(iejVar);
    }

    @Override // defpackage.ids
    public final void ee(iej iejVar) {
        this.n.ee(iejVar);
    }

    @Override // defpackage.ict
    public final void eg(idt idtVar) {
        this.e.ea(this);
        this.a.ea(idtVar);
        dM();
    }

    @Override // defpackage.ict
    public final void eh(idt idtVar) {
        this.e.ee(this);
        this.a.ee(idtVar);
    }
}
