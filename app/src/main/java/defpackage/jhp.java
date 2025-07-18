package defpackage;

import com.google.assistant.sdk.libassistant.ActionExecutor;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jhp extends agtu implements agvb {
    int a;
    final /* synthetic */ jhr b;
    final /* synthetic */ gez c;
    final /* synthetic */ String d;
    final /* synthetic */ ActionExecutor.ResponseParams e;
    final /* synthetic */ Map f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jhp(jhr jhrVar, gez gezVar, String str, ActionExecutor.ResponseParams responseParams, Map map, agsw agswVar) {
        super(2, agswVar);
        this.b = jhrVar;
        this.c = gezVar;
        this.d = str;
        this.e = responseParams;
        this.f = map;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((jhp) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x012b, code lost:
    
        if (r7.b(r8, r9, r10, r11, r13) == r0) goto L53;
     */
    @Override // defpackage.agto
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 371
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jhp.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new jhp(this.b, this.c, this.d, this.e, this.f, agswVar);
    }
}
