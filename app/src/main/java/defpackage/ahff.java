package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahff implements ahfp, ahet {
    public Object a = ahfl.p;
    public ahar b;
    final /* synthetic */ ahfj c;

    public ahff(ahfj ahfjVar) {
        this.c = ahfjVar;
    }

    @Override // defpackage.ahet
    public final void A(ahmd ahmdVar, int i) {
        ahar aharVar = this.b;
        if (aharVar != null) {
            aharVar.A(ahmdVar, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0112 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0116  */
    @Override // defpackage.ahfp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.agsw r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 373
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahff.a(agsw):java.lang.Object");
    }

    @Override // defpackage.ahfp
    public final Object b() throws Throwable {
        Object obj = this.a;
        ahmg ahmgVar = ahfl.p;
        if (obj == ahmgVar) {
            throw new IllegalStateException("`hasNext()` has not been invoked");
        }
        this.a = ahmgVar;
        if (obj != ahfl.l) {
            return obj;
        }
        throw ahmf.b(this.c.l());
    }
}
