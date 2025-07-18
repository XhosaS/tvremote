package com.google.assistant.sdk.libassistant;

import com.google.assistant.base.Log;
import com.google.assistant.sdk.libassistant.ActionExecutor;
import j$.util.DesugarArrays;
import j$.util.function.Function$CC;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.function.IntFunction;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ActionExecutorWrapper {
    private static final String TAG = "ActionExecutorWrapper";
    private final ActionExecutor actionExecutor;
    private final Map clientOpArgKeyMapping;

    public ActionExecutorWrapper(ActionExecutor actionExecutor, ActionExecutor.SupportedAction[] supportedActionArr) {
        this.actionExecutor = actionExecutor;
        this.clientOpArgKeyMapping = SetupClientOpArgKeyMapping(supportedActionArr);
    }

    private static Map SetupClientOpArgKeyMapping(ActionExecutor.SupportedAction[] supportedActionArr) {
        HashMap map = new HashMap();
        for (ActionExecutor.SupportedAction supportedAction : supportedActionArr) {
            map.put(supportedAction.name, (String[]) DesugarArrays.stream(supportedAction.args).map(new Function() { // from class: com.google.assistant.sdk.libassistant.ActionExecutorWrapper$$ExternalSyntheticLambda0
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public /* synthetic */ Function mo116andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return ((ActionExecutor.SupportedAction.Arg) obj).args_key;
                }

                public /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).toArray(new IntFunction() { // from class: com.google.assistant.sdk.libassistant.ActionExecutorWrapper$$ExternalSyntheticLambda1
                @Override // java.util.function.IntFunction
                public final Object apply(int i) {
                    return ActionExecutorWrapper.lambda$SetupClientOpArgKeyMapping$1(i);
                }
            }));
        }
        return map;
    }

    private Map getClientOpArgMap(String str, byte[][] bArr) {
        HashMap map = new HashMap();
        String[] strArr = (String[]) this.clientOpArgKeyMapping.get(str);
        int length = strArr.length;
        int length2 = bArr.length;
        if (length == length2) {
            for (int i = 0; i < strArr.length; i++) {
                map.put(strArr[i], bArr[i]);
            }
            return map;
        }
        Log.d(TAG, "clientOpArgs length was unexpected (" + String.valueOf(length2) + " instead of " + String.valueOf(length) + "). Returning empty map for clientOpArgs.");
        return map;
    }

    static /* synthetic */ String[] lambda$SetupClientOpArgKeyMapping$1(int i) {
        return new String[i];
    }

    public ActionExecutor.Result ExecuteAction(String str, byte[][] bArr, ActionExecutor.ResponseParams responseParams) {
        return this.actionExecutor.ExecuteAction(str, getClientOpArgMap(str, bArr), responseParams);
    }

    public ActionExecutor.ConversationParams[] GetConversationParams() {
        return this.actionExecutor.GetConversationParams();
    }

    public void PrepareExecution(String str, byte[][] bArr, ActionExecutor.ResponseParams responseParams) {
        this.actionExecutor.PrepareExecution(str, getClientOpArgMap(str, bArr), responseParams);
    }
}
