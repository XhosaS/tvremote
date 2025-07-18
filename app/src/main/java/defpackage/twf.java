package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class twf {
    public static adlm a(twe tweVar, Map map) {
        tsk tskVar = (tsk) tweVar;
        String str = tskVar.d;
        return (!map.containsKey(str) || map.get(str) == null) ? !tskVar.w.equals("smart_dictation") ? tskVar.o ? adlm.AMBIENT_CONTINUOUS : adlm.AMBIENT_ONESHOT : adlm.DEFAULT_CONTINUOUS : (adlm) map.get(str);
    }
}
