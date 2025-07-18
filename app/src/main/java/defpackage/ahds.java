package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ahds extends ahdq {
    private final ahdv a;
    private final ahdt b;
    private final ahax c;
    private final Object h;

    public ahds(ahdv ahdvVar, ahdt ahdtVar, ahax ahaxVar, Object obj) {
        this.a = ahdvVar;
        this.b = ahdtVar;
        this.c = ahaxVar;
        this.h = obj;
    }

    @Override // defpackage.ahdq
    public final void b(Throwable th) {
        boolean z = ahbx.a;
        ahdv ahdvVar = this.a;
        ahdt ahdtVar = this.b;
        ahax ahaxVar = this.c;
        ahax ahaxVarF = ahdvVar.F(ahaxVar);
        Object obj = this.h;
        if (ahaxVarF == null || !ahdvVar.O(ahdtVar, ahaxVarF, obj)) {
            ahdtVar.a.j(2);
            ahax ahaxVarF2 = ahdvVar.F(ahaxVar);
            if (ahaxVarF2 == null || !ahdvVar.O(ahdtVar, ahaxVarF2, obj)) {
                ahdvVar.f(ahdvVar.z(ahdtVar, obj));
            }
        }
    }

    @Override // defpackage.ahdq
    public final boolean c() {
        return false;
    }
}
