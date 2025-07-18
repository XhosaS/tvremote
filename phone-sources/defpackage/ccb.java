package defpackage;

import android.view.Choreographer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ccb implements bby {
    public final Object a;
    private final /* synthetic */ int c;
    private final Object d;

    public ccb(Choreographer choreographer, cbz cbzVar, int i) {
        this.c = i;
        this.a = choreographer;
        this.d = cbzVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0019  */
    /* JADX WARN: Type inference failed for: r10v10, types: [bby, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, yjv] */
    /* JADX WARN: Type inference failed for: r9v10, types: [yjv] */
    /* JADX WARN: Type inference failed for: r9v12, types: [java.lang.Object] */
    @Override // defpackage.bby
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.yjv r9, defpackage.yih r10) {
        /*
            Method dump skipped, instructions count: 245
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ccb.a(yjv, yih):java.lang.Object");
    }

    @Override // defpackage.yil
    public final Object fold(Object obj, yjz yjzVar) {
        return this.c != 0 ? wcq.T(this, obj, yjzVar) : wcq.T(this, obj, yjzVar);
    }

    @Override // defpackage.yij, defpackage.yil
    public final yij get(yik yikVar) {
        return this.c != 0 ? wcq.U(this, yikVar) : wcq.U(this, yikVar);
    }

    @Override // defpackage.yij
    public final /* synthetic */ yik getKey() {
        return this.c != 0 ? bby.b : bby.b;
    }

    @Override // defpackage.yil
    public final yil minusKey(yik yikVar) {
        return this.c != 0 ? wcq.V(this, yikVar) : wcq.V(this, yikVar);
    }

    @Override // defpackage.yil
    public final yil plus(yil yilVar) {
        return this.c != 0 ? wcq.W(this, yilVar) : wcq.W(this, yilVar);
    }

    public ccb(bby bbyVar, int i) {
        this.c = i;
        this.d = bbyVar;
        this.a = new bbt();
    }
}
