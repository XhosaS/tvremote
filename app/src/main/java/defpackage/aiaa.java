package defpackage;

import org.chromium.net.CronetException;
import org.chromium.net.InlineExecutionProhibitedException;

/* compiled from: PG */
/* loaded from: classes2.dex */
class aiaa {
    public static Object a(ahzz ahzzVar, Class cls) throws Exception {
        try {
            return ahzzVar.a();
        } catch (Exception e) {
            if (ajb$$ExternalSyntheticApiModelOutline0.m$1(e)) {
                InlineExecutionProhibitedException inlineExecutionProhibitedException = new InlineExecutionProhibitedException();
                inlineExecutionProhibitedException.initCause(e);
                throw inlineExecutionProhibitedException;
            }
            if (afw$$ExternalSyntheticApiModelOutline0.m$1(e)) {
                throw b(e);
            }
            if (cls.isInstance(e)) {
                throw e;
            }
            throw e;
        }
    }

    public static CronetException b(Exception exc) {
        if (afw$$ExternalSyntheticApiModelOutline0.m$1(exc)) {
            return afw$$ExternalSyntheticApiModelOutline0.m16m((Object) exc) ? new ahzg(afw$$ExternalSyntheticApiModelOutline0.m4m((Object) exc)) : afw$$ExternalSyntheticApiModelOutline0.m$2(exc) ? new ahzf(afw$$ExternalSyntheticApiModelOutline0.m((Object) exc), false) : ajb$$ExternalSyntheticApiModelOutline0.m25m((Object) exc) ? new ahyy(ajb$$ExternalSyntheticApiModelOutline0.m20m((Object) exc)) : new ahze(ajb$$ExternalSyntheticApiModelOutline0.m21m((Object) exc));
        }
        throw new IllegalArgumentException("Not an Android Cronet exception", exc);
    }
}
