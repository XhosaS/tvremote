package defpackage;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jls implements jlr {
    private static final zdy a = zdy.h("com/google/android/apps/tvsearch/voice/libassistant/invocation/AssistantInvocationStateAnnouncerImpl");
    private volatile jlv b = jlv.INVOCATION_TYPE_NOT_INVOKED;
    private final Set c = new LinkedHashSet();

    @Override // defpackage.jlr
    public final jlv Z() {
        return this.b;
    }

    @Override // defpackage.jlr
    public final void aq(jlt jltVar) {
        this.c.remove(jltVar);
    }

    @Override // defpackage.jlr
    public final void at(jlt jltVar) {
        this.c.add(jltVar);
    }

    @Override // defpackage.jlr
    public final void az(jlv jlvVar) {
        if (this.b != jlvVar) {
            ((zdv) a.b().q("com/google/android/apps/tvsearch/voice/libassistant/invocation/AssistantInvocationStateAnnouncerImpl", "setInvocationType", 23, "AssistantInvocationStateAnnouncerImpl.kt")).F("setInvocationType: %s -> %s", this.b.name(), jlvVar.name());
            this.b = jlvVar;
            Iterator it = agqq.A(this.c).iterator();
            while (it.hasNext()) {
                ((jlt) it.next()).l(jlvVar);
            }
        }
    }
}
