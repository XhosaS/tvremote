package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wmq implements afer {
    public final String a;
    public long b;
    private final yqt c;
    private final yqt d;

    public wmq(Context context, yqt yqtVar, yqt yqtVar2) {
        this.a = context.getPackageName();
        this.c = yqtVar;
        this.d = yqtVar2;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [agow, java.lang.Object] */
    @Override // defpackage.afer
    public final afeq a(afil afilVar, afem afemVar, afen afenVar) {
        if (!((Boolean) ((yqz) this.c).a).booleanValue()) {
            return afenVar.a(afilVar, afemVar);
        }
        yqw.M(true, "TikTokRpcStreamz must be bound with @StreamzInterceptorExperiment");
        return new wmp(this, afenVar.a(afilVar, afemVar), (wkv) ((yqz) this.d).a.a());
    }
}
