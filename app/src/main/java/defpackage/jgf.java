package defpackage;

import com.google.assistant.sdk.libassistant.LocaleChangeEventListener;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jgf extends LocaleChangeEventListener {
    final /* synthetic */ jhh a;

    public jgf(jhh jhhVar) {
        this.a = jhhVar;
    }

    @Override // com.google.assistant.sdk.libassistant.LocaleChangeEventListener
    public final void onLocaleChangeEvent(String str) {
        str.getClass();
        jcv jcvVar = this.a.m;
        jcvVar.f(str, jcvVar.c());
    }
}
