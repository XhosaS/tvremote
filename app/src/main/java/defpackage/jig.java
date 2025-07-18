package defpackage;

import com.google.assistant.sdk.libassistant.ActionExecutor;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jig implements jiq {
    private static final zdy a = zdy.h("com/google/android/apps/tvsearch/voice/libassistant/handlers/AccountClientOpHandler");
    private static final ActionExecutor.SupportedAction b = jhy.a.b(fbo.a, new ActionExecutor.SupportedAction.Arg[]{new ActionExecutor.SupportedAction.Arg("identity_args", "assistant.api.client_op.IdentityArgs"), new ActionExecutor.SupportedAction.Arg("context_args", "assistant.api.client_op.AccountSwitchContextArgs")}, "", new byte[0]);
    private final gqg c;
    private final String d = "AccountClientOpHandler";
    private final List e;

    public jig(gqg gqgVar) {
        this.c = gqgVar;
        List listSingletonList = Collections.singletonList(b);
        listSingletonList.getClass();
        this.e = listSingletonList;
    }

    @Override // defpackage.jiq
    public final /* synthetic */ Object a(agsw agswVar) {
        return agrd.a;
    }

    @Override // defpackage.jiq
    public final /* synthetic */ Object b(String str, Map map, ActionExecutor.ResponseParams responseParams, gez gezVar, agsw agswVar) {
        return agpu.a;
    }

    @Override // defpackage.jiq
    public final String c() {
        return this.d;
    }

    @Override // defpackage.jiq
    public final List d() {
        return this.e;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.jiq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(java.lang.String r9, java.util.Map r10, defpackage.gez r11, defpackage.agsw r12) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 618
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jig.e(java.lang.String, java.util.Map, gez, agsw):java.lang.Object");
    }
}
