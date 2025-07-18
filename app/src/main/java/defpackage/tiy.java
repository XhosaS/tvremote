package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tiy {
    public static final String a(tix tixVar) {
        if (tixVar == tix.TAG_DO_NOT_USE || tixVar == tix.TAG_INVALID_ATTRIBUTION_DO_NOT_USE || tixVar == tix.TAG_UNATTRIBUTED) {
            return "invalid_attribution";
        }
        yyr yyrVar = tiz.a;
        return !yyrVar.containsKey(tixVar) ? "invalid_attribution" : String.valueOf(yyrVar.get(tixVar));
    }
}
