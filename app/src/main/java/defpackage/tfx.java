package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class tfx implements rrv {
    private static final zdy a = zdy.h("com/google/android/libraries/search/logging/appflows/AppFlowLoggerTransport");
    private final thg b;

    public tfx(thg thgVar) {
        this.b = thgVar;
    }

    @Override // defpackage.rrv
    public final zyd a(rru rruVar) {
        ((zdv) ((zdv) a.b()).q("com/google/android/libraries/search/logging/appflows/AppFlowLoggerTransport", "send", 21, "AppFlowLoggerTransport.java")).x("AppFlow %s is about to be transmitted", rruVar.a());
        rruVar.getClass();
        int i = yyk.e;
        yyk yykVar = zcg.b;
        yykVar.getClass();
        return ((the) this.b).a(rruVar, yykVar);
    }
}
