package defpackage;

import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gwl extends agtu implements agvb {
    Object a;
    Object b;
    int c;
    final /* synthetic */ gwm d;
    final /* synthetic */ Intent e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gwl(gwm gwmVar, Intent intent, agsw agswVar) {
        super(2, agswVar);
        this.d = gwmVar;
        this.e = intent;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((gwl) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0115, code lost:
    
        if (r11.a(r1, r10) != r0) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x012d, code lost:
    
        if (r11.a(r1, r10) == r0) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0172, code lost:
    
        if (r11.b(r5, r10) == r0) goto L70;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x017b  */
    @Override // defpackage.agto
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r11) {
        /*
            Method dump skipped, instructions count: 448
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gwl.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new gwl(this.d, this.e, agswVar);
    }
}
