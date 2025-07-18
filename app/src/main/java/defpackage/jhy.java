package defpackage;

import com.google.assistant.sdk.libassistant.ActionExecutor;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jhy {
    public static final jhy a = new jhy();
    public static final zdy b = zdy.h("com/google/android/apps/tvsearch/voice/libassistant/LibAssistantUtils");
    private static final Map c = new agri(agrj.d(new agpi(xju.OK, ActionExecutor.Status.OK), new agpi(xju.UNIMPLEMENTED, ActionExecutor.Status.UNIMPLEMENTED), new agpi(xju.CANCELLED, ActionExecutor.Status.CANCELLED), new agpi(xju.IGNORE, ActionExecutor.Status.IGNORE), new agpi(xju.INVALID_ARGUMENT, ActionExecutor.Status.INVALID_ARGUMENT)));

    private jhy() {
    }

    public final ActionExecutor.Result a(xhe xheVar) {
        xheVar.getClass();
        Map map = c;
        xjv xjvVar = xheVar.c;
        if (xjvVar == null) {
            xjvVar = xjv.a;
        }
        xju xjuVarB = xju.b(xjvVar.c);
        if (xjuVarB == null) {
            xjuVarB = xju.OK;
        }
        map.getClass();
        ActionExecutor.Status status = (ActionExecutor.Status) agrj.a(map, xjuVarB);
        xjv xjvVar2 = xheVar.c;
        if (xjvVar2 == null) {
            xjvVar2 = xjv.a;
        }
        return new ActionExecutor.Result(status, xjvVar2.d, c(xheVar));
    }

    public final ActionExecutor.SupportedAction b(fbo fboVar, ActionExecutor.SupportedAction.Arg[] argArr, String str, byte[] bArr) {
        fboVar.getClass();
        return new ActionExecutor.SupportedAction(fboVar.a(), fboVar.ag, str, bArr, argArr);
    }

    public final List c(xhe xheVar) {
        xhd xhdVar = xheVar.d;
        if (xhdVar == null) {
            xhdVar = xhd.a;
        }
        abxs<xjr> abxsVar = xhdVar.b;
        abxsVar.getClass();
        ArrayList arrayList = new ArrayList(agqq.i(abxsVar, 10));
        for (xjr xjrVar : abxsVar) {
            String str = xjrVar.c;
            xjp xjpVar = xjrVar.d;
            if (xjpVar == null) {
                xjpVar = xjp.a;
            }
            String str2 = xjpVar.c;
            xjp xjpVar2 = xjrVar.d;
            if (xjpVar2 == null) {
                xjpVar2 = xjp.a;
            }
            arrayList.add(new ActionExecutor.Payload(str, str2, xjpVar2.d.B()));
        }
        return arrayList;
    }
}
