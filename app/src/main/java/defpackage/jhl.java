package defpackage;

import com.google.assistant.sdk.libassistant.ActionExecutor;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jhl extends agtu implements agvb {
    int a;
    final /* synthetic */ jhr b;
    final /* synthetic */ gez c;
    final /* synthetic */ String d;
    final /* synthetic */ Map e;
    final /* synthetic */ ActionExecutor.ResponseParams f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jhl(jhr jhrVar, gez gezVar, String str, Map map, ActionExecutor.ResponseParams responseParams, agsw agswVar) {
        super(2, agswVar);
        this.b = jhrVar;
        this.c = gezVar;
        this.d = str;
        this.e = map;
        this.f = responseParams;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((jhl) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00fa, code lost:
    
        if (r11 == r0) goto L48;
     */
    @Override // defpackage.agto
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r11) {
        /*
            Method dump skipped, instructions count: 336
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jhl.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new jhl(this.b, this.c, this.d, this.e, this.f, agswVar);
    }
}
