package defpackage;

import android.app.Activity;
import com.google.android.gms.measurement.api.internal.ScionActivityInfo;

/* compiled from: PG */
/* loaded from: classes.dex */
class ksm extends ksg {
    final /* synthetic */ Activity a;
    final /* synthetic */ kqw b;
    final /* synthetic */ kso c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ksm(kso ksoVar, Activity activity, kqw kqwVar) {
        super(ksoVar.a, true);
        this.a = activity;
        this.b = kqwVar;
        this.c = ksoVar;
    }

    @Override // defpackage.ksg
    public final void a() {
        kqz kqzVar = this.c.a.f;
        kkk.k(kqzVar);
        kqzVar.onActivitySaveInstanceStateByScionActivityInfo(ScionActivityInfo.a(this.a), this.b, this.g);
    }
}
