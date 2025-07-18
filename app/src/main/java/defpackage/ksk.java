package defpackage;

import android.app.Activity;
import com.google.android.gms.measurement.api.internal.ScionActivityInfo;

/* compiled from: PG */
/* loaded from: classes.dex */
class ksk extends ksg {
    final /* synthetic */ Activity a;
    final /* synthetic */ kso b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ksk(kso ksoVar, Activity activity) {
        super(ksoVar.a, true);
        this.a = activity;
        this.b = ksoVar;
    }

    @Override // defpackage.ksg
    public final void a() {
        kqz kqzVar = this.b.a.f;
        kkk.k(kqzVar);
        kqzVar.onActivityPausedByScionActivityInfo(ScionActivityInfo.a(this.a), this.g);
    }
}
