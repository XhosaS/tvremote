package defpackage;

import android.app.Activity;
import android.content.res.Resources;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mti implements iej {
    public final iea a;
    public final Object b;
    public final Object c;
    private final /* synthetic */ int d;

    public mti(iea ieaVar, mtk mtkVar, idy idyVar, int i) {
        this.d = i;
        this.a = ieaVar;
        this.b = mtkVar;
        this.c = idyVar;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [idy, java.lang.Object] */
    @Override // defpackage.iej
    public final void dM() throws Resources.NotFoundException {
        if (this.d != 0) {
            ((Activity) this.c).invalidateOptionsMenu();
            return;
        }
        iea ieaVar = this.a;
        Object obj = this.b;
        ieg iegVar = (ieg) ieaVar.a();
        ((mtk) obj).c(iegVar);
        this.c.c(Boolean.valueOf(iegVar.m()));
    }

    public mti(lfn lfnVar, iea ieaVar, Activity activity, int i) {
        this.d = i;
        this.b = lfnVar;
        this.a = ieaVar;
        this.c = activity;
    }
}
