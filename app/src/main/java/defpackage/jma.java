package defpackage;

import com.google.assistant.sdk.libassistant.DeviceStateListener;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jma implements jlt {
    public static final zdy a = zdy.h("com/google/android/apps/tvsearch/voice/libassistant/led/LibAssistantLedUtils");
    public final gcd b;
    public final DeviceStateListener c;

    public jma(gcd gcdVar) {
        gcdVar.getClass();
        this.b = gcdVar;
        this.c = new jlz(this);
    }

    @Override // defpackage.jlt
    public final void l(jlv jlvVar) {
        jlvVar.getClass();
        this.b.h(jlvVar == jlv.INVOCATION_TYPE_HOTWORD);
    }
}
