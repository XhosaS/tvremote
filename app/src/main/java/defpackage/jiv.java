package defpackage;

import com.google.assistant.sdk.libassistant.ActionExecutor;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jiv implements jiq {
    private static final zdy a = zdy.h("com/google/android/apps/tvsearch/voice/libassistant/handlers/FeedbackClientOpHandler");
    private static final ActionExecutor.SupportedAction b;
    private static final ActionExecutor.SupportedAction c;
    private static final ActionExecutor.SupportedAction d;
    private static final ActionExecutor.SupportedAction e;
    private final gph f;
    private final lzb g;
    private final agow h;
    private final String i;

    static {
        int iA;
        int iA2;
        jhy jhyVar = jhy.a;
        fbo fboVar = fbo.t;
        ActionExecutor.SupportedAction.Arg[] argArr = {new ActionExecutor.SupportedAction.Arg("feedback_completion_args", "assistant.api.client_op.FeedbackArgs")};
        xpe xpeVar = xpe.a;
        xpd xpdVar = new xpd();
        if ((xpdVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            xpdVar.y();
        }
        xpe xpeVar2 = (xpe) xpdVar.b;
        xpeVar2.b |= 1;
        xpeVar2.c = true;
        xpe xpeVar3 = (xpe) xpdVar.v();
        try {
            int i = xpeVar3.memoizedSerializedSize;
            if ((i & Integer.MIN_VALUE) != 0) {
                iA = abza.a.a(xpeVar3.getClass()).a(xpeVar3);
                if (iA < 0) {
                    throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                }
            } else {
                iA = i & Integer.MAX_VALUE;
                if (iA == Integer.MAX_VALUE) {
                    iA = abza.a.a(xpeVar3.getClass()).a(xpeVar3);
                    if (iA < 0) {
                        throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                    }
                    xpeVar3.memoizedSerializedSize = (xpeVar3.memoizedSerializedSize & Integer.MIN_VALUE) | iA;
                }
            }
            byte[] bArr = new byte[iA];
            boolean z = abvz.e;
            abvw abvwVar = new abvw(bArr, 0, iA);
            abza.a.a(xpeVar3.getClass()).m(xpeVar3, abwa.a(abvwVar));
            abvwVar.K();
            b = jhyVar.b(fboVar, argArr, "assistant.api.client_op.UploadCrashReportProperties", bArr);
            jhy jhyVar2 = jhy.a;
            fbo fboVar2 = fbo.t;
            ActionExecutor.SupportedAction.Arg[] argArr2 = {new ActionExecutor.SupportedAction.Arg("feedback_completion_args", "assistant.api.client_op.FeedbackArgs")};
            xpd xpdVar2 = new xpd();
            if ((xpdVar2.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                xpdVar2.y();
            }
            xpe xpeVar4 = (xpe) xpdVar2.b;
            xpeVar4.b |= 1;
            xpeVar4.c = false;
            xpe xpeVar5 = (xpe) xpdVar2.v();
            try {
                int i2 = xpeVar5.memoizedSerializedSize;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    iA2 = abza.a.a(xpeVar5.getClass()).a(xpeVar5);
                    if (iA2 < 0) {
                        throw new IllegalStateException(a.b(iA2, "serialized size must be non-negative, was "));
                    }
                } else {
                    int iA3 = i2 & Integer.MAX_VALUE;
                    if (iA3 == Integer.MAX_VALUE) {
                        iA3 = abza.a.a(xpeVar5.getClass()).a(xpeVar5);
                        if (iA3 < 0) {
                            throw new IllegalStateException(a.b(iA3, "serialized size must be non-negative, was "));
                        }
                        xpeVar5.memoizedSerializedSize = (Integer.MIN_VALUE & xpeVar5.memoizedSerializedSize) | iA3;
                    }
                    iA2 = iA3;
                }
                byte[] bArr2 = new byte[iA2];
                abvw abvwVar2 = new abvw(bArr2, 0, iA2);
                abza.a.a(xpeVar5.getClass()).m(xpeVar5, abwa.a(abvwVar2));
                abvwVar2.K();
                c = jhyVar2.b(fboVar2, argArr2, "assistant.api.client_op.UploadCrashReportProperties", bArr2);
                d = jhy.a.b(fbo.r, new ActionExecutor.SupportedAction.Arg[]{new ActionExecutor.SupportedAction.Arg("feedback_completion_args", "assistant.api.client_op.FeedbackArgs")}, "", new byte[0]);
                e = jhy.a.b(fbo.s, new ActionExecutor.SupportedAction.Arg[]{new ActionExecutor.SupportedAction.Arg("show_assistant_survey_args", "assistant.api.client_op.ShowAssistantSurveyArgs")}, "", new byte[0]);
            } catch (IOException e2) {
                throw new RuntimeException(a.y(" to a byte array threw an IOException (should never happen).", xpeVar5), e2);
            }
        } catch (IOException e3) {
            throw new RuntimeException(a.y(" to a byte array threw an IOException (should never happen).", xpeVar3), e3);
        }
    }

    public jiv(gph gphVar, lzb lzbVar, agow agowVar) {
        lzbVar.getClass();
        agowVar.getClass();
        this.f = gphVar;
        this.g = lzbVar;
        this.h = agowVar;
        this.i = "FeedbackClientOpHandler";
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
        return this.i;
    }

    @Override // defpackage.jiq
    public final List d() {
        agrx agrxVar = new agrx(10);
        ActionExecutor.SupportedAction[] supportedActionArr = new ActionExecutor.SupportedAction[2];
        supportedActionArr[0] = this.f == gph.a ? b : c;
        supportedActionArr[1] = d;
        agrxVar.addAll(agqq.d(supportedActionArr));
        if (((Boolean) this.h.a()).booleanValue()) {
            agrxVar.add(e);
        }
        return agqq.a(agrxVar);
    }

    @Override // defpackage.jiq
    public final Object e(String str, Map map, gez gezVar, agsw agswVar) {
        zdy zdyVar = a;
        ((zdv) zdyVar.b().q("com/google/android/apps/tvsearch/voice/libassistant/handlers/FeedbackClientOpHandler", "execute", 58, "FeedbackClientOpHandler.kt")).x("Executing ClientOp: %s", str);
        if (agvy.c(str, fbo.t.a()) || agvy.c(str, fbo.r.a())) {
            this.g.u(str, (byte[]) map.get("feedback_completion_args"));
            return new ActionExecutor.Result();
        }
        ((zdv) zdyVar.d().q("com/google/android/apps/tvsearch/voice/libassistant/handlers/FeedbackClientOpHandler", "execute", 67, "FeedbackClientOpHandler.kt")).x("FeedbackClientOpHandler received unsupported Action: %s", str);
        return new ActionExecutor.Result(ActionExecutor.Status.INVALID_ARGUMENT, a.e(str, "Unsupported Action[", "]"));
    }
}
