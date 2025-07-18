package defpackage;

import com.google.firebase.iid.FirebaseInstanceId;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class une implements uni {
    final FirebaseInstanceId a;

    public une(FirebaseInstanceId firebaseInstanceId) {
        this.a = firebaseInstanceId;
    }

    @Override // defpackage.uni
    public final onz a() {
        FirebaseInstanceId firebaseInstanceId = this.a;
        String strG = firebaseInstanceId.g();
        if (strG != null) {
            return osk.r(strG);
        }
        uiz uizVar = firebaseInstanceId.c;
        FirebaseInstanceId.j(uizVar);
        return firebaseInstanceId.a(qtl.aO(uizVar), "*").a(ooc.a, new nuz(3));
    }

    @Override // defpackage.uni
    public final void b() {
        this.a.g();
    }

    @Override // defpackage.uni
    public final void c(zft zftVar) {
        this.a.f.add(zftVar);
    }
}
