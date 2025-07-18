package defpackage;

import android.app.Activity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mbf implements iea {
    public final ieh a;
    public final idr b = new idz(0);
    public final mbm c;
    public final idy d;
    public final idy e;
    public boolean f;
    public boolean g;
    public final mtp h;

    public mbf(Activity activity, ldv ldvVar, iea ieaVar, idy idyVar, idy idyVar2) {
        this.d = idyVar;
        this.e = idyVar2;
        this.a = ieaVar;
        this.h = new mtp(this, new led(activity, ldvVar, ieaVar), ldvVar, 1);
        this.c = new mbm(activity, new mbe(this));
    }

    @Override // defpackage.ieh
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Integer a() {
        return (Integer) this.b.a();
    }

    @Override // defpackage.ids
    public final void ea(iej iejVar) {
        this.b.ea(iejVar);
    }

    @Override // defpackage.ids
    public final void ee(iej iejVar) {
        this.b.ee(iejVar);
    }
}
