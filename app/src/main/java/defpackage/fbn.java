package defpackage;

import com.google.assistant.sdk.libassistant.AssistantEventListener;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fbn extends AssistantEventListener {
    private static final zdy b = zdy.h("com/google/android/apps/tvsearch/app/zwiebackevent/ZwiebackUpdateEventListener");
    public final fto a;
    private final ahbt c;

    public fbn(ahbt ahbtVar, fto ftoVar) {
        ahbtVar.getClass();
        this.c = ahbtVar;
        this.a = ftoVar;
    }

    @Override // com.google.assistant.sdk.libassistant.AssistantEventListener
    public final void onZwiebackUpdateEvent(String str) {
        str.getClass();
        if (str.length() == 0) {
            ((zdv) b.d().q("com/google/android/apps/tvsearch/app/zwiebackevent/ZwiebackUpdateEventListener", "onZwiebackUpdateEvent", 25, "ZwiebackUpdateEventListener.kt")).u("Empty zwieback cookie exposed by libAssistant.");
        } else {
            ahal.e(this.c, null, 0, new fbm(this, str, null), 3);
        }
    }
}
