package defpackage;

import android.content.Intent;
import android.os.Bundle;
import com.google.assistant.sdk.libassistant.AssistantEventListener;
import com.google.assistant.sdk.libassistant.AssistantManagerNative;
import com.google.assistant.sdk.libassistant.AudioInputUtils;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public interface jdt extends ich, jme, jlq, jlr {
    void A(String str, boolean z, jlv jlvVar);

    void B(int i);

    void C(String str);

    void D(Intent intent);

    void E(xdo xdoVar);

    void F(boolean z);

    void G(int i);

    void H(int i);

    void I();

    void J();

    void K(AudioInputUtils.MicType micType);

    void L(boolean z);

    void M();

    void N(String str);

    void O(List list);

    boolean P();

    boolean Q();

    boolean R();

    boolean S();

    boolean T();

    boolean U();

    boolean V();

    void W();

    void X(byte[] bArr, AssistantManagerNative.VoicelessOptions voicelessOptions);

    void Y();

    int c();

    Intent d();

    zyd e(boolean z, boolean z2);

    Object f(agsw agswVar);

    Object g(boolean z, boolean z2, agsw agswVar);

    Object h(agsw agswVar);

    String i();

    String j();

    List k();

    void l(AssistantEventListener assistantEventListener);

    void m();

    void n();

    void o();

    void p(boolean z);

    void q(boolean z);

    void r(String str);

    void s(AssistantEventListener assistantEventListener);

    void t();

    void u();

    void v();

    void w(boolean z);

    void x();

    void y(String str);

    void z(Bundle bundle);
}
