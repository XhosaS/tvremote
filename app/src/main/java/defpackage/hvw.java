package defpackage;

import com.google.assistant.sdk.libassistant.AssistantEventListener;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hvw extends AssistantEventListener {
    public float a;
    private final jdt b;
    private boolean c;

    public hvw(jdt jdtVar) {
        jdtVar.getClass();
        this.b = jdtVar;
    }

    public final void a() {
        if (this.c) {
            this.b.s(this);
        }
        this.c = false;
        this.a = 0.0f;
    }

    public final void b() {
        if (!this.c) {
            this.b.l(this);
        }
        this.c = true;
    }

    @Override // com.google.assistant.sdk.libassistant.AssistantEventListener
    public final void onSpeechLevelEvent(float f) {
        if (this.c) {
            this.a = (f / 50.0f) + 1.3f;
        }
    }
}
